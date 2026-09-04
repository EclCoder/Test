package vp;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f55742a;

    public static void a(long j10) {
        long j11 = f55742a - j10;
        f55742a = j11;
        if (j11 < 0) {
            f55742a = 0L;
        }
    }

    public static void b(long j10) {
        f55742a += j10;
    }
}
