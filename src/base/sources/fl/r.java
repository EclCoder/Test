package fl;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38769b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f38770a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f38771a;

        public b(Throwable exception) {
            kotlin.jvm.internal.s.h(exception, "exception");
            this.f38771a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && kotlin.jvm.internal.s.c(this.f38771a, ((b) obj).f38771a);
        }

        public int hashCode() {
            return this.f38771a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f38771a + ')';
        }
    }

    private /* synthetic */ r(Object obj) {
        this.f38770a = obj;
    }

    public static final /* synthetic */ r a(Object obj) {
        return new r(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof r) && kotlin.jvm.internal.s.c(obj, ((r) obj2).k());
    }

    public static final boolean d(Object obj, Object obj2) {
        return kotlin.jvm.internal.s.c(obj, obj2);
    }

    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f38771a;
        }
        return null;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof b;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof b);
    }

    public static String j(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f38770a, obj);
    }

    public int hashCode() {
        return g(this.f38770a);
    }

    public final /* synthetic */ Object k() {
        return this.f38770a;
    }

    public String toString() {
        return j(this.f38770a);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
