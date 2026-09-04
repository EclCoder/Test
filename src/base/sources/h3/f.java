package h3;

import androidx.media3.common.ParserException;
import c3.l;
import c3.n;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.math.RoundingMode;
import o2.b0;
import o2.d0;
import o2.f0;
import o2.i0;
import o2.m;
import o2.o0;
import o2.p;
import o2.q;
import o2.r;
import o2.u;
import t1.o;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f implements p {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final u f40182u = new u() { // from class: h3.d
        @Override // o2.u
        public final p[] createExtractors() {
            return f.a();
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final c3.h.a f40183v = new c3.h.a() { // from class: h3.e
        @Override // c3.h.a
        public final boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
            return f.g(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f40184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f40185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w1.u f40186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f0.a f40187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0 f40188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d0 f40189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o0 f40190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f40191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o0 f40192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private o0 f40193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f40194k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private t1.u f40195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f40196m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f40197n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f40198o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f40199p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private g f40200q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f40201r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f40202s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f40203t;

    public f() {
        this(0);
    }

    public static /* synthetic */ p[] a() {
        return new p[]{new f()};
    }

    public static /* synthetic */ boolean g(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    private void h() {
        w1.a.i(this.f40192i);
        c0.h(this.f40191h);
    }

    private g i(q qVar) {
        long jN;
        long jA;
        g gVarR = r(qVar);
        c cVarQ = q(this.f40195l, qVar.getPosition());
        if (this.f40201r) {
            return new g.a();
        }
        if ((this.f40184a & 4) != 0) {
            if (cVarQ != null) {
                jN = cVarQ.getDurationUs();
                jA = cVarQ.a();
            } else if (gVarR != null) {
                jN = gVarR.getDurationUs();
                jA = gVarR.a();
            } else {
                jN = n(this.f40195l);
                jA = -1;
            }
            gVarR = new b(jN, qVar.getPosition(), jA);
        } else if (cVarQ != null) {
            gVarR = cVarQ;
        } else if (gVarR == null) {
            gVarR = null;
        }
        if (gVarR == null || !(gVarR.isSeekable() || (this.f40184a & 1) == 0)) {
            return m(qVar, (this.f40184a & 2) != 0);
        }
        return gVarR;
    }

    private long j(long j10) {
        return this.f40196m + ((j10 * 1000000) / ((long) this.f40187d.f48052d));
    }

    private g l(long j10, i iVar, long j11) {
        long j12;
        long j13;
        long jA = iVar.a();
        if (jA == C.TIME_UNSET) {
            return null;
        }
        long j14 = iVar.f40211c;
        if (j14 != -1) {
            long j15 = j10 + j14;
            j12 = j14 - ((long) iVar.f40209a.f48051c);
            j13 = j15;
        } else {
            if (j11 == -1) {
                return null;
            }
            j12 = (j11 - j10) - ((long) iVar.f40209a.f48051c);
            j13 = j11;
        }
        long j16 = j12;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new a(j13, j10 + ((long) iVar.f40209a.f48051c), com.google.common.primitives.g.d(c0.P0(j16, 8000000L, jA, roundingMode)), com.google.common.primitives.g.d(wc.e.b(j16, iVar.f40210b, roundingMode)), false);
    }

    private g m(q qVar, boolean z10) {
        qVar.peekFully(this.f40186c.e(), 0, 4);
        this.f40186c.T(0);
        this.f40187d.a(this.f40186c.p());
        return new a(qVar.getLength(), qVar.getPosition(), this.f40187d, z10);
    }

    private static long n(t1.u uVar) {
        if (uVar == null) {
            return C.TIME_UNSET;
        }
        int iF = uVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            t1.u.b bVarE = uVar.e(i10);
            if (bVarE instanceof n) {
                n nVar = (n) bVarE;
                if (nVar.f9526a.equals("TLEN")) {
                    return c0.E0(Long.parseLong((String) nVar.f9540d.get(0)));
                }
            }
        }
        return C.TIME_UNSET;
    }

    private static int o(w1.u uVar, int i10) {
        if (uVar.g() >= i10 + 4) {
            uVar.T(i10);
            int iP = uVar.p();
            if (iP == 1483304551 || iP == 1231971951) {
                return iP;
            }
        }
        if (uVar.g() < 40) {
            return 0;
        }
        uVar.T(36);
        return uVar.p() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean p(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    private static c q(t1.u uVar, long j10) {
        if (uVar == null) {
            return null;
        }
        int iF = uVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            t1.u.b bVarE = uVar.e(i10);
            if (bVarE instanceof l) {
                return c.b(j10, (l) bVarE, n(uVar));
            }
        }
        return null;
    }

    private g r(q qVar) {
        int i10;
        int i11;
        w1.u uVar = new w1.u(this.f40187d.f48051c);
        qVar.peekFully(uVar.e(), 0, this.f40187d.f48051c);
        f0.a aVar = this.f40187d;
        int i12 = 21;
        if ((aVar.f48049a & 1) != 0) {
            if (aVar.f48053e != 1) {
                i12 = 36;
            }
        } else if (aVar.f48053e == 1) {
            i12 = 13;
        }
        int iO = o(uVar, i12);
        if (iO != 1231971951) {
            if (iO == 1447187017) {
                h hVarB = h.b(qVar.getLength(), qVar.getPosition(), this.f40187d, uVar);
                qVar.skipFully(this.f40187d.f48051c);
                return hVarB;
            }
            if (iO != 1483304551) {
                qVar.resetPeekPosition();
                return null;
            }
        }
        i iVarB = i.b(this.f40187d, uVar);
        if (!this.f40188e.a() && (i10 = iVarB.f40212d) != -1 && (i11 = iVarB.f40213e) != -1) {
            b0 b0Var = this.f40188e;
            b0Var.f47982a = i10;
            b0Var.f47983b = i11;
        }
        long position = qVar.getPosition();
        if (qVar.getLength() != -1 && iVarB.f40211c != -1 && qVar.getLength() != iVarB.f40211c + position) {
            w1.n.f("Mp3Extractor", "Data size mismatch between stream (" + qVar.getLength() + ") and Xing frame (" + (iVarB.f40211c + position) + "), using Xing value.");
        }
        qVar.skipFully(this.f40187d.f48051c);
        return iO == 1483304551 ? j.b(iVarB, position) : l(position, iVarB, qVar.getLength());
    }

    private boolean s(q qVar) {
        g gVar = this.f40200q;
        if (gVar != null) {
            long jA = gVar.a();
            if (jA != -1 && qVar.getPeekPosition() > jA - 4) {
                return true;
            }
        }
        try {
            return !qVar.peekFully(this.f40186c.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int t(q qVar) throws Throwable {
        if (this.f40194k == 0) {
            try {
                v(qVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f40200q == null) {
            g gVarI = i(qVar);
            this.f40200q = gVarI;
            this.f40191h.d(gVarI);
            o.b bVarH0 = new o.b().o0(this.f40187d.f48050b).f0(4096).N(this.f40187d.f48053e).p0(this.f40187d.f48052d).V(this.f40188e.f47982a).W(this.f40188e.f47983b).h0((this.f40184a & 8) != 0 ? null : this.f40195l);
            if (this.f40200q.g() != -2147483647) {
                bVarH0.M(this.f40200q.g());
            }
            this.f40193j.b(bVarH0.K());
            this.f40198o = qVar.getPosition();
        } else if (this.f40198o != 0) {
            long position = qVar.getPosition();
            long j10 = this.f40198o;
            if (position < j10) {
                qVar.skipFully((int) (j10 - position));
            }
        }
        return u(qVar);
    }

    private int u(q qVar) {
        if (this.f40199p == 0) {
            qVar.resetPeekPosition();
            if (s(qVar)) {
                return -1;
            }
            this.f40186c.T(0);
            int iP = this.f40186c.p();
            if (!p(iP, this.f40194k) || f0.j(iP) == -1) {
                qVar.skipFully(1);
                this.f40194k = 0;
                return 0;
            }
            this.f40187d.a(iP);
            if (this.f40196m == C.TIME_UNSET) {
                this.f40196m = this.f40200q.getTimeUs(qVar.getPosition());
                if (this.f40185b != C.TIME_UNSET) {
                    this.f40196m += this.f40185b - this.f40200q.getTimeUs(0L);
                }
            }
            f0.a aVar = this.f40187d;
            this.f40199p = aVar.f48051c;
            g gVar = this.f40200q;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.c(j(this.f40197n + ((long) aVar.f48055g)), qVar.getPosition() + ((long) this.f40187d.f48051c));
                if (this.f40202s && bVar.b(this.f40203t)) {
                    this.f40202s = false;
                    this.f40193j = this.f40192i;
                }
            }
        }
        int iA = this.f40193j.a(qVar, this.f40199p, true);
        if (iA == -1) {
            return -1;
        }
        int i10 = this.f40199p - iA;
        this.f40199p = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f40193j.e(j(this.f40197n), 1, this.f40187d.f48051c, 0, null);
        this.f40197n += (long) this.f40187d.f48055g;
        this.f40199p = 0;
        return 0;
    }

    private boolean v(q qVar, boolean z10) throws Throwable {
        int peekPosition;
        int i10;
        int iJ;
        int i11 = z10 ? 32768 : 131072;
        qVar.resetPeekPosition();
        if (qVar.getPosition() == 0) {
            t1.u uVarA = this.f40189f.a(qVar, (this.f40184a & 8) == 0 ? null : f40183v);
            this.f40195l = uVarA;
            if (uVarA != null) {
                this.f40188e.c(uVarA);
            }
            peekPosition = (int) qVar.getPeekPosition();
            if (!z10) {
                qVar.skipFully(peekPosition);
            }
            i10 = 0;
        } else {
            peekPosition = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (s(qVar)) {
                if (i12 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.f40186c.T(0);
            int iP = this.f40186c.p();
            if ((i10 == 0 || p(iP, i10)) && (iJ = f0.j(iP)) != -1) {
                i12++;
                if (i12 != 1) {
                    if (i12 == 4) {
                        break;
                    }
                } else {
                    this.f40187d.a(iP);
                    i10 = iP;
                }
                qVar.advancePeekPosition(iJ - 4);
            } else {
                int i14 = i13 + 1;
                if (i13 == i11) {
                    if (z10) {
                        return false;
                    }
                    throw ParserException.a("Searched too many bytes.", null);
                }
                if (z10) {
                    qVar.resetPeekPosition();
                    qVar.advancePeekPosition(peekPosition + i14);
                } else {
                    qVar.skipFully(1);
                }
                i12 = 0;
                i13 = i14;
                i10 = 0;
            }
        }
        if (z10) {
            qVar.skipFully(peekPosition + i13);
        } else {
            qVar.resetPeekPosition();
        }
        this.f40194k = i10;
        return true;
    }

    @Override // o2.p
    public int b(q qVar, i0 i0Var) throws Throwable {
        h();
        int iT = t(qVar);
        if (iT == -1 && (this.f40200q instanceof b)) {
            long j10 = j(this.f40197n);
            if (this.f40200q.getDurationUs() != j10) {
                ((b) this.f40200q).d(j10);
                this.f40191h.d(this.f40200q);
            }
        }
        return iT;
    }

    @Override // o2.p
    public void c(r rVar) {
        this.f40191h = rVar;
        o0 o0VarTrack = rVar.track(0, 1);
        this.f40192i = o0VarTrack;
        this.f40193j = o0VarTrack;
        this.f40191h.endTracks();
    }

    @Override // o2.p
    public boolean d(q qVar) {
        return v(qVar, true);
    }

    public void k() {
        this.f40201r = true;
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        this.f40194k = 0;
        this.f40196m = C.TIME_UNSET;
        this.f40197n = 0L;
        this.f40199p = 0;
        this.f40203t = j11;
        g gVar = this.f40200q;
        if (!(gVar instanceof b) || ((b) gVar).b(j11)) {
            return;
        }
        this.f40202s = true;
        this.f40193j = this.f40190g;
    }

    public f(int i10) {
        this(i10, C.TIME_UNSET);
    }

    public f(int i10, long j10) {
        this.f40184a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f40185b = j10;
        this.f40186c = new w1.u(10);
        this.f40187d = new f0.a();
        this.f40188e = new b0();
        this.f40196m = C.TIME_UNSET;
        this.f40189f = new d0();
        m mVar = new m();
        this.f40190g = mVar;
        this.f40193j = mVar;
    }

    @Override // o2.p
    public void release() {
    }
}
