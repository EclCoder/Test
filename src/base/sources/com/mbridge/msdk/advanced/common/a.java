package com.mbridge.msdk.advanced.common;

import android.content.Context;
import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f28107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f28108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f28109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f28110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f28111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f28112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f28113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f28114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f28115m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f28116n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f28117o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f28118p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f28119q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28105c = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28103a = m0.u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28104b = m0.r();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28106d = g.d();

    public a(Context context) {
        int iS = m0.s(context);
        this.f28107e = String.valueOf(iS);
        this.f28108f = m0.a(context, iS);
        this.f28109g = m0.l(context);
        this.f28110h = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f28111i = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f28112j = String.valueOf(v0.g(context));
        this.f28113k = String.valueOf(v0.f(context));
        this.f28115m = String.valueOf(v0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f28114l = "landscape";
        } else {
            this.f28114l = "portrait";
        }
        this.f28116n = m0.w();
        this.f28117o = g.e();
        this.f28118p = g.a();
        this.f28119q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f28103a);
                jSONObject.put("system_version", this.f28104b);
                jSONObject.put("network_type", this.f28107e);
                jSONObject.put("network_type_str", this.f28108f);
                jSONObject.put("device_ua", this.f28109g);
                jSONObject.put("has_wx", m0.E(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.G());
                jSONObject.put("opensdk_ver", m0.D() + "");
                jSONObject.put("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
                jSONObject.put(Lykgign.lZdglVyA, m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f28118p);
                jSONObject.put("adid_limit_dev", this.f28119q);
            }
            jSONObject.put("plantform", this.f28105c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f28106d);
                jSONObject.put("az_aid_info", this.f28117o);
            }
            jSONObject.put("appkey", this.f28110h);
            jSONObject.put("appId", this.f28111i);
            jSONObject.put("screen_width", this.f28112j);
            jSONObject.put("screen_height", this.f28113k);
            jSONObject.put("orientation", this.f28114l);
            jSONObject.put("scale", this.f28115m);
            if (m0.A() != 0) {
                jSONObject.put("tun", m0.A());
            }
            jSONObject.put("f", this.f28116n);
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            return jSONObject;
        } catch (JSONException e10) {
            q0.b("BaseDeviceInfo", e10.getMessage());
            return jSONObject;
        }
    }
}
