package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o f3665a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o f3666b = c();

    static o a() {
        o oVar = f3666b;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static o b() {
        return f3665a;
    }

    private static o c() {
        if (y0.f3776d) {
            return null;
        }
        try {
            return (o) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
