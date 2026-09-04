package l1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f43786a = androidx.collection.g.b(0.0f, 0.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f43787b = 3.1415927f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f43788c = 6.2831855f;

    public static final float a(float f10, float f11) {
        float fAtan2 = (float) Math.atan2(f11, f10);
        float f12 = f43788c;
        return (fAtan2 + f12) % f12;
    }

    public static final long b(float f10) {
        double d10 = f10;
        return androidx.collection.g.b((float) Math.cos(d10), (float) Math.sin(d10));
    }

    public static final long c(float f10, float f11) {
        float fD = d(f10, f11);
        if (fD > 0.0f) {
            return androidx.collection.g.b(f10 / fD, f11 / fD);
        }
        throw new IllegalArgumentException("Required distance greater than zero");
    }

    public static final float d(float f10, float f11) {
        return (float) Math.sqrt((f10 * f10) + (f11 * f11));
    }

    public static final float e(float f10, float f11) {
        return (f10 * f10) + (f11 * f11);
    }

    public static final float f(float f10, float f11, float f12, i f13) {
        kotlin.jvm.internal.s.h(f13, "f");
        while (f11 - f10 > f12) {
            float f14 = 2;
            float f15 = 3;
            float f16 = ((f14 * f10) + f11) / f15;
            float f17 = ((f14 * f11) + f10) / f15;
            if (f13.a(f16) < f13.a(f17)) {
                f11 = f17;
            } else {
                f10 = f16;
            }
        }
        return (f10 + f11) / 2;
    }

    public static final float g() {
        return f43787b;
    }

    public static final float h() {
        return f43788c;
    }

    public static final float i(float f10, float f11, float f12) {
        return ((1 - f12) * f10) + (f12 * f11);
    }

    public static final float j(float f10, float f11) {
        return ((f10 % f11) + f11) % f11;
    }

    public static final long k(float f10, float f11, long j10) {
        return p.k(p.l(b(f11), f10), j10);
    }

    public static /* synthetic */ long l(float f10, float f11, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = f43786a;
        }
        return k(f10, f11, j10);
    }

    public static final long m(long j10) {
        return androidx.collection.g.b(-p.h(j10), p.g(j10));
    }

    public static final float n(float f10) {
        return f10 * f10;
    }
}
