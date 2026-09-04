package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ArrayDeque f17245g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f17246h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f17247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f17248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f17249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f17250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ob.g f17251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17252f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            c.this.f(message);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f17257d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f17258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17259f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f17254a = i10;
            this.f17255b = i11;
            this.f17256c = i12;
            this.f17258e = j10;
            this.f17259f = i13;
        }
    }

    public c(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new ob.g());
    }

    private void b() {
        this.f17251e.c();
        ((Handler) ob.a.e(this.f17249c)).obtainMessage(2).sendToTarget();
        this.f17251e.a();
    }

    private static void c(s9.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f51514f;
        cryptoInfo.numBytesOfClearData = e(cVar.f51512d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(cVar.f51513e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) ob.a.e(d(cVar.f51510b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) ob.a.e(d(cVar.f51509a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f51511c;
        if (r0.f48425a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f51515g, cVar.f51516h));
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] e(int[] iArr, int[] iArr2) {
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
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    public void f(Message message) {
        b bVar;
        b bVar2;
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                bVar2 = null;
                if (i10 != 2) {
                    androidx.lifecycle.b.a(this.f17250d, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    this.f17251e.e();
                }
            } else {
                bVar = (b) message.obj;
                h(bVar.f17254a, bVar.f17255b, bVar.f17257d, bVar.f17258e, bVar.f17259f);
            }
            if (bVar2 != null) {
                o(bVar2);
            }
        }
        bVar = (b) message.obj;
        g(bVar.f17254a, bVar.f17255b, bVar.f17256c, bVar.f17258e, bVar.f17259f);
        bVar2 = bVar;
        if (bVar2 != null) {
            o(bVar2);
        }
    }

    private void g(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f17247a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            androidx.lifecycle.b.a(this.f17250d, null, e10);
        }
    }

    private void h(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f17246h) {
                this.f17247a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            androidx.lifecycle.b.a(this.f17250d, null, e10);
        }
    }

    private void j() {
        ((Handler) ob.a.e(this.f17249c)).removeCallbacksAndMessages(null);
        b();
    }

    private static b k() {
        ArrayDeque arrayDeque = f17245g;
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

    private static void o(b bVar) {
        ArrayDeque arrayDeque = f17245g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public void i() {
        if (this.f17252f) {
            try {
                j();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void l() {
        RuntimeException runtimeException = (RuntimeException) this.f17250d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public void m(int i10, int i11, int i12, long j10, int i13) {
        l();
        b bVarK = k();
        bVarK.a(i10, i11, i12, j10, i13);
        ((Handler) r0.j(this.f17249c)).obtainMessage(0, bVarK).sendToTarget();
    }

    public void n(int i10, int i11, s9.c cVar, long j10, int i12) {
        l();
        b bVarK = k();
        bVarK.a(i10, i11, 0, j10, i12);
        c(cVar, bVarK.f17257d);
        ((Handler) r0.j(this.f17249c)).obtainMessage(1, bVarK).sendToTarget();
    }

    public void p() {
        if (this.f17252f) {
            i();
            this.f17248b.quit();
        }
        this.f17252f = false;
    }

    public void q() {
        if (this.f17252f) {
            return;
        }
        this.f17248b.start();
        this.f17249c = new a(this.f17248b.getLooper());
        this.f17252f = true;
    }

    public void r() {
        b();
    }

    c(MediaCodec mediaCodec, HandlerThread handlerThread, ob.g gVar) {
        this.f17247a = mediaCodec;
        this.f17248b = handlerThread;
        this.f17251e = gVar;
        this.f17250d = new AtomicReference();
    }
}
