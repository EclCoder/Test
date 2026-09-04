package com.google.android.exoplayer2.source.hls;

import android.os.Looper;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.c;
import com.google.android.exoplayer2.y0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import nb.a0;
import o9.n;
import ob.r0;
import ra.d;
import ra.f;
import ra.t;
import t9.k;
import wa.g;
import wa.h;
import xa.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class HlsMediaSource extends com.google.android.exoplayer2.source.a implements HlsPlaylistTracker.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h f17669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final y0.h f17670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f17671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f17672k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final j f17673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final c f17674m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f17675n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f17676o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f17677p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final HlsPlaylistTracker f17678q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f17679r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final y0 f17680s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f17681t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private y0.g f17682u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private a0 f17683v;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Factory implements r {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ int f17684o = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g f17685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h f17686d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e f17687e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private HlsPlaylistTracker.a f17688f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f17689g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private k f17690h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private c f17691i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f17692j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f17693k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f17694l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f17695m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f17696n;

        public Factory(nb.j.a aVar) {
            this(new wa.c(aVar));
        }

        @Override // com.google.android.exoplayer2.source.p.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource a(y0 y0Var) {
            ob.a.e(y0Var.f18982b);
            e cVar = this.f17687e;
            List list = y0Var.f18982b.f19083e;
            if (!list.isEmpty()) {
                cVar = new xa.c(cVar, list);
            }
            g gVar = this.f17685c;
            h hVar = this.f17686d;
            d dVar = this.f17689g;
            j jVarA = this.f17690h.a(y0Var);
            c cVar2 = this.f17691i;
            return new HlsMediaSource(y0Var, gVar, hVar, dVar, null, jVarA, cVar2, this.f17688f.a(this.f17685c, cVar2, cVar), this.f17695m, this.f17692j, this.f17693k, this.f17694l, this.f17696n);
        }

        @Override // com.google.android.exoplayer2.source.p.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Factory c(k kVar) {
            this.f17690h = (k) ob.a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory b(c cVar) {
            this.f17691i = (c) ob.a.f(cVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory(g gVar) {
            this.f17685c = (g) ob.a.e(gVar);
            this.f17690h = new com.google.android.exoplayer2.drm.g();
            this.f17687e = new xa.a();
            this.f17688f = com.google.android.exoplayer2.source.hls.playlist.a.f17732p;
            this.f17686d = h.f56062a;
            this.f17691i = new b();
            this.f17689g = new f();
            this.f17693k = 1;
            this.f17695m = C.TIME_UNSET;
            this.f17692j = true;
        }
    }

    static {
        n.a("goog.exo.hls");
    }

    private t D(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j10, long j11, com.google.android.exoplayer2.source.hls.a aVar) {
        long jC = cVar.f17766h - this.f17678q.c();
        long j12 = cVar.f17773o ? jC + cVar.f17779u : -9223372036854775807L;
        long jH = H(cVar);
        long j13 = this.f17682u.f19061a;
        K(cVar, r0.r(j13 != C.TIME_UNSET ? r0.H0(j13) : J(cVar, jH), jH, cVar.f17779u + jH));
        return new t(j10, j11, C.TIME_UNSET, j12, cVar.f17779u, jC, I(cVar, jH), true, !cVar.f17773o, cVar.f17762d == 2 && cVar.f17764f, aVar, this.f17680s, this.f17682u);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    private t E(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j10, long j11, com.google.android.exoplayer2.source.hls.a aVar) {
        long j12;
        if (cVar.f17763e == C.TIME_UNSET || cVar.f17776r.isEmpty()) {
            j12 = 0;
        } else if (cVar.f17765g) {
            j12 = cVar.f17763e;
        } else {
            long j13 = cVar.f17763e;
            if (j13 == cVar.f17779u) {
                j12 = cVar.f17763e;
            } else {
                j12 = G(cVar.f17776r, j13).f17792e;
            }
        }
        long j14 = j12;
        long j15 = cVar.f17779u;
        return new t(j10, j11, C.TIME_UNSET, j15, j15, 0L, j14, true, false, true, aVar, this.f17680s, null);
    }

    private static com.google.android.exoplayer2.source.hls.playlist.c.b F(List list, long j10) {
        com.google.android.exoplayer2.source.hls.playlist.c.b bVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.google.android.exoplayer2.source.hls.playlist.c.b bVar2 = (com.google.android.exoplayer2.source.hls.playlist.c.b) list.get(i10);
            long j11 = bVar2.f17792e;
            if (j11 > j10 || !bVar2.f17781l) {
                if (j11 > j10) {
                    break;
                }
            } else {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    private static com.google.android.exoplayer2.source.hls.playlist.c.d G(List list, long j10) {
        return (com.google.android.exoplayer2.source.hls.playlist.c.d) list.get(r0.f(list, Long.valueOf(j10), true, true));
    }

    private long H(com.google.android.exoplayer2.source.hls.playlist.c cVar) {
        if (cVar.f17774p) {
            return r0.H0(r0.e0(this.f17679r)) - cVar.d();
        }
        return 0L;
    }

    private long I(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j10) {
        long jH0 = cVar.f17763e;
        if (jH0 == C.TIME_UNSET) {
            jH0 = (cVar.f17779u + j10) - r0.H0(this.f17682u.f19061a);
        }
        if (cVar.f17765g) {
            return jH0;
        }
        com.google.android.exoplayer2.source.hls.playlist.c.b bVarF = F(cVar.f17777s, jH0);
        if (bVarF != null) {
            return bVarF.f17792e;
        }
        if (cVar.f17776r.isEmpty()) {
            return 0L;
        }
        com.google.android.exoplayer2.source.hls.playlist.c.d dVarG = G(cVar.f17776r, jH0);
        com.google.android.exoplayer2.source.hls.playlist.c.b bVarF2 = F(dVarG.f17787m, jH0);
        return bVarF2 != null ? bVarF2.f17792e : dVarG.f17792e;
    }

    private static long J(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j10) {
        long j11;
        com.google.android.exoplayer2.source.hls.playlist.c.f fVar = cVar.f17780v;
        long j12 = cVar.f17763e;
        if (j12 != C.TIME_UNSET) {
            j11 = cVar.f17779u - j12;
        } else {
            long j13 = fVar.f17802d;
            if (j13 == C.TIME_UNSET || cVar.f17772n == C.TIME_UNSET) {
                long j14 = fVar.f17801c;
                j11 = j14 != C.TIME_UNSET ? j14 : cVar.f17771m * 3;
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    private void K(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j10) {
        boolean z10;
        y0.g gVar = this.f17680s.f18984d;
        if (gVar.f19064d == -3.4028235E38f && gVar.f19065e == -3.4028235E38f) {
            com.google.android.exoplayer2.source.hls.playlist.c.f fVar = cVar.f17780v;
            if (fVar.f17801c == C.TIME_UNSET && fVar.f17802d == C.TIME_UNSET) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f17682u = new y0.g.a().k(r0.i1(j10)).j(z10 ? 1.0f : this.f17682u.f19064d).h(z10 ? 1.0f : this.f17682u.f19065e).f();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void A(a0 a0Var) {
        this.f17683v = a0Var;
        this.f17673l.e((Looper) ob.a.e(Looper.myLooper()), y());
        this.f17673l.a();
        this.f17678q.l(this.f17670i.f19079a, v(null), this);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void C() {
        this.f17678q.stop();
        this.f17673l.release();
    }

    @Override // com.google.android.exoplayer2.source.p
    public y0 a() {
        return this.f17680s;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.c
    public void g(com.google.android.exoplayer2.source.hls.playlist.c cVar) {
        long jI1 = cVar.f17774p ? r0.i1(cVar.f17766h) : -9223372036854775807L;
        int i10 = cVar.f17762d;
        long j10 = (i10 == 2 || i10 == 1) ? jI1 : -9223372036854775807L;
        com.google.android.exoplayer2.source.hls.a aVar = new com.google.android.exoplayer2.source.hls.a((com.google.android.exoplayer2.source.hls.playlist.d) ob.a.e(this.f17678q.d()), cVar);
        B(this.f17678q.j() ? D(cVar, j10, jI1, aVar) : E(cVar, j10, jI1, aVar));
    }

    @Override // com.google.android.exoplayer2.source.p
    public void l(o oVar) {
        ((wa.k) oVar).r();
    }

    @Override // com.google.android.exoplayer2.source.p
    public void maybeThrowSourceInfoRefreshError() {
        this.f17678q.m();
    }

    @Override // com.google.android.exoplayer2.source.p
    public o o(p.b bVar, nb.b bVar2, long j10) {
        q.a aVarV = v(bVar);
        return new wa.k(this.f17669h, this.f17678q, this.f17671j, this.f17683v, null, this.f17673l, t(bVar), this.f17674m, aVarV, bVar2, this.f17672k, this.f17675n, this.f17676o, this.f17677p, y(), this.f17681t);
    }

    private HlsMediaSource(y0 y0Var, g gVar, h hVar, d dVar, nb.f fVar, j jVar, c cVar, HlsPlaylistTracker hlsPlaylistTracker, long j10, boolean z10, int i10, boolean z11, long j11) {
        this.f17670i = (y0.h) ob.a.e(y0Var.f18982b);
        this.f17680s = y0Var;
        this.f17682u = y0Var.f18984d;
        this.f17671j = gVar;
        this.f17669h = hVar;
        this.f17672k = dVar;
        this.f17673l = jVar;
        this.f17674m = cVar;
        this.f17678q = hlsPlaylistTracker;
        this.f17679r = j10;
        this.f17675n = z10;
        this.f17676o = i10;
        this.f17677p = z11;
        this.f17681t = j11;
    }
}
