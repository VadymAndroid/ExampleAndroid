package ua.mycredit.mycredit.ui.profile.repayloan;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0012\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Lua/mycredit/mycredit/ui/profile/repayloan/RepaymentType;", "Ljava/io/Serializable;", "title", "", "(I)V", "amount", "", "getAmount", "()D", "credit", "Lua/mycredit/core/Credit;", "getCredit", "()Lua/mycredit/core/Credit;", "getTitle", "()I", "ProlongLoan", "RepayCredit", "RestructuringStep", "Lua/mycredit/mycredit/ui/profile/repayloan/RepaymentType$RepayCredit;", "Lua/mycredit/mycredit/ui/profile/repayloan/RepaymentType$ProlongLoan;", "Lua/mycredit/mycredit/ui/profile/repayloan/RepaymentType$RestructuringStep;", "presentation_fullDebug"})
public abstract class RepaymentType implements java.io.Serializable {
    private final int title = 0;
    
    @org.jetbrains.annotations.NotNull()
    public abstract ua.mycredit.core.Credit getCredit();
    
    public abstract double getAmount();
    
    public final int getTitle() {
        return 0;
    }
    
    private RepaymentType(int title) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lua/mycredit/mycredit/ui/profile/repayloan/RepaymentType$RepayCredit;", "Lua/mycredit/mycredit/ui/profile/repayloan/RepaymentType;", "credit", "Lua/mycredit/core/Credit;", "(Lua/mycredit/core/Credit;)V", "amount", "", "getAmount", "()D", "getCredit", "()Lua/mycredit/core/Credit;", "presentation_fullDebug"})
    public static final class RepayCredit extends ua.mycredit.mycredit.ui.profile.repayloan.RepaymentType {
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.core.Credit credit = null;
        
        @java.lang.Override()
        public double getAmount() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.core.Credit getCredit() {
            return null;
        }
        
        public RepayCredit(@org.jetbrains.annotations.NotNull()
        ua.mycredit.core.Credit credit) {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lua/mycredit/mycredit/ui/profile/repayloan/RepaymentType$ProlongLoan;", "Lua/mycredit/mycredit/ui/profile/repayloan/RepaymentType;", "credit", "Lua/mycredit/core/Credit;", "(Lua/mycredit/core/Credit;)V", "amount", "", "getAmount", "()D", "getCredit", "()Lua/mycredit/core/Credit;", "presentation_fullDebug"})
    public static final class ProlongLoan extends ua.mycredit.mycredit.ui.profile.repayloan.RepaymentType {
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.core.Credit credit = null;
        
        @java.lang.Override()
        public double getAmount() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.core.Credit getCredit() {
            return null;
        }
        
        public ProlongLoan(@org.jetbrains.annotations.NotNull()
        ua.mycredit.core.Credit credit) {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lua/mycredit/mycredit/ui/profile/repayloan/RepaymentType$RestructuringStep;", "Lua/mycredit/mycredit/ui/profile/repayloan/RepaymentType;", "credit", "Lua/mycredit/core/Credit;", "(Lua/mycredit/core/Credit;)V", "amount", "", "getAmount", "()D", "getCredit", "()Lua/mycredit/core/Credit;", "presentation_fullDebug"})
    public static final class RestructuringStep extends ua.mycredit.mycredit.ui.profile.repayloan.RepaymentType {
        @org.jetbrains.annotations.NotNull()
        private final ua.mycredit.core.Credit credit = null;
        
        @java.lang.Override()
        public double getAmount() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public ua.mycredit.core.Credit getCredit() {
            return null;
        }
        
        public RestructuringStep(@org.jetbrains.annotations.NotNull()
        ua.mycredit.core.Credit credit) {
            super(0);
        }
    }
}