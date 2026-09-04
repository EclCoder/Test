package com.mbridge.msdk.splash.signal;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class SplashSignal extends AbsFeedBackForH5 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f32786h = "SplashSignal";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f32787i = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f32788g;

    public void getFileInfo(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c.a(obj, new JSONObject(str));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        if (obj != null) {
            try {
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f31700b;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().onReceivedError(windVaneWebView, 0, str.toString(), windVaneWebView.getUrl());
            } catch (Throwable th2) {
                q0.b(f32786h, "handlerH5Exception", th2);
            }
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            c.b(obj, new JSONObject(str));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void init(Object obj, String str) {
        q0.b(f32786h, "initialize" + str);
        b bVar = this.f32788g;
        if (bVar != null) {
            bVar.init(obj, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.g
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof b)) {
                return;
            }
            this.f32788g = (b) windVaneWebView.getObject();
        } catch (Throwable th2) {
            q0.b(f32786h, "initialize", th2);
        }
    }

    public void install(Object obj, String str) {
        b bVar = this.f32788g;
        if (bVar != null) {
            bVar.install(obj, str);
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            q0.b(f32786h, "onSignalCommunication");
            b bVar = this.f32788g;
            if (bVar != null) {
                bVar.c(obj, str);
            }
        } catch (Throwable th2) {
            q0.b(f32786h, "onSignalCommunication", th2);
        }
    }

    public void openURL(Object obj, String str) {
        q0.b(f32786h, "openURL" + str);
        b bVar = this.f32788g;
        if (bVar != null) {
            bVar.openURL(obj, str);
        }
    }

    public void pauseCountDown(Object obj, String str) {
        try {
            q0.b(f32786h, "pauseCountDown");
            b bVar = this.f32788g;
            if (bVar != null) {
                bVar.e(obj, str);
            }
        } catch (Throwable th2) {
            q0.b(f32786h, "pauseCountDown", th2);
        }
    }

    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f31700b;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().a(windVaneWebView, iOptInt);
            } catch (Throwable th2) {
                q0.b(f32786h, "readyStatus", th2);
            }
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            q0.b(f32786h, "reportUrls");
            b bVar = this.f32788g;
            if (bVar != null) {
                bVar.reportUrls(obj, str);
            }
        } catch (Throwable th2) {
            q0.b(f32786h, "reportUrls", th2);
        }
    }

    public void resetCountdown(Object obj, String str) {
        q0.b(f32786h, "resetCountdown" + str);
        b bVar = this.f32788g;
        if (bVar != null) {
            bVar.a(obj, str);
        }
    }

    public void resumeCountDown(Object obj, String str) {
        try {
            q0.b(f32786h, "resumeCountDown");
            b bVar = this.f32788g;
            if (bVar != null) {
                bVar.f(obj, str);
            }
        } catch (Throwable th2) {
            q0.b(f32786h, "resumeCountDown", th2);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            q0.b(f32786h, "sendImpressions");
            b bVar = this.f32788g;
            if (bVar != null) {
                bVar.d(obj, str);
            }
        } catch (Throwable th2) {
            q0.b(f32786h, "sendImpressions", th2);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        q0.b(f32786h, "toggleCloseBtn" + str);
        b bVar = this.f32788g;
        if (bVar != null) {
            bVar.toggleCloseBtn(obj, str);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        q0.b(f32786h, "triggerCloseBtn" + str);
        b bVar = this.f32788g;
        if (bVar != null) {
            bVar.triggerCloseBtn(obj, str);
        }
    }
}
