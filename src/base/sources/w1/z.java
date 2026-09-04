package w1;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f55859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f55860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f55861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal f55862d = new ThreadLocal();

    public z(long j10) {
        i(j10);
    }

    public static long h(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long j(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public synchronized long a(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            if (!g()) {
                long jLongValue = this.f55859a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) a.e((Long) this.f55862d.get())).longValue();
                }
                this.f55860b = jLongValue - j10;
                notifyAll();
            }
            this.f55861c = j10;
            return j10 + this.f55860b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long b(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j11 = this.f55861c;
            if (j11 != C.TIME_UNSET) {
                long j12 = j(j11);
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j10;
                j10 += j13 * 8589934592L;
                if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                    j10 = j14;
                }
            }
            return a(h(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long c(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j11 = this.f55861c;
            if (j11 != C.TIME_UNSET) {
                long j12 = j(j11);
                long j13 = j12 / 8589934592L;
                long j14 = (j13 * 8589934592L) + j10;
                j10 += (j13 + 1) * 8589934592L;
                if (j14 >= j12) {
                    j10 = j14;
                }
            }
            return a(h(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long d() {
        long j10;
        j10 = this.f55859a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = C.TIME_UNSET;
        }
        return j10;
    }

    public synchronized long e() {
        long j10;
        try {
            j10 = this.f55861c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j10 != C.TIME_UNSET ? j10 + this.f55860b : d();
    }

    public synchronized long f() {
        return this.f55860b;
    }

    public synchronized boolean g() {
        return this.f55860b != C.TIME_UNSET;
    }

    public synchronized void i(long j10) {
        this.f55859a = j10;
        this.f55860b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f55861c = C.TIME_UNSET;
    }
}
