package com.iab.omid.library.inmobi.publisher;

import android.webkit.WebView;
import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.internal.g;
import com.iab.omid.library.inmobi.internal.h;
import com.iab.omid.library.inmobi.utils.c;
import com.iab.omid.library.inmobi.utils.f;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f23992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.iab.omid.library.inmobi.weakreference.b f23993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdEvents f23994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MediaEvents f23995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f23996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f23997f;

    /* JADX INFO: loaded from: classes6.dex */
    enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f23992a = str;
        this.f23993b = new com.iab.omid.library.inmobi.weakreference.b(null);
    }

    public void a() {
        this.f23997f = f.b();
        this.f23996e = a.AD_STATE_IDLE;
    }

    public void b() {
        this.f23993b.clear();
    }

    public AdEvents c() {
        return this.f23994c;
    }

    public MediaEvents d() {
        return this.f23995d;
    }

    public boolean e() {
        return this.f23993b.get() != null;
    }

    public void f() {
        h.a().a(getWebView(), this.f23992a);
    }

    public void g() {
        h.a().b(getWebView(), this.f23992a);
    }

    public WebView getWebView() {
        return this.f23993b.get();
    }

    public void h() {
        a((JSONObject) null);
    }

    public void i() {
    }

    public void a(float f10) {
        h.a().a(getWebView(), this.f23992a, f10);
    }

    public void b(String str, long j10) {
        if (j10 >= this.f23997f) {
            this.f23996e = a.AD_STATE_VISIBLE;
            h.a().b(getWebView(), this.f23992a, str);
        }
    }

    void a(WebView webView) {
        this.f23993b = new com.iab.omid.library.inmobi.weakreference.b(webView);
    }

    public void b(boolean z10) {
        if (e()) {
            h.a().a(getWebView(), this.f23992a, z10 ? "locked" : PvZsvNiPV.PaGaFBhlkZyHT);
        }
    }

    public void a(AdEvents adEvents) {
        this.f23994c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.f23992a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.f23992a, errorType, str);
    }

    public void a(com.iab.omid.library.inmobi.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    protected void a(com.iab.omid.library.inmobi.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String strC = aVar.c();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.inmobi.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.inmobi.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        c.a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.5.7-Inmobi");
        c.a(jSONObject4, "appId", g.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        if (adSessionContext.getUniversalAdId() != null) {
            c.a(jSONObject2, "universalAdId", adSessionContext.getUniversalAdId());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        h.a().a(getWebView(), strC, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f23995d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j10) {
        if (j10 >= this.f23997f) {
            a aVar = this.f23996e;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f23996e = aVar2;
                h.a().b(getWebView(), this.f23992a, str);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        h.a().a(getWebView(), this.f23992a, str, jSONObject);
    }

    public void a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(date.getTime()));
        h.a().a(getWebView(), jSONObject);
    }

    public void a(JSONObject jSONObject) {
        h.a().b(getWebView(), this.f23992a, jSONObject);
    }

    public void a(boolean z10) {
        if (e()) {
            h.a().c(getWebView(), this.f23992a, z10 ? "foregrounded" : "backgrounded");
        }
    }
}
