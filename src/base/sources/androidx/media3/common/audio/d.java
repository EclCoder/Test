package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f4666c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f4667d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f4668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AudioProcessor.a f4669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AudioProcessor.a f4670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioProcessor.a f4671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f4673j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ByteBuffer f4674k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ShortBuffer f4675l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ByteBuffer f4676m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f4677n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f4678o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f4679p;

    public d() {
        AudioProcessor.a aVar = AudioProcessor.a.f4625e;
        this.f4668e = aVar;
        this.f4669f = aVar;
        this.f4670g = aVar;
        this.f4671h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f4623a;
        this.f4674k = byteBuffer;
        this.f4675l = byteBuffer.asShortBuffer();
        this.f4676m = byteBuffer;
        this.f4665b = -1;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f4628c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i10 = this.f4665b;
        if (i10 == -1) {
            i10 = aVar.f4626a;
        }
        this.f4668e = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i10, aVar.f4627b, 2);
        this.f4669f = aVar2;
        this.f4672i = true;
        return aVar2;
    }

    public final long b(long j10) {
        if (this.f4678o < 1024) {
            return (long) (((double) this.f4666c) * j10);
        }
        long jL = this.f4677n - ((long) ((c) w1.a.e(this.f4673j)).l());
        int i10 = this.f4671h.f4626a;
        int i11 = this.f4670g.f4626a;
        return i10 == i11 ? c0.N0(j10, jL, this.f4678o) : c0.N0(j10, jL * ((long) i10), this.f4678o * ((long) i11));
    }

    public final void c(float f10) {
        if (this.f4667d != f10) {
            this.f4667d = f10;
            this.f4672i = true;
        }
    }

    public final void d(float f10) {
        if (this.f4666c != f10) {
            this.f4666c = f10;
            this.f4672i = true;
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            AudioProcessor.a aVar = this.f4668e;
            this.f4670g = aVar;
            AudioProcessor.a aVar2 = this.f4669f;
            this.f4671h = aVar2;
            if (this.f4672i) {
                this.f4673j = new c(aVar.f4626a, aVar.f4627b, this.f4666c, this.f4667d, aVar2.f4626a);
            } else {
                c cVar = this.f4673j;
                if (cVar != null) {
                    cVar.i();
                }
            }
        }
        this.f4676m = AudioProcessor.f4623a;
        this.f4677n = 0L;
        this.f4678o = 0L;
        this.f4679p = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        int iK;
        c cVar = this.f4673j;
        if (cVar != null && (iK = cVar.k()) > 0) {
            if (this.f4674k.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f4674k = byteBufferOrder;
                this.f4675l = byteBufferOrder.asShortBuffer();
            } else {
                this.f4674k.clear();
                this.f4675l.clear();
            }
            cVar.j(this.f4675l);
            this.f4678o += (long) iK;
            this.f4674k.limit(iK);
            this.f4676m = this.f4674k;
        }
        ByteBuffer byteBuffer = this.f4676m;
        this.f4676m = AudioProcessor.f4623a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        if (this.f4669f.f4626a != -1) {
            return Math.abs(this.f4666c - 1.0f) >= 1.0E-4f || Math.abs(this.f4667d - 1.0f) >= 1.0E-4f || this.f4669f.f4626a != this.f4668e.f4626a;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        if (!this.f4679p) {
            return false;
        }
        c cVar = this.f4673j;
        return cVar == null || cVar.k() == 0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        c cVar = this.f4673j;
        if (cVar != null) {
            cVar.s();
        }
        this.f4679p = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            c cVar = (c) w1.a.e(this.f4673j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f4677n += (long) iRemaining;
            cVar.t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.f4666c = 1.0f;
        this.f4667d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f4625e;
        this.f4668e = aVar;
        this.f4669f = aVar;
        this.f4670g = aVar;
        this.f4671h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f4623a;
        this.f4674k = byteBuffer;
        this.f4675l = byteBuffer.asShortBuffer();
        this.f4676m = byteBuffer;
        this.f4665b = -1;
        this.f4672i = false;
        this.f4673j = null;
        this.f4677n = 0L;
        this.f4678o = 0L;
        this.f4679p = false;
    }
}
