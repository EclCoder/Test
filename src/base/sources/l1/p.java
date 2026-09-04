package l1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final boolean a(long j10, long j11) {
        return (g(j10) * h(j11)) - (h(j10) * g(j11)) > 0.0f;
    }

    public static final long b(long j10, float f10) {
        return androidx.collection.g.b(g(j10) / f10, h(j10) / f10);
    }

    public static final float c(long j10, float f10, float f11) {
        return (g(j10) * f10) + (h(j10) * f11);
    }

    public static final float d(long j10, long j11) {
        return (g(j10) * g(j11)) + (h(j10) * h(j11));
    }

    public static final long e(long j10) {
        float f10 = f(j10);
        if (f10 > 0.0f) {
            return b(j10, f10);
        }
        throw new IllegalArgumentException("Can't get the direction of a 0-length vector");
    }

    public static final float f(long j10) {
        return (float) Math.sqrt((g(j10) * g(j10)) + (h(j10) * h(j10)));
    }

    public static final float g(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float h(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static final long i(long j10, long j11, float f10) {
        return androidx.collection.g.b(y.i(g(j10), g(j11), f10), y.i(h(j10), h(j11), f10));
    }

    public static final long j(long j10, long j11) {
        return androidx.collection.g.b(g(j10) - g(j11), h(j10) - h(j11));
    }

    public static final long k(long j10, long j11) {
        return androidx.collection.g.b(g(j10) + g(j11), h(j10) + h(j11));
    }

    public static final long l(long j10, float f10) {
        return androidx.collection.g.b(g(j10) * f10, h(j10) * f10);
    }

    public static final long m(long j10, q f10) {
        kotlin.jvm.internal.s.h(f10, "f");
        long jA = f10.a(g(j10), h(j10));
        return androidx.collection.g.b(Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)));
    }
}
