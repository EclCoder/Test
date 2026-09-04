package com.mbridge.msdk.video.signal.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class l extends d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f35058s = true;

    private com.mbridge.msdk.click.a q() {
        if (this.f35031l == null) {
            this.f35031l = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35029j);
        }
        return this.f35031l;
    }

    public void a(JSONObject jSONObject) {
        try {
            jSONObject.put("device", new t(com.mbridge.msdk.foundation.controller.c.n().d()).a());
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void a(CampaignEx campaignEx, Context context) {
        String queryParameter;
        try {
            queryParameter = Uri.parse(campaignEx.getNoticeUrl()).getQueryParameter(com.mbridge.msdk.foundation.same.a.f30491m);
        } catch (Throwable unused) {
        }
        this.f35032m.a((!TextUtils.isEmpty(queryParameter) ? Integer.parseInt(queryParameter) : 0) == 2);
        q().a(this.f35032m);
        q().a(campaignEx);
        com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
    }

    public void b(JSONObject jSONObject) {
    }
}
