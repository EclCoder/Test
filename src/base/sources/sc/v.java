package sc;

import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f52352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f52353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f52354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f52355d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f52356a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f52356a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52356a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52356a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52356a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52356a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52356a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f52356a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    v(b0 b0Var) {
        this.f52352a = (b0) p.p(b0Var, "ticker");
    }

    private static TimeUnit b(long j10) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j10, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j10, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j10, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j10, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j10, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j10, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    public static v c(b0 b0Var) {
        return new v(b0Var).e();
    }

    private long d() {
        return this.f52353b ? (this.f52352a.read() - this.f52355d) + this.f52354c : this.f52354c;
    }

    public v e() {
        p.w(!this.f52353b, "This stopwatch is already running.");
        this.f52353b = true;
        this.f52355d = this.f52352a.read();
        return this;
    }

    public String toString() {
        long jD = d();
        TimeUnit timeUnitB = b(jD);
        return o.b(jD / TimeUnit.NANOSECONDS.convert(1L, timeUnitB)) + " " + a(timeUnitB);
    }

    private static String a(TimeUnit timeUnit) {
        switch (a.f52356a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return qEagQqzJZsd.zbutJgV;
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D;
            default:
                throw new AssertionError();
        }
    }
}
