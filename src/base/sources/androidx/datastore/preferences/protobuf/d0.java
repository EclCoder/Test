package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b0 f3508a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b0 f3509b = new c0();

    static b0 a() {
        return f3508a;
    }

    static b0 b() {
        return f3509b;
    }

    private static b0 c() {
        if (y0.f3776d) {
            return null;
        }
        try {
            return (b0) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
