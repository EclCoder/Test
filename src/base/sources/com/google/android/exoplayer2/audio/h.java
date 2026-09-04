package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AudioProcessor.a f16622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected AudioProcessor.a f16623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f16624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f16625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f16626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f16627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f16628h;

    public h() {
        ByteBuffer byteBuffer = AudioProcessor.f16452a;
        this.f16626f = byteBuffer;
        this.f16627g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f16453e;
        this.f16624d = aVar;
        this.f16625e = aVar;
        this.f16622b = aVar;
        this.f16623c = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a a(AudioProcessor.a aVar) {
        this.f16624d = aVar;
        this.f16625e = c(aVar);
        return isActive() ? this.f16625e : AudioProcessor.a.f16453e;
    }

    protected final boolean b() {
        return this.f16627g.hasRemaining();
    }

    protected abstract AudioProcessor.a c(AudioProcessor.a aVar);

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f16627g = AudioProcessor.f16452a;
        this.f16628h = false;
        this.f16622b = this.f16624d;
        this.f16623c = this.f16625e;
        d();
    }

    protected final ByteBuffer g(int i10) {
        if (this.f16626f.capacity() < i10) {
            this.f16626f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f16626f.clear();
        }
        ByteBuffer byteBuffer = this.f16626f;
        this.f16627g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f16627g;
        this.f16627g = AudioProcessor.f16452a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f16625e != AudioProcessor.a.f16453e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        return this.f16628h && this.f16627g == AudioProcessor.f16452a;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.f16628h = true;
        e();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f16626f = AudioProcessor.f16452a;
        AudioProcessor.a aVar = AudioProcessor.a.f16453e;
        this.f16624d = aVar;
        this.f16625e = aVar;
        this.f16622b = aVar;
        this.f16623c = aVar;
        f();
    }

    protected void d() {
    }

    protected void e() {
    }

    protected void f() {
    }
}
