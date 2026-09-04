package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f17262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f17263c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MediaFormat f17268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaFormat f17269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f17270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f17271k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IllegalStateException f17273m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f17261a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f17264d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f17265e = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f17266f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f17267g = new ArrayDeque();

    e(HandlerThread handlerThread) {
        this.f17262b = handlerThread;
    }

    private void b(MediaFormat mediaFormat) {
        this.f17265e.a(-2);
        this.f17267g.add(mediaFormat);
    }

    private void f() {
        if (!this.f17267g.isEmpty()) {
            this.f17269i = (MediaFormat) this.f17267g.getLast();
        }
        this.f17264d.b();
        this.f17265e.b();
        this.f17266f.clear();
        this.f17267g.clear();
    }

    private boolean i() {
        return this.f17271k > 0 || this.f17272l;
    }

    private void j() {
        k();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f17273m;
        if (illegalStateException == null) {
            return;
        }
        this.f17273m = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CodecException codecException = this.f17270j;
        if (codecException == null) {
            return;
        }
        this.f17270j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        synchronized (this.f17261a) {
            try {
                if (this.f17272l) {
                    return;
                }
                long j10 = this.f17271k - 1;
                this.f17271k = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 < 0) {
                    n(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void n(IllegalStateException illegalStateException) {
        synchronized (this.f17261a) {
            this.f17273m = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f17261a) {
            try {
                j();
                int iE = -1;
                if (i()) {
                    return -1;
                }
                if (!this.f17264d.d()) {
                    iE = this.f17264d.e();
                }
                return iE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f17261a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.f17265e.d()) {
                    return -1;
                }
                int iE = this.f17265e.e();
                if (iE >= 0) {
                    ob.a.i(this.f17268h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f17266f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iE == -2) {
                    this.f17268h = (MediaFormat) this.f17267g.remove();
                }
                return iE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        synchronized (this.f17261a) {
            this.f17271k++;
            ((Handler) r0.j(this.f17263c)).post(new Runnable() { // from class: com.google.android.exoplayer2.mediacodec.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17260a.m();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f17261a) {
            try {
                mediaFormat = this.f17268h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        ob.a.g(this.f17263c == null);
        this.f17262b.start();
        Handler handler = new Handler(this.f17262b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f17263c = handler;
    }

    public void o() {
        synchronized (this.f17261a) {
            this.f17272l = true;
            this.f17262b.quit();
            f();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f17261a) {
            this.f17270j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f17261a) {
            this.f17264d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f17261a) {
            try {
                MediaFormat mediaFormat = this.f17269i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f17269i = null;
                }
                this.f17265e.a(i10);
                this.f17266f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f17261a) {
            b(mediaFormat);
            this.f17269i = null;
        }
    }
}
