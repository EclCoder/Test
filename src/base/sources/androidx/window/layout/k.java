package androidx.window.layout;

import android.graphics.Rect;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f7715d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z4.b f7716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f7717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j.b f7718c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(z4.b bounds) {
            kotlin.jvm.internal.s.h(bounds, "bounds");
            if (bounds.d() == 0 && bounds.a() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            }
            if (bounds.b() != 0 && bounds.c() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f7719b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b f7720c = new b("FOLD");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final b f7721d = new b("HINGE");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7722a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a() {
                return b.f7720c;
            }

            public final b b() {
                return b.f7721d;
            }

            private a() {
            }
        }

        private b(String str) {
            this.f7722a = str;
        }

        public String toString() {
            return this.f7722a;
        }
    }

    public k(z4.b featureBounds, b type, j.b state) {
        kotlin.jvm.internal.s.h(featureBounds, "featureBounds");
        kotlin.jvm.internal.s.h(type, "type");
        kotlin.jvm.internal.s.h(state, "state");
        this.f7716a = featureBounds;
        this.f7717b = type;
        this.f7718c = state;
        f7715d.a(featureBounds);
    }

    @Override // androidx.window.layout.j
    public boolean a() {
        b bVar = this.f7717b;
        b.a aVar = b.f7719b;
        if (kotlin.jvm.internal.s.c(bVar, aVar.b())) {
            return true;
        }
        return kotlin.jvm.internal.s.c(this.f7717b, aVar.a()) && kotlin.jvm.internal.s.c(c(), j.b.f7713d);
    }

    @Override // androidx.window.layout.j
    public j.a b() {
        return this.f7716a.d() > this.f7716a.a() ? j.a.f7709d : j.a.f7708c;
    }

    public j.b c() {
        return this.f7718c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.s.c(k.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.s.c(this.f7716a, kVar.f7716a) && kotlin.jvm.internal.s.c(this.f7717b, kVar.f7717b) && kotlin.jvm.internal.s.c(c(), kVar.c());
    }

    @Override // androidx.window.layout.e
    public Rect getBounds() {
        return this.f7716a.f();
    }

    public int hashCode() {
        return (((this.f7716a.hashCode() * 31) + this.f7717b.hashCode()) * 31) + c().hashCode();
    }

    public String toString() {
        return ((Object) k.class.getSimpleName()) + " { " + this.f7716a + ", type=" + this.f7717b + ", state=" + c() + " }";
    }
}
