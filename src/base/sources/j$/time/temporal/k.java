package j$.time.temporal;

import j$.time.format.w;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public enum k implements r {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient String f41796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient v f41797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient long f41798c;

    @Override // j$.time.temporal.r
    public final boolean isDateBased() {
        return true;
    }

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j10) {
        this.f41796a = str;
        this.f41797b = v.f((-365243219162L) + j10, 365241780471L + j10);
        this.f41798c = j10;
    }

    @Override // j$.time.temporal.r
    public final v I() {
        return this.f41797b;
    }

    @Override // j$.time.temporal.r
    public final m V(m mVar, long j10) {
        if (!this.f41797b.e(j10)) {
            throw new j$.time.c("Invalid value: " + this.f41796a + " " + j10);
        }
        return mVar.c(Math.subtractExact(j10, this.f41798c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.r
    public final v A(n nVar) {
        if (nVar.h(a.EPOCH_DAY)) {
            return this.f41797b;
        }
        throw new j$.time.c("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.r
    public final boolean s(n nVar) {
        return nVar.h(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.r
    public final long P(n nVar) {
        return nVar.i(a.EPOCH_DAY) + this.f41798c;
    }

    @Override // j$.time.temporal.r
    public final n F(Map map, j$.time.format.v vVar, w wVar) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.l lVarR = j$.time.chrono.l.r(vVar);
        w wVar2 = w.LENIENT;
        long j10 = this.f41798c;
        if (wVar == wVar2) {
            return lVarR.p(Math.subtractExact(jLongValue, j10));
        }
        this.f41797b.b(jLongValue, this);
        return lVarR.p(jLongValue - j10);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f41796a;
    }
}
