package l7;

import android.content.Context;
import android.util.Log;
import fl.g0;
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
public final class l implements i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static l f43959s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f43964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f43965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f43966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class f43967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class f43968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class f43969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f43970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class f43971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Method f43972i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Method f43973j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Method f43974k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Method f43975l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Method f43976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Method f43977n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Method f43978o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final t f43979p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f43957q = new b(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f43958r = l.class.getCanonicalName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final AtomicBoolean f43960t = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Map f43961u = new ConcurrentHashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Map f43962v = new ConcurrentHashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Map f43963w = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f43980a;

        public a(Runnable runnable) {
            this.f43980a = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            Method methodD;
            if (x7.a.c(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.s.h(proxy, "proxy");
                kotlin.jvm.internal.s.h(m10, "m");
                if (kotlin.jvm.internal.s.c(m10.getName(), "onBillingSetupFinished")) {
                    Object objX = objArr != null ? gl.j.X(objArr, 0) : null;
                    Class clsA = u.a("com.android.billingclient.api.BillingResult");
                    if (clsA != null && (methodD = u.d(clsA, "getResponseCode", new Class[0])) != null && kotlin.jvm.internal.s.c(u.e(clsA, methodD, objX, new Object[0]), 0)) {
                        l.f43957q.g().set(true);
                        Runnable runnable = this.f43980a;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                } else {
                    String name = m10.getName();
                    kotlin.jvm.internal.s.g(name, "m.name");
                    if (bm.r.z(name, "onBillingServiceDisconnected", false, 2, null)) {
                        l.f43957q.g().set(false);
                    }
                }
                return null;
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object a(Context context, Class cls) {
            Object objE;
            Object objE2;
            Object objE3;
            Class clsA = u.a("com.android.billingclient.api.BillingClient$Builder");
            Class clsA2 = u.a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (clsA != null && clsA2 != null) {
                Method methodD = u.d(cls, "newBuilder", Context.class);
                Method methodD2 = u.d(clsA, "enablePendingPurchases", new Class[0]);
                Method methodD3 = u.d(clsA, "setListener", clsA2);
                Method methodD4 = u.d(clsA, "build", new Class[0]);
                if (methodD == null || methodD2 == null || methodD3 == null || methodD4 == null || (objE = u.e(cls, methodD, null, context)) == null || (objE2 = u.e(clsA, methodD3, objE, Proxy.newProxyInstance(clsA2.getClassLoader(), new Class[]{clsA2}, new d()))) == null || (objE3 = u.e(clsA, methodD2, objE2, new Object[0])) == null) {
                    return null;
                }
                return u.e(clsA, methodD4, objE3, new Object[0]);
            }
            return null;
        }

        private final l b(Context context) {
            t tVarB = t.f44039g.b();
            if (tVarB == null) {
                return null;
            }
            Class clsA = u.a("com.android.billingclient.api.BillingClient");
            Class clsA2 = u.a("com.android.billingclient.api.Purchase");
            Class clsA3 = u.a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class clsA4 = u.a("com.android.billingclient.api.SkuDetails");
            Class clsA5 = u.a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class clsA6 = u.a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class clsA7 = u.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (clsA == null || clsA3 == null || clsA2 == null || clsA4 == null || clsA6 == null || clsA5 == null || clsA7 == null) {
                Log.w(l.l(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Method methodD = u.d(clsA, "queryPurchases", String.class);
            Method methodD2 = u.d(clsA3, "getPurchasesList", new Class[0]);
            Method methodD3 = u.d(clsA2, "getOriginalJson", new Class[0]);
            Method methodD4 = u.d(clsA4, "getOriginalJson", new Class[0]);
            Method methodD5 = u.d(clsA5, "getOriginalJson", new Class[0]);
            Method methodD6 = u.d(clsA, "querySkuDetailsAsync", tVarB.d(), clsA6);
            Method methodD7 = u.d(clsA, "queryPurchaseHistoryAsync", String.class, clsA7);
            if (methodD == null || methodD2 == null || methodD3 == null || methodD4 == null || methodD5 == null || methodD6 == null || methodD7 == null) {
                Log.w(l.l(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Object objA = a(context, clsA);
            if (objA == null) {
                Log.w(l.l(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            l.o(new l(objA, clsA, clsA3, clsA2, clsA4, clsA5, clsA6, clsA7, methodD, methodD2, methodD3, methodD4, methodD5, methodD6, methodD7, tVarB, null));
            return l.g();
        }

        public final Map c() {
            return l.f();
        }

        public final synchronized l d(Context context) {
            l lVarG;
            kotlin.jvm.internal.s.h(context, "context");
            lVarG = l.g();
            if (lVarG == null) {
                lVarG = b(context);
            }
            return lVarG;
        }

        public final Map e() {
            return l.j();
        }

        public final Map f() {
            return l.k();
        }

        public final AtomicBoolean g() {
            return l.m();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class c implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private u.b f43981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Runnable f43982b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f43983c;

        public c(l lVar, u.b skuType, Runnable completionHandler) {
            kotlin.jvm.internal.s.h(skuType, "skuType");
            kotlin.jvm.internal.s.h(completionHandler, "completionHandler");
            this.f43983c = lVar;
            this.f43981a = skuType;
            this.f43982b = completionHandler;
        }

        public void a(Object proxy, Method method, Object[] objArr) {
            if (x7.a.c(this)) {
                return;
            }
            try {
                kotlin.jvm.internal.s.h(proxy, "proxy");
                kotlin.jvm.internal.s.h(method, "method");
                if (kotlin.jvm.internal.s.c(method.getName(), "onPurchaseHistoryResponse")) {
                    Object objX = objArr != null ? gl.j.X(objArr, 1) : null;
                    if (objX != null && (objX instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) objX).iterator();
                        while (it.hasNext()) {
                            try {
                                Object objE = u.e(l.h(this.f43983c), l.d(this.f43983c), it.next(), new Object[0]);
                                String str = objE instanceof String ? (String) objE : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String skuID = jSONObject.getString("productId");
                                        kotlin.jvm.internal.s.g(skuID, "skuID");
                                        arrayList.add(skuID);
                                        if (this.f43981a == u.b.INAPP) {
                                            l.f43957q.c().put(skuID, jSONObject);
                                        } else {
                                            l.f43957q.f().put(skuID, jSONObject);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (arrayList.isEmpty()) {
                            this.f43982b.run();
                        } else {
                            l.n(this.f43983c, this.f43981a, arrayList, this.f43982b);
                        }
                    }
                }
            } catch (Throwable th2) {
                x7.a.b(th2, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (x7.a.c(this)) {
                return null;
            }
            try {
                a(obj, method, objArr);
                return g0.f38750a;
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            if (x7.a.c(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.s.h(proxy, "proxy");
                kotlin.jvm.internal.s.h(m10, "m");
                return null;
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class e implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Runnable f43984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f43985b;

        public e(l lVar, Runnable completionHandler) {
            kotlin.jvm.internal.s.h(completionHandler, "completionHandler");
            this.f43985b = lVar;
            this.f43984a = completionHandler;
        }

        public void a(Object proxy, Method m10, Object[] objArr) {
            if (x7.a.c(this)) {
                return;
            }
            try {
                kotlin.jvm.internal.s.h(proxy, "proxy");
                kotlin.jvm.internal.s.h(m10, "m");
                if (kotlin.jvm.internal.s.c(m10.getName(), "onSkuDetailsResponse")) {
                    Object objX = objArr != null ? gl.j.X(objArr, 1) : null;
                    if (objX != null && (objX instanceof List)) {
                        Iterator it = ((List) objX).iterator();
                        while (it.hasNext()) {
                            try {
                                Object objE = u.e(l.i(this.f43985b), l.e(this.f43985b), it.next(), new Object[0]);
                                String str = objE instanceof String ? (String) objE : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String skuID = jSONObject.getString("productId");
                                        Map mapE = l.f43957q.e();
                                        kotlin.jvm.internal.s.g(skuID, "skuID");
                                        mapE.put(skuID, jSONObject);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        this.f43984a.run();
                    }
                }
            } catch (Throwable th2) {
                x7.a.b(th2, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (x7.a.c(this)) {
                return null;
            }
            try {
                a(obj, method, objArr);
                return g0.f38750a;
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return null;
            }
        }
    }

    public /* synthetic */ l(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, t tVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, tVar);
    }

    public static final /* synthetic */ Method d(l lVar) {
        if (x7.a.c(l.class)) {
            return null;
        }
        try {
            return lVar.f43976m;
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Method e(l lVar) {
        if (x7.a.c(l.class)) {
            return null;
        }
        try {
            return lVar.f43975l;
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Map f() {
        if (x7.a.c(l.class)) {
            return null;
        }
        try {
            return f43961u;
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ l g() {
        if (x7.a.c(l.class)) {
            return null;
        }
        try {
            return f43959s;
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Class h(l lVar) {
        if (x7.a.c(l.class)) {
            return null;
        }
        try {
            return lVar.f43969f;
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Class i(l lVar) {
        if (x7.a.c(l.class)) {
            return null;
        }
        try {
            return lVar.f43968e;
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Map j() {
        if (x7.a.c(l.class)) {
            return null;
        }
        try {
            return f43963w;
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Map k() {
        if (x7.a.c(l.class)) {
            return null;
        }
        try {
            return f43962v;
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ String l() {
        if (x7.a.c(l.class)) {
            return null;
        }
        try {
            return f43958r;
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean m() {
        if (x7.a.c(l.class)) {
            return null;
        }
        try {
            return f43960t;
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void n(l lVar, u.b bVar, List list, Runnable runnable) {
        if (x7.a.c(l.class)) {
            return;
        }
        try {
            lVar.s(bVar, list, runnable);
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
        }
    }

    public static final /* synthetic */ void o(l lVar) {
        if (x7.a.c(l.class)) {
            return;
        }
        try {
            f43959s = lVar;
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
        }
    }

    private final void p(Runnable runnable) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (f43960t.get()) {
                runnable.run();
            } else {
                u(runnable);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(l this$0, u.b productType, Runnable completionHandler) {
        if (x7.a.c(l.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(this$0, "this$0");
            kotlin.jvm.internal.s.h(productType, "$productType");
            kotlin.jvm.internal.s.h(completionHandler, "$completionHandler");
            u.e(this$0.f43965b, this$0.f43978o, this$0.q(), productType.g(), Proxy.newProxyInstance(this$0.f43971h.getClassLoader(), new Class[]{this$0.f43971h}, new c(this$0, productType, completionHandler)));
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
        }
    }

    private final void s(final u.b bVar, final List list, final Runnable runnable) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            p(new Runnable() { // from class: l7.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.t(this.f43953a, runnable, bVar, list);
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(l this$0, Runnable completionHandler, u.b skuType, List skuIDs) {
        if (x7.a.c(l.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(this$0, "this$0");
            kotlin.jvm.internal.s.h(completionHandler, "$completionHandler");
            kotlin.jvm.internal.s.h(skuType, "$skuType");
            kotlin.jvm.internal.s.h(skuIDs, "$skuIDs");
            Object objNewProxyInstance = Proxy.newProxyInstance(this$0.f43970g.getClassLoader(), new Class[]{this$0.f43970g}, new e(this$0, completionHandler));
            u.e(this$0.f43965b, this$0.f43977n, this$0.q(), this$0.f43979p.c(skuType, skuIDs), objNewProxyInstance);
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
        }
    }

    private final void u(Runnable runnable) {
        Method methodD;
        if (x7.a.c(this)) {
            return;
        }
        try {
            Class clsA = u.a("com.android.billingclient.api.BillingClientStateListener");
            if (clsA == null || (methodD = u.d(this.f43965b, "startConnection", clsA)) == null) {
                return;
            }
            u.e(this.f43965b, methodD, q(), Proxy.newProxyInstance(clsA.getClassLoader(), new Class[]{clsA}, new a(runnable)));
        } catch (Throwable th2) {
            x7.a.b(th2, this);
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
            p(new Runnable() { // from class: l7.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.r(this.f43950a, productType, completionHandler);
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public Object q() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            return this.f43964a;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private l(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, t tVar) {
        this.f43964a = obj;
        this.f43965b = cls;
        this.f43966c = cls2;
        this.f43967d = cls3;
        this.f43968e = cls4;
        this.f43969f = cls5;
        this.f43970g = cls6;
        this.f43971h = cls7;
        this.f43972i = method;
        this.f43973j = method2;
        this.f43974k = method3;
        this.f43975l = method4;
        this.f43976m = method5;
        this.f43977n = method6;
        this.f43978o = method7;
        this.f43979p = tVar;
    }
}
