package com.mbridge.msdk.config.manager;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.c;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile a f29564h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f29565i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f29566j = 5000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f29567k = 5000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.pipeline.a f29569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f29570c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29571d = "g0.npc";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicInteger f29572e = new AtomicInteger(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f29573f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f29574g = new C0382a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f29568a = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();

    /* JADX INFO: renamed from: com.mbridge.msdk.config.manager.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class C0382a extends c {
        C0382a() {
        }

        @Override // com.mbridge.msdk.config.dynamic.binddata.wrapper.b
        public void a(String str, Object obj) {
            if (TextUtils.isEmpty(str) || !str.equals("g0.npc")) {
                return;
            }
            try {
                String strValueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(strValueOf) && !strValueOf.equalsIgnoreCase("null")) {
                    a.this.f29569b.a(new e().a(strValueOf));
                    if (!com.mbridge.msdk.system.a.componentSDKInitFinish.get() && a.this.f29570c != null) {
                        a.this.b(com.mbridge.msdk.config.component.common.util.c.a(), "c0", a.this.f29570c);
                    }
                }
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(System.currentTimeMillis() - a.this.f29573f));
                map.put("result", Integer.valueOf(!TextUtils.isEmpty(strValueOf) ? 1 : 2));
                com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_init_end", map);
            } catch (Throwable th2) {
                q0.b("ComponentManager", th2.getMessage());
            }
        }
    }

    private a() {
    }

    public boolean d() {
        if (this.f29572e.get() == -1) {
            a("");
        }
        return this.f29572e.get() == 1 && com.mbridge.msdk.system.a.componentSDKInitFinish.get();
    }

    public static a c() {
        if (f29564h == null) {
            synchronized (f29565i) {
                try {
                    if (f29564h == null) {
                        f29564h = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f29564h;
    }

    public com.mbridge.msdk.config.dynamic.binddata.wrapper.a b() {
        return this.f29568a;
    }

    public void a(Map<String, Object> map) {
        if (map == null || d()) {
            return;
        }
        this.f29570c = map;
    }

    public void b(String str, String str2, Map<String, Object> map) {
        try {
            HashMap map2 = new HashMap();
            map2.put(com.mbridge.msdk.config.component.common.util.c.c("577"), str2);
            HashMap map3 = new HashMap();
            map3.put("id", str);
            if (map.containsKey("sdk_context")) {
                map2.put("sdk_context", map.get("sdk_context"));
                map.remove("sdk_context");
            }
            map3.put("api_params", map);
            HashMap map4 = new HashMap();
            map4.put("context_id", str);
            map3.put("metrics", map4);
            map2.put(com.mbridge.msdk.config.component.common.util.c.c("51"), map3);
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.a(vHmGJpUTWNVV.PACQjxUoKwmCD);
            bVar.b("922001");
            bVar.a(map2);
            if (this.f29569b != null) {
                this.f29569b.a(bVar);
            }
        } catch (Exception e10) {
            q0.b("ComponentManager", "sendComponentEvent error: " + e10.getMessage(), e10);
        }
    }

    public void a() {
        this.f29570c = null;
    }

    private synchronized void a(final String str) {
        final Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            return;
        }
        final String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.manager.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f29576a.a(strB, contextD, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Context context, String str2) {
        Map<String, Object> mapB;
        if (TextUtils.isEmpty(str)) {
            str = com.mbridge.msdk.config.component.common.util.b.a(context).a(MBridgeConstans.APP_ID, "");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            mapB = new e().a(str2);
        } else {
            mapB = com.mbridge.msdk.config.component.common.util.c.b(str);
        }
        if (mapB == null || mapB.isEmpty()) {
            return;
        }
        if (com.mbridge.msdk.config.component.common.util.c.a(mapB.get("p_p_c_id")) <= 0) {
            this.f29572e.set(0);
            return;
        }
        String strValueOf = String.valueOf(mapB.get("p_p_c"));
        if (!TextUtils.isEmpty(strValueOf) && !strValueOf.equalsIgnoreCase("null")) {
            a(strValueOf, str, mapB);
        } else {
            this.f29572e.set(0);
        }
    }

    private void a(String str, String str2, Map<String, Object> map) {
        b(map);
        if (this.f29572e.get() == 1) {
            return;
        }
        this.f29572e.set(1);
        if (this.f29569b == null) {
            this.f29573f = System.currentTimeMillis();
            com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_init_start", new HashMap());
            this.f29568a.a("g0.npc", (com.mbridge.msdk.config.dynamic.binddata.wrapper.b<String>) this.f29574g);
            this.f29569b = new com.mbridge.msdk.config.component.pipeline.a(str, this.f29568a);
            Map<String, Object> map2 = new HashMap<>();
            map2.put(MBridgeConstans.APP_ID, str2);
            HashMap map3 = new HashMap();
            map3.put("app_setting", map);
            map3.put("device_info", m0.k());
            map2.put("info", map3);
            b(com.mbridge.msdk.config.component.common.util.c.a(), "c30", map2);
        }
    }

    private void b(Map<String, Object> map) {
        try {
            if (map.containsKey("t_o_bi")) {
                String strValueOf = String.valueOf(map.get("t_o_bi"));
                if (!TextUtils.isEmpty(strValueOf) && TextUtils.isDigitsOnly(strValueOf)) {
                    f29566j = Integer.parseInt(strValueOf) * 1000;
                }
            }
            if (map.containsKey("t_o_ar")) {
                String strValueOf2 = String.valueOf(map.get("t_o_ar"));
                if (TextUtils.isEmpty(strValueOf2) || !TextUtils.isDigitsOnly(strValueOf2)) {
                    return;
                }
                f29567k = Integer.parseInt(strValueOf2) * 1000;
            }
        } catch (Throwable th2) {
            q0.b("ComponentManager", "refreshTimeout error: " + th2.getMessage(), th2);
        }
    }

    public void a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            a(str2);
            com.mbridge.msdk.config.component.common.util.c.b(str, str2);
        } catch (Throwable th2) {
            q0.b("ComponentManager", th2.getMessage());
        }
    }
}
