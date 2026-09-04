package ue;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f54416d;

    public b(int i10) {
        this(i10, i10);
    }

    private String b(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f54414b * (this.f54413a + 1));
        for (int i10 = 0; i10 < this.f54414b; i10++) {
            for (int i11 = 0; i11 < this.f54413a; i11++) {
                sb2.append(f(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public void c() {
        int length = this.f54416d.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f54416d[i10] = 0;
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return new b(this.f54413a, this.f54414b, this.f54415c, (int[]) this.f54416d.clone());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f54413a == bVar.f54413a && this.f54414b == bVar.f54414b && this.f54415c == bVar.f54415c && Arrays.equals(this.f54416d, bVar.f54416d);
    }

    public boolean f(int i10, int i11) {
        return ((this.f54416d[(i11 * this.f54415c) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    public int g() {
        return this.f54414b;
    }

    public int hashCode() {
        int i10 = this.f54413a;
        return (((((((i10 * 31) + i10) * 31) + this.f54414b) * 31) + this.f54415c) * 31) + Arrays.hashCode(this.f54416d);
    }

    public int i() {
        return this.f54413a;
    }

    public void j(int i10, int i11) {
        int i12 = (i11 * this.f54415c) + (i10 / 32);
        int[] iArr = this.f54416d;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public void k(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f54414b || i14 > this.f54413a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f54415c * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.f54416d;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public String l(String str, String str2) {
        return b(str, str2, "\n");
    }

    public String toString() {
        return l("X ", "  ");
    }

    public b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f54413a = i10;
        this.f54414b = i11;
        int i12 = (i10 + 31) / 32;
        this.f54415c = i12;
        this.f54416d = new int[i12 * i11];
    }

    private b(int i10, int i11, int i12, int[] iArr) {
        this.f54413a = i10;
        this.f54414b = i11;
        this.f54415c = i12;
        this.f54416d = iArr;
    }
}
