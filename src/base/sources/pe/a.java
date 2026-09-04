package pe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f50021c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile e f50022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f50023b = f50021c;

    private a(e eVar) {
        this.f50022a = eVar;
    }

    private synchronized Object a() {
        Object obj;
        obj = this.f50023b;
        if (obj == f50021c) {
            obj = this.f50022a.get();
            this.f50023b = c(this.f50023b, obj);
            this.f50022a = null;
        }
        return obj;
    }

    public static e b(e eVar) {
        d.b(eVar);
        return eVar instanceof a ? eVar : new a(eVar);
    }

    private static Object c(Object obj, Object obj2) {
        if (obj == f50021c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // el.a
    public Object get() {
        Object obj = this.f50023b;
        return obj == f50021c ? a() : obj;
    }
}
