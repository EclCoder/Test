package ta;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.d0;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o9.j0;
import ob.r0;
import ob.u;
import ra.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class i implements s, d0, Loader.b, Loader.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f53223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v0[] f53224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f53225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j f53226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d0.a f53227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q.a f53228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.c f53229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Loader f53230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h f53231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList f53232k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f53233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final c0 f53234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c0[] f53235n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c f53236o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private f f53237p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private v0 f53238q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f53239r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f53240s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f53241t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f53242u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ta.a f53243v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f53244w;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(i iVar);
    }

    public i(int i10, int[] iArr, v0[] v0VarArr, j jVar, d0.a aVar, nb.b bVar, long j10, com.google.android.exoplayer2.drm.j jVar2, com.google.android.exoplayer2.drm.i.a aVar2, com.google.android.exoplayer2.upstream.c cVar, q.a aVar3) {
        this.f53222a = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f53223b = iArr;
        this.f53224c = v0VarArr == null ? new v0[0] : v0VarArr;
        this.f53226e = jVar;
        this.f53227f = aVar;
        this.f53228g = aVar3;
        this.f53229h = cVar;
        this.f53230i = new Loader("ChunkSampleStream");
        this.f53231j = new h();
        ArrayList arrayList = new ArrayList();
        this.f53232k = arrayList;
        this.f53233l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f53235n = new c0[length];
        this.f53225d = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        c0[] c0VarArr = new c0[i12];
        c0 c0VarK = c0.k(bVar, jVar2, aVar2);
        this.f53234m = c0VarK;
        iArr2[0] = i10;
        c0VarArr[0] = c0VarK;
        while (i11 < length) {
            c0 c0VarL = c0.l(bVar);
            this.f53235n[i11] = c0VarL;
            int i13 = i11 + 1;
            c0VarArr[i13] = c0VarL;
            iArr2[i13] = this.f53223b[i11];
            i11 = i13;
        }
        this.f53236o = new c(iArr2, c0VarArr);
        this.f53240s = j10;
        this.f53241t = j10;
    }

    private int A(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f53232k.size()) {
                return this.f53232k.size() - 1;
            }
        } while (((ta.a) this.f53232k.get(i11)).g(0) <= i10);
        return i11 - 1;
    }

    private void D() {
        this.f53234m.U();
        for (c0 c0Var : this.f53235n) {
            c0Var.U();
        }
    }

    private void m(int i10) {
        int iMin = Math.min(A(i10, 0), this.f53242u);
        if (iMin > 0) {
            r0.S0(this.f53232k, 0, iMin);
            this.f53242u -= iMin;
        }
    }

    private void o(int i10) {
        ob.a.g(!this.f53230i.i());
        int size = this.f53232k.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!s(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = r().f53218h;
        ta.a aVarP = p(i10);
        if (this.f53232k.isEmpty()) {
            this.f53240s = this.f53241t;
        }
        this.f53244w = false;
        this.f53228g.w(this.f53222a, aVarP.f53217g, j10);
    }

    private ta.a p(int i10) {
        ta.a aVar = (ta.a) this.f53232k.get(i10);
        ArrayList arrayList = this.f53232k;
        r0.S0(arrayList, i10, arrayList.size());
        this.f53242u = Math.max(this.f53242u, this.f53232k.size());
        int i11 = 0;
        this.f53234m.u(aVar.g(0));
        while (true) {
            c0[] c0VarArr = this.f53235n;
            if (i11 >= c0VarArr.length) {
                return aVar;
            }
            c0 c0Var = c0VarArr[i11];
            i11++;
            c0Var.u(aVar.g(i11));
        }
    }

    private ta.a r() {
        ArrayList arrayList = this.f53232k;
        return (ta.a) arrayList.get(arrayList.size() - 1);
    }

    private boolean s(int i10) {
        int iC;
        ta.a aVar = (ta.a) this.f53232k.get(i10);
        if (this.f53234m.C() > aVar.g(0)) {
            return true;
        }
        int i11 = 0;
        do {
            c0[] c0VarArr = this.f53235n;
            if (i11 >= c0VarArr.length) {
                return false;
            }
            iC = c0VarArr[i11].C();
            i11++;
        } while (iC <= aVar.g(i11));
        return true;
    }

    private boolean t(f fVar) {
        return fVar instanceof ta.a;
    }

    private void v() {
        int iA = A(this.f53234m.C(), this.f53242u - 1);
        while (true) {
            int i10 = this.f53242u;
            if (i10 > iA) {
                return;
            }
            this.f53242u = i10 + 1;
            w(i10);
        }
    }

    private void w(int i10) {
        ta.a aVar = (ta.a) this.f53232k.get(i10);
        v0 v0Var = aVar.f53214d;
        if (!v0Var.equals(this.f53238q)) {
            this.f53228g.h(this.f53222a, v0Var, aVar.f53215e, aVar.f53216f, aVar.f53217g);
        }
        this.f53238q = v0Var;
    }

    public void B() {
        C(null);
    }

    public void C(b bVar) {
        this.f53239r = bVar;
        this.f53234m.Q();
        for (c0 c0Var : this.f53235n) {
            c0Var.Q();
        }
        this.f53230i.l(this);
    }

    public void E(long j10) throws Throwable {
        ta.a aVar;
        boolean zY;
        this.f53241t = j10;
        if (u()) {
            this.f53240s = j10;
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < this.f53232k.size()) {
                aVar = (ta.a) this.f53232k.get(i11);
                long j11 = aVar.f53217g;
                if (j11 == j10 && aVar.f53184k == C.TIME_UNSET) {
                    break;
                } else if (j11 <= j10) {
                    i11++;
                }
            }
            aVar = null;
            break;
        }
        if (aVar != null) {
            zY = this.f53234m.X(aVar.g(0));
        } else {
            zY = this.f53234m.Y(j10, j10 < getNextLoadPositionUs());
        }
        if (zY) {
            this.f53242u = A(this.f53234m.C(), 0);
            c0[] c0VarArr = this.f53235n;
            int length = c0VarArr.length;
            while (i10 < length) {
                c0VarArr[i10].Y(j10, true);
                i10++;
            }
            return;
        }
        this.f53240s = j10;
        this.f53244w = false;
        this.f53232k.clear();
        this.f53242u = 0;
        if (!this.f53230i.i()) {
            this.f53230i.f();
            D();
            return;
        }
        this.f53234m.r();
        c0[] c0VarArr2 = this.f53235n;
        int length2 = c0VarArr2.length;
        while (i10 < length2) {
            c0VarArr2[i10].r();
            i10++;
        }
        this.f53230i.e();
    }

    public a F(long j10, int i10) throws Throwable {
        for (int i11 = 0; i11 < this.f53235n.length; i11++) {
            if (this.f53223b[i11] == i10) {
                ob.a.g(!this.f53225d[i11]);
                this.f53225d[i11] = true;
                this.f53235n[i11].Y(j10, true);
                return new a(this, this.f53235n[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // ra.s
    public int a(o9.p pVar, DecoderInputBuffer decoderInputBuffer, int i10) {
        if (u()) {
            return -3;
        }
        ta.a aVar = this.f53243v;
        if (aVar != null && aVar.g(0) <= this.f53234m.C()) {
            return -3;
        }
        v();
        return this.f53234m.R(pVar, decoderInputBuffer, i10, this.f53244w);
    }

    public long b(long j10, j0 j0Var) {
        return this.f53226e.b(j10, j0Var);
    }

    @Override // com.google.android.exoplayer2.source.d0
    public boolean continueLoading(long j10) {
        List list;
        long j11;
        if (this.f53244w || this.f53230i.i() || this.f53230i.h()) {
            return false;
        }
        boolean zU = u();
        if (zU) {
            list = Collections.EMPTY_LIST;
            j11 = this.f53240s;
        } else {
            list = this.f53233l;
            j11 = r().f53218h;
        }
        this.f53226e.g(j10, j11, list, this.f53231j);
        h hVar = this.f53231j;
        boolean z10 = hVar.f53221b;
        f fVar = hVar.f53220a;
        hVar.a();
        if (z10) {
            this.f53240s = C.TIME_UNSET;
            this.f53244w = true;
            return true;
        }
        if (fVar == null) {
            return false;
        }
        this.f53237p = fVar;
        if (t(fVar)) {
            ta.a aVar = (ta.a) fVar;
            if (zU) {
                long j12 = aVar.f53217g;
                long j13 = this.f53240s;
                if (j12 != j13) {
                    this.f53234m.a0(j13);
                    for (c0 c0Var : this.f53235n) {
                        c0Var.a0(this.f53240s);
                    }
                }
                this.f53240s = C.TIME_UNSET;
            }
            aVar.i(this.f53236o);
            this.f53232k.add(aVar);
        } else if (fVar instanceof m) {
            ((m) fVar).e(this.f53236o);
        }
        this.f53228g.t(new ra.i(fVar.f53211a, fVar.f53212b, this.f53230i.m(fVar, this, this.f53229h.a(fVar.f53213c))), fVar.f53213c, this.f53222a, fVar.f53214d, fVar.f53215e, fVar.f53216f, fVar.f53217g, fVar.f53218h);
        return true;
    }

    public void discardBuffer(long j10, boolean z10) {
        if (u()) {
            return;
        }
        int iX = this.f53234m.x();
        this.f53234m.q(j10, z10, true);
        int iX2 = this.f53234m.x();
        if (iX2 > iX) {
            long jY = this.f53234m.y();
            int i10 = 0;
            while (true) {
                c0[] c0VarArr = this.f53235n;
                if (i10 >= c0VarArr.length) {
                    break;
                }
                c0VarArr[i10].q(jY, z10, this.f53225d[i10]);
                i10++;
            }
        }
        m(iX2);
    }

    @Override // com.google.android.exoplayer2.source.d0
    public long getBufferedPositionUs() {
        if (this.f53244w) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.f53240s;
        }
        long jMax = this.f53241t;
        ta.a aVarR = r();
        if (!aVarR.f()) {
            if (this.f53232k.size() > 1) {
                ArrayList arrayList = this.f53232k;
                aVarR = (ta.a) arrayList.get(arrayList.size() - 2);
            } else {
                aVarR = null;
            }
        }
        if (aVarR != null) {
            jMax = Math.max(jMax, aVarR.f53218h);
        }
        return Math.max(jMax, this.f53234m.z());
    }

    @Override // com.google.android.exoplayer2.source.d0
    public long getNextLoadPositionUs() {
        if (u()) {
            return this.f53240s;
        }
        if (this.f53244w) {
            return Long.MIN_VALUE;
        }
        return r().f53218h;
    }

    @Override // com.google.android.exoplayer2.source.d0
    public boolean isLoading() {
        return this.f53230i.i();
    }

    @Override // ra.s
    public boolean isReady() {
        return !u() && this.f53234m.K(this.f53244w);
    }

    @Override // ra.s
    public void maybeThrowError() throws IOException {
        this.f53230i.maybeThrowError();
        this.f53234m.M();
        if (this.f53230i.i()) {
            return;
        }
        this.f53226e.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void onLoaderReleased() {
        this.f53234m.S();
        for (c0 c0Var : this.f53235n) {
            c0Var.S();
        }
        this.f53226e.release();
        b bVar = this.f53239r;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public j q() {
        return this.f53226e;
    }

    @Override // com.google.android.exoplayer2.source.d0
    public void reevaluateBuffer(long j10) {
        if (this.f53230i.h() || u()) {
            return;
        }
        if (!this.f53230i.i()) {
            int preferredQueueSize = this.f53226e.getPreferredQueueSize(j10, this.f53233l);
            if (preferredQueueSize < this.f53232k.size()) {
                o(preferredQueueSize);
                return;
            }
            return;
        }
        f fVar = (f) ob.a.e(this.f53237p);
        if (!(t(fVar) && s(this.f53232k.size() - 1)) && this.f53226e.c(j10, fVar, this.f53233l)) {
            this.f53230i.e();
            if (t(fVar)) {
                this.f53243v = (ta.a) fVar;
            }
        }
    }

    @Override // ra.s
    public int skipData(long j10) throws Throwable {
        if (u()) {
            return 0;
        }
        int iE = this.f53234m.E(j10, this.f53244w);
        ta.a aVar = this.f53243v;
        if (aVar != null) {
            iE = Math.min(iE, aVar.g(0) - this.f53234m.C());
        }
        this.f53234m.d0(iE);
        v();
        return iE;
    }

    boolean u() {
        return this.f53240s != C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void e(f fVar, long j10, long j11, boolean z10) {
        this.f53237p = null;
        this.f53243v = null;
        ra.i iVar = new ra.i(fVar.f53211a, fVar.f53212b, fVar.d(), fVar.c(), j10, j11, fVar.a());
        this.f53229h.b(fVar.f53211a);
        this.f53228g.k(iVar, fVar.f53213c, this.f53222a, fVar.f53214d, fVar.f53215e, fVar.f53216f, fVar.f53217g, fVar.f53218h);
        if (z10) {
            return;
        }
        if (u()) {
            D();
        } else if (t(fVar)) {
            p(this.f53232k.size() - 1);
            if (this.f53232k.isEmpty()) {
                this.f53240s = this.f53241t;
            }
        }
        this.f53227f.c(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(f fVar, long j10, long j11) {
        this.f53237p = null;
        this.f53226e.e(fVar);
        ra.i iVar = new ra.i(fVar.f53211a, fVar.f53212b, fVar.d(), fVar.c(), j10, j11, fVar.a());
        this.f53229h.b(fVar.f53211a);
        this.f53228g.n(iVar, fVar.f53213c, this.f53222a, fVar.f53214d, fVar.f53215e, fVar.f53216f, fVar.f53217g, fVar.f53218h);
        this.f53227f.c(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Loader.c n(f fVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarG;
        long jA = fVar.a();
        boolean zT = t(fVar);
        int size = this.f53232k.size() - 1;
        boolean z10 = (jA != 0 && zT && s(size)) ? false : true;
        ra.i iVar = new ra.i(fVar.f53211a, fVar.f53212b, fVar.d(), fVar.c(), j10, j11, jA);
        com.google.android.exoplayer2.upstream.c.C0294c c0294c = new com.google.android.exoplayer2.upstream.c.C0294c(iVar, new ra.j(fVar.f53213c, this.f53222a, fVar.f53214d, fVar.f53215e, fVar.f53216f, r0.i1(fVar.f53217g), r0.i1(fVar.f53218h)), iOException, i10);
        if (!this.f53226e.h(fVar, z10, c0294c, this.f53229h)) {
            cVarG = null;
        } else if (z10) {
            cVarG = Loader.f18745f;
            if (zT) {
                ob.a.g(p(size) == fVar);
                if (this.f53232k.isEmpty()) {
                    this.f53240s = this.f53241t;
                }
            }
        } else {
            u.i("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            cVarG = null;
        }
        if (cVarG == null) {
            long jC = this.f53229h.c(c0294c);
            cVarG = jC != C.TIME_UNSET ? Loader.g(false, jC) : Loader.f18746g;
        }
        boolean zC = cVarG.c();
        this.f53228g.p(iVar, fVar.f53213c, this.f53222a, fVar.f53214d, fVar.f53215e, fVar.f53216f, fVar.f53217g, fVar.f53218h, iOException, !zC);
        if (!zC) {
            this.f53237p = null;
            this.f53229h.b(fVar.f53211a);
            this.f53227f.c(this);
        }
        return cVarG;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f53245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c0 f53246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f53247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f53248d;

        public a(i iVar, c0 c0Var, int i10) {
            this.f53245a = iVar;
            this.f53246b = c0Var;
            this.f53247c = i10;
        }

        private void b() {
            if (this.f53248d) {
                return;
            }
            i.this.f53228g.h(i.this.f53223b[this.f53247c], i.this.f53224c[this.f53247c], 0, null, i.this.f53241t);
            this.f53248d = true;
        }

        @Override // ra.s
        public int a(o9.p pVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (i.this.u()) {
                return -3;
            }
            if (i.this.f53243v != null && i.this.f53243v.g(this.f53247c + 1) <= this.f53246b.C()) {
                return -3;
            }
            b();
            return this.f53246b.R(pVar, decoderInputBuffer, i10, i.this.f53244w);
        }

        public void c() {
            ob.a.g(i.this.f53225d[this.f53247c]);
            i.this.f53225d[this.f53247c] = false;
        }

        @Override // ra.s
        public boolean isReady() {
            return !i.this.u() && this.f53246b.K(i.this.f53244w);
        }

        @Override // ra.s
        public int skipData(long j10) throws Throwable {
            if (i.this.u()) {
                return 0;
            }
            int iE = this.f53246b.E(j10, i.this.f53244w);
            if (i.this.f53243v != null) {
                iE = Math.min(iE, i.this.f53243v.g(this.f53247c + 1) - this.f53246b.C());
            }
            this.f53246b.d0(iE);
            if (iE > 0) {
                b();
            }
            return iE;
        }

        @Override // ra.s
        public void maybeThrowError() {
        }
    }
}
