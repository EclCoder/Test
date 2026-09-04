package f9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f38375b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f38376a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f38377a = null;

        a() {
        }

        public b a() {
            return new b(this.f38377a);
        }

        public a b(e eVar) {
            this.f38377a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f38376a = eVar;
    }

    public static a b() {
        return new a();
    }

    public e a() {
        return this.f38376a;
    }
}
