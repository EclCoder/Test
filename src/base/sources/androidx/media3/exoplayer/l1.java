package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.r.b f5477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5485i;

    l1(androidx.media3.exoplayer.source.r.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        w1.a.a(!z13 || z11);
        w1.a.a(!z12 || z11);
        if (z10 && (z11 || z12 || z13)) {
            z14 = false;
        }
        w1.a.a(z14);
        this.f5477a = bVar;
        this.f5478b = j10;
        this.f5479c = j11;
        this.f5480d = j12;
        this.f5481e = j13;
        this.f5482f = z10;
        this.f5483g = z11;
        this.f5484h = z12;
        this.f5485i = z13;
    }

    public l1 a(long j10) {
        return j10 == this.f5479c ? this : new l1(this.f5477a, this.f5478b, j10, this.f5480d, this.f5481e, this.f5482f, this.f5483g, this.f5484h, this.f5485i);
    }

    public l1 b(long j10) {
        return j10 == this.f5478b ? this : new l1(this.f5477a, j10, this.f5479c, this.f5480d, this.f5481e, this.f5482f, this.f5483g, this.f5484h, this.f5485i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l1.class == obj.getClass()) {
            l1 l1Var = (l1) obj;
            if (this.f5478b == l1Var.f5478b && this.f5479c == l1Var.f5479c && this.f5480d == l1Var.f5480d && this.f5481e == l1Var.f5481e && this.f5482f == l1Var.f5482f && this.f5483g == l1Var.f5483g && this.f5484h == l1Var.f5484h && this.f5485i == l1Var.f5485i && w1.c0.c(this.f5477a, l1Var.f5477a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f5477a.hashCode()) * 31) + ((int) this.f5478b)) * 31) + ((int) this.f5479c)) * 31) + ((int) this.f5480d)) * 31) + ((int) this.f5481e)) * 31) + (this.f5482f ? 1 : 0)) * 31) + (this.f5483g ? 1 : 0)) * 31) + (this.f5484h ? 1 : 0)) * 31) + (this.f5485i ? 1 : 0);
    }
}
