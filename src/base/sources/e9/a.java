package e9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements el.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f37293c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile el.a f37294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f37295b = f37293c;

    private a(el.a aVar) {
        this.f37294a = aVar;
    }

    public static el.a a(el.a aVar) {
        d.b(aVar);
        return aVar instanceof a ? aVar : new a(aVar);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == f37293c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // el.a
    public Object get() {
        Object obj;
        Object obj2 = this.f37295b;
        Object obj3 = f37293c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f37295b;
                if (obj == obj3) {
                    obj = this.f37294a.get();
                    this.f37295b = b(this.f37295b, obj);
                    this.f37294a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
