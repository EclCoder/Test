package com.mbridge.msdk.splash.signal;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f32802a = "SplashSignalUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f32803b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f32804c = 1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f32805a;

        a(CampaignEx campaignEx) {
            this.f32805a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j jVarA = j.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                if (jVarA != null) {
                    if (jVarA.a(this.f32805a.getId())) {
                        jVarA.b(this.f32805a.getId());
                    } else {
                        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                        gVar.a(this.f32805a.getId());
                        gVar.b(this.f32805a.getFca());
                        gVar.c(this.f32805a.getFcb());
                        gVar.a(0);
                        gVar.d(1);
                        gVar.a(System.currentTimeMillis());
                        jVarA.b(gVar);
                    }
                }
                c.b(this.f32805a.getCampaignUnitId(), this.f32805a);
            } catch (Throwable th2) {
                q0.b(c.f32802a, th2.getMessage(), th2);
            }
        }
    }

    public static void b(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject);
            if (campaignWithBackData == null) {
                a(obj, "data camapign is empty");
            } else {
                a(campaignWithBackData);
                b(obj, "");
            }
        } catch (Throwable th2) {
            a(obj, th2.getMessage());
        }
    }

    public static void a(Object obj, JSONObject jSONObject) {
        JSONArray jSONArray;
        boolean z10;
        String str;
        String str2 = "";
        JSONObject jSONObject2 = new JSONObject();
        int i10 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "params is null");
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e10) {
                q0.a(f32802a, e10.getMessage());
                return;
            }
        }
        try {
            try {
                jSONObject2.put("code", 0);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "");
                JSONArray jSONArray2 = jSONObject.getJSONArray("resource");
                if (jSONArray2 != null && jSONArray2.length() > 0) {
                    JSONArray jSONArray3 = new JSONArray();
                    int length = jSONArray2.length();
                    int i11 = 0;
                    while (i11 < length) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                        String strOptString = jSONObject3.optString("ref", str2);
                        int i12 = jSONObject3.getInt("type");
                        JSONObject jSONObject4 = new JSONObject();
                        if (i12 == i10 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject5 = new JSONObject();
                            m mVarB = com.mbridge.msdk.foundation.db.m.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d())).b(strOptString);
                            if (mVarB != null) {
                                jSONArray = jSONArray2;
                                q0.a(f32802a, "VideoBean not null");
                                jSONObject5.put("type", 1);
                                jSONObject5.put("videoDataLength", mVarB.d());
                                String strE = mVarB.e();
                                if (TextUtils.isEmpty(strE)) {
                                    q0.a(f32802a, "VideoPath null");
                                    jSONObject5.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, str2);
                                    jSONObject5.put("path4Web", str2);
                                } else {
                                    q0.a(f32802a, "VideoPath not null");
                                    jSONObject5.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, strE);
                                    jSONObject5.put("path4Web", strE);
                                }
                                if (mVarB.b() == 5) {
                                    jSONObject5.put("downloaded", 1);
                                    z10 = false;
                                } else {
                                    z10 = false;
                                    jSONObject5.put("downloaded", 0);
                                }
                                jSONObject4.put(strOptString, jSONObject5);
                                jSONArray3.put(jSONObject4);
                            } else {
                                str2 = str2;
                                jSONArray = jSONArray2;
                                length = length;
                                z10 = false;
                                q0.a(f32802a, "VideoBean null");
                            }
                        } else {
                            str2 = str2;
                            jSONArray = jSONArray2;
                            length = length;
                            z10 = false;
                            if (i12 == 2 && !TextUtils.isEmpty(strOptString)) {
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("type", 2);
                                jSONObject6.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, H5DownLoadManager.getInstance().getH5ResAddress(strOptString) == null ? str2 : H5DownLoadManager.getInstance().getH5ResAddress(strOptString));
                                jSONObject4.put(strOptString, jSONObject6);
                                jSONArray3.put(jSONObject4);
                            } else if (i12 == 3 && !TextUtils.isEmpty(strOptString)) {
                                try {
                                    File file = new File(strOptString);
                                    if (file.exists() && file.isFile() && file.canRead()) {
                                        q0.a(f32802a, "getFileInfo Mraid file " + strOptString);
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
                                jSONArray3.put(jSONObject4);
                            } else if (i12 == 4 && !TextUtils.isEmpty(strOptString)) {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("type", 4);
                                jSONObject8.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, u0.a(strOptString) == null ? str2 : u0.a(strOptString));
                                jSONObject4.put(strOptString, jSONObject8);
                                jSONArray3.put(jSONObject4);
                            }
                        }
                        i11++;
                        jSONArray2 = jSONArray;
                        length = length;
                        str2 = str2;
                        i10 = 1;
                    }
                    jSONObject2.put("resource", jSONArray3);
                    f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                }
                try {
                    jSONObject2.put("code", 1);
                    jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "resource is null");
                    f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                } catch (JSONException e11) {
                    q0.a(f32802a, e11.getMessage());
                    return;
                }
            } catch (Throwable th3) {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th3.getLocalizedMessage());
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            jSONObject2.put("code", 1);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th3.getLocalizedMessage());
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            return;
        } catch (JSONException e12) {
            q0.a(f32802a, e12.getMessage());
            return;
        }
    }

    public static void b(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f32803b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            a(obj, e10.getMessage());
            q0.a(f32802a, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, CampaignEx campaignEx) {
        if (com.mbridge.msdk.foundation.same.buffer.b.f30522m == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.buffer.b.a(str, campaignEx, "splash");
    }

    public static String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            q0.b(f32802a, "code to string is error");
            return "";
        }
    }

    public static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f32804c);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            q0.a(f32802a, e10.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx) {
        new Thread(new a(campaignEx)).start();
    }

    public static void a(WebView webView, String str, String str2) {
        f.a().a(webView, str, str2);
    }

    public static void a(WebView webView) {
        q0.b(f32802a, "fireOnSignalCommunication");
        f.a().a(webView);
    }
}
