package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f3505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f3506b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f3507c;

    static {
        f3507c = (f3505a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f3506b;
    }

    static boolean c() {
        if (f3505a) {
            return true;
        }
        return (f3506b == null || f3507c) ? false : true;
    }
}
