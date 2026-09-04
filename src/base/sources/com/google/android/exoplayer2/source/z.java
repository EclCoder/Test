package com.google.android.exoplayer2.source;

import android.os.Looper;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.source.z;
import com.google.android.exoplayer2.y0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import p9.s1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends com.google.android.exoplayer2.source.a implements y.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y0 f18312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final y0.h f18313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final nb.j.a f18314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final t.a f18315k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.j f18316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.c f18317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f18318n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f18319o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f18320p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f18321q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f18322r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private nb.a0 f18323s;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends k {
        a(h2 h2Var) {
            super(h2Var);
        }

        @Override // com.google.android.exoplayer2.source.k, com.google.android.exoplayer2.h2
        public h2.b k(int i10, h2.b bVar, boolean z10) {
            super.k(i10, bVar, z10);
            bVar.f17003f = true;
            return bVar;
        }

        @Override // com.google.android.exoplayer2.source.k, com.google.android.exoplayer2.h2
        public h2.d s(int i10, h2.d dVar, long j10) {
            super.s(i10, dVar, j10);
            dVar.f17029l = true;
            return dVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements r {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final nb.j.a f18325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private t.a f18326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private t9.k f18327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.c f18328f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f18329g;

        public b(nb.j.a aVar) {
            this(aVar, new u9.h());
        }

        public static /* synthetic */ t d(u9.p pVar, s1 s1Var) {
            return new ra.a(pVar);
        }

        @Override // com.google.android.exoplayer2.source.p.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public z a(y0 y0Var) {
            ob.a.e(y0Var.f18982b);
            return new z(y0Var, this.f18325c, this.f18326d, this.f18327e.a(y0Var), this.f18328f, this.f18329g, null);
        }

        @Override // com.google.android.exoplayer2.source.p.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b c(t9.k kVar) {
            this.f18327e = (t9.k) ob.a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b b(com.google.android.exoplayer2.upstream.c cVar) {
            this.f18328f = (com.google.android.exoplayer2.upstream.c) ob.a.f(cVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(nb.j.a aVar, final u9.p pVar) {
            this(aVar, new t.a() { // from class: ra.r
                @Override // com.google.android.exoplayer2.source.t.a
                public final com.google.android.exoplayer2.source.t a(s1 s1Var) {
                    return z.b.d(pVar, s1Var);
                }
            });
        }

        public b(nb.j.a aVar, t.a aVar2) {
            this(aVar, aVar2, new com.google.android.exoplayer2.drm.g(), new com.google.android.exoplayer2.upstream.b(), ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        }

        public b(nb.j.a aVar, t.a aVar2, t9.k kVar, com.google.android.exoplayer2.upstream.c cVar, int i10) {
            this.f18325c = aVar;
            this.f18326d = aVar2;
            this.f18327e = kVar;
            this.f18328f = cVar;
            this.f18329g = i10;
        }
    }

    /* synthetic */ z(y0 y0Var, nb.j.a aVar, t.a aVar2, com.google.android.exoplayer2.drm.j jVar, com.google.android.exoplayer2.upstream.c cVar, int i10, a aVar3) {
        this(y0Var, aVar, aVar2, jVar, cVar, i10);
    }

    private void D() {
        h2 tVar = new ra.t(this.f18320p, this.f18321q, false, this.f18322r, null, this.f18312h);
        if (this.f18319o) {
            tVar = new a(tVar);
        }
        B(tVar);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void A(nb.a0 a0Var) {
        this.f18323s = a0Var;
        this.f18316l.e((Looper) ob.a.e(Looper.myLooper()), y());
        this.f18316l.a();
        D();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void C() {
        this.f18316l.release();
    }

    @Override // com.google.android.exoplayer2.source.p
    public y0 a() {
        return this.f18312h;
    }

    @Override // com.google.android.exoplayer2.source.y.b
    public void b(long j10, boolean z10, boolean z11) {
        if (j10 == C.TIME_UNSET) {
            j10 = this.f18320p;
        }
        if (!this.f18319o && this.f18320p == j10 && this.f18321q == z10 && this.f18322r == z11) {
            return;
        }
        this.f18320p = j10;
        this.f18321q = z10;
        this.f18322r = z11;
        this.f18319o = false;
        D();
    }

    @Override // com.google.android.exoplayer2.source.p
    public void l(o oVar) {
        ((y) oVar).P();
    }

    @Override // com.google.android.exoplayer2.source.p
    public o o(p.b bVar, nb.b bVar2, long j10) {
        nb.j jVarCreateDataSource = this.f18314j.createDataSource();
        nb.a0 a0Var = this.f18323s;
        if (a0Var != null) {
            jVarCreateDataSource.d(a0Var);
        }
        return new y(this.f18313i.f19079a, jVarCreateDataSource, this.f18315k.a(y()), this.f18316l, t(bVar), this.f18317m, v(bVar), this, bVar2, this.f18313i.f19084f, this.f18318n);
    }

    private z(y0 y0Var, nb.j.a aVar, t.a aVar2, com.google.android.exoplayer2.drm.j jVar, com.google.android.exoplayer2.upstream.c cVar, int i10) {
        this.f18313i = (y0.h) ob.a.e(y0Var.f18982b);
        this.f18312h = y0Var;
        this.f18314j = aVar;
        this.f18315k = aVar2;
        this.f18316l = jVar;
        this.f18317m = cVar;
        this.f18318n = i10;
        this.f18319o = true;
        this.f18320p = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.p
    public void maybeThrowSourceInfoRefreshError() {
    }
}
