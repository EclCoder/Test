package ba;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import ob.d0;
import ob.r0;
import q9.t;
import u9.b0;
import u9.j;
import u9.k;
import u9.l;
import u9.m;
import u9.p;
import u9.v;
import u9.w;
import u9.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements k {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p f8700u = new p() { // from class: ba.d
        @Override // u9.p
        public final k[] createExtractors() {
            return f.a();
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final ma.h.a f8701v = new ma.h.a() { // from class: ba.e
        @Override // ma.h.a
        public final boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
            return f.e(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f8703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f8704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t.a f8705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v f8706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f8707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b0 f8708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m f8709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b0 f8710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b0 f8711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ha.a f8713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f8714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f8715n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f8716o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f8717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private g f8718q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f8719r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f8720s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f8721t;

    public f() {
        this(0);
    }

    public static /* synthetic */ k[] a() {
        return new k[]{new f()};
    }

    public static /* synthetic */ boolean e(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    private void f() {
        ob.a.i(this.f8710i);
        r0.j(this.f8709h);
    }

    private g g(l lVar) {
        long jK;
        long jA;
        g gVarO = o(lVar);
        c cVarN = n(this.f8713l, lVar.getPosition());
        if (this.f8719r) {
            return new g.a();
        }
        if ((this.f8702a & 4) != 0) {
            if (cVarN != null) {
                jK = cVarN.getDurationUs();
                jA = cVarN.a();
            } else if (gVarO != null) {
                jK = gVarO.getDurationUs();
                jA = gVarO.a();
            } else {
                jK = k(this.f8713l);
                jA = -1;
            }
            gVarO = new b(jK, lVar.getPosition(), jA);
        } else if (cVarN != null) {
            gVarO = cVarN;
        } else if (gVarO == null) {
            gVarO = null;
        }
        if (gVarO == null || !(gVarO.isSeekable() || (this.f8702a & 1) == 0)) {
            return j(lVar, (this.f8702a & 2) != 0);
        }
        return gVarO;
    }

    private long h(long j10) {
        return this.f8714m + ((j10 * 1000000) / ((long) this.f8705d.f50504d));
    }

    private g j(l lVar, boolean z10) {
        lVar.peekFully(this.f8704c.e(), 0, 4);
        this.f8704c.U(0);
        this.f8705d.a(this.f8704c.q());
        return new a(lVar.getLength(), lVar.getPosition(), this.f8705d, z10);
    }

    private static long k(ha.a aVar) {
        if (aVar == null) {
            return C.TIME_UNSET;
        }
        int iF = aVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            ha.a.b bVarE = aVar.e(i10);
            if (bVarE instanceof ma.m) {
                ma.m mVar = (ma.m) bVarE;
                if (mVar.f45393a.equals("TLEN")) {
                    return r0.H0(Long.parseLong((String) mVar.f45406d.get(0)));
                }
            }
        }
        return C.TIME_UNSET;
    }

    private static int l(d0 d0Var, int i10) {
        if (d0Var.g() >= i10 + 4) {
            d0Var.U(i10);
            int iQ = d0Var.q();
            if (iQ == 1483304551 || iQ == 1231971951) {
                return iQ;
            }
        }
        if (d0Var.g() < 40) {
            return 0;
        }
        d0Var.U(36);
        return d0Var.q() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean m(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    private static c n(ha.a aVar, long j10) {
        if (aVar == null) {
            return null;
        }
        int iF = aVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            ha.a.b bVarE = aVar.e(i10);
            if (bVarE instanceof ma.k) {
                return c.b(j10, (ma.k) bVarE, k(aVar));
            }
        }
        return null;
    }

    private g o(l lVar) {
        d0 d0Var = new d0(this.f8705d.f50503c);
        lVar.peekFully(d0Var.e(), 0, this.f8705d.f50503c);
        t.a aVar = this.f8705d;
        int i10 = 21;
        if ((aVar.f50501a & 1) != 0) {
            if (aVar.f50505e != 1) {
                i10 = 36;
            }
        } else if (aVar.f50505e == 1) {
            i10 = 13;
        }
        int i11 = i10;
        int iL = l(d0Var, i11);
        if (iL != 1483304551 && iL != 1231971951) {
            if (iL != 1447187017) {
                lVar.resetPeekPosition();
                return null;
            }
            h hVarB = h.b(lVar.getLength(), lVar.getPosition(), this.f8705d, d0Var);
            lVar.skipFully(this.f8705d.f50503c);
            return hVarB;
        }
        i iVarB = i.b(lVar.getLength(), lVar.getPosition(), this.f8705d, d0Var);
        if (iVarB != null && !this.f8706e.a()) {
            lVar.resetPeekPosition();
            lVar.advancePeekPosition(i11 + 141);
            lVar.peekFully(this.f8704c.e(), 0, 3);
            this.f8704c.U(0);
            this.f8706e.d(this.f8704c.K());
        }
        lVar.skipFully(this.f8705d.f50503c);
        return (iVarB == null || iVarB.isSeekable() || iL != 1231971951) ? iVarB : j(lVar, false);
    }

    private boolean p(l lVar) {
        g gVar = this.f8718q;
        if (gVar != null) {
            long jA = gVar.a();
            if (jA != -1 && lVar.getPeekPosition() > jA - 4) {
                return true;
            }
        }
        try {
            return !lVar.peekFully(this.f8704c.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int q(l lVar) throws Throwable {
        if (this.f8712k == 0) {
            try {
                s(lVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f8718q == null) {
            g gVarG = g(lVar);
            this.f8718q = gVarG;
            this.f8709h.c(gVarG);
            this.f8711j.e(new v0.b().g0(this.f8705d.f50502b).Y(4096).J(this.f8705d.f50505e).h0(this.f8705d.f50504d).P(this.f8706e.f54326a).Q(this.f8706e.f54327b).Z((this.f8702a & 8) != 0 ? null : this.f8713l).G());
            this.f8716o = lVar.getPosition();
        } else if (this.f8716o != 0) {
            long position = lVar.getPosition();
            long j10 = this.f8716o;
            if (position < j10) {
                lVar.skipFully((int) (j10 - position));
            }
        }
        return r(lVar);
    }

    private int r(l lVar) {
        if (this.f8717p == 0) {
            lVar.resetPeekPosition();
            if (p(lVar)) {
                return -1;
            }
            this.f8704c.U(0);
            int iQ = this.f8704c.q();
            if (!m(iQ, this.f8712k) || t.j(iQ) == -1) {
                lVar.skipFully(1);
                this.f8712k = 0;
                return 0;
            }
            this.f8705d.a(iQ);
            if (this.f8714m == C.TIME_UNSET) {
                this.f8714m = this.f8718q.getTimeUs(lVar.getPosition());
                if (this.f8703b != C.TIME_UNSET) {
                    this.f8714m += this.f8703b - this.f8718q.getTimeUs(0L);
                }
            }
            t.a aVar = this.f8705d;
            this.f8717p = aVar.f50503c;
            g gVar = this.f8718q;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.c(h(this.f8715n + ((long) aVar.f50507g)), lVar.getPosition() + ((long) this.f8705d.f50503c));
                if (this.f8720s && bVar.b(this.f8721t)) {
                    this.f8720s = false;
                    this.f8711j = this.f8710i;
                }
            }
        }
        int iA = this.f8711j.a(lVar, this.f8717p, true);
        if (iA == -1) {
            return -1;
        }
        int i10 = this.f8717p - iA;
        this.f8717p = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f8711j.f(h(this.f8715n), 1, this.f8705d.f50503c, 0, null);
        this.f8715n += (long) this.f8705d.f50507g;
        this.f8717p = 0;
        return 0;
    }

    private boolean s(l lVar, boolean z10) throws Throwable {
        int peekPosition;
        int i10;
        int iJ;
        int i11 = z10 ? 32768 : 131072;
        lVar.resetPeekPosition();
        if (lVar.getPosition() == 0) {
            ha.a aVarA = this.f8707f.a(lVar, (this.f8702a & 8) == 0 ? null : f8701v);
            this.f8713l = aVarA;
            if (aVarA != null) {
                this.f8706e.c(aVarA);
            }
            peekPosition = (int) lVar.getPeekPosition();
            if (!z10) {
                lVar.skipFully(peekPosition);
            }
            i10 = 0;
        } else {
            peekPosition = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (p(lVar)) {
                if (i12 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.f8704c.U(0);
            int iQ = this.f8704c.q();
            if ((i10 == 0 || m(iQ, i10)) && (iJ = t.j(iQ)) != -1) {
                i12++;
                if (i12 != 1) {
                    if (i12 == 4) {
                        break;
                    }
                } else {
                    this.f8705d.a(iQ);
                    i10 = iQ;
                }
                lVar.advancePeekPosition(iJ - 4);
            } else {
                int i14 = i13 + 1;
                if (i13 == i11) {
                    if (z10) {
                        return false;
                    }
                    throw ParserException.a("Searched too many bytes.", null);
                }
                if (z10) {
                    lVar.resetPeekPosition();
                    lVar.advancePeekPosition(peekPosition + i14);
                } else {
                    lVar.skipFully(1);
                }
                i12 = 0;
                i13 = i14;
                i10 = 0;
            }
        }
        if (z10) {
            lVar.skipFully(peekPosition + i13);
        } else {
            lVar.resetPeekPosition();
        }
        this.f8712k = i10;
        return true;
    }

    @Override // u9.k
    public void b(m mVar) {
        this.f8709h = mVar;
        b0 b0VarTrack = mVar.track(0, 1);
        this.f8710i = b0VarTrack;
        this.f8711j = b0VarTrack;
        this.f8709h.endTracks();
    }

    @Override // u9.k
    public int c(l lVar, y yVar) throws Throwable {
        f();
        int iQ = q(lVar);
        if (iQ == -1 && (this.f8718q instanceof b)) {
            long jH = h(this.f8715n);
            if (this.f8718q.getDurationUs() != jH) {
                ((b) this.f8718q).d(jH);
                this.f8709h.c(this.f8718q);
            }
        }
        return iQ;
    }

    @Override // u9.k
    public boolean d(l lVar) {
        return s(lVar, true);
    }

    public void i() {
        this.f8719r = true;
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        this.f8712k = 0;
        this.f8714m = C.TIME_UNSET;
        this.f8715n = 0L;
        this.f8717p = 0;
        this.f8721t = j11;
        g gVar = this.f8718q;
        if (!(gVar instanceof b) || ((b) gVar).b(j11)) {
            return;
        }
        this.f8720s = true;
        this.f8711j = this.f8708g;
    }

    public f(int i10) {
        this(i10, C.TIME_UNSET);
    }

    public f(int i10, long j10) {
        this.f8702a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f8703b = j10;
        this.f8704c = new d0(10);
        this.f8705d = new t.a();
        this.f8706e = new v();
        this.f8714m = C.TIME_UNSET;
        this.f8707f = new w();
        j jVar = new j();
        this.f8708g = jVar;
        this.f8711j = jVar;
    }

    @Override // u9.k
    public void release() {
    }
}
