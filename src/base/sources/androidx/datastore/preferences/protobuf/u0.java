package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s0 f3738a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final s0 f3739b = new t0();

    static s0 a() {
        return f3738a;
    }

    static s0 b() {
        return f3739b;
    }

    private static s0 c() {
        if (y0.f3776d) {
            return null;
        }
        try {
            return (s0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
