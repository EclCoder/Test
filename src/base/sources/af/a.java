package af;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f242d;

    a(int i10, int i11) {
        b[] bVarArr = new b[i10];
        this.f239a = bVarArr;
        int length = bVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f239a[i12] = new b(((i11 + 4) * 17) + 1);
        }
        this.f242d = i11 * 17;
        this.f241c = i10;
        this.f240b = -1;
    }

    b a() {
        return this.f239a[this.f240b];
    }

    public byte[][] b(int i10, int i11) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f241c * i11, this.f242d * i10);
        int i12 = this.f241c * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.f239a[i13 / i11].b(i10);
        }
        return bArr;
    }

    void c() {
        this.f240b++;
    }
}
