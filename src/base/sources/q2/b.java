package q2;

import androidx.media3.common.ParserException;
import com.google.common.collect.p1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import l3.r;
import l3.t;
import o2.g0;
import o2.i0;
import o2.j0;
import o2.o0;
import o2.p;
import o2.q;
import t1.o;
import t1.v;
import tn.xQIL.Saucuwx;
import w1.n;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f50294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f50295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f50296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r.a f50297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o2.r f50299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q2.c f50300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f50301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e[] f50302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f50303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e f50304k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f50305l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f50306m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f50307n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f50308o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f50309p;

    /* JADX INFO: renamed from: q2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private class C0772b implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f50310a;

        public C0772b(long j10) {
            this.f50310a = j10;
        }

        @Override // o2.j0
        public long getDurationUs() {
            return this.f50310a;
        }

        @Override // o2.j0
        public j0.a getSeekPoints(long j10) {
            j0.a aVarI = b.this.f50302i[0].i(j10);
            for (int i10 = 1; i10 < b.this.f50302i.length; i10++) {
                j0.a aVarI2 = b.this.f50302i[i10].i(j10);
                if (aVarI2.f48077a.f48083b < aVarI.f48077a.f48083b) {
                    aVarI = aVarI2;
                }
            }
            return aVarI;
        }

        @Override // o2.j0
        public boolean isSeekable() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f50314c;

        private c() {
        }

        public void a(u uVar) {
            this.f50312a = uVar.t();
            this.f50313b = uVar.t();
            this.f50314c = 0;
        }

        public void b(u uVar) throws ParserException {
            a(uVar);
            if (this.f50312a == 1414744396) {
                this.f50314c = uVar.t();
                return;
            }
            throw ParserException.a("LIST expected, found: " + this.f50312a, null);
        }
    }

    public b(int i10, r.a aVar) {
        this.f50297d = aVar;
        this.f50296c = (i10 & 1) == 0;
        this.f50294a = new u(12);
        this.f50295b = new c();
        this.f50299f = new g0();
        this.f50302i = new e[0];
        this.f50306m = -1L;
        this.f50307n = -1L;
        this.f50305l = -1;
        this.f50301h = C.TIME_UNSET;
    }

    private static void g(q qVar) {
        if ((qVar.getPosition() & 1) == 1) {
            qVar.skipFully(1);
        }
    }

    private e h(int i10) {
        for (e eVar : this.f50302i) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    private void j(u uVar) {
        long jK = k(uVar);
        while (uVar.a() >= 16) {
            int iT = uVar.t();
            int iT2 = uVar.t();
            long jT = ((long) uVar.t()) + jK;
            uVar.t();
            e eVarH = h(iT);
            if (eVarH != null) {
                if ((iT2 & 16) == 16) {
                    eVarH.b(jT);
                }
                eVarH.k();
            }
        }
        for (e eVar : this.f50302i) {
            eVar.c();
        }
        this.f50309p = true;
        this.f50299f.d(new C0772b(this.f50301h));
    }

    private long k(u uVar) {
        if (uVar.a() < 16) {
            return 0L;
        }
        int iF = uVar.f();
        uVar.U(8);
        long jT = uVar.t();
        long j10 = this.f50306m;
        long j11 = jT <= j10 ? j10 + 8 : 0L;
        uVar.T(iF);
        return j11;
    }

    private e l(f fVar, int i10) {
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            n.h("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (gVar == null) {
            n.h("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jA = dVar.a();
        o oVar = gVar.f50339a;
        o.b bVarA = oVar.a();
        bVarA.Z(i10);
        int i11 = dVar.f50324f;
        if (i11 != 0) {
            bVarA.f0(i11);
        }
        h hVar = (h) fVar.b(h.class);
        if (hVar != null) {
            bVarA.c0(hVar.f50340a);
        }
        int iF = v.f(oVar.f52757n);
        if (iF != 1 && iF != 2) {
            return null;
        }
        o0 o0VarTrack = this.f50299f.track(i10, iF);
        o0VarTrack.b(bVarA.K());
        e eVar = new e(i10, iF, jA, dVar.f50323e, o0VarTrack);
        this.f50301h = jA;
        return eVar;
    }

    private int m(q qVar) {
        if (qVar.getPosition() >= this.f50307n) {
            return -1;
        }
        e eVar = this.f50304k;
        if (eVar == null) {
            g(qVar);
            qVar.peekFully(this.f50294a.e(), 0, 12);
            this.f50294a.T(0);
            int iT = this.f50294a.t();
            if (iT == 1414744396) {
                this.f50294a.T(8);
                qVar.skipFully(this.f50294a.t() != 1769369453 ? 8 : 12);
                qVar.resetPeekPosition();
                return 0;
            }
            int iT2 = this.f50294a.t();
            if (iT == 1263424842) {
                this.f50303j = qVar.getPosition() + ((long) iT2) + 8;
                return 0;
            }
            qVar.skipFully(8);
            qVar.resetPeekPosition();
            e eVarH = h(iT);
            if (eVarH == null) {
                this.f50303j = qVar.getPosition() + ((long) iT2);
                return 0;
            }
            eVarH.n(iT2);
            this.f50304k = eVarH;
        } else if (eVar.m(qVar)) {
            this.f50304k = null;
        }
        return 0;
    }

    private boolean n(q qVar, i0 i0Var) {
        boolean z10;
        if (this.f50303j != -1) {
            long position = qVar.getPosition();
            long j10 = this.f50303j;
            if (j10 < position || j10 > 262144 + position) {
                i0Var.f48076a = j10;
                z10 = true;
            } else {
                qVar.skipFully((int) (j10 - position));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f50303j = -1L;
        return z10;
    }

    @Override // o2.p
    public int b(q qVar, i0 i0Var) throws ParserException {
        if (n(qVar, i0Var)) {
            return 1;
        }
        switch (this.f50298e) {
            case 0:
                if (!d(qVar)) {
                    throw ParserException.a("AVI Header List not found", null);
                }
                qVar.skipFully(12);
                this.f50298e = 1;
                return 0;
            case 1:
                qVar.readFully(this.f50294a.e(), 0, 12);
                this.f50294a.T(0);
                this.f50295b.b(this.f50294a);
                c cVar = this.f50295b;
                if (cVar.f50314c == 1819436136) {
                    this.f50305l = cVar.f50313b;
                    this.f50298e = 2;
                    return 0;
                }
                throw ParserException.a("hdrl expected, found: " + this.f50295b.f50314c, null);
            case 2:
                int i10 = this.f50305l - 4;
                u uVar = new u(i10);
                qVar.readFully(uVar.e(), 0, i10);
                i(uVar);
                this.f50298e = 3;
                return 0;
            case 3:
                if (this.f50306m != -1) {
                    long position = qVar.getPosition();
                    long j10 = this.f50306m;
                    if (position != j10) {
                        this.f50303j = j10;
                        return 0;
                    }
                }
                qVar.peekFully(this.f50294a.e(), 0, 12);
                qVar.resetPeekPosition();
                this.f50294a.T(0);
                this.f50295b.a(this.f50294a);
                int iT = this.f50294a.t();
                int i11 = this.f50295b.f50312a;
                if (i11 == 1179011410) {
                    qVar.skipFully(12);
                    return 0;
                }
                if (i11 != 1414744396 || iT != 1769369453) {
                    this.f50303j = qVar.getPosition() + ((long) this.f50295b.f50313b) + 8;
                    return 0;
                }
                long position2 = qVar.getPosition();
                this.f50306m = position2;
                this.f50307n = position2 + ((long) this.f50295b.f50313b) + 8;
                if (!this.f50309p) {
                    if (((q2.c) w1.a.e(this.f50300g)).a()) {
                        this.f50298e = 4;
                        this.f50303j = this.f50307n;
                        return 0;
                    }
                    this.f50299f.d(new j0.b(this.f50301h));
                    this.f50309p = true;
                }
                this.f50303j = qVar.getPosition() + 12;
                this.f50298e = 6;
                return 0;
            case 4:
                qVar.readFully(this.f50294a.e(), 0, 8);
                this.f50294a.T(0);
                int iT2 = this.f50294a.t();
                int iT3 = this.f50294a.t();
                if (iT2 == 829973609) {
                    this.f50298e = 5;
                    this.f50308o = iT3;
                } else {
                    this.f50303j = qVar.getPosition() + ((long) iT3);
                }
                return 0;
            case 5:
                u uVar2 = new u(this.f50308o);
                qVar.readFully(uVar2.e(), 0, this.f50308o);
                j(uVar2);
                this.f50298e = 6;
                this.f50303j = this.f50306m;
                return 0;
            case 6:
                return m(qVar);
            default:
                throw new AssertionError();
        }
    }

    @Override // o2.p
    public void c(o2.r rVar) {
        this.f50298e = 0;
        if (this.f50296c) {
            rVar = new t(rVar, this.f50297d);
        }
        this.f50299f = rVar;
        this.f50303j = -1L;
    }

    @Override // o2.p
    public boolean d(q qVar) {
        qVar.peekFully(this.f50294a.e(), 0, 12);
        this.f50294a.T(0);
        if (this.f50294a.t() != 1179011410) {
            return false;
        }
        this.f50294a.U(4);
        return this.f50294a.t() == 541677121;
    }

    @Override // o2.p
    public void release() {
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        this.f50303j = -1L;
        this.f50304k = null;
        for (e eVar : this.f50302i) {
            eVar.o(j10);
        }
        if (j10 != 0) {
            this.f50298e = 6;
        } else if (this.f50302i.length == 0) {
            this.f50298e = 0;
        } else {
            this.f50298e = 3;
        }
    }

    private void i(u uVar) throws ParserException {
        f fVarC = f.c(1819436136, uVar);
        if (fVarC.getType() == 1819436136) {
            q2.c cVar = (q2.c) fVarC.b(q2.c.class);
            if (cVar != null) {
                this.f50300g = cVar;
                this.f50301h = ((long) cVar.f50317c) * ((long) cVar.f50315a);
                ArrayList arrayList = new ArrayList();
                p1 it = fVarC.f50337a.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    q2.a aVar = (q2.a) it.next();
                    if (aVar.getType() == 1819440243) {
                        int i11 = i10 + 1;
                        e eVarL = l((f) aVar, i10);
                        if (eVarL != null) {
                            arrayList.add(eVarL);
                        }
                        i10 = i11;
                    }
                }
                this.f50302i = (e[]) arrayList.toArray(new e[0]);
                this.f50299f.endTracks();
                return;
            }
            throw ParserException.a(Saucuwx.SEbUgCd, null);
        }
        throw ParserException.a("Unexpected header list type " + fVarC.getType(), null);
    }
}
