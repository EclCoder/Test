package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import sc.x;
import t1.v;
import w1.a0;
import w1.c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f5566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f5567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f5568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5570e;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.mediacodec.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0062b implements h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f5571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x f5572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f5573c;

        public C0062b(final int i10) {
            this(new x() { // from class: g2.a
                @Override // sc.x
                public final Object get() {
                    return androidx.media3.exoplayer.mediacodec.b.C0062b.c(i10);
                }
            }, new x() { // from class: g2.b
                @Override // sc.x
                public final Object get() {
                    return androidx.media3.exoplayer.mediacodec.b.C0062b.b(i10);
                }
            });
        }

        public static /* synthetic */ HandlerThread b(int i10) {
            return new HandlerThread(b.t(i10));
        }

        public static /* synthetic */ HandlerThread c(int i10) {
            return new HandlerThread(b.s(i10));
        }

        private static boolean f(t1.o oVar) {
            int i10 = c0.f55769a;
            if (i10 < 34) {
                return false;
            }
            return i10 >= 35 || v.k(oVar.f52757n);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.mediacodec.b$a] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.media3.exoplayer.mediacodec.b] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v4 */
        @Override // androidx.media3.exoplayer.mediacodec.h.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a(h.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            i cVar;
            String str = aVar.f5611a.f5617a;
            ?? r10 = 0;
            r10 = 0;
            try {
                a0.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    int i10 = aVar.f5616f;
                    if (this.f5573c && f(aVar.f5613c)) {
                        cVar = new r(mediaCodecCreateByCodecName);
                        i10 |= 4;
                    } else {
                        cVar = new c(mediaCodecCreateByCodecName, (HandlerThread) this.f5572b.get());
                    }
                    b bVar = new b(mediaCodecCreateByCodecName, (HandlerThread) this.f5571a.get(), cVar);
                    try {
                        a0.b();
                        bVar.v(aVar.f5612b, aVar.f5614d, aVar.f5615e, i10);
                        return bVar;
                    } catch (Exception e10) {
                        e = e10;
                        r10 = bVar;
                        if (r10 != 0) {
                            r10.release();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                mediaCodecCreateByCodecName = null;
            }
        }

        public void e(boolean z10) {
            this.f5573c = z10;
        }

        C0062b(x xVar, x xVar2) {
            this.f5571a = xVar;
            this.f5572b = xVar2;
            this.f5573c = true;
        }
    }

    public static /* synthetic */ void o(b bVar, h.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        bVar.getClass();
        dVar.a(bVar, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String s(int i10) {
        return u(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String t(int i10) {
        return u(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String u(int i10, String str) {
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
    public void v(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f5567b.h(this.f5566a);
        a0.a("configureCodec");
        this.f5566a.configure(mediaFormat, surface, mediaCrypto, i10);
        a0.b();
        this.f5568c.start();
        a0.a("startCodec");
        this.f5566a.start();
        a0.b();
        this.f5570e = 1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void a(int i10, int i11, int i12, long j10, int i13) {
        this.f5568c.a(i10, i11, i12, j10, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void b(Bundle bundle) {
        this.f5568c.b(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public MediaFormat c() {
        return this.f5567b.g();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public ByteBuffer d(int i10) {
        return this.f5566a.getInputBuffer(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void e(Surface surface) {
        this.f5566a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public boolean f() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void flush() {
        this.f5568c.flush();
        this.f5566a.flush();
        this.f5567b.e();
        this.f5566a.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void g(int i10, long j10) {
        this.f5566a.releaseOutputBuffer(i10, j10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public int h() {
        this.f5568c.c();
        return this.f5567b.c();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public int i(MediaCodec.BufferInfo bufferInfo) {
        this.f5568c.c();
        return this.f5567b.d(bufferInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void j(int i10, int i11, b2.c cVar, long j10, int i12) {
        this.f5568c.j(i10, i11, cVar, j10, i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void k(int i10, boolean z10) {
        this.f5566a.releaseOutputBuffer(i10, z10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public ByteBuffer l(int i10) {
        return this.f5566a.getOutputBuffer(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public boolean m(h.c cVar) {
        this.f5567b.p(cVar);
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void n(final h.d dVar, Handler handler) {
        this.f5566a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: androidx.media3.exoplayer.mediacodec.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                b.o(this.f5564a, dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void release() {
        try {
            if (this.f5570e == 1) {
                this.f5568c.shutdown();
                this.f5567b.q();
            }
            this.f5570e = 2;
            if (this.f5569d) {
                return;
            }
            try {
                int i10 = c0.f55769a;
                if (i10 >= 30 && i10 < 33) {
                    this.f5566a.stop();
                }
            } finally {
                this.f5566a.release();
                this.f5569d = true;
            }
        } catch (Throwable th2) {
            if (!this.f5569d) {
                try {
                    int i11 = c0.f55769a;
                    if (i11 >= 30 && i11 < 33) {
                        this.f5566a.stop();
                    }
                } finally {
                    this.f5566a.release();
                    this.f5569d = true;
                }
            }
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void setVideoScalingMode(int i10) {
        this.f5566a.setVideoScalingMode(i10);
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, i iVar) {
        this.f5566a = mediaCodec;
        this.f5567b = new e(handlerThread);
        this.f5568c = iVar;
        this.f5570e = 0;
    }
}
