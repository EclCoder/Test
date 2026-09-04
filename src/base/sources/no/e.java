package no;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class e implements Cloneable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f47887i = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f47889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f47891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f47892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f47893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f47894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f47895h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f47896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f47897b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f47899d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f47901f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f47902g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f47903h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f47898c = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f47900e = true;

        a() {
        }

        public e a() {
            return new e(this.f47896a, this.f47897b, this.f47898c, this.f47899d, this.f47900e, this.f47901f, this.f47902g, this.f47903h);
        }

        public a b(int i10) {
            this.f47902g = i10;
            return this;
        }

        public a c(int i10) {
            this.f47901f = i10;
            return this;
        }
    }

    e(int i10, boolean z10, int i11, boolean z11, boolean z12, int i12, int i13, int i14) {
        this.f47888a = i10;
        this.f47889b = z10;
        this.f47890c = i11;
        this.f47891d = z11;
        this.f47892e = z12;
        this.f47893f = i12;
        this.f47894g = i13;
        this.f47895h = i14;
    }

    public static a c() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return (e) super.clone();
    }

    public String toString() {
        return "[soTimeout=" + this.f47888a + ", soReuseAddress=" + this.f47889b + ", soLinger=" + this.f47890c + ", soKeepAlive=" + this.f47891d + ", tcpNoDelay=" + this.f47892e + ", sndBufSize=" + this.f47893f + ", rcvBufSize=" + this.f47894g + ", backlogSize=" + this.f47895h + "]";
    }
}
