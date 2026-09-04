package fl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class z implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38788b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38789a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ z(int i10) {
        this.f38789a = i10;
    }

    public static final /* synthetic */ z a(int i10) {
        return new z(i10);
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof z) && i10 == ((z) obj).f();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return i0.a(f(), ((z) obj).f());
    }

    public boolean equals(Object obj) {
        return c(this.f38789a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f38789a;
    }

    public int hashCode() {
        return d(this.f38789a);
    }

    public String toString() {
        return e(this.f38789a);
    }

    public static int b(int i10) {
        return i10;
    }
}
