package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class e extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f5591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f5592c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MediaFormat f5597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaFormat f5598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f5599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MediaCodec.CryptoException f5600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IllegalStateException f5603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private h.c f5604o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5590a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.collection.e f5593d = new androidx.collection.e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.collection.e f5594e = new androidx.collection.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f5595f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f5596g = new ArrayDeque();

    e(HandlerThread handlerThread) {
        this.f5591b = handlerThread;
    }

    private void b(MediaFormat mediaFormat) {
        this.f5594e.a(-2);
        this.f5596g.add(mediaFormat);
    }

    private void f() {
        if (!this.f5596g.isEmpty()) {
            this.f5598i = (MediaFormat) this.f5596g.getLast();
        }
        this.f5593d.b();
        this.f5594e.b();
        this.f5595f.clear();
        this.f5596g.clear();
    }

    private boolean i() {
        return this.f5601l > 0 || this.f5602m;
    }

    private void j() {
        k();
        m();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f5603n;
        if (illegalStateException == null) {
            return;
        }
        this.f5603n = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CryptoException cryptoException = this.f5600k;
        if (cryptoException == null) {
            return;
        }
        this.f5600k = null;
        throw cryptoException;
    }

    private void m() {
        MediaCodec.CodecException codecException = this.f5599j;
        if (codecException == null) {
            return;
        }
        this.f5599j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        synchronized (this.f5590a) {
            try {
                if (this.f5602m) {
                    return;
                }
                long j10 = this.f5601l - 1;
                this.f5601l = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 < 0) {
                    o(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void o(IllegalStateException illegalStateException) {
        synchronized (this.f5590a) {
            this.f5603n = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f5590a) {
            try {
                j();
                int iE = -1;
                if (i()) {
                    return -1;
                }
                if (!this.f5593d.d()) {
                    iE = this.f5593d.e();
                }
                return iE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f5590a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.f5594e.d()) {
                    return -1;
                }
                int iE = this.f5594e.e();
                if (iE >= 0) {
                    w1.a.i(this.f5597h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f5595f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iE == -2) {
                    this.f5597h = (MediaFormat) this.f5596g.remove();
                }
                return iE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        synchronized (this.f5590a) {
            this.f5601l++;
            ((Handler) c0.h(this.f5592c)).post(new Runnable() { // from class: androidx.media3.exoplayer.mediacodec.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5589a.n();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f5590a) {
            try {
                mediaFormat = this.f5597h;
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
        w1.a.g(this.f5592c == null);
        this.f5591b.start();
        Handler handler = new Handler(this.f5591b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f5592c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f5590a) {
            this.f5600k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f5590a) {
            this.f5599j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f5590a) {
            try {
                this.f5593d.a(i10);
                h.c cVar = this.f5604o;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f5590a) {
            try {
                MediaFormat mediaFormat = this.f5598i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f5598i = null;
                }
                this.f5594e.a(i10);
                this.f5595f.add(bufferInfo);
                h.c cVar = this.f5604o;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f5590a) {
            b(mediaFormat);
            this.f5598i = null;
        }
    }

    public void p(h.c cVar) {
        synchronized (this.f5590a) {
            this.f5604o = cVar;
        }
    }

    public void q() {
        synchronized (this.f5590a) {
            this.f5602m = true;
            this.f5591b.quit();
            f();
        }
    }
}
