package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.i1;
import androidx.media3.exoplayer.j2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class o implements q, q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r.b f6033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f6034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l2.b f6035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r f6036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q f6037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q.a f6038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f6039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f6041i = C.TIME_UNSET;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(r.b bVar, IOException iOException);

        void b(r.b bVar);
    }

    public o(r.b bVar, l2.b bVar2, long j10) {
        this.f6033a = bVar;
        this.f6035c = bVar2;
        this.f6034b = j10;
    }

    private long j(long j10) {
        long j11 = this.f6041i;
        return j11 != C.TIME_UNSET ? j11 : j10;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean a(i1 i1Var) {
        q qVar = this.f6037e;
        return qVar != null && qVar.a(i1Var);
    }

    public void b(r.b bVar) {
        long j10 = j(this.f6034b);
        q qVarF = ((r) w1.a.e(this.f6036d)).f(bVar, this.f6035c, j10);
        this.f6037e = qVarF;
        if (this.f6038f != null) {
            qVarF.g(this, j10);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long c(long j10, j2 j2Var) {
        return ((q) w1.c0.h(this.f6037e)).c(j10, j2Var);
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void d(q qVar) {
        ((q.a) w1.c0.h(this.f6038f)).d(this);
        a aVar = this.f6039g;
        if (aVar != null) {
            aVar.b(this.f6033a);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public void discardBuffer(long j10, boolean z10) {
        ((q) w1.c0.h(this.f6037e)).discardBuffer(j10, z10);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long f(k2.q[] qVarArr, boolean[] zArr, i2.q[] qVarArr2, boolean[] zArr2, long j10) {
        long j11 = this.f6041i;
        long j12 = (j11 == C.TIME_UNSET || j10 != this.f6034b) ? j10 : j11;
        this.f6041i = C.TIME_UNSET;
        return ((q) w1.c0.h(this.f6037e)).f(qVarArr, zArr, qVarArr2, zArr2, j12);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void g(q.a aVar, long j10) {
        this.f6038f = aVar;
        q qVar = this.f6037e;
        if (qVar != null) {
            qVar.g(this, j(this.f6034b));
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long getBufferedPositionUs() {
        return ((q) w1.c0.h(this.f6037e)).getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long getNextLoadPositionUs() {
        return ((q) w1.c0.h(this.f6037e)).getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.q
    public i2.v getTrackGroups() {
        return ((q) w1.c0.h(this.f6037e)).getTrackGroups();
    }

    public long h() {
        return this.f6041i;
    }

    public long i() {
        return this.f6034b;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean isLoading() {
        q qVar = this.f6037e;
        return qVar != null && qVar.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void e(q qVar) {
        ((q.a) w1.c0.h(this.f6038f)).e(this);
    }

    public void l(long j10) {
        this.f6041i = j10;
    }

    public void m() {
        if (this.f6037e != null) {
            ((r) w1.a.e(this.f6036d)).j(this.f6037e);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public void maybeThrowPrepareError() throws IOException {
        try {
            q qVar = this.f6037e;
            if (qVar != null) {
                qVar.maybeThrowPrepareError();
                return;
            }
            r rVar = this.f6036d;
            if (rVar != null) {
                rVar.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e10) {
            a aVar = this.f6039g;
            if (aVar == null) {
                throw e10;
            }
            if (this.f6040h) {
                return;
            }
            this.f6040h = true;
            aVar.a(this.f6033a, e10);
        }
    }

    public void n(r rVar) {
        w1.a.g(this.f6036d == null);
        this.f6036d = rVar;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long readDiscontinuity() {
        return ((q) w1.c0.h(this.f6037e)).readDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public void reevaluateBuffer(long j10) {
        ((q) w1.c0.h(this.f6037e)).reevaluateBuffer(j10);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long seekToUs(long j10) {
        return ((q) w1.c0.h(this.f6037e)).seekToUs(j10);
    }
}
