package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class c implements i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ArrayDeque f5574g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f5575h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f5576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f5577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f5578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f5579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w1.g f5580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5581f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            c.this.i(message);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f5586d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f5587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5588f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f5583a = i10;
            this.f5584b = i11;
            this.f5585c = i12;
            this.f5587e = j10;
            this.f5588f = i13;
        }
    }

    public c(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new w1.g());
    }

    private void e() {
        this.f5580e.c();
        ((Handler) w1.a.e(this.f5578c)).obtainMessage(3).sendToTarget();
        this.f5580e.a();
    }

    private static void f(b2.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f8281f;
        cryptoInfo.numBytesOfClearData = h(cVar.f8279d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = h(cVar.f8280e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) w1.a.e(g(cVar.f8277b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) w1.a.e(g(cVar.f8276a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f8278c;
        if (c0.f55769a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f8282g, cVar.f8283h));
        }
    }

    private static byte[] g(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] h(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    public void i(Message message) {
        b bVar;
        b bVar2;
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                bVar2 = null;
                if (i10 == 3) {
                    this.f5580e.e();
                } else if (i10 != 4) {
                    androidx.lifecycle.b.a(this.f5579d, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    m((Bundle) message.obj);
                }
            } else {
                bVar = (b) message.obj;
                l(bVar.f5583a, bVar.f5584b, bVar.f5586d, bVar.f5587e, bVar.f5588f);
            }
            if (bVar2 != null) {
                p(bVar2);
            }
        }
        bVar = (b) message.obj;
        k(bVar.f5583a, bVar.f5584b, bVar.f5585c, bVar.f5587e, bVar.f5588f);
        bVar2 = bVar;
        if (bVar2 != null) {
            p(bVar2);
        }
    }

    private void k(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f5576a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            androidx.lifecycle.b.a(this.f5579d, null, e10);
        }
    }

    private void l(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f5575h) {
                this.f5576a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            androidx.lifecycle.b.a(this.f5579d, null, e10);
        }
    }

    private void m(Bundle bundle) {
        try {
            this.f5576a.setParameters(bundle);
        } catch (RuntimeException e10) {
            androidx.lifecycle.b.a(this.f5579d, null, e10);
        }
    }

    private void n() {
        ((Handler) w1.a.e(this.f5578c)).removeCallbacksAndMessages(null);
        e();
    }

    private static b o() {
        ArrayDeque arrayDeque = f5574g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return (b) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void p(b bVar) {
        ArrayDeque arrayDeque = f5574g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void a(int i10, int i11, int i12, long j10, int i13) {
        c();
        b bVarO = o();
        bVarO.a(i10, i11, i12, j10, i13);
        ((Handler) c0.h(this.f5578c)).obtainMessage(1, bVarO).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void b(Bundle bundle) {
        c();
        ((Handler) c0.h(this.f5578c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void c() {
        RuntimeException runtimeException = (RuntimeException) this.f5579d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void flush() {
        if (this.f5581f) {
            try {
                n();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void j(int i10, int i11, b2.c cVar, long j10, int i12) {
        c();
        b bVarO = o();
        bVarO.a(i10, i11, 0, j10, i12);
        f(cVar, bVarO.f5586d);
        ((Handler) c0.h(this.f5578c)).obtainMessage(2, bVarO).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void shutdown() {
        if (this.f5581f) {
            flush();
            this.f5577b.quit();
        }
        this.f5581f = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void start() {
        if (this.f5581f) {
            return;
        }
        this.f5577b.start();
        this.f5578c = new a(this.f5577b.getLooper());
        this.f5581f = true;
    }

    c(MediaCodec mediaCodec, HandlerThread handlerThread, w1.g gVar) {
        this.f5576a = mediaCodec;
        this.f5577b = handlerThread;
        this.f5580e = gVar;
        this.f5579d = new AtomicReference();
    }
}
