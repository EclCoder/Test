package d2;

import androidx.media3.common.audio.AudioProcessor;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class t extends androidx.media3.common.audio.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f36151i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final short f36152j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f36153k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f36154l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f36155m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36156n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f36157o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f36158p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f36159q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f36160r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f36161s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f36162t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f36163u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f36164v;

    public t() {
        this(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    private static int A(byte b10, byte b11) {
        return (b10 << 8) | (b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    private int h(float f10) {
        return i((int) f10);
    }

    private int i(int i10) {
        int i11 = this.f36156n;
        return (i10 / i11) * i11;
    }

    private int j(int i10, int i11) {
        int i12 = this.f36153k;
        return i12 + ((((100 - i12) * (i10 * 1000)) / i11) / 1000);
    }

    private int k(int i10, int i11) {
        return (((this.f36153k - 100) * ((i10 * 1000) / i11)) / 1000) + 100;
    }

    private int l(int i10) {
        int iM = ((m(this.f36155m) - this.f36160r) * this.f36156n) - (this.f36161s.length / 2);
        w1.a.g(iM >= 0);
        return h(Math.min((i10 * this.f36151i) + 0.5f, iM));
    }

    private int m(long j10) {
        return (int) ((j10 * ((long) this.f4636b.f4626a)) / 1000000);
    }

    private int n(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (q(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i10 = this.f36156n;
                return ((iLimit / i10) * i10) + i10;
            }
        }
        return byteBuffer.position();
    }

    private int o(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (q(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i10 = this.f36156n;
                return i10 * (iPosition / i10);
            }
        }
        return byteBuffer.limit();
    }

    private boolean q(byte b10, byte b11) {
        return Math.abs(A(b10, b11)) > this.f36152j;
    }

    private void r(byte[] bArr, int i10, int i11) {
        if (i11 == 3) {
            return;
        }
        for (int i12 = 0; i12 < i10; i12 += 2) {
            x(bArr, i12, (A(bArr[i12 + 1], bArr[i12]) * (i11 == 0 ? k(i12, i10 - 1) : i11 == 2 ? j(i12, i10 - 1) : this.f36153k)) / 100);
        }
    }

    private void s(ByteBuffer byteBuffer) {
        g(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void t(byte[] bArr, int i10, int i11) {
        w1.a.b(i10 % this.f36156n == 0, "byteOutput size is not aligned to frame size " + i10);
        r(bArr, i10, i11);
        g(i10).put(bArr, 0, i10).flip();
    }

    private void u(boolean z10) {
        int length;
        int iL;
        int i10 = this.f36163u;
        byte[] bArr = this.f36161s;
        if (i10 == bArr.length || z10) {
            if (this.f36160r == 0) {
                if (z10) {
                    v(i10, 3);
                    length = i10;
                } else {
                    w1.a.g(i10 >= bArr.length / 2);
                    length = this.f36161s.length / 2;
                    v(length, 0);
                }
                iL = length;
            } else if (z10) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iL2 = l(length2) + (this.f36161s.length / 2);
                v(iL2, 2);
                iL = iL2;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                iL = l(length);
                v(iL, 1);
            }
            w1.a.h(length % this.f36156n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            w1.a.g(i10 >= iL);
            this.f36163u -= length;
            int i11 = this.f36162t + length;
            this.f36162t = i11;
            this.f36162t = i11 % this.f36161s.length;
            int i12 = this.f36160r;
            int i13 = this.f36156n;
            this.f36160r = i12 + (iL / i13);
            this.f36159q += (long) ((length - iL) / i13);
        }
    }

    private void v(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        w1.a.a(this.f36163u >= i10);
        if (i11 == 2) {
            int i12 = this.f36162t;
            int i13 = this.f36163u;
            int i14 = i12 + i13;
            byte[] bArr = this.f36161s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, (i12 + i13) - i10, this.f36164v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.f36164v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.f36164v, 0, i15);
                    System.arraycopy(this.f36161s, 0, this.f36164v, i15, length);
                }
            }
        } else {
            int i16 = this.f36162t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f36161s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.f36164v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.f36164v, 0, length2);
                System.arraycopy(this.f36161s, 0, this.f36164v, length2, i10 - length2);
            }
        }
        w1.a.b(i10 % this.f36156n == 0, "sizeToOutput is not aligned to frame size: " + i10);
        w1.a.g(this.f36162t < this.f36161s.length);
        t(this.f36164v, i10, i11);
    }

    private void w(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f36161s.length));
        int iN = n(byteBuffer);
        if (iN == byteBuffer.position()) {
            this.f36158p = 1;
        } else {
            byteBuffer.limit(Math.min(iN, byteBuffer.capacity()));
            s(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private static void x(byte[] bArr, int i10, int i11) {
        if (i11 >= 32767) {
            bArr[i10] = -1;
            bArr[i10 + 1] = 127;
        } else if (i11 <= -32768) {
            bArr[i10] = 0;
            bArr[i10 + 1] = -128;
        } else {
            bArr[i10] = (byte) (i11 & 255);
            bArr[i10 + 1] = (byte) (i11 >> 8);
        }
    }

    private void z(ByteBuffer byteBuffer) {
        int length;
        int i10;
        w1.a.g(this.f36162t < this.f36161s.length);
        int iLimit = byteBuffer.limit();
        int iO = o(byteBuffer);
        int iPosition = iO - byteBuffer.position();
        int i11 = this.f36162t;
        int i12 = this.f36163u;
        int i13 = i11 + i12;
        byte[] bArr = this.f36161s;
        if (i13 < bArr.length) {
            length = bArr.length - (i12 + i11);
            i10 = i11 + i12;
        } else {
            int length2 = i12 - (bArr.length - i11);
            length = i11 - length2;
            i10 = length2;
        }
        boolean z10 = iO < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f36161s, i10, iMin);
        int i14 = this.f36163u + iMin;
        this.f36163u = i14;
        w1.a.g(i14 <= this.f36161s.length);
        boolean z11 = z10 && iPosition < length;
        u(z11);
        if (z11) {
            this.f36158p = 0;
            this.f36160r = 0;
        }
        byteBuffer.limit(iLimit);
    }

    @Override // androidx.media3.common.audio.b
    protected AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f4628c == 2) {
            return aVar.f4626a == -1 ? AudioProcessor.a.f4625e : aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // androidx.media3.common.audio.b
    public void d() {
        if (isActive()) {
            this.f36156n = this.f4636b.f4627b * 2;
            int i10 = i(m(this.f36154l) / 2) * 2;
            if (this.f36161s.length != i10) {
                this.f36161s = new byte[i10];
                this.f36164v = new byte[i10];
            }
        }
        this.f36158p = 0;
        this.f36159q = 0L;
        this.f36160r = 0;
        this.f36162t = 0;
        this.f36163u = 0;
    }

    @Override // androidx.media3.common.audio.b
    public void e() {
        if (this.f36163u > 0) {
            u(true);
            this.f36160r = 0;
        }
    }

    @Override // androidx.media3.common.audio.b
    public void f() {
        this.f36157o = false;
        byte[] bArr = c0.f55774f;
        this.f36161s = bArr;
        this.f36164v = bArr;
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return super.isActive() && this.f36157o;
    }

    public long p() {
        return this.f36159q;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !b()) {
            int i10 = this.f36158p;
            if (i10 == 0) {
                w(byteBuffer);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                z(byteBuffer);
            }
        }
    }

    public void y(boolean z10) {
        this.f36157o = z10;
    }

    public t(long j10, float f10, long j11, int i10, short s10) {
        boolean z10 = false;
        this.f36160r = 0;
        this.f36162t = 0;
        this.f36163u = 0;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        w1.a.a(z10);
        this.f36154l = j10;
        this.f36151i = f10;
        this.f36155m = j11;
        this.f36153k = i10;
        this.f36152j = s10;
        byte[] bArr = c0.f55774f;
        this.f36161s = bArr;
        this.f36164v = bArr;
    }
}
