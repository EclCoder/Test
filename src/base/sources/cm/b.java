package cm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f10126a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal[] f10127b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal();
        }
        f10127b = threadLocalArr;
    }

    public static final boolean a() {
        return f10126a;
    }
}
