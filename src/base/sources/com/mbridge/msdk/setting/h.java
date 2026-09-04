package com.mbridge.msdk.setting;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.y0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f32498a = "h";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile h f32499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile g f32500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile String f32501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static HashMap<String, l> f32502e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static AtomicBoolean f32503f = new AtomicBoolean(false);

    private h() {
    }

    public static h b() {
        if (f32499b == null) {
            synchronized (h.class) {
                try {
                    if (f32499b == null) {
                        f32499b = new h();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f32499b;
    }

    public g c() {
        return f32500c != null ? f32500c : a();
    }

    public g d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return a();
            }
            g gVarF = f(str);
            return gVarF == null ? a() : gVarF;
        } catch (Exception unused) {
            return a();
        }
    }

    public String e(String str) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("ivreward_" + str);
    }

    public g f(String str) {
        if (f32500c == null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    b(str);
                }
            } catch (Exception e10) {
                q0.b(f32498a, e10.getMessage());
            }
        }
        return f32500c;
    }

    public boolean g(String str, String str2) {
        g gVarF = f(str2);
        if (i(str2) && a(str2, 1, str)) {
            new j().b(com.mbridge.msdk.foundation.controller.c.n().d(), str2, com.mbridge.msdk.foundation.controller.c.n().c());
        }
        l lVarE = e(str2, str);
        if (gVarF != null && lVarE != null) {
            long jU0 = gVarF.u0() * 1000;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jO = lVarE.o() + jU0;
            if (jO > jCurrentTimeMillis) {
                q0.c(f32498a, "unit setting  nexttime is not ready  [settingNextRequestTime= " + jO + " currentTime = " + jCurrentTimeMillis + "]");
                return false;
            }
        }
        q0.c(f32498a, "unit setting timeout or not exists");
        return true;
    }

    public String h(String str) {
        g gVarF = f(str);
        if (gVarF == null) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        int iE0 = gVarF.e0();
        String strD0 = gVarF.d0();
        return (iE0 <= 0 || !(!TextUtils.isEmpty(strD0) && !strD0.equalsIgnoreCase("null"))) ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1";
    }

    public boolean i(String str) {
        g gVarF = f(str);
        if (gVarF != null) {
            long jB = gVarF.B() * 1000;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jX = gVarF.x() + jB;
            if (jX > jCurrentTimeMillis) {
                q0.c(f32498a, "app setting nexttime is not ready  [settingNextRequestTime= " + jX + " currentTime = " + jCurrentTimeMillis + "]");
                return false;
            }
        }
        q0.c(f32498a, "app setting timeout or not exists");
        return true;
    }

    public void j(String str, String str2) {
        try {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str + "_" + str2);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strA);
            jSONObject.put("current_time", System.currentTimeMillis());
            a(str, str2, jSONObject.toString());
        } catch (Throwable th2) {
            q0.b(f32498a, th2.getMessage());
        }
    }

    public void k(String str) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().c("ivreward_" + str);
    }

    public void l(String str) {
        try {
            String strG = g(str);
            if (TextUtils.isEmpty(strG)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strG);
            jSONObject.put("current_time", System.currentTimeMillis());
            h(str, jSONObject.toString());
        } catch (Throwable th2) {
            q0.b(f32498a, th2.getMessage());
        }
    }

    public static void a(Context context, String str) {
        FastKV fastKVBuild;
        Map<String, Object> all = null;
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            try {
                fastKVBuild = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
                fastKVBuild = null;
            }
        } else {
            fastKVBuild = null;
        }
        if (fastKVBuild == null) {
            try {
                Map<String, ?> all2 = context.getSharedPreferences("mbridge", 0).getAll();
                for (String str2 : all2.keySet()) {
                    if (str2.startsWith(str + "_")) {
                        f32502e.put(str2, l.l((String) all2.get(str2)));
                    }
                }
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        try {
            all = fastKVBuild.getAll();
        } catch (Exception unused2) {
        }
        if (all != null) {
            try {
                for (String str3 : all.keySet()) {
                    if (str3.startsWith(str + "_")) {
                        f32502e.put(str3, l.l((String) all.get(str3)));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public l e(String str, String str2) {
        l lVarB = b(str, str2);
        if (lVarB != null && lVarB.L() == 0) {
            lVarB.d(1);
        }
        return lVarB;
    }

    public l c(String str, String str2) {
        l lVarA = a(str, str2);
        return lVarA == null ? l.N() : lVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void j(String str) {
        try {
            String strA = com.mbridge.msdk.config.component.common.util.c.a(str);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            f32501d = strA;
            JSONObject jSONObject = new JSONObject(strA);
            if (jSONObject.has(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                jSONObject.remove(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            }
            if (jSONObject.has("c")) {
                jSONObject.remove("c");
            }
            f32500c = g.D(jSONObject.toString());
            if (f32500c != null) {
                f32500c.O0();
            }
        } catch (Throwable th2) {
            q0.b(f32498a, th2.getMessage());
        }
    }

    public l d(String str, String str2) {
        l lVarE = e(str, str2);
        return lVarE == null ? l.N() : lVarE;
    }

    public String f(String str, String str2) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str + "_" + str2);
    }

    public void h(String str, String str2) {
        f32501d = str2;
        f32500c = g.D(str2);
        if (f32500c != null) {
            f32500c.O0();
        }
        com.mbridge.msdk.config.manager.a.c().a(str, str2);
        i.a(f32500c);
        g0.a().a(f32500c.R());
    }

    private l b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = com.mbridge.msdk.foundation.controller.c.n().b();
        }
        String str3 = str + "_" + str2;
        if (f32502e.containsKey(str3)) {
            return f32502e.get(str3);
        }
        l lVarL = null;
        try {
            lVarL = l.l(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str3));
            f32502e.put(str3, lVarL);
            return lVarL;
        } catch (Exception e10) {
            e10.printStackTrace();
            return lVarL;
        }
    }

    public void i(String str, String str2) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("ivreward_" + str, str2);
    }

    public String g(String str) {
        if (str == null) {
            return "";
        }
        try {
            return TextUtils.isEmpty(f32501d) ? "" : f32501d;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return "";
        }
    }

    public void b(final String str) {
        if (f32503f.get()) {
            return;
        }
        try {
            f32503f.compareAndSet(false, true);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.setting.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32518a.j(str);
                    }
                });
            } else {
                j(str);
            }
        } catch (Throwable th2) {
            q0.b(f32498a, th2.getMessage());
        }
    }

    public void a(String str) {
        i.a(str, this);
    }

    public g a() {
        return i.a();
    }

    public l a(String str, String str2) {
        return b(str, str2);
    }

    public boolean a(String str, int i10, String str2) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            String str3 = str + "_" + i10 + "_" + str2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = 0;
            long jLongValue = ((Long) y0.a(contextD, str3, 0L)).longValue();
            g gVarF = f(str);
            if (gVarF == null) {
                gVarF = b().a();
            } else {
                j10 = jLongValue;
            }
            if (j10 + (gVarF.p0() * 1000) > jCurrentTimeMillis) {
                return false;
            }
            y0.b(contextD, str3, Long.valueOf(jCurrentTimeMillis));
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return jSONObject2;
        }
        if (jSONObject2 != null && jSONObject2.length() != 0) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    if ("unitSetting".equals(next) && jSONObject.has("unitSetting")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("unitSetting");
                        jSONArray.put(0, a((JSONObject) jSONArray.get(0), (JSONObject) jSONObject2.getJSONArray("unitSetting").get(0)));
                        jSONObject.put(next, jSONArray);
                    } else {
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    public void a(String str, String str2, String str3) {
        String str4 = str + "_" + str2;
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str4, str3);
        f32502e.put(str4, l.l(str3));
    }
}
