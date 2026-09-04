package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.drm.g;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.y0;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import nb.a0;
import nb.j;
import nb.v;
import o9.n;
import ob.r0;
import qd.qPi.SVWsZyNSAChGIA;
import ra.d;
import ra.f;
import ra.i;
import ra.t;
import t9.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class SsMediaSource extends com.google.android.exoplayer2.source.a implements Loader.b {
    private Handler A;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f18148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Uri f18149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final y0.h f18150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final y0 f18151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final j.a f18152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b.a f18153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d f18154n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.j f18155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.c f18156p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final long f18157q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final q.a f18158r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.d.a f18159s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayList f18160t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private j f18161u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Loader f18162v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private v f18163w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private a0 f18164x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f18165y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.google.android.exoplayer2.source.smoothstreaming.manifest.a f18166z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Factory implements r {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int f18167j = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b.a f18168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final j.a f18169d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f18170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private k f18171f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.c f18172g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f18173h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.d.a f18174i;

        public Factory(j.a aVar) {
            this(new com.google.android.exoplayer2.source.smoothstreaming.a.C0290a(aVar), aVar);
        }

        @Override // com.google.android.exoplayer2.source.p.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SsMediaSource a(y0 y0Var) {
            ob.a.e(y0Var.f18982b);
            com.google.android.exoplayer2.upstream.d.a ssManifestParser = this.f18174i;
            if (ssManifestParser == null) {
                ssManifestParser = new SsManifestParser();
            }
            List list = y0Var.f18982b.f19083e;
            return new SsMediaSource(y0Var, null, this.f18169d, !list.isEmpty() ? new qa.b(ssManifestParser, list) : ssManifestParser, this.f18168c, this.f18170e, null, this.f18171f.a(y0Var), this.f18172g, this.f18173h);
        }

        @Override // com.google.android.exoplayer2.source.p.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Factory c(k kVar) {
            this.f18171f = (k) ob.a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory b(com.google.android.exoplayer2.upstream.c cVar) {
            this.f18172g = (com.google.android.exoplayer2.upstream.c) ob.a.f(cVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory(b.a aVar, j.a aVar2) {
            this.f18168c = (b.a) ob.a.e(aVar);
            this.f18169d = aVar2;
            this.f18171f = new g();
            this.f18172g = new com.google.android.exoplayer2.upstream.b();
            this.f18173h = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
            this.f18170e = new f();
        }
    }

    private void H() {
        t tVar;
        for (int i10 = 0; i10 < this.f18160t.size(); i10++) {
            ((c) this.f18160t.get(i10)).l(this.f18166z);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar : this.f18166z.f18237f) {
            if (bVar.f18253k > 0) {
                jMax2 = Math.min(jMax2, bVar.e(0));
                jMax = Math.max(jMax, bVar.e(bVar.f18253k - 1) + bVar.c(bVar.f18253k - 1));
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j10 = this.f18166z.f18235d ? -9223372036854775807L : 0L;
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar = this.f18166z;
            boolean z10 = aVar.f18235d;
            tVar = new t(j10, 0L, 0L, 0L, true, z10, z10, aVar, this.f18151k);
        } else {
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar2 = this.f18166z;
            if (aVar2.f18235d) {
                long j11 = aVar2.f18239h;
                if (j11 != C.TIME_UNSET && j11 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j11);
                }
                long j12 = jMax2;
                long j13 = jMax - j12;
                long jH0 = j13 - r0.H0(this.f18157q);
                if (jH0 < 5000000) {
                    jH0 = Math.min(5000000L, j13 / 2);
                }
                tVar = new t(C.TIME_UNSET, j13, j12, jH0, true, true, true, this.f18166z, this.f18151k);
            } else {
                long j14 = aVar2.f18238g;
                if (j14 == C.TIME_UNSET) {
                    j14 = jMax - jMax2;
                }
                long j15 = j14;
                tVar = new t(jMax2 + j15, j15, jMax2, 0L, true, false, false, this.f18166z, this.f18151k);
            }
        }
        B(tVar);
    }

    private void I() {
        if (this.f18166z.f18235d) {
            this.A.postDelayed(new Runnable() { // from class: ab.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f237a.J();
                }
            }, Math.max(0L, (this.f18165y + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.f18162v.h()) {
            return;
        }
        com.google.android.exoplayer2.upstream.d dVar = new com.google.android.exoplayer2.upstream.d(this.f18161u, this.f18149i, 4, this.f18159s);
        this.f18158r.s(new i(dVar.f18811a, dVar.f18812b, this.f18162v.m(dVar, this, this.f18156p.a(dVar.f18813c))), dVar.f18813c);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void A(a0 a0Var) {
        this.f18164x = a0Var;
        this.f18155o.e(Looper.myLooper(), y());
        this.f18155o.a();
        if (this.f18148h) {
            this.f18163w = new v.a();
            H();
            return;
        }
        this.f18161u = this.f18152l.createDataSource();
        Loader loader = new Loader("SsMediaSource");
        this.f18162v = loader;
        this.f18163w = loader;
        this.A = r0.w();
        J();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void C() {
        this.f18166z = this.f18148h ? this.f18166z : null;
        this.f18161u = null;
        this.f18165y = 0L;
        Loader loader = this.f18162v;
        if (loader != null) {
            loader.k();
            this.f18162v = null;
        }
        Handler handler = this.A;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.A = null;
        }
        this.f18155o.release();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void e(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11, boolean z10) {
        i iVar = new i(dVar.f18811a, dVar.f18812b, dVar.d(), dVar.b(), j10, j11, dVar.a());
        this.f18156p.b(dVar.f18811a);
        this.f18158r.j(iVar, dVar.f18813c);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void i(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11) {
        i iVar = new i(dVar.f18811a, dVar.f18812b, dVar.d(), dVar.b(), j10, j11, dVar.a());
        this.f18156p.b(dVar.f18811a);
        this.f18158r.m(iVar, dVar.f18813c);
        this.f18166z = (com.google.android.exoplayer2.source.smoothstreaming.manifest.a) dVar.c();
        this.f18165y = j10 - j11;
        H();
        I();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Loader.c n(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11, IOException iOException, int i10) {
        i iVar = new i(dVar.f18811a, dVar.f18812b, dVar.d(), dVar.b(), j10, j11, dVar.a());
        long jC = this.f18156p.c(new com.google.android.exoplayer2.upstream.c.C0294c(iVar, new ra.j(dVar.f18813c), iOException, i10));
        Loader.c cVarG = jC == C.TIME_UNSET ? Loader.f18746g : Loader.g(false, jC);
        boolean zC = cVarG.c();
        this.f18158r.q(iVar, dVar.f18813c, iOException, !zC);
        if (!zC) {
            this.f18156p.b(dVar.f18811a);
        }
        return cVarG;
    }

    @Override // com.google.android.exoplayer2.source.p
    public y0 a() {
        return this.f18151k;
    }

    @Override // com.google.android.exoplayer2.source.p
    public void l(o oVar) {
        ((c) oVar).k();
        this.f18160t.remove(oVar);
    }

    @Override // com.google.android.exoplayer2.source.p
    public void maybeThrowSourceInfoRefreshError() {
        this.f18163w.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.source.p
    public o o(p.b bVar, nb.b bVar2, long j10) {
        q.a aVarV = v(bVar);
        c cVar = new c(this.f18166z, this.f18153m, this.f18164x, this.f18154n, null, this.f18155o, t(bVar), this.f18156p, aVarV, this.f18163w, bVar2);
        this.f18160t.add(cVar);
        return cVar;
    }

    static {
        n.a(SVWsZyNSAChGIA.hMzjzmiP);
    }

    private SsMediaSource(y0 y0Var, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, j.a aVar2, com.google.android.exoplayer2.upstream.d.a aVar3, b.a aVar4, d dVar, nb.f fVar, com.google.android.exoplayer2.drm.j jVar, com.google.android.exoplayer2.upstream.c cVar, long j10) {
        ob.a.g(aVar == null || !aVar.f18235d);
        this.f18151k = y0Var;
        y0.h hVar = (y0.h) ob.a.e(y0Var.f18982b);
        this.f18150j = hVar;
        this.f18166z = aVar;
        this.f18149i = hVar.f19079a.equals(Uri.EMPTY) ? null : r0.C(hVar.f19079a);
        this.f18152l = aVar2;
        this.f18159s = aVar3;
        this.f18153m = aVar4;
        this.f18154n = dVar;
        this.f18155o = jVar;
        this.f18156p = cVar;
        this.f18157q = j10;
        this.f18158r = v(null);
        this.f18148h = aVar != null;
        this.f18160t = new ArrayList();
    }
}
