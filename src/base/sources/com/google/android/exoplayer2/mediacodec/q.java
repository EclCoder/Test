package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.q;
import java.io.IOException;
import java.nio.ByteBuffer;
import ob.o0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f17307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer[] f17308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f17309c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b implements j.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.mediacodec.q$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // com.google.android.exoplayer2.mediacodec.j.b
        public j a(j.a aVar) throws Throwable {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec mediaCodecB = b(aVar);
                try {
                    o0.a("configureCodec");
                    mediaCodecB.configure(aVar.f17288b, aVar.f17290d, aVar.f17291e, aVar.f17292f);
                    o0.c();
                    o0.a("startCodec");
                    mediaCodecB.start();
                    o0.c();
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

        protected MediaCodec b(j.a aVar) throws IOException {
            ob.a.e(aVar.f17287a);
            String str = aVar.f17287a.f17293a;
            o0.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            o0.c();
            return mediaCodecCreateByCodecName;
        }
    }

    public static /* synthetic */ void n(q qVar, j.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        qVar.getClass();
        cVar.a(qVar, j10, j11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void a(int i10, int i11, int i12, long j10, int i13) {
        this.f17307a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void b(Bundle bundle) {
        this.f17307a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public MediaFormat c() {
        return this.f17307a.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public ByteBuffer d(int i10) {
        return r0.f48425a >= 21 ? this.f17307a.getInputBuffer(i10) : ((ByteBuffer[]) r0.j(this.f17308b))[i10];
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void e(Surface surface) {
        this.f17307a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public boolean f() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void flush() {
        this.f17307a.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void g(int i10, long j10) {
        this.f17307a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public int h() {
        return this.f17307a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public int i(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f17307a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && r0.f48425a < 21) {
                this.f17309c = this.f17307a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void j(final j.c cVar, Handler handler) {
        this.f17307a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: ga.d
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                q.n(this.f39036a, cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void k(int i10, boolean z10) {
        this.f17307a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public ByteBuffer l(int i10) {
        return r0.f48425a >= 21 ? this.f17307a.getOutputBuffer(i10) : ((ByteBuffer[]) r0.j(this.f17309c))[i10];
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void m(int i10, int i11, s9.c cVar, long j10, int i12) {
        this.f17307a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void release() {
        this.f17308b = null;
        this.f17309c = null;
        this.f17307a.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void setVideoScalingMode(int i10) {
        this.f17307a.setVideoScalingMode(i10);
    }

    private q(MediaCodec mediaCodec) {
        this.f17307a = mediaCodec;
        if (r0.f48425a < 21) {
            this.f17308b = mediaCodec.getInputBuffers();
            this.f17309c = mediaCodec.getOutputBuffers();
        }
    }
}
