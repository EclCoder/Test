package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class BaseAbsFeedBackForH5 extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f31679e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f31680f = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31681d = "AbsFeedBackForH5";

    public void callbackSuccess(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f31679e);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "");
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            callbackExcep(obj, e10.getMessage());
            q0.a(this.f31681d, e10.getMessage());
        }
    }

    public void callbackSuccessWithData(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f31679e);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "");
            jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject);
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e10) {
            callbackExcep(obj, e10.getMessage());
            q0.a(this.f31681d, e10.getMessage());
        }
    }

    public void feedbackLayoutOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("width", -1);
                int iOptInt2 = jSONObject.optInt("height", -1);
                int iOptInt3 = jSONObject.optInt(TtmlNode.LEFT, -1);
                int iOptInt4 = jSONObject.optInt("top", -1);
                double dOptDouble = jSONObject.optDouble("opacity", 1.0d);
                int iOptInt5 = jSONObject.optInt("radius", 20);
                String strOptString = jSONObject.optString("fontColor", "");
                String strOptString2 = jSONObject.optString("bgColor", "");
                com.mbridge.msdk.foundation.feedback.b.b().a(jSONObject.optString("key", ""), iOptInt, iOptInt2, iOptInt5, iOptInt3, iOptInt4, (float) dOptDouble, strOptString, strOptString2, (float) jSONObject.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE, -1.0d), jSONObject.optJSONArray("padding"));
            }
            callbackSuccess(obj);
        } catch (Throwable th2) {
            callbackExcep(obj, th2.getMessage());
            th2.printStackTrace();
        }
    }

    public void feedbackOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("view_visible", 1);
                com.mbridge.msdk.foundation.feedback.b.b().a(jSONObject.optString("key", ""), iOptInt == 1 ? 8 : 0, aVar.f31700b);
            }
            callbackSuccess(obj);
        } catch (Throwable th2) {
            callbackExcep(obj, th2.getMessage());
            th2.printStackTrace();
        }
    }

    public void feedbackPopupOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("view_visible", 1);
                com.mbridge.msdk.foundation.feedback.b.b().a(jSONObject.optString("key", ""), iOptInt, new a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f31700b));
            }
            callbackSuccess(obj);
        } catch (Throwable th2) {
            callbackExcep(obj, th2.getMessage());
            th2.printStackTrace();
        }
    }

    public void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(HqKnbV.ViUJsNhYUXr, f31680f);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            q0.a(this.f31681d, e10.getMessage());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a implements com.mbridge.msdk.foundation.feedback.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WindVaneWebView f31682a;

        a(WindVaneWebView windVaneWebView) {
            this.f31682a = windVaneWebView;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(BaseAbsFeedBackForH5.this.f31681d, th2.getMessage(), th2);
                string = "";
            }
            f.a().a((WebView) this.f31682a, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(BaseAbsFeedBackForH5.this.f31681d, th2.getMessage(), th2);
                string = "";
            }
            f.a().a((WebView) this.f31682a, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(BaseAbsFeedBackForH5.this.f31681d, th2.getMessage(), th2);
                string = "";
            }
            f.a().a((WebView) this.f31682a, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }
}
