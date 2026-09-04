package n6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f46863a;

        b() {
            super();
        }

        @Override // n6.c
        public void b(boolean z10) {
            this.f46863a = z10;
        }

        @Override // n6.c
        public void c() {
            if (this.f46863a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static c a() {
        return new b();
    }

    abstract void b(boolean z10);

    public abstract void c();

    private c() {
    }
}
