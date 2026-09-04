package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.f1;
import androidx.media3.exoplayer.i1;
import androidx.media3.exoplayer.j2;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class k0 implements q, q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f6017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f6018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q.a f6019c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements i2.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i2.q f6020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f6021b;

        public a(i2.q qVar, long j10) {
            this.f6020a = qVar;
            this.f6021b = j10;
        }

        @Override // i2.q
        public int a(f1 f1Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            int iA = this.f6020a.a(f1Var, decoderInputBuffer, i10);
            if (iA == -4) {
                decoderInputBuffer.f4866f += this.f6021b;
            }
            return iA;
        }

        public i2.q b() {
            return this.f6020a;
        }

        @Override // i2.q
        public boolean isReady() {
            return this.f6020a.isReady();
        }

        @Override // i2.q
        public void maybeThrowError() {
            this.f6020a.maybeThrowError();
        }

        @Override // i2.q
        public int skipData(long j10) {
            return this.f6020a.skipData(j10 - this.f6021b);
        }
    }

    public k0(q qVar, long j10) {
        this.f6017a = qVar;
        this.f6018b = j10;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean a(i1 i1Var) {
        return this.f6017a.a(i1Var.a().f(i1Var.f5395a - this.f6018b).d());
    }

    public q b() {
        return this.f6017a;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long c(long j10, j2 j2Var) {
        return this.f6017a.c(j10 - this.f6018b, j2Var) + this.f6018b;
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void d(q qVar) {
        ((q.a) w1.a.e(this.f6019c)).d(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void discardBuffer(long j10, boolean z10) {
        this.f6017a.discardBuffer(j10 - this.f6018b, z10);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long f(k2.q[] qVarArr, boolean[] zArr, i2.q[] qVarArr2, boolean[] zArr2, long j10) {
        i2.q[] qVarArr3 = new i2.q[qVarArr2.length];
        int i10 = 0;
        while (true) {
            i2.q qVarB = null;
            if (i10 >= qVarArr2.length) {
                break;
            }
            a aVar = (a) qVarArr2[i10];
            if (aVar != null) {
                qVarB = aVar.b();
            }
            qVarArr3[i10] = qVarB;
            i10++;
        }
        long jF = this.f6017a.f(qVarArr, zArr, qVarArr3, zArr2, j10 - this.f6018b);
        for (int i11 = 0; i11 < qVarArr2.length; i11++) {
            i2.q qVar = qVarArr3[i11];
            if (qVar == null) {
                qVarArr2[i11] = null;
            } else {
                i2.q qVar2 = qVarArr2[i11];
                if (qVar2 == null || ((a) qVar2).b() != qVar) {
                    qVarArr2[i11] = new a(qVar, this.f6018b);
                }
            }
        }
        return jF + this.f6018b;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void g(q.a aVar, long j10) {
        this.f6019c = aVar;
        this.f6017a.g(this, j10 - this.f6018b);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f6017a.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.f6018b;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f6017a.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.f6018b;
    }

    @Override // androidx.media3.exoplayer.source.q
    public i2.v getTrackGroups() {
        return this.f6017a.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void e(q qVar) {
        ((q.a) w1.a.e(this.f6019c)).e(this);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean isLoading() {
        return this.f6017a.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.q
    public void maybeThrowPrepareError() {
        this.f6017a.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long readDiscontinuity() {
        long discontinuity = this.f6017a.readDiscontinuity();
        return discontinuity == C.TIME_UNSET ? C.TIME_UNSET : discontinuity + this.f6018b;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public void reevaluateBuffer(long j10) {
        this.f6017a.reevaluateBuffer(j10 - this.f6018b);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long seekToUs(long j10) {
        return this.f6017a.seekToUs(j10 - this.f6018b) + this.f6018b;
    }
}
