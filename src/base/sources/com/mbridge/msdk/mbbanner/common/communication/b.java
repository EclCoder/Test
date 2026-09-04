package com.mbridge.msdk.mbbanner.common.communication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.communication.c;
import com.mbridge.msdk.mbsignalcommon.communication.d;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.l;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<Context> f31189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f31190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f31192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.a f31194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BannerExpandDialog f31195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f31196i = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f31197a;

        a(ArrayList arrayList) {
            this.f31197a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j jVarA = j.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                ArrayList arrayList = this.f31197a;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    jVarA.b((String) obj);
                }
            } catch (Exception e10) {
                q0.b("BannerSignalCommunicationImpl", e10.getMessage());
            }
        }
    }

    public b(Context context, String str, String str2) {
        this.f31191d = str;
        this.f31192e = str2;
        this.f31189b = new WeakReference<>(context);
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.a aVar) {
        if (aVar != null) {
            this.f31194g = aVar;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void click(Object obj, String str) {
        q0.b("BannerSignalCommunicationImpl", CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        try {
            List<CampaignEx> list = this.f31190c;
            if (list == null) {
                return;
            }
            CampaignEx campaignEx = list.size() > 0 ? this.f31190c.get(0) : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectCampaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
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
            com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f31194g;
            if (aVar != null) {
                aVar.a(campaignEx);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalCommunicationImpl", CampaignEx.JSON_NATIVE_VIDEO_CLICK, th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        q0.b("BannerSignalCommunicationImpl", "close");
        try {
            com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f31194g;
            if (aVar != null) {
                aVar.close();
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalCommunicationImpl", "close", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void d(Object obj, String str) {
        q0.a("BannerSignalCommunicationImpl", "sendImpressions:" + str);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                for (CampaignEx campaignEx : this.f31190c) {
                    if (campaignEx.getId().equals(string)) {
                        com.mbridge.msdk.foundation.same.buffer.b.a(this.f31192e, campaignEx, "banner");
                        arrayList.add(string);
                    }
                }
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(arrayList));
        } catch (Throwable th2) {
            q0.b("BannerSignalCommunicationImpl", "sendImpressions", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
        Context context;
        try {
            String bannerUrl = "";
            if (getMraidCampaign() != null) {
                if (TextUtils.isEmpty(getMraidCampaign().getBannerHtml())) {
                    bannerUrl = getMraidCampaign().getBannerUrl();
                } else {
                    bannerUrl = "file:////" + getMraidCampaign().getBannerHtml();
                }
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bannerUrl = str;
            }
            bundle.putString("url", bannerUrl);
            bundle.putBoolean("shouldUseCustomClose", z10);
            WeakReference<Context> weakReference = this.f31189b;
            if (weakReference != null && (context = weakReference.get()) != null) {
                BannerExpandDialog bannerExpandDialog = this.f31195h;
                if (bannerExpandDialog != null && bannerExpandDialog.isShowing()) {
                    return;
                }
                BannerExpandDialog bannerExpandDialog2 = new BannerExpandDialog(context, bundle, this.f31194g);
                this.f31195h = bannerExpandDialog2;
                bannerExpandDialog2.setCampaignList(this.f31192e, this.f31190c);
                this.f31195h.show();
            }
            com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f31194g;
            if (aVar != null) {
                aVar.a(true);
            }
            com.mbridge.msdk.mbbanner.common.report.a.a(this.f31192e, getMraidCampaign(), str);
        } catch (Throwable th2) {
            q0.b("BannerSignalCommunicationImpl", "expand", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void getFileInfo(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is empty");
            return;
        }
        try {
            a(obj, new JSONObject(str));
        } catch (Throwable th2) {
            q0.a("BannerSignalCommunicationImpl", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f31190c;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f31190c.get(0);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void init(Object obj, String str) {
        q0.b("BannerSignalCommunicationImpl", "BANNER INIT INVOKE");
        try {
            JSONObject jSONObject = new JSONObject();
            u uVar = new u(com.mbridge.msdk.foundation.controller.c.n().d());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f31193f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", uVar.a());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f31190c));
            l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f31192e);
            if (lVarE == null) {
                lVarE = l.i(this.f31192e);
            }
            if (!TextUtils.isEmpty(this.f31191d)) {
                lVarE.d(this.f31191d);
            }
            jSONObject.put("unitSetting", lVarE.M());
            String strG = h.b().g(com.mbridge.msdk.foundation.controller.c.n().b());
            if (!TextUtils.isEmpty(strG)) {
                jSONObject.put("appSetting", new JSONObject(strG));
            }
            jSONObject.put("sdk_info", com.mbridge.msdk.mbsignalcommon.base.d.f31590a);
            q0.b("BannerSignalCommunicationImpl", "init" + jSONObject.toString());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th2) {
            q0.b("BannerSignalCommunicationImpl", "init", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        q0.b("BannerSignalCommunicationImpl", com.vungle.ads.internal.presenter.g.OPEN);
        try {
            q0.b("BannerSignalCommunicationImpl", str);
            if (this.f31190c.size() > 1) {
                com.mbridge.msdk.foundation.controller.c.n().d().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f31194g;
            if (aVar != null) {
                aVar.a(true, str);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalCommunicationImpl", com.vungle.ads.internal.presenter.g.OPEN, th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                f.a().b(obj, d.a(0));
                com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f31194g;
                if (aVar != null) {
                    aVar.readyStatus(iOptInt);
                }
            } catch (Throwable th2) {
                q0.b("BannerSignalCommunicationImpl", "readyStatus", th2);
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void reportUrls(Object obj, String str) {
        q0.a("BannerSignalCommunicationImpl", "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
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
                    List<CampaignEx> list = this.f31190c;
                    com.mbridge.msdk.click.a.a(contextD, list != null ? list.get(0) : null, "", strA, false, iOptInt != 0);
                } else {
                    Context contextD2 = com.mbridge.msdk.foundation.controller.c.n().d();
                    List<CampaignEx> list2 = this.f31190c;
                    com.mbridge.msdk.click.a.a(contextD2, list2 != null ? list2.get(0) : null, "", strA, false, iOptInt != 0, iOptInt2);
                }
            }
            f.a().b(obj, d.a(0));
        } catch (Throwable th2) {
            q0.b("BannerSignalCommunicationImpl", "reportUrls", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void toggleCloseBtn(Object obj, String str) {
        q0.b("BannerSignalCommunicationImpl", "toggleCloseBtn");
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f31194g;
            if (aVar != null) {
                aVar.toggleCloseBtn(iOptInt);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalCommunicationImpl", "toggleCloseBtn", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void triggerCloseBtn(Object obj, String str) {
        q0.b("BannerSignalCommunicationImpl", "triggerCloseBtn");
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String strOptString = new JSONObject(str).optString("state");
            com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f31194g;
            if (aVar != null) {
                aVar.triggerCloseBtn(strOptString);
            }
            f.a().b(obj, d.a(0));
        } catch (Throwable th2) {
            q0.b("BannerSignalCommunicationImpl", "triggerCloseBtn", th2);
            f.a().b(obj, d.a(-1));
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
            com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f31194g;
            if (aVar != null) {
                aVar.toggleCloseBtn(i10);
            }
        } catch (Throwable th2) {
            q0.b("BannerSignalCommunicationImpl", "useCustomClose", th2);
        }
    }

    public void a(List<CampaignEx> list) {
        this.f31190c = list;
    }

    public void a(int i10) {
        this.f31193f = i10;
    }

    public void a() {
        if (this.f31194g != null) {
            this.f31194g = null;
        }
        if (this.f31195h != null) {
            this.f31195h = null;
        }
    }

    public static void a(Object obj, JSONObject jSONObject) {
        int i10;
        boolean z10;
        String str;
        String str2 = "";
        JSONObject jSONObject2 = new JSONObject();
        int i11 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "params is null");
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e10) {
                q0.a("BannerSignalCommunicationImpl", e10.getMessage());
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "");
            JSONArray jSONArray = jSONObject.getJSONArray("resource");
            if (jSONArray != null && jSONArray.length() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                int length = jSONArray.length();
                int i12 = 0;
                while (i12 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i12);
                    String strOptString = jSONObject3.optString("ref", str2);
                    int i13 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    JSONArray jSONArray3 = jSONArray;
                    if (i13 == i11 && !TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject5 = new JSONObject();
                        m mVarB = com.mbridge.msdk.foundation.db.m.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d())).b(strOptString);
                        if (mVarB != null) {
                            q0.a("BannerSignalCommunicationImpl", "VideoBean not null");
                            jSONObject5.put("type", 1);
                            i10 = length;
                            jSONObject5.put("videoDataLength", mVarB.d());
                            String strE = mVarB.e();
                            boolean zIsEmpty = TextUtils.isEmpty(strE);
                            String str3 = CIdIVqKnNZ.yooyKw;
                            if (zIsEmpty) {
                                q0.a("BannerSignalCommunicationImpl", "VideoPath null");
                                jSONObject5.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, str2);
                                jSONObject5.put(str3, str2);
                            } else {
                                q0.a("BannerSignalCommunicationImpl", jyeoXJ.MzUrAUtBDanHVx);
                                jSONObject5.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, strE);
                                jSONObject5.put(str3, strE);
                            }
                            if (mVarB.b() == 5) {
                                jSONObject5.put("downloaded", 1);
                                z10 = false;
                            } else {
                                z10 = false;
                                jSONObject5.put("downloaded", 0);
                            }
                            jSONObject4.put(strOptString, jSONObject5);
                            jSONArray2.put(jSONObject4);
                        } else {
                            str2 = str2;
                            i10 = length;
                            z10 = false;
                            q0.a("BannerSignalCommunicationImpl", "VideoBean null");
                        }
                    } else {
                        str2 = str2;
                        i10 = length;
                        z10 = false;
                        if (i13 == 2 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 2);
                            jSONObject6.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, H5DownLoadManager.getInstance().getResAddress(strOptString) == null ? str2 : H5DownLoadManager.getInstance().getH5ResAddress(strOptString));
                            jSONObject4.put(strOptString, jSONObject6);
                            jSONArray2.put(jSONObject4);
                        } else if (i13 == 3 && !TextUtils.isEmpty(strOptString)) {
                            try {
                                File file = new File(strOptString);
                                if (file.exists() && file.isFile() && file.canRead()) {
                                    q0.a("BannerSignalCommunicationImpl", "getFileInfo Mraid file " + strOptString);
                                    str = "file:////" + strOptString;
                                } else {
                                    str = str2;
                                }
                            } catch (Throwable th2) {
                                if (MBridgeConstans.DEBUG) {
                                    th2.printStackTrace();
                                }
                            }
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 3);
                            jSONObject7.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, str);
                            jSONObject4.put(strOptString, jSONObject7);
                            jSONArray2.put(jSONObject4);
                        } else if (i13 == 4 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("type", 4);
                            jSONObject8.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, u0.a(strOptString) == null ? str2 : u0.a(strOptString));
                            jSONObject4.put(strOptString, jSONObject8);
                            jSONArray2.put(jSONObject4);
                        }
                    }
                    i12++;
                    jSONArray = jSONArray3;
                    length = i10;
                    str2 = str2;
                    i11 = 1;
                }
                jSONObject2.put("resource", jSONArray2);
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "resource is null");
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e11) {
                q0.a("BannerSignalCommunicationImpl", e11.getMessage());
                return;
            }
        } catch (Throwable th3) {
            jSONObject2.put("code", 1);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th3.getLocalizedMessage());
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        }
        try {
            jSONObject2.put("code", 1);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th3.getLocalizedMessage());
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (JSONException e12) {
            q0.a("BannerSignalCommunicationImpl", e12.getMessage());
        }
    }
}
