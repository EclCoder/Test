package on;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f49194c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f49195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f49196b = new int[10];

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final int a(int i10) {
        return this.f49196b[i10];
    }

    public final int b() {
        if ((this.f49195a & 2) != 0) {
            return this.f49196b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f49195a & 16) != 0) {
            return this.f49196b[4];
        }
        return 65535;
    }

    public final int d() {
        if ((this.f49195a & 8) != 0) {
            return this.f49196b[3];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i10) {
        return (this.f49195a & 32) != 0 ? this.f49196b[5] : i10;
    }

    public final boolean f(int i10) {
        return ((1 << i10) & this.f49195a) != 0;
    }

    public final void g(y other) {
        kotlin.jvm.internal.s.h(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (other.f(i10)) {
                h(i10, other.a(i10));
            }
        }
    }

    public final y h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f49196b;
            if (i10 < iArr.length) {
                this.f49195a = (1 << i10) | this.f49195a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f49195a);
    }
}
