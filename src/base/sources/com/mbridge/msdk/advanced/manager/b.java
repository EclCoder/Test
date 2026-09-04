package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static String f28148z = "NativeAdvancedLoadManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.b f28152d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBNativeAdvancedView f28154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.setting.l f28155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f28156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CampaignEx f28157i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f28158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f28159k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f28160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f28161m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f28162n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f28163o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f28164p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f28165q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f28166r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f28167s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f28168t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f28169u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f28170v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f28171w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Handler f28172x = new e(Looper.getMainLooper());

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Runnable f28173y = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f28153e = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f28174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28175b;

        a(CampaignEx campaignEx, int i10) {
            this.f28174a = campaignEx;
            this.f28175b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            q0.a(b.f28148z, "zip 下载失败： " + str2 + " " + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f28174a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 3);
            messageObtain.obj = bundle;
            b.this.f28172x.sendMessage(messageObtain);
            b.this.a(this.f28174a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            q0.a(b.f28148z, "zip 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f28174a;
            messageObtain.arg1 = this.f28175b;
            b.this.f28172x.sendMessage(messageObtain);
            if (z10) {
                return;
            }
            b.this.a(this.f28174a, str, true, "");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0365b extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f28177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f28179c;

        C0365b(CampaignEx campaignEx, int i10, long j10) {
            this.f28177a = campaignEx;
            this.f28178b = i10;
            this.f28179c = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) throws Throwable {
            super.a(webView, i10);
            q0.b("NativeAdvancedLoadManager", "=========readyState: " + i10);
            if (i10 != 1) {
                b.this.a(this.f28177a, "readyState 2", this.f28178b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f28177a, b.this.f28149a, "readyState 2", this.f28179c, 3);
                return;
            }
            b.this.f28154f.setH5Ready(true);
            com.mbridge.msdk.advanced.common.c.a(b.this.f28150b + b.this.f28149a + this.f28177a.getRequestId(), true);
            b.this.h(this.f28177a, this.f28178b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f28177a, b.this.f28149a, "", this.f28179c, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            q0.b("NativeAdvancedLoadManager", "onPageFinished");
            if (!this.f28177a.isHasMBTplMark()) {
                b.this.f28154f.setH5Ready(true);
                q0.b("NativeAdvancedLoadManager", "=======onPageFinished OK");
                com.mbridge.msdk.advanced.common.c.a(b.this.f28150b + b.this.f28149a + this.f28177a.getRequestId(), true);
                b.this.h(this.f28177a, this.f28178b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f28177a, b.this.f28149a, "", this.f28179c, 1);
            }
            com.mbridge.msdk.advanced.signal.a.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) throws Throwable {
            super.onReceivedError(webView, i10, str, str2);
            q0.b("NativeAdvancedLoadManager", "onReceivedError： " + i10 + "  " + str + "  " + str2);
            b.this.a(this.f28177a, str, this.f28178b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f28177a, b.this.f28149a, "error code:" + i10 + str, this.f28179c, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) throws Throwable {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            q0.b("NativeAdvancedLoadManager", "onReceivedSslError: " + sslError.getPrimaryError());
            b.this.a(this.f28177a, "onReceivedSslError:" + sslError.getUrl(), this.f28178b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f28177a, b.this.f28149a, "error url:" + sslError.getUrl(), this.f28179c, 3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedWebview f28181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28182b;

        c(MBNativeAdvancedWebview mBNativeAdvancedWebview, String str) {
            this.f28181a = mBNativeAdvancedWebview;
            this.f28182b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28181a.loadUrl(this.f28182b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends Handler {
        e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            int i10;
            Object obj;
            super.handleMessage(message);
            int i11 = message.what;
            if (i11 == 1) {
                Object obj2 = message.obj;
                int i12 = message.arg1;
                if (obj2 == null || !(obj2 instanceof CampaignEx)) {
                    return;
                }
                CampaignEx campaignEx = (CampaignEx) obj2;
                b.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i12);
                return;
            }
            if (i11 == 2) {
                Object obj3 = message.obj;
                try {
                    if (obj3 instanceof Bundle) {
                        int i13 = ((Bundle) obj3).getInt("type");
                        if (i13 == 1) {
                            i10 = 880004;
                        } else if (i13 == 2) {
                            i10 = 880007;
                        } else {
                            i10 = i13 == 3 ? 880006 : 880024;
                        }
                        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i10);
                        String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                        CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                        bVar.c(string);
                        bVar.a(campaignEx2);
                        b bVar2 = b.this;
                        bVar2.a(bVar, bVar2.f28162n, b.this.f28163o, campaignEx2);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    com.mbridge.msdk.foundation.error.b bVar3 = new com.mbridge.msdk.foundation.error.b(880000);
                    bVar3.a((Throwable) e10);
                    b bVar4 = b.this;
                    bVar4.a(bVar3, bVar4.f28162n, b.this.f28163o, (CampaignEx) null);
                    return;
                }
            }
            if (i11 == 3) {
                Object obj4 = message.obj;
                if (obj4 == null || !(obj4 instanceof CampaignEx)) {
                    return;
                }
                b bVar5 = b.this;
                bVar5.i((CampaignEx) obj4, bVar5.f28163o);
                return;
            }
            if (i11 != 4) {
                if (i11 == 5 && (obj = message.obj) != null && (obj instanceof CampaignEx)) {
                    if (b.this.f28154f != null) {
                        b.this.f28154f.setVideoReady(true);
                    }
                    b bVar6 = b.this;
                    bVar6.i((CampaignEx) obj, bVar6.f28163o);
                    return;
                }
                return;
            }
            Object obj5 = message.obj;
            if (obj5 == null || !(obj5 instanceof CampaignEx)) {
                return;
            }
            if (b.this.f28154f != null) {
                b.this.f28154f.setEndCardReady(true);
            }
            b bVar7 = b.this;
            bVar7.i((CampaignEx) obj5, bVar7.f28163o);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880010);
            b bVar2 = b.this;
            bVar2.a(bVar, bVar2.f28162n, b.this.f28163o, (CampaignEx) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g extends com.mbridge.msdk.advanced.request.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f28188e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f28189f;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Exception f28191a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f28192b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f28193c;

            a(Exception exc, int i10, CampaignUnit campaignUnit) {
                this.f28191a = exc;
                this.f28192b = i10;
                this.f28193c = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
                bVar.a((Throwable) this.f28191a);
                g gVar = g.this;
                b bVar2 = b.this;
                String str = gVar.f28188e;
                int i10 = this.f28192b;
                CampaignUnit campaignUnit = this.f28193c;
                bVar2.a(bVar, str, i10, (campaignUnit == null || campaignUnit.getAds() == null || this.f28193c.getAds().size() == 0) ? null : this.f28193c.getAds().get(0));
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$g$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0366b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f28195a;

            RunnableC0366b(String str) {
                this.f28195a = str;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
                bVar.c(this.f28195a);
                g gVar = g.this;
                b.this.a(bVar, gVar.f28188e, gVar.f28189f, (CampaignEx) null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, String str, int i11) {
            super(i10);
            this.f28188e = str;
            this.f28189f = i11;
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void a(CampaignUnit campaignUnit, int i10) throws Throwable {
            try {
                b bVar = b.this;
                bVar.a(campaignUnit, i10, bVar.f28149a, this.f28188e);
                b.this.f28171w = campaignUnit.getRequestId();
                b.this.f28156h = campaignUnit.getAds();
            } catch (Exception e10) {
                q0.b(b.f28148z, e10.getMessage());
                q0.c(b.f28148z, "onLoadCompaginSuccess 数据刚请求失败");
                if (b.this.f28172x != null) {
                    b.this.f28172x.post(new a(e10, i10, campaignUnit));
                }
                b.this.f();
            }
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void b(int i10, String str) {
            q0.b(b.f28148z, str);
            q0.c(b.f28148z, "onLoadCompaginFailed load failed errorCode:" + i10 + " msg:" + str);
            if (b.this.f28172x != null) {
                b.this.f28172x.post(new RunnableC0366b(str));
            }
            b.this.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h extends com.mbridge.msdk.foundation.same.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f28197a;

        h(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f28197a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.advanced.report.a.a(str, cVar, this.f28197a, b.this.f28153e, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f28199a;

        i(CampaignEx campaignEx) {
            this.f28199a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(b.this.f28153e)).d();
            y.a(b.this.f28153e, this.f28199a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class j implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f28201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28202b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.f28201a, jVar.f28202b);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$j$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0367b implements Runnable {
            RunnableC0367b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.f28201a, jVar.f28202b);
            }
        }

        j(CampaignEx campaignEx, int i10) {
            this.f28201a = campaignEx;
            this.f28202b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.a(b.f28148z, "gifurl 下载失败： " + str2);
            if (b.this.f28172x != null) {
                b.this.f28172x.post(new RunnableC0367b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            q0.a(b.f28148z, "giturl 下载成功： " + str);
            if (b.this.f28172x != null) {
                b.this.f28172x.post(new a());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class k implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f28206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28207b;

        k(CampaignEx campaignEx, int i10) {
            this.f28206a = campaignEx;
            this.f28207b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            q0.a(b.f28148z, "endcard 下载失败： " + str2);
            if (b.this.f28154f != null) {
                b.this.f28154f.setEndCardReady(false);
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f28206a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            b.this.f28172x.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            q0.a(b.f28148z, "endcard 下载成功： " + str);
            if (b.this.f28172x != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.obj = this.f28206a;
                messageObtain.arg1 = this.f28207b;
                b.this.f28172x.sendMessage(messageObtain);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class l implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f28209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28210b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.f28209a, lVar.f28210b);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$l$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0368b implements Runnable {
            RunnableC0368b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.f28209a, lVar.f28210b);
            }
        }

        l(CampaignEx campaignEx, int i10) {
            this.f28209a = campaignEx;
            this.f28210b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.a(b.f28148z, "image 下载失败： " + str2);
            if (b.this.f28172x != null) {
                b.this.f28172x.post(new RunnableC0368b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            q0.a(b.f28148z, "image 下载成功： " + str);
            if (b.this.f28172x != null) {
                b.this.f28172x.post(new a());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f28214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f28215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28216c;

        m(File file, CampaignEx campaignEx, int i10) {
            this.f28214a = file;
            this.f28215b = campaignEx;
            this.f28216c = i10;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.a("file:////" + this.f28214a.getAbsolutePath(), this.f28215b, this.f28216c);
        }
    }

    public b(String str, String str2, long j10) {
        this.f28150b = str;
        this.f28149a = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(CampaignEx campaignEx, int i10) {
        if (!com.mbridge.msdk.advanced.manager.d.a(this.f28154f, campaignEx, this.f28150b, this.f28149a) || this.f28165q) {
            return;
        }
        b();
        com.mbridge.msdk.advanced.manager.d.a(campaignEx, this.f28149a);
        this.f28165q = true;
        com.mbridge.msdk.advanced.middle.b bVar = this.f28152d;
        if (bVar != null) {
            bVar.a(campaignEx, i10);
        }
    }

    private void j(CampaignEx campaignEx, int i10) throws Throwable {
        this.f28157i = campaignEx;
        if (com.mbridge.msdk.advanced.manager.d.a(this.f28154f, campaignEx, this.f28150b, this.f28149a)) {
            i(campaignEx, i10);
        } else {
            e(campaignEx, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f28170v = 0;
    }

    private void g() {
        try {
            int i10 = this.f28170v + 1;
            this.f28170v = i10;
            com.mbridge.msdk.setting.l lVar = this.f28155g;
            if (lVar == null || i10 > lVar.y()) {
                q0.c(f28148z, "onload 重置offset为0");
                this.f28170v = 0;
            }
            q0.c(f28148z, "onload 算出 下次的offset是:" + this.f28170v);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(CampaignEx campaignEx, int i10) {
        if (this.f28154f.isH5Ready()) {
            i(campaignEx, i10);
            com.mbridge.msdk.advanced.report.a.a(1, "", this.f28149a, campaignEx);
        }
    }

    public String c() {
        return com.mbridge.msdk.foundation.same.c.b(this.f28156h);
    }

    public String d() {
        return this.f28171w;
    }

    public void e() {
        if (this.f28152d != null) {
            this.f28152d = null;
        }
        if (this.f28166r != null) {
            this.f28166r = null;
        }
        if (this.f28167s != null) {
            this.f28167s = null;
        }
    }

    private void c(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getImageUrl(), new l(campaignEx, i10));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d5 A[Catch: all -> 0x00b7, Exception -> 0x0130, TRY_ENTER, TryCatch #0 {Exception -> 0x0130, blocks: (B:43:0x00d5, B:45:0x00d9, B:47:0x00df, B:49:0x00e5, B:51:0x00eb, B:53:0x00fd, B:54:0x0106, B:33:0x00b3), top: B:80:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00df A[Catch: all -> 0x00b7, Exception -> 0x0130, TryCatch #0 {Exception -> 0x0130, blocks: (B:43:0x00d5, B:45:0x00d9, B:47:0x00df, B:49:0x00e5, B:51:0x00eb, B:53:0x00fd, B:54:0x0106, B:33:0x00b3), top: B:80:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0106 A[Catch: all -> 0x00b7, Exception -> 0x0130, TRY_LEAVE, TryCatch #0 {Exception -> 0x0130, blocks: (B:43:0x00d5, B:45:0x00d9, B:47:0x00df, B:49:0x00e5, B:51:0x00eb, B:53:0x00fd, B:54:0x0106, B:33:0x00b3), top: B:80:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:56:0x011e A[Catch: IOException -> 0x0122, TRY_ENTER, TRY_LEAVE, TryCatch #11 {IOException -> 0x0122, blocks: (B:69:0x013c, B:56:0x011e), top: B:80:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:69:0x013c A[Catch: IOException -> 0x0122, TRY_ENTER, TRY_LEAVE, TryCatch #11 {IOException -> 0x0122, blocks: (B:69:0x013c, B:56:0x011e), top: B:80:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:84:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    private void d(CampaignEx campaignEx, int i10) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th2;
        File file;
        Exception e10;
        Exception e11;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    try {
                        try {
                            com.mbridge.msdk.foundation.same.report.g.a("m_download_start", campaignEx, "", this.f28149a, "8");
                            File file2 = new File(campaignEx.getAdHtml());
                            try {
                                try {
                                    if (!file2.exists()) {
                                        String strB = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
                                        String md5 = SameMD5.getMD5(c1.b(campaignEx.getAdHtml()));
                                        if (TextUtils.isEmpty(md5)) {
                                            md5 = String.valueOf(System.currentTimeMillis());
                                        }
                                        file = new File(strB, md5.concat(".html"));
                                        try {
                                            if (!file.exists()) {
                                                fileOutputStream = new FileOutputStream(file);
                                                try {
                                                    String strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, "<script>" + com.mbridge.msdk.setting.util.a.a().b() + "</script>" + campaignEx.getAdHtml());
                                                    if (campaignEx.isActiveOm()) {
                                                        strInjectScriptContentIntoHtml = com.mbridge.msdk.omsdk.b.a(strInjectScriptContentIntoHtml);
                                                    }
                                                    fileOutputStream.write(strInjectScriptContentIntoHtml.getBytes());
                                                    fileOutputStream.flush();
                                                    fileOutputStream2 = fileOutputStream;
                                                } catch (Exception e12) {
                                                    e10 = e12;
                                                    FileOutputStream fileOutputStream3 = fileOutputStream;
                                                    e11 = e10;
                                                    fileOutputStream2 = fileOutputStream3;
                                                    file2 = file;
                                                    e11.printStackTrace();
                                                    campaignEx.setMraid("");
                                                    com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e11.getMessage(), this.f28149a, "8");
                                                    if (fileOutputStream2 != null) {
                                                        fileOutputStream2.close();
                                                    }
                                                    file = file2;
                                                    if (!file.exists()) {
                                                        q0.a(f28148z, "渲染 HTML 失败： html file write failed");
                                                        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880013);
                                                        a(bVar, this.f28162n, i10, campaignEx);
                                                        a(bVar, this.f28162n, i10, campaignEx);
                                                    } else {
                                                        q0.a(f28148z, "渲染 HTML 失败： html file write failed");
                                                        com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880013);
                                                        a(bVar2, this.f28162n, i10, campaignEx);
                                                        a(bVar2, this.f28162n, i10, campaignEx);
                                                    }
                                                    if (fileOutputStream2 != null) {
                                                        fileOutputStream2.close();
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    if (fileOutputStream != null) {
                                                        try {
                                                            fileOutputStream.close();
                                                        } catch (Exception unused) {
                                                            fileOutputStream2 = fileOutputStream;
                                                            a(new com.mbridge.msdk.foundation.error.b(880013), this.f28162n, i10, campaignEx);
                                                            if (fileOutputStream2 == null) {
                                                                fileOutputStream2.close();
                                                            }
                                                            return;
                                                        } catch (Throwable th4) {
                                                            th2 = th4;
                                                            fileOutputStream2 = fileOutputStream;
                                                            if (fileOutputStream2 != null) {
                                                                try {
                                                                    fileOutputStream2.close();
                                                                } catch (IOException e13) {
                                                                    q0.b(f28148z, e13.getMessage());
                                                                }
                                                            }
                                                            throw th2;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } catch (Exception e14) {
                                            e11 = e14;
                                            file2 = file;
                                            e11.printStackTrace();
                                            campaignEx.setMraid("");
                                            com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e11.getMessage(), this.f28149a, "8");
                                            if (fileOutputStream2 != null) {
                                                fileOutputStream2.close();
                                            }
                                            file = file2;
                                        }
                                        if (!file.exists() && file.isFile() && file.canRead()) {
                                            campaignEx.setAdHtml(file.getAbsolutePath());
                                            q0.a(f28148z, "开始渲染 HTML： ");
                                            Handler handler = this.f28172x;
                                            if (handler != null) {
                                                handler.post(new m(file, campaignEx, i10));
                                            }
                                        } else {
                                            q0.a(f28148z, "渲染 HTML 失败： html file write failed");
                                            com.mbridge.msdk.foundation.error.b bVar3 = new com.mbridge.msdk.foundation.error.b(880013);
                                            a(bVar3, this.f28162n, i10, campaignEx);
                                            a(bVar3, this.f28162n, i10, campaignEx);
                                        }
                                        if (fileOutputStream2 != null) {
                                            fileOutputStream2.close();
                                        }
                                    }
                                    file = file2;
                                    com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, "", this.f28149a, "8");
                                    if (fileOutputStream2 != null) {
                                        fileOutputStream2.close();
                                    }
                                } catch (Exception e15) {
                                    fileOutputStream = fileOutputStream2;
                                    e10 = e15;
                                    FileOutputStream fileOutputStream4 = fileOutputStream;
                                    e11 = e10;
                                    fileOutputStream2 = fileOutputStream4;
                                    file2 = file;
                                    e11.printStackTrace();
                                    campaignEx.setMraid("");
                                    com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e11.getMessage(), this.f28149a, "8");
                                    if (fileOutputStream2 != null) {
                                        fileOutputStream2.close();
                                    }
                                    file = file2;
                                }
                            } catch (Exception e16) {
                                e11 = e16;
                                e11.printStackTrace();
                                campaignEx.setMraid("");
                                com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e11.getMessage(), this.f28149a, "8");
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                                file = file2;
                            }
                        } catch (Exception unused2) {
                            a(new com.mbridge.msdk.foundation.error.b(880013), this.f28162n, i10, campaignEx);
                            if (fileOutputStream2 == null) {
                                return;
                            } else {
                                fileOutputStream2.close();
                            }
                        }
                    } catch (Exception e17) {
                        file = null;
                        e10 = e17;
                        fileOutputStream = null;
                    }
                    if (!file.exists()) {
                        q0.a(f28148z, "渲染 HTML 失败： html file write failed");
                        com.mbridge.msdk.foundation.error.b bVar4 = new com.mbridge.msdk.foundation.error.b(880013);
                        a(bVar4, this.f28162n, i10, campaignEx);
                        a(bVar4, this.f28162n, i10, campaignEx);
                    } else {
                        q0.a(f28148z, "渲染 HTML 失败： html file write failed");
                        com.mbridge.msdk.foundation.error.b bVar5 = new com.mbridge.msdk.foundation.error.b(880013);
                        a(bVar5, this.f28162n, i10, campaignEx);
                        a(bVar5, this.f28162n, i10, campaignEx);
                    }
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                    throw th2;
                }
            } catch (IOException e18) {
                q0.b(f28148z, e18.getMessage());
            }
        } catch (Throwable th6) {
            th = th6;
            fileOutputStream = null;
        }
    }

    private void f(CampaignEx campaignEx, int i10) {
        this.f28166r = new d(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f28153e, this.f28149a, copyOnWriteArrayList, 298, this.f28166r);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(298, this.f28149a, campaignEx.isBidCampaign())) {
            q0.a(f28148z, " load Video");
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f28149a);
        } else {
            q0.a(f28148z, " load Video isReady true");
            this.f28154f.setVideoReady(true);
            i(campaignEx, i10);
        }
    }

    public void b(String str, int i10) throws Throwable {
        String str2;
        CampaignEx campaignExA;
        List<Integer> listC;
        this.f28165q = false;
        this.f28162n = str;
        this.f28163o = i10;
        this.f28157i = null;
        if (this.f28154f == null) {
            a(new com.mbridge.msdk.foundation.error.b(880030), str, i10, (CampaignEx) null);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f28154f, this.f28150b, this.f28149a, str, this.f28158j, false, false);
            str2 = str;
        } else {
            str2 = str;
            campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f28154f, this.f28150b, this.f28149a, str2, this.f28158j, false, true);
        }
        long timestamp = campaignExA != null ? campaignExA.getTimestamp() : 0L;
        com.mbridge.msdk.setting.l lVar = this.f28155g;
        if (lVar != null && lVar.t() == 1 && this.f28154f != null && campaignExA != null) {
            j(campaignExA, i10);
            return;
        }
        this.f28164p = false;
        com.mbridge.msdk.setting.l lVar2 = this.f28155g;
        if (lVar2 != null && (listC = lVar2.c()) != null && listC.size() > 0) {
            this.f28151c = listC.get(0).intValue() * 1000;
        } else {
            this.f28151c = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        }
        q0.a(f28148z, "开始从V3请求新的 offer，超时 ：" + this.f28151c);
        if (this.f28155g == null || timestamp <= 0 || !TextUtils.isEmpty(str2)) {
            a(this.f28151c);
            a(this.f28153e, str2, i10);
        } else if (System.currentTimeMillis() - timestamp > this.f28155g.v() * 1000) {
            a(this.f28151c);
            a(this.f28153e, str2, i10);
        } else {
            j(campaignExA, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f28184a;

        d(CampaignEx campaignEx) {
            this.f28184a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            q0.a(b.f28148z, "Video 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f28184a;
            messageObtain.what = 5;
            b.this.f28172x.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            q0.a(b.f28148z, "Video 下载失败： " + str);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f28184a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            b.this.f28172x.sendMessage(messageObtain);
        }
    }

    private void e(CampaignEx campaignEx, int i10) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f28154f;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            q0.a(f28148z, "开始下载zip： " + campaignEx.getAdZip());
            g(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            q0.a(f28148z, "开始下载HTML： " + campaignEx.getAdHtml());
            d(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            q0.a(f28148z, "开始下载Video： " + campaignEx.getVideoUrlEncode());
            f(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
            q0.a(f28148z, "开始下载image： " + campaignEx.getImageUrl());
            c(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
            q0.a(f28148z, "开始下载EndCard： " + campaignEx.getendcard_url());
            a(campaignEx, i10);
        }
        if (TextUtils.isEmpty(campaignEx.getGifUrl())) {
            return;
        }
        q0.a(f28148z, "开始下载gitUrl： " + campaignEx.getGifUrl());
        b(campaignEx, i10);
    }

    private void g(CampaignEx campaignEx, int i10) {
        String adZip;
        this.f28167s = new a(campaignEx, i10);
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        int i11 = 0;
        if (campaignEx != null) {
            i11 = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            adZip = campaignEx.getAdZip();
        } else {
            adZip = "";
        }
        cVar.f(i11);
        cVar.e(2);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, adZip, this.f28167s);
    }

    public void a(com.mbridge.msdk.setting.l lVar) {
        this.f28155g = lVar;
    }

    public void a(MBNativeAdvancedView mBNativeAdvancedView) {
        this.f28154f = mBNativeAdvancedView;
    }

    public void a(int i10) {
        this.f28158j = i10;
    }

    public void a(int i10, int i11) {
        this.f28161m = i10;
        this.f28160l = i11;
    }

    private void a(long j10) {
        this.f28172x.postDelayed(this.f28173y, j10);
    }

    private void a(Context context, String str, int i10) throws Throwable {
        Exception exc;
        String str2;
        try {
            if (context == null) {
                a(new com.mbridge.msdk.foundation.error.b(880025), str, i10, (CampaignEx) null);
                return;
            }
            try {
                if (a1.a(this.f28149a)) {
                    a(new com.mbridge.msdk.foundation.error.b(880032), str, i10, (CampaignEx) null);
                    return;
                }
                try {
                    com.mbridge.msdk.advanced.manager.d.b(this.f28149a);
                } catch (Throwable th2) {
                    q0.b(f28148z, th2.getMessage());
                }
                q0.c(f28148z, "load 开始准备请求参数");
                MBridgeIds mBridgeIds = new MBridgeIds(this.f28150b, this.f28149a);
                com.mbridge.msdk.advanced.request.f fVar = new com.mbridge.msdk.advanced.request.f();
                fVar.d(i10);
                fVar.c(this.f28170v);
                fVar.a(this.f28169u);
                fVar.b(this.f28161m);
                fVar.a(this.f28160l);
                com.mbridge.msdk.foundation.same.net.wrapper.e eVarB = com.mbridge.msdk.advanced.request.e.b(context, mBridgeIds, fVar);
                if (eVarB == null) {
                    q0.c(f28148z, "load 请求参数为空 load失败");
                    a(new com.mbridge.msdk.foundation.error.b(880001), str, i10, (CampaignEx) null);
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    eVarB.a(BidResponsed.KEY_TOKEN, str);
                }
                String strD = v0.d(this.f28149a);
                if (!TextUtils.isEmpty(strD)) {
                    eVarB.a("j", strD);
                }
                str2 = str;
                try {
                    new com.mbridge.msdk.advanced.request.c(context).choiceV3OrV5BySetting(1, eVarB, a(str, i10), str2, com.mbridge.msdk.foundation.same.c.a(this.f28151c, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                    return;
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                str2 = str;
            }
            exc = e;
            q0.b(f28148z, exc.getMessage());
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880020);
            bVar.a((Throwable) exc);
            a(bVar, str2, i10, (CampaignEx) null);
            f();
        } catch (Exception e12) {
            exc = e12;
            str2 = str;
        }
    }

    private void b() {
        this.f28172x.removeCallbacks(this.f28173y);
    }

    private void b(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getGifUrl(), new j(campaignEx, i10));
    }

    private com.mbridge.msdk.advanced.request.b a(String str, int i10) {
        g gVar = new g(i10, str, i10);
        gVar.a(str);
        gVar.setUnitId(this.f28149a);
        gVar.setPlacementId(this.f28150b);
        gVar.setAdType(298);
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit, int i10, String str, String str2) throws Throwable {
        String str3;
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 298);
        if (!TextUtils.isEmpty(str2)) {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        }
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            str3 = str2;
        } else {
            str3 = str2;
            campaignUnit.setLocalRequestId(com.mbridge.msdk.foundation.same.report.metrics.d.b().a(i10 == 1, str3, eVar, campaignUnit.getAds().get(0), str).t());
        }
        List<CampaignEx> listA = a(campaignUnit);
        if (listA != null && listA.size() > 0) {
            g();
            q0.c(f28148z, "onload load成功 size:" + listA.size());
            CampaignEx campaignEx = listA.get(0);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
                campaignEx.setHasMBTplMark(false);
                campaignEx.setIsMraid(true);
            } else {
                campaignEx.setHasMBTplMark(true);
                campaignEx.setIsMraid(false);
            }
            j(campaignEx, i10);
            return;
        }
        q0.c(f28148z, "onload load失败 返回的compaign没有可以用的");
        a(new com.mbridge.msdk.foundation.error.b(880033), str3, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
    }

    private List<CampaignEx> a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setLocalRequestId(campaignUnit.getLocalRequestId());
        campaignEx.setCampaignUnitId(this.f28149a);
        a(campaignEx);
        this.f28169u = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (v0.c(campaignEx)) {
                campaignEx.setRtinsType(v0.c(this.f28153e, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (com.mbridge.msdk.foundation.same.c.b(this.f28153e, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                v0.a(this.f28149a, campaignEx, com.mbridge.msdk.foundation.same.a.f30502x);
            }
            a(campaignEx, (com.mbridge.msdk.foundation.same.report.metrics.c) null, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f28153e, cVar, new h(campaignEx, aVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new i(campaignEx)).start();
    }

    public void a(com.mbridge.msdk.advanced.middle.b bVar) {
        this.f28152d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, String str, int i10, CampaignEx campaignEx) throws Throwable {
        if (this.f28164p) {
            this.f28164p = false;
            a(bVar, i10, str);
        } else {
            if (bVar != null) {
                bVar.a(campaignEx);
            }
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, String str) throws Throwable {
        CampaignEx campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f28154f, this.f28150b, this.f28149a, str, this.f28158j, true, true);
        if (campaignExA != null) {
            q0.b(f28148z, "load failed cache ");
            j(campaignExA, i10);
        } else {
            a(bVar, i10, campaignExA);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, CampaignEx campaignEx) {
        if (this.f28165q) {
            return;
        }
        b();
        if (bVar != null) {
            q0.b(f28148z, "real failed: " + bVar.l());
        }
        this.f28165q = true;
        com.mbridge.msdk.advanced.middle.b bVar2 = this.f28152d;
        if (bVar2 != null) {
            bVar2.a(bVar, i10);
        }
    }

    private void a(CampaignEx campaignEx, int i10) {
        String str;
        this.f28168t = new k(campaignEx, i10);
        int i11 = 0;
        if (campaignEx != null) {
            i11 = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            str = campaignEx.getendcard_url();
        } else {
            str = "";
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        cVar.f(i11);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, str, this.f28168t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx, int i10) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f28154f;
        if (mBNativeAdvancedView == null || mBNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        com.mbridge.msdk.advanced.report.a.b(this.f28149a, campaignEx);
        com.mbridge.msdk.advanced.signal.b bVar = new com.mbridge.msdk.advanced.signal.b(this.f28154f.getContext(), this.f28150b, this.f28149a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        bVar.a(arrayList);
        bVar.a(this.f28158j);
        bVar.b(this.f28159k);
        this.f28154f.setAdvancedNativeSignalCommunicationImpl(bVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        MBNativeAdvancedWebview advancedNativeWebview = this.f28154f.getAdvancedNativeWebview();
        if (advancedNativeWebview == null) {
            a(campaignEx, "webview is null", i10);
            return;
        }
        if (advancedNativeWebview.isDestoryed()) {
            a(campaignEx, "webview is destroyed", i10);
            return;
        }
        advancedNativeWebview.setWebViewListener(new C0365b(campaignEx, i10, jCurrentTimeMillis));
        if (!advancedNativeWebview.isDestoryed()) {
            q0.b(f28148z, "=======开始渲染: " + str);
            Handler handler = this.f28172x;
            if (handler != null) {
                handler.post(new c(advancedNativeWebview, str));
                return;
            }
            return;
        }
        a(new com.mbridge.msdk.foundation.error.b(880031), this.f28162n, i10, campaignEx);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, this.f28149a, "webview had destory", jCurrentTimeMillis, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, int i10) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880009);
        bVar.c(str);
        a(bVar, this.f28162n, i10, campaignEx);
        com.mbridge.msdk.advanced.report.a.a(2, str, this.f28149a, campaignEx);
    }

    public String a(String str) {
        int iO;
        if (this.f28157i != null) {
            try {
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f28149a, this.f28157i.getId() + this.f28157i.getVideoUrlEncode() + this.f28157i.getBidToken());
                if (aVarA != null && (iO = aVarA.o()) == 5) {
                    String strP = aVarA.p();
                    if (new File(strP).exists()) {
                        q0.b(f28148z, "本地已下载完 拿本地播放地址：" + strP + " state：" + iO);
                        return strP;
                    }
                }
            } catch (Exception e10) {
                q0.b(f28148z, e10.getMessage());
            }
            return str;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, boolean z10, String str2) {
        try {
            n nVar = new n();
            nVar.e(2);
            nVar.j("m_download_end");
            if (campaignEx != null) {
                nVar.b(campaignEx.isMraid() ? n.N : n.O);
                nVar.o(campaignEx.getRequestIdNotice());
            }
            nVar.b("url", str);
            nVar.b("scenes", "1");
            if (z10) {
                nVar.d(1);
            } else {
                nVar.d(3);
                nVar.m(str2);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, campaignEx);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(f28148z, e10.getMessage());
            }
        }
    }
}
