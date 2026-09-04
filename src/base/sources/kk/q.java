package kk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class q {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final lk.b f43508a;

        @Override // kk.q
        public lk.b a() {
            return this.f43508a;
        }

        @Override // kk.q
        public t b() {
            return t.a();
        }

        private b() {
            this.f43508a = lk.b.b();
        }
    }

    static q c() {
        return new b();
    }

    public abstract lk.b a();

    public abstract t b();
}
