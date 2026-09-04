package j$.time;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements j$.time.temporal.n, j$.time.temporal.o {
    public static final e FRIDAY;
    public static final e MONDAY;
    public static final e SATURDAY;
    public static final e SUNDAY;
    public static final e THURSDAY;
    public static final e TUESDAY;
    public static final e WEDNESDAY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e[] f41670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e[] f41671b;

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f41671b.clone();
    }

    static {
        e eVar = new e("MONDAY", 0);
        MONDAY = eVar;
        e eVar2 = new e("TUESDAY", 1);
        TUESDAY = eVar2;
        e eVar3 = new e("WEDNESDAY", 2);
        WEDNESDAY = eVar3;
        e eVar4 = new e("THURSDAY", 3);
        THURSDAY = eVar4;
        e eVar5 = new e("FRIDAY", 4);
        FRIDAY = eVar5;
        e eVar6 = new e("SATURDAY", 5);
        SATURDAY = eVar6;
        e eVar7 = new e("SUNDAY", 6);
        SUNDAY = eVar7;
        f41671b = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        f41670a = values();
    }

    public static e s(int i10) {
        if (i10 < 1 || i10 > 7) {
            throw new c("Invalid value for DayOfWeek: " + i10);
        }
        return f41670a[i10 - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.n
    public final boolean h(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.DAY_OF_WEEK;
        }
        return rVar != null && rVar.s(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return rVar.I();
        }
        return super.l(rVar);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
        }
        return rVar.P(this);
    }

    @Override // j$.time.temporal.n
    public final Object b(a0 a0Var) {
        if (a0Var == j$.time.temporal.s.f41804c) {
            return j$.time.temporal.b.DAYS;
        }
        return super.b(a0Var);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m e(j$.time.temporal.m mVar) {
        return mVar.c(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}
