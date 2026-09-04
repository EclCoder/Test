package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class i extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f16629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f16630j;

    i() {
    }

    @Override // com.google.android.exoplayer2.audio.h
    public AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f16629i;
        if (iArr == null) {
            return AudioProcessor.a.f16453e;
        }
        if (aVar.f16456c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z10 = aVar.f16455b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f16455b) {
                throw new AudioProcessor.UnhandledAudioFormatException(aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new AudioProcessor.a(aVar.f16454a, iArr.length, 2) : AudioProcessor.a.f16453e;
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void d() {
        this.f16630j = this.f16629i;
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void f() {
        this.f16630j = null;
        this.f16629i = null;
    }

    public void h(int[] iArr) {
        this.f16629i = iArr;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) ob.a.e(this.f16630j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferG = g(((iLimit - iPosition) / this.f16622b.f16457d) * this.f16623c.f16457d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferG.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f16622b.f16457d;
        }
        byteBuffer.position(iLimit);
        byteBufferG.flip();
    }
}
