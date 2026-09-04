package l7;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f44039g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static t f44040h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f44041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f44042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f44043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f44044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f44045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Method f44046f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final t a() {
            Class clsA = u.a("com.android.billingclient.api.SkuDetailsParams");
            Class clsA2 = u.a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (clsA == null || clsA2 == null) {
                return null;
            }
            Method methodD = u.d(clsA, "newBuilder", new Class[0]);
            Method methodD2 = u.d(clsA2, "setType", String.class);
            Method methodD3 = u.d(clsA2, "setSkusList", List.class);
            Method methodD4 = u.d(clsA2, "build", new Class[0]);
            if (methodD == null || methodD2 == null || methodD3 == null || methodD4 == null) {
                return null;
            }
            t.b(new t(clsA, clsA2, methodD, methodD2, methodD3, methodD4));
            return t.a();
        }

        public final synchronized t b() {
            t tVarA;
            tVarA = t.a();
            if (tVarA == null) {
                tVarA = a();
            }
            return tVarA;
        }

        private a() {
        }
    }

    public t(Class skuDetailsParamsClazz, Class builderClazz, Method newBuilderMethod, Method setTypeMethod, Method setSkusListMethod, Method buildMethod) {
        kotlin.jvm.internal.s.h(skuDetailsParamsClazz, "skuDetailsParamsClazz");
        kotlin.jvm.internal.s.h(builderClazz, "builderClazz");
        kotlin.jvm.internal.s.h(newBuilderMethod, "newBuilderMethod");
        kotlin.jvm.internal.s.h(setTypeMethod, "setTypeMethod");
        kotlin.jvm.internal.s.h(setSkusListMethod, "setSkusListMethod");
        kotlin.jvm.internal.s.h(buildMethod, "buildMethod");
        this.f44041a = skuDetailsParamsClazz;
        this.f44042b = builderClazz;
        this.f44043c = newBuilderMethod;
        this.f44044d = setTypeMethod;
        this.f44045e = setSkusListMethod;
        this.f44046f = buildMethod;
    }

    public static final /* synthetic */ t a() {
        if (x7.a.c(t.class)) {
            return null;
        }
        try {
            return f44040h;
        } catch (Throwable th2) {
            x7.a.b(th2, t.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(t tVar) {
        if (x7.a.c(t.class)) {
            return;
        }
        try {
            f44040h = tVar;
        } catch (Throwable th2) {
            x7.a.b(th2, t.class);
        }
    }

    public final Object c(u.b productType, List list) {
        Object objE;
        Object objE2;
        if (x7.a.c(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(productType, "productType");
            Object objE3 = u.e(this.f44041a, this.f44043c, null, new Object[0]);
            if (objE3 == null || (objE = u.e(this.f44042b, this.f44044d, objE3, productType.g())) == null || (objE2 = u.e(this.f44042b, this.f44045e, objE, list)) == null) {
                return null;
            }
            return u.e(this.f44042b, this.f44046f, objE2, new Object[0]);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final Class d() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            return this.f44041a;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }
}
