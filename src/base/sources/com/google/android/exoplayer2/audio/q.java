package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class q extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f16694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f16695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f16696k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f16697l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f16698m = r0.f48430f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f16699n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f16700o;

    @Override // com.google.android.exoplayer2.audio.h
    public AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f16456c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.f16696k = true;
        return (this.f16694i == 0 && this.f16695j == 0) ? AudioProcessor.a.f16453e : aVar;
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void d() {
        if (this.f16696k) {
            this.f16696k = false;
            int i10 = this.f16695j;
            int i11 = this.f16622b.f16457d;
            this.f16698m = new byte[i10 * i11];
            this.f16697l = this.f16694i * i11;
        }
        this.f16699n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void e() {
        if (this.f16696k) {
            int i10 = this.f16699n;
            if (i10 > 0) {
                this.f16700o += (long) (i10 / this.f16622b.f16457d);
            }
            this.f16699n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void f() {
        this.f16698m = r0.f48430f;
    }

    @Override // com.google.android.exoplayer2.audio.h, com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        int i10;
        if (super.isEnded() && (i10 = this.f16699n) > 0) {
            g(i10).put(this.f16698m, 0, this.f16699n).flip();
            this.f16699n = 0;
        }
        return super.getOutput();
    }

    public long h() {
        return this.f16700o;
    }

    public void i() {
        this.f16700o = 0L;
    }

    @Override // com.google.android.exoplayer2.audio.h, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        return super.isEnded() && this.f16699n == 0;
    }

    public void j(int i10, int i11) {
        this.f16694i = i10;
        this.f16695j = i11;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f16697l);
        this.f16700o += (long) (iMin / this.f16622b.f16457d);
        this.f16697l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f16697l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f16699n + i11) - this.f16698m.length;
        ByteBuffer byteBufferG = g(length);
        int iQ = r0.q(length, 0, this.f16699n);
        byteBufferG.put(this.f16698m, 0, iQ);
        int iQ2 = r0.q(length - iQ, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iQ2);
        byteBufferG.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iQ2;
        int i13 = this.f16699n - iQ;
        this.f16699n = i13;
        byte[] bArr = this.f16698m;
        System.arraycopy(bArr, iQ, bArr, 0, i13);
        byteBuffer.get(this.f16698m, this.f16699n, i12);
        this.f16699n += i12;
        byteBufferG.flip();
    }
}
