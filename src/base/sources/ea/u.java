package ea;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f37633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37634e;

    public u(int i10, int i11) {
        this.f37630a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f37633d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f37631b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f37633d;
            int length = bArr2.length;
            int i13 = this.f37634e;
            if (length < i13 + i12) {
                this.f37633d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f37633d, this.f37634e, i12);
            this.f37634e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f37631b) {
            return false;
        }
        this.f37634e -= i10;
        this.f37631b = false;
        this.f37632c = true;
        return true;
    }

    public boolean c() {
        return this.f37632c;
    }

    public void d() {
        this.f37631b = false;
        this.f37632c = false;
    }

    public void e(int i10) {
        ob.a.g(!this.f37631b);
        boolean z10 = i10 == this.f37630a;
        this.f37631b = z10;
        if (z10) {
            this.f37634e = 3;
            this.f37632c = false;
        }
    }
}
