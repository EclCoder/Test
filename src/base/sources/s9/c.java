package s9;

import android.media.MediaCodec;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f51509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f51510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f51512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f51513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f51516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f51517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f51518j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f51519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f51520b;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f51520b.set(i10, i11);
            this.f51519a.setPattern(this.f51520b);
        }

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f51519a = cryptoInfo;
            this.f51520b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f51517i = cryptoInfo;
        this.f51518j = r0.f48425a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f51517i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f51512d == null) {
            int[] iArr = new int[1];
            this.f51512d = iArr;
            this.f51517i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f51512d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f51514f = i10;
        this.f51512d = iArr;
        this.f51513e = iArr2;
        this.f51510b = bArr;
        this.f51509a = bArr2;
        this.f51511c = i11;
        this.f51515g = i12;
        this.f51516h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f51517i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (r0.f48425a >= 24) {
            ((b) ob.a.e(this.f51518j)).b(i12, i13);
        }
    }
}
