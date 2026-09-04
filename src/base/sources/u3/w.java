package u3;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f54118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f54120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54121e;

    public w(int i10, int i11) {
        this.f54117a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f54120d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f54118b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f54120d;
            int length = bArr2.length;
            int i13 = this.f54121e;
            if (length < i13 + i12) {
                this.f54120d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f54120d, this.f54121e, i12);
            this.f54121e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f54118b) {
            return false;
        }
        this.f54121e -= i10;
        this.f54118b = false;
        this.f54119c = true;
        return true;
    }

    public boolean c() {
        return this.f54119c;
    }

    public void d() {
        this.f54118b = false;
        this.f54119c = false;
    }

    public void e(int i10) {
        w1.a.g(!this.f54118b);
        boolean z10 = i10 == this.f54117a;
        this.f54118b = z10;
        if (z10) {
            this.f54121e = 3;
            this.f54119c = false;
        }
    }
}
