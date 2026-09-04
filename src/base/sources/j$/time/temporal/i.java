package j$.time.temporal;

/* JADX INFO: loaded from: classes3.dex */
public enum i implements t {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41791a;

    static {
        j$.time.f.A(31556952L, 0);
        j$.time.f.A(7889238L, 0);
    }

    i(String str) {
        this.f41791a = str;
    }

    @Override // j$.time.temporal.t
    public final m s(m mVar, long j10) {
        int i10 = c.f41787a[ordinal()];
        if (i10 == 1) {
            h hVar = j.f41794c;
            return mVar.c(Math.addExact(mVar.g(hVar), j10), hVar);
        }
        if (i10 == 2) {
            return mVar.d(j10 / 4, b.YEARS).d((j10 % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f41791a;
    }
}
