package ob;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f48408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f48409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f48410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal f48411d = new ThreadLocal();

    public n0(long j10) {
        h(j10);
    }

    public static long g(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long j(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public static long k(long j10) {
        return j(j10) % 8589934592L;
    }

    public synchronized long a(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            if (!f()) {
                long jLongValue = this.f48408a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) a.e((Long) this.f48411d.get())).longValue();
                }
                this.f48409b = jLongValue - j10;
                notifyAll();
            }
            this.f48410c = j10;
            return j10 + this.f48409b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long b(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j11 = this.f48410c;
            if (j11 != C.TIME_UNSET) {
                long j12 = j(j11);
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j10;
                j10 += j13 * 8589934592L;
                if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                    j10 = j14;
                }
            }
            return a(g(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long c() {
        long j10;
        j10 = this.f48408a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = C.TIME_UNSET;
        }
        return j10;
    }

    public synchronized long d() {
        long j10;
        try {
            j10 = this.f48410c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j10 != C.TIME_UNSET ? j10 + this.f48409b : c();
    }

    public synchronized long e() {
        return this.f48409b;
    }

    public synchronized boolean f() {
        return this.f48409b != C.TIME_UNSET;
    }

    public synchronized void h(long j10) {
        this.f48408a = j10;
        this.f48409b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f48410c = C.TIME_UNSET;
    }

    public synchronized void i(boolean z10, long j10, long j11) {
        try {
            a.g(this.f48408a == 9223372036854775806L);
            if (f()) {
                return;
            }
            if (z10) {
                this.f48411d.set(Long.valueOf(j10));
            } else {
                long jElapsedRealtime = 0;
                long j12 = j11;
                while (!f()) {
                    if (j11 == 0) {
                        wait();
                    } else {
                        a.g(j12 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j12);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j11 && !f()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j11 + " milliseconds");
                        }
                        j12 = j11 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
