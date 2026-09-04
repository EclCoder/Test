package fl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38745b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short f38746a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ e0(short s10) {
        this.f38746a = s10;
    }

    public static final /* synthetic */ e0 a(short s10) {
        return new e0(s10);
    }

    public static boolean c(short s10, Object obj) {
        return (obj instanceof e0) && s10 == ((e0) obj).f();
    }

    public static int d(short s10) {
        return Short.hashCode(s10);
    }

    public static String e(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.s.i(f() & 65535, ((e0) obj).f() & 65535);
    }

    public boolean equals(Object obj) {
        return c(this.f38746a, obj);
    }

    public final /* synthetic */ short f() {
        return this.f38746a;
    }

    public int hashCode() {
        return d(this.f38746a);
    }

    public String toString() {
        return e(this.f38746a);
    }

    public static short b(short s10) {
        return s10;
    }
}
