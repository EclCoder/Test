package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.q;
import java.io.IOException;
import java.nio.ByteBuffer;
import w1.a0;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class q implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f5632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer[] f5633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f5634c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b implements h.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.mediacodec.q$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // androidx.media3.exoplayer.mediacodec.h.b
        public h a(h.a aVar) throws Throwable {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec mediaCodecB = b(aVar);
                try {
                    a0.a("configureCodec");
                    mediaCodecB.configure(aVar.f5612b, aVar.f5614d, aVar.f5615e, aVar.f5616f);
                    a0.b();
                    a0.a("startCodec");
                    mediaCodecB.start();
                    a0.b();
                    return new q(mediaCodecB);
                } catch (IOException | RuntimeException e10) {
                    e = e10;
                    mediaCodec = mediaCodecB;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e11) {
                e = e11;
            } catch (RuntimeException e12) {
                e = e12;
            }
        }

        protected MediaCodec b(h.a aVar) throws IOException {
            w1.a.e(aVar.f5611a);
            String str = aVar.f5611a.f5617a;
            a0.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            a0.b();
            return mediaCodecCreateByCodecName;
        }
    }

    public static /* synthetic */ void o(q qVar, h.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        qVar.getClass();
        dVar.a(qVar, j10, j11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void a(int i10, int i11, int i12, long j10, int i13) {
        this.f5632a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void b(Bundle bundle) {
        this.f5632a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public MediaFormat c() {
        return this.f5632a.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public ByteBuffer d(int i10) {
        return c0.f55769a >= 21 ? this.f5632a.getInputBuffer(i10) : ((ByteBuffer[]) c0.h(this.f5633b))[i10];
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void e(Surface surface) {
        this.f5632a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public boolean f() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void flush() {
        this.f5632a.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void g(int i10, long j10) {
        this.f5632a.releaseOutputBuffer(i10, j10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public int h() {
        return this.f5632a.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public int i(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f5632a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && c0.f55769a < 21) {
                this.f5634c = this.f5632a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void j(int i10, int i11, b2.c cVar, long j10, int i12) {
        this.f5632a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void k(int i10, boolean z10) {
        this.f5632a.releaseOutputBuffer(i10, z10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public ByteBuffer l(int i10) {
        return c0.f55769a >= 21 ? this.f5632a.getOutputBuffer(i10) : ((ByteBuffer[]) c0.h(this.f5634c))[i10];
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void n(final h.d dVar, Handler handler) {
        this.f5632a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: g2.g
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                q.o(this.f38838a, dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void release() {
        this.f5633b = null;
        this.f5634c = null;
        try {
            int i10 = c0.f55769a;
            if (i10 >= 30 && i10 < 33) {
                this.f5632a.stop();
            }
        } finally {
            this.f5632a.release();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void setVideoScalingMode(int i10) {
        this.f5632a.setVideoScalingMode(i10);
    }

    private q(MediaCodec mediaCodec) {
        this.f5632a = mediaCodec;
        if (c0.f55769a < 21) {
            this.f5633b = mediaCodec.getInputBuffers();
            this.f5634c = mediaCodec.getOutputBuffers();
        }
    }
}
