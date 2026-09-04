package gm;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f39391b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f39392c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f39393a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f39394a;

        public a(Throwable th2) {
            this.f39394a = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && kotlin.jvm.internal.s.c(this.f39394a, ((a) obj).f39394a);
        }

        public int hashCode() {
            Throwable th2 = this.f39394a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // gm.k.c
        public String toString() {
            return "Closed(" + this.f39394a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(Throwable th2) {
            return k.c(new a(th2));
        }

        public final Object b() {
            return k.c(k.f39392c);
        }

        public final Object c(Object obj) {
            return k.c(obj);
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ k(Object obj) {
        this.f39393a = obj;
    }

    public static final /* synthetic */ k b(Object obj) {
        return new k(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof k) && kotlin.jvm.internal.s.c(obj, ((k) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f39394a;
        }
        return null;
    }

    public static final Object f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f39393a, obj);
    }

    public int hashCode() {
        return g(this.f39393a);
    }

    public final /* synthetic */ Object k() {
        return this.f39393a;
    }

    public String toString() {
        return j(this.f39393a);
    }

    public static Object c(Object obj) {
        return obj;
    }
}
