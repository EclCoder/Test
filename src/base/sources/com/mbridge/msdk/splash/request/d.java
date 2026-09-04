package com.mbridge.msdk.splash.request;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f32755c = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32757b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f32758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f32759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f32760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f32761d;

        /* JADX INFO: renamed from: com.mbridge.msdk.splash.request.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0452a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f32763a;

            RunnableC0452a(CampaignUnit campaignUnit) {
                this.f32763a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f32763a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f32763a.getAds().size() > 0) {
                    a aVar = a.this;
                    d.this.a(aVar.f32760c, this.f32763a);
                    d.this.saveRequestTime(this.f32763a.getAds().size());
                } else {
                    CampaignUnit campaignUnit2 = this.f32763a;
                    String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                    if (TextUtils.isEmpty(msg)) {
                        msg = a.this.f32758a.optString(NotificationCompat.CATEGORY_MESSAGE);
                    }
                    a aVar2 = a.this;
                    d.this.a(aVar2.f32761d, msg);
                }
            }
        }

        a(JSONObject jSONObject, String str, List list, int i10) {
            this.f32758a = jSONObject;
            this.f32759b = str;
            this.f32760c = list;
            this.f32761d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectOptJSONObject = this.f32758a.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0452a("v5".equals(this.f32759b) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObjectOptJSONObject, d.this.f32757b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObjectOptJSONObject, d.this.f32757b)));
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

    public abstract void a(int i10, String str);

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f32755c, "errorCode = " + aVar.f30579a);
        a(aVar.f30579a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.f30577b) == null) {
            return;
        }
        int i10 = this.f32756a;
        if (i10 == 0) {
            b(aVar.f30600b, eVar.f30578c);
        } else if (i10 == 1) {
            a(aVar.f30600b, eVar.f30578c);
        }
    }

    public void a(String str) {
        this.f32757b = str;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), this.f32757b);
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), this.f32757b);
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
                a(iOptInt, msg);
                return;
            }
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }
}
