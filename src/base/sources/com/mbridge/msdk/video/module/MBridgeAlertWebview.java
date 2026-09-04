package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.listener.b;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.videocommon.download.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBridgeAlertWebview extends MBridgeH5EndCardView {
    private String P;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends b {
        a() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            String str;
            super.a(webView, i10);
            q0.b("MBridgeAlertWebview", "readyState  :  " + i10);
            MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
            if (mBridgeAlertWebview.f34488u) {
                return;
            }
            boolean z10 = i10 == 1;
            mBridgeAlertWebview.f34487t = z10;
            if (z10) {
                str = "readyState state is " + i10;
            } else {
                str = "";
            }
            String str2 = str;
            MBridgeAlertWebview mBridgeAlertWebview2 = MBridgeAlertWebview.this;
            j.a(mBridgeAlertWebview2.f34432a, mBridgeAlertWebview2.f34433b, mBridgeAlertWebview2.P, MBridgeAlertWebview.this.unitId, i10, str2, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            q0.b("MBridgeAlertWebview", "finish+" + str);
            f.a().a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            q0.b("MBridgeAlertWebview", "onReceivedError");
            if (MBridgeAlertWebview.this.f34488u) {
                return;
            }
            q0.a(MBridgeBaseView.TAG, "onReceivedError,url:" + str2);
            MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
            j.a(mBridgeAlertWebview.f34432a, mBridgeAlertWebview.f34433b, mBridgeAlertWebview.P, MBridgeAlertWebview.this.unitId, 2, str, 1);
            MBridgeAlertWebview.this.f34488u = true;
        }
    }

    public MBridgeAlertWebview(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    protected RelativeLayout.LayoutParams getContentLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    protected String getURL() {
        if (TextUtils.isEmpty(this.unitId)) {
            return "";
        }
        String strC = com.mbridge.msdk.videocommon.setting.b.b().a(c.n().b(), this.unitId, false).c();
        this.P = strC;
        return !TextUtils.isEmpty(strC) ? d.a().a(this.P) : "";
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        String url = getURL();
        if (!this.f34436e || this.f34433b == null || TextUtils.isEmpty(url)) {
            this.notifyListener.a(101, "");
            return;
        }
        com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(this.f34433b);
        aVar.a(this.f34433b.getAppName());
        this.f34483p.setDownloadListener(aVar);
        this.f34483p.setCampaignId(this.f34433b.getId());
        setCloseVisible(8);
        this.f34483p.setApiManagerJSFactory(bVar);
        this.f34483p.setWebViewListener(new a());
        setHtmlSource(com.mbridge.msdk.videocommon.download.f.a().a(url));
        this.f34487t = false;
        if (TextUtils.isEmpty(this.f34486s)) {
            q0.a(MBridgeBaseView.TAG, "load url:" + url);
            this.f34483p.loadUrl(url);
        } else {
            q0.a(MBridgeBaseView.TAG, "load html...");
            this.f34483p.loadDataWithBaseURL(url, this.f34486s, "text/html", C.UTF8_NAME, null);
        }
        this.f34483p.setBackgroundColor(0);
        setBackgroundColor(0);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        RelativeLayout relativeLayout = this.f34481n;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(0);
        }
        super.webviewshow();
        j.a(this.f34432a, this.f34433b, this.P, this.unitId, 2, 1);
    }

    public MBridgeAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
