package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AudioProcessor.a f4636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected AudioProcessor.a f4637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f4638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f4639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f4640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f4641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4642h;

    public b() {
        ByteBuffer byteBuffer = AudioProcessor.f4623a;
        this.f4640f = byteBuffer;
        this.f4641g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f4625e;
        this.f4638d = aVar;
        this.f4639e = aVar;
        this.f4636b = aVar;
        this.f4637c = aVar;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a a(AudioProcessor.a aVar) {
        this.f4638d = aVar;
        this.f4639e = c(aVar);
        return isActive() ? this.f4639e : AudioProcessor.a.f4625e;
    }

    protected final boolean b() {
        return this.f4641g.hasRemaining();
    }

    protected abstract AudioProcessor.a c(AudioProcessor.a aVar);

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.f4641g = AudioProcessor.f4623a;
        this.f4642h = false;
        this.f4636b = this.f4638d;
        this.f4637c = this.f4639e;
        d();
    }

    protected final ByteBuffer g(int i10) {
        if (this.f4640f.capacity() < i10) {
            this.f4640f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f4640f.clear();
        }
        ByteBuffer byteBuffer = this.f4640f;
        this.f4641g = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f4641g;
        this.f4641g = AudioProcessor.f4623a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.f4639e != AudioProcessor.a.f4625e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return this.f4642h && this.f4641g == AudioProcessor.f4623a;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.f4642h = true;
        e();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f4640f = AudioProcessor.f4623a;
        AudioProcessor.a aVar = AudioProcessor.a.f4625e;
        this.f4638d = aVar;
        this.f4639e = aVar;
        this.f4636b = aVar;
        this.f4637c = aVar;
        f();
    }

    protected void d() {
    }

    protected void e() {
    }

    protected void f() {
    }
}
