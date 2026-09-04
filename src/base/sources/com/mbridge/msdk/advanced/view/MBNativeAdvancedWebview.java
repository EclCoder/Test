package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.content.IntentFilter;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.advanced.common.NetWorkStateReceiver;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBNativeAdvancedWebview extends WindVaneWebView {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f28315t = "MBNativeAdvancedWebview";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AdSession f28316r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private NetWorkStateReceiver f28317s;

    public MBNativeAdvancedWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            AdSession adSession = this.f28316r;
            if (adSession != null) {
                adSession.finish();
                this.f28316r = null;
                q0.a("OMSDK", "finish adSession");
            }
        } catch (Exception e10) {
            q0.a("OMSDK", e10.getMessage());
        }
    }

    public AdSession getAdSession() {
        return this.f28316r;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerNetWorkReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unregisterNetWorkReceiver();
    }

    public void registerNetWorkReceiver() {
        try {
            if (this.f28317s == null) {
                this.f28317s = new NetWorkStateReceiver(this);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getContext().registerReceiver(this.f28317s, intentFilter);
        } catch (Throwable th2) {
            q0.a(f28315t, th2.getMessage());
        }
    }

    public void setAdSession(AdSession adSession) {
        this.f28316r = adSession;
    }

    public void unregisterNetWorkReceiver() {
        try {
            NetWorkStateReceiver netWorkStateReceiver = this.f28317s;
            if (netWorkStateReceiver != null) {
                netWorkStateReceiver.a();
                getContext().unregisterReceiver(this.f28317s);
            }
        } catch (Throwable th2) {
            q0.a(f28315t, th2.getMessage());
        }
    }
}
