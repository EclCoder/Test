package fl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38735b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f38736a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ b0(long j10) {
        this.f38736a = j10;
    }

    public static final /* synthetic */ b0 a(long j10) {
        return new b0(j10);
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof b0) && j10 == ((b0) obj).f();
    }

    public static int d(long j10) {
        return Long.hashCode(j10);
    }

    public static String e(long j10) {
        return i0.c(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return i0.b(f(), ((b0) obj).f());
    }

    public boolean equals(Object obj) {
        return c(this.f38736a, obj);
    }

    public final /* synthetic */ long f() {
        return this.f38736a;
    }

    public int hashCode() {
        return d(this.f38736a);
    }

    public String toString() {
        return e(this.f38736a);
    }

    public static long b(long j10) {
        return j10;
    }
}
