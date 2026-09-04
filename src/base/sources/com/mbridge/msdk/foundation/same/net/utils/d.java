package com.mbridge.msdk.foundation.same.net.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.tracker.network.toolbox.i;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.u;
import com.mbridge.msdk.tracker.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class d {
    public String A;
    private String B;
    public String C;
    public String D;
    private String E;
    public String F;
    private String G;
    public String H;
    private String I;
    public String J;
    public String K;
    private String L;
    public String M;
    private String N;
    public String O;
    private String P;
    public String Q;
    public String R;
    private String S;
    public String T;
    public String U;
    private String V;
    public String W;
    public String X;
    private String Y;
    public String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30612a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f30613a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30614b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f30615b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30616c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f30617c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f30618d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f30619d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f30620e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f30621e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f30622f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f30623f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f30624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f30625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f30626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f30627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f30628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f30629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f30630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f30631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f30632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f30633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f30634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f30635r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f30636s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f30637t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<String> f30638u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f30639v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f30640w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList<String> f30641x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f30642y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f30643z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f30644a = new d();
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    private void b() {
        this.M = this.f30622f + this.L;
    }

    private void c() {
        this.A = this.f30642y + this.f30643z;
        this.H = this.f30642y + this.G;
        i.b().f(this.f30642y);
    }

    public static d h() {
        return b.f30644a;
    }

    public void d(int i10) {
        this.f30623f0 = i10;
    }

    public void e() {
        this.Q = this.f30626i + this.P;
        this.C = this.f30626i + this.B;
        this.T = this.f30626i + this.S;
        this.J = this.f30626i + this.I;
        this.W = this.f30626i + this.V;
    }

    public void f() {
        this.R = this.f30630m + this.P;
        this.D = this.f30630m + this.B;
        this.U = this.f30630m + this.S;
        this.K = this.f30630m + this.I;
        this.X = this.f30630m + this.V;
    }

    public boolean g() {
        try {
            if (this.f30636s) {
                ArrayList<String> arrayList = this.f30641x;
                if (arrayList != null && this.f30640w <= arrayList.size() - 1) {
                    if (!a(this.f30641x.get(this.f30640w))) {
                        this.f30630m = this.f30641x.get(this.f30640w);
                        f();
                    }
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.f30638u;
                if (arrayList2 != null && this.f30639v <= arrayList2.size() - 1) {
                    this.f30626i = this.f30638u.get(this.f30639v);
                    e();
                    return true;
                }
            }
            if (this.f30635r) {
                this.f30639v = 0;
                this.f30640w = 0;
            }
            return false;
        } catch (Throwable th2) {
            q0.a("RequestUrlUtil", th2.getMessage());
            return false;
        }
    }

    public int i() {
        return this.f30623f0;
    }

    public void j() {
        HashMap<String, String> mapD;
        g gVarF = h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarF != null) {
            com.mbridge.msdk.setting.a aVarJ = gVarF.j();
            if (aVarJ != null) {
                this.f30629l = aVarJ.f();
                this.f30633p = aVarJ.g();
                this.f30625h = aVarJ.e();
                a();
            }
            com.mbridge.msdk.setting.d dVarZ = gVarF.z();
            if (dVarZ != null) {
                this.f30628k = dVarZ.d();
                this.f30632o = dVarZ.e();
                this.f30622f = dVarZ.c();
                b();
                a(gVarF);
            }
            this.f30636s = gVarF.r0() == 2;
            this.f30637t = gVarF.r0();
            a(!gVarF.b(2));
            if (gVarF.D() != null && gVarF.D().size() > 0 && (mapD = gVarF.D()) != null && mapD.size() > 0) {
                if (mapD.containsKey("v") && !TextUtils.isEmpty(mapD.get("v")) && a(mapD.get("v"))) {
                    this.f30620e = mapD.get("v");
                    d();
                }
                if (mapD.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(mapD.get(CampaignEx.JSON_KEY_HB)) && a(mapD.get(CampaignEx.JSON_KEY_HB))) {
                    this.f30642y = mapD.get(CampaignEx.JSON_KEY_HB);
                    c();
                }
                if (mapD.containsKey("lg") && !TextUtils.isEmpty(mapD.get("lg"))) {
                    String str = mapD.get("lg");
                    if (a(str)) {
                        this.f30618d = str;
                    } else {
                        this.f30627j = str;
                    }
                }
                if (mapD.containsKey("lgt") && !TextUtils.isEmpty(mapD.get("lgt"))) {
                    String str2 = mapD.get("lgt");
                    if (a(str2)) {
                        String strB = b(str2);
                        if (!TextUtils.isEmpty(strB)) {
                            this.f30627j = strB;
                        }
                    } else {
                        this.f30627j = str2;
                    }
                }
            }
            String strV = gVarF.v();
            if (!TextUtils.isEmpty(strV)) {
                this.f30626i = strV;
                e();
                this.f30638u.add(0, strV);
            }
            String strW = gVarF.w();
            if (TextUtils.isEmpty(strW)) {
                return;
            }
            this.f30630m = strW;
            f();
            this.f30641x.add(0, strW);
        }
    }

    private d() {
        this.f30612a = "RequestUrlUtil";
        this.f30614b = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.f30616c = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.f30618d = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.f30620e = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f30622f = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f30624g = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.f30625h = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.f30626i = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.f30627j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.f30628k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.f30629l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.f30630m = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.f30631n = 9377;
        this.f30632o = 9377;
        this.f30633p = 9988;
        this.f30634q = 9377;
        this.f30635r = false;
        this.f30636s = false;
        this.f30637t = 1;
        this.f30638u = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.f30639v = 0;
        this.f30640w = 0;
        this.f30641x = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.f30642y = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.f30643z = "/bid";
        this.A = this.f30642y + this.f30643z;
        this.B = "/sdk/customid";
        this.C = this.f30626i + this.B;
        this.D = this.f30630m + this.B;
        this.E = "/image";
        this.F = this.f30620e + this.E;
        this.G = "/load";
        this.H = this.f30642y + this.G;
        this.I = "/mapping";
        this.J = this.f30626i + this.I;
        this.K = this.f30630m + this.I;
        this.L = "";
        this.M = this.f30625h + this.L;
        this.N = SVWsZyNSAChGIA.RqldlKNs;
        this.O = this.f30625h + this.N;
        this.P = "/setting";
        this.Q = this.f30626i + this.P;
        this.R = this.f30630m + this.P;
        this.S = "/rewardsetting";
        this.T = this.f30626i + this.S;
        this.U = this.f30630m + this.S;
        this.V = "/appwall/setting";
        this.W = this.f30626i + this.V;
        this.X = this.f30630m + this.V;
        this.Y = "/openapi/ad/v3";
        this.Z = this.f30620e + this.Y;
        this.f30613a0 = "/openapi/ad/v4";
        this.f30615b0 = this.f30620e + this.f30613a0;
        this.f30617c0 = "/openapi/ad/v5";
        this.f30619d0 = this.f30620e + this.f30617c0;
        this.f30621e0 = true;
        this.f30623f0 = 0;
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Throwable th2) {
            q0.b("RequestUrlUtil", th2.getMessage());
            return "";
        }
    }

    private void d() {
        this.Z = this.f30620e + this.Y;
        this.f30615b0 = this.f30620e + this.f30613a0;
        this.f30619d0 = this.f30620e + this.f30617c0;
        this.F = this.f30620e + this.E;
    }

    public void c(int i10) {
        this.f30634q = i10;
    }

    public String a(String str, int i10) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("_");
                if (strArrSplit.length > 1) {
                    return a(true, strArrSplit[1]);
                }
                return a(true, "");
            }
        } catch (Exception e10) {
            q0.b("RequestUrlUtil", e10.getMessage());
        }
        return i10 % 2 == 0 ? this.f30619d0 : this.Z;
    }

    public void b(int i10) {
        this.f30631n = i10;
    }

    public String a(boolean z10, String str) {
        if (z10) {
            if (this.H.contains("{}") && !TextUtils.isEmpty(str)) {
                return this.H.replace("{}", str + "-");
            }
            return this.H.replace("{}", "");
        }
        return this.A.replace("{}", "");
    }

    public void a(boolean z10) {
        this.f30621e0 = z10;
    }

    private void a() {
        this.O = this.f30625h + this.N;
    }

    private void a(g gVar) {
        com.mbridge.msdk.setting.d dVarZ;
        if (gVar == null || (dVarZ = gVar.z()) == null || dVarZ.a() == 1) {
            return;
        }
        int iB = s0.a().b("monitor", "type", s0.a().b("t_r_t", 1));
        if (iB != 0 && iB != 1) {
            iB = 0;
        }
        u.a().a(com.mbridge.msdk.foundation.controller.c.n().d(), new x.b().a(new com.mbridge.msdk.foundation.same.report.d()).a(new n()).a(iB, a(iB)).a(s0.a().b("t_m_e_t", 604800000)).b(s0.a().b("t_m_e_s", 50)).d(s0.a().b("t_m_r_c", 50)).c(s0.a().b("t_m_t", 15000)).e(s0.a().b("t_m_r_t_s", 1)).a(), dVarZ.b() * 1000, com.mbridge.msdk.foundation.same.report.c.b());
    }

    private p a(int i10) {
        if (i10 == 1) {
            return new p(new m((byte) 2), h().f30628k, h().f30632o);
        }
        return new p(new com.mbridge.msdk.tracker.network.toolbox.h(), h().M, 0);
    }
}
