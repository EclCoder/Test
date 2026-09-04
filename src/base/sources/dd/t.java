package dd;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class t implements ce.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f36677c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f36678a = f36677c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile ce.b f36679b;

    public t(ce.b bVar) {
        this.f36679b = bVar;
    }

    @Override // ce.b
    public Object get() {
        Object obj;
        Object obj2 = this.f36678a;
        Object obj3 = f36677c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f36678a;
                if (obj == obj3) {
                    obj = this.f36679b.get();
                    this.f36678a = obj;
                    this.f36679b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
