package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class h extends androidx.media3.common.audio.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f5063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f5064j;

    h() {
    }

    @Override // androidx.media3.common.audio.b
    public AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f5063i;
        if (iArr == null) {
            return AudioProcessor.a.f4625e;
        }
        if (aVar.f4628c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z10 = aVar.f4627b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f4627b) {
                throw new AudioProcessor.UnhandledAudioFormatException(aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new AudioProcessor.a(aVar.f4626a, iArr.length, 2) : AudioProcessor.a.f4625e;
    }

    @Override // androidx.media3.common.audio.b
    protected void d() {
        this.f5064j = this.f5063i;
    }

    @Override // androidx.media3.common.audio.b
    protected void f() {
        this.f5064j = null;
        this.f5063i = null;
    }

    public void h(int[] iArr) {
        this.f5063i = iArr;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) w1.a.e(this.f5064j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferG = g(((iLimit - iPosition) / this.f4636b.f4629d) * this.f4637c.f4629d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferG.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f4636b.f4629d;
        }
        byteBuffer.position(iLimit);
        byteBufferG.flip();
    }
}
