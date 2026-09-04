package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.i0;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import nb.j;
import ob.r0;
import ra.i;
import wa.g;
import xa.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements HlsPlaylistTracker, Loader.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final HlsPlaylistTracker.a f17732p = new HlsPlaylistTracker.a() { // from class: xa.b
        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.a
        public final HlsPlaylistTracker a(g gVar, com.google.android.exoplayer2.upstream.c cVar, e eVar) {
            return new com.google.android.exoplayer2.source.hls.playlist.a(gVar, cVar, eVar);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f17733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f17734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.c f17735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f17736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList f17737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f17738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q.a f17739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Loader f17740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f17741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private HlsPlaylistTracker.c f17742j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d f17743k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Uri f17744l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.android.exoplayer2.source.hls.playlist.c f17745m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f17746n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f17747o;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b implements HlsPlaylistTracker.b {
        private b() {
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
        public void a() {
            a.this.f17737e.remove(this);
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
        public boolean c(Uri uri, com.google.android.exoplayer2.upstream.c.C0294c c0294c, boolean z10) {
            c cVar;
            if (a.this.f17745m == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                List list = ((d) r0.j(a.this.f17743k)).f17806e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    c cVar2 = (c) a.this.f17736d.get(((d.b) list.get(i11)).f17819a);
                    if (cVar2 != null && jElapsedRealtime < cVar2.f17756h) {
                        i10++;
                    }
                }
                com.google.android.exoplayer2.upstream.c.b bVarD = a.this.f17735c.d(new com.google.android.exoplayer2.upstream.c.a(1, 0, a.this.f17743k.f17806e.size(), i10), c0294c);
                if (bVarD != null && bVarD.f18805a == 2 && (cVar = (c) a.this.f17736d.get(uri)) != null) {
                    cVar.j(bVarD.f18806b);
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class c implements Loader.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f17749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Loader f17750b = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final j f17751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.android.exoplayer2.source.hls.playlist.c f17752d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f17753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f17754f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f17755g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f17756h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f17757i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private IOException f17758j;

        public c(Uri uri) {
            this.f17749a = uri;
            this.f17751c = a.this.f17733a.a(4);
        }

        public static /* synthetic */ void a(c cVar, Uri uri) {
            cVar.f17757i = false;
            cVar.p(uri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean j(long j10) {
            this.f17756h = SystemClock.elapsedRealtime() + j10;
            return this.f17749a.equals(a.this.f17744l) && !a.this.L();
        }

        private Uri k() {
            com.google.android.exoplayer2.source.hls.playlist.c cVar = this.f17752d;
            if (cVar != null) {
                com.google.android.exoplayer2.source.hls.playlist.c.f fVar = cVar.f17780v;
                if (fVar.f17799a != C.TIME_UNSET || fVar.f17803e) {
                    Uri.Builder builderBuildUpon = this.f17749a.buildUpon();
                    com.google.android.exoplayer2.source.hls.playlist.c cVar2 = this.f17752d;
                    if (cVar2.f17780v.f17803e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar2.f17769k + ((long) cVar2.f17776r.size())));
                        com.google.android.exoplayer2.source.hls.playlist.c cVar3 = this.f17752d;
                        if (cVar3.f17772n != C.TIME_UNSET) {
                            List list = cVar3.f17777s;
                            int size = list.size();
                            if (!list.isEmpty() && ((com.google.android.exoplayer2.source.hls.playlist.c.b) i0.d(list)).f17782m) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    com.google.android.exoplayer2.source.hls.playlist.c.f fVar2 = this.f17752d.f17780v;
                    if (fVar2.f17799a != C.TIME_UNSET) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", fVar2.f17800b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return this.f17749a;
        }

        private void p(Uri uri) {
            com.google.android.exoplayer2.upstream.d dVar = new com.google.android.exoplayer2.upstream.d(this.f17751c, uri, 4, a.this.f17734b.b(a.this.f17743k, this.f17752d));
            a.this.f17739g.s(new i(dVar.f18811a, dVar.f18812b, this.f17750b.m(dVar, this, a.this.f17735c.a(dVar.f18813c))), dVar.f18813c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(final Uri uri) {
            this.f17756h = 0L;
            if (this.f17757i || this.f17750b.i() || this.f17750b.h()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.f17755g) {
                p(uri);
            } else {
                this.f17757i = true;
                a.this.f17741i.postDelayed(new Runnable() { // from class: com.google.android.exoplayer2.source.hls.playlist.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.c.a(this.f17760a, uri);
                    }
                }, this.f17755g - jElapsedRealtime);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v(com.google.android.exoplayer2.source.hls.playlist.c cVar, i iVar) {
            boolean z10;
            long j10;
            com.google.android.exoplayer2.source.hls.playlist.c cVar2 = this.f17752d;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f17753e = jElapsedRealtime;
            com.google.android.exoplayer2.source.hls.playlist.c cVarG = a.this.G(cVar2, cVar);
            this.f17752d = cVarG;
            IOException playlistStuckException = null;
            if (cVarG != cVar2) {
                this.f17758j = null;
                this.f17754f = jElapsedRealtime;
                a.this.R(this.f17749a, cVarG);
            } else if (!cVarG.f17773o) {
                long size = cVar.f17769k + ((long) cVar.f17776r.size());
                com.google.android.exoplayer2.source.hls.playlist.c cVar3 = this.f17752d;
                if (size < cVar3.f17769k) {
                    playlistStuckException = new HlsPlaylistTracker.PlaylistResetException(this.f17749a);
                    z10 = true;
                } else {
                    z10 = false;
                    if (jElapsedRealtime - this.f17754f > r0.i1(cVar3.f17771m) * a.this.f17738f) {
                        playlistStuckException = new HlsPlaylistTracker.PlaylistStuckException(this.f17749a);
                    }
                }
                if (playlistStuckException != null) {
                    this.f17758j = playlistStuckException;
                    a.this.N(this.f17749a, new com.google.android.exoplayer2.upstream.c.C0294c(iVar, new ra.j(4), playlistStuckException, 1), z10);
                }
            }
            com.google.android.exoplayer2.source.hls.playlist.c cVar4 = this.f17752d;
            if (cVar4.f17780v.f17803e) {
                j10 = 0;
            } else {
                j10 = cVar4 != cVar2 ? cVar4.f17771m : cVar4.f17771m / 2;
            }
            this.f17755g = jElapsedRealtime + r0.i1(j10);
            if ((this.f17752d.f17772n != C.TIME_UNSET || this.f17749a.equals(a.this.f17744l)) && !this.f17752d.f17773o) {
                q(k());
            }
        }

        public com.google.android.exoplayer2.source.hls.playlist.c l() {
            return this.f17752d;
        }

        public boolean m() {
            int i10;
            if (this.f17752d == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, r0.i1(this.f17752d.f17779u));
            com.google.android.exoplayer2.source.hls.playlist.c cVar = this.f17752d;
            return cVar.f17773o || (i10 = cVar.f17762d) == 2 || i10 == 1 || this.f17753e + jMax > jElapsedRealtime;
        }

        public void o() {
            q(this.f17749a);
        }

        public void r() throws IOException {
            this.f17750b.maybeThrowError();
            IOException iOException = this.f17758j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void e(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11, boolean z10) {
            i iVar = new i(dVar.f18811a, dVar.f18812b, dVar.d(), dVar.b(), j10, j11, dVar.a());
            a.this.f17735c.b(dVar.f18811a);
            a.this.f17739g.j(iVar, 4);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void i(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11) {
            xa.d dVar2 = (xa.d) dVar.c();
            i iVar = new i(dVar.f18811a, dVar.f18812b, dVar.d(), dVar.b(), j10, j11, dVar.a());
            if (dVar2 instanceof com.google.android.exoplayer2.source.hls.playlist.c) {
                v((com.google.android.exoplayer2.source.hls.playlist.c) dVar2, iVar);
                a.this.f17739g.m(iVar, 4);
            } else {
                this.f17758j = ParserException.c("Loaded playlist has unexpected type.", null);
                a.this.f17739g.q(iVar, 4, this.f17758j, true);
            }
            a.this.f17735c.b(dVar.f18811a);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public Loader.c n(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11, IOException iOException, int i10) {
            Loader.c cVarG;
            i iVar = new i(dVar.f18811a, dVar.f18812b, dVar.d(), dVar.b(), j10, j11, dVar.a());
            boolean z10 = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
            if ((dVar.d().getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).f18739d : Integer.MAX_VALUE;
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f17755g = SystemClock.elapsedRealtime();
                    o();
                    ((q.a) r0.j(a.this.f17739g)).q(iVar, dVar.f18813c, iOException, true);
                    return Loader.f18745f;
                }
            }
            com.google.android.exoplayer2.upstream.c.C0294c c0294c = new com.google.android.exoplayer2.upstream.c.C0294c(iVar, new ra.j(dVar.f18813c), iOException, i10);
            if (a.this.N(this.f17749a, c0294c, false)) {
                long jC = a.this.f17735c.c(c0294c);
                cVarG = jC != C.TIME_UNSET ? Loader.g(false, jC) : Loader.f18746g;
            } else {
                cVarG = Loader.f18745f;
            }
            boolean zC = cVarG.c();
            a.this.f17739g.q(iVar, dVar.f18813c, iOException, !zC);
            if (!zC) {
                a.this.f17735c.b(dVar.f18811a);
            }
            return cVarG;
        }

        public void w() {
            this.f17750b.k();
        }
    }

    public a(g gVar, com.google.android.exoplayer2.upstream.c cVar, e eVar) {
        this(gVar, cVar, eVar, 3.5d);
    }

    private void E(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list.get(i10);
            this.f17736d.put(uri, new c(uri));
        }
    }

    private static com.google.android.exoplayer2.source.hls.playlist.c.d F(com.google.android.exoplayer2.source.hls.playlist.c cVar, com.google.android.exoplayer2.source.hls.playlist.c cVar2) {
        int i10 = (int) (cVar2.f17769k - cVar.f17769k);
        List list = cVar.f17776r;
        if (i10 < list.size()) {
            return (com.google.android.exoplayer2.source.hls.playlist.c.d) list.get(i10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.exoplayer2.source.hls.playlist.c G(com.google.android.exoplayer2.source.hls.playlist.c cVar, com.google.android.exoplayer2.source.hls.playlist.c cVar2) {
        if (cVar2.e(cVar)) {
            return cVar2.b(I(cVar, cVar2), H(cVar, cVar2));
        }
        return cVar2.f17773o ? cVar.c() : cVar;
    }

    private int H(com.google.android.exoplayer2.source.hls.playlist.c cVar, com.google.android.exoplayer2.source.hls.playlist.c cVar2) {
        com.google.android.exoplayer2.source.hls.playlist.c.d dVarF;
        if (cVar2.f17767i) {
            return cVar2.f17768j;
        }
        com.google.android.exoplayer2.source.hls.playlist.c cVar3 = this.f17745m;
        return (cVar == null || (dVarF = F(cVar, cVar2)) == null) ? cVar3 != null ? cVar3.f17768j : 0 : (cVar.f17768j + dVarF.f17791d) - ((com.google.android.exoplayer2.source.hls.playlist.c.d) cVar2.f17776r.get(0)).f17791d;
    }

    private long I(com.google.android.exoplayer2.source.hls.playlist.c cVar, com.google.android.exoplayer2.source.hls.playlist.c cVar2) {
        if (cVar2.f17774p) {
            return cVar2.f17766h;
        }
        com.google.android.exoplayer2.source.hls.playlist.c cVar3 = this.f17745m;
        long j10 = cVar3 != null ? cVar3.f17766h : 0L;
        if (cVar != null) {
            int size = cVar.f17776r.size();
            com.google.android.exoplayer2.source.hls.playlist.c.d dVarF = F(cVar, cVar2);
            if (dVarF != null) {
                return cVar.f17766h + dVarF.f17792e;
            }
            if (size == cVar2.f17769k - cVar.f17769k) {
                return cVar.d();
            }
        }
        return j10;
    }

    private Uri J(Uri uri) {
        com.google.android.exoplayer2.source.hls.playlist.c.C0287c c0287c;
        com.google.android.exoplayer2.source.hls.playlist.c cVar = this.f17745m;
        if (cVar == null || !cVar.f17780v.f17803e || (c0287c = (com.google.android.exoplayer2.source.hls.playlist.c.C0287c) cVar.f17778t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c0287c.f17784b));
        int i10 = c0287c.f17785c;
        if (i10 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return builderBuildUpon.build();
    }

    private boolean K(Uri uri) {
        List list = this.f17743k.f17806e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(((d.b) list.get(i10)).f17819a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L() {
        List list = this.f17743k.f17806e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) ob.a.e((c) this.f17736d.get(((d.b) list.get(i10)).f17819a));
            if (jElapsedRealtime > cVar.f17756h) {
                Uri uri = cVar.f17749a;
                this.f17744l = uri;
                cVar.q(J(uri));
                return true;
            }
        }
        return false;
    }

    private void M(Uri uri) {
        if (uri.equals(this.f17744l) || !K(uri)) {
            return;
        }
        com.google.android.exoplayer2.source.hls.playlist.c cVar = this.f17745m;
        if (cVar == null || !cVar.f17773o) {
            this.f17744l = uri;
            c cVar2 = (c) this.f17736d.get(uri);
            com.google.android.exoplayer2.source.hls.playlist.c cVar3 = cVar2.f17752d;
            if (cVar3 == null || !cVar3.f17773o) {
                cVar2.q(J(uri));
            } else {
                this.f17745m = cVar3;
                this.f17742j.g(cVar3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N(Uri uri, com.google.android.exoplayer2.upstream.c.C0294c c0294c, boolean z10) {
        Iterator it = this.f17737e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((HlsPlaylistTracker.b) it.next()).c(uri, c0294c, z10);
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(Uri uri, com.google.android.exoplayer2.source.hls.playlist.c cVar) {
        if (uri.equals(this.f17744l)) {
            if (this.f17745m == null) {
                this.f17746n = !cVar.f17773o;
                this.f17747o = cVar.f17766h;
            }
            this.f17745m = cVar;
            this.f17742j.g(cVar);
        }
        Iterator it = this.f17737e.iterator();
        while (it.hasNext()) {
            ((HlsPlaylistTracker.b) it.next()).a();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void e(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11, boolean z10) {
        i iVar = new i(dVar.f18811a, dVar.f18812b, dVar.d(), dVar.b(), j10, j11, dVar.a());
        this.f17735c.b(dVar.f18811a);
        this.f17739g.j(iVar, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void i(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11) {
        xa.d dVar2 = (xa.d) dVar.c();
        boolean z10 = dVar2 instanceof com.google.android.exoplayer2.source.hls.playlist.c;
        d dVarD = z10 ? d.d(dVar2.f56810a) : (d) dVar2;
        this.f17743k = dVarD;
        this.f17744l = ((d.b) dVarD.f17806e.get(0)).f17819a;
        this.f17737e.add(new b());
        E(dVarD.f17805d);
        i iVar = new i(dVar.f18811a, dVar.f18812b, dVar.d(), dVar.b(), j10, j11, dVar.a());
        c cVar = (c) this.f17736d.get(this.f17744l);
        if (z10) {
            cVar.v((com.google.android.exoplayer2.source.hls.playlist.c) dVar2, iVar);
        } else {
            cVar.o();
        }
        this.f17735c.b(dVar.f18811a);
        this.f17739g.m(iVar, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public Loader.c n(com.google.android.exoplayer2.upstream.d dVar, long j10, long j11, IOException iOException, int i10) {
        i iVar = new i(dVar.f18811a, dVar.f18812b, dVar.d(), dVar.b(), j10, j11, dVar.a());
        long jC = this.f17735c.c(new com.google.android.exoplayer2.upstream.c.C0294c(iVar, new ra.j(dVar.f18813c), iOException, i10));
        boolean z10 = jC == C.TIME_UNSET;
        this.f17739g.q(iVar, dVar.f18813c, iOException, z10);
        if (z10) {
            this.f17735c.b(dVar.f18811a);
        }
        return z10 ? Loader.f18746g : Loader.g(false, jC);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void a(HlsPlaylistTracker.b bVar) {
        this.f17737e.remove(bVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void b(Uri uri) throws IOException {
        ((c) this.f17736d.get(uri)).r();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public long c() {
        return this.f17747o;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public d d() {
        return this.f17743k;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void f(Uri uri) {
        ((c) this.f17736d.get(uri)).o();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void g(HlsPlaylistTracker.b bVar) {
        ob.a.e(bVar);
        this.f17737e.add(bVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean h(Uri uri) {
        return ((c) this.f17736d.get(uri)).m();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean j() {
        return this.f17746n;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean k(Uri uri, long j10) {
        c cVar = (c) this.f17736d.get(uri);
        if (cVar != null) {
            return !cVar.j(j10);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void l(Uri uri, q.a aVar, HlsPlaylistTracker.c cVar) {
        this.f17741i = r0.w();
        this.f17739g = aVar;
        this.f17742j = cVar;
        com.google.android.exoplayer2.upstream.d dVar = new com.google.android.exoplayer2.upstream.d(this.f17733a.a(4), uri, 4, this.f17734b.a());
        ob.a.g(this.f17740h == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f17740h = loader;
        aVar.s(new i(dVar.f18811a, dVar.f18812b, loader.m(dVar, this, this.f17735c.a(dVar.f18813c))), dVar.f18813c);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void m() throws IOException {
        Loader loader = this.f17740h;
        if (loader != null) {
            loader.maybeThrowError();
        }
        Uri uri = this.f17744l;
        if (uri != null) {
            b(uri);
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public com.google.android.exoplayer2.source.hls.playlist.c o(Uri uri, boolean z10) {
        com.google.android.exoplayer2.source.hls.playlist.c cVarL = ((c) this.f17736d.get(uri)).l();
        if (cVarL != null && z10) {
            M(uri);
        }
        return cVarL;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void stop() {
        this.f17744l = null;
        this.f17745m = null;
        this.f17743k = null;
        this.f17747o = C.TIME_UNSET;
        this.f17740h.k();
        this.f17740h = null;
        Iterator it = this.f17736d.values().iterator();
        while (it.hasNext()) {
            ((c) it.next()).w();
        }
        this.f17741i.removeCallbacksAndMessages(null);
        this.f17741i = null;
        this.f17736d.clear();
    }

    public a(g gVar, com.google.android.exoplayer2.upstream.c cVar, e eVar, double d10) {
        this.f17733a = gVar;
        this.f17734b = eVar;
        this.f17735c = cVar;
        this.f17738f = d10;
        this.f17737e = new CopyOnWriteArrayList();
        this.f17736d = new HashMap();
        this.f17747o = C.TIME_UNSET;
    }
}
