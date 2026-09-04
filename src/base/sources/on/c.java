package on;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f49020d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final xn.h f49021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final xn.h f49022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final xn.h f49023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final xn.h f49024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final xn.h f49025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final xn.h f49026j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xn.h f49027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xn.h f49028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49029c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        xn.h.a aVar = xn.h.f56912d;
        f49021e = aVar.d(":");
        f49022f = aVar.d(":status");
        f49023g = aVar.d(":method");
        f49024h = aVar.d(":path");
        f49025i = aVar.d(":scheme");
        f49026j = aVar.d(":authority");
    }

    public c(xn.h name, xn.h value) {
        kotlin.jvm.internal.s.h(name, "name");
        kotlin.jvm.internal.s.h(value, "value");
        this.f49027a = name;
        this.f49028b = value;
        this.f49029c = name.D() + 32 + value.D();
    }

    public final xn.h a() {
        return this.f49027a;
    }

    public final xn.h b() {
        return this.f49028b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.s.c(this.f49027a, cVar.f49027a) && kotlin.jvm.internal.s.c(this.f49028b, cVar.f49028b);
    }

    public int hashCode() {
        return (this.f49027a.hashCode() * 31) + this.f49028b.hashCode();
    }

    public String toString() {
        return this.f49027a.K() + ": " + this.f49028b.K();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(String name, String value) {
        kotlin.jvm.internal.s.h(name, "name");
        kotlin.jvm.internal.s.h(value, "value");
        xn.h.a aVar = xn.h.f56912d;
        this(aVar.d(name), aVar.d(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(xn.h name, String value) {
        this(name, xn.h.f56912d.d(value));
        kotlin.jvm.internal.s.h(name, "name");
        kotlin.jvm.internal.s.h(value, "value");
    }
}
