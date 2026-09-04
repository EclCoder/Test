package m6;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f45277a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j10) {
        return (b() - j10) * f45277a;
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
