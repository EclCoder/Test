package com.mbridge.msdk.out.reveue;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBridgeRevenueParamsEntityForMax extends MBridgeRevenueParamsEntity {
    public MBridgeRevenueParamsEntityForMax(String str, String str2) {
        super(str, str2);
        setMediationName("Max");
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setDspInfo(String str, String str2) {
        super.setDspInfo(str, str2);
    }

    public void setMaxAdInfo(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str.replace("MediatedAd", "").replace("=", ":").replace(" ", ""));
                setAdType(jSONObject.optString("format"));
                setMediationUnitId(jSONObject.optString("adUnitId"));
                setNetworkName(jSONObject.optString("networkName"));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONArray jSONArrayOptJSONArray = new JSONObject(str2.replace("MaxAdWaterfallInfo", "").replace("MaxResponseInfo", "").replace("MaxMediatedNetworkInfo", "").replace("Bundle", "").replace("=", ":").replace(" ", "")).optJSONArray("networkResponses");
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                        if (jSONObject2.optString("adLoadState", "").equals("AD_LOADED")) {
                            setBidType(Boolean.valueOf(jSONObject2.optBoolean("isBidding", false)));
                            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("credentials");
                            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0 && (jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(0)) != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    jSONObject3.put(next, jSONObjectOptJSONObject.get(next) + "");
                                }
                                setNetworkInfo(jSONObject3);
                                break;
                            }
                            break;
                            break;
                            break;
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        setSourceData(str, str2);
    }

    public void setMaxRevenueInfo(String str, Double d10) {
        setRevenue(d10 + "");
        setPrecision(str + "");
    }
}
