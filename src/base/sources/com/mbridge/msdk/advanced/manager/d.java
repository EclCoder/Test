package com.mbridge.msdk.advanced.manager;

import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.h;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f28220a = "ResManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f28221b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e f28222c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f28225c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedView f28226d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f28227e;

        a(String str, String str2, CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView, long j10) {
            this.f28223a = str;
            this.f28224b = str2;
            this.f28225c = campaignEx;
            this.f28226d = mBNativeAdvancedView;
            this.f28227e = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            if (i10 != 1) {
                this.f28226d.setH5Ready(false);
                q0.a("WindVaneWebView", "======渲染失败");
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f28225c, this.f28224b, "readyState 2", this.f28227e, 3);
                return;
            }
            com.mbridge.msdk.advanced.common.c.a(this.f28223a + this.f28224b + this.f28225c.getRequestId(), true);
            this.f28226d.setH5Ready(true);
            q0.a("WindVaneWebView", "======渲染成功：ready");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f28225c, this.f28224b, "", this.f28227e, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f28225c.isHasMBTplMark()) {
                com.mbridge.msdk.advanced.common.c.a(this.f28223a + this.f28224b + this.f28225c.getRequestId(), true);
                this.f28226d.setH5Ready(true);
                q0.a("WindVaneWebView", "======渲染成功：finish");
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f28225c, this.f28224b, "", this.f28227e, 1);
            }
            com.mbridge.msdk.advanced.signal.a.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            this.f28226d.setH5Ready(false);
            q0.a("WindVaneWebView", "======渲染失败");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f28225c, this.f28224b, "error code:" + i10 + str, this.f28227e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            this.f28226d.setH5Ready(false);
            q0.a("WindVaneWebView", "======渲染失败");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f28225c, this.f28224b, "error url:" + sslError.getUrl(), this.f28227e, 3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedWebview f28228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28229b;

        b(MBNativeAdvancedWebview mBNativeAdvancedWebview, String str) {
            this.f28228a = mBNativeAdvancedWebview;
            this.f28229b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28228a.loadUrl(this.f28229b);
        }
    }

    public static CampaignEx a(MBNativeAdvancedView mBNativeAdvancedView, String str, String str2, String str3, int i10, boolean z10, boolean z11) {
        com.mbridge.msdk.setting.g gVarF = h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarF == null) {
            gVarF = h.b().a();
        }
        long jB0 = gVarF.b0() * 1000;
        long jC0 = gVarF.c0() * 1000;
        a(jC0, str2);
        List<CampaignEx> listA = a(str2, str3);
        if (listA != null && listA.size() > 0) {
            CampaignEx campaignEx = listA.get(0);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = jCurrentTimeMillis - jB0;
            if (z10) {
                if ((campaignEx.getPlct() <= 0 || (campaignEx.getPlct() * 1000) + campaignEx.getTimestamp() < jCurrentTimeMillis) && (campaignEx.getPlct() > 0 || campaignEx.getTimestamp() < j10)) {
                    if (a(mBNativeAdvancedView, campaignEx, str, str2, i10, z11) && campaignEx.isSpareOffer(jB0, jC0)) {
                        return a(campaignEx);
                    }
                    if (!campaignEx.isSpareOffer(jB0, jC0) && mBNativeAdvancedView != null) {
                        mBNativeAdvancedView.setVisibility(8);
                    }
                } else if (a(mBNativeAdvancedView, campaignEx, str, str2, i10, z11)) {
                    q0.b(f28220a, "cache campain is picked:" + campaignEx.getAppName());
                    return a(campaignEx);
                }
            } else if ((campaignEx.getPlct() <= 0 || (campaignEx.getPlct() * 1000) + campaignEx.getTimestamp() < jCurrentTimeMillis) && (campaignEx.getPlct() > 0 || campaignEx.getTimestamp() < j10)) {
                q0.a(f28220a, "========已经超了缓存时间");
                if (!campaignEx.isSpareOffer(jB0, jC0) && mBNativeAdvancedView != null) {
                    mBNativeAdvancedView.setVisibility(8);
                    return null;
                }
            } else if (a(mBNativeAdvancedView, campaignEx, str, str2, i10, z11)) {
                q0.b(f28220a, "cache campain is picked:" + campaignEx.getAppName());
                return a(campaignEx);
            }
        }
        return null;
    }

    public static void b(String str) {
        if (f28222c == null) {
            f28222c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        f28222c.a(str, 0, f28221b);
    }

    private static List<CampaignEx> a(String str, String str2) {
        if (f28222c == null) {
            f28222c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        return f28222c.b(str, 0, 0, f28221b);
    }

    private static CampaignEx a(CampaignEx campaignEx) {
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
            campaignEx.setHasMBTplMark(false);
            campaignEx.setIsMraid(true);
            return campaignEx;
        }
        campaignEx.setHasMBTplMark(true);
        campaignEx.setIsMraid(false);
        return campaignEx;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    public static boolean a(MBNativeAdvancedView mBNativeAdvancedView, CampaignEx campaignEx, String str, String str2, int i10, boolean z10) {
        boolean z11;
        if (campaignEx == null) {
            return false;
        }
        mBNativeAdvancedView.clearResState();
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            boolean zB = com.mbridge.msdk.videocommon.download.b.getInstance().b(298, str2, campaignEx.isBidCampaign());
            if (zB) {
                mBNativeAdvancedView.setVideoReady(true);
            }
            z11 = zB;
        } else {
            mBNativeAdvancedView.setVideoReady(true);
            z11 = true;
        }
        if (!TextUtils.isEmpty(campaignEx.getendcard_url()) && !mBNativeAdvancedView.isEndCardReady() && !TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getendcard_url()))) {
            mBNativeAdvancedView.setEndCardReady(true);
        }
        if (!TextUtils.isEmpty(campaignEx.getAdZip()) && !mBNativeAdvancedView.isH5Ready()) {
            String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip());
            if (TextUtils.isEmpty(h5ResAddress)) {
                z11 = false;
            } else {
                if (com.mbridge.msdk.advanced.common.c.a(str + str2 + campaignEx.getRequestId())) {
                    mBNativeAdvancedView.setH5Ready(true);
                } else {
                    a(mBNativeAdvancedView, h5ResAddress, campaignEx, str, str2, i10);
                    if (!z10) {
                        z11 = false;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml()) && !mBNativeAdvancedView.isH5Ready()) {
            String strA = a(campaignEx.getAdHtml());
            if (!TextUtils.isEmpty(strA)) {
                if (com.mbridge.msdk.advanced.common.c.a(str + str2 + campaignEx.getRequestId())) {
                    mBNativeAdvancedView.setH5Ready(true);
                    if (campaignEx.isMraid()) {
                        mBNativeAdvancedView.setVideoReady(true);
                    }
                    return true;
                }
                a(mBNativeAdvancedView, strA, campaignEx, str, str2, i10);
                if (!z10) {
                }
            }
            return false;
        }
        return z11;
    }

    private static void a(MBNativeAdvancedView mBNativeAdvancedView, String str, CampaignEx campaignEx, String str2, String str3, int i10) {
        if (mBNativeAdvancedView == null || mBNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        com.mbridge.msdk.advanced.report.a.b(str3, campaignEx);
        com.mbridge.msdk.advanced.signal.b bVar = new com.mbridge.msdk.advanced.signal.b(mBNativeAdvancedView.getContext(), str2, str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        bVar.a(arrayList);
        bVar.a(i10);
        mBNativeAdvancedView.setAdvancedNativeSignalCommunicationImpl(bVar);
        MBNativeAdvancedWebview advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview();
        long jCurrentTimeMillis = System.currentTimeMillis();
        advancedNativeWebview.setWebViewListener(new a(str2, str3, campaignEx, mBNativeAdvancedView, jCurrentTimeMillis));
        if (!advancedNativeWebview.isDestoryed()) {
            q0.a(f28220a, "======开始渲染：" + str);
            new Handler(Looper.getMainLooper()).post(new b(advancedNativeWebview, str));
            return;
        }
        mBNativeAdvancedView.setH5Ready(false);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, str3, "webview had destory", jCurrentTimeMillis, 3);
    }

    private static String a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            return "file:///" + file.getAbsolutePath();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Exception e10) {
                e10.getMessage();
                return "";
            }
        }
    }

    public static boolean a(MBNativeAdvancedView mBNativeAdvancedView, CampaignEx campaignEx, String str, String str2) {
        boolean zA;
        boolean z10 = false;
        if (mBNativeAdvancedView == null) {
            q0.b(f28220a, "mbAdvancedNativeView  is null");
            return false;
        }
        if (TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            zA = true;
        } else {
            zA = mBNativeAdvancedView.isVideoReady();
            q0.b(f28220a, "======isReady isVideoReady:" + zA);
        }
        if (zA && !TextUtils.isEmpty(campaignEx.getAdZip())) {
            zA = com.mbridge.msdk.advanced.common.c.a(str + str2 + campaignEx.getRequestId());
            q0.b(f28220a, "======isReady getAdZip:" + zA);
        }
        if (zA && TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml())) {
            zA = com.mbridge.msdk.advanced.common.c.a(str + str2 + campaignEx.getRequestId());
            q0.b(f28220a, "======isReady getAdHtml:" + zA);
        }
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
            q0.b(f28220a, "======isReady getAdHtml  getAdZip all are empty");
        } else {
            z10 = zA;
        }
        if (!z10 || TextUtils.isEmpty(campaignEx.getendcard_url())) {
            return z10;
        }
        boolean zIsEndCardReady = mBNativeAdvancedView.isEndCardReady();
        q0.b(f28220a, "======isReady isEndCardReady:" + zIsEndCardReady);
        return zIsEndCardReady;
    }

    public static void a(CampaignEx campaignEx, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        if (f28222c == null) {
            f28222c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        f28222c.a(arrayList, str);
    }

    public static void a(long j10, String str) {
        if (f28222c == null) {
            f28222c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        f28222c.a(j10, str);
    }
}
