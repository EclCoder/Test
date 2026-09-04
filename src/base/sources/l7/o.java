package l7;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements i {
    private static o Q;
    private final Method A;
    private final Method B;
    private final Method C;
    private final Method D;
    private final Method E;
    private final Method F;
    private final Method G;
    private final Method H;
    private final Method I;
    private final Method J;
    private final Method K;
    private final Method L;
    private final Method M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f43993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f43994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f43995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class f43996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class f43997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class f43998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f43999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class f44000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Class f44001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Class f44002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Class f44003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Class f44004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Class f44005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f44006n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Class f44007o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Class f44008p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Class f44009q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Class f44010r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Method f44011s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Method f44012t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Method f44013u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Method f44014v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Method f44015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Method f44016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Method f44017y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Method f44018z;
    public static final a N = new a(null);
    private static final String O = o.class.getCanonicalName();
    private static final AtomicBoolean P = new AtomicBoolean(false);
    private static final Map R = new ConcurrentHashMap();
    private static final Map S = new ConcurrentHashMap();
    private static final Map T = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements InvocationHandler {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object a(Context context, Class cls, Class cls2, Class cls3) {
            Object objE;
            Method methodD = u.d(cls, "newBuilder", Context.class);
            Method methodD2 = u.d(cls2, "setListener", cls3);
            Method methodD3 = u.d(cls2, "enablePendingPurchases", new Class[0]);
            Method methodD4 = u.d(cls2, "build", new Class[0]);
            if (methodD4 == null || methodD2 == null || methodD == null || methodD3 == null || (objE = u.e(cls2, methodD2, u.e(cls, methodD, null, context), Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, this))) == null) {
                return null;
            }
            return u.e(cls2, methodD4, u.e(cls2, methodD3, objE, new Object[0]), new Object[0]);
        }

        private final o b(Context context) {
            Class clsA = u.a("com.android.billingclient.api.BillingClient");
            Class clsA2 = u.a("com.android.billingclient.api.Purchase");
            Class clsA3 = u.a("com.android.billingclient.api.ProductDetails");
            Class clsA4 = u.a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class clsA5 = u.a("com.android.billingclient.api.QueryProductDetailsParams$Product");
            Class clsA6 = u.a("com.android.billingclient.api.BillingResult");
            Class clsA7 = u.a("com.android.billingclient.api.QueryProductDetailsParams");
            Class clsA8 = u.a("com.android.billingclient.api.QueryPurchaseHistoryParams");
            Class clsA9 = u.a("com.android.billingclient.api.QueryPurchasesParams");
            Class clsA10 = u.a("com.android.billingclient.api.QueryProductDetailsParams$Builder");
            Class clsA11 = u.a("com.android.billingclient.api.QueryPurchaseHistoryParams$Builder");
            Class clsA12 = u.a("com.android.billingclient.api.QueryPurchasesParams$Builder");
            Class clsA13 = u.a("com.android.billingclient.api.QueryProductDetailsParams$Product$Builder");
            Class clsA14 = u.a("com.android.billingclient.api.BillingClient$Builder");
            Class clsA15 = u.a("com.android.billingclient.api.PurchasesUpdatedListener");
            Class clsA16 = u.a("com.android.billingclient.api.BillingClientStateListener");
            Class clsA17 = u.a("com.android.billingclient.api.ProductDetailsResponseListener");
            Class clsA18 = u.a("com.android.billingclient.api.PurchasesResponseListener");
            Class clsA19 = u.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (clsA == null || clsA2 == null || clsA3 == null || clsA4 == null || clsA5 == null || clsA6 == null || clsA7 == null || clsA8 == null || clsA9 == null || clsA10 == null || clsA11 == null || clsA12 == null || clsA13 == null || clsA14 == null || clsA15 == null || clsA16 == null || clsA17 == null || clsA18 == null || clsA19 == null) {
                Log.w(o.h(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Method methodD = u.d(clsA, "queryPurchasesAsync", clsA9, clsA18);
            Method methodD2 = u.d(clsA9, "newBuilder", new Class[0]);
            Method methodD3 = u.d(clsA12, "build", new Class[0]);
            Method methodD4 = u.d(clsA12, "setProductType", String.class);
            Method methodD5 = u.d(clsA2, "getOriginalJson", new Class[0]);
            Method methodD6 = u.d(clsA, "queryPurchaseHistoryAsync", clsA8, clsA19);
            Method methodD7 = u.d(clsA8, "newBuilder", new Class[0]);
            Method methodD8 = u.d(clsA11, "build", new Class[0]);
            Method methodD9 = u.d(clsA11, "setProductType", String.class);
            Method methodD10 = u.d(clsA4, "getOriginalJson", new Class[0]);
            Method methodD11 = u.d(clsA, "queryProductDetailsAsync", clsA7, clsA17);
            Method methodD12 = u.d(clsA7, "newBuilder", new Class[0]);
            Method methodD13 = u.d(clsA10, "build", new Class[0]);
            Method methodD14 = u.d(clsA10, "setProductList", List.class);
            Method methodD15 = u.d(clsA5, "newBuilder", new Class[0]);
            Method methodD16 = u.d(clsA13, "build", new Class[0]);
            Method methodD17 = u.d(clsA13, "setProductId", String.class);
            Method methodD18 = u.d(clsA13, "setProductType", String.class);
            Method methodD19 = u.d(clsA3, "toString", new Class[0]);
            Method methodD20 = u.d(clsA, "startConnection", clsA16);
            Method methodD21 = u.d(clsA6, "getResponseCode", new Class[0]);
            if (methodD == null || methodD2 == null || methodD3 == null || methodD4 == null || methodD5 == null || methodD6 == null || methodD7 == null || methodD8 == null || methodD9 == null || methodD10 == null || methodD11 == null || methodD12 == null || methodD13 == null || methodD14 == null || methodD15 == null || methodD16 == null || methodD17 == null || methodD18 == null || methodD19 == null || methodD20 == null || methodD21 == null) {
                Log.w(o.h(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Object objA = a(context, clsA, clsA14, clsA15);
            if (objA == null) {
                Log.w(o.h(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            o.n(new o(objA, clsA, clsA2, clsA3, clsA4, clsA5, clsA6, clsA7, clsA8, clsA9, clsA10, clsA11, clsA12, clsA13, clsA16, clsA17, clsA18, clsA19, methodD, methodD2, methodD3, methodD4, methodD5, methodD6, methodD7, methodD8, methodD9, methodD10, methodD11, methodD12, methodD13, methodD14, methodD15, methodD16, methodD17, methodD18, methodD19, methodD20, methodD21, null));
            return o.e();
        }

        public final Map c() {
            return o.d();
        }

        public final synchronized o d(Context context) {
            o oVarE;
            kotlin.jvm.internal.s.h(context, "context");
            oVarE = o.e();
            if (oVarE == null) {
                oVarE = b(context);
            }
            return oVarE;
        }

        public final Map e() {
            return o.f();
        }

        public final Map f() {
            return o.g();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            kotlin.jvm.internal.s.h(proxy, "proxy");
            kotlin.jvm.internal.s.h(m10, "m");
            return null;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class b implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object[] f44019a;

        public b(Object[] objArr) {
            this.f44019a = objArr;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            kotlin.jvm.internal.s.h(proxy, "proxy");
            kotlin.jvm.internal.s.h(m10, "m");
            String name = m10.getName();
            if (name == null) {
                return null;
            }
            switch (name.hashCode()) {
                case -1642587947:
                    if (name.equals("onPurchaseHistoryResponse")) {
                        o.l(o.this, this.f44019a, objArr);
                        break;
                    }
                    break;
                case -1599362358:
                    if (name.equals("onQueryPurchasesResponse")) {
                        o.m(o.this, this.f44019a, objArr);
                        break;
                    }
                    break;
                case -79406125:
                    if (name.equals("onBillingSetupFinished")) {
                        o.j(o.this, this.f44019a, objArr);
                        break;
                    }
                    break;
                case 1227540564:
                    if (name.equals("onBillingServiceDisconnected")) {
                        o.i(o.this, this.f44019a, objArr);
                        break;
                    }
                    break;
                case 1940131955:
                    if (name.equals("onProductDetailsResponse")) {
                        o.k(o.this, this.f44019a, objArr);
                        break;
                    }
                    break;
            }
            return null;
        }
    }

    public /* synthetic */ o(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Class cls15, Class cls16, Class cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, cls8, cls9, cls10, cls11, cls12, cls13, cls14, cls15, cls16, cls17, method, method2, method3, method4, method5, method6, method7, method8, method9, method10, method11, method12, method13, method14, method15, method16, method17, method18, method19, method20, method21);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(o this$0, u.b productType, Runnable completionHandler) {
        if (x7.a.c(o.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(this$0, "this$0");
            kotlin.jvm.internal.s.h(productType, "$productType");
            kotlin.jvm.internal.s.h(completionHandler, "$completionHandler");
            u.e(this$0.f43994b, this$0.f44016x, this$0.p(), this$0.s(productType), Proxy.newProxyInstance(this$0.f44010r.getClassLoader(), new Class[]{this$0.f44010r}, this$0.new b(new Object[]{productType, completionHandler})));
        } catch (Throwable th2) {
            x7.a.b(th2, o.class);
        }
    }

    private final void B(Runnable runnable) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            u.e(this.f43994b, this.L, p(), Proxy.newProxyInstance(this.f44007o.getClassLoader(), new Class[]{this.f44007o}, new b(new Object[]{runnable})));
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public static final /* synthetic */ Map d() {
        if (x7.a.c(o.class)) {
            return null;
        }
        try {
            return R;
        } catch (Throwable th2) {
            x7.a.b(th2, o.class);
            return null;
        }
    }

    public static final /* synthetic */ o e() {
        if (x7.a.c(o.class)) {
            return null;
        }
        try {
            return Q;
        } catch (Throwable th2) {
            x7.a.b(th2, o.class);
            return null;
        }
    }

    public static final /* synthetic */ Map f() {
        if (x7.a.c(o.class)) {
            return null;
        }
        try {
            return T;
        } catch (Throwable th2) {
            x7.a.b(th2, o.class);
            return null;
        }
    }

    public static final /* synthetic */ Map g() {
        if (x7.a.c(o.class)) {
            return null;
        }
        try {
            return S;
        } catch (Throwable th2) {
            x7.a.b(th2, o.class);
            return null;
        }
    }

    public static final /* synthetic */ String h() {
        if (x7.a.c(o.class)) {
            return null;
        }
        try {
            return O;
        } catch (Throwable th2) {
            x7.a.b(th2, o.class);
            return null;
        }
    }

    public static final /* synthetic */ void i(o oVar, Object[] objArr, Object[] objArr2) {
        if (x7.a.c(o.class)) {
            return;
        }
        try {
            oVar.t(objArr, objArr2);
        } catch (Throwable th2) {
            x7.a.b(th2, o.class);
        }
    }

    public static final /* synthetic */ void j(o oVar, Object[] objArr, Object[] objArr2) {
        if (x7.a.c(o.class)) {
            return;
        }
        try {
            oVar.u(objArr, objArr2);
        } catch (Throwable th2) {
            x7.a.b(th2, o.class);
        }
    }

    public static final /* synthetic */ void k(o oVar, Object[] objArr, Object[] objArr2) {
        if (x7.a.c(o.class)) {
            return;
        }
        try {
            oVar.v(objArr, objArr2);
        } catch (Throwable th2) {
            x7.a.b(th2, o.class);
        }
    }

    public static final /* synthetic */ void l(o oVar, Object[] objArr, Object[] objArr2) {
        if (x7.a.c(o.class)) {
            return;
        }
        try {
            oVar.w(objArr, objArr2);
        } catch (Throwable th2) {
            x7.a.b(th2, o.class);
        }
    }

    public static final /* synthetic */ void m(o oVar, Object[] objArr, Object[] objArr2) {
        if (x7.a.c(o.class)) {
            return;
        }
        try {
            oVar.x(objArr, objArr2);
        } catch (Throwable th2) {
            x7.a.b(th2, o.class);
        }
    }

    public static final /* synthetic */ void n(o oVar) {
        if (x7.a.c(o.class)) {
            return;
        }
        try {
            Q = oVar;
        } catch (Throwable th2) {
            x7.a.b(th2, o.class);
        }
    }

    private final void o(Runnable runnable) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (P.get()) {
                runnable.run();
            } else {
                B(runnable);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final Object r(u.b bVar, List list) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            if (list.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Object objE = u.e(this.f44006n, this.H, u.e(this.f44006n, this.J, u.e(this.f44006n, this.I, u.e(this.f43998f, this.G, null, new Object[0]), str), bVar.g()), new Object[0]);
                if (objE != null) {
                    arrayList.add(objE);
                }
            }
            return u.e(this.f44003k, this.E, u.e(this.f44003k, this.F, u.e(this.f44000h, this.D, null, new Object[0]), arrayList), new Object[0]);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final Object s(u.b bVar) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            return u.e(this.f44004l, this.f44018z, u.e(this.f44004l, this.A, u.e(this.f44001i, this.f44017y, null, new Object[0]), bVar.g()), new Object[0]);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final void t(Object[] objArr, Object[] objArr2) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            P.set(false);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void u(Object[] objArr, Object[] objArr2) {
        Runnable runnable;
        if (x7.a.c(this) || objArr2 == null) {
            return;
        }
        try {
            if (objArr2.length == 0) {
                return;
            }
            if (kotlin.jvm.internal.s.c(u.e(this.f43999g, this.M, objArr2[0], new Object[0]), 0)) {
                P.set(true);
                if (objArr != null && objArr.length != 0) {
                    Object obj = objArr[0];
                    if (!(obj instanceof Runnable) || (runnable = (Runnable) obj) == null) {
                        return;
                    }
                    runnable.run();
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void v(Object[] objArr, Object[] objArr2) {
        Object objX;
        String strQ;
        if (x7.a.c(this)) {
            return;
        }
        if (objArr != null) {
            try {
                objX = gl.j.X(objArr, 0);
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return;
            }
        } else {
            objX = null;
        }
        Object objX2 = objArr2 != null ? gl.j.X(objArr2, 1) : null;
        if (objX2 != null && (objX2 instanceof List)) {
            Iterator it = ((List) objX2).iterator();
            while (it.hasNext()) {
                try {
                    Object objE = u.e(this.f43996d, this.K, it.next(), new Object[0]);
                    String str = objE instanceof String ? (String) objE : null;
                    if (str != null && (strQ = q(str)) != null) {
                        JSONObject jSONObject = new JSONObject(strQ);
                        if (jSONObject.has("productId")) {
                            String productId = jSONObject.getString("productId");
                            Map map = T;
                            kotlin.jvm.internal.s.g(productId, "productId");
                            map.put(productId, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (objX == null || !(objX instanceof Runnable)) {
                return;
            }
            ((Runnable) objX).run();
        }
    }

    private final void w(Object[] objArr, Object[] objArr2) {
        Object objX;
        if (x7.a.c(this)) {
            return;
        }
        if (objArr != null) {
            try {
                objX = gl.j.X(objArr, 0);
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return;
            }
        } else {
            objX = null;
        }
        if (objX != null && (objX instanceof u.b)) {
            Object objX2 = gl.j.X(objArr, 1);
            if (objX2 instanceof Runnable) {
                Object objX3 = objArr2 != null ? gl.j.X(objArr2, 1) : null;
                if (objX3 != null && (objX3 instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) objX3).iterator();
                    while (it.hasNext()) {
                        try {
                            Object objE = u.e(this.f43997e, this.B, it.next(), new Object[0]);
                            String str = objE instanceof String ? (String) objE : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String productId = jSONObject.getString("productId");
                                    if (!T.containsKey(productId)) {
                                        kotlin.jvm.internal.s.g(productId, "productId");
                                        arrayList.add(productId);
                                    }
                                    if (objX == u.b.INAPP) {
                                        Map map = R;
                                        kotlin.jvm.internal.s.g(productId, "productId");
                                        map.put(productId, jSONObject);
                                    } else {
                                        Map map2 = S;
                                        kotlin.jvm.internal.s.g(productId, "productId");
                                        map2.put(productId, jSONObject);
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ((Runnable) objX2).run();
                    } else {
                        y((u.b) objX, arrayList, (Runnable) objX2);
                    }
                }
            }
        }
    }

    private final void x(Object[] objArr, Object[] objArr2) {
        Object objX;
        if (x7.a.c(this)) {
            return;
        }
        if (objArr != null) {
            try {
                objX = gl.j.X(objArr, 0);
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return;
            }
        } else {
            objX = null;
        }
        if (objX != null && (objX instanceof u.b)) {
            Object objX2 = gl.j.X(objArr, 1);
            if (objX2 instanceof Runnable) {
                Object objX3 = objArr2 != null ? gl.j.X(objArr2, 1) : null;
                if (objX3 != null && (objX3 instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) objX3).iterator();
                    while (it.hasNext()) {
                        Object objE = u.e(this.f43995c, this.f44015w, it.next(), new Object[0]);
                        String str = objE instanceof String ? (String) objE : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("productId")) {
                                String productId = jSONObject.getString("productId");
                                if (!T.containsKey(productId)) {
                                    kotlin.jvm.internal.s.g(productId, "productId");
                                    arrayList.add(productId);
                                }
                                if (objX == u.b.INAPP) {
                                    Map map = R;
                                    kotlin.jvm.internal.s.g(productId, "productId");
                                    map.put(productId, jSONObject);
                                } else {
                                    Map map2 = S;
                                    kotlin.jvm.internal.s.g(productId, "productId");
                                    map2.put(productId, jSONObject);
                                }
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ((Runnable) objX2).run();
                    } else {
                        y((u.b) objX, arrayList, (Runnable) objX2);
                    }
                }
            }
        }
    }

    private final void y(final u.b bVar, final List list, final Runnable runnable) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            o(new Runnable() { // from class: l7.n
                @Override // java.lang.Runnable
                public final void run() {
                    o.z(this.f43989a, runnable, bVar, list);
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(o this$0, Runnable completionHandler, u.b productType, List productIds) {
        if (x7.a.c(o.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(this$0, "this$0");
            kotlin.jvm.internal.s.h(completionHandler, "$completionHandler");
            kotlin.jvm.internal.s.h(productType, "$productType");
            kotlin.jvm.internal.s.h(productIds, "$productIds");
            Object objNewProxyInstance = Proxy.newProxyInstance(this$0.f44008p.getClassLoader(), new Class[]{this$0.f44008p}, this$0.new b(new Object[]{completionHandler}));
            Object objR = this$0.r(productType, productIds);
            if (objR != null) {
                u.e(this$0.f43994b, this$0.C, this$0.p(), objR, objNewProxyInstance);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, o.class);
        }
    }

    @Override // l7.i
    public void a(final u.b productType, final Runnable completionHandler) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(productType, "productType");
            kotlin.jvm.internal.s.h(completionHandler, "completionHandler");
            o(new Runnable() { // from class: l7.m
                @Override // java.lang.Runnable
                public final void run() {
                    o.A(this.f43986a, productType, completionHandler);
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public Object p() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            return this.f43993a;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final String q(String productDetailsString) {
        List listA;
        if (x7.a.c(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(productDetailsString, "productDetailsString");
            bm.l lVarC = bm.o.c(new bm.o("jsonString='(.*?)'"), productDetailsString, 0, 2, null);
            if (lVarC == null || (listA = lVarC.a()) == null) {
                return null;
            }
            return (String) gl.r.e0(listA, 1);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private o(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Class cls15, Class cls16, Class cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21) {
        this.f43993a = obj;
        this.f43994b = cls;
        this.f43995c = cls2;
        this.f43996d = cls3;
        this.f43997e = cls4;
        this.f43998f = cls5;
        this.f43999g = cls6;
        this.f44000h = cls7;
        this.f44001i = cls8;
        this.f44002j = cls9;
        this.f44003k = cls10;
        this.f44004l = cls11;
        this.f44005m = cls12;
        this.f44006n = cls13;
        this.f44007o = cls14;
        this.f44008p = cls15;
        this.f44009q = cls16;
        this.f44010r = cls17;
        this.f44011s = method;
        this.f44012t = method2;
        this.f44013u = method3;
        this.f44014v = method4;
        this.f44015w = method5;
        this.f44016x = method6;
        this.f44017y = method7;
        this.f44018z = method8;
        this.A = method9;
        this.B = method10;
        this.C = method11;
        this.D = method12;
        this.E = method13;
        this.F = method14;
        this.G = method15;
        this.H = method16;
        this.I = method17;
        this.J = method18;
        this.K = method19;
        this.L = method20;
        this.M = method21;
    }
}
