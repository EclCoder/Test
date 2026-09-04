package m6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile Object f45275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f45276b;

        a(b bVar) {
            this.f45276b = bVar;
        }

        @Override // m6.f.b
        public Object get() {
            if (this.f45275a == null) {
                synchronized (this) {
                    try {
                        if (this.f45275a == null) {
                            this.f45275a = k.e(this.f45276b.get());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f45275a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        Object get();
    }

    public static b a(b bVar) {
        return new a(bVar);
    }
}
