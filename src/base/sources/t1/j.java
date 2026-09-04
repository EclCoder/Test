package t1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f52699e = new b(0).e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f52700f = w1.c0.s0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f52701g = w1.c0.s0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f52702h = w1.c0.s0(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f52703i = w1.c0.s0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f52707d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f52708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f52709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f52710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f52711d;

        public b(int i10) {
            this.f52708a = i10;
        }

        public j e() {
            w1.a.a(this.f52709b <= this.f52710c);
            return new j(this);
        }

        public b f(int i10) {
            this.f52710c = i10;
            return this;
        }

        public b g(int i10) {
            this.f52709b = i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f52704a == jVar.f52704a && this.f52705b == jVar.f52705b && this.f52706c == jVar.f52706c && w1.c0.c(this.f52707d, jVar.f52707d);
    }

    public int hashCode() {
        int i10 = (((((527 + this.f52704a) * 31) + this.f52705b) * 31) + this.f52706c) * 31;
        String str = this.f52707d;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    private j(b bVar) {
        this.f52704a = bVar.f52708a;
        this.f52705b = bVar.f52709b;
        this.f52706c = bVar.f52710c;
        this.f52707d = bVar.f52711d;
    }
}
