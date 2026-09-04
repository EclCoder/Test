package b2;

import android.media.MediaCodec;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f8276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f8277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f8279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f8280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f8284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f8285j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f8286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f8287b;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f8287b.set(i10, i11);
            this.f8286a.setPattern(this.f8287b);
        }

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f8286a = cryptoInfo;
            this.f8287b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f8284i = cryptoInfo;
        this.f8285j = c0.f55769a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f8284i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f8279d == null) {
            int[] iArr = new int[1];
            this.f8279d = iArr;
            this.f8284i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f8279d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f8281f = i10;
        this.f8279d = iArr;
        this.f8280e = iArr2;
        this.f8277b = bArr;
        this.f8276a = bArr2;
        this.f8278c = i11;
        this.f8282g = i12;
        this.f8283h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f8284i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (c0.f55769a >= 24) {
            ((b) w1.a.e(this.f8285j)).b(i12, i13);
        }
    }
}
