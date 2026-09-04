package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.j;
import java.util.List;
import java.util.Map;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile d f30181l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f30183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FastKV f30184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30185d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f30186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f30187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f30188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f30189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f30190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.preload.a f30191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f30192k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f30193a;

        a(Context context) {
            this.f30193a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.h(this.f30193a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Looper.prepare();
            d.this.g();
            d.this.d();
            Looper.loop();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.a(dVar.f30186e);
            new h(d.this.f30189h).a();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class C0391d implements com.mbridge.msdk.foundation.controller.a.e {
        C0391d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30198a;

        e(String str) {
            this.f30198a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(350L);
            } catch (InterruptedException e10) {
                q0.b("SDKController", e10.getMessage());
            }
            new j().b(d.this.f30189h, this.f30198a, d.this.f30187f);
        }
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            com.mbridge.msdk.timer.b.class.getDeclaredMethod("start", null).invoke(com.mbridge.msdk.timer.b.class.getMethod("getInstance", null).invoke(null, null), null);
        } catch (Throwable th2) {
            q0.b("SDKController", th2.getMessage(), th2);
        }
    }

    public boolean e() {
        return true;
    }

    public void f() {
    }

    private void c() {
        com.mbridge.msdk.foundation.controller.c.n().b(this.f30189h);
        com.mbridge.msdk.foundation.controller.c.n().e(this.f30186e);
        com.mbridge.msdk.foundation.controller.c.n().f(this.f30187f);
        com.mbridge.msdk.foundation.controller.c.n().d(this.f30192k);
        com.mbridge.msdk.foundation.controller.c.n().b(this.f30188g);
        com.mbridge.msdk.foundation.controller.c.n().c(new C0391d());
        try {
            com.mbridge.msdk.foundation.same.net.utils.d.h().j();
        } catch (Throwable th2) {
            q0.b("SDKController", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        List<com.mbridge.msdk.foundation.entity.a> listG;
        Object objNewInstance;
        Object objNewInstance2;
        try {
            g gVarF = com.mbridge.msdk.setting.h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarF == null || (listG = gVarF.g()) == null || listG.size() <= 0) {
                return;
            }
            for (com.mbridge.msdk.foundation.entity.a aVar : listG) {
                if (aVar.a() == 287) {
                    if (this.f30189h != null && (objNewInstance = MBInterstitialVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                        MBInterstitialVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(objNewInstance, null);
                    }
                } else if (aVar.a() == 94 && (objNewInstance2 = MBRewardVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                    MBRewardVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(objNewInstance2, null);
                }
            }
        } catch (Throwable th2) {
            q0.b("SDKController", th2.getMessage());
        }
    }

    public void b() {
        a(this.f30189h.getApplicationContext());
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new b());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new c());
            com.mbridge.msdk.foundation.same.report.j.b();
        } catch (Exception unused) {
            q0.b("SDKController", "get app setting failed");
        }
        this.f30185d = true;
    }

    public static d a() {
        if (f30181l == null) {
            synchronized (d.class) {
                try {
                    if (f30181l == null) {
                        f30181l = new d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f30181l;
    }

    public void b(String str) {
        String str2 = KPtaxpyICj.xUTQGU;
        if (this.f30191j == null) {
            this.f30191j = new com.mbridge.msdk.preload.a();
        }
        try {
            Map<String, Object> map = this.f30183b;
            if (map == null || map.size() <= 0 || !this.f30183b.containsKey(str2)) {
                return;
            }
            int iIntValue = ((Integer) this.f30183b.get(str2)).intValue();
            if (iIntValue == 0) {
                this.f30191j.a(this.f30183b, this.f30182a);
                return;
            }
            if (1 == iIntValue) {
                this.f30191j.a(this.f30183b);
            } else if (2 != iIntValue) {
                q0.b("SDKController", "unknow layout type in preload");
            } else {
                this.f30191j.b(this.f30183b);
            }
        } catch (Exception e10) {
            q0.b("SDKController", e10.getMessage());
        }
    }

    public void a(Map map, Context context) {
        Object obj;
        if (context != null) {
            if (!TextUtils.isEmpty(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE)) {
                com.mbridge.msdk.foundation.controller.c.n().c(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE);
            } else if (map.containsKey(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME) && (obj = map.get(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME)) != null) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    com.mbridge.msdk.foundation.controller.c.n().c(str);
                }
            }
            if (map != null) {
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPID)) {
                    this.f30186e = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPID);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPKEY)) {
                    this.f30187f = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPKEY);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_WX_APPID)) {
                    this.f30192k = (String) map.get(MBridgeConstans.ID_MBRIDGE_WX_APPID);
                }
                if (map.containsKey(MBridgeConstans.PACKAGE_NAME_MANIFEST)) {
                    this.f30188g = (String) map.get(MBridgeConstans.PACKAGE_NAME_MANIFEST);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH)) {
                    this.f30190i = (String) map.get(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH);
                }
            }
            this.f30189h = context.getApplicationContext();
            c();
            if (this.f30185d) {
                return;
            }
            b();
            m0.l(context);
            long jB0 = com.mbridge.msdk.setting.h.b().d(this.f30186e).B0();
            if (jB0 != 1300) {
                new Handler(Looper.getMainLooper()).postDelayed(new a(context), jB0);
            }
        }
    }

    private void a(Context context) {
        String string;
        try {
            if (e() && this.f30184c == null) {
                try {
                    this.f30184c = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), k0.a("H+tU+FeXHM==")).build();
                } catch (Exception unused) {
                    this.f30184c = null;
                }
            }
            FastKV fastKV = this.f30184c;
            String str = SVWsZyNSAChGIA.FKKvvvfuciSV;
            String string2 = "";
            if (fastKV != null) {
                String string3 = fastKV.getString(k0.a("H+tU+bfPhM=="), "");
                String string4 = this.f30184c.getString(k0.a("H+tU+Fz8"), "");
                if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f30485g)) {
                    com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                    com.mbridge.msdk.foundation.same.a.f30485g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str);
                }
                if (TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f30485g)) {
                        return;
                    }
                    this.f30184c.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                    this.f30184c.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f30485g);
                } else {
                    com.mbridge.msdk.foundation.same.a.V = string3;
                    com.mbridge.msdk.foundation.same.a.f30485g = string4;
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str, com.mbridge.msdk.foundation.same.a.f30485g);
                }
            } else {
                SharedPreferences sharedPreferences = context.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
                if (sharedPreferences != null) {
                    string2 = sharedPreferences.getString(k0.a("H+tU+bfPhM=="), "");
                    string = sharedPreferences.getString(k0.a("H+tU+Fz8"), "");
                } else {
                    string = "";
                }
                if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f30485g)) {
                    com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                    com.mbridge.msdk.foundation.same.a.f30485g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str);
                }
                if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string)) {
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f30485g)) {
                        return;
                    }
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                        editorEdit.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f30485g);
                        editorEdit.apply();
                    }
                } else {
                    com.mbridge.msdk.foundation.same.a.V = string2;
                    com.mbridge.msdk.foundation.same.a.f30485g = string;
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str, com.mbridge.msdk.foundation.same.a.f30485g);
                }
            }
            new com.mbridge.msdk.config.component.common.util.d().a();
        } catch (Throwable th2) {
            q0.b("SDKController", th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (com.mbridge.msdk.setting.h.b() == null) {
            return;
        }
        com.mbridge.msdk.setting.h hVarB = com.mbridge.msdk.setting.h.b();
        if (hVarB != null) {
            g gVarF = hVarB.f(str);
            if (gVarF != null) {
                MBridgeConstans.OMID_JS_SERVICE_URL = gVarF.V();
                MBridgeConstans.OMID_JS_H5_URL = gVarF.U();
                if (!TextUtils.isEmpty(gVarF.v())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f30626i = gVarF.v();
                    com.mbridge.msdk.foundation.same.net.utils.d.h().e();
                }
                if (!TextUtils.isEmpty(gVarF.w())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f30630m = gVarF.w();
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f();
                }
            } else {
                MBridgeConstans.OMID_JS_SERVICE_URL = com.mbridge.msdk.setting.net.b.f32521b;
                MBridgeConstans.OMID_JS_H5_URL = com.mbridge.msdk.setting.net.b.f32520a;
            }
        }
        if (com.mbridge.msdk.setting.h.b().i(str) && com.mbridge.msdk.setting.h.b().a(str, 1, (String) null)) {
            int iA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("is_first_init", 0);
            com.mbridge.msdk.foundation.same.a.X = iA == 0 ? 1 : 0;
            com.mbridge.msdk.foundation.same.a.Y = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("first_lau_time").longValue();
            if (iA == 0) {
                try {
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("is_first_init", 1);
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("first_lau_time", System.currentTimeMillis());
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.tools.g.d())) {
                        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(str));
                        return;
                    } else {
                        new j().b(this.f30189h, str, this.f30187f);
                        return;
                    }
                } catch (Throwable unused) {
                    new j().b(this.f30189h, str, this.f30187f);
                    return;
                }
            }
            new j().b(this.f30189h, str, this.f30187f);
        }
    }

    public void a(Map<String, Object> map, int i10) {
        if (MBridgeSDKFactory.getMBridgeSDK().getStatus() != MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            q0.b("SDKController", "preloaad failed,sdk do not inited");
            return;
        }
        this.f30183b = map;
        this.f30182a = i10;
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        if (map != null) {
            b(strB);
        }
    }
}
