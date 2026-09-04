package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.f1;
import androidx.media3.exoplayer.i1;
import androidx.media3.exoplayer.j2;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements q, q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f5813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q.a f5814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a[] f5815c = new a[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f5816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f5817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f5818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ClippingMediaSource.IllegalClippingException f5819g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a implements i2.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i2.q f5820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f5821b;

        public a(i2.q qVar) {
            this.f5820a = qVar;
        }

        @Override // i2.q
        public int a(f1 f1Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (b.this.h()) {
                return -3;
            }
            if (this.f5821b) {
                decoderInputBuffer.i(4);
                return -4;
            }
            long bufferedPositionUs = b.this.getBufferedPositionUs();
            int iA = this.f5820a.a(f1Var, decoderInputBuffer, i10);
            if (iA == -5) {
                t1.o oVar = (t1.o) w1.a.e(f1Var.f5339b);
                int i11 = oVar.E;
                if (i11 != 0 || oVar.F != 0) {
                    b bVar = b.this;
                    if (bVar.f5817e != 0) {
                        i11 = 0;
                    }
                    f1Var.f5339b = oVar.a().V(i11).W(bVar.f5818f == Long.MIN_VALUE ? oVar.F : 0).K();
                }
                return -5;
            }
            long j10 = b.this.f5818f;
            if (j10 == Long.MIN_VALUE || ((iA != -4 || decoderInputBuffer.f4866f < j10) && !(iA == -3 && bufferedPositionUs == Long.MIN_VALUE && !decoderInputBuffer.f4865e))) {
                return iA;
            }
            decoderInputBuffer.b();
            decoderInputBuffer.i(4);
            this.f5821b = true;
            return -4;
        }

        public void b() {
            this.f5821b = false;
        }

        @Override // i2.q
        public boolean isReady() {
            return !b.this.h() && this.f5820a.isReady();
        }

        @Override // i2.q
        public void maybeThrowError() {
            this.f5820a.maybeThrowError();
        }

        @Override // i2.q
        public int skipData(long j10) {
            if (b.this.h()) {
                return -3;
            }
            return this.f5820a.skipData(j10);
        }
    }

    public b(q qVar, boolean z10, long j10, long j11) {
        this.f5813a = qVar;
        this.f5816d = z10 ? j10 : C.TIME_UNSET;
        this.f5817e = j10;
        this.f5818f = j11;
    }

    private j2 b(long j10, j2 j2Var) {
        long jP = w1.c0.p(j2Var.f5412a, 0L, j10 - this.f5817e);
        long j11 = j2Var.f5413b;
        long j12 = this.f5818f;
        long jP2 = w1.c0.p(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (jP == j2Var.f5412a && jP2 == j2Var.f5413b) ? j2Var : new j2(jP, jP2);
    }

    private static boolean k(long j10, k2.q[] qVarArr) {
        if (j10 != 0) {
            for (k2.q qVar : qVarArr) {
                if (qVar != null) {
                    t1.o selectedFormat = qVar.getSelectedFormat();
                    if (!t1.v.a(selectedFormat.f52757n, selectedFormat.f52753j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean a(i1 i1Var) {
        return this.f5813a.a(i1Var);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long c(long j10, j2 j2Var) {
        long j11 = this.f5817e;
        if (j10 == j11) {
            return j11;
        }
        return this.f5813a.c(j10, b(j10, j2Var));
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void d(q qVar) {
        if (this.f5819g != null) {
            return;
        }
        ((q.a) w1.a.e(this.f5814b)).d(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void discardBuffer(long j10, boolean z10) {
        this.f5813a.discardBuffer(j10, z10);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    @Override // androidx.media3.exoplayer.source.q
    public long f(k2.q[] qVarArr, boolean[] zArr, i2.q[] qVarArr2, boolean[] zArr2, long j10) {
        long j11;
        boolean z10;
        this.f5815c = new a[qVarArr2.length];
        i2.q[] qVarArr3 = new i2.q[qVarArr2.length];
        int i10 = 0;
        while (true) {
            i2.q qVar = null;
            if (i10 >= qVarArr2.length) {
                break;
            }
            a[] aVarArr = this.f5815c;
            a aVar = (a) qVarArr2[i10];
            aVarArr[i10] = aVar;
            if (aVar != null) {
                qVar = aVar.f5820a;
            }
            qVarArr3[i10] = qVar;
            i10++;
        }
        long jF = this.f5813a.f(qVarArr, zArr, qVarArr3, zArr2, j10);
        if (h()) {
            long j12 = this.f5817e;
            if (j10 == j12 && k(j12, qVarArr)) {
                j11 = jF;
            } else {
                j11 = C.TIME_UNSET;
            }
        } else {
            j11 = C.TIME_UNSET;
        }
        this.f5816d = j11;
        if (jF != j10) {
            if (jF >= this.f5817e) {
                long j13 = this.f5818f;
                z10 = j13 == Long.MIN_VALUE || jF <= j13;
            }
        }
        w1.a.g(z10);
        for (int i11 = 0; i11 < qVarArr2.length; i11++) {
            i2.q qVar2 = qVarArr3[i11];
            if (qVar2 == null) {
                this.f5815c[i11] = null;
            } else {
                a[] aVarArr2 = this.f5815c;
                a aVar2 = aVarArr2[i11];
                if (aVar2 == null || aVar2.f5820a != qVar2) {
                    aVarArr2[i11] = new a(qVar2);
                }
            }
            qVarArr2[i11] = this.f5815c[i11];
        }
        return jF;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void g(q.a aVar, long j10) {
        this.f5814b = aVar;
        this.f5813a.g(this, j10);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f5813a.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j10 = this.f5818f;
            if (j10 == Long.MIN_VALUE || bufferedPositionUs < j10) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f5813a.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j10 = this.f5818f;
            if (j10 == Long.MIN_VALUE || nextLoadPositionUs < j10) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.q
    public i2.v getTrackGroups() {
        return this.f5813a.getTrackGroups();
    }

    boolean h() {
        return this.f5816d != C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void e(q qVar) {
        ((q.a) w1.a.e(this.f5814b)).e(this);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean isLoading() {
        return this.f5813a.isLoading();
    }

    public void j(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.f5819g = illegalClippingException;
    }

    public void l(long j10, long j11) {
        this.f5817e = j10;
        this.f5818f = j11;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void maybeThrowPrepareError() throws ClippingMediaSource.IllegalClippingException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f5819g;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f5813a.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long readDiscontinuity() {
        if (h()) {
            long j10 = this.f5816d;
            this.f5816d = C.TIME_UNSET;
            long discontinuity = readDiscontinuity();
            return discontinuity != C.TIME_UNSET ? discontinuity : j10;
        }
        long discontinuity2 = this.f5813a.readDiscontinuity();
        if (discontinuity2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        w1.a.g(discontinuity2 >= this.f5817e);
        long j11 = this.f5818f;
        w1.a.g(j11 == Long.MIN_VALUE || discontinuity2 <= j11);
        return discontinuity2;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public void reevaluateBuffer(long j10) {
        this.f5813a.reevaluateBuffer(j10);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // androidx.media3.exoplayer.source.q
    public long seekToUs(long j10) {
        this.f5816d = C.TIME_UNSET;
        boolean z10 = false;
        for (a aVar : this.f5815c) {
            if (aVar != null) {
                aVar.b();
            }
        }
        long jSeekToUs = this.f5813a.seekToUs(j10);
        if (jSeekToUs == j10) {
            z10 = true;
        } else if (jSeekToUs >= this.f5817e) {
            long j11 = this.f5818f;
            if (j11 == Long.MIN_VALUE || jSeekToUs <= j11) {
                z10 = true;
            }
        }
        w1.a.g(z10);
        return jSeekToUs;
    }
}
