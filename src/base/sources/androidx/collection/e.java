package androidx.collection;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f1903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1906d;

    public e() {
        this(0, 1, null);
    }

    private final void c() {
        int[] iArr = this.f1903a;
        int length = iArr.length;
        int i10 = this.f1904b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i12];
        gl.j.i(iArr, iArr2, 0, i10, length);
        gl.j.i(this.f1903a, iArr2, i11, 0, this.f1904b);
        this.f1903a = iArr2;
        this.f1904b = 0;
        this.f1905c = length;
        this.f1906d = i12 - 1;
    }

    public final void a(int i10) {
        int[] iArr = this.f1903a;
        int i11 = this.f1905c;
        iArr[i11] = i10;
        int i12 = this.f1906d & (i11 + 1);
        this.f1905c = i12;
        if (i12 == this.f1904b) {
            c();
        }
    }

    public final void b() {
        this.f1905c = this.f1904b;
    }

    public final boolean d() {
        return this.f1904b == this.f1905c;
    }

    public final int e() {
        int i10 = this.f1904b;
        if (i10 == this.f1905c) {
            f fVar = f.f1907a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f1903a[i10];
        this.f1904b = (i10 + 1) & this.f1906d;
        return i11;
    }

    public e(int i10) {
        if (!(i10 >= 1)) {
            s.d.a("capacity must be >= 1");
        }
        if (!(i10 <= 1073741824)) {
            s.d.a("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f1906d = i10 - 1;
        this.f1903a = new int[i10];
    }

    public /* synthetic */ e(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
