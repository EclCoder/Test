package com.google.android.exoplayer2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.p.b f16708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f16712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f16715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f16716i;

    b1(com.google.android.exoplayer2.source.p.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        ob.a.a(!z13 || z11);
        ob.a.a(!z12 || z11);
        if (z10 && (z11 || z12 || z13)) {
            z14 = false;
        }
        ob.a.a(z14);
        this.f16708a = bVar;
        this.f16709b = j10;
        this.f16710c = j11;
        this.f16711d = j12;
        this.f16712e = j13;
        this.f16713f = z10;
        this.f16714g = z11;
        this.f16715h = z12;
        this.f16716i = z13;
    }

    public b1 a(long j10) {
        return j10 == this.f16710c ? this : new b1(this.f16708a, this.f16709b, j10, this.f16711d, this.f16712e, this.f16713f, this.f16714g, this.f16715h, this.f16716i);
    }

    public b1 b(long j10) {
        return j10 == this.f16709b ? this : new b1(this.f16708a, j10, this.f16710c, this.f16711d, this.f16712e, this.f16713f, this.f16714g, this.f16715h, this.f16716i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (this.f16709b == b1Var.f16709b && this.f16710c == b1Var.f16710c && this.f16711d == b1Var.f16711d && this.f16712e == b1Var.f16712e && this.f16713f == b1Var.f16713f && this.f16714g == b1Var.f16714g && this.f16715h == b1Var.f16715h && this.f16716i == b1Var.f16716i && ob.r0.c(this.f16708a, b1Var.f16708a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f16708a.hashCode()) * 31) + ((int) this.f16709b)) * 31) + ((int) this.f16710c)) * 31) + ((int) this.f16711d)) * 31) + ((int) this.f16712e)) * 31) + (this.f16713f ? 1 : 0)) * 31) + (this.f16714g ? 1 : 0)) * 31) + (this.f16715h ? 1 : 0)) * 31) + (this.f16716i ? 1 : 0);
    }
}
