package af;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f244b = 0;

    b(int i10) {
        this.f243a = new byte[i10];
    }

    private void c(int i10, boolean z10) {
        this.f243a[i10] = z10 ? (byte) 1 : (byte) 0;
    }

    void a(boolean z10, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f244b;
            this.f244b = i12 + 1;
            c(i12, z10);
        }
    }

    byte[] b(int i10) {
        int length = this.f243a.length * i10;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = this.f243a[i11 / i10];
        }
        return bArr;
    }
}
