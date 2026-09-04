package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class u extends e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f30969w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f30970x;

    public u(Context context) {
        super(context);
        this.f30970x = m0.x();
        this.f30969w = m0.h();
    }

    @Override // com.mbridge.msdk.foundation.tools.e
    public JSONObject a() {
        JSONObject jSONObjectA = super.a();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dmt", this.f30970x + "");
                jSONObject.put("dmf", this.f30969w);
                return jSONObjectA;
            }
        } catch (JSONException e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("DomainDeviceInfo", e10.getMessage());
            }
        }
        return jSONObjectA;
    }
}
