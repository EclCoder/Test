package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class f3618a = c();

    public static n a() {
        n nVarB = b("getEmptyRegistry");
        return nVarB != null ? nVarB : n.f3621c;
    }

    private static final n b(String str) {
        Class cls = f3618a;
        if (cls == null) {
            return null;
        }
        try {
            return (n) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
