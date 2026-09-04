package e7;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.e1;
import com.facebook.internal.w;
import com.facebook.j0;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SensorManager f37186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static l f37187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f37188e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile boolean f37191h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f37184a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m f37185b = new m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicBoolean f37189f = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f37190g = new AtomicBoolean(false);

    private e() {
    }

    private final void c(final String str) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (f37191h) {
                return;
            }
            f37191h = true;
            h0.v().execute(new Runnable() { // from class: e7.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.d(str);
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str) {
        String str2 = MBridgeConstans.ENDCARD_URL_TYPE_PL;
        if (x7.a.c(e.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            com.facebook.internal.b bVarE = com.facebook.internal.b.f15130f.e(h0.m());
            JSONArray jSONArray = new JSONArray();
            String str3 = Build.MODEL;
            if (str3 == null) {
                str3 = "";
            }
            jSONArray.put(str3);
            if ((bVarE != null ? bVarE.h() : null) != null) {
                jSONArray.put(bVarE.h());
            } else {
                jSONArray.put("");
            }
            jSONArray.put(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            if (n7.h.e()) {
                str2 = "1";
            }
            jSONArray.put(str2);
            Locale localeB = e1.B();
            jSONArray.put(localeB.getLanguage() + '_' + localeB.getCountry());
            String string = jSONArray.toString();
            s.g(string, "extInfoArray.toString()");
            bundle.putString("device_session_id", g());
            bundle.putString("extinfo", string);
            j0.c cVar = j0.f15486n;
            o0 o0Var = o0.f43602a;
            boolean z10 = true;
            String str4 = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
            s.g(str4, "format(locale, format, *args)");
            JSONObject jSONObjectC = cVar.B(null, str4, bundle, null).k().c();
            AtomicBoolean atomicBoolean = f37190g;
            if (jSONObjectC == null || !jSONObjectC.optBoolean("is_app_indexing_enabled", false)) {
                z10 = false;
            }
            atomicBoolean.set(z10);
            if (atomicBoolean.get()) {
                l lVar = f37187d;
                if (lVar != null) {
                    lVar.h();
                }
            } else {
                f37188e = null;
            }
            f37191h = false;
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
        }
    }

    public static final void e() {
        if (x7.a.c(e.class)) {
            return;
        }
        try {
            f37189f.set(false);
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
        }
    }

    public static final void f() {
        if (x7.a.c(e.class)) {
            return;
        }
        try {
            f37189f.set(true);
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
        }
    }

    public static final String g() {
        if (x7.a.c(e.class)) {
            return null;
        }
        try {
            if (f37188e == null) {
                f37188e = UUID.randomUUID().toString();
            }
            String str = f37188e;
            s.f(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
            return null;
        }
    }

    public static final boolean h() {
        if (x7.a.c(e.class)) {
            return false;
        }
        try {
            return f37190g.get();
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
            return false;
        }
    }

    private final boolean i() {
        x7.a.c(this);
        return false;
    }

    public static final void j(Activity activity) {
        if (x7.a.c(e.class)) {
            return;
        }
        try {
            s.h(activity, "activity");
            g.f37193f.a().f(activity);
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
        }
    }

    public static final void k(Activity activity) {
        if (x7.a.c(e.class)) {
            return;
        }
        try {
            s.h(activity, "activity");
            if (f37189f.get()) {
                g.f37193f.a().h(activity);
                l lVar = f37187d;
                if (lVar != null) {
                    lVar.l();
                }
                SensorManager sensorManager = f37186c;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(f37185b);
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
        }
    }

    public static final void l(Activity activity) {
        if (x7.a.c(e.class)) {
            return;
        }
        try {
            s.h(activity, "activity");
            if (f37189f.get()) {
                g.f37193f.a().e(activity);
                Context applicationContext = activity.getApplicationContext();
                final String strN = h0.n();
                final w wVarF = a0.f(strN);
                if ((wVarF != null && wVarF.d()) || f37184a.i()) {
                    SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                    if (sensorManager == null) {
                        return;
                    }
                    f37186c = sensorManager;
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    l lVar = new l(activity);
                    f37187d = lVar;
                    m mVar = f37185b;
                    mVar.a(new m.b() { // from class: e7.c
                        @Override // e7.m.b
                        public final void a() {
                            e.m(wVarF, strN);
                        }
                    });
                    sensorManager.registerListener(mVar, defaultSensor, 2);
                    if (wVarF != null && wVarF.d()) {
                        lVar.h();
                    }
                }
                e eVar = f37184a;
                if (!eVar.i() || f37190g.get()) {
                    return;
                }
                eVar.c(strN);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(w wVar, String appId) {
        if (x7.a.c(e.class)) {
            return;
        }
        try {
            s.h(appId, "$appId");
            boolean z10 = wVar != null && wVar.d();
            boolean zU = h0.u();
            if (z10 && zU) {
                f37184a.c(appId);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
        }
    }

    public static final void n(boolean z10) {
        if (x7.a.c(e.class)) {
            return;
        }
        try {
            f37190g.set(z10);
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
        }
    }
}
