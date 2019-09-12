package ua.mycredit.data

import ua.mycredit.core.*
import ua.mycredit.core.Payment
import ua.mycredit.data.models.*

abstract class Mapper<in T, out U> private constructor() : (T) -> U {

    fun asListMapper(): Mapper<List<T>?, List<U>> = object : Mapper<List<T>?, List<U>>() {

        override fun invoke(t: List<T>?) = t?.map(this@Mapper) ?: emptyList()
    }

    companion object {

        fun <T, U> build(action: T.() -> U): Mapper<T, U> = object : Mapper<T, U>() {
            override fun invoke(t: T) = action(t)
        }
    }
}

val checkMapper = Mapper.build<CheckResp, Boolean> { isIn }

val creditMapper = Mapper.build<CreditResponse, Credit> {
    Credit(id = id,
            publicId = publicId,
            status = status,
            creationDateIso = creationDate,
            disbursementDateIso = disbursementDate,
            finishDateIso = finishDate,
            closeDateIso = closeDate,
            currentDebt = currentDebt,
            amount = amount,
            outstandingBalance = outstandingBalance,
            term = term,
            amountOriginal = amountOriginal,
            termOriginal = termOriginal,
            nextPaymentAmount = nextPaymentAmount ?: 0.0,
            nextPaymentDateIso = nextPaymentDate,
            schedules = schedules.orEmpty().map(scheduleMapper),
            schedulesRestructure = schedulesRestructure.orEmpty().map(scheduleMapper),
            pastDueDays = pastDueDays,
            currentInterest = currentInterest,
            currentOverdueInterest = currentOverdueInterest
    )
}

val restructuringMapper = Mapper.build<RestructuringsResponseItem, Restructuring> {
    Restructuring(
            id = id,
            discount = economyAmount.toInt(),
            days = type.days,
            active = type.active,
            schedule = schedule.map {
                Restructuring.ScheduleItem(
                        finishDate = it.finishDateOfPeriod.toLocalDate(),
                        amount = it.amount
                )
            }
    )
}

val scheduleMapper = Mapper.build<ScheduleResponse, Schedule> {
    Schedule(
            dueDateIso = dueDate,
            closed = status != "Scheduled",
            restructurePartAmount = restructurePartAmount,
            total = total,
            interest = interest,
            principal = principal,
            fees = fees
    )
}

val historyMapper = creditMapper.asListMapper()


fun updateProfileMapper(dataProcessAllowed: Boolean, mailSubscription: Boolean) =
        Mapper.build<Profile, Customer> {
            Customer(phone = phone.toLocalPhone(), email = email,
                    address = updateAddressMapper(liveInRegister).invoke(addressActual),
                    secondAddress = addressRegister?.let { updateAddressMapper(liveInRegister).invoke(it) },
                    companyName = company?.name, workPhone = company?.phoneNumber?.toLocalPhone(),
                    maritalStatus = maritalStatus?.getIncrementalOrdinal() ?: 0,
                    education = education?.getIncrementalOrdinal() ?: 0,
                    activityKind = activityKind?.value ?: 0,
                    position = position.getIncrementalOrdinal(),
                    costFamily = familyExpense?.getIncrementalOrdinal() ?: 0,
                    sumPayLoans = paymentsAmountOnLoans?.getIncrementalOrdinal() ?: 0,
                    purposeLoan = loanPurpose?.value ?: 0,
                    nameUniversity = studentParams?.schoolName, specializationFaculty = studentParams?.facultySpec?.ordinal
                    ?: 0, qualificationAfterGraduation = studentParams?.educationDegree.getIncrementalOrdinal(),
                    groupDisability = disability?.ordinal
                            ?: 0, reasonDismissal = dismissalReason.ordinal,
                    occupation = occupationType?.getIncrementalOrdinal() ?: 0,
                    mainSource = incomeSource?.value ?: 0, grossMonthlyIncome = monthlyIncome,
                    passportType = passport.type.ordinal, passport = passport.passport, passportIssuedBy = passport.givenBy, passportRegistration = passport.issuedIso,
                    passportNumber = (passport.number.takeIf { passport.type == PassportType.OLD }
                            ?: passport.idCardDocNumber).takeIf { it.isNotEmpty() }
                            ?: "00000000000000000000",
                    passportExpirationDate = passport.idCardExpiredIso,
                    passportSeria = passport.series, passportRecordNumber = passport.idCardRecord,
                    tin = tin, facebookUrl = facebookUrl,
                    firstName = name, middleName = patronymic, lastName = surname, fullName = fullName,
                    birthDate = birthDayIso,
                    isAgreedWithMailSubscription = mailSubscription, isAgreedUseMyData = dataProcessAllowed, docs = arrayOf(),
                    additionalDataList = studentParams?.studentId.let { arrayListOf(AdditionalData(AdditionalData.STUDENT_KEY, it)) }
            )
        }

