package ek;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements el.a, dk.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f37952c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile el.a f37953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f37954b = f37952c;

    private b(el.a aVar) {
        this.f37953a = aVar;
    }

    public static dk.a a(el.a aVar) {
        return aVar instanceof dk.a ? (dk.a) aVar : new b((el.a) e.a(aVar));
    }

    public static el.a b(el.a aVar) {
        e.a(aVar);
        return aVar instanceof b ? aVar : new b(aVar);
    }

    private static Object c(Object obj, Object obj2) {
        if (obj == f37952c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // el.a
    public Object get() {
        Object obj;
        Object obj2 = this.f37954b;
        Object obj3 = f37952c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f37954b;
                if (obj == obj3) {
                    obj = this.f37953a.get();
                    this.f37954b = c(this.f37954b, obj);
                    this.f37953a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
