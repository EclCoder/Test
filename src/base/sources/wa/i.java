package wa;

import android.net.Uri;
import com.google.android.exoplayer2.v0;
import com.google.common.collect.c0;
import com.google.common.collect.e0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import ob.d0;
import ob.n0;
import ob.p0;
import p9.s1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class i extends ta.n {
    private static final AtomicInteger N = new AtomicInteger();
    private final boolean A;
    private final boolean B;
    private final s1 C;
    private final long D;
    private j E;
    private p F;
    private int G;
    private boolean H;
    private volatile boolean I;
    private boolean J;
    private c0 K;
    private boolean L;
    private boolean M;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f56063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f56064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f56065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f56066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f56067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final nb.j f56068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f56069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final j f56070r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f56071s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f56072t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final n0 f56073u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final h f56074v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List f56075w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.h f56076x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ma.h f56077y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final d0 f56078z;

    private i(h hVar, nb.j jVar, com.google.android.exoplayer2.upstream.a aVar, v0 v0Var, boolean z10, nb.j jVar2, com.google.android.exoplayer2.upstream.a aVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, n0 n0Var, long j13, com.google.android.exoplayer2.drm.h hVar2, j jVar3, ma.h hVar3, d0 d0Var, boolean z15, s1 s1Var) {
        super(jVar, aVar, v0Var, i10, obj, j10, j11, j12);
        this.A = z10;
        this.f56067o = i11;
        this.M = z12;
        this.f56064l = i12;
        this.f56069q = aVar2;
        this.f56068p = jVar2;
        this.H = aVar2 != null;
        this.B = z11;
        this.f56065m = uri;
        this.f56071s = z14;
        this.f56073u = n0Var;
        this.D = j13;
        this.f56072t = z13;
        this.f56074v = hVar;
        this.f56075w = list;
        this.f56076x = hVar2;
        this.f56070r = jVar3;
        this.f56077y = hVar3;
        this.f56078z = d0Var;
        this.f56066n = z15;
        this.C = s1Var;
        this.K = c0.C();
        this.f56063k = N.getAndIncrement();
    }

    private static nb.j g(nb.j jVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return jVar;
        }
        ob.a.e(bArr2);
        return new a(jVar, bArr, bArr2);
    }

    public static i h(h hVar, nb.j jVar, v0 v0Var, long j10, com.google.android.exoplayer2.source.hls.playlist.c cVar, f.e eVar, Uri uri, List list, int i10, Object obj, boolean z10, r rVar, long j11, i iVar, byte[] bArr, byte[] bArr2, boolean z11, s1 s1Var, nb.g gVar) {
        boolean z12;
        com.google.android.exoplayer2.upstream.a aVarA;
        nb.j jVarG;
        boolean z13;
        Uri uri2;
        ma.h hVar2;
        d0 d0Var;
        j jVar2;
        com.google.android.exoplayer2.source.hls.playlist.c.e eVar2 = eVar.f56058a;
        com.google.android.exoplayer2.upstream.a aVarA2 = new com.google.android.exoplayer2.upstream.a.b().i(p0.e(cVar.f56810a, eVar2.f17788a)).h(eVar2.f17796i).g(eVar2.f17797j).b(eVar.f56061d ? 8 : 0).e(e0.q()).a();
        boolean z14 = bArr != null;
        nb.j jVarG2 = g(jVar, bArr, z14 ? j((String) ob.a.e(eVar2.f17795h)) : null);
        com.google.android.exoplayer2.source.hls.playlist.c.d dVar = eVar2.f17789b;
        if (dVar != null) {
            boolean z15 = bArr2 != null;
            byte[] bArrJ = z15 ? j((String) ob.a.e(dVar.f17795h)) : null;
            z12 = true;
            aVarA = new com.google.android.exoplayer2.upstream.a.b().i(p0.e(cVar.f56810a, dVar.f17788a)).h(dVar.f17796i).g(dVar.f17797j).e(e0.q()).a();
            z13 = z15;
            jVarG = g(jVar, bArr2, bArrJ);
        } else {
            z12 = true;
            aVarA = null;
            jVarG = null;
            z13 = false;
        }
        long j12 = j10 + eVar2.f17792e;
        long j13 = j12 + eVar2.f17790c;
        int i11 = cVar.f17768j + eVar2.f17791d;
        if (iVar != null) {
            com.google.android.exoplayer2.upstream.a aVar = iVar.f56069q;
            boolean z16 = (aVarA == aVar || (aVarA != null && aVar != null && aVarA.f18779a.equals(aVar.f18779a) && aVarA.f18785g == iVar.f56069q.f18785g)) ? z12 : false;
            uri2 = uri;
            boolean z17 = (uri2.equals(iVar.f56065m) && iVar.J) ? z12 : false;
            hVar2 = iVar.f56077y;
            d0Var = iVar.f56078z;
            jVar2 = (z16 && z17 && !iVar.L && iVar.f56064l == i11) ? iVar.E : null;
        } else {
            uri2 = uri;
            hVar2 = new ma.h();
            d0Var = new d0(10);
            jVar2 = null;
        }
        return new i(hVar, jVarG2, aVarA2, v0Var, z14, jVarG, aVarA, z13, uri2, list, i10, obj, j12, j13, eVar.f56059b, eVar.f56060c, !eVar.f56061d, i11, eVar2.f17798k, z10, rVar.a(i11), j11, eVar2.f17793f, jVar2, hVar2, d0Var, z11, s1Var);
    }

    private void i(nb.j jVar, com.google.android.exoplayer2.upstream.a aVar, boolean z10, boolean z11) {
        com.google.android.exoplayer2.upstream.a aVarE;
        long position;
        boolean z12 = false;
        if (z10) {
            z12 = this.G != 0;
            aVarE = aVar;
        } else {
            aVarE = aVar.e(this.G);
        }
        try {
            u9.e eVarS = s(jVar, aVarE, z11);
            if (z12) {
                eVarS.skipFully(this.G);
            }
            while (!this.I && this.E.a(eVarS)) {
                try {
                    try {
                    } catch (EOFException e10) {
                        if ((this.f53214d.f18861e & 16384) == 0) {
                            throw e10;
                        }
                        this.E.c();
                        position = eVarS.getPosition();
                    }
                } catch (Throwable th2) {
                    this.G = (int) (eVarS.getPosition() - aVar.f18785g);
                    throw th2;
                }
            }
            position = eVarS.getPosition();
            this.G = (int) (position - aVar.f18785g);
            nb.l.a(jVar);
        } catch (Throwable th3) {
            nb.l.a(jVar);
            throw th3;
        }
    }

    private static byte[] j(String str) {
        if (sc.c.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean n(f.e eVar, com.google.android.exoplayer2.source.hls.playlist.c cVar) {
        com.google.android.exoplayer2.source.hls.playlist.c.e eVar2 = eVar.f56058a;
        if (!(eVar2 instanceof com.google.android.exoplayer2.source.hls.playlist.c.b)) {
            return cVar.f56812c;
        }
        if (((com.google.android.exoplayer2.source.hls.playlist.c.b) eVar2).f17781l) {
            return true;
        }
        return eVar.f56060c == 0 && cVar.f56812c;
    }

    private void p() {
        i(this.f53219i, this.f53212b, this.A, true);
    }

    private void q() {
        if (this.H) {
            ob.a.e(this.f56068p);
            ob.a.e(this.f56069q);
            i(this.f56068p, this.f56069q, this.B, false);
            this.G = 0;
            this.H = false;
        }
    }

    private long r(u9.l lVar) throws Throwable {
        lVar.resetPeekPosition();
        try {
            this.f56078z.Q(10);
            lVar.peekFully(this.f56078z.e(), 0, 10);
            if (this.f56078z.K() != 4801587) {
                return C.TIME_UNSET;
            }
            this.f56078z.V(3);
            int iG = this.f56078z.G();
            int i10 = iG + 10;
            if (i10 > this.f56078z.b()) {
                byte[] bArrE = this.f56078z.e();
                this.f56078z.Q(i10);
                System.arraycopy(bArrE, 0, this.f56078z.e(), 0, 10);
            }
            lVar.peekFully(this.f56078z.e(), 10, iG);
            ha.a aVarE = this.f56077y.e(this.f56078z.e(), iG);
            if (aVarE == null) {
                return C.TIME_UNSET;
            }
            int iF = aVarE.f();
            for (int i11 = 0; i11 < iF; i11++) {
                ha.a.b bVarE = aVarE.e(i11);
                if (bVarE instanceof ma.l) {
                    ma.l lVar2 = (ma.l) bVarE;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(lVar2.f45402b)) {
                        System.arraycopy(lVar2.f45403c, 0, this.f56078z.e(), 0, 8);
                        this.f56078z.U(0);
                        this.f56078z.T(8);
                        return this.f56078z.A() & 8589934591L;
                    }
                }
            }
            return C.TIME_UNSET;
        } catch (EOFException unused) {
        }
    }

    private u9.e s(nb.j jVar, com.google.android.exoplayer2.upstream.a aVar, boolean z10) throws Throwable {
        j jVarA;
        long jH = jVar.h(aVar);
        if (z10) {
            try {
                this.f56073u.i(this.f56071s, this.f53217g, this.D);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e10) {
                throw new IOException(e10);
            }
        }
        u9.e eVar = new u9.e(jVar, aVar.f18785g, jH);
        if (this.E == null) {
            long jR = r(eVar);
            eVar.resetPeekPosition();
            j jVar2 = this.f56070r;
            if (jVar2 != null) {
                jVarA = jVar2.f();
            } else {
                jVarA = this.f56074v.a(aVar.f18779a, this.f53214d, this.f56075w, this.f56073u, jVar.getResponseHeaders(), eVar, this.C);
                eVar = eVar;
            }
            this.E = jVarA;
            if (jVarA.e()) {
                this.F.a0(jR != C.TIME_UNSET ? this.f56073u.b(jR) : this.f53217g);
            } else {
                this.F.a0(0L);
            }
            this.F.M();
            this.E.b(this.F);
        }
        this.F.X(this.f56076x);
        return eVar;
    }

    public static boolean u(i iVar, Uri uri, com.google.android.exoplayer2.source.hls.playlist.c cVar, f.e eVar, long j10) {
        if (iVar == null) {
            return false;
        }
        if (uri.equals(iVar.f56065m) && iVar.J) {
            return false;
        }
        return !n(eVar, cVar) || j10 + eVar.f56058a.f17792e < iVar.f53218h;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void cancelLoad() {
        this.I = true;
    }

    @Override // ta.n
    public boolean f() {
        return this.J;
    }

    public int k(int i10) {
        ob.a.g(!this.f56066n);
        if (i10 >= this.K.size()) {
            return 0;
        }
        return ((Integer) this.K.get(i10)).intValue();
    }

    public void l(p pVar, c0 c0Var) {
        this.F = pVar;
        this.K = c0Var;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void load() {
        j jVar;
        ob.a.e(this.F);
        if (this.E == null && (jVar = this.f56070r) != null && jVar.d()) {
            this.E = this.f56070r;
            this.H = false;
        }
        q();
        if (this.I) {
            return;
        }
        if (!this.f56072t) {
            p();
        }
        this.J = !this.I;
    }

    public void m() {
        this.L = true;
    }

    public boolean o() {
        return this.M;
    }

    public void t() {
        this.M = true;
    }
}
