package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f30327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f30328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f30329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f30330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f30331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f30332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f30333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f30334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f30335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f30336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f30337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f30338q;

    public String a() {
        return this.f30322a;
    }

    public String b() {
        return this.f30324c;
    }

    public int c() {
        return this.f30325d;
    }

    public String d() {
        return this.f30323b;
    }

    public void e(int i10) {
        this.f30334m = i10;
    }

    public void f(int i10) {
        this.f30337p = i10;
    }

    public String g() {
        return this.f30328g;
    }

    public void h(String str) {
        this.f30333l = str;
    }

    public void i(String str) {
        this.f30335n = str;
    }

    public String j() {
        return this.f30331j;
    }

    public void k(String str) {
        this.f30338q = str;
    }

    public String l() {
        return this.f30333l;
    }

    public int m() {
        return this.f30334m;
    }

    public String n() {
        return this.f30335n;
    }

    public String o() {
        return this.f30336o;
    }

    public int p() {
        return this.f30337p;
    }

    public String q() {
        return this.f30338q;
    }

    public String toString() {
        return "ClickTime [campaignId=" + this.f30322a + ", click_duration=" + this.f30323b + ", lastUrl=" + this.f30331j + ", code=" + this.f30326e + ", excepiton=" + this.f30328g + ", header=" + this.f30329h + ", content=" + this.f30327f + ", type=" + this.f30337p + ", click_type=" + this.f30325d + "]";
    }

    public void a(int i10) {
        this.f30325d = i10;
    }

    public void b(String str) {
        this.f30324c = str;
    }

    public void c(int i10) {
        this.f30330i = i10;
    }

    public void d(int i10) {
        this.f30332k = i10;
    }

    public int e() {
        return this.f30326e;
    }

    public String f() {
        return this.f30327f;
    }

    public void g(String str) {
        this.f30331j = str;
    }

    public String h() {
        return this.f30329h;
    }

    public int i() {
        return this.f30330i;
    }

    public void j(String str) {
        this.f30336o = str;
    }

    public int k() {
        return this.f30332k;
    }

    public void a(String str) {
        this.f30322a = str;
    }

    public void b(int i10) {
        this.f30326e = i10;
    }

    public void c(String str) {
        this.f30323b = str;
    }

    public void d(String str) {
        this.f30327f = str;
    }

    public void e(String str) {
        this.f30328g = str;
    }

    public void f(String str) {
        this.f30329h = str;
    }

    public static JSONObject a(e eVar) {
        if (eVar == null) {
            return null;
        }
        String strJ = eVar.j();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rid", eVar.n());
            jSONObject.put("rid_n", eVar.o());
            jSONObject.put("click_type", eVar.c());
            jSONObject.put("type", eVar.p());
            jSONObject.put(BidResponsedEx.KEY_CID, eVar.a());
            jSONObject.put("click_duration", eVar.d());
            jSONObject.put("key", "2000012");
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
            jSONObject.put("last_url", strJ);
            jSONObject.put("code", eVar.e());
            jSONObject.put("exception", eVar.g());
            jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
            jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
            jSONObject.put("click_time", eVar.b());
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("network_type", eVar.m());
                jSONObject.put("network_str", eVar.l());
            }
            return jSONObject;
        } catch (Throwable th2) {
            q0.b("ClickTime", th2.getMessage());
            return null;
        }
    }

    public static ArrayList<JSONObject> a(List<e> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        for (e eVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("rid", eVar.n());
                jSONObject.put("rid_n", eVar.o());
                jSONObject.put(BidResponsedEx.KEY_CID, eVar.a());
                jSONObject.put("click_type", eVar.c());
                jSONObject.put("type", eVar.p());
                jSONObject.put("click_duration", eVar.d());
                jSONObject.put("key", "2000013");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
                jSONObject.put("last_url", eVar.j());
                jSONObject.put("content", eVar.f());
                jSONObject.put("code", eVar.e());
                jSONObject.put("exception", eVar.g());
                jSONObject.put("header", eVar.h());
                jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
                jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
                jSONObject.put("click_time", eVar.b());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", eVar.m());
                    jSONObject.put("network_str", eVar.l());
                }
                String strQ = eVar.q();
                if (!TextUtils.isEmpty(strQ)) {
                    String str = com.mbridge.msdk.foundation.controller.a.f30138r.get(strQ);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                arrayList.add(jSONObject);
            } catch (Throwable th2) {
                q0.b("ClickTime", th2.getMessage());
            }
        }
        return arrayList;
    }
}
