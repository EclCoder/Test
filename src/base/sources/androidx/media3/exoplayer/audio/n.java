package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class n extends androidx.media3.common.audio.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f5088m = c0.f55774f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5089n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f5090o;

    @Override // androidx.media3.common.audio.b
    public AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f4628c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.f5086k = true;
        return (this.f5084i == 0 && this.f5085j == 0) ? AudioProcessor.a.f4625e : aVar;
    }

    @Override // androidx.media3.common.audio.b
    protected void d() {
        if (this.f5086k) {
            this.f5086k = false;
            int i10 = this.f5085j;
            int i11 = this.f4636b.f4629d;
            this.f5088m = new byte[i10 * i11];
            this.f5087l = this.f5084i * i11;
        }
        this.f5089n = 0;
    }

    @Override // androidx.media3.common.audio.b
    protected void e() {
        if (this.f5086k) {
            int i10 = this.f5089n;
            if (i10 > 0) {
                this.f5090o += (long) (i10 / this.f4636b.f4629d);
            }
            this.f5089n = 0;
        }
    }

    @Override // androidx.media3.common.audio.b
    protected void f() {
        this.f5088m = c0.f55774f;
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        int i10;
        if (super.isEnded() && (i10 = this.f5089n) > 0) {
            g(i10).put(this.f5088m, 0, this.f5089n).flip();
            this.f5089n = 0;
        }
        return super.getOutput();
    }

    public long h() {
        return this.f5090o;
    }

    public void i() {
        this.f5090o = 0L;
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return super.isEnded() && this.f5089n == 0;
    }

    public void j(int i10, int i11) {
        this.f5084i = i10;
        this.f5085j = i11;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f5087l);
        this.f5090o += (long) (iMin / this.f4636b.f4629d);
        this.f5087l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f5087l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f5089n + i11) - this.f5088m.length;
        ByteBuffer byteBufferG = g(length);
        int iO = c0.o(length, 0, this.f5089n);
        byteBufferG.put(this.f5088m, 0, iO);
        int iO2 = c0.o(length - iO, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iO2);
        byteBufferG.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iO2;
        int i13 = this.f5089n - iO;
        this.f5089n = i13;
        byte[] bArr = this.f5088m;
        System.arraycopy(bArr, iO, bArr, 0, i13);
        byteBuffer.get(this.f5088m, this.f5089n, i12);
        this.f5089n += i12;
        byteBufferG.flip();
    }
}
