package com.mbridge.msdk.out.reveue;

import android.text.TextUtils;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import org.json.JSONObject;
import r7.pgx.XTkUEXuiK;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class MBridgeRevenueParamsEntityForIronSource extends MBridgeRevenueParamsEntity {
    public MBridgeRevenueParamsEntityForIronSource(String str, String str2) {
        super(str, str2);
        setMediationName("IronSource");
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setDspInfo(String str, String str2) {
        super.setDspInfo(str, str2);
    }

    public void setIronSourceImpressionDataString(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setMediationUnitId(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = "{" + str2 + XTkUEXuiK.AhfTjxSXPML;
        try {
            setSourceData(str3, str3);
            JSONObject jSONObject = new JSONObject(str3);
            setNetworkName(jSONObject.optString("adNetwork", ""));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceName", jSONObject.optString("instanceName", ""));
            jSONObject2.put("instanceId", jSONObject.optString("instanceId", ""));
            setNetworkInfo(jSONObject2);
            setAdType(jSONObject.optString(OutOfContextTestingActivity.AD_UNIT_KEY, ""));
            setRevenue(jSONObject.optString("revenue", ""));
            setPrecision(jSONObject.optString("precision", ""));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
