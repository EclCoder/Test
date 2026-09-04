package com.mbridge.msdk.splash.view;

import android.content.Context;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBSplashWebview extends WindVaneWebView {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f32901r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AdSession f32902s;

    public MBSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            AdSession adSession = this.f32902s;
            if (adSession != null) {
                adSession.finish();
                this.f32902s = null;
                q0.a("OMSDK", "finish adSession");
            }
        } catch (Exception e10) {
            q0.a("OMSDK", e10.getMessage());
        }
    }

    public AdSession getAdSession() {
        return this.f32902s;
    }

    public String getRequestId() {
        return this.f32901r;
    }

    public void setAdSession(AdSession adSession) {
        this.f32902s = adSession;
    }

    public void setRequestId(String str) {
        this.f32901r = str;
    }
}
