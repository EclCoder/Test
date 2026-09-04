package com.mbridge.msdk.video.dynview.request.abs;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends c<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34276b;

    private void a(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        if (1 != iOptInt) {
            a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        String strOptString = jSONObject.optString("version");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
        CampaignUnit v5CampaignUnit = "v5".equals(strOptString) ? b.parseV5CampaignUnit(jSONObjectOptJSONObject, this.f34276b) : b.parseCampaignUnit(jSONObjectOptJSONObject, this.f34276b);
        if (v5CampaignUnit != null && v5CampaignUnit.getAds() != null && v5CampaignUnit.getAds().size() > 0) {
            a(list, v5CampaignUnit);
            saveRequestTime(v5CampaignUnit.getAds().size());
        } else {
            String msg = v5CampaignUnit != null ? v5CampaignUnit.getMsg() : null;
            if (TextUtils.isEmpty(msg)) {
                msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            }
            a(iOptInt, msg);
        }
    }

    public abstract void a(int i10, String str);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        a(aVar.f30579a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.f30577b) == null || this.f34275a != 0) {
            return;
        }
        a(aVar.f30600b, eVar.f30578c);
    }
}
