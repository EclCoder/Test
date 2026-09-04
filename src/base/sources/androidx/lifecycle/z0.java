package androidx.lifecycle;

import android.os.Bundle;
import f8.Ygx.FuoITeVPeXAj;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f4563c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o1.b f4565b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z0 a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new z0();
            }
            ClassLoader classLoader = z0.class.getClassLoader();
            kotlin.jvm.internal.s.e(classLoader);
            bundle.setClassLoader(classLoader);
            return new z0(n4.c.y(n4.c.a(bundle)));
        }

        public final boolean b(Object obj) {
            return o1.c.a(obj);
        }

        private a() {
        }
    }

    public z0(Map initialState) {
        kotlin.jvm.internal.s.h(initialState, "initialState");
        this.f4564a = new LinkedHashMap();
        this.f4565b = new o1.b(initialState);
    }

    private final p0 d(String str, boolean z10, Object obj) {
        b bVar;
        if (this.f4565b.c().containsKey(str)) {
            throw new IllegalArgumentException(d1.b(str).toString());
        }
        Map map = this.f4564a;
        Object obj2 = map.get(str);
        if (obj2 == null) {
            if (this.f4565b.d().containsKey(str)) {
                bVar = new b(this, str, this.f4565b.d().get(str));
            } else if (z10) {
                this.f4565b.d().put(str, obj);
                bVar = new b(this, str, obj);
            } else {
                bVar = new b(this, str);
            }
            obj2 = bVar;
            map.put(str, obj2);
        }
        return (b) obj2;
    }

    public final Object b(String key) {
        kotlin.jvm.internal.s.h(key, "key");
        return this.f4565b.b(key);
    }

    public final n4.g.b e() {
        return this.f4565b.e();
    }

    public final void f(String key, Object obj) {
        kotlin.jvm.internal.s.h(key, "key");
        if (f4563c.b(obj)) {
            Object obj2 = this.f4564a.get(key);
            p0 p0Var = obj2 instanceof p0 ? (p0) obj2 : null;
            if (p0Var != null) {
                p0Var.q(obj);
            }
            this.f4565b.h(key, obj);
            return;
        }
        kotlin.jvm.internal.s.e(obj);
        throw new IllegalArgumentException(("Can't put value with type " + obj.getClass() + " into saved state").toString());
    }

    public final p0 c(String str, Object obj) {
        kotlin.jvm.internal.s.h(str, FuoITeVPeXAj.DaRXnRYrUkTZ);
        return d(str, true, obj);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static final class b extends p0 {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f4566l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private z0 f4567m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(z0 z0Var, String key, Object obj) {
            super(obj);
            kotlin.jvm.internal.s.h(key, "key");
            this.f4566l = key;
            this.f4567m = z0Var;
        }

        @Override // androidx.lifecycle.p0, androidx.lifecycle.k0
        public void q(Object obj) {
            o1.b bVar;
            z0 z0Var = this.f4567m;
            if (z0Var != null && (bVar = z0Var.f4565b) != null) {
                bVar.h(this.f4566l, obj);
            }
            super.q(obj);
        }

        public b(z0 z0Var, String key) {
            kotlin.jvm.internal.s.h(key, "key");
            this.f4566l = key;
            this.f4567m = z0Var;
        }
    }

    public z0() {
        this.f4564a = new LinkedHashMap();
        this.f4565b = new o1.b(null, 1, null);
    }
}
