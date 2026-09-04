package com.mbridge.msdk.foundation.controller;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.setting.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f30137q = com.mbridge.msdk.foundation.controller.c.class.getSimpleName();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static HashMap<String, String> f30138r = new HashMap<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static com.mbridge.msdk.config.component.status.b f30139s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f30141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f30142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f30143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<Activity> f30144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f30145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30146g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f30149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f30150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f30151l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WeakReference<Context> f30153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private JSONObject f30154o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f30140a = new s();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONObject f30147h = new JSONObject();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f30148i = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f30152m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f30155p = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0388a implements Runnable {
        RunnableC0388a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.e.a(a.this.f30142c).a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.d.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.f30141b = (String) y0.a(aVar.f30142c, "sp_appId", "");
            } catch (Throwable th2) {
                q0.b(a.f30137q, th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.f30149j = (String) y0.a(aVar.f30142c, "sp_appKey", "");
            } catch (Throwable th2) {
                q0.b(a.f30137q, th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
    }

    private void m() {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.i() && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                Object objA = y0.a(this.f30142c, MBridgeConstans.SP_GA_ID, "");
                Object objA2 = y0.a(this.f30142c, MBridgeConstans.SP_GA_ID_LIMIT, 0);
                if (objA instanceof String) {
                    String str = (String) objA;
                    if (TextUtils.isEmpty(str)) {
                        g.d();
                    } else {
                        g.a(str);
                    }
                    if (objA2 instanceof Integer) {
                        g.a(((Integer) objA2).intValue());
                    }
                }
            }
        } catch (Exception e10) {
            q0.b(f30137q, e10.getMessage());
        }
    }

    protected abstract void a(e eVar);

    public void b(int i10) {
        this.f30151l = i10;
    }

    public void c(int i10) {
        this.f30155p = i10;
    }

    public Context d() {
        return this.f30142c;
    }

    public s e() {
        return this.f30140a;
    }

    public Context f() {
        WeakReference<Context> weakReference = this.f30153n;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public int g() {
        return this.f30146g;
    }

    public String h() {
        return !TextUtils.isEmpty(this.f30150k) ? this.f30150k : "";
    }

    public String i() {
        try {
            if (!TextUtils.isEmpty(this.f30143d)) {
                return this.f30143d;
            }
            Context context = this.f30142c;
            if (context == null) {
                return null;
            }
            String packageName = context.getPackageName();
            this.f30143d = packageName;
            return packageName;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public String j() {
        if (!TextUtils.isEmpty(this.f30150k)) {
            return this.f30150k;
        }
        Context context = this.f30142c;
        if (context != null) {
            return (String) y0.a(context, "sp_wx_appKey", "");
        }
        return null;
    }

    public JSONObject k() {
        return this.f30154o;
    }

    public int l() {
        return this.f30155p;
    }

    public WeakReference<Activity> a() {
        return this.f30144e;
    }

    public void b(e eVar) {
        try {
            m0.D(this.f30142c);
            a(eVar);
            h.a(this.f30142c, this.f30141b);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                try {
                    try {
                        PackageManager packageManager = this.f30142c.getPackageManager();
                        m0.d(packageManager.getApplicationInfo("com.android.vending", 0).enabled ? 1 : 2);
                        PackageInfo packageInfo = packageManager.getPackageInfo("com.android.vending", 0);
                        m0.f(packageInfo != null ? packageInfo.versionName : MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    } catch (PackageManager.NameNotFoundException unused) {
                        m0.d(0);
                    }
                } catch (Throwable th2) {
                    q0.b(f30137q, th2.getMessage());
                }
            }
            try {
                com.mbridge.msdk.setting.g gVarF = h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarF == null) {
                    gVarF = h.b().a();
                }
                s sVarE = com.mbridge.msdk.foundation.controller.c.n().e();
                if (sVarE != null && sVarE.b() && gVarF != null && gVarF.F() == 1) {
                    com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0388a());
                }
                if (sVarE == null || !sVarE.a()) {
                    return;
                }
                com.mbridge.msdk.foundation.same.threadpool.a.c().post(new b());
            } catch (Throwable th3) {
                q0.b(f30137q, th3.getMessage());
            }
        } catch (Exception e10) {
            q0.b(f30137q, e10.getMessage());
        }
    }

    public void c(e eVar) {
        if (this.f30148i) {
            return;
        }
        m();
        try {
            JSONObject jSONObject = new JSONObject();
            this.f30154o = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e10) {
            q0.b(f30137q, e10.getMessage());
        }
        b(eVar);
    }

    public void d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f30150k = str;
            Context context = this.f30142c;
            if (context != null) {
                y0.b(context, "sp_wx_appKey", str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void e(String str) {
        Context context;
        try {
            this.f30141b = str;
            if (TextUtils.isEmpty(str) || (context = this.f30142c) == null) {
                return;
            }
            y0.b(context, "sp_appId", str);
        } catch (Exception e10) {
            q0.b(f30137q, e10.getMessage());
        }
    }

    public void f(String str) {
        Context context;
        try {
            this.f30149j = str;
            if (TextUtils.isEmpty(str) || (context = this.f30142c) == null) {
                return;
            }
            y0.b(context, "sp_appKey", str);
        } catch (Exception e10) {
            q0.b(f30137q, e10.getMessage());
        }
    }

    public void a(WeakReference<Activity> weakReference) {
        this.f30144e = weakReference;
    }

    public void a(Context context) {
        if (context instanceof Activity) {
            this.f30153n = new WeakReference<>(context);
        }
    }

    public void a(int i10) {
        this.f30146g = i10;
    }

    public BitmapDrawable a(String str, int i10) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        String str2;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.f30152m) == null || !concurrentHashMap.containsKey(str) || !s0.a().a("w_m_r_l", true)) {
            return null;
        }
        String str3 = this.f30152m.get(str);
        BitmapDrawable bitmapDrawableN = v0.n(str3);
        int i11 = TextUtils.isEmpty(str3) ? 2 : 1;
        if (TextUtils.isEmpty(str3)) {
            str2 = "get watermark failed";
        } else {
            str2 = bitmapDrawableN != null ? "" : "str to bitmap failed";
        }
        j.a(str, i10, i11, str2, bitmapDrawableN == null ? 2 : 1, str3);
        return bitmapDrawableN;
    }

    public String c() {
        try {
            if (!TextUtils.isEmpty(this.f30149j)) {
                return this.f30149j;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new d());
            return "";
        } catch (Throwable th2) {
            q0.b(f30137q, th2.getMessage());
            return "";
        }
    }

    public void a(JSONObject jSONObject) {
        this.f30154o = jSONObject;
    }

    public void a(String str) {
        try {
            if (this.f30152m != null && !TextUtils.isEmpty(str) && this.f30152m.containsKey(str)) {
                this.f30152m.remove(str);
            }
        } catch (Exception e10) {
            q0.b(f30137q, e10.getMessage());
        }
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f30143d = str;
    }

    public void a(String str, JSONObject jSONObject) {
        if (s0.a().a("w_m_r_l", true)) {
            try {
                if (this.f30147h == null) {
                    this.f30147h = jSONObject;
                } else if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        this.f30147h.put(next, jSONObject.get(next));
                    }
                }
                if (this.f30147h.has(MBridgeConstans.EXTRA_KEY_WM)) {
                    if (this.f30152m == null) {
                        this.f30152m = new ConcurrentHashMap<>();
                    }
                    this.f30152m.put(str, this.f30147h.getString(MBridgeConstans.EXTRA_KEY_WM));
                }
            } catch (Exception e10) {
                q0.b(f30137q, e10.getMessage());
            }
        }
    }

    public String b() {
        try {
            if (!TextUtils.isEmpty(this.f30141b)) {
                return this.f30141b;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new c());
            return "";
        } catch (Exception e10) {
            q0.b(f30137q, e10.getMessage());
            return "";
        }
    }

    public void b(String str) {
        Context context;
        try {
            this.f30145f = str;
            if (TextUtils.isEmpty(str) || (context = this.f30142c) == null) {
                return;
            }
            y0.b(context, "applicationIds", str);
        } catch (Exception e10) {
            q0.b(f30137q, e10.getMessage());
        }
    }

    public void b(Context context) {
        this.f30142c = context;
    }
}
