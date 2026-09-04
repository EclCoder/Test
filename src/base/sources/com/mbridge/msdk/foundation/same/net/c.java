package com.mbridge.msdk.foundation.same.net;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.h;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c<T> implements b<T> {
    private long startTime;
    public int adType = 0;
    public String placementId = "";
    public String unitId = "";
    private com.mbridge.msdk.foundation.same.report.campaignreport.b mRequestTime = null;
    private String key = "";
    private String isRKE = MBridgeConstans.ENDCARD_URL_TYPE_PL;

    public void calcRequestTime(long j10) {
        com.mbridge.msdk.foundation.same.report.campaignreport.b bVar = new com.mbridge.msdk.foundation.same.report.campaignreport.b(new h());
        this.mRequestTime = bVar;
        bVar.b(this.unitId);
        this.mRequestTime.b(1);
        this.mRequestTime.a((j10 - this.startTime) + "");
    }

    public String getKey() {
        return this.key;
    }

    public String isRKE() {
        return this.isRKE;
    }

    public void onPreExecute() {
        this.startTime = System.currentTimeMillis();
    }

    @Override // com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<T> eVar) {
        try {
            String str = com.mbridge.msdk.foundation.controller.c.n().b() + "_" + this.placementId + "_" + this.unitId + "_" + this.adType;
            com.mbridge.msdk.setting.h.b().a(this.unitId);
            q0.b("Listener", eVar.f30578c + " " + str);
            T t10 = eVar.f30578c;
            if (t10 instanceof JSONObject) {
                com.mbridge.msdk.foundation.same.net.utils.c.b().a(str, ((JSONObject) t10).optInt(NotificationCompat.CATEGORY_STATUS), ((JSONObject) eVar.f30578c).toString(), System.currentTimeMillis());
            }
            if (eVar.f30578c instanceof String) {
                com.mbridge.msdk.foundation.same.net.utils.c.b().a(str, new JSONObject((String) eVar.f30578c).optInt(NotificationCompat.CATEGORY_STATUS), (String) eVar.f30578c, System.currentTimeMillis());
            }
        } catch (Exception e10) {
            q0.b("Listener", e10.getMessage());
        }
    }

    public void saveHbState(int i10) {
        com.mbridge.msdk.foundation.same.report.campaignreport.b bVar = this.mRequestTime;
        if (bVar != null) {
            bVar.c(i10);
        }
    }

    public void saveRequestTime(int i10) {
        com.mbridge.msdk.foundation.same.report.campaignreport.b bVar = this.mRequestTime;
        if (bVar != null) {
            bVar.a(i10);
            this.mRequestTime.a();
        }
    }

    public void setAdType(int i10) {
        this.adType = i10;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setRKE(String str) {
        this.isRKE = str;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void onCancel() {
    }

    public void onFinish() {
    }

    public void onNetworking() {
    }

    public void onRetry() {
    }

    @Override // com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
    }

    public void onProgressChange(long j10, long j11) {
    }
}
