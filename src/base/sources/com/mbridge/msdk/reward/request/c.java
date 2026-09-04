package com.mbridge.msdk.reward.request;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f32367d = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.metrics.c f32370c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f32371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f32372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f32373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f32374d;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.request.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0443a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f32376a;

            RunnableC0443a(CampaignUnit campaignUnit) {
                this.f32376a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f32376a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f32376a.getAds().size() > 0) {
                    this.f32376a.setMetricsData(c.this.f32370c);
                    a aVar = a.this;
                    c.this.a(aVar.f32373c, this.f32376a);
                    c.this.saveRequestTime(this.f32376a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f32376a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = a.this.f32371a.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                a aVar2 = a.this;
                c cVar = c.this;
                cVar.a(aVar2.f32374d, msg, cVar.f32370c);
            }
        }

        a(JSONObject jSONObject, String str, List list, int i10) {
            this.f32371a = jSONObject;
            this.f32372b = str;
            this.f32373c = list;
            this.f32374d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectOptJSONObject = this.f32371a.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0443a("v5".equals(this.f32372b) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObjectOptJSONObject, c.this.f32369b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObjectOptJSONObject, c.this.f32369b)));
        }
    }

    public abstract void a(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar);

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f32367d, "errorCode = " + aVar.f30579a);
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(aVar.f30579a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
        bVar.a("campaign_request_error", aVar);
        bVar.a(aVar.f30580b);
        this.f32370c.a(bVar);
        a(aVar.f30579a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar), this.f32370c);
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.f30577b) == null) {
            return;
        }
        int i10 = this.f32368a;
        if (i10 == 0) {
            b(aVar.f30600b, eVar.f30578c);
        } else if (i10 == 1) {
            a(aVar.f30600b, eVar.f30578c);
        }
    }

    private void b(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        if (1 != iOptInt) {
            a(list, jSONObject, iOptInt, this.f32370c);
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject, jSONObject.optString("version"), list, iOptInt));
    }

    public void a(String str) {
        this.f32369b = str;
    }

    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        this.f32370c = cVar;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), this.f32369b);
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), this.f32369b);
            }
            if (campaignUnit != null && campaignUnit.getListFrames() != null && campaignUnit.getListFrames().size() > 0) {
                List<Frame> listFrames = campaignUnit.getListFrames();
                a(listFrames);
                saveRequestTime(listFrames.size());
                return;
            } else {
                String msg = campaignUnit != null ? campaignUnit.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                a(iOptInt, msg, this.f32370c);
                return;
            }
        }
        a(list, jSONObject, iOptInt, this.f32370c);
    }

    private void a(List<g> list, JSONObject jSONObject, int i10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.error.b bVarA;
        String strB = "";
        if (list != null && list.size() > 0) {
            for (g gVar : list) {
                if (gVar != null) {
                    String strA = gVar.a();
                    if (!TextUtils.isEmpty(strA) && strA.equals("data_res_type")) {
                        strB = gVar.b();
                    }
                }
            }
        }
        String strL = "errorCode: 3507 errorMessage: data load failed, errorMsg is " + jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
        if (!TextUtils.isEmpty(strB) && strB.equals("1")) {
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880018, strL);
            if (cVar != null) {
                cVar.a(bVarA2);
                cVar.c(true);
                if (TextUtils.isEmpty(strL)) {
                    strL = bVarA2.l();
                }
            }
            a(i10, strL, cVar);
            return;
        }
        if (i10 == -1) {
            bVarA = com.mbridge.msdk.foundation.error.a.a(880017, strL);
        } else {
            bVarA = com.mbridge.msdk.foundation.error.a.a(880003, strL);
        }
        if (cVar != null) {
            cVar.a(bVarA);
            cVar.c(false);
            if (TextUtils.isEmpty(strL)) {
                strL = bVarA.l();
            }
        }
        a(i10, strL, cVar);
    }
}
