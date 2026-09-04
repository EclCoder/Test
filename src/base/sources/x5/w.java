package x5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class w implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w f56737a = new w();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f56738a = new a();

        public static a a() {
            return f56738a;
        }

        @Override // x5.o
        public n d(r rVar) {
            return w.c();
        }
    }

    public static w c() {
        return f56737a;
    }

    @Override // x5.n
    public boolean a(Object obj) {
        return true;
    }

    @Override // x5.n
    public n.a b(Object obj, int i10, int i11, r5.g gVar) {
        return new n.a(new l6.d(obj), new b(obj));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f56739a;

        b(Object obj) {
            this.f56739a = obj;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f56739a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public r5.a d() {
            return r5.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d.a aVar) {
            aVar.f(this.f56739a);
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
