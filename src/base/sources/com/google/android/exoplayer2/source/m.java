package com.google.android.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import o9.j0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements o, o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.b f17853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f17854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nb.b f17855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p f17856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o f17857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o.a f17858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f17859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f17861i = C.TIME_UNSET;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(p.b bVar);

        void b(p.b bVar, IOException iOException);
    }

    public m(p.b bVar, nb.b bVar2, long j10) {
        this.f17853a = bVar;
        this.f17855c = bVar2;
        this.f17854b = j10;
    }

    private long j(long j10) {
        long j11 = this.f17861i;
        return j11 != C.TIME_UNSET ? j11 : j10;
    }

    public void a(p.b bVar) {
        long j10 = j(this.f17854b);
        o oVarO = ((p) ob.a.e(this.f17856d)).o(bVar, this.f17855c, j10);
        this.f17857e = oVarO;
        if (this.f17858f != null) {
            oVarO.d(this, j10);
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public long b(long j10, j0 j0Var) {
        return ((o) r0.j(this.f17857e)).b(j10, j0Var);
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean continueLoading(long j10) {
        o oVar = this.f17857e;
        return oVar != null && oVar.continueLoading(j10);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void d(o.a aVar, long j10) {
        this.f17858f = aVar;
        o oVar = this.f17857e;
        if (oVar != null) {
            oVar.d(this, j(this.f17854b));
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public void discardBuffer(long j10, boolean z10) {
        ((o) r0.j(this.f17857e)).discardBuffer(j10, z10);
    }

    @Override // com.google.android.exoplayer2.source.o
    public long f(lb.r[] rVarArr, boolean[] zArr, ra.s[] sVarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f17861i;
        if (j12 == C.TIME_UNSET || j10 != this.f17854b) {
            j11 = j10;
        } else {
            this.f17861i = C.TIME_UNSET;
            j11 = j12;
        }
        return ((o) r0.j(this.f17857e)).f(rVarArr, zArr, sVarArr, zArr2, j11);
    }

    @Override // com.google.android.exoplayer2.source.o.a
    public void g(o oVar) {
        ((o.a) r0.j(this.f17858f)).g(this);
        a aVar = this.f17859g;
        if (aVar != null) {
            aVar.a(this.f17853a);
        }
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getBufferedPositionUs() {
        return ((o) r0.j(this.f17857e)).getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getNextLoadPositionUs() {
        return ((o) r0.j(this.f17857e)).getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.o
    public ra.x getTrackGroups() {
        return ((o) r0.j(this.f17857e)).getTrackGroups();
    }

    public long h() {
        return this.f17861i;
    }

    public long i() {
        return this.f17854b;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean isLoading() {
        o oVar = this.f17857e;
        return oVar != null && oVar.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.d0.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void c(o oVar) {
        ((o.a) r0.j(this.f17858f)).c(this);
    }

    public void l(long j10) {
        this.f17861i = j10;
    }

    public void m() {
        if (this.f17857e != null) {
            ((p) ob.a.e(this.f17856d)).l(this.f17857e);
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public void maybeThrowPrepareError() throws IOException {
        try {
            o oVar = this.f17857e;
            if (oVar != null) {
                oVar.maybeThrowPrepareError();
                return;
            }
            p pVar = this.f17856d;
            if (pVar != null) {
                pVar.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e10) {
            a aVar = this.f17859g;
            if (aVar == null) {
                throw e10;
            }
            if (this.f17860h) {
                return;
            }
            this.f17860h = true;
            aVar.b(this.f17853a, e10);
        }
    }

    public void n(p pVar) {
        ob.a.g(this.f17856d == null);
        this.f17856d = pVar;
    }

    @Override // com.google.android.exoplayer2.source.o
    public long readDiscontinuity() {
        return ((o) r0.j(this.f17857e)).readDiscontinuity();
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public void reevaluateBuffer(long j10) {
        ((o) r0.j(this.f17857e)).reevaluateBuffer(j10);
    }

    @Override // com.google.android.exoplayer2.source.o
    public long seekToUs(long j10) {
        return ((o) r0.j(this.f17857e)).seekToUs(j10);
    }
}