val profileMapper = Mapper.build<Customer, Profile> {
    Profile(phone = phone.orEmpty(),
            email = email.takeIf { it.contains("@") } ?: "",
            name = firstName.orEmpty(),
            surname = lastName.orEmpty(),
            patronymic = middleName.orEmpty(),
            birthDayIso = birthDate?.toLocalDate()?.toString(),
            facebookUrl = facebookUrl.orEmpty(),

            maritalStatus = maritalStatus.getIncrementalEnumVal<MaritalStatus>(),
            education = education.getIncrementalEnumVal<Education>(),

            tin = tin.orEmpty(),
            passport = passportMapper(this),

            addressActual = Address().takeIf { address == null } ?: addressMapper(address!!),
            addressRegister = secondAddress?.let { addressMapper(it) },

            occupationType = occupation.getIncrementalEnumVal<OccupationType>(),
            incomeSource = mainSource.getIncomeMainSource(),
            monthlyIncome = grossMonthlyIncome,

            company = Company(companyName.orEmpty(), workPhone.orEmpty()),
            activityKind = activityKind.getActivityKind(),
            position = position.getIncrementalEnumVal<Position>(),
            disability = groupDisability.let { GroupDisability.values()[it] },
            dismissalReason = reasonDismissal.let { ReasonDismissal.values()[it] },

            studentParams = StudentParams(
                    nameUniversity.orEmpty(),
                    specializationFaculty.let { sf -> SpecializationFaculty.values().find { it.ordinal == sf } },
                    qualificationAfterGraduation.let { qag -> QualificationAfterGraduation.values().find { it.ordinal == qag - 1 } },
                    additionalDataList?.find { it.key == AdditionalData.STUDENT_KEY }?.value.orEmpty()
            ).takeIf { occupation.getIncrementalEnumVal<OccupationType>() == OccupationType.STUDENT },

            familyExpense = costFamily.getIncrementalEnumVal<FamilyExpense>(),
            paymentsAmountOnLoans = sumPayLoans.getIncrementalEnumVal<PaymentsAmountOnLoans>(),
            loanPurpose = purposeLoan.getLoanPurpose(),
            dataProcessAllowed = isAgreedUseMyData
    )
}

val passportMapper = Mapper.build<Customer, Passport> {

    when (PassportType.values()[passportType]) {

        PassportType.OLD ->
            Passport(
                    series = passportSeria.orEmpty(),
                    number = passportNumber.orEmpty(),
                    givenBy = passportIssuedBy.orEmpty(),
                    issuedIso = passportRegistration
            )

        PassportType.NEW ->
            Passport(
                    idCardRecord = passportRecordNumber.orEmpty(),
                    idCardDocNumber = passportNumber.orEmpty(),
                    issuedIso = passportRegistration,
                    idCardExpiredIso = passportExpirationDate,
                    givenBy = passportIssuedBy.orEmpty()
            )

        PassportType.Unknown -> Passport()
    }
}
