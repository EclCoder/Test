package l5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43897a;

    /* JADX INFO: renamed from: l5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0668a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f43898a;

        /* synthetic */ C0668a(com.android.billingclient.api.k kVar) {
        }

        public a a() {
            String str = this.f43898a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            a aVar = new a(null);
            aVar.f43897a = str;
            return aVar;
        }

        public C0668a b(String str) {
            this.f43898a = str;
            return this;
        }
    }

    /* synthetic */ a(com.android.billingclient.api.k kVar) {
    }

    public static C0668a b() {
        return new C0668a(null);
    }

    public String a() {
        return this.f43897a;
    }
}
