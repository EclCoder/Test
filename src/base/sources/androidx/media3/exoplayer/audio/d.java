package androidx.media3.exoplayer.audio;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f5015d = new b().d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5018c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f5019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f5020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f5021c;

        public d d() {
            if (this.f5019a || !(this.f5020b || this.f5021c)) {
                return new d(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z10) {
            this.f5019a = z10;
            return this;
        }

        public b f(boolean z10) {
            this.f5020b = z10;
            return this;
        }

        public b g(boolean z10) {
            this.f5021c = z10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f5016a == dVar.f5016a && this.f5017b == dVar.f5017b && this.f5018c == dVar.f5018c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5016a ? 1 : 0) << 2) + ((this.f5017b ? 1 : 0) << 1) + (this.f5018c ? 1 : 0);
    }

    private d(b bVar) {
        this.f5016a = bVar.f5019a;
        this.f5017b = bVar.f5020b;
        this.f5018c = bVar.f5021c;
    }
}
