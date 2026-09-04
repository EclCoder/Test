package e9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f37296b = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f37297a;

    private c(Object obj) {
        this.f37297a = obj;
    }

    public static b a(Object obj) {
        return new c(d.c(obj, "instance cannot be null"));
    }

    @Override // el.a
    public Object get() {
        return this.f37297a;
    }
}
