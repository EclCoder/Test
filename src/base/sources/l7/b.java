package l7;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.h0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f43931a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f43932b = b.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f43933c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Boolean f43934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Boolean f43935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ServiceConnection f43936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Application.ActivityLifecycleCallbacks f43937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Intent f43938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Object f43939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static u.a f43940j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            kotlin.jvm.internal.s.h(name, "name");
            kotlin.jvm.internal.s.h(service, "service");
            b bVar = b.f43931a;
            b.f43939i = q.a(h0.m(), service);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            kotlin.jvm.internal.s.h(name, "name");
        }
    }

    /* JADX INFO: renamed from: l7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0669b implements Application.ActivityLifecycleCallbacks {
        C0669b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c() {
            Context contextM = h0.m();
            ArrayList arrayListI = q.i(contextM, b.f43939i);
            b bVar = b.f43931a;
            bVar.f(contextM, arrayListI, false);
            bVar.f(contextM, q.j(contextM, b.f43939i), true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d() {
            Context contextM = h0.m();
            ArrayList arrayListI = q.i(contextM, b.f43939i);
            if (arrayListI.isEmpty()) {
                arrayListI = q.g(contextM, b.f43939i);
            }
            b.f43931a.f(contextM, arrayListI, false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.s.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.s.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.s.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.s.h(activity, "activity");
            try {
                h0.v().execute(new Runnable() { // from class: l7.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.C0669b.c();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            kotlin.jvm.internal.s.h(activity, "activity");
            kotlin.jvm.internal.s.h(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.s.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.s.h(activity, "activity");
            try {
                if (kotlin.jvm.internal.s.c(b.f43935e, Boolean.TRUE) && kotlin.jvm.internal.s.c(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    h0.v().execute(new Runnable() { // from class: l7.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.C0669b.d();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    private b() {
    }

    private final void e() {
        if (f43934d != null) {
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(u.a("com.android.vending.billing.IInAppBillingService$Stub") != null);
        f43934d = boolValueOf;
        if (kotlin.jvm.internal.s.c(boolValueOf, Boolean.FALSE)) {
            return;
        }
        f43935e = Boolean.valueOf(u.a("com.android.billingclient.api.ProxyBillingActivity") != null);
        q.b();
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        kotlin.jvm.internal.s.g(intent, "Intent(\"com.android.vend…ge(\"com.android.vending\")");
        f43938h = intent;
        f43936f = new a();
        f43937g = new C0669b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Context context, ArrayList arrayList, boolean z10) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String purchase = (String) arrayList.get(i10);
            try {
                String sku = new JSONObject(purchase).getString("productId");
                kotlin.jvm.internal.s.g(sku, "sku");
                kotlin.jvm.internal.s.g(purchase, "purchase");
                map.put(sku, purchase);
                arrayList2.add(sku);
            } catch (JSONException e10) {
                Log.e(f43932b, "Error parsing in-app purchase data.", e10);
            }
            i10 = i11;
        }
        for (Map.Entry entry : q.k(context, arrayList2, f43939i, z10).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) map.get(str);
            if (str3 != null) {
                n7.k.k(str3, str2, z10, f43940j, false, 16, null);
            }
        }
    }

    public static final void g(u.a billingClientVersion) {
        kotlin.jvm.internal.s.h(billingClientVersion, "billingClientVersion");
        b bVar = f43931a;
        bVar.e();
        if (!kotlin.jvm.internal.s.c(f43934d, Boolean.FALSE) && n7.k.g()) {
            f43940j = billingClientVersion;
            bVar.h();
        }
    }

    private final void h() {
        if (f43933c.compareAndSet(false, true)) {
            Context contextM = h0.m();
            if (contextM instanceof Application) {
                Application application = (Application) contextM;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f43937g;
                ServiceConnection serviceConnection = null;
                if (activityLifecycleCallbacks == null) {
                    kotlin.jvm.internal.s.w("callbacks");
                    activityLifecycleCallbacks = null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent = f43938h;
                if (intent == null) {
                    kotlin.jvm.internal.s.w("intent");
                    intent = null;
                }
                ServiceConnection serviceConnection2 = f43936f;
                if (serviceConnection2 == null) {
                    kotlin.jvm.internal.s.w("serviceConnection");
                } else {
                    serviceConnection = serviceConnection2;
                }
                contextM.bindService(intent, serviceConnection, 1);
            }
        }
    }
}
