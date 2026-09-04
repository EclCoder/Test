package com.mbridge.msdk.setting;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {
    private String A;
    private int D;
    private int E;
    private int I;
    private String K;
    private int N;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f32457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f32458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f32464i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f32466k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f32467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f32468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f32469n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f32470o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f32471p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f32472q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f32473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f32474s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f32475t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f32476u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f32481z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32456a = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32465j = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f32477v = 30;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f32478w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f32479x = 10;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f32480y = 60;
    private int B = 1;
    private String C = "";
    private int F = 100;
    private int G = 60;
    private int H = 5000;
    private int J = 1;
    private String L = "";
    private String M = "";

    public static l a(JSONObject jSONObject) {
        l lVar = null;
        if (jSONObject != null) {
            try {
                l lVar2 = new l();
                try {
                    lVar2.e(jSONObject.optString("unitId"));
                    lVar2.a(jSONObject.optString("ab_id"));
                    lVar2.f(jSONObject.optString("rid"));
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("adSourceList");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i10)));
                        }
                        lVar2.a(arrayList);
                    }
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                            arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray2.optInt(i11)));
                        }
                        lVar2.b(arrayList2);
                    }
                    lVar2.x(jSONObject.optInt("tpqn"));
                    lVar2.c(jSONObject.optInt("aqn"));
                    lVar2.b(jSONObject.optInt("acn"));
                    lVar2.z(jSONObject.optInt("wt"));
                    int i12 = 1;
                    lVar2.o(jSONObject.optInt("iscasf", 1));
                    lVar2.w(jSONObject.optInt("spmxrt", 5000));
                    lVar2.c(jSONObject.optLong("current_time"));
                    lVar2.r(jSONObject.optInt("offset"));
                    lVar2.d(jSONObject.optLong("dlct", 3600L));
                    lVar2.d(jSONObject.optInt("autoplay", 0));
                    lVar2.k(jSONObject.optInt("dlnet", 2));
                    lVar2.c(jSONObject.optString("no_offer"));
                    lVar2.f(jSONObject.optInt("cb_type"));
                    lVar2.b(jSONObject.optLong("clct", 86400L));
                    lVar2.a(jSONObject.optLong("clcq", 300L));
                    lVar2.u(jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100));
                    lVar2.g(jSONObject.optInt("cd_rate", 0));
                    lVar2.i(jSONObject.optInt("content", 1));
                    lVar2.m(jSONObject.optInt("impt", 0));
                    lVar2.l(jSONObject.optInt("icon_type", 1));
                    lVar2.b(jSONObject.optString("no_ads_url", ""));
                    lVar2.t(jSONObject.optInt("playclosebtn_tm", -1));
                    lVar2.s(jSONObject.optInt("play_ctdown", 0));
                    lVar2.h(jSONObject.optInt("close_alert", 0));
                    lVar2.n(jSONObject.optInt("intershowlimit", 30));
                    lVar2.v(jSONObject.optInt("refreshFq", 60));
                    lVar2.e(jSONObject.optInt("closeBtn", 0));
                    int iOptInt = jSONObject.optInt("tmorl", 1);
                    if (iOptInt <= 2 && iOptInt > 0) {
                        i12 = iOptInt;
                    }
                    lVar2.y(i12);
                    lVar2.d(jSONObject.optString("placementid", ""));
                    lVar2.p(jSONObject.optInt("ltafemty", 10));
                    lVar2.q(jSONObject.optInt("ltorwc", 60));
                    lVar2.g(jSONObject.optString("vtag", ""));
                    return lVar2;
                } catch (Exception e10) {
                    e = e10;
                    lVar = lVar2;
                    e.printStackTrace();
                    return lVar;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        return lVar;
    }

    public int A() {
        return this.D;
    }

    public int B() {
        return this.E;
    }

    public int C() {
        return this.F;
    }

    public int D() {
        return this.G;
    }

    public int E() {
        return this.H;
    }

    public int F() {
        return this.I;
    }

    public int G() {
        return this.J;
    }

    public String H() {
        return this.K;
    }

    public String I() {
        return this.L;
    }

    public String J() {
        return this.M;
    }

    public int K() {
        return this.N;
    }

    public int L() {
        return this.f32462g;
    }

    public JSONObject M() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> listB = b();
            if (listB != null && listB.size() > 0) {
                int size = listB.size();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put(listB.get(i10));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> listC = c();
            if (listC != null && listC.size() > 0) {
                int size2 = listC.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i11 = 0; i11 < size2; i11++) {
                    jSONArray2.put(listC.get(i11));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", F());
            jSONObject.put("aqn", f());
            jSONObject.put("acn", e());
            jSONObject.put("wt", K());
            jSONObject.put("current_time", o());
            jSONObject.put("offset", y());
            jSONObject.put("dlct", p());
            jSONObject.put("autoplay", L());
            jSONObject.put("dlnet", q());
            jSONObject.put("no_offer", x());
            jSONObject.put("cb_type", h());
            jSONObject.put("clct", k());
            jSONObject.put("clcq", j());
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, C());
            jSONObject.put("content", m());
            jSONObject.put("impt", s());
            jSONObject.put("icon_type", r());
            jSONObject.put("no_ads_url", w());
            jSONObject.put("playclosebtn_tm", B());
            jSONObject.put("play_ctdown", A());
            jSONObject.put("close_alert", l());
            jSONObject.put("closeBtn", g());
            jSONObject.put("refreshFq", D());
            jSONObject.put("countdown", n());
            jSONObject.put("allowSkip", d());
            jSONObject.put("tmorl", G());
            jSONObject.put("unitId", H());
            jSONObject.put("placementid", z());
            jSONObject.put("ltafemty", u());
            jSONObject.put("ltorwc", v());
            jSONObject.put("vtag", J());
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public List<Integer> b() {
        return this.f32457b;
    }

    public void c(String str) {
        this.A = str;
    }

    public void d(int i10) {
        this.f32462g = i10;
    }

    public int e() {
        return this.f32460e;
    }

    public int f() {
        return this.f32461f;
    }

    public int g() {
        return this.f32463h;
    }

    public int h() {
        return this.f32464i;
    }

    public int i() {
        return this.f32465j;
    }

    public long j() {
        return this.f32466k;
    }

    public long k() {
        return this.f32467l;
    }

    public int l() {
        return this.f32468m;
    }

    public int m() {
        return this.f32469n;
    }

    public int n() {
        return this.f32470o;
    }

    public long o() {
        return this.f32471p;
    }

    public long p() {
        return this.f32472q;
    }

    public int q() {
        return this.f32473r;
    }

    public int r() {
        return this.f32475t;
    }

    public int s() {
        return this.f32476u;
    }

    public int t() {
        return this.f32478w;
    }

    public String toString() {
        List<Integer> list = this.f32457b;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f32457b.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        return "offset = " + y() + " unitId = " + this.K + " fbPlacementId = " + this.f32474s + str;
    }

    public int u() {
        return this.f32479x;
    }

    public int v() {
        return this.f32480y;
    }

    public String w() {
        return this.f32481z;
    }

    public String x() {
        return this.A;
    }

    public void y(int i10) {
        this.J = i10;
    }

    public String z() {
        return this.C;
    }

    public void b(List<Integer> list) {
        this.f32458c = list;
    }

    public List<Integer> c() {
        return this.f32458c;
    }

    public int d() {
        return this.f32459d;
    }

    public void e(int i10) {
        this.f32463h = i10;
    }

    public void f(int i10) {
        this.f32464i = i10;
    }

    public void g(int i10) {
        this.f32465j = i10;
    }

    public void h(int i10) {
        this.f32468m = i10;
    }

    public void i(int i10) {
        this.f32469n = i10;
    }

    public void j(int i10) {
        this.f32470o = i10;
    }

    public void k(int i10) {
        this.f32473r = i10;
    }

    public void l(int i10) {
        this.f32475t = i10;
    }

    public void m(int i10) {
        this.f32476u = i10;
    }

    public void n(int i10) {
        this.f32477v = i10;
    }

    public void o(int i10) {
        this.f32478w = i10;
    }

    public void p(int i10) {
        this.f32479x = i10;
    }

    public void q(int i10) {
        this.f32480y = i10;
    }

    public void r(int i10) {
        this.B = i10;
    }

    public void s(int i10) {
        this.D = i10;
    }

    public void t(int i10) {
        this.E = i10;
    }

    public void u(int i10) {
        this.F = i10;
    }

    public void v(int i10) {
        this.G = i10;
    }

    public void w(int i10) {
        this.H = i10;
    }

    public void x(int i10) {
        this.I = i10;
    }

    public int y() {
        return this.B;
    }

    public void z(int i10) {
        this.N = i10;
    }

    public void b(int i10) {
        this.f32460e = i10;
    }

    public void c(int i10) {
        this.f32461f = i10;
    }

    public void d(long j10) {
        this.f32472q = j10;
    }

    public void e(String str) {
        this.K = str;
    }

    public void f(String str) {
        this.L = str;
    }

    public void g(String str) {
        this.M = str;
    }

    public void b(long j10) {
        this.f32467l = j10;
    }

    public void c(long j10) {
        this.f32471p = j10;
    }

    public void d(String str) {
        this.C = str;
    }

    public void b(String str) {
        this.f32481z = str;
    }

    public String a() {
        return this.f32456a;
    }

    public void a(String str) {
        this.f32456a = str;
        com.mbridge.msdk.foundation.controller.a.f30138r.put(this.K, str);
    }

    public void a(List<Integer> list) {
        this.f32457b = list;
    }

    public void a(int i10) {
        this.f32459d = i10;
    }

    public void a(long j10) {
        this.f32466k = j10;
    }
}
