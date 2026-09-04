package l5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43901a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f43902a;

        /* synthetic */ a(w wVar) {
        }

        public d a() {
            String str = this.f43902a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            d dVar = new d(null);
            dVar.f43901a = str;
            return dVar;
        }

        public a b(String str) {
            this.f43902a = str;
            return this;
        }
    }

    /* synthetic */ d(w wVar) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.f43901a;
    }
}
