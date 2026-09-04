package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.broadcast.NetWorkChangeReceiver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f30891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.setting.j f30892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f30893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BroadcastReceiver f30894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    IntentFilter f30895e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g0 f30896a = new g0();
    }

    public static g0 a() {
        return b.f30896a;
    }

    public String b() {
        try {
            if (this.f30891a == null) {
                this.f30891a = new JSONObject();
            }
            if (this.f30891a.length() < 2) {
                try {
                    this.f30891a.put("KEY_INFO", (String) d.a(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_INFO", ""));
                } catch (Exception e10) {
                    q0.b("NetAddressManager", e10.getMessage());
                }
                try {
                    this.f30891a.put("KEY_TIME", ((Long) d.a(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_TIME", 0L)).longValue());
                } catch (Exception e11) {
                    q0.b("NetAddressManager", e11.getMessage());
                }
            }
            String strOptString = this.f30891a.optString("KEY_INFO");
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            return System.currentTimeMillis() - this.f30891a.optLong("KEY_TIME") > (gVarD != null ? gVarD.S() : 3600L) * 1000 ? "" : strOptString;
        } catch (Exception e12) {
            q0.b("NetAddressManager", e12.getMessage());
            return "";
        }
    }

    public void c() {
        Context contextD;
        try {
            if (com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b()).T() != 1 || (contextD = com.mbridge.msdk.foundation.controller.c.n().d()) == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            this.f30895e = intentFilter;
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            contextD.registerReceiver(this.f30894d, this.f30895e);
        } catch (Exception e10) {
            q0.b("NetAddressManager", e10.getMessage());
        }
    }

    public void d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f30893c > 3000) {
            if (this.f30892b == null) {
                this.f30892b = new com.mbridge.msdk.setting.j();
            }
            this.f30892b.c(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
            this.f30893c = jCurrentTimeMillis;
        }
    }

    public void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            try {
                contextD.unregisterReceiver(this.f30894d);
            } catch (Exception e10) {
                q0.b("NetAddressManager", e10.getMessage());
            }
        }
    }

    private g0() {
        this.f30891a = new JSONObject();
        this.f30894d = new NetWorkChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        this.f30895e = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }

    public void a(String str) {
        if (this.f30891a == null) {
            this.f30891a = new JSONObject();
        }
        try {
            if (!this.f30891a.optString("KEY_INFO", "").equals(str)) {
                this.f30891a.put("KEY_INFO", str);
                d.b(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_INFO", str);
            }
        } catch (Exception e10) {
            q0.b("NetAddressManager", e10.getMessage());
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f30891a.put("KEY_TIME", jCurrentTimeMillis);
            d.b(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_TIME", Long.valueOf(jCurrentTimeMillis));
        } catch (Exception e11) {
            q0.b("NetAddressManager", e11.getMessage());
        }
    }
}
