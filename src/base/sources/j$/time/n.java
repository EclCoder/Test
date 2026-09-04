package j$.time;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements j$.time.temporal.n, j$.time.temporal.o {
    public static final n APRIL;
    public static final n AUGUST;
    public static final n DECEMBER;
    public static final n FEBRUARY;
    public static final n JANUARY;
    public static final n JULY;
    public static final n JUNE;
    public static final n MARCH;
    public static final n MAY;
    public static final n NOVEMBER;
    public static final n OCTOBER;
    public static final n SEPTEMBER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n[] f41766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ n[] f41767b;

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f41767b.clone();
    }

    static {
        n nVar = new n("JANUARY", 0);
        JANUARY = nVar;
        n nVar2 = new n("FEBRUARY", 1);
        FEBRUARY = nVar2;
        n nVar3 = new n("MARCH", 2);
        MARCH = nVar3;
        n nVar4 = new n("APRIL", 3);
        APRIL = nVar4;
        n nVar5 = new n("MAY", 4);
        MAY = nVar5;
        n nVar6 = new n("JUNE", 5);
        JUNE = nVar6;
        n nVar7 = new n("JULY", 6);
        JULY = nVar7;
        n nVar8 = new n("AUGUST", 7);
        AUGUST = nVar8;
        n nVar9 = new n("SEPTEMBER", 8);
        SEPTEMBER = nVar9;
        n nVar10 = new n("OCTOBER", 9);
        OCTOBER = nVar10;
        n nVar11 = new n("NOVEMBER", 10);
        NOVEMBER = nVar11;
        n nVar12 = new n("DECEMBER", 11);
        DECEMBER = nVar12;
        f41767b = new n[]{nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11, nVar12};
        f41766a = values();
    }

    public static n I(int i10) {
        if (i10 < 1 || i10 > 12) {
            throw new c("Invalid value for MonthOfYear: " + i10);
        }
        return f41766a[i10 - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.n
    public final boolean h(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.MONTH_OF_YEAR;
        }
        return rVar != null && rVar.s(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return rVar.I();
        }
        return super.l(rVar);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
        }
        return rVar.P(this);
    }

    public final int A(boolean z10) {
        int i10 = m.f41765a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return z10 ? 29 : 28;
    }

    public final int F() {
        int i10 = m.f41765a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int s(boolean z10) {
        switch (m.f41765a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z10 ? 1 : 0) + 91;
            case 3:
                return (z10 ? 1 : 0) + 152;
            case 4:
                return (z10 ? 1 : 0) + 244;
            case 5:
                return (z10 ? 1 : 0) + Sdk$SDKError.b.MRAID_BRIDGE_ERROR_VALUE;
            case 6:
                return 1;
            case 7:
                return (z10 ? 1 : 0) + 60;
            case 8:
                return (z10 ? 1 : 0) + Sdk$SDKError.b.TPAT_ERROR_VALUE;
            case 9:
                return (z10 ? 1 : 0) + 182;
            case 10:
                return (z10 ? 1 : 0) + Sdk$SDKError.b.INVALID_ADUNIT_BID_PAYLOAD_VALUE;
            case 11:
                return (z10 ? 1 : 0) + 274;
            default:
                return (z10 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.n
    public final Object b(a0 a0Var) {
        if (a0Var == j$.time.temporal.s.f41803b) {
            return j$.time.chrono.s.f41655c;
        }
        if (a0Var == j$.time.temporal.s.f41804c) {
            return j$.time.temporal.b.MONTHS;
        }
        return super.b(a0Var);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m e(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.l.r(mVar).equals(j$.time.chrono.s.f41655c)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return mVar.c(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
