package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class n implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f16679c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f16680d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f16681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AudioProcessor.a f16682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AudioProcessor.a f16683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioProcessor.a f16684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f16685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private m f16686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ByteBuffer f16687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ShortBuffer f16688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ByteBuffer f16689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f16690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f16691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f16692p;

    public n() {
        AudioProcessor.a aVar = AudioProcessor.a.f16453e;
        this.f16681e = aVar;
        this.f16682f = aVar;
        this.f16683g = aVar;
        this.f16684h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f16452a;
        this.f16687k = byteBuffer;
        this.f16688l = byteBuffer.asShortBuffer();
        this.f16689m = byteBuffer;
        this.f16678b = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f16456c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i10 = this.f16678b;
        if (i10 == -1) {
            i10 = aVar.f16454a;
        }
        this.f16681e = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i10, aVar.f16455b, 2);
        this.f16682f = aVar2;
        this.f16685i = true;
        return aVar2;
    }

    public final long b(long j10) {
        if (this.f16691o < 1024) {
            return (long) (((double) this.f16679c) * j10);
        }
        long jL = this.f16690n - ((long) ((m) ob.a.e(this.f16686j)).l());
        int i10 = this.f16684h.f16454a;
        int i11 = this.f16683g.f16454a;
        return i10 == i11 ? r0.U0(j10, jL, this.f16691o) : r0.U0(j10, jL * ((long) i10), this.f16691o * ((long) i11));
    }

    public final void c(float f10) {
        if (this.f16680d != f10) {
            this.f16680d = f10;
            this.f16685i = true;
        }
    }

    public final void d(float f10) {
        if (this.f16679c != f10) {
            this.f16679c = f10;
            this.f16685i = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            AudioProcessor.a aVar = this.f16681e;
            this.f16683g = aVar;
            AudioProcessor.a aVar2 = this.f16682f;
            this.f16684h = aVar2;
            if (this.f16685i) {
                this.f16686j = new m(aVar.f16454a, aVar.f16455b, this.f16679c, this.f16680d, aVar2.f16454a);
            } else {
                m mVar = this.f16686j;
                if (mVar != null) {
                    mVar.i();
                }
            }
        }
        this.f16689m = AudioProcessor.f16452a;
        this.f16690n = 0L;
        this.f16691o = 0L;
        this.f16692p = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        int iK;
        m mVar = this.f16686j;
        if (mVar != null && (iK = mVar.k()) > 0) {
            if (this.f16687k.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f16687k = byteBufferOrder;
                this.f16688l = byteBufferOrder.asShortBuffer();
            } else {
                this.f16687k.clear();
                this.f16688l.clear();
            }
            mVar.j(this.f16688l);
            this.f16691o += (long) iK;
            this.f16687k.limit(iK);
            this.f16689m = this.f16687k;
        }
        ByteBuffer byteBuffer = this.f16689m;
        this.f16689m = AudioProcessor.f16452a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean isActive() {
        if (this.f16682f.f16454a != -1) {
            return Math.abs(this.f16679c - 1.0f) >= 1.0E-4f || Math.abs(this.f16680d - 1.0f) >= 1.0E-4f || this.f16682f.f16454a != this.f16681e.f16454a;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean isEnded() {
        if (!this.f16692p) {
            return false;
        }
        m mVar = this.f16686j;
        return mVar == null || mVar.k() == 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueEndOfStream() {
        m mVar = this.f16686j;
        if (mVar != null) {
            mVar.s();
        }
        this.f16692p = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            m mVar = (m) ob.a.e(this.f16686j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f16690n += (long) iRemaining;
            mVar.t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        this.f16679c = 1.0f;
        this.f16680d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f16453e;
        this.f16681e = aVar;
        this.f16682f = aVar;
        this.f16683g = aVar;
        this.f16684h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f16452a;
        this.f16687k = byteBuffer;
        this.f16688l = byteBuffer.asShortBuffer();
        this.f16689m = byteBuffer;
        this.f16678b = -1;
        this.f16685i = false;
        this.f16686j = null;
        this.f16690n = 0L;
        this.f16691o = 0L;
        this.f16692p = false;
    }
}
