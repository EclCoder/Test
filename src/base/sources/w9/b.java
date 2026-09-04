package w9;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.v0;
import com.google.common.collect.p1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import ob.d0;
import ob.u;
import ob.y;
import u9.b0;
import u9.i;
import u9.k;
import u9.l;
import u9.m;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f55972c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w9.c f55974e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f55977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e f55978i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f55982m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f55983n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f55970a = new d0(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f55971b = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m f55973d = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e[] f55976g = new e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f55980k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f55981l = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f55979j = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f55975f = C.TIME_UNSET;

    /* JADX INFO: renamed from: w9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class C0858b implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f55984a;

        public C0858b(long j10) {
            this.f55984a = j10;
        }

        @Override // u9.z
        public long getDurationUs() {
            return this.f55984a;
        }

        @Override // u9.z
        public z.a getSeekPoints(long j10) {
            z.a aVarI = b.this.f55976g[0].i(j10);
            for (int i10 = 1; i10 < b.this.f55976g.length; i10++) {
                z.a aVarI2 = b.this.f55976g[i10].i(j10);
                if (aVarI2.f54334a.f54232b < aVarI.f54334a.f54232b) {
                    aVarI = aVarI2;
                }
            }
            return aVarI;
        }

        @Override // u9.z
        public boolean isSeekable() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f55986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f55987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f55988c;

        private c() {
        }

        public void a(d0 d0Var) {
            this.f55986a = d0Var.u();
            this.f55987b = d0Var.u();
            this.f55988c = 0;
        }

        public void b(d0 d0Var) throws ParserException {
            a(d0Var);
            if (this.f55986a == 1414744396) {
                this.f55988c = d0Var.u();
                return;
            }
            throw ParserException.a("LIST expected, found: " + this.f55986a, null);
        }
    }

    private static void e(l lVar) {
        if ((lVar.getPosition() & 1) == 1) {
            lVar.skipFully(1);
        }
    }

    private e f(int i10) {
        for (e eVar : this.f55976g) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    private void g(d0 d0Var) throws ParserException {
        f fVarC = f.c(1819436136, d0Var);
        if (fVarC.getType() != 1819436136) {
            throw ParserException.a("Unexpected header list type " + fVarC.getType(), null);
        }
        w9.c cVar = (w9.c) fVarC.b(w9.c.class);
        if (cVar == null) {
            throw ParserException.a("AviHeader not found", null);
        }
        this.f55974e = cVar;
        this.f55975f = ((long) cVar.f55991c) * ((long) cVar.f55989a);
        ArrayList arrayList = new ArrayList();
        p1 it = fVarC.f56011a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            w9.a aVar = (w9.a) it.next();
            if (aVar.getType() == 1819440243) {
                int i11 = i10 + 1;
                e eVarJ = j((f) aVar, i10);
                if (eVarJ != null) {
                    arrayList.add(eVarJ);
                }
                i10 = i11;
            }
        }
        this.f55976g = (e[]) arrayList.toArray(new e[0]);
        this.f55973d.endTracks();
    }

    private void h(d0 d0Var) {
        long jI = i(d0Var);
        while (d0Var.a() >= 16) {
            int iU = d0Var.u();
            int iU2 = d0Var.u();
            long jU = ((long) d0Var.u()) + jI;
            d0Var.u();
            e eVarF = f(iU);
            if (eVarF != null) {
                if ((iU2 & 16) == 16) {
                    eVarF.b(jU);
                }
                eVarF.k();
            }
        }
        for (e eVar : this.f55976g) {
            eVar.c();
        }
        this.f55983n = true;
        this.f55973d.c(new C0858b(this.f55975f));
    }

    private long i(d0 d0Var) {
        if (d0Var.a() < 16) {
            return 0L;
        }
        int iF = d0Var.f();
        d0Var.V(8);
        long jU = d0Var.u();
        long j10 = this.f55980k;
        long j11 = jU <= j10 ? j10 + 8 : 0L;
        d0Var.U(iF);
        return j11;
    }

    private e j(f fVar, int i10) {
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            u.i("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (gVar == null) {
            u.i("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jA = dVar.a();
        v0 v0Var = gVar.f56013a;
        v0.b bVarB = v0Var.b();
        bVarB.T(i10);
        int i11 = dVar.f55998f;
        if (i11 != 0) {
            bVarB.Y(i11);
        }
        h hVar = (h) fVar.b(h.class);
        if (hVar != null) {
            bVarB.W(hVar.f56014a);
        }
        int iK = y.k(v0Var.f18868l);
        if (iK != 1 && iK != 2) {
            return null;
        }
        b0 b0VarTrack = this.f55973d.track(i10, iK);
        b0VarTrack.e(bVarB.G());
        e eVar = new e(i10, iK, jA, dVar.f55997e, b0VarTrack);
        this.f55975f = jA;
        return eVar;
    }

    private int k(l lVar) {
        if (lVar.getPosition() >= this.f55981l) {
            return -1;
        }
        e eVar = this.f55978i;
        if (eVar == null) {
            e(lVar);
            lVar.peekFully(this.f55970a.e(), 0, 12);
            this.f55970a.U(0);
            int iU = this.f55970a.u();
            if (iU == 1414744396) {
                this.f55970a.U(8);
                lVar.skipFully(this.f55970a.u() != 1769369453 ? 8 : 12);
                lVar.resetPeekPosition();
                return 0;
            }
            int iU2 = this.f55970a.u();
            if (iU == 1263424842) {
                this.f55977h = lVar.getPosition() + ((long) iU2) + 8;
                return 0;
            }
            lVar.skipFully(8);
            lVar.resetPeekPosition();
            e eVarF = f(iU);
            if (eVarF == null) {
                this.f55977h = lVar.getPosition() + ((long) iU2);
                return 0;
            }
            eVarF.n(iU2);
            this.f55978i = eVarF;
        } else if (eVar.m(lVar)) {
            this.f55978i = null;
        }
        return 0;
    }

    private boolean l(l lVar, u9.y yVar) {
        boolean z10;
        if (this.f55977h != -1) {
            long position = lVar.getPosition();
            long j10 = this.f55977h;
            if (j10 < position || j10 > 262144 + position) {
                yVar.f54333a = j10;
                z10 = true;
            } else {
                lVar.skipFully((int) (j10 - position));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f55977h = -1L;
        return z10;
    }

    @Override // u9.k
    public void b(m mVar) {
        this.f55972c = 0;
        this.f55973d = mVar;
        this.f55977h = -1L;
    }

    @Override // u9.k
    public int c(l lVar, u9.y yVar) throws ParserException {
        if (l(lVar, yVar)) {
            return 1;
        }
        switch (this.f55972c) {
            case 0:
                if (!d(lVar)) {
                    throw ParserException.a("AVI Header List not found", null);
                }
                lVar.skipFully(12);
                this.f55972c = 1;
                return 0;
            case 1:
                lVar.readFully(this.f55970a.e(), 0, 12);
                this.f55970a.U(0);
                this.f55971b.b(this.f55970a);
                c cVar = this.f55971b;
                if (cVar.f55988c == 1819436136) {
                    this.f55979j = cVar.f55987b;
                    this.f55972c = 2;
                    return 0;
                }
                throw ParserException.a("hdrl expected, found: " + this.f55971b.f55988c, null);
            case 2:
                int i10 = this.f55979j - 4;
                d0 d0Var = new d0(i10);
                lVar.readFully(d0Var.e(), 0, i10);
                g(d0Var);
                this.f55972c = 3;
                return 0;
            case 3:
                if (this.f55980k != -1) {
                    long position = lVar.getPosition();
                    long j10 = this.f55980k;
                    if (position != j10) {
                        this.f55977h = j10;
                        return 0;
                    }
                }
                lVar.peekFully(this.f55970a.e(), 0, 12);
                lVar.resetPeekPosition();
                this.f55970a.U(0);
                this.f55971b.a(this.f55970a);
                int iU = this.f55970a.u();
                int i11 = this.f55971b.f55986a;
                if (i11 == 1179011410) {
                    lVar.skipFully(12);
                    return 0;
                }
                if (i11 != 1414744396 || iU != 1769369453) {
                    this.f55977h = lVar.getPosition() + ((long) this.f55971b.f55987b) + 8;
                    return 0;
                }
                long position2 = lVar.getPosition();
                this.f55980k = position2;
                this.f55981l = position2 + ((long) this.f55971b.f55987b) + 8;
                if (!this.f55983n) {
                    if (((w9.c) ob.a.e(this.f55974e)).a()) {
                        this.f55972c = 4;
                        this.f55977h = this.f55981l;
                        return 0;
                    }
                    this.f55973d.c(new z.b(this.f55975f));
                    this.f55983n = true;
                }
                this.f55977h = lVar.getPosition() + 12;
                this.f55972c = 6;
                return 0;
            case 4:
                lVar.readFully(this.f55970a.e(), 0, 8);
                this.f55970a.U(0);
                int iU2 = this.f55970a.u();
                int iU3 = this.f55970a.u();
                if (iU2 == 829973609) {
                    this.f55972c = 5;
                    this.f55982m = iU3;
                } else {
                    this.f55977h = lVar.getPosition() + ((long) iU3);
                }
                return 0;
            case 5:
                d0 d0Var2 = new d0(this.f55982m);
                lVar.readFully(d0Var2.e(), 0, this.f55982m);
                h(d0Var2);
                this.f55972c = 6;
                this.f55977h = this.f55980k;
                return 0;
            case 6:
                return k(lVar);
            default:
                throw new AssertionError();
        }
    }

    @Override // u9.k
    public boolean d(l lVar) {
        lVar.peekFully(this.f55970a.e(), 0, 12);
        this.f55970a.U(0);
        if (this.f55970a.u() != 1179011410) {
            return false;
        }
        this.f55970a.V(4);
        return this.f55970a.u() == 541677121;
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        this.f55977h = -1L;
        this.f55978i = null;
        for (e eVar : this.f55976g) {
            eVar.o(j10);
        }
        if (j10 != 0) {
            this.f55972c = 6;
        } else if (this.f55976g.length == 0) {
            this.f55972c = 0;
        } else {
            this.f55972c = 3;
        }
    }

    @Override // u9.k
    public void release() {
    }
}
