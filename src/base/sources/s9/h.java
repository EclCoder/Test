package s9;

import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f51540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f51541b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f51542c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque f51543d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DecoderInputBuffer[] f51544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f[] f51545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f51546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f51547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private DecoderInputBuffer f51548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private DecoderException f51549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f51550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f51551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f51552m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            h.this.p();
        }
    }

    protected h(DecoderInputBuffer[] decoderInputBufferArr, f[] fVarArr) {
        this.f51544e = decoderInputBufferArr;
        this.f51546g = decoderInputBufferArr.length;
        for (int i10 = 0; i10 < this.f51546g; i10++) {
            this.f51544e[i10] = c();
        }
        this.f51545f = fVarArr;
        this.f51547h = fVarArr.length;
        for (int i11 = 0; i11 < this.f51547h; i11++) {
            this.f51545f[i11] = d();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f51540a = aVar;
        aVar.start();
    }

    private boolean b() {
        return !this.f51542c.isEmpty() && this.f51547h > 0;
    }

    private boolean g() {
        DecoderException decoderExceptionE;
        synchronized (this.f51541b) {
            while (!this.f51551l && !b()) {
                try {
                    this.f51541b.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f51551l) {
                return false;
            }
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) this.f51542c.removeFirst();
            f[] fVarArr = this.f51545f;
            int i10 = this.f51547h - 1;
            this.f51547h = i10;
            f fVar = fVarArr[i10];
            boolean z10 = this.f51550k;
            this.f51550k = false;
            if (decoderInputBuffer.g()) {
                fVar.a(4);
            } else {
                if (decoderInputBuffer.f()) {
                    fVar.a(Integer.MIN_VALUE);
                }
                if (decoderInputBuffer.h()) {
                    fVar.a(134217728);
                }
                try {
                    decoderExceptionE = f(decoderInputBuffer, fVar, z10);
                } catch (OutOfMemoryError e10) {
                    decoderExceptionE = e(e10);
                } catch (RuntimeException e11) {
                    decoderExceptionE = e(e11);
                }
                if (decoderExceptionE != null) {
                    synchronized (this.f51541b) {
                        this.f51549j = decoderExceptionE;
                    }
                    return false;
                }
            }
            synchronized (this.f51541b) {
                try {
                    if (this.f51550k) {
                        fVar.l();
                    } else if (fVar.f()) {
                        this.f51552m++;
                        fVar.l();
                    } else {
                        fVar.f51534c = this.f51552m;
                        this.f51552m = 0;
                        this.f51543d.addLast(fVar);
                    }
                    m(decoderInputBuffer);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
    }

    private void j() {
        if (b()) {
            this.f51541b.notify();
        }
    }

    private void k() throws DecoderException {
        DecoderException decoderException = this.f51549j;
        if (decoderException != null) {
            throw decoderException;
        }
    }

    private void m(DecoderInputBuffer decoderInputBuffer) {
        decoderInputBuffer.b();
        DecoderInputBuffer[] decoderInputBufferArr = this.f51544e;
        int i10 = this.f51546g;
        this.f51546g = i10 + 1;
        decoderInputBufferArr[i10] = decoderInputBuffer;
    }

    private void o(f fVar) {
        fVar.b();
        f[] fVarArr = this.f51545f;
        int i10 = this.f51547h;
        this.f51547h = i10 + 1;
        fVarArr[i10] = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (g());
    }

    protected abstract DecoderInputBuffer c();

    protected abstract f d();

    protected abstract DecoderException e(Throwable th2);

    protected abstract DecoderException f(DecoderInputBuffer decoderInputBuffer, f fVar, boolean z10);

    @Override // s9.d
    public final void flush() {
        synchronized (this.f51541b) {
            try {
                this.f51550k = true;
                this.f51552m = 0;
                DecoderInputBuffer decoderInputBuffer = this.f51548i;
                if (decoderInputBuffer != null) {
                    m(decoderInputBuffer);
                    this.f51548i = null;
                }
                while (!this.f51542c.isEmpty()) {
                    m((DecoderInputBuffer) this.f51542c.removeFirst());
                }
                while (!this.f51543d.isEmpty()) {
                    ((f) this.f51543d.removeFirst()).l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // s9.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final DecoderInputBuffer dequeueInputBuffer() {
        DecoderInputBuffer decoderInputBuffer;
        synchronized (this.f51541b) {
            k();
            ob.a.g(this.f51548i == null);
            int i10 = this.f51546g;
            if (i10 == 0) {
                decoderInputBuffer = null;
            } else {
                DecoderInputBuffer[] decoderInputBufferArr = this.f51544e;
                int i11 = i10 - 1;
                this.f51546g = i11;
                decoderInputBuffer = decoderInputBufferArr[i11];
            }
            this.f51548i = decoderInputBuffer;
        }
        return decoderInputBuffer;
    }

    @Override // s9.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final f dequeueOutputBuffer() {
        synchronized (this.f51541b) {
            try {
                k();
                if (this.f51543d.isEmpty()) {
                    return null;
                }
                return (f) this.f51543d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // s9.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void queueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        synchronized (this.f51541b) {
            k();
            ob.a.a(decoderInputBuffer == this.f51548i);
            this.f51542c.addLast(decoderInputBuffer);
            j();
            this.f51548i = null;
        }
    }

    protected void n(f fVar) {
        synchronized (this.f51541b) {
            o(fVar);
            j();
        }
    }

    protected final void q(int i10) {
        ob.a.g(this.f51546g == this.f51544e.length);
        for (DecoderInputBuffer decoderInputBuffer : this.f51544e) {
            decoderInputBuffer.m(i10);
        }
    }

    @Override // s9.d
    public void release() {
        synchronized (this.f51541b) {
            this.f51551l = true;
            this.f51541b.notify();
        }
        try {
            this.f51540a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
