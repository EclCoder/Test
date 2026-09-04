package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import ob.o0;
import sc.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f17236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f17237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f17238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f17239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17241f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0282b implements j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f17242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x f17243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f17244c;

        public C0282b(final int i10, boolean z10) {
            this(new x() { // from class: ga.a
                @Override // sc.x
                public final Object get() {
                    return com.google.android.exoplayer2.mediacodec.b.C0282b.b(i10);
                }
            }, new x() { // from class: ga.b
                @Override // sc.x
                public final Object get() {
                    return com.google.android.exoplayer2.mediacodec.b.C0282b.c(i10);
                }
            }, z10);
        }

        public static /* synthetic */ HandlerThread b(int i10) {
            return new HandlerThread(b.r(i10));
        }

        public static /* synthetic */ HandlerThread c(int i10) {
            return new HandlerThread(b.s(i10));
        }

        @Override // com.google.android.exoplayer2.mediacodec.j.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a(j.a aVar) throws Exception {
            Exception exc;
            MediaCodec mediaCodecCreateByCodecName;
            String str = aVar.f17287a.f17293a;
            b bVar = null;
            try {
                o0.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    b bVar2 = new b(mediaCodecCreateByCodecName, (HandlerThread) this.f17242a.get(), (HandlerThread) this.f17243b.get(), this.f17244c);
                    try {
                        o0.c();
                        bVar2.u(aVar.f17288b, aVar.f17290d, aVar.f17291e, aVar.f17292f);
                        return bVar2;
                    } catch (Exception e10) {
                        exc = e10;
                        bVar = bVar2;
                        if (bVar != null) {
                            bVar.release();
                            throw exc;
                        }
                        if (mediaCodecCreateByCodecName == null) {
                            throw exc;
                        }
                        mediaCodecCreateByCodecName.release();
                        throw exc;
                    }
                } catch (Exception e11) {
                    exc = e11;
                }
            } catch (Exception e12) {
                exc = e12;
                mediaCodecCreateByCodecName = null;
            }
        }

        C0282b(x xVar, x xVar2, boolean z10) {
            this.f17242a = xVar;
            this.f17243b = xVar2;
            this.f17244c = z10;
        }
    }

    public static /* synthetic */ void n(b bVar, j.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        bVar.getClass();
        cVar.a(bVar, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String r(int i10) {
        return t(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String s(int i10) {
        return t(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String t(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f17237b.h(this.f17236a);
        o0.a("configureCodec");
        this.f17236a.configure(mediaFormat, surface, mediaCrypto, i10);
        o0.c();
        this.f17238c.q();
        o0.a("startCodec");
        this.f17236a.start();
        o0.c();
        this.f17241f = 1;
    }

    private void v() {
        if (this.f17239d) {
            try {
                this.f17238c.r();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void a(int i10, int i11, int i12, long j10, int i13) {
        this.f17238c.m(i10, i11, i12, j10, i13);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void b(Bundle bundle) {
        v();
        this.f17236a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public MediaFormat c() {
        return this.f17237b.g();
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public ByteBuffer d(int i10) {
        return this.f17236a.getInputBuffer(i10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void e(Surface surface) {
        v();
        this.f17236a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public boolean f() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void flush() {
        this.f17238c.i();
        this.f17236a.flush();
        this.f17237b.e();
        this.f17236a.start();
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void g(int i10, long j10) {
        this.f17236a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public int h() {
        this.f17238c.l();
        return this.f17237b.c();
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public int i(MediaCodec.BufferInfo bufferInfo) {
        this.f17238c.l();
        return this.f17237b.d(bufferInfo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void j(final j.c cVar, Handler handler) {
        v();
        this.f17236a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.google.android.exoplayer2.mediacodec.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                b.n(this.f17234a, cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void k(int i10, boolean z10) {
        this.f17236a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public ByteBuffer l(int i10) {
        return this.f17236a.getOutputBuffer(i10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void m(int i10, int i11, s9.c cVar, long j10, int i12) {
        this.f17238c.n(i10, i11, cVar, j10, i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void release() {
        try {
            if (this.f17241f == 1) {
                this.f17238c.p();
                this.f17237b.o();
            }
            this.f17241f = 2;
        } finally {
            if (!this.f17240e) {
                this.f17236a.release();
                this.f17240e = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void setVideoScalingMode(int i10) {
        v();
        this.f17236a.setVideoScalingMode(i10);
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f17236a = mediaCodec;
        this.f17237b = new e(handlerThread);
        this.f17238c = new c(mediaCodec, handlerThread2);
        this.f17239d = z10;
        this.f17241f = 0;
    }
}
