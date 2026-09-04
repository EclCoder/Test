package com.mbridge.msdk.splash.manager;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
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
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class e {
    private static String A = "SplashLoadManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f32653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.splash.middle.b f32654e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MBSplashView f32656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f32657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f32658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f32660k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f32661l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f32662m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f32663n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f32664o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f32665p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f32666q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f32667r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f32668s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f32669t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f32671v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<CampaignEx> f32672w;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f32670u = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f32673x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Handler f32674y = new c(Looper.getMainLooper());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Runnable f32675z = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f32655f = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            int i10;
            super.handleMessage(message);
            int i11 = message.what;
            if (i11 == 1) {
                Object obj = message.obj;
                int i12 = message.arg1;
                if (obj instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) obj;
                    e.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i12);
                    return;
                }
                return;
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof CampaignEx) {
                    e eVar = e.this;
                    eVar.h((CampaignEx) obj2, eVar.f32663n);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            try {
                if (obj3 instanceof Bundle) {
                    int i13 = ((Bundle) obj3).getInt("type");
                    String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                    CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                    if (i13 == 1) {
                        i10 = 880004;
                    } else {
                        i10 = i13 == 2 ? 880006 : 880027;
                    }
                    com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i10);
                    bVar.c(string);
                    e eVar2 = e.this;
                    eVar2.a(bVar, eVar2.f32662m, e.this.f32663n, campaignEx2);
                }
            } catch (Exception e10) {
                com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880024);
                bVar2.a((Throwable) e10);
                e eVar3 = e.this;
                eVar3.a(bVar2, eVar3.f32662m, e.this.f32663n, (CampaignEx) null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880010);
            e eVar = e.this;
            eVar.a(bVar, eVar.f32662m, e.this.f32663n, (CampaignEx) null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class C0451e extends com.mbridge.msdk.splash.request.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f32683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f32684f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0451e(int i10, String str, int i11) {
            super(i10);
            this.f32683e = str;
            this.f32684f = i11;
        }

        @Override // com.mbridge.msdk.splash.request.b
        public void a(CampaignUnit campaignUnit, int i10) throws Throwable {
            try {
                e eVar = e.this;
                eVar.a(campaignUnit, i10, eVar.f32650a, this.f32683e);
                e.this.f32670u = campaignUnit.getRequestId();
                e.this.f32672w = campaignUnit.getAds();
            } catch (Exception e10) {
                e10.printStackTrace();
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
                bVar.a((Throwable) e10);
                e.this.a(bVar, this.f32683e, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
                e.this.f();
            }
        }

        @Override // com.mbridge.msdk.splash.request.b
        public void b(int i10, String str) throws Throwable {
            q0.b(e.A, str);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
            bVar.c(str);
            e.this.a(bVar, this.f32683e, this.f32684f, (CampaignEx) null);
            e.this.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class f extends com.mbridge.msdk.foundation.same.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f32686a;

        f(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f32686a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.splash.report.a.a(str, cVar, this.f32686a, e.this.f32655f, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f32688a;

        g(CampaignEx campaignEx) {
            this.f32688a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(e.this.f32655f)).d();
            y.a(e.this.f32655f, this.f32688a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class h implements com.mbridge.msdk.splash.view.nativeview.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f32690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32691b;

        h(CampaignEx campaignEx, int i10) {
            this.f32690a = campaignEx;
            this.f32691b = i10;
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.a
        public void a() {
            if (this.f32690a.isDynamicView() && e.this.f32656g != null) {
                e.this.f32656g.setImageReady(true);
                e.this.f(this.f32690a, this.f32691b);
            }
            e.this.h(this.f32690a, this.f32691b);
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.a
        public void b() throws Throwable {
            if (!this.f32690a.isDynamicView() || e.this.f32656g == null) {
                return;
            }
            e.this.f32656g.setImageReady(false);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880027);
            e eVar = e.this;
            eVar.a(bVar, eVar.f32662m, this.f32691b, this.f32690a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class i implements z.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f32693a;

        i(CampaignEx campaignEx) {
            this.f32693a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, String str2, String str3, String str4, boolean z10) {
            if (z10) {
                return;
            }
            e.this.a(this.f32693a, str, true, "");
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, DownloadError downloadError) {
            String message = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        message = downloadError.getException().getMessage();
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            e.this.a(this.f32693a, str, false, message);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class j implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f32695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32696b;

        j(CampaignEx campaignEx, int i10) {
            this.f32695a = campaignEx;
            this.f32696b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880006);
            e eVar = e.this;
            eVar.a(bVar, eVar.f32662m, this.f32696b, this.f32695a);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f32695a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            e.this.f32674y.sendMessage(messageObtain);
            e.this.a(this.f32695a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f32695a;
            messageObtain.arg1 = this.f32696b;
            e.this.f32674y.sendMessage(messageObtain);
            if (z10) {
                return;
            }
            CampaignEx campaignEx = this.f32695a;
            e.this.a(this.f32695a, campaignEx != null ? campaignEx.getAdZip() : "", true, "");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class k implements com.mbridge.msdk.splash.inter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f32698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32699b;

        k(CampaignEx campaignEx, int i10) {
            this.f32698a = campaignEx;
            this.f32699b = i10;
        }

        @Override // com.mbridge.msdk.splash.inter.a
        public void a(View view) {
            if (e.this.f32656g != null) {
                e.this.f32656g.setDynamicView(true);
                e.this.f32656g.setSplashNativeView(view);
                e.this.h(this.f32698a, this.f32699b);
            }
        }

        @Override // com.mbridge.msdk.splash.inter.a
        public void onError(String str) throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880034);
            bVar.c(str);
            e eVar = e.this;
            eVar.a(bVar, eVar.f32662m, this.f32699b, this.f32698a);
        }
    }

    public e(String str, String str2, long j10) {
        this.f32651b = str;
        this.f32650a = str2;
        this.f32653d = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(CampaignEx campaignEx, int i10) {
        if (!com.mbridge.msdk.splash.manager.d.a(this.f32656g, campaignEx) || this.f32665p) {
            return;
        }
        b();
        if (this.f32664o) {
            com.mbridge.msdk.splash.manager.d.a(campaignEx, this.f32650a);
        }
        this.f32665p = true;
        com.mbridge.msdk.splash.middle.b bVar = this.f32654e;
        if (bVar != null) {
            bVar.a(campaignEx, i10);
        }
    }

    private void i(CampaignEx campaignEx, int i10) throws Throwable {
        MBSplashView mBSplashView = this.f32656g;
        if (mBSplashView != null) {
            mBSplashView.setDynamicView(false);
        }
        if (campaignEx.isDynamicView()) {
            c(campaignEx, i10);
        } else {
            MBSplashView mBSplashView2 = this.f32656g;
            if (mBSplashView2 != null) {
                mBSplashView2.setSplashWebView();
            }
        }
        if (com.mbridge.msdk.splash.manager.d.a(this.f32656g, campaignEx)) {
            h(campaignEx, i10);
        } else {
            a(campaignEx, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a implements com.mbridge.msdk.splash.manager.g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f32676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32677b;

        a(CampaignEx campaignEx, int i10) {
            this.f32676a = campaignEx;
            this.f32677b = i10;
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void a() {
            if (this.f32676a.isHasMBTplMark()) {
                return;
            }
            e.this.g(this.f32676a, this.f32677b);
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void onError(String str) throws Throwable {
            e.this.a(str, this.f32677b, this.f32676a);
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void a(int i10) throws Throwable {
            if (i10 == 1) {
                e.this.g(this.f32676a, this.f32677b);
            } else {
                e.this.a("readyState 2", this.f32677b, this.f32676a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f32669t = 0;
    }

    private void g() {
        try {
            int i10 = this.f32669t + 1;
            this.f32669t = i10;
            l lVar = this.f32657h;
            if (lVar != null && i10 <= lVar.y()) {
                return;
            }
            this.f32669t = 0;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String d() {
        return this.f32670u;
    }

    public void e() {
        if (this.f32654e != null) {
            this.f32654e = null;
        }
        if (this.f32666q != null) {
            this.f32666q = null;
        }
        if (this.f32667r != null) {
            this.f32667r = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d2 A[Catch: Exception -> 0x011a, TRY_ENTER, TryCatch #3 {Exception -> 0x011a, blocks: (B:53:0x0116, B:54:0x0119, B:41:0x00d2, B:43:0x00d6, B:45:0x00dc, B:47:0x00e2, B:49:0x00e8, B:50:0x0108, B:33:0x00b3), top: B:59:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc A[Catch: Exception -> 0x011a, TryCatch #3 {Exception -> 0x011a, blocks: (B:53:0x0116, B:54:0x0119, B:41:0x00d2, B:43:0x00d6, B:45:0x00dc, B:47:0x00e2, B:49:0x00e8, B:50:0x0108, B:33:0x00b3), top: B:59:0x000a }] */
    private void d(CampaignEx campaignEx, int i10) throws Throwable {
        File file;
        Exception e10;
        FileOutputStream fileOutputStream;
        Exception e11;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    com.mbridge.msdk.foundation.same.report.g.a("m_download_start", campaignEx, "", this.f32650a, "6");
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
                                            com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e11.getMessage(), this.f32650a, "6");
                                            if (fileOutputStream2 != null) {
                                                fileOutputStream2.close();
                                            }
                                            file = file2;
                                            if (!file.exists()) {
                                            }
                                            a(new com.mbridge.msdk.foundation.error.b(880013), this.f32662m, i10, campaignEx);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Exception e13) {
                                    e11 = e13;
                                    file2 = file;
                                    e11.printStackTrace();
                                    campaignEx.setMraid("");
                                    com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e11.getMessage(), this.f32650a, "6");
                                    if (fileOutputStream2 != null) {
                                        fileOutputStream2.close();
                                    }
                                    file = file2;
                                }
                                if (!file.exists() && file.isFile() && file.canRead()) {
                                    campaignEx.setAdHtml(file.getAbsolutePath());
                                    a("file:////" + file.getAbsolutePath(), campaignEx, i10);
                                    return;
                                }
                                a(new com.mbridge.msdk.foundation.error.b(880013), this.f32662m, i10, campaignEx);
                            }
                            file = file2;
                            com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, "", this.f32650a, "6");
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                        } catch (Exception e14) {
                            fileOutputStream = fileOutputStream2;
                            e10 = e14;
                            FileOutputStream fileOutputStream4 = fileOutputStream;
                            e11 = e10;
                            fileOutputStream2 = fileOutputStream4;
                            file2 = file;
                            e11.printStackTrace();
                            campaignEx.setMraid("");
                            com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e11.getMessage(), this.f32650a, "6");
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            file = file2;
                        }
                    } catch (Exception e15) {
                        e11 = e15;
                        e11.printStackTrace();
                        campaignEx.setMraid("");
                        com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e11.getMessage(), this.f32650a, "6");
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        file = file2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (Exception e16) {
                file = null;
                e10 = e16;
                fileOutputStream = null;
            }
            if (!file.exists()) {
            }
            a(new com.mbridge.msdk.foundation.error.b(880013), this.f32662m, i10, campaignEx);
        } catch (Exception unused) {
            a(new com.mbridge.msdk.foundation.error.b(880013), this.f32662m, i10, campaignEx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(CampaignEx campaignEx, int i10) {
        if (campaignEx.isDynamicView()) {
            com.mbridge.msdk.splash.common.c.a aVar = new com.mbridge.msdk.splash.common.c.a();
            aVar.b(this.f32650a).a(this.f32651b).a(this.f32658i).a(campaignEx).c(this.f32659j).f(this.f32671v);
            try {
                if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
                    Uri uri = Uri.parse(campaignEx.getAdZip());
                    String queryParameter = uri.getQueryParameter("hdbtn");
                    String queryParameter2 = uri.getQueryParameter("alecfc");
                    String queryParameter3 = uri.getQueryParameter("hdinfo");
                    String queryParameter4 = uri.getQueryParameter("shake_show");
                    String queryParameter5 = uri.getQueryParameter("shake_strength");
                    String queryParameter6 = uri.getQueryParameter("shake_time");
                    String queryParameter7 = uri.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.e(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.a(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.g(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.h(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.i(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.d(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th2) {
                q0.b(A, th2.getMessage());
            }
            com.mbridge.msdk.splash.manager.c.a().a(this.f32656g, aVar.a(), new k(campaignEx, i10));
        }
    }

    public void b(int i10) {
        this.f32671v = i10;
    }

    public String c() {
        return com.mbridge.msdk.foundation.same.c.b(this.f32672w);
    }

    private void b() {
        this.f32674y.removeCallbacks(this.f32675z);
    }

    private void c(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.splash.manager.d.a(this.f32656g, campaignEx, new h(campaignEx, i10));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class b implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f32679a;

        b(CampaignEx campaignEx) {
            this.f32679a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            e.this.f32656g.setVideoReady(true);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f32679a;
            messageObtain.what = 3;
            e.this.f32674y.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) throws Throwable {
            e.this.f32656g.setVideoReady(false);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880004);
            bVar.c(str);
            e eVar = e.this;
            eVar.a(bVar, eVar.f32662m, e.this.f32663n, this.f32679a);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f32679a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            e.this.f32674y.sendMessage(messageObtain);
        }
    }

    private void b(CampaignEx campaignEx, int i10) {
        this.f32666q = new b(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f32655f, this.f32650a, copyOnWriteArrayList, 297, this.f32666q);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(297, this.f32650a, campaignEx.isBidCampaign())) {
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f32650a);
        } else {
            this.f32656g.setVideoReady(true);
            h(campaignEx, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(CampaignEx campaignEx, int i10) {
        if (this.f32656g.isH5Ready()) {
            return;
        }
        this.f32656g.setH5Ready(true);
        h(campaignEx, i10);
    }

    private void e(CampaignEx campaignEx, int i10) {
        if (campaignEx.isDynamicView()) {
            z.a(5, "", campaignEx.getAdZip(), new i(campaignEx), campaignEx);
            return;
        }
        this.f32667r = new j(campaignEx, i10);
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(297);
        cVar.e(2);
        cVar.a(campaignEx);
        cVar.f(campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getAdZip(), this.f32667r);
    }

    public void a(l lVar) {
        this.f32657h = lVar;
    }

    public void a(MBSplashView mBSplashView) {
        this.f32656g = mBSplashView;
    }

    public void a(boolean z10) {
        this.f32658i = z10;
    }

    public void a(int i10) {
        this.f32659j = i10;
    }

    public void a(int i10, int i11) {
        this.f32661l = i10;
        this.f32660k = i11;
    }

    public void a(String str, int i10) {
        this.f32665p = false;
        this.f32662m = str;
        this.f32663n = i10;
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f32656g, this.f32651b, this.f32650a, str, this.f32658i, this.f32659j, false, false);
        long timestamp = campaignExA != null ? campaignExA.getTimestamp() : 0L;
        if (this.f32657h.t() == 1 && i10 != 1 && campaignExA != null) {
            i(campaignExA, i10);
            return;
        }
        this.f32664o = true;
        if (i10 == 1) {
            List<Integer> listC = this.f32657h.c();
            if (listC != null && listC.size() > 0) {
                this.f32652c = listC.get(0).intValue() * 1000;
            } else {
                this.f32652c = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
            }
        } else {
            long j10 = this.f32653d;
            if (j10 <= 0) {
                this.f32652c = this.f32657h.E();
            } else {
                this.f32652c = j10;
            }
        }
        if (this.f32657h == null || timestamp <= 0 || !TextUtils.isEmpty(str)) {
            a(this.f32652c);
            a(this.f32655f, str, i10);
            return;
        }
        if (System.currentTimeMillis() - timestamp > this.f32657h.v() * 1000) {
            a(this.f32652c);
            a(this.f32655f, str, i10);
        } else {
            i(campaignExA, i10);
        }
    }

    private void a(long j10) {
        this.f32674y.postDelayed(this.f32675z, j10);
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
                if (a1.a(this.f32650a)) {
                    a(new com.mbridge.msdk.foundation.error.b(880032), str, i10, (CampaignEx) null);
                    return;
                }
                MBridgeIds mBridgeIds = new MBridgeIds(this.f32651b, this.f32650a);
                com.mbridge.msdk.splash.request.f fVar = new com.mbridge.msdk.splash.request.f();
                fVar.d(i10);
                fVar.c(this.f32669t);
                fVar.a(this.f32668s);
                fVar.b(this.f32661l);
                fVar.a(this.f32660k);
                com.mbridge.msdk.foundation.same.net.wrapper.e eVarB = com.mbridge.msdk.splash.request.e.b(context, mBridgeIds, fVar);
                if (eVarB == null) {
                    a(new com.mbridge.msdk.foundation.error.b(880001), str, i10, (CampaignEx) null);
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    eVarB.a(BidResponsed.KEY_TOKEN, str);
                }
                String strD = v0.d(this.f32650a);
                if (!TextUtils.isEmpty(strD)) {
                    eVarB.a("j", strD);
                }
                com.mbridge.msdk.splash.request.c cVar = new com.mbridge.msdk.splash.request.c(context);
                C0451e c0451e = new C0451e(i10, str, i10);
                c0451e.a(str);
                c0451e.setUnitId(this.f32650a);
                c0451e.setPlacementId(this.f32651b);
                c0451e.setAdType(297);
                str2 = str;
                try {
                    cVar.choiceV3OrV5BySetting(1, eVarB, c0451e, str2, com.mbridge.msdk.foundation.same.c.a(this.f32652c, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                    return;
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                str2 = str;
            }
            exc = e;
            q0.b(A, exc.getMessage());
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880020);
            bVar.a((Throwable) exc);
            a(bVar, str2, i10, (CampaignEx) null);
            f();
        } catch (Exception e12) {
            exc = e12;
            str2 = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit, int i10, String str, String str2) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar;
        List<CampaignEx> listA = a(campaignUnit);
        if (listA != null && listA.size() > 0) {
            g();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 297);
            if (!TextUtils.isEmpty(str2)) {
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
            } else {
                eVar.a(CampaignEx.JSON_KEY_HB, 0);
            }
            CampaignEx campaignEx = listA.get(0);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, str2, eVar, campaignEx, str);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
                campaignEx.setHasMBTplMark(false);
                campaignEx.setIsMraid(true);
            } else {
                campaignEx.setHasMBTplMark(true);
                campaignEx.setIsMraid(false);
            }
            i(campaignEx, i10);
            return;
        }
        if (this.f32673x.contains("INSTALLED")) {
            bVar = new com.mbridge.msdk.foundation.error.b(880021, UHbHibBvYxKnPE.mxAzTeXju);
        } else {
            bVar = new com.mbridge.msdk.foundation.error.b(880003);
        }
        a(bVar, str2, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
    }

    private List<CampaignEx> a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setCampaignUnitId(this.f32650a);
        a(campaignEx);
        this.f32668s = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (v0.c(campaignEx)) {
                campaignEx.setRtinsType(v0.c(this.f32655f, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (com.mbridge.msdk.foundation.same.c.b(this.f32655f, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                v0.a(this.f32650a, campaignEx, com.mbridge.msdk.foundation.same.a.f30502x);
                this.f32673x = "APP ALREADY INSTALLED";
            }
            a(campaignEx, (com.mbridge.msdk.foundation.same.report.metrics.c) null, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f32655f, cVar, new f(campaignEx, aVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new g(campaignEx)).start();
    }

    public void a(com.mbridge.msdk.splash.middle.b bVar) {
        this.f32654e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, String str, int i10, CampaignEx campaignEx) throws Throwable {
        if (this.f32664o) {
            this.f32664o = false;
            a(bVar, i10, str, campaignEx);
        } else {
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, String str, CampaignEx campaignEx) throws Throwable {
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f32656g, this.f32651b, this.f32650a, str, this.f32658i, this.f32659j, true, false);
        if (campaignExA != null) {
            i(campaignExA, i10);
        } else {
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, CampaignEx campaignEx) {
        if (this.f32665p) {
            return;
        }
        b();
        this.f32665p = true;
        if (bVar != null) {
            bVar.a(campaignEx);
        }
        com.mbridge.msdk.splash.middle.b bVar2 = this.f32654e;
        if (bVar2 != null) {
            bVar2.a(bVar, i10);
        }
    }

    private void a(CampaignEx campaignEx, int i10) throws Throwable {
        this.f32656g.clearResState();
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            e(campaignEx, i10);
        }
        if (campaignEx.isDynamicView()) {
            return;
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            d(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            b(campaignEx, i10);
        }
        if (TextUtils.isEmpty(campaignEx.getImageUrl())) {
            return;
        }
        c(campaignEx, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.splash.manager.g.d dVar = new com.mbridge.msdk.splash.manager.g.d();
        dVar.c(this.f32650a);
        dVar.b(this.f32651b);
        dVar.a(campaignEx);
        dVar.a(str);
        dVar.a(this.f32658i);
        dVar.a(this.f32659j);
        com.mbridge.msdk.splash.manager.g.a().a(this.f32656g, dVar, new a(campaignEx, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10, CampaignEx campaignEx) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880009);
        bVar.c(str);
        a(bVar, this.f32662m, i10, campaignEx);
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
                q0.b(A, e10.getMessage());
            }
        }
    }
}
