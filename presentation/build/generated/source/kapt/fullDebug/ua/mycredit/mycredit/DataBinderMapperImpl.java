package ua.mycredit.mycredit;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ua.mycredit.mycredit.databinding.ActivityAddCardBindingImpl;
import ua.mycredit.mycredit.databinding.ActivityDetailsBindingImpl;
import ua.mycredit.mycredit.databinding.ActivityProfileBindingImpl;
import ua.mycredit.mycredit.databinding.ActivityQuestionBindingImpl;
import ua.mycredit.mycredit.databinding.ActivityRepayLoanBindingImpl;
import ua.mycredit.mycredit.databinding.ActivitySignUpBindingImpl;
import ua.mycredit.mycredit.databinding.CalculatorBindingImpl;
import ua.mycredit.mycredit.databinding.CardBindingImpl;
import ua.mycredit.mycredit.databinding.CreditStatusDescriptionBindingImpl;
import ua.mycredit.mycredit.databinding.DescriptionsPaneBindingImpl;
import ua.mycredit.mycredit.databinding.DialogFragmentEnumPickerBindingImpl;
import ua.mycredit.mycredit.databinding.DialogFragmentPhoneBindingImpl;
import ua.mycredit.mycredit.databinding.DialogFragmentSimpleInputTextBindingImpl;
import ua.mycredit.mycredit.databinding.DialogFragmentTextBindingImpl;
import ua.mycredit.mycredit.databinding.DialogUneditablePersonalDataBindingImpl;
import ua.mycredit.mycredit.databinding.FbEmailBindingImpl;
import ua.mycredit.mycredit.databinding.FooterFragmentCardsBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentAgreementBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentBankBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentCalculatorBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentCardBackBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentCardFrontBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentCardSmsConfirmationBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentContactsBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentEditPasswordBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentExtraPersonalInfoBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentFinanceBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentInvalidBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentPassportBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentPasswordBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentPersonalDataBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentPersonalInformationBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentProfileBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentProlongationPreferencesBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentRepayByCardBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentResetPasswordByPhoneBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentSignInBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentSignUpAddressBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentSignUpPhoneBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentStatusBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentStudentBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentTemporarilyUnemployedBindingImpl;
import ua.mycredit.mycredit.databinding.FragmentWebViewBindingImpl;
import ua.mycredit.mycredit.databinding.IncomeFieldsBindingImpl;
import ua.mycredit.mycredit.databinding.InputFieldBindingImpl;
import ua.mycredit.mycredit.databinding.InputFieldHintStaticBindingImpl;
import ua.mycredit.mycredit.databinding.InputPhoneNumberBindingImpl;
import ua.mycredit.mycredit.databinding.InputPickerLayoutBindingImpl;
import ua.mycredit.mycredit.databinding.InputTextPickerBindingImpl;
import ua.mycredit.mycredit.databinding.InputVariantPickerBindingImpl;
import ua.mycredit.mycredit.databinding.ItemCardBindingImpl;
import ua.mycredit.mycredit.databinding.ItemContractAdditionBindingImpl;
import ua.mycredit.mycredit.databinding.ItemDetailSectionBindingImpl;
import ua.mycredit.mycredit.databinding.ItemFaqBindingImpl;
import ua.mycredit.mycredit.databinding.ItemHistoryBindingImpl;
import ua.mycredit.mycredit.databinding.ListContentBindingImpl;
import ua.mycredit.mycredit.databinding.PasswordRequirementBindingImpl;
import ua.mycredit.mycredit.databinding.PasswordRequirementsBindingImpl;
import ua.mycredit.mycredit.databinding.PreloaderBindingImpl;
import ua.mycredit.mycredit.databinding.RequirementBindingImpl;
import ua.mycredit.mycredit.databinding.ResendableSmsCodeBindingImpl;
import ua.mycredit.mycredit.databinding.SimpleButtonBindingImpl;
import ua.mycredit.mycredit.databinding.SmsCodeBindingImpl;
import ua.mycredit.mycredit.databinding.StatusDetailsActiveBindingImpl;
import ua.mycredit.mycredit.databinding.StatusDetailsPastDueBindingImpl;
import ua.mycredit.mycredit.databinding.StatusDetailsRestructuredBindingImpl;
import ua.mycredit.mycredit.databinding.SwipeRefreshLayoutBindingImpl;
import ua.mycredit.mycredit.databinding.ThreeStepProgressBindingImpl;
import ua.mycredit.mycredit.databinding.ToolbarBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYADDCARD = 1;

  private static final int LAYOUT_ACTIVITYDETAILS = 2;

  private static final int LAYOUT_ACTIVITYPROFILE = 3;

  private static final int LAYOUT_ACTIVITYQUESTION = 4;

  private static final int LAYOUT_ACTIVITYREPAYLOAN = 5;

  private static final int LAYOUT_ACTIVITYSIGNUP = 6;

  private static final int LAYOUT_CALCULATOR = 7;

  private static final int LAYOUT_CARD = 8;

  private static final int LAYOUT_CREDITSTATUSDESCRIPTION = 9;

  private static final int LAYOUT_DESCRIPTIONSPANE = 10;

  private static final int LAYOUT_DIALOGFRAGMENTENUMPICKER = 11;

  private static final int LAYOUT_DIALOGFRAGMENTPHONE = 12;

  private static final int LAYOUT_DIALOGFRAGMENTSIMPLEINPUTTEXT = 13;

  private static final int LAYOUT_DIALOGFRAGMENTTEXT = 14;

  private static final int LAYOUT_DIALOGUNEDITABLEPERSONALDATA = 15;

  private static final int LAYOUT_FBEMAIL = 16;

  private static final int LAYOUT_FOOTERFRAGMENTCARDS = 17;

  private static final int LAYOUT_FRAGMENTAGREEMENT = 18;

  private static final int LAYOUT_FRAGMENTBANK = 19;

  private static final int LAYOUT_FRAGMENTCALCULATOR = 20;

  private static final int LAYOUT_FRAGMENTCARDBACK = 21;

  private static final int LAYOUT_FRAGMENTCARDFRONT = 22;

  private static final int LAYOUT_FRAGMENTCARDSMSCONFIRMATION = 23;

  private static final int LAYOUT_FRAGMENTCONTACTS = 24;

  private static final int LAYOUT_FRAGMENTEDITPASSWORD = 25;

  private static final int LAYOUT_FRAGMENTEXTRAPERSONALINFO = 26;

  private static final int LAYOUT_FRAGMENTFINANCE = 27;

  private static final int LAYOUT_FRAGMENTINVALID = 28;

  private static final int LAYOUT_FRAGMENTPASSPORT = 29;

  private static final int LAYOUT_FRAGMENTPASSWORD = 30;

  private static final int LAYOUT_FRAGMENTPERSONALDATA = 31;

  private static final int LAYOUT_FRAGMENTPERSONALINFORMATION = 32;

  private static final int LAYOUT_FRAGMENTPROFILE = 33;

  private static final int LAYOUT_FRAGMENTPROLONGATIONPREFERENCES = 34;

  private static final int LAYOUT_FRAGMENTREPAYBYCARD = 35;

  private static final int LAYOUT_FRAGMENTRESETPASSWORDBYPHONE = 36;

  private static final int LAYOUT_FRAGMENTSIGNIN = 37;

  private static final int LAYOUT_FRAGMENTSIGNUPADDRESS = 38;

  private static final int LAYOUT_FRAGMENTSIGNUPPHONE = 39;

  private static final int LAYOUT_FRAGMENTSTATUS = 40;

  private static final int LAYOUT_FRAGMENTSTUDENT = 41;

  private static final int LAYOUT_FRAGMENTTEMPORARILYUNEMPLOYED = 42;

  private static final int LAYOUT_FRAGMENTWEBVIEW = 43;

  private static final int LAYOUT_INCOMEFIELDS = 44;

  private static final int LAYOUT_INPUTFIELD = 45;

  private static final int LAYOUT_INPUTFIELDHINTSTATIC = 46;

  private static final int LAYOUT_INPUTPHONENUMBER = 47;

  private static final int LAYOUT_INPUTPICKERLAYOUT = 48;

  private static final int LAYOUT_INPUTTEXTPICKER = 49;

  private static final int LAYOUT_INPUTVARIANTPICKER = 50;

  private static final int LAYOUT_ITEMCARD = 51;

  private static final int LAYOUT_ITEMCONTRACTADDITION = 52;

  private static final int LAYOUT_ITEMDETAILSECTION = 53;

  private static final int LAYOUT_ITEMFAQ = 54;

  private static final int LAYOUT_ITEMHISTORY = 55;

  private static final int LAYOUT_LISTCONTENT = 56;

  private static final int LAYOUT_PASSWORDREQUIREMENT = 57;

  private static final int LAYOUT_PASSWORDREQUIREMENTS = 58;

  private static final int LAYOUT_PRELOADER = 59;

  private static final int LAYOUT_REQUIREMENT = 60;

  private static final int LAYOUT_RESENDABLESMSCODE = 61;

  private static final int LAYOUT_SIMPLEBUTTON = 62;

  private static final int LAYOUT_SMSCODE = 63;

  private static final int LAYOUT_STATUSDETAILSACTIVE = 64;

  private static final int LAYOUT_STATUSDETAILSPASTDUE = 65;

  private static final int LAYOUT_STATUSDETAILSRESTRUCTURED = 66;

  private static final int LAYOUT_SWIPEREFRESHLAYOUT = 67;

  private static final int LAYOUT_THREESTEPPROGRESS = 68;

  private static final int LAYOUT_TOOLBAR = 69;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(69);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.activity_add_card, LAYOUT_ACTIVITYADDCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.activity_details, LAYOUT_ACTIVITYDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.activity_profile, LAYOUT_ACTIVITYPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.activity_question, LAYOUT_ACTIVITYQUESTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.activity_repay_loan, LAYOUT_ACTIVITYREPAYLOAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.activity_sign_up, LAYOUT_ACTIVITYSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.calculator, LAYOUT_CALCULATOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.card, LAYOUT_CARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.credit_status_description, LAYOUT_CREDITSTATUSDESCRIPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.descriptions_pane, LAYOUT_DESCRIPTIONSPANE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.dialog_fragment_enum_picker, LAYOUT_DIALOGFRAGMENTENUMPICKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.dialog_fragment_phone, LAYOUT_DIALOGFRAGMENTPHONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.dialog_fragment_simple_input_text, LAYOUT_DIALOGFRAGMENTSIMPLEINPUTTEXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.dialog_fragment_text, LAYOUT_DIALOGFRAGMENTTEXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.dialog_uneditable_personal_data, LAYOUT_DIALOGUNEDITABLEPERSONALDATA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fb_email, LAYOUT_FBEMAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.footer_fragment_cards, LAYOUT_FOOTERFRAGMENTCARDS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_agreement, LAYOUT_FRAGMENTAGREEMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_bank, LAYOUT_FRAGMENTBANK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_calculator, LAYOUT_FRAGMENTCALCULATOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_card_back, LAYOUT_FRAGMENTCARDBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_card_front, LAYOUT_FRAGMENTCARDFRONT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_card_sms_confirmation, LAYOUT_FRAGMENTCARDSMSCONFIRMATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_contacts, LAYOUT_FRAGMENTCONTACTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_edit_password, LAYOUT_FRAGMENTEDITPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_extra_personal_info, LAYOUT_FRAGMENTEXTRAPERSONALINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_finance, LAYOUT_FRAGMENTFINANCE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_invalid, LAYOUT_FRAGMENTINVALID);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_passport, LAYOUT_FRAGMENTPASSPORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_password, LAYOUT_FRAGMENTPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_personal_data, LAYOUT_FRAGMENTPERSONALDATA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_personal_information, LAYOUT_FRAGMENTPERSONALINFORMATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_prolongation_preferences, LAYOUT_FRAGMENTPROLONGATIONPREFERENCES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_repay_by_card, LAYOUT_FRAGMENTREPAYBYCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_reset_password_by_phone, LAYOUT_FRAGMENTRESETPASSWORDBYPHONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_sign_in, LAYOUT_FRAGMENTSIGNIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_sign_up_address, LAYOUT_FRAGMENTSIGNUPADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_sign_up_phone, LAYOUT_FRAGMENTSIGNUPPHONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_status, LAYOUT_FRAGMENTSTATUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_student, LAYOUT_FRAGMENTSTUDENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_temporarily_unemployed, LAYOUT_FRAGMENTTEMPORARILYUNEMPLOYED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.fragment_web_view, LAYOUT_FRAGMENTWEBVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.income_fields, LAYOUT_INCOMEFIELDS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.input_field, LAYOUT_INPUTFIELD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.input_field_hint_static, LAYOUT_INPUTFIELDHINTSTATIC);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.input_phone_number, LAYOUT_INPUTPHONENUMBER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.input_picker_layout, LAYOUT_INPUTPICKERLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.input_text_picker, LAYOUT_INPUTTEXTPICKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.input_variant_picker, LAYOUT_INPUTVARIANTPICKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.item_card, LAYOUT_ITEMCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.item_contract_addition, LAYOUT_ITEMCONTRACTADDITION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.item_detail_section, LAYOUT_ITEMDETAILSECTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.item_faq, LAYOUT_ITEMFAQ);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.item_history, LAYOUT_ITEMHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.list_content, LAYOUT_LISTCONTENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.password_requirement, LAYOUT_PASSWORDREQUIREMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.password_requirements, LAYOUT_PASSWORDREQUIREMENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.preloader, LAYOUT_PRELOADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.requirement, LAYOUT_REQUIREMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.resendable_sms_code, LAYOUT_RESENDABLESMSCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.simple_button, LAYOUT_SIMPLEBUTTON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.sms_code, LAYOUT_SMSCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.status_details_active, LAYOUT_STATUSDETAILSACTIVE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.status_details_past_due, LAYOUT_STATUSDETAILSPASTDUE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.status_details_restructured, LAYOUT_STATUSDETAILSRESTRUCTURED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.swipe_refresh_layout, LAYOUT_SWIPEREFRESHLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.three_step_progress, LAYOUT_THREESTEPPROGRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ua.mycredit.mycredit.R.layout.toolbar, LAYOUT_TOOLBAR);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTIVITYADDCARD: {
        if ("layout/activity_add_card_0".equals(tag)) {
          return new ActivityAddCardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_add_card is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYDETAILS: {
        if ("layout/activity_details_0".equals(tag)) {
          return new ActivityDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_details is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPROFILE: {
        if ("layout/activity_profile_0".equals(tag)) {
          return new ActivityProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYQUESTION: {
        if ("layout/activity_question_0".equals(tag)) {
          return new ActivityQuestionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_question is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYREPAYLOAN: {
        if ("layout/activity_repay_loan_0".equals(tag)) {
          return new ActivityRepayLoanBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_repay_loan is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSIGNUP: {
        if ("layout/activity_sign_up_0".equals(tag)) {
          return new ActivitySignUpBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_sign_up is invalid. Received: " + tag);
      }
      case  LAYOUT_CALCULATOR: {
        if ("layout/calculator_0".equals(tag)) {
          return new CalculatorBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for calculator is invalid. Received: " + tag);
      }
      case  LAYOUT_CARD: {
        if ("layout/card_0".equals(tag)) {
          return new CardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for card is invalid. Received: " + tag);
      }
      case  LAYOUT_CREDITSTATUSDESCRIPTION: {
        if ("layout/credit_status_description_0".equals(tag)) {
          return new CreditStatusDescriptionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for credit_status_description is invalid. Received: " + tag);
      }
      case  LAYOUT_DESCRIPTIONSPANE: {
        if ("layout/descriptions_pane_0".equals(tag)) {
          return new DescriptionsPaneBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for descriptions_pane is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGFRAGMENTENUMPICKER: {
        if ("layout/dialog_fragment_enum_picker_0".equals(tag)) {
          return new DialogFragmentEnumPickerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_fragment_enum_picker is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGFRAGMENTPHONE: {
        if ("layout/dialog_fragment_phone_0".equals(tag)) {
          return new DialogFragmentPhoneBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_fragment_phone is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGFRAGMENTSIMPLEINPUTTEXT: {
        if ("layout/dialog_fragment_simple_input_text_0".equals(tag)) {
          return new DialogFragmentSimpleInputTextBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_fragment_simple_input_text is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGFRAGMENTTEXT: {
        if ("layout/dialog_fragment_text_0".equals(tag)) {
          return new DialogFragmentTextBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_fragment_text is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGUNEDITABLEPERSONALDATA: {
        if ("layout/dialog_uneditable_personal_data_0".equals(tag)) {
          return new DialogUneditablePersonalDataBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_uneditable_personal_data is invalid. Received: " + tag);
      }
      case  LAYOUT_FBEMAIL: {
        if ("layout/fb_email_0".equals(tag)) {
          return new FbEmailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fb_email is invalid. Received: " + tag);
      }
      case  LAYOUT_FOOTERFRAGMENTCARDS: {
        if ("layout/footer_fragment_cards_0".equals(tag)) {
          return new FooterFragmentCardsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for footer_fragment_cards is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTAGREEMENT: {
        if ("layout/fragment_agreement_0".equals(tag)) {
          return new FragmentAgreementBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_agreement is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTBANK: {
        if ("layout/fragment_bank_0".equals(tag)) {
          return new FragmentBankBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_bank is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCALCULATOR: {
        if ("layout/fragment_calculator_0".equals(tag)) {
          return new FragmentCalculatorBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_calculator is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCARDBACK: {
        if ("layout/fragment_card_back_0".equals(tag)) {
          return new FragmentCardBackBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_card_back is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCARDFRONT: {
        if ("layout/fragment_card_front_0".equals(tag)) {
          return new FragmentCardFrontBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_card_front is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCARDSMSCONFIRMATION: {
        if ("layout/fragment_card_sms_confirmation_0".equals(tag)) {
          return new FragmentCardSmsConfirmationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_card_sms_confirmation is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCONTACTS: {
        if ("layout/fragment_contacts_0".equals(tag)) {
          return new FragmentContactsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_contacts is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTEDITPASSWORD: {
        if ("layout/fragment_edit_password_0".equals(tag)) {
          return new FragmentEditPasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_edit_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTEXTRAPERSONALINFO: {
        if ("layout/fragment_extra_personal_info_0".equals(tag)) {
          return new FragmentExtraPersonalInfoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_extra_personal_info is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFINANCE: {
        if ("layout/fragment_finance_0".equals(tag)) {
          return new FragmentFinanceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_finance is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTINVALID: {
        if ("layout/fragment_invalid_0".equals(tag)) {
          return new FragmentInvalidBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_invalid is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPASSPORT: {
        if ("layout/fragment_passport_0".equals(tag)) {
          return new FragmentPassportBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_passport is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPASSWORD: {
        if ("layout/fragment_password_0".equals(tag)) {
          return new FragmentPasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPERSONALDATA: {
        if ("layout/fragment_personal_data_0".equals(tag)) {
          return new FragmentPersonalDataBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_personal_data is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPERSONALINFORMATION: {
        if ("layout/fragment_personal_information_0".equals(tag)) {
          return new FragmentPersonalInformationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_personal_information is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPROFILE: {
        if ("layout/fragment_profile_0".equals(tag)) {
          return new FragmentProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPROLONGATIONPREFERENCES: {
        if ("layout/fragment_prolongation_preferences_0".equals(tag)) {
          return new FragmentProlongationPreferencesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_prolongation_preferences is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREPAYBYCARD: {
        if ("layout/fragment_repay_by_card_0".equals(tag)) {
          return new FragmentRepayByCardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_repay_by_card is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTRESETPASSWORDBYPHONE: {
        if ("layout/fragment_reset_password_by_phone_0".equals(tag)) {
          return new FragmentResetPasswordByPhoneBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_reset_password_by_phone is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSIGNIN: {
        if ("layout/fragment_sign_in_0".equals(tag)) {
          return new FragmentSignInBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_sign_in is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSIGNUPADDRESS: {
        if ("layout/fragment_sign_up_address_0".equals(tag)) {
          return new FragmentSignUpAddressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_sign_up_address is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSIGNUPPHONE: {
        if ("layout/fragment_sign_up_phone_0".equals(tag)) {
          return new FragmentSignUpPhoneBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_sign_up_phone is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSTATUS: {
        if ("layout/fragment_status_0".equals(tag)) {
          return new FragmentStatusBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_status is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSTUDENT: {
        if ("layout/fragment_student_0".equals(tag)) {
          return new FragmentStudentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_student is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTEMPORARILYUNEMPLOYED: {
        if ("layout/fragment_temporarily_unemployed_0".equals(tag)) {
          return new FragmentTemporarilyUnemployedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_temporarily_unemployed is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTWEBVIEW: {
        if ("layout/fragment_web_view_0".equals(tag)) {
          return new FragmentWebViewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_web_view is invalid. Received: " + tag);
      }
      case  LAYOUT_INCOMEFIELDS: {
        if ("layout/income_fields_0".equals(tag)) {
          return new IncomeFieldsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for income_fields is invalid. Received: " + tag);
      }
      case  LAYOUT_INPUTFIELD: {
        if ("layout/input_field_0".equals(tag)) {
          return new InputFieldBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for input_field is invalid. Received: " + tag);
      }
      case  LAYOUT_INPUTFIELDHINTSTATIC: {
        if ("layout/input_field_hint_static_0".equals(tag)) {
          return new InputFieldHintStaticBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for input_field_hint_static is invalid. Received: " + tag);
      }
      case  LAYOUT_INPUTPHONENUMBER: {
        if ("layout/input_phone_number_0".equals(tag)) {
          return new InputPhoneNumberBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for input_phone_number is invalid. Received: " + tag);
      }
      case  LAYOUT_INPUTPICKERLAYOUT: {
        if ("layout/input_picker_layout_0".equals(tag)) {
          return new InputPickerLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for input_picker_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_INPUTTEXTPICKER: {
        if ("layout/input_text_picker_0".equals(tag)) {
          return new InputTextPickerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for input_text_picker is invalid. Received: " + tag);
      }
      case  LAYOUT_INPUTVARIANTPICKER: {
        if ("layout/input_variant_picker_0".equals(tag)) {
          return new InputVariantPickerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for input_variant_picker is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ITEMCARD: {
        if ("layout/item_card_0".equals(tag)) {
          return new ItemCardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_card is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCONTRACTADDITION: {
        if ("layout/item_contract_addition_0".equals(tag)) {
          return new ItemContractAdditionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_contract_addition is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMDETAILSECTION: {
        if ("layout/item_detail_section_0".equals(tag)) {
          return new ItemDetailSectionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_detail_section is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMFAQ: {
        if ("layout/item_faq_0".equals(tag)) {
          return new ItemFaqBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_faq is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMHISTORY: {
        if ("layout/item_history_0".equals(tag)) {
          return new ItemHistoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_history is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTCONTENT: {
        if ("layout/list_content_0".equals(tag)) {
          return new ListContentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_content is invalid. Received: " + tag);
      }
      case  LAYOUT_PASSWORDREQUIREMENT: {
        if ("layout/password_requirement_0".equals(tag)) {
          return new PasswordRequirementBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for password_requirement is invalid. Received: " + tag);
      }
      case  LAYOUT_PASSWORDREQUIREMENTS: {
        if ("layout/password_requirements_0".equals(tag)) {
          return new PasswordRequirementsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for password_requirements is invalid. Received: " + tag);
      }
      case  LAYOUT_PRELOADER: {
        if ("layout/preloader_0".equals(tag)) {
          return new PreloaderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for preloader is invalid. Received: " + tag);
      }
      case  LAYOUT_REQUIREMENT: {
        if ("layout/requirement_0".equals(tag)) {
          return new RequirementBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for requirement is invalid. Received: " + tag);
      }
      case  LAYOUT_RESENDABLESMSCODE: {
        if ("layout/resendable_sms_code_0".equals(tag)) {
          return new ResendableSmsCodeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for resendable_sms_code is invalid. Received: " + tag);
      }
      case  LAYOUT_SIMPLEBUTTON: {
        if ("layout/simple_button_0".equals(tag)) {
          return new SimpleButtonBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for simple_button is invalid. Received: " + tag);
      }
      case  LAYOUT_SMSCODE: {
        if ("layout/sms_code_0".equals(tag)) {
          return new SmsCodeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for sms_code is invalid. Received: " + tag);
      }
      case  LAYOUT_STATUSDETAILSACTIVE: {
        if ("layout/status_details_active_0".equals(tag)) {
          return new StatusDetailsActiveBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for status_details_active is invalid. Received: " + tag);
      }
      case  LAYOUT_STATUSDETAILSPASTDUE: {
        if ("layout/status_details_past_due_0".equals(tag)) {
          return new StatusDetailsPastDueBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for status_details_past_due is invalid. Received: " + tag);
      }
      case  LAYOUT_STATUSDETAILSRESTRUCTURED: {
        if ("layout/status_details_restructured_0".equals(tag)) {
          return new StatusDetailsRestructuredBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for status_details_restructured is invalid. Received: " + tag);
      }
      case  LAYOUT_SWIPEREFRESHLAYOUT: {
        if ("layout/swipe_refresh_layout_0".equals(tag)) {
          return new SwipeRefreshLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for swipe_refresh_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_THREESTEPPROGRESS: {
        if ("layout/three_step_progress_0".equals(tag)) {
          return new ThreeStepProgressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for three_step_progress is invalid. Received: " + tag);
      }
      case  LAYOUT_TOOLBAR: {
        if ("layout/toolbar_0".equals(tag)) {
          return new ToolbarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for toolbar is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(30);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "onClick");
      sKeys.put(2, "titlesRes");
      sKeys.put(3, "selectable");
      sKeys.put(4, "titleIndex");
      sKeys.put(5, "title");
      sKeys.put(6, "error");
      sKeys.put(7, "checked");
      sKeys.put(8, "text");
      sKeys.put(9, "credit");
      sKeys.put(10, "drawableStart");
      sKeys.put(11, "value");
      sKeys.put(12, "brief");
      sKeys.put(13, "hintRes");
      sKeys.put(14, "drawableEnd");
      sKeys.put(15, "titleRes");
      sKeys.put(16, "requirements");
      sKeys.put(17, "satisfied");
      sKeys.put(18, "isValid");
      sKeys.put(19, "forciblyColored");
      sKeys.put(20, "afterTextChanged");
      sKeys.put(21, "requirement");
      sKeys.put(22, "viewModel");
      sKeys.put(23, "step");
      sKeys.put(24, "hintStatic");
      sKeys.put(25, "detail");
      sKeys.put(26, "card");
      sKeys.put(27, "primary");
      sKeys.put(28, "status");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(69);

    static {
      sKeys.put("layout/activity_add_card_0", ua.mycredit.mycredit.R.layout.activity_add_card);
      sKeys.put("layout/activity_details_0", ua.mycredit.mycredit.R.layout.activity_details);
      sKeys.put("layout/activity_profile_0", ua.mycredit.mycredit.R.layout.activity_profile);
      sKeys.put("layout/activity_question_0", ua.mycredit.mycredit.R.layout.activity_question);
      sKeys.put("layout/activity_repay_loan_0", ua.mycredit.mycredit.R.layout.activity_repay_loan);
      sKeys.put("layout/activity_sign_up_0", ua.mycredit.mycredit.R.layout.activity_sign_up);
      sKeys.put("layout/calculator_0", ua.mycredit.mycredit.R.layout.calculator);
      sKeys.put("layout/card_0", ua.mycredit.mycredit.R.layout.card);
      sKeys.put("layout/credit_status_description_0", ua.mycredit.mycredit.R.layout.credit_status_description);
      sKeys.put("layout/descriptions_pane_0", ua.mycredit.mycredit.R.layout.descriptions_pane);
      sKeys.put("layout/dialog_fragment_enum_picker_0", ua.mycredit.mycredit.R.layout.dialog_fragment_enum_picker);
      sKeys.put("layout/dialog_fragment_phone_0", ua.mycredit.mycredit.R.layout.dialog_fragment_phone);
      sKeys.put("layout/dialog_fragment_simple_input_text_0", ua.mycredit.mycredit.R.layout.dialog_fragment_simple_input_text);
      sKeys.put("layout/dialog_fragment_text_0", ua.mycredit.mycredit.R.layout.dialog_fragment_text);
      sKeys.put("layout/dialog_uneditable_personal_data_0", ua.mycredit.mycredit.R.layout.dialog_uneditable_personal_data);
      sKeys.put("layout/fb_email_0", ua.mycredit.mycredit.R.layout.fb_email);
      sKeys.put("layout/footer_fragment_cards_0", ua.mycredit.mycredit.R.layout.footer_fragment_cards);
      sKeys.put("layout/fragment_agreement_0", ua.mycredit.mycredit.R.layout.fragment_agreement);
      sKeys.put("layout/fragment_bank_0", ua.mycredit.mycredit.R.layout.fragment_bank);
      sKeys.put("layout/fragment_calculator_0", ua.mycredit.mycredit.R.layout.fragment_calculator);
      sKeys.put("layout/fragment_card_back_0", ua.mycredit.mycredit.R.layout.fragment_card_back);
      sKeys.put("layout/fragment_card_front_0", ua.mycredit.mycredit.R.layout.fragment_card_front);
      sKeys.put("layout/fragment_card_sms_confirmation_0", ua.mycredit.mycredit.R.layout.fragment_card_sms_confirmation);
      sKeys.put("layout/fragment_contacts_0", ua.mycredit.mycredit.R.layout.fragment_contacts);
      sKeys.put("layout/fragment_edit_password_0", ua.mycredit.mycredit.R.layout.fragment_edit_password);
      sKeys.put("layout/fragment_extra_personal_info_0", ua.mycredit.mycredit.R.layout.fragment_extra_personal_info);
      sKeys.put("layout/fragment_finance_0", ua.mycredit.mycredit.R.layout.fragment_finance);
      sKeys.put("layout/fragment_invalid_0", ua.mycredit.mycredit.R.layout.fragment_invalid);
      sKeys.put("layout/fragment_passport_0", ua.mycredit.mycredit.R.layout.fragment_passport);
      sKeys.put("layout/fragment_password_0", ua.mycredit.mycredit.R.layout.fragment_password);
      sKeys.put("layout/fragment_personal_data_0", ua.mycredit.mycredit.R.layout.fragment_personal_data);
      sKeys.put("layout/fragment_personal_information_0", ua.mycredit.mycredit.R.layout.fragment_personal_information);
      sKeys.put("layout/fragment_profile_0", ua.mycredit.mycredit.R.layout.fragment_profile);
      sKeys.put("layout/fragment_prolongation_preferences_0", ua.mycredit.mycredit.R.layout.fragment_prolongation_preferences);
      sKeys.put("layout/fragment_repay_by_card_0", ua.mycredit.mycredit.R.layout.fragment_repay_by_card);
      sKeys.put("layout/fragment_reset_password_by_phone_0", ua.mycredit.mycredit.R.layout.fragment_reset_password_by_phone);
      sKeys.put("layout/fragment_sign_in_0", ua.mycredit.mycredit.R.layout.fragment_sign_in);
      sKeys.put("layout/fragment_sign_up_address_0", ua.mycredit.mycredit.R.layout.fragment_sign_up_address);
      sKeys.put("layout/fragment_sign_up_phone_0", ua.mycredit.mycredit.R.layout.fragment_sign_up_phone);
      sKeys.put("layout/fragment_status_0", ua.mycredit.mycredit.R.layout.fragment_status);
      sKeys.put("layout/fragment_student_0", ua.mycredit.mycredit.R.layout.fragment_student);
      sKeys.put("layout/fragment_temporarily_unemployed_0", ua.mycredit.mycredit.R.layout.fragment_temporarily_unemployed);
      sKeys.put("layout/fragment_web_view_0", ua.mycredit.mycredit.R.layout.fragment_web_view);
      sKeys.put("layout/income_fields_0", ua.mycredit.mycredit.R.layout.income_fields);
      sKeys.put("layout/input_field_0", ua.mycredit.mycredit.R.layout.input_field);
      sKeys.put("layout/input_field_hint_static_0", ua.mycredit.mycredit.R.layout.input_field_hint_static);
      sKeys.put("layout/input_phone_number_0", ua.mycredit.mycredit.R.layout.input_phone_number);
      sKeys.put("layout/input_picker_layout_0", ua.mycredit.mycredit.R.layout.input_picker_layout);
      sKeys.put("layout/input_text_picker_0", ua.mycredit.mycredit.R.layout.input_text_picker);
      sKeys.put("layout/input_variant_picker_0", ua.mycredit.mycredit.R.layout.input_variant_picker);
      sKeys.put("layout/item_card_0", ua.mycredit.mycredit.R.layout.item_card);
      sKeys.put("layout/item_contract_addition_0", ua.mycredit.mycredit.R.layout.item_contract_addition);
      sKeys.put("layout/item_detail_section_0", ua.mycredit.mycredit.R.layout.item_detail_section);
      sKeys.put("layout/item_faq_0", ua.mycredit.mycredit.R.layout.item_faq);
      sKeys.put("layout/item_history_0", ua.mycredit.mycredit.R.layout.item_history);
      sKeys.put("layout/list_content_0", ua.mycredit.mycredit.R.layout.list_content);
      sKeys.put("layout/password_requirement_0", ua.mycredit.mycredit.R.layout.password_requirement);
      sKeys.put("layout/password_requirements_0", ua.mycredit.mycredit.R.layout.password_requirements);
      sKeys.put("layout/preloader_0", ua.mycredit.mycredit.R.layout.preloader);
      sKeys.put("layout/requirement_0", ua.mycredit.mycredit.R.layout.requirement);
      sKeys.put("layout/resendable_sms_code_0", ua.mycredit.mycredit.R.layout.resendable_sms_code);
      sKeys.put("layout/simple_button_0", ua.mycredit.mycredit.R.layout.simple_button);
      sKeys.put("layout/sms_code_0", ua.mycredit.mycredit.R.layout.sms_code);
      sKeys.put("layout/status_details_active_0", ua.mycredit.mycredit.R.layout.status_details_active);
      sKeys.put("layout/status_details_past_due_0", ua.mycredit.mycredit.R.layout.status_details_past_due);
      sKeys.put("layout/status_details_restructured_0", ua.mycredit.mycredit.R.layout.status_details_restructured);
      sKeys.put("layout/swipe_refresh_layout_0", ua.mycredit.mycredit.R.layout.swipe_refresh_layout);
      sKeys.put("layout/three_step_progress_0", ua.mycredit.mycredit.R.layout.three_step_progress);
      sKeys.put("layout/toolbar_0", ua.mycredit.mycredit.R.layout.toolbar);
    }
  }
}
