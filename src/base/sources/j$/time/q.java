package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f41772a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f41772a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f41772a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
