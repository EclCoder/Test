package com.apm.insight.k;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.apm.insight.runtime.m;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static File f10827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f10828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f10829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map<String, String> f10830d;

    static boolean a() {
        return f10828b;
    }

    static boolean b() {
        return f10829c;
    }

    public static void d() {
        c();
        if (g()) {
            a.a();
        }
    }

    public static void e() {
        m.a().a(new Runnable() { // from class: com.apm.insight.k.j.1
            @Override // java.lang.Runnable
            public final void run() {
                if (j.g()) {
                    a.a();
                }
            }
        });
    }

    public static void f() {
        Map<String, String> map = f10830d;
        if (map != null) {
            map.clear();
        }
    }

    static boolean g() {
        File fileH = h();
        try {
            Map<String, String> mapC = f10830d;
            if (mapC == null) {
                mapC = com.apm.insight.l.f.c(fileH);
            }
            f10830d = mapC;
            if (mapC == null) {
                f10830d = new HashMap();
                return true;
            }
            if (mapC.size() < com.apm.insight.entity.b.c()) {
                return true;
            }
            Iterator<String> it = com.apm.insight.entity.b.d().iterator();
            while (it.hasNext()) {
                if (!f10830d.containsKey(it.next())) {
                    return true;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z10 = false;
            for (Map.Entry<String, String> entry : f10830d.entrySet()) {
                try {
                    if (jCurrentTimeMillis - Long.decode(entry.getValue()).longValue() > com.apm.insight.runtime.d.d(entry.getKey())) {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    com.apm.insight.a.a(th2);
                }
            }
            if (z10) {
                com.apm.insight.a.a((Object) "config should be updated");
            } else {
                com.apm.insight.a.a((Object) "config should not be updated");
            }
            return z10;
        } catch (Throwable th3) {
            Log.e("npth", NotificationCompat.CATEGORY_ERROR, th3);
            return true;
        }
    }

    private static File h() {
        if (f10827a == null) {
            f10827a = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configInvalid");
        }
        return f10827a;
    }

    public static void a(JSONArray jSONArray) {
        try {
            com.apm.insight.l.f.a(new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile"), jSONArray);
        } catch (IOException unused) {
        }
        try {
            com.apm.insight.l.f.a(h(), f10830d);
        } catch (Throwable unused2) {
        }
    }

    static void c() {
        if (f10828b) {
            return;
        }
        f10829c = true;
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile");
        if (file.exists()) {
            try {
                com.apm.insight.runtime.a.a(new JSONArray(com.apm.insight.l.f.a(file, jyeoXJ.ZgbU)), false);
                f10828b = true;
            } catch (Throwable unused) {
                com.apm.insight.runtime.a.a((JSONArray) null, false);
            }
        }
    }

    public static void a(String str) {
        if (f10830d == null) {
            f10830d = new HashMap();
        }
        f10830d.put(str, String.valueOf(System.currentTimeMillis()));
    }
}
