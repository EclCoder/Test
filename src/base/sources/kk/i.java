package kk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract class i {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements hk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final gk.b f43448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l f43449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f43450c;

        @Override // hk.a, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            gk.b.k().l(this.f43448a);
            if (this.f43450c) {
                this.f43449b.d();
            }
        }

        private b(l lVar, boolean z10) {
            this.f43449b = lVar;
            this.f43450c = z10;
            this.f43448a = nk.a.b(gk.b.k(), lVar).d();
        }
    }

    static l a() {
        return nk.a.a(gk.b.k());
    }

    static hk.a b(l lVar, boolean z10) {
        return new b(lVar, z10);
    }
}
