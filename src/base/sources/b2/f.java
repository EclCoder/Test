package b2;

import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f8291a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DecoderInputBuffer[] f8295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e[] f8296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private DecoderInputBuffer f8299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private DecoderException f8300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f8301k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8302l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8303m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8292b = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f8304n = C.TIME_UNSET;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f8293c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque f8294d = new ArrayDeque();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            f.this.r();
        }
    }

    protected f(DecoderInputBuffer[] decoderInputBufferArr, e[] eVarArr) {
        this.f8295e = decoderInputBufferArr;
        this.f8297g = decoderInputBufferArr.length;
        for (int i10 = 0; i10 < this.f8297g; i10++) {
            this.f8295e[i10] = e();
        }
        this.f8296f = eVarArr;
        this.f8298h = eVarArr.length;
        for (int i11 = 0; i11 < this.f8298h; i11++) {
            this.f8296f[i11] = f();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f8291a = aVar;
        aVar.start();
    }

    private boolean d() {
        return !this.f8293c.isEmpty() && this.f8298h > 0;
    }

    private boolean i() {
        DecoderException decoderExceptionG;
        synchronized (this.f8292b) {
            while (!this.f8302l && !d()) {
                try {
                    this.f8292b.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f8302l) {
                return false;
            }
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) this.f8293c.removeFirst();
            e[] eVarArr = this.f8296f;
            int i10 = this.f8298h - 1;
            this.f8298h = i10;
            e eVar = eVarArr[i10];
            boolean z10 = this.f8301k;
            this.f8301k = false;
            if (decoderInputBuffer.e()) {
                eVar.a(4);
            } else {
                eVar.f8288b = decoderInputBuffer.f4866f;
                if (decoderInputBuffer.f()) {
                    eVar.a(134217728);
                }
                if (!l(decoderInputBuffer.f4866f)) {
                    eVar.f8290d = true;
                }
                try {
                    decoderExceptionG = h(decoderInputBuffer, eVar, z10);
                } catch (OutOfMemoryError e10) {
                    decoderExceptionG = g(e10);
                } catch (RuntimeException e11) {
                    decoderExceptionG = g(e11);
                }
                if (decoderExceptionG != null) {
                    synchronized (this.f8292b) {
                        this.f8300j = decoderExceptionG;
                    }
                    return false;
                }
            }
            synchronized (this.f8292b) {
                try {
                    if (this.f8301k) {
                        eVar.j();
                    } else if (eVar.f8290d) {
                        this.f8303m++;
                        eVar.j();
                    } else {
                        eVar.f8289c = this.f8303m;
                        this.f8303m = 0;
                        this.f8294d.addLast(eVar);
                    }
                    o(decoderInputBuffer);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
    }

    private void m() {
        if (d()) {
            this.f8292b.notify();
        }
    }

    private void n() throws DecoderException {
        DecoderException decoderException = this.f8300j;
        if (decoderException != null) {
            throw decoderException;
        }
    }

    private void o(DecoderInputBuffer decoderInputBuffer) {
        decoderInputBuffer.b();
        DecoderInputBuffer[] decoderInputBufferArr = this.f8295e;
        int i10 = this.f8297g;
        this.f8297g = i10 + 1;
        decoderInputBufferArr[i10] = decoderInputBuffer;
    }

    private void q(e eVar) {
        eVar.b();
        e[] eVarArr = this.f8296f;
        int i10 = this.f8298h;
        this.f8298h = i10 + 1;
        eVarArr[i10] = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (i());
    }

    @Override // b2.d
    public final void a(long j10) {
        synchronized (this.f8292b) {
            try {
                w1.a.g(this.f8297g == this.f8295e.length || this.f8301k);
                this.f8304n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // b2.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void queueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        synchronized (this.f8292b) {
            n();
            w1.a.a(decoderInputBuffer == this.f8299i);
            this.f8293c.addLast(decoderInputBuffer);
            m();
            this.f8299i = null;
        }
    }

    protected abstract DecoderInputBuffer e();

    protected abstract e f();

    @Override // b2.d
    public final void flush() {
        synchronized (this.f8292b) {
            try {
                this.f8301k = true;
                this.f8303m = 0;
                DecoderInputBuffer decoderInputBuffer = this.f8299i;
                if (decoderInputBuffer != null) {
                    o(decoderInputBuffer);
                    this.f8299i = null;
                }
                while (!this.f8293c.isEmpty()) {
                    o((DecoderInputBuffer) this.f8293c.removeFirst());
                }
                while (!this.f8294d.isEmpty()) {
                    ((e) this.f8294d.removeFirst()).j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract DecoderException g(Throwable th2);

    protected abstract DecoderException h(DecoderInputBuffer decoderInputBuffer, e eVar, boolean z10);

    @Override // b2.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final DecoderInputBuffer dequeueInputBuffer() {
        DecoderInputBuffer decoderInputBuffer;
        synchronized (this.f8292b) {
            n();
            w1.a.g(this.f8299i == null);
            int i10 = this.f8297g;
            if (i10 == 0) {
                decoderInputBuffer = null;
            } else {
                DecoderInputBuffer[] decoderInputBufferArr = this.f8295e;
                int i11 = i10 - 1;
                this.f8297g = i11;
                decoderInputBuffer = decoderInputBufferArr[i11];
            }
            this.f8299i = decoderInputBuffer;
        }
        return decoderInputBuffer;
    }

    @Override // b2.d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final e dequeueOutputBuffer() {
        synchronized (this.f8292b) {
            try {
                n();
                if (this.f8294d.isEmpty()) {
                    return null;
                }
                return (e) this.f8294d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final boolean l(long j10) {
        boolean z10;
        synchronized (this.f8292b) {
            long j11 = this.f8304n;
            z10 = j11 == C.TIME_UNSET || j10 >= j11;
        }
        return z10;
    }

    protected void p(e eVar) {
        synchronized (this.f8292b) {
            q(eVar);
            m();
        }
    }

    @Override // b2.d
    public void release() {
        synchronized (this.f8292b) {
            this.f8302l = true;
            this.f8292b.notify();
        }
        try {
            this.f8291a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    protected final void s(int i10) {
        w1.a.g(this.f8297g == this.f8295e.length);
        for (DecoderInputBuffer decoderInputBuffer : this.f8295e) {
            decoderInputBuffer.k(i10);
        }
    }
}
