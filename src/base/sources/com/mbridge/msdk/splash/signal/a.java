package com.mbridge.msdk.splash.signal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.base.d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a implements com.mbridge.msdk.mbsignalcommon.mraid.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<Context> f32790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f32791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f32792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f32793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32795g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f32797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.splash.middle.a f32798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SplashExpandDialog f32799k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f32789a = "SplashSignalCommunicationImpl";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32796h = 5;

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.signal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0453a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f32800a;

        RunnableC0453a(ArrayList arrayList) {
            this.f32800a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j jVarA = j.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                ArrayList arrayList = this.f32800a;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    jVarA.b((String) obj);
                }
            } catch (Exception unused) {
                q0.b(a.this.f32789a, "campain can't insert db");
            }
        }
    }

    public a(Context context, String str, String str2) {
        this.f32793e = str;
        this.f32792d = str2;
        this.f32790b = new WeakReference<>(context);
    }

    public void a(Context context) {
        this.f32790b = new WeakReference<>(context);
    }

    public void b(int i10) {
        this.f32796h = i10;
    }

    public void c(int i10) {
        this.f32797i = i10;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        q0.b(this.f32789a, "close");
        try {
            com.mbridge.msdk.splash.middle.a aVar = this.f32798j;
            if (aVar != null) {
                aVar.close();
            }
        } catch (Throwable th2) {
            q0.b(this.f32789a, "close", th2);
        }
    }

    public void d(Object obj, String str) {
        q0.a(this.f32789a, "sendImpressions:" + str);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                for (CampaignEx campaignEx : this.f32791c) {
                    if (campaignEx.getId().equals(string)) {
                        com.mbridge.msdk.foundation.same.buffer.b.a(this.f32792d, campaignEx, "splash");
                        arrayList.add(string);
                    }
                }
            }
            new Thread(new RunnableC0453a(arrayList)).start();
        } catch (Throwable th2) {
            q0.b(this.f32789a, "sendImpressions", th2);
        }
    }

    public void e(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "Call pause count down success.");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("countdown", this.f32797i);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            q0.b(this.f32789a, e10.getMessage());
        }
        com.mbridge.msdk.splash.middle.a aVar = this.f32798j;
        if (aVar != null) {
            aVar.a(1, -1);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z10);
            WeakReference<Context> weakReference = this.f32790b;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            SplashExpandDialog splashExpandDialog = this.f32799k;
            if (splashExpandDialog == null || !splashExpandDialog.isShowing()) {
                SplashExpandDialog splashExpandDialog2 = new SplashExpandDialog(this.f32790b.get(), bundle, this.f32798j);
                this.f32799k = splashExpandDialog2;
                splashExpandDialog2.setCampaignList(this.f32792d, this.f32791c);
                this.f32799k.show();
                com.mbridge.msdk.splash.middle.a aVar = this.f32798j;
                if (aVar != null) {
                    aVar.a(true);
                }
                com.mbridge.msdk.splash.report.a.a(this.f32792d, getMraidCampaign(), str);
            }
        } catch (Throwable th2) {
            q0.b(this.f32789a, "expand", th2);
        }
    }

    public void f(Object obj, String str) {
        int i10 = 0;
        if (!TextUtils.isEmpty(str)) {
            try {
                int iOptInt = new JSONObject(str).optInt("countdown");
                try {
                    f.a().b(obj, c.a(0));
                    i10 = iOptInt;
                } catch (Exception e10) {
                    e = e10;
                    i10 = iOptInt;
                    q0.b(this.f32789a, e.getMessage());
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        com.mbridge.msdk.splash.middle.a aVar = this.f32798j;
        if (aVar != null) {
            aVar.a(2, i10);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f32791c;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f32791c.get(0);
    }

    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.mbridge.msdk.splash.common.b bVar = new com.mbridge.msdk.splash.common.b(com.mbridge.msdk.foundation.controller.c.n().d());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f32794f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", bVar.b());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f32791c));
            l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f32792d);
            if (lVarE == null) {
                lVarE = l.i(this.f32792d);
            }
            if (!TextUtils.isEmpty(this.f32793e)) {
                lVarE.d(this.f32793e);
            }
            lVarE.e(this.f32792d);
            lVarE.j(this.f32796h);
            lVarE.a(this.f32795g);
            jSONObject.put("unitSetting", lVarE.M());
            String strG = h.b().g(com.mbridge.msdk.foundation.controller.c.n().b());
            if (!TextUtils.isEmpty(strG)) {
                jSONObject.put("appSetting", new JSONObject(strG));
            }
            jSONObject.put("sdk_info", d.f31590a);
            q0.b(this.f32789a, "init" + jSONObject.toString());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th2) {
            q0.b(this.f32789a, "init", th2);
        }
    }

    public void install(Object obj, String str) {
        q0.b(this.f32789a, "install");
        try {
            List<CampaignEx> list = this.f32791c;
            if (list == null) {
                return;
            }
            CampaignEx campaignEx = list.size() > 0 ? this.f32791c.get(0) : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectCampaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectCampaignToJsonObject.put(next, jSONObject.getString(next));
                }
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject);
                String strOptString = jSONObjectCampaignToJsonObject.optString("unitId");
                if (!TextUtils.isEmpty(strOptString)) {
                    campaignWithBackData.setCampaignUnitId(strOptString);
                }
                campaignEx = campaignWithBackData;
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            com.mbridge.msdk.splash.middle.a aVar = this.f32798j;
            if (aVar != null) {
                aVar.a(campaignEx);
            }
        } catch (Throwable th2) {
            q0.b(this.f32789a, CampaignEx.JSON_NATIVE_VIDEO_CLICK, th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        com.mbridge.msdk.splash.middle.a aVar = this.f32798j;
        if (aVar != null) {
            aVar.a(true, str);
        }
    }

    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        q0.b(this.f32789a, "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextD == null) {
            try {
                if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f31700b) != null) {
                    contextD = windVaneWebView.getContext();
                }
            } catch (Exception e10) {
                q0.b(this.f32789a, e10.getMessage());
            }
        }
        if (contextD == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                com.mbridge.msdk.click.c.c(contextD, strOptString);
            } else if (iOptInt == 2) {
                com.mbridge.msdk.click.c.e(contextD, strOptString);
            }
        } catch (JSONException e11) {
            q0.b(this.f32789a, e11.getMessage());
        } catch (Throwable th2) {
            q0.b(this.f32789a, th2.getMessage());
        }
    }

    public void reportUrls(Object obj, String str) {
        q0.a(this.f32789a, "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                int iOptInt = jSONObject.optInt("type");
                String strA = v0.a(jSONObject.optString("url"), "&tun=", m0.A() + "");
                int iOptInt2 = jSONObject.optInt("report");
                if (iOptInt2 == 0) {
                    Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                    List<CampaignEx> list = this.f32791c;
                    com.mbridge.msdk.click.a.a(contextD, list != null ? list.get(0) : null, "", strA, false, iOptInt != 0);
                } else {
                    Context contextD2 = com.mbridge.msdk.foundation.controller.c.n().d();
                    List<CampaignEx> list2 = this.f32791c;
                    com.mbridge.msdk.click.a.a(contextD2, list2 != null ? list2.get(0) : null, "", strA, false, iOptInt != 0, iOptInt2);
                }
            }
            f.a().b(obj, c.a(0));
        } catch (Throwable th2) {
            q0.b(this.f32789a, "reportUrls", th2);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            com.mbridge.msdk.splash.middle.a aVar = this.f32798j;
            if (aVar != null) {
                aVar.toggleCloseBtn(iOptInt);
            }
        } catch (Throwable th2) {
            q0.b(this.f32789a, "toggleCloseBtn", th2);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        com.mbridge.msdk.splash.middle.a aVar = this.f32798j;
        if (aVar != null) {
            aVar.triggerCloseBtn(obj, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        int i10 = z10 ? 2 : 1;
        try {
            com.mbridge.msdk.splash.middle.a aVar = this.f32798j;
            if (aVar != null) {
                aVar.toggleCloseBtn(i10);
            }
        } catch (Throwable th2) {
            q0.b(this.f32789a, "useCustomClose", th2);
        }
    }

    public void a(int i10) {
        this.f32795g = i10;
    }

    public List<CampaignEx> b() {
        return this.f32791c;
    }

    public void c(Object obj, String str) {
        try {
            if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
                f.a().a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f31700b);
            }
        } catch (Throwable th2) {
            q0.b(this.f32789a, "onJSBridgeConnect", th2);
        }
    }

    public void a(com.mbridge.msdk.splash.middle.a aVar) {
        if (aVar != null) {
            this.f32798j = aVar;
        }
    }

    public com.mbridge.msdk.splash.middle.a a() {
        return this.f32798j;
    }

    public void a(List<CampaignEx> list) {
        this.f32791c = list;
    }

    public void a(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i10 = new JSONObject(str).getInt("countdown");
            com.mbridge.msdk.splash.middle.a aVar = this.f32798j;
            if (aVar != null) {
                aVar.a(i10);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
