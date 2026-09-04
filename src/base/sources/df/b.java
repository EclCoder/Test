package df;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[][] f36721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36723c;

    public b(int i10, int i11) {
        this.f36721a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.f36722b = i10;
        this.f36723c = i11;
    }

    public void a(byte b10) {
        for (byte[] bArr : this.f36721a) {
            Arrays.fill(bArr, b10);
        }
    }

    public byte b(int i10, int i11) {
        return this.f36721a[i11][i10];
    }

    public byte[][] c() {
        return this.f36721a;
    }

    public int d() {
        return this.f36723c;
    }

    public int e() {
        return this.f36722b;
    }

    public void f(int i10, int i11, int i12) {
        this.f36721a[i11][i10] = (byte) i12;
    }

    public void g(int i10, int i11, boolean z10) {
        this.f36721a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f36722b * 2 * this.f36723c) + 2);
        for (int i10 = 0; i10 < this.f36723c; i10++) {
            byte[] bArr = this.f36721a[i10];
            for (int i11 = 0; i11 < this.f36722b; i11++) {
                byte b10 = bArr[i11];
                if (b10 == 0) {
                    sb2.append(" 0");
                } else if (b10 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
