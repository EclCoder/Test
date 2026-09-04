package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i0 f3592a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i0 f3593b = new j0();

    static i0 a() {
        return f3592a;
    }

    static i0 b() {
        return f3593b;
    }

    private static i0 c() {
        if (y0.f3776d) {
            return null;
        }
        try {
            return (i0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
