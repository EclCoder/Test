package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.source.d0;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import lb.r;
import nb.a0;
import nb.f;
import nb.v;
import o9.j0;
import ra.d;
import ra.s;
import ra.x;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c implements o, d0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b.a f18186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f18187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v f18188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f18189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i.a f18190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.c f18191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q.a f18192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final nb.b f18193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final x f18194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d f18195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private o.a f18196k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.google.android.exoplayer2.source.smoothstreaming.manifest.a f18197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ta.i[] f18198m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d0 f18199n;

    public c(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, b.a aVar2, a0 a0Var, d dVar, f fVar, j jVar, i.a aVar3, com.google.android.exoplayer2.upstream.c cVar, q.a aVar4, v vVar, nb.b bVar) {
        this.f18197l = aVar;
        this.f18186a = aVar2;
        this.f18187b = a0Var;
        this.f18188c = vVar;
        this.f18189d = jVar;
        this.f18190e = aVar3;
        this.f18191f = cVar;
        this.f18192g = aVar4;
        this.f18193h = bVar;
        this.f18195j = dVar;
        this.f18194i = h(aVar, jVar);
        ta.i[] iVarArrI = i(0);
        this.f18198m = iVarArrI;
        this.f18199n = dVar.a(iVarArrI);
    }

    private ta.i a(r rVar, long j10) {
        int iC = this.f18194i.c(rVar.getTrackGroup());
        return new ta.i(this.f18197l.f18237f[iC].f18243a, null, null, this.f18186a.a(this.f18188c, this.f18197l, iC, rVar, this.f18187b, null), this, this.f18193h, j10, this.f18189d, this.f18190e, this.f18191f, this.f18192g);
    }

    private static x h(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, j jVar) {
        ra.v[] vVarArr = new ra.v[aVar.f18237f.length];
        int i10 = 0;
        while (true) {
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b[] bVarArr = aVar.f18237f;
            if (i10 >= bVarArr.length) {
                return new x(vVarArr);
            }
            v0[] v0VarArr = bVarArr[i10].f18252j;
            v0[] v0VarArr2 = new v0[v0VarArr.length];
            for (int i11 = 0; i11 < v0VarArr.length; i11++) {
                v0 v0Var = v0VarArr[i11];
                v0VarArr2[i11] = v0Var.c(jVar.b(v0Var));
            }
            vVarArr[i10] = new ra.v(Integer.toString(i10), v0VarArr2);
            i10++;
        }
    }

    private static ta.i[] i(int i10) {
        return new ta.i[i10];
    }

    @Override // com.google.android.exoplayer2.source.o
    public long b(long j10, j0 j0Var) {
        for (ta.i iVar : this.f18198m) {
            if (iVar.f53222a == 2) {
                return iVar.b(j10, j0Var);
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean continueLoading(long j10) {
        return this.f18199n.continueLoading(j10);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void d(o.a aVar, long j10) {
        this.f18196k = aVar;
        aVar.g(this);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void discardBuffer(long j10, boolean z10) {
        for (ta.i iVar : this.f18198m) {
            iVar.discardBuffer(j10, z10);
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public long f(r[] rVarArr, boolean[] zArr, s[] sVarArr, boolean[] zArr2, long j10) {
        r rVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            s sVar = sVarArr[i10];
            if (sVar != null) {
                ta.i iVar = (ta.i) sVar;
                if (rVarArr[i10] == null || !zArr[i10]) {
                    iVar.B();
                    sVarArr[i10] = null;
                } else {
                    ((b) iVar.q()).a(rVarArr[i10]);
                    arrayList.add(iVar);
                }
            }
            if (sVarArr[i10] == null && (rVar = rVarArr[i10]) != null) {
                ta.i iVarA = a(rVar, j10);
                arrayList.add(iVarA);
                sVarArr[i10] = iVarA;
                zArr2[i10] = true;
            }
        }
        ta.i[] iVarArrI = i(arrayList.size());
        this.f18198m = iVarArrI;
        arrayList.toArray(iVarArrI);
        this.f18199n = this.f18195j.a(this.f18198m);
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getBufferedPositionUs() {
        return this.f18199n.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getNextLoadPositionUs() {
        return this.f18199n.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.o
    public x getTrackGroups() {
        return this.f18194i;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean isLoading() {
        return this.f18199n.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.d0.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void c(ta.i iVar) {
        this.f18196k.c(this);
    }

    public void k() {
        for (ta.i iVar : this.f18198m) {
            iVar.B();
        }
        this.f18196k = null;
    }

    public void l(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar) {
        this.f18197l = aVar;
        for (ta.i iVar : this.f18198m) {
            ((b) iVar.q()).f(aVar);
        }
        this.f18196k.c(this);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void maybeThrowPrepareError() {
        this.f18188c.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.source.o
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public void reevaluateBuffer(long j10) {
        this.f18199n.reevaluateBuffer(j10);
    }

    @Override // com.google.android.exoplayer2.source.o
    public long seekToUs(long j10) throws Throwable {
        for (ta.i iVar : this.f18198m) {
            iVar.E(j10);
        }
        return j10;
    }
}
