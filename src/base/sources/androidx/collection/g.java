package androidx.collection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1908a;

    private /* synthetic */ g(long j10) {
        this.f1908a = j10;
    }

    public static final /* synthetic */ g a(long j10) {
        return new g(j10);
    }

    public static long b(float f10, float f11) {
        return c((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof g) && j10 == ((g) obj).g();
    }

    public static int e(long j10) {
        return Long.hashCode(j10);
    }

    public static String f(long j10) {
        return '(' + Float.intBitsToFloat((int) (j10 >> 32)) + ", " + Float.intBitsToFloat((int) (j10 & 4294967295L)) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f1908a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f1908a;
    }

    public int hashCode() {
        return e(this.f1908a);
    }

    public String toString() {
        return f(this.f1908a);
    }

    public static long c(long j10) {
        return j10;
    }
}
