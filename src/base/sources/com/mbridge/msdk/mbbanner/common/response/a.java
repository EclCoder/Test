package com.mbridge.msdk.mbbanner.common.response;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends c<JSONObject> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f31299b = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31300a = "";

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.response.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0410a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f31301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f31303c;

        /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.response.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0411a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f31305a;

            RunnableC0411a(CampaignUnit campaignUnit) {
                this.f31305a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f31305a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f31305a.getAds().size() > 0) {
                    a.this.a(this.f31305a);
                    if (!TextUtils.isEmpty(a.this.f31300a)) {
                        a.this.saveHbState(1);
                    }
                    a.this.saveRequestTime(this.f31305a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f31305a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = RunnableC0410a.this.f31301a.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                RunnableC0410a runnableC0410a = RunnableC0410a.this;
                a.this.a(runnableC0410a.f31303c, msg);
            }
        }

        RunnableC0410a(JSONObject jSONObject, String str, int i10) {
            this.f31301a = jSONObject;
            this.f31302b = str;
            this.f31303c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectOptJSONObject = this.f31301a.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0411a("v5".equals(this.f31302b) ? b.parseV5CampaignUnit(jSONObjectOptJSONObject, a.this.f31300a) : b.parseCampaignUnit(jSONObjectOptJSONObject, a.this.f31300a)));
        }
    }

    public abstract void a(int i10, String str);

    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.c(f31299b, "onFailed errorCode = " + aVar.f30579a);
        a(aVar.f30579a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        super.onSuccess(eVar);
        a(eVar.f30577b.f30600b, eVar.f30578c);
    }

    public void a(String str) {
        this.f31300a = str;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        q0.c(f31299b, "parseLoad content = " + jSONObject);
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0410a(jSONObject, jSONObject.optString("version"), iOptInt));
            return;
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }
}
