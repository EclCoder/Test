package com.mbridge.msdk.foundation.same.report.campaignreport;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.h;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.tracker.e;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f30672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected h f30673b;

    public a(h hVar) {
        this.f30673b = hVar;
        Context contextD = c.n().d();
        this.f30672a = contextD;
        if (this.f30673b == null || contextD == null) {
            return;
        }
        int iS = m0.s(contextD);
        this.f30673b.c(iS);
        this.f30673b.a(m0.a(this.f30672a, iS));
    }

    public void a() {
        if (this.f30673b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time", this.f30673b.f());
                jSONObject.put(CampaignEx.JSON_KEY_HB, this.f30673b.i());
                jSONObject.put("fb", this.f30673b.b());
                jSONObject.put("num", this.f30673b.e());
                jSONObject.put(CampaignEx.JSON_KEY_AD_SOURCE_ID, this.f30673b.a());
                jSONObject.put("timeout", this.f30673b.g());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f30673b.h());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", this.f30673b.d());
                    jSONObject.put("network_str", this.f30673b.c());
                }
                e eVar = new e("2000006");
                eVar.a(0);
                eVar.b(0);
                eVar.a(jSONObject);
                eVar.a(com.mbridge.msdk.foundation.same.report.c.d());
                d.b().e().d(eVar);
            } catch (Throwable unused) {
            }
        }
    }

    public void b(int i10) {
        h hVar = this.f30673b;
        if (hVar != null) {
            hVar.a(i10);
        }
    }

    public void c(int i10) {
        h hVar = this.f30673b;
        if (hVar != null) {
            hVar.b(i10);
        }
    }

    public void b(String str) {
        h hVar = this.f30673b;
        if (hVar != null) {
            hVar.c(str);
        }
    }

    public void a(int i10) {
        h hVar = this.f30673b;
        if (hVar != null) {
            hVar.d(i10);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f30673b.b(str);
    }
}
