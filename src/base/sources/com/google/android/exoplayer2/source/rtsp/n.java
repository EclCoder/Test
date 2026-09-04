package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import o9.j0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class n implements com.google.android.exoplayer2.source.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nb.b f18042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f18043b = r0.w();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f18044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f18045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f18046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f18047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f18048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.rtsp.b.a f18049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.exoplayer2.source.o.a f18050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.common.collect.c0 f18051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private IOException f18052k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RtspMediaSource.RtspPlaybackException f18053l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f18054m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f18055n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f18056o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f18057p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f18058q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f18059r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f18060s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f18061t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f18062u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f18063v;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface c {
        void a();

        void b(z zVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f18065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.exoplayer2.source.rtsp.d f18066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f18067c;

        public d(r rVar, int i10, com.google.android.exoplayer2.source.rtsp.b.a aVar) {
            this.f18065a = rVar;
            this.f18066b = new com.google.android.exoplayer2.source.rtsp.d(i10, rVar, new com.google.android.exoplayer2.source.rtsp.d.a() { // from class: com.google.android.exoplayer2.source.rtsp.q
                @Override // com.google.android.exoplayer2.source.rtsp.d.a
                public final void a(String str, b bVar) {
                    n.d.a(this.f18079a, str, bVar);
                }
            }, n.this.f18044c, aVar);
        }

        public static /* synthetic */ void a(d dVar, String str, com.google.android.exoplayer2.source.rtsp.b bVar) {
            dVar.f18067c = str;
            s.b bVarG = bVar.g();
            if (bVarG != null) {
                n.this.f18045d.g1(bVar.c(), bVarG);
                n.this.f18063v = true;
            }
            n.this.K();
        }

        public Uri c() {
            return this.f18066b.f17956b.f18081b;
        }

        public String d() {
            ob.a.i(this.f18067c);
            return this.f18067c;
        }

        public boolean e() {
            return this.f18067c != null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f18069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Loader f18070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.android.exoplayer2.source.c0 f18071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f18072d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f18073e;

        public e(r rVar, int i10, com.google.android.exoplayer2.source.rtsp.b.a aVar) {
            this.f18069a = n.this.new d(rVar, i10, aVar);
            this.f18070b = new Loader("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper " + i10);
            com.google.android.exoplayer2.source.c0 c0VarL = com.google.android.exoplayer2.source.c0.l(n.this.f18042a);
            this.f18071c = c0VarL;
            c0VarL.c0(n.this.f18044c);
        }

        public void c() {
            if (this.f18072d) {
                return;
            }
            this.f18069a.f18066b.cancelLoad();
            this.f18072d = true;
            n.this.R();
        }

        public long d() {
            return this.f18071c.z();
        }

        public boolean e() {
            return this.f18071c.K(this.f18072d);
        }

        public int f(o9.p pVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            return this.f18071c.R(pVar, decoderInputBuffer, i10, this.f18072d);
        }

        public void g() {
            if (this.f18073e) {
                return;
            }
            this.f18070b.k();
            this.f18071c.S();
            this.f18073e = true;
        }

        public void h() {
            ob.a.g(this.f18072d);
            this.f18072d = false;
            n.this.R();
            k();
        }

        public void i(long j10) {
            if (this.f18072d) {
                return;
            }
            this.f18069a.f18066b.b();
            this.f18071c.U();
            this.f18071c.a0(j10);
        }

        public int j(long j10) throws Throwable {
            int iE = this.f18071c.E(j10, this.f18072d);
            this.f18071c.d0(iE);
            return iE;
        }

        public void k() {
            this.f18070b.m(this.f18069a.f18066b, n.this.f18044c, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class f implements ra.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f18075a;

        public f(int i10) {
            this.f18075a = i10;
        }

        @Override // ra.s
        public int a(o9.p pVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            return n.this.L(this.f18075a, pVar, decoderInputBuffer, i10);
        }

        @Override // ra.s
        public boolean isReady() {
            return n.this.H(this.f18075a);
        }

        @Override // ra.s
        public void maybeThrowError() throws RtspMediaSource.RtspPlaybackException {
            if (n.this.f18053l != null) {
                throw n.this.f18053l;
            }
        }

        @Override // ra.s
        public int skipData(long j10) {
            return n.this.P(this.f18075a, j10);
        }
    }

    public n(nb.b bVar, com.google.android.exoplayer2.source.rtsp.b.a aVar, Uri uri, c cVar, String str, SocketFactory socketFactory, boolean z10) {
        this.f18042a = bVar;
        this.f18049h = aVar;
        this.f18048g = cVar;
        b bVar2 = new b();
        this.f18044c = bVar2;
        this.f18045d = new j(bVar2, bVar2, str, uri, socketFactory, z10);
        this.f18046e = new ArrayList();
        this.f18047f = new ArrayList();
        this.f18055n = C.TIME_UNSET;
        this.f18054m = C.TIME_UNSET;
        this.f18056o = C.TIME_UNSET;
    }

    private static com.google.common.collect.c0 F(com.google.common.collect.c0 c0Var) {
        com.google.common.collect.c0.a aVar = new com.google.common.collect.c0.a();
        for (int i10 = 0; i10 < c0Var.size(); i10++) {
            aVar.a(new ra.v(Integer.toString(i10), (v0) ob.a.e(((e) c0Var.get(i10)).f18071c.F())));
        }
        return aVar.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.exoplayer2.source.rtsp.d G(Uri uri) {
        for (int i10 = 0; i10 < this.f18046e.size(); i10++) {
            if (!((e) this.f18046e.get(i10)).f18072d) {
                d dVar = ((e) this.f18046e.get(i10)).f18069a;
                if (dVar.c().equals(uri)) {
                    return dVar.f18066b;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean I() {
        return this.f18055n != C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.f18059r || this.f18060s) {
            return;
        }
        for (int i10 = 0; i10 < this.f18046e.size(); i10++) {
            if (((e) this.f18046e.get(i10)).f18071c.F() == null) {
                return;
            }
        }
        this.f18060s = true;
        this.f18051j = F(com.google.common.collect.c0.x(this.f18046e));
        ((com.google.android.exoplayer2.source.o.a) ob.a.e(this.f18050i)).g(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        boolean zE = true;
        for (int i10 = 0; i10 < this.f18047f.size(); i10++) {
            zE &= ((d) this.f18047f.get(i10)).e();
        }
        if (zE && this.f18061t) {
            this.f18045d.k1(this.f18047f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        this.f18063v = true;
        this.f18045d.h1();
        com.google.android.exoplayer2.source.rtsp.b.a aVarB = this.f18049h.b();
        if (aVarB == null) {
            this.f18053l = new RtspMediaSource.RtspPlaybackException("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.f18046e.size());
        ArrayList arrayList2 = new ArrayList(this.f18047f.size());
        for (int i10 = 0; i10 < this.f18046e.size(); i10++) {
            e eVar = (e) this.f18046e.get(i10);
            if (eVar.f18072d) {
                arrayList.add(eVar);
            } else {
                e eVar2 = new e(eVar.f18069a.f18065a, i10, aVarB);
                arrayList.add(eVar2);
                eVar2.k();
                if (this.f18047f.contains(eVar.f18069a)) {
                    arrayList2.add(eVar2.f18069a);
                }
            }
        }
        com.google.common.collect.c0 c0VarX = com.google.common.collect.c0.x(this.f18046e);
        this.f18046e.clear();
        this.f18046e.addAll(arrayList);
        this.f18047f.clear();
        this.f18047f.addAll(arrayList2);
        for (int i11 = 0; i11 < c0VarX.size(); i11++) {
            ((e) c0VarX.get(i11)).c();
        }
    }

    private boolean O(long j10) {
        for (int i10 = 0; i10 < this.f18046e.size(); i10++) {
            if (!((e) this.f18046e.get(i10)).f18071c.Y(j10, false)) {
                return false;
            }
        }
        return true;
    }

    private boolean Q() {
        return this.f18058q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        this.f18057p = true;
        for (int i10 = 0; i10 < this.f18046e.size(); i10++) {
            this.f18057p &= ((e) this.f18046e.get(i10)).f18072d;
        }
    }

    static /* synthetic */ int c(n nVar) {
        int i10 = nVar.f18062u;
        nVar.f18062u = i10 + 1;
        return i10;
    }

    boolean H(int i10) {
        return !Q() && ((e) this.f18046e.get(i10)).e();
    }

    int L(int i10, o9.p pVar, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (Q()) {
            return -3;
        }
        return ((e) this.f18046e.get(i10)).f(pVar, decoderInputBuffer, i11);
    }

    public void M() {
        for (int i10 = 0; i10 < this.f18046e.size(); i10++) {
            ((e) this.f18046e.get(i10)).g();
        }
        r0.n(this.f18045d);
        this.f18059r = true;
    }

    int P(int i10, long j10) {
        if (Q()) {
            return -3;
        }
        return ((e) this.f18046e.get(i10)).j(j10);
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean continueLoading(long j10) {
        return isLoading();
    }

    @Override // com.google.android.exoplayer2.source.o
    public void d(com.google.android.exoplayer2.source.o.a aVar, long j10) {
        this.f18050i = aVar;
        try {
            this.f18045d.m1();
        } catch (IOException e10) {
            this.f18052k = e10;
            r0.n(this.f18045d);
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public void discardBuffer(long j10, boolean z10) {
        if (I()) {
            return;
        }
        for (int i10 = 0; i10 < this.f18046e.size(); i10++) {
            e eVar = (e) this.f18046e.get(i10);
            if (!eVar.f18072d) {
                eVar.f18071c.q(j10, z10, true);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public long f(lb.r[] rVarArr, boolean[] zArr, ra.s[] sVarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            if (sVarArr[i10] != null && (rVarArr[i10] == null || !zArr[i10])) {
                sVarArr[i10] = null;
            }
        }
        this.f18047f.clear();
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            lb.r rVar = rVarArr[i11];
            if (rVar != null) {
                ra.v trackGroup = rVar.getTrackGroup();
                int iIndexOf = ((com.google.common.collect.c0) ob.a.e(this.f18051j)).indexOf(trackGroup);
                this.f18047f.add(((e) ob.a.e((e) this.f18046e.get(iIndexOf))).f18069a);
                if (this.f18051j.contains(trackGroup) && sVarArr[i11] == null) {
                    sVarArr[i11] = new f(iIndexOf);
                    zArr2[i11] = true;
                }
            }
        }
        for (int i12 = 0; i12 < this.f18046e.size(); i12++) {
            e eVar = (e) this.f18046e.get(i12);
            if (!this.f18047f.contains(eVar.f18069a)) {
                eVar.c();
            }
        }
        this.f18061t = true;
        if (j10 != 0) {
            this.f18054m = j10;
            this.f18055n = j10;
            this.f18056o = j10;
        }
        K();
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getBufferedPositionUs() {
        if (this.f18057p || this.f18046e.isEmpty()) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f18054m;
        if (j10 != C.TIME_UNSET) {
            return j10;
        }
        boolean z10 = true;
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f18046e.size(); i10++) {
            e eVar = (e) this.f18046e.get(i10);
            if (!eVar.f18072d) {
                jMin = Math.min(jMin, eVar.d());
                z10 = false;
            }
        }
        if (z10 || jMin == Long.MIN_VALUE) {
            return 0L;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.o
    public ra.x getTrackGroups() {
        ob.a.g(this.f18060s);
        return new ra.x((ra.v[]) ((com.google.common.collect.c0) ob.a.e(this.f18051j)).toArray(new ra.v[0]));
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean isLoading() {
        return !this.f18057p;
    }

    @Override // com.google.android.exoplayer2.source.o
    public void maybeThrowPrepareError() throws IOException {
        IOException iOException = this.f18052k;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public long readDiscontinuity() {
        if (!this.f18058q) {
            return C.TIME_UNSET;
        }
        this.f18058q = false;
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.o
    public long seekToUs(long j10) {
        if (getBufferedPositionUs() == 0 && !this.f18063v) {
            this.f18056o = j10;
            return j10;
        }
        discardBuffer(j10, false);
        this.f18054m = j10;
        if (I()) {
            int iE1 = this.f18045d.e1();
            if (iE1 != 1) {
                if (iE1 != 2) {
                    throw new IllegalStateException();
                }
                this.f18055n = j10;
                this.f18045d.i1(j10);
                return j10;
            }
        } else if (!O(j10)) {
            this.f18055n = j10;
            if (this.f18057p) {
                for (int i10 = 0; i10 < this.f18046e.size(); i10++) {
                    ((e) this.f18046e.get(i10)).h();
                }
                if (this.f18063v) {
                    this.f18045d.n1(r0.i1(j10));
                } else {
                    this.f18045d.i1(j10);
                }
            } else {
                this.f18045d.i1(j10);
            }
            for (int i11 = 0; i11 < this.f18046e.size(); i11++) {
                ((e) this.f18046e.get(i11)).i(j10);
            }
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class b implements u9.m, Loader.b, com.google.android.exoplayer2.source.c0.d, j.f, j.e {
        private b() {
        }

        @Override // com.google.android.exoplayer2.source.c0.d
        public void a(v0 v0Var) {
            Handler handler = n.this.f18043b;
            final n nVar = n.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.p
                @Override // java.lang.Runnable
                public final void run() {
                    nVar.J();
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.rtsp.j.f
        public void b(String str, Throwable th2) {
            n.this.f18052k = th2 == null ? new IOException(str) : new IOException(str, th2);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.j.e
        public void d(RtspMediaSource.RtspPlaybackException rtspPlaybackException) {
            if (!(rtspPlaybackException instanceof RtspMediaSource.RtspUdpUnsupportedTransportException) || n.this.f18063v) {
                n.this.f18053l = rtspPlaybackException;
            } else {
                n.this.N();
            }
        }

        @Override // u9.m
        public void endTracks() {
            Handler handler = n.this.f18043b;
            final n nVar = n.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.o
                @Override // java.lang.Runnable
                public final void run() {
                    nVar.J();
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.rtsp.j.e
        public void f() {
            long jI1;
            if (n.this.f18055n != C.TIME_UNSET) {
                jI1 = r0.i1(n.this.f18055n);
            } else {
                jI1 = n.this.f18056o != C.TIME_UNSET ? r0.i1(n.this.f18056o) : 0L;
            }
            n.this.f18045d.n1(jI1);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.j.e
        public void g(long j10, com.google.common.collect.c0 c0Var) {
            ArrayList arrayList = new ArrayList(c0Var.size());
            for (int i10 = 0; i10 < c0Var.size(); i10++) {
                arrayList.add((String) ob.a.e(((b0) c0Var.get(i10)).f17927c.getPath()));
            }
            for (int i11 = 0; i11 < n.this.f18047f.size(); i11++) {
                if (!arrayList.contains(((d) n.this.f18047f.get(i11)).c().getPath())) {
                    n.this.f18048g.a();
                    if (n.this.I()) {
                        n.this.f18058q = true;
                        n.this.f18055n = C.TIME_UNSET;
                        n.this.f18054m = C.TIME_UNSET;
                        n.this.f18056o = C.TIME_UNSET;
                    }
                }
            }
            for (int i12 = 0; i12 < c0Var.size(); i12++) {
                b0 b0Var = (b0) c0Var.get(i12);
                com.google.android.exoplayer2.source.rtsp.d dVarG = n.this.G(b0Var.f17927c);
                if (dVarG != null) {
                    dVarG.e(b0Var.f17925a);
                    dVarG.d(b0Var.f17926b);
                    if (n.this.I() && n.this.f18055n == n.this.f18054m) {
                        dVarG.c(j10, b0Var.f17925a);
                    }
                }
            }
            if (!n.this.I()) {
                if (n.this.f18056o == C.TIME_UNSET || !n.this.f18063v) {
                    return;
                }
                n nVar = n.this;
                nVar.seekToUs(nVar.f18056o);
                n.this.f18056o = C.TIME_UNSET;
                return;
            }
            if (n.this.f18055n == n.this.f18054m) {
                n.this.f18055n = C.TIME_UNSET;
                n.this.f18054m = C.TIME_UNSET;
            } else {
                n.this.f18055n = C.TIME_UNSET;
                n nVar2 = n.this;
                nVar2.seekToUs(nVar2.f18054m);
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.j.f
        public void h(z zVar, com.google.common.collect.c0 c0Var) {
            for (int i10 = 0; i10 < c0Var.size(); i10++) {
                r rVar = (r) c0Var.get(i10);
                n nVar = n.this;
                e eVar = nVar.new e(rVar, i10, nVar.f18049h);
                n.this.f18046e.add(eVar);
                eVar.k();
            }
            n.this.f18048g.b(zVar);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void i(com.google.android.exoplayer2.source.rtsp.d dVar, long j10, long j11) {
            if (n.this.getBufferedPositionUs() == 0) {
                if (n.this.f18063v) {
                    return;
                }
                n.this.N();
                return;
            }
            for (int i10 = 0; i10 < n.this.f18046e.size(); i10++) {
                e eVar = (e) n.this.f18046e.get(i10);
                if (eVar.f18069a.f18066b == dVar) {
                    eVar.c();
                    break;
                }
            }
            n.this.f18045d.l1();
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Loader.c n(com.google.android.exoplayer2.source.rtsp.d dVar, long j10, long j11, IOException iOException, int i10) {
            if (!n.this.f18060s) {
                n.this.f18052k = iOException;
            } else if (!(iOException.getCause() instanceof BindException)) {
                n.this.f18053l = new RtspMediaSource.RtspPlaybackException(dVar.f17956b.f18081b.toString(), iOException);
            } else if (n.c(n.this) < 3) {
                return Loader.f18743d;
            }
            return Loader.f18745f;
        }

        @Override // u9.m
        public u9.b0 track(int i10, int i11) {
            return ((e) ob.a.e((e) n.this.f18046e.get(i10))).f18071c;
        }

        @Override // u9.m
        public void c(u9.z zVar) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void e(com.google.android.exoplayer2.source.rtsp.d dVar, long j10, long j11, boolean z10) {
        }
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public void reevaluateBuffer(long j10) {
    }

    @Override // com.google.android.exoplayer2.source.o
    public long b(long j10, j0 j0Var) {
        return j10;
    }
}
