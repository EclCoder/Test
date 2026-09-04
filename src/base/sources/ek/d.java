package ek;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements c, dk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f37955b = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f37956a;

    private d(Object obj) {
        this.f37956a = obj;
    }

    public static c a(Object obj) {
        return new d(e.b(obj, "instance cannot be null"));
    }

    @Override // el.a
    public Object get() {
        return this.f37956a;
    }
}
