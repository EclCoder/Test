package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.ArrayList;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class a implements BrowserView.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static String f31031o = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31032a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BaseTrackingListener f31036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BrowserView f31037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CampaignEx f31038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.click.a f31039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Context f31040i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private JumpLoaderResult f31042k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f31045n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31033b = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f31043l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f31044m = new RunnableC0404a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f31041j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class RunnableC0404a implements Runnable {
        RunnableC0404a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b(a.f31031o, "webview js！超时上限：" + a.this.f31032a + "ms");
            if (a.this.f31039h != null && a.this.f31042k != null) {
                a.this.f31042k.setSuccess(false);
                a.this.f31042k.setUrl(a.this.f31034c);
                a.this.f31042k.setType(2);
                a.this.f31042k.setExceptionMsg("linktype 8 time out");
                a.this.f31039h.a(a.this.f31042k, a.this.f31038g, 1, false);
            }
            a aVar = a.this;
            if (aVar.b(null, aVar.f31034c) && !a.this.f31043l) {
                a.this.f31043l = true;
                a aVar2 = a.this;
                aVar2.a(aVar2.f31040i, a.this.f31034c, a.this.f31038g);
            }
            if (a.this.f31036e != null) {
                a.this.f31036e.onFinishRedirection(a.this.f31038g, a.this.f31034c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f31047a;

        b(String str) {
            this.f31047a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f31039h != null && a.this.f31042k != null) {
                a.this.f31042k.setSuccess(true);
                a.this.f31042k.setUrl(this.f31047a);
                a.this.f31042k.setType(2);
                a.this.f31039h.a(a.this.f31042k, a.this.f31038g, 1, true);
            }
            if (a.this.f31036e != null) {
                a.this.f31036e.onFinishRedirection(a.this.f31038g, this.f31047a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f31049a;

        c(String str) {
            this.f31049a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f31036e != null) {
                a.this.f31036e.onFinishRedirection(a.this.f31038g, this.f31049a);
            }
            if (a.this.f31039h == null || a.this.f31042k == null) {
                return;
            }
            a.this.f31042k.setSuccess(true);
            a.this.f31042k.setUrl(this.f31049a);
            a.this.f31042k.setType(2);
            a.this.f31039h.a(a.this.f31042k, a.this.f31038g, 1, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f31051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31052b;

        d(String str, String str2) {
            this.f31051a = str;
            this.f31052b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f31036e != null) {
                a.this.f31036e.onFinishRedirection(a.this.f31038g, this.f31051a);
            }
            if (a.this.f31039h == null || a.this.f31042k == null) {
                return;
            }
            a.this.f31042k.setSuccess(false);
            a.this.f31042k.setUrl(this.f31051a);
            a.this.f31042k.setType(2);
            a.this.f31042k.setExceptionMsg(this.f31052b);
            a.this.f31039h.a(a.this.f31042k, a.this.f31038g, 1, true);
        }
    }

    public a(Context context, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BrowserView browserView, BaseTrackingListener baseTrackingListener) {
        this.f31032a = 10000;
        this.f31042k = null;
        this.f31040i = context;
        this.f31038g = campaignEx;
        this.f31037f = browserView;
        this.f31036e = baseTrackingListener;
        g gVarF = h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        gVarF = gVarF == null ? h.b().a() : gVarF;
        this.f31039h = aVar;
        this.f31042k = new JumpLoaderResult();
        this.f31032a = (int) gVarF.s0();
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a() {
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onPageFinished(WebView webView, String str) {
        q0.b(f31031o, "onPageFinished1  " + str);
        if (this.f31033b) {
            this.f31045n = 0L;
            this.f31033b = false;
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new c(str));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c();
            Uri uri = Uri.parse(str);
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && !this.f31043l) {
                this.f31043l = true;
                a(this.f31040i, str, this.f31038g);
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f31045n == 0) {
            this.f31045n = System.currentTimeMillis();
            if (!this.f31035d) {
                this.f31035d = true;
                d();
            }
            this.f31043l = false;
        }
        this.f31034c = str;
        this.f31033b = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        q0.d(f31031o, str);
        c();
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(str2, str));
        if (!b(webView, str2) || this.f31043l) {
            return;
        }
        this.f31043l = true;
        a(this.f31040i, str2, this.f31038g);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        q0.b(f31031o, "shouldOverrideUrlLoading1  " + str);
        this.f31033b = false;
        if (u0.a.b(str) && u0.a.a(this.f31040i, str, null)) {
            this.f31043l = true;
        }
        boolean zC = c(webView, str);
        if (zC) {
            this.f31045n = 0L;
            this.f31033b = false;
            c();
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new b(str));
        }
        return zC;
    }

    private boolean c(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri = Uri.parse(str);
            if (!uri.getScheme().equals("http") && !uri.getScheme().equals("https")) {
                if (uri.getScheme().equals("intent")) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        String str2 = uri2.getPackage();
                        if (!TextUtils.isEmpty(str2) && this.f31040i.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            uri2.setFlags(268435456);
                            this.f31040i.startActivity(uri2);
                            this.f31043l = true;
                            return true;
                        }
                        try {
                            String stringExtra = uri2.getStringExtra("browser_fallback_url");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                Uri uri3 = Uri.parse(str);
                                if (!uri3.getScheme().equals("http") && !uri3.getScheme().equals("https")) {
                                    str = stringExtra;
                                }
                                webView.loadUrl(stringExtra);
                                return false;
                            }
                        } catch (Throwable th2) {
                            q0.b(f31031o, th2.getMessage());
                        }
                    } catch (Throwable th3) {
                        q0.b(f31031o, th3.getMessage());
                    }
                    q0.b(f31031o, th.getMessage());
                    return false;
                }
                if (com.mbridge.msdk.click.c.d(this.f31040i, str)) {
                    q0.b(f31031o, "openDeepLink");
                    this.f31043l = true;
                    return true;
                }
            }
            return false;
        } catch (Throwable th4) {
            q0.b(f31031o, th4.getMessage());
            return false;
        }
    }

    private void d() {
        this.f31041j.postDelayed(this.f31044m, this.f31032a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            Uri uri = Uri.parse(str);
            if (!uri.getScheme().equals("http") && !uri.getScheme().equals("https")) {
                if (uri.getScheme().equals("intent")) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        String str2 = uri2.getPackage();
                        if (!TextUtils.isEmpty(str2) && this.f31040i.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            return false;
                        }
                    } catch (Throwable th2) {
                        q0.b(f31031o, th2.getMessage());
                    }
                    try {
                        String stringExtra = uri2.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri uri3 = Uri.parse(str);
                            if (uri3.getScheme().equals("http") || uri3.getScheme().equals("https")) {
                                return true;
                            }
                            str = stringExtra;
                        }
                    } catch (Throwable th3) {
                        q0.b(f31031o, th3.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.d(this.f31040i, str)) {
                    q0.b(f31031o, "openDeepLink");
                    return false;
                }
            }
            return true;
        } catch (Throwable th4) {
            q0.b(f31031o, th4.getMessage());
            return true;
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a(WebView webView, String str) {
        if (this.f31045n == 0) {
            this.f31045n = System.currentTimeMillis();
            if (!this.f31035d) {
                this.f31035d = true;
                d();
            }
        }
        this.f31034c = str;
        this.f31033b = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, CampaignEx campaignEx) {
        if (context == null) {
            return;
        }
        if (campaignEx != null) {
            campaignEx.getCurrentLocalRid();
        }
        try {
            int i10 = MBCommonActivity.f28098e;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.webview.b.f31054a.put(str, this.f31037f);
            if (u0.a.d(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace(qnwOeeQSSWa.lZRj, "");
            }
            intent.putExtra("url", str);
            q0.c("url", "webview url = " + str);
            intent.setFlags(805306368);
            intent.putExtra("mvcommon", campaignEx);
            context.startActivity(intent);
        } catch (Exception unused) {
            u0.a(context, str, this.f31036e, campaignEx, new ArrayList());
        }
    }

    private void c() {
        this.f31041j.removeCallbacks(this.f31044m);
    }
}
