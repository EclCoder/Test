package com.facebook.internal;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookServiceException;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class j1 extends Dialog {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f15259m = new b(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f15260n = com.facebook.common.f.f15059a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile int f15261o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f15263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f15264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WebView f15265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ProgressDialog f15266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f15267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private FrameLayout f15268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e f15269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f15270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f15271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f15272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private WindowManager.LayoutParams f15273l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            f1.o();
            return j1.f15261o;
        }

        protected final void b(Context context) {
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if ((applicationInfo != null ? applicationInfo.metaData : null) != null && j1.f15261o == 0) {
                    e(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        public final j1 c(Context context, String str, Bundle bundle, int i10, d dVar) {
            kotlin.jvm.internal.s.h(context, "context");
            j1.s(context);
            return new j1(context, str, bundle, i10, com.facebook.login.i0.FACEBOOK, dVar, null);
        }

        public final void e(int i10) {
            if (i10 == 0) {
                i10 = j1.f15260n;
            }
            j1.f15261o = i10;
        }

        private b() {
        }

        public final j1 d(Context context, String str, Bundle bundle, int i10, com.facebook.login.i0 i0Var, d dVar) {
            kotlin.jvm.internal.s.h(context, obFGmWgqyy.AWvPPdDcqOGGu);
            kotlin.jvm.internal.s.h(i0Var, CIdIVqKnNZ.TkpVH);
            j1.s(context);
            return new j1(context, str, bundle, i10, i0Var, dVar, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            ProgressDialog progressDialog;
            kotlin.jvm.internal.s.h(view, "view");
            kotlin.jvm.internal.s.h(url, "url");
            super.onPageFinished(view, url);
            if (!j1.this.f15271j && (progressDialog = j1.this.f15266e) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = j1.this.f15268g;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView webViewR = j1.this.r();
            if (webViewR != null) {
                webViewR.setVisibility(0);
            }
            ImageView imageView = j1.this.f15267f;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            j1.this.f15272k = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap bitmap) {
            ProgressDialog progressDialog;
            kotlin.jvm.internal.s.h(view, "view");
            kotlin.jvm.internal.s.h(url, "url");
            e1.l0("FacebookSDK.WebDialog", "Webview loading URL: " + url);
            super.onPageStarted(view, url, bitmap);
            if (j1.this.f15271j || (progressDialog = j1.this.f15266e) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int i10, String description, String failingUrl) {
            kotlin.jvm.internal.s.h(view, "view");
            kotlin.jvm.internal.s.h(description, "description");
            kotlin.jvm.internal.s.h(failingUrl, "failingUrl");
            super.onReceivedError(view, i10, description, failingUrl);
            j1.this.y(new FacebookDialogException(description, i10, failingUrl));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            kotlin.jvm.internal.s.h(view, "view");
            kotlin.jvm.internal.s.h(handler, "handler");
            kotlin.jvm.internal.s.h(error, "error");
            super.onReceivedSslError(view, handler, error);
            handler.cancel();
            j1.this.y(new FacebookDialogException(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            int i10;
            kotlin.jvm.internal.s.h(view, "view");
            kotlin.jvm.internal.s.h(url, "url");
            e1.l0("FacebookSDK.WebDialog", "Redirect URL: " + url);
            Uri uri = Uri.parse(url);
            boolean z10 = uri.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", uri.getPath());
            if (!bm.r.N(url, j1.this.f15263b, false, 2, null)) {
                if (bm.r.N(url, "fbconnect://cancel", false, 2, null)) {
                    j1.this.cancel();
                    return true;
                }
                if (!z10 && !bm.r.T(url, "touch", false, 2, null)) {
                    try {
                        j1.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                        return true;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                return false;
            }
            Bundle bundleW = j1.this.w(url);
            String string = bundleW.getString("error");
            if (string == null) {
                string = bundleW.getString("error_type");
            }
            String string2 = bundleW.getString("error_msg");
            if (string2 == null) {
                string2 = bundleW.getString("error_message");
            }
            if (string2 == null) {
                string2 = bundleW.getString("error_description");
            }
            String string3 = bundleW.getString("error_code");
            if (string3 == null || e1.e0(string3)) {
                i10 = -1;
            } else {
                try {
                    i10 = Integer.parseInt(string3);
                } catch (NumberFormatException unused2) {
                    i10 = -1;
                }
            }
            if (e1.e0(string) && e1.e0(string2) && i10 == -1) {
                j1.this.z(bundleW);
            } else if ((string == null || !(kotlin.jvm.internal.s.c(string, "access_denied") || kotlin.jvm.internal.s.c(string, "OAuthAccessDeniedException"))) && i10 != 4201) {
                j1.this.y(new FacebookServiceException(new com.facebook.x(i10, string, string2), string2));
            } else {
                j1.this.cancel();
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        void a(Bundle bundle, FacebookException facebookException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class e extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f15283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Exception[] f15284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j1 f15285d;

        public e(j1 j1Var, String action, Bundle parameters) {
            kotlin.jvm.internal.s.h(action, "action");
            kotlin.jvm.internal.s.h(parameters, "parameters");
            this.f15285d = j1Var;
            this.f15282a = action;
            this.f15283b = parameters;
            this.f15284c = new Exception[0];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(String[] results, int i10, e this$0, CountDownLatch latch, com.facebook.o0 response) {
            kotlin.jvm.internal.s.h(results, "$results");
            kotlin.jvm.internal.s.h(this$0, "this$0");
            kotlin.jvm.internal.s.h(latch, "$latch");
            kotlin.jvm.internal.s.h(response, "response");
            try {
                com.facebook.x xVarB = response.b();
                String str = "Error staging photo.";
                if (xVarB != null) {
                    String strC = xVarB.c();
                    if (strC != null) {
                        str = strC;
                    }
                    throw new FacebookGraphResponseException(response, str);
                }
                JSONObject jSONObjectC = response.c();
                if (jSONObjectC == null) {
                    throw new FacebookException("Error staging photo.");
                }
                String strOptString = jSONObjectC.optString("uri");
                if (strOptString == null) {
                    throw new FacebookException("Error staging photo.");
                }
                results[i10] = strOptString;
                latch.countDown();
            } catch (Exception e10) {
                this$0.f15284c[i10] = e10;
            }
        }

        protected String[] b(Void... p10) {
            if (x7.a.c(this)) {
                return null;
            }
            try {
                if (x7.a.c(this)) {
                    return null;
                }
                try {
                    kotlin.jvm.internal.s.h(p10, "p0");
                    String[] stringArray = this.f15283b.getStringArray("media");
                    if (stringArray == null) {
                        return null;
                    }
                    final String[] strArr = new String[stringArray.length];
                    this.f15284c = new Exception[stringArray.length];
                    final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    com.facebook.a aVarE = com.facebook.a.f14853l.e();
                    try {
                        int length = stringArray.length;
                        for (final int i10 = 0; i10 < length; i10++) {
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((com.facebook.m0) it.next()).cancel(true);
                                }
                                return null;
                            }
                            Uri uri = Uri.parse(stringArray[i10]);
                            if (e1.g0(uri)) {
                                strArr[i10] = uri.toString();
                                countDownLatch.countDown();
                            } else {
                                com.facebook.j0.b bVar = new com.facebook.j0.b() { // from class: com.facebook.internal.k1
                                    @Override // com.facebook.j0.b
                                    public final void a(com.facebook.o0 o0Var) {
                                        j1.e.c(strArr, i10, this, countDownLatch, o0Var);
                                    }
                                };
                                kotlin.jvm.internal.s.g(uri, "uri");
                                concurrentLinkedQueue.add(d8.k.t(aVarE, uri, bVar).l());
                            }
                        }
                        countDownLatch.await();
                        return strArr;
                    } catch (Exception unused) {
                        Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((com.facebook.m0) it2.next()).cancel(true);
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    x7.a.b(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                x7.a.b(th3, this);
                return null;
            }
        }

        protected void d(String[] strArr) {
            if (x7.a.c(this)) {
                return;
            }
            try {
                if (x7.a.c(this)) {
                    return;
                }
                try {
                    ProgressDialog progressDialog = this.f15285d.f15266e;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    for (Exception exc : this.f15284c) {
                        if (exc != null) {
                            this.f15285d.y(exc);
                            return;
                        }
                    }
                    if (strArr == null) {
                        this.f15285d.y(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    List listE = gl.j.e(strArr);
                    if (listE.contains(null)) {
                        this.f15285d.y(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    e1.r0(this.f15283b, "media", new JSONArray((Collection) listE));
                    this.f15285d.f15262a = e1.g(x0.b(), com.facebook.h0.y() + "/dialog/" + this.f15282a, this.f15283b).toString();
                    ImageView imageView = this.f15285d.f15267f;
                    if (imageView == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    this.f15285d.C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                } catch (Throwable th2) {
                    x7.a.b(th2, this);
                }
            } catch (Throwable th3) {
                x7.a.b(th3, this);
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            if (x7.a.c(this)) {
                return null;
            }
            try {
                if (x7.a.c(this)) {
                    return null;
                }
                try {
                    return b((Void[]) objArr);
                } catch (Throwable th2) {
                    x7.a.b(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                x7.a.b(th3, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            if (x7.a.c(this)) {
                return;
            }
            try {
                if (x7.a.c(this)) {
                    return;
                }
                try {
                    d((String[]) obj);
                } catch (Throwable th2) {
                    x7.a.b(th2, this);
                }
            } catch (Throwable th3) {
                x7.a.b(th3, this);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15286a;

        static {
            int[] iArr = new int[com.facebook.login.i0.values().length];
            try {
                iArr[com.facebook.login.i0.INSTAGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f15286a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class g extends WebView {
        g(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            try {
                super.onWindowFocusChanged(z10);
            } catch (NullPointerException unused) {
            }
        }
    }

    public /* synthetic */ j1(Context context, String str, Bundle bundle, int i10, com.facebook.login.i0 i0Var, d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bundle, i10, i0Var, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(int i10) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        g gVar = new g(getContext());
        this.f15265d = gVar;
        gVar.setVerticalScrollBarEnabled(false);
        WebView webView = this.f15265d;
        if (webView != null) {
            webView.setHorizontalScrollBarEnabled(false);
        }
        WebView webView2 = this.f15265d;
        if (webView2 != null) {
            webView2.setWebViewClient(new c());
        }
        WebView webView3 = this.f15265d;
        WebSettings settings = webView3 != null ? webView3.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView4 = this.f15265d;
        if (webView4 != null) {
            String str = this.f15262a;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            webView4.loadUrl(str);
        }
        WebView webView5 = this.f15265d;
        if (webView5 != null) {
            webView5.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView6 = this.f15265d;
        if (webView6 != null) {
            webView6.setVisibility(4);
        }
        WebView webView7 = this.f15265d;
        WebSettings settings2 = webView7 != null ? webView7.getSettings() : null;
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView8 = this.f15265d;
        WebSettings settings3 = webView8 != null ? webView8.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        WebView webView9 = this.f15265d;
        if (webView9 != null) {
            webView9.setFocusable(true);
        }
        WebView webView10 = this.f15265d;
        if (webView10 != null) {
            webView10.setFocusableInTouchMode(true);
        }
        WebView webView11 = this.f15265d;
        if (webView11 != null) {
            webView11.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.internal.g1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return j1.D(view, motionEvent);
                }
            });
        }
        linearLayout.setPadding(i10, i10, i10, i10);
        linearLayout.addView(this.f15265d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f15268g;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    private final void o() {
        ImageView imageView = new ImageView(getContext());
        this.f15267f = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.internal.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j1.p(this.f15246a, view);
            }
        });
        Drawable drawable = getContext().getResources().getDrawable(com.facebook.common.b.f15041b);
        ImageView imageView2 = this.f15267f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f15267f;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(j1 this$0, View view) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        this$0.cancel();
    }

    private final int q(int i10, float f10, int i11, int i12) {
        double d10;
        int i13 = (int) (i10 / f10);
        if (i13 <= i11) {
            d10 = 1.0d;
        } else {
            d10 = i13 >= i12 ? 0.5d : ((((double) (i12 - i13)) / ((double) (i12 - i11))) * 0.5d) + 0.5d;
        }
        return (int) (((double) i10) * d10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void s(Context context) {
        f15259m.b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(j1 this$0, DialogInterface dialogInterface) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        this$0.cancel();
    }

    protected final void A(String expectedRedirectUrl) {
        kotlin.jvm.internal.s.h(expectedRedirectUrl, "expectedRedirectUrl");
        this.f15263b = expectedRedirectUrl;
    }

    public final void B(d dVar) {
        this.f15264c = dVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f15264c == null || this.f15270i) {
            return;
        }
        y(new FacebookOperationCanceledException());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f15265d;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f15271j && (progressDialog = this.f15266e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.f15271j = false;
        Context context = getContext();
        kotlin.jvm.internal.s.g(context, "context");
        if (e1.p0(context) && (layoutParams = this.f15273l) != null) {
            if ((layoutParams != null ? layoutParams.token : null) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Set token on onAttachedToWindow(): ");
                WindowManager.LayoutParams layoutParams2 = this.f15273l;
                sb2.append(layoutParams2 != null ? layoutParams2.token : null);
                e1.l0("FacebookSDK.WebDialog", sb2.toString());
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f15266e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f15266e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(com.facebook.common.e.f15055d));
        }
        ProgressDialog progressDialog3 = this.f15266e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f15266e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.internal.h1
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    j1.v(this.f15228a, dialogInterface);
                }
            });
        }
        requestWindowFeature(1);
        this.f15268g = new FrameLayout(getContext());
        x();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        o();
        if (this.f15262a != null) {
            ImageView imageView = this.f15267f;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.");
            }
            C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f15268g;
        if (frameLayout != null) {
            frameLayout.addView(this.f15267f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f15268g;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f15271j = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        kotlin.jvm.internal.s.h(event, "event");
        if (i10 == 4) {
            WebView webView = this.f15265d;
            if (webView != null && webView != null && webView.canGoBack()) {
                WebView webView2 = this.f15265d;
                if (webView2 != null) {
                    webView2.goBack();
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i10, event);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        e eVar = this.f15269h;
        if (eVar != null) {
            if ((eVar != null ? eVar.getStatus() : null) == AsyncTask.Status.PENDING) {
                e eVar2 = this.f15269h;
                if (eVar2 != null) {
                    eVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f15266e;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        x();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        e eVar = this.f15269h;
        if (eVar != null) {
            eVar.cancel(true);
            ProgressDialog progressDialog = this.f15266e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        kotlin.jvm.internal.s.h(params, "params");
        if (params.token == null) {
            this.f15273l = params;
        }
        super.onWindowAttributesChanged(params);
    }

    protected final WebView r() {
        return this.f15265d;
    }

    protected final boolean t() {
        return this.f15270i;
    }

    protected final boolean u() {
        return this.f15272k;
    }

    public Bundle w(String str) {
        Uri uri = Uri.parse(str);
        Bundle bundleQ0 = e1.q0(uri.getQuery());
        bundleQ0.putAll(e1.q0(uri.getFragment()));
        return bundleQ0;
    }

    public final void x() {
        Object systemService = getContext().getSystemService("window");
        kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        int i12 = i10 < i11 ? i10 : i11;
        if (i10 < i11) {
            i10 = i11;
        }
        int iMin = Math.min(q(i12, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int iMin2 = Math.min(q(i10, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(iMin, iMin2);
        }
    }

    protected final void y(Throwable th2) {
        if (this.f15264c == null || this.f15270i) {
            return;
        }
        this.f15270i = true;
        FacebookException facebookException = th2 instanceof FacebookException ? (FacebookException) th2 : new FacebookException(th2);
        d dVar = this.f15264c;
        if (dVar != null) {
            dVar.a(null, facebookException);
        }
        dismiss();
    }

    protected final void z(Bundle bundle) {
        d dVar = this.f15264c;
        if (dVar == null || this.f15270i) {
            return;
        }
        this.f15270i = true;
        if (dVar != null) {
            dVar.a(bundle, null);
        }
        dismiss();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected j1(Context context, String url) {
        this(context, url, f15259m.a());
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(url, "url");
    }

    private j1(Context context, String str, int i10) {
        super(context, i10 == 0 ? f15259m.a() : i10);
        this.f15263b = "fbconnect://success";
        this.f15262a = str;
    }

    private j1(Context context, String str, Bundle bundle, int i10, com.facebook.login.i0 i0Var, d dVar) {
        Uri uriG;
        super(context, i10 == 0 ? f15259m.a() : i10);
        this.f15263b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = e1.Y(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f15263b = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", com.facebook.h0.n());
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str3 = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{com.facebook.h0.F()}, 1));
        kotlin.jvm.internal.s.g(str3, "format(locale, format, *args)");
        bundle.putString("sdk", str3);
        this.f15264c = dVar;
        if (kotlin.jvm.internal.s.c(str, "share") && bundle.containsKey("media")) {
            this.f15269h = new e(this, str, bundle);
            return;
        }
        if (f.f15286a[i0Var.ordinal()] == 1) {
            uriG = e1.g(x0.k(), "oauth/authorize", bundle);
        } else {
            uriG = e1.g(x0.b(), com.facebook.h0.y() + "/dialog/" + str, bundle);
        }
        this.f15262a = uriG.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f15274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f15275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f15276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f15277d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f15278e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Bundle f15279f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.facebook.a f15280g;

        public a(Context context, String action, Bundle bundle) {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(action, "action");
            com.facebook.a.c cVar = com.facebook.a.f14853l;
            this.f15280g = cVar.e();
            if (!cVar.g()) {
                String strK = e1.K(context);
                if (strK == null) {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
                this.f15275b = strK;
            }
            b(context, action, bundle);
        }

        private final void b(Context context, String str, Bundle bundle) {
            this.f15274a = context;
            this.f15276c = str;
            if (bundle != null) {
                this.f15279f = bundle;
            } else {
                this.f15279f = new Bundle();
            }
        }

        public j1 a() {
            com.facebook.a aVar = this.f15280g;
            if (aVar != null) {
                Bundle bundle = this.f15279f;
                if (bundle != null) {
                    bundle.putString(MBridgeConstans.APP_ID, aVar != null ? aVar.c() : null);
                }
                Bundle bundle2 = this.f15279f;
                if (bundle2 != null) {
                    com.facebook.a aVar2 = this.f15280g;
                    bundle2.putString("access_token", aVar2 != null ? aVar2.p() : null);
                }
            } else {
                Bundle bundle3 = this.f15279f;
                if (bundle3 != null) {
                    bundle3.putString(MBridgeConstans.APP_ID, this.f15275b);
                }
            }
            b bVar = j1.f15259m;
            Context context = this.f15274a;
            if (context != null) {
                return bVar.c(context, this.f15276c, this.f15279f, this.f15277d, this.f15278e);
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final String c() {
            return this.f15275b;
        }

        public final Context d() {
            return this.f15274a;
        }

        public final d e() {
            return this.f15278e;
        }

        public final Bundle f() {
            return this.f15279f;
        }

        public final int g() {
            return this.f15277d;
        }

        public final a h(d dVar) {
            this.f15278e = dVar;
            return this;
        }

        public a(Context context, String str, String action, Bundle bundle) {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(action, "action");
            this.f15275b = f1.n(str == null ? e1.K(context) : str, "applicationId");
            b(context, action, bundle);
        }
    }
}
