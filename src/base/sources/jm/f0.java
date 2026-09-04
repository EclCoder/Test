package jm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f42646a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f42646a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
