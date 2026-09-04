package com.mbridge.msdk.mbnative.service.net;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b extends c<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31571b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f31572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f31574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f31575d;

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.service.net.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0420a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f31577a;

            RunnableC0420a(CampaignUnit campaignUnit) {
                this.f31577a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f31577a;
                if (campaignUnit == null || campaignUnit.getAds() == null || this.f31577a.getAds().size() <= 0) {
                    a aVar = a.this;
                    b.this.a(aVar.f31575d, aVar.f31572a.optString(NotificationCompat.CATEGORY_MESSAGE));
                } else {
                    a aVar2 = a.this;
                    b.this.a(aVar2.f31574c, this.f31577a);
                    b.this.saveRequestTime(this.f31577a.getAds().size());
                }
            }
        }

        a(JSONObject jSONObject, String str, List list, int i10) {
            this.f31572a = jSONObject;
            this.f31573b = str;
            this.f31574c = list;
            this.f31575d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectOptJSONObject = this.f31572a.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0420a("v5".equals(this.f31573b) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObjectOptJSONObject) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObjectOptJSONObject)));
        }
    }

    public abstract void a(int i10, String str);

    public void a(String str) {
        this.f31571b = str;
    }

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    public String b() {
        return this.f31571b;
    }

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
        if (eVar == null || (aVar = eVar.f30577b) == null) {
            return;
        }
        int i10 = this.f31570a;
        if (i10 == 0) {
            b(aVar.f30600b, eVar.f30578c);
        } else if (i10 == 1) {
            a(aVar.f30600b, eVar.f30578c);
        }
    }

    private void b(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        if (1 != iOptInt) {
            a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject, jSONObject.optString("version"), list, iOptInt));
    }

    public void a(int i10) {
        this.f31570a = i10;
    }

    public int a() {
        return this.f31570a;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA));
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA));
            }
            if (campaignUnit != null && campaignUnit.getListFrames() != null && campaignUnit.getListFrames().size() > 0) {
                a(campaignUnit.getListFrames());
                saveRequestTime(campaignUnit.getListFrames().size());
                return;
            } else {
                a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
                return;
            }
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }
}
