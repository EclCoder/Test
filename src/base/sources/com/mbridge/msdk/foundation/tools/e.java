package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import org.json.JSONException;
import org.json.JSONObject;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f30856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f30857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f30858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f30859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f30860h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f30862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f30863k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f30865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f30866n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f30867o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f30868p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f30870r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f30871s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f30872t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f30874v;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f30869q = "android";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f30861i = m0.u();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f30873u = m0.r();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f30864l = g.d();

    public e(Context context) {
        int iS = m0.s(context);
        this.f30866n = String.valueOf(iS);
        this.f30867o = m0.a(context, iS);
        this.f30862j = m0.l(context);
        this.f30857e = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f30856d = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f30872t = String.valueOf(v0.g(context));
        this.f30871s = String.valueOf(v0.f(context));
        this.f30870r = String.valueOf(v0.d(context));
        this.f30874v = com.mbridge.msdk.foundation.controller.c.n().k().toString();
        this.f30859g = m0.t();
        this.f30865m = v0.a();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f30868p = "landscape";
        } else {
            this.f30868p = "portrait";
        }
        this.f30858f = com.mbridge.msdk.foundation.same.a.V;
        this.f30860h = com.mbridge.msdk.foundation.same.a.f30485g;
        this.f30863k = m0.w();
        this.f30855c = g.e();
        this.f30853a = g.a();
        this.f30854b = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f30861i);
                jSONObject.put("system_version", this.f30873u);
                jSONObject.put("network_type", this.f30866n);
                jSONObject.put(UoyZyZEcGYBpIg.KLryhIi, this.f30867o);
                jSONObject.put("device_ua", this.f30862j);
                jSONObject.put("has_wx", m0.E(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.G());
                jSONObject.put("opensdk_ver", m0.D() + "");
                jSONObject.put("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
                jSONObject.put("brand", this.f30859g);
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f30853a);
                jSONObject.put("adid_limit_dev", this.f30854b);
            }
            jSONObject.put("plantform", this.f30869q);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f30864l);
                jSONObject.put("az_aid_info", this.f30855c);
            }
            jSONObject.put("appkey", this.f30857e);
            jSONObject.put("appId", this.f30856d);
            jSONObject.put("screen_width", this.f30872t);
            jSONObject.put("screen_height", this.f30871s);
            jSONObject.put("orientation", this.f30868p);
            jSONObject.put("scale", this.f30870r);
            jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, this.f30858f);
            jSONObject.put("c", this.f30860h);
            jSONObject.put("web_env", this.f30874v);
            jSONObject.put("f", this.f30863k);
            jSONObject.put("misk_spt", this.f30865m);
            if (m0.A() != 0) {
                jSONObject.put("tun", m0.A());
            }
            jSONObject.put(com.mbridge.msdk.foundation.same.net.wrapper.e.f30649f, com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adid_limit", this.f30853a);
                jSONObject2.put("adid_limit_dev", this.f30854b);
                jSONObject.put("dvi", k0.b(jSONObject2.toString()));
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                jSONObject.put("dev_source", MBridgeConstans.API_REUQEST_CATEGORY_APP);
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }
}
