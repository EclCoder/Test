package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.f1;
import androidx.media3.exoplayer.i1;
import androidx.media3.exoplayer.j2;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class k implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f6009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i2.v f6010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f6011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f6012d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference f6013e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ListenableFuture f6014f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a implements i2.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f6015a = 0;

        public a() {
        }

        @Override // i2.q
        public int a(f1 f1Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            int i11 = this.f6015a;
            if (i11 == 2) {
                decoderInputBuffer.a(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                f1Var.f5339b = k.this.f6010b.b(0).a(0);
                this.f6015a = 1;
                return -5;
            }
            if (!k.this.f6012d.get()) {
                return -3;
            }
            int length = k.this.f6011c.length;
            decoderInputBuffer.a(1);
            decoderInputBuffer.f4866f = 0L;
            if ((i10 & 4) == 0) {
                decoderInputBuffer.k(length);
                decoderInputBuffer.f4864d.put(k.this.f6011c, 0, length);
            }
            if ((i10 & 1) == 0) {
                this.f6015a = 2;
            }
            return -4;
        }

        @Override // i2.q
        public boolean isReady() {
            return k.this.f6012d.get();
        }

        @Override // i2.q
        public void maybeThrowError() throws IOException {
            Throwable th2 = (Throwable) k.this.f6013e.get();
            if (th2 != null) {
                throw new IOException(th2);
            }
        }

        @Override // i2.q
        public int skipData(long j10) {
            return 0;
        }
    }

    public k(Uri uri, String str, j jVar) {
        this.f6009a = uri;
        this.f6010b = new i2.v(new t1.b0(new t1.o.b().o0(str).K()));
        this.f6011c = uri.toString().getBytes(sc.e.f52294c);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean a(i1 i1Var) {
        return !this.f6012d.get();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long f(k2.q[] qVarArr, boolean[] zArr, i2.q[] qVarArr2, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            if (qVarArr2[i10] != null && (qVarArr[i10] == null || !zArr[i10])) {
                qVarArr2[i10] = null;
            }
            if (qVarArr2[i10] == null && qVarArr[i10] != null) {
                qVarArr2[i10] = new a();
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void g(q.a aVar, long j10) {
        aVar.d(this);
        new j.a(this.f6009a);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long getBufferedPositionUs() {
        return this.f6012d.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long getNextLoadPositionUs() {
        return this.f6012d.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.q
    public i2.v getTrackGroups() {
        return this.f6010b;
    }

    public void i() {
        ListenableFuture listenableFuture = this.f6014f;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean isLoading() {
        return !this.f6012d.get();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void maybeThrowPrepareError() {
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public void reevaluateBuffer(long j10) {
    }

    @Override // androidx.media3.exoplayer.source.q
    public long seekToUs(long j10) {
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long c(long j10, j2 j2Var) {
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void discardBuffer(long j10, boolean z10) {
    }
}
