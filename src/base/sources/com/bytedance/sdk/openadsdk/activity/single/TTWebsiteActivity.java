package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.vf;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.orl;
import com.bytedance.sdk.openadsdk.common.xn;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.hqh;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.dnm;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class TTWebsiteActivity extends TTBaseActivity {
    private String aq;
    private int bug;
    private HashMap<String, String> dkl;
    private int dnm;
    private com.bytedance.sdk.openadsdk.core.widget.hnj.dkl.hnj dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private ImageView f13119fc;
    private com.bytedance.sdk.component.ojm.dkl gjv;
    public orl hnj;
    private ImageView jip;
    private float mjg;
    private ILoader orl;
    private xn qor;
    private ImageView uua;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f13120hn = null;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f13121sk = false;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        oj.hn(getApplicationContext());
        if (!fc.sk()) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.mjg.hn.hnj(this);
        as asVarHnj = hqh.hnj().hnj(hqh.hnj(getIntent()));
        if (asVarHnj == null) {
            finish();
            return;
        }
        String strVf = asVarHnj.vf();
        String strQor = asVarHnj.gmt().qor();
        String strGjv = asVarHnj.gmt().gjv();
        if (TextUtils.isEmpty(strQor)) {
            finish();
            return;
        }
        boolean zNyv = oj.gjv().nyv();
        this.f13121sk = zNyv;
        if (zNyv) {
            hn(asVarHnj, strVf, strQor, strGjv);
        } else {
            hnj(asVarHnj, strVf, strQor, strGjv);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        com.bytedance.sdk.component.ojm.dkl dklVar = this.gjv;
        if (dklVar != null) {
            vf.hnj(dklVar);
        }
        super.onDestroy();
    }

    private void hn(final as asVar, String str, String str2, String str3) {
        com.bytedance.sdk.component.ojm.dkl dklVar;
        if (asVar != null) {
            this.aq = asVar.rx();
        }
        if (!TextUtils.isEmpty(this.aq)) {
            this.orl = com.bytedance.sdk.openadsdk.dse.hn.hnj().hn();
            int iHnj = com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(this.orl, this.aq);
            this.dnm = iHnj;
            this.bug = iHnj > 0 ? 2 : 0;
        }
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(this);
        if (Build.VERSION.SDK_INT >= 35) {
            skVar.setFitsSystemWindows(true);
        }
        skVar.setBackgroundColor(-1);
        skVar.setId(520093726);
        skVar.setOrientation(1);
        skVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(skVar);
            orl orlVar = new orl(this, asVar, "tag", true);
            this.hnj = orlVar;
            View viewGjv = orlVar.gjv();
            this.hnj.hnj();
            viewGjv.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            viewGjv.setVisibility(0);
            skVar.addView(viewGjv);
            final TextView textView = (TextView) viewGjv.findViewById(jip.hnj);
            viewGjv.findViewById(jip.f14661hn);
            final com.bytedance.sdk.openadsdk.core.dkl.dkl dklVar2 = (com.bytedance.sdk.openadsdk.core.dkl.dkl) findViewById(520093743);
            if (dklVar2 != null) {
                dklVar2.setProgress(0);
                dklVar2.setMax(100);
            }
            ImageView imageView = (ImageView) findViewById(jip.znr);
            this.f13119fc = imageView;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.9
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (TTWebsiteActivity.this.gjv != null) {
                            if (TTWebsiteActivity.this.dse != null) {
                                TTWebsiteActivity.this.dse.hnj();
                            }
                            if (TTWebsiteActivity.this.gjv.ojm()) {
                                TTWebsiteActivity.this.gjv.ta();
                            } else {
                                TTWebsiteActivity.this.finish();
                            }
                        }
                    }
                });
            }
            ImageView imageView2 = (ImageView) findViewById(jip.rq);
            this.jip = imageView2;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f13127a.hnj(view);
                    }
                });
            }
            ImageView imageView3 = (ImageView) viewGjv.findViewById(520093740);
            this.uua = imageView3;
            if (imageView3 != null) {
                imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f13134a.hnj(dklVar2, asVar, view);
                    }
                });
            }
            try {
                com.bytedance.sdk.component.ojm.dkl dklVarQor = this.hnj.qor();
                this.gjv = dklVarQor;
                WebView webView = dklVarQor.getWebView();
                if (webView != null) {
                    this.dse = new com.bytedance.sdk.openadsdk.core.widget.hnj.dkl(webView, asVar, this, false).qor();
                }
                this.hnj.hnj(true);
                if (this.gjv.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.gjv.getParent()).removeView(this.gjv);
                }
                skVar.addView(this.gjv, new ViewGroup.LayoutParams(-1, -1));
                this.f13120hn = str2;
                if (!TextUtils.isEmpty(str)) {
                    String strEncode = URLEncoder.encode(str);
                    if (this.f13120hn.contains("?")) {
                        this.f13120hn += "&gdid_encrypted=" + strEncode;
                    } else {
                        this.f13120hn += "?gdid_encrypted=" + strEncode;
                    }
                }
                if (this.f13120hn == null || (dklVar = this.gjv) == null) {
                    finish();
                    return;
                }
                WebView webView2 = dklVar.getWebView();
                if (webView2 != null) {
                    WebSettings settings = webView2.getSettings();
                    settings.setMixedContentMode(0);
                    try {
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        settings.setSavePassword(false);
                        settings.setAllowFileAccess(false);
                    } catch (Throwable unused) {
                    }
                }
                HashMap<String, String> map = new HashMap<>();
                map.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
                this.dkl = map;
                try {
                    this.gjv.hnj(this.f13120hn, map);
                } catch (Throwable unused2) {
                    this.gjv.a_(this.f13120hn);
                }
                this.gjv.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.11
                    @Override // android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView3, int i10) {
                        super.onProgressChanged(webView3, i10);
                        if (dklVar2 == null || TTWebsiteActivity.this.isFinishing()) {
                            return;
                        }
                        if (i10 == 100) {
                            dklVar2.setVisibility(8);
                            webView3.canGoBack();
                        } else {
                            dklVar2.setVisibility(0);
                            dklVar2.setProgress(i10);
                        }
                    }

                    @Override // android.webkit.WebChromeClient
                    public void onReceivedTitle(WebView webView3, String str4) {
                        TextView textView2;
                        if (TextUtils.isEmpty(str4) || (textView2 = textView) == null) {
                            return;
                        }
                        textView2.setText(str4);
                        TTWebsiteActivity.this.hnj.hn(webView3.getUrl());
                    }
                });
                this.gjv.setWebViewClient(new com.bytedance.sdk.component.ojm.dkl.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.2
                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView3, String str4) {
                        TTWebsiteActivity tTWebsiteActivity;
                        orl orlVar2;
                        super.onPageFinished(webView3, str4);
                        if (!TTWebsiteActivity.this.f13121sk || (orlVar2 = (tTWebsiteActivity = TTWebsiteActivity.this).hnj) == null) {
                            return;
                        }
                        orlVar2.hnj(webView3, tTWebsiteActivity.dse);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView3, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView3, webResourceRequest, webResourceError);
                        webResourceError.getErrorCode();
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedHttpError(WebView webView3, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView3, webResourceRequest, webResourceResponse);
                        Objects.toString(webResourceResponse);
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView3, String str4) {
                        try {
                            Uri uri = Uri.parse(str4);
                            if (!com.bytedance.sdk.component.utils.oj.hnj(str4)) {
                                try {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setData(uri);
                                    intent.addFlags(268435456);
                                    com.bytedance.sdk.component.utils.hn.hnj(TTWebsiteActivity.this, intent, null);
                                    return true;
                                } catch (Throwable unused3) {
                                    return true;
                                }
                            }
                        } catch (Throwable unused4) {
                        }
                        return super.shouldOverrideUrlLoading(webView3, str4);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView3, int i10, String str4, String str5) {
                        super.onReceivedError(webView3, i10, str4, str5);
                    }
                });
                if (this.gjv != null && webView2 != null) {
                    webView2.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.3

                        /* JADX INFO: renamed from: hn, reason: collision with root package name */
                        private final int f13124hn = oj.hn();

                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            try {
                                int actionMasked = motionEvent.getActionMasked();
                                if (actionMasked == 0) {
                                    TTWebsiteActivity.this.mjg = motionEvent.getRawY();
                                    return false;
                                }
                                if (actionMasked != 2) {
                                    return false;
                                }
                                float rawY = motionEvent.getRawY();
                                if (!TTWebsiteActivity.this.f13121sk) {
                                    return false;
                                }
                                if (rawY - TTWebsiteActivity.this.mjg > this.f13124hn) {
                                    TTWebsiteActivity.this.hnj.hnj();
                                }
                                if (rawY - TTWebsiteActivity.this.mjg >= (-this.f13124hn)) {
                                    return false;
                                }
                                TTWebsiteActivity.this.hnj.hn();
                                return false;
                            } catch (Throwable th2) {
                                Log.e("TTAD.TTWebsiteActivity", "TouchRecordTool onTouch error", th2);
                                return false;
                            }
                        }
                    });
                }
                com.bytedance.sdk.openadsdk.core.widget.hnj.qor.hn(webView2);
            } catch (Exception e10) {
                apu.hnj("TTAD.TTWebsiteActivity", "onCreate: ", e10);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    public static void hnj(Context context, as asVar, String str) {
        if (context == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), asVar, str, "open_policy");
        if (TextUtils.isEmpty(asVar.gmt().qor())) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TTWebsiteActivity.class);
        intent.putExtra("meta_index", hqh.hnj().hnj(asVar));
        com.bytedance.sdk.component.utils.hn.hnj(context, intent, null);
    }

    private void hnj(final as asVar, String str, String str2, String str3) {
        com.bytedance.sdk.component.ojm.dkl dklVar;
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(this);
        if (Build.VERSION.SDK_INT >= 35) {
            skVar.setFitsSystemWindows(true);
        }
        skVar.setBackgroundColor(-1);
        skVar.setId(520093726);
        skVar.setOrientation(1);
        skVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(skVar);
            int iHn = sq.hn(this, 5.0f);
            int iHn2 = sq.hn(this, 8.0f);
            int iHn3 = sq.hn(this, 10.0f);
            int iHn4 = sq.hn(this, 12.0f);
            int iHn5 = sq.hn(this, 14.0f);
            int iHn6 = sq.hn(this, 20.0f);
            int iHn7 = sq.hn(this, 24.0f);
            int iHn8 = sq.hn(this, 40.0f);
            int iHn9 = sq.hn(this, 44.0f);
            int iHn10 = sq.hn(this, 191.0f);
            com.bytedance.sdk.openadsdk.core.dkl.dse dseVar = new com.bytedance.sdk.openadsdk.core.dkl.dse(this);
            dseVar.setGravity(15);
            dseVar.setLayoutParams(new LinearLayout.LayoutParams(-1, iHn9));
            com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = new com.bytedance.sdk.openadsdk.core.dkl.gjv(this);
            gjvVar.setId(520093720);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iHn8, iHn9);
            layoutParams.setMarginStart(iHn2);
            gjvVar.setLayoutParams(layoutParams);
            gjvVar.setClickable(true);
            gjvVar.setFocusable(true);
            gjvVar.setPadding(iHn5, iHn4, iHn5, iHn4);
            gjvVar.setImageDrawable(wu.qor(this, "tt_ad_arrow_backward"));
            final com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar2 = new com.bytedance.sdk.openadsdk.core.dkl.gjv(this);
            gjvVar2.setId(520093716);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iHn8, iHn9);
            layoutParams2.addRule(17, 520093720);
            gjvVar2.setLayoutParams(layoutParams2);
            gjvVar2.setClickable(true);
            gjvVar2.setFocusable(true);
            gjvVar2.setPadding(iHn4, iHn5, iHn4, iHn5);
            gjvVar2.setImageDrawable(wu.qor(this, "tt_ad_xmark"));
            com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(this);
            aqVar.setId(jip.f14656dl);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iHn10, iHn7);
            layoutParams3.setMarginStart(iHn);
            layoutParams3.addRule(15);
            layoutParams3.addRule(16, 520093741);
            layoutParams3.addRule(17, 520093716);
            aqVar.setLayoutParams(layoutParams3);
            aqVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            aqVar.setGravity(17);
            aqVar.setSingleLine(true);
            aqVar.setTextColor(Color.parseColor("#222222"));
            aqVar.setTextSize(17.0f);
            com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar3 = new com.bytedance.sdk.openadsdk.core.dkl.gjv(this);
            gjvVar3.setId(520093741);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iHn8, iHn9);
            layoutParams4.addRule(16, 520093742);
            gjvVar3.setLayoutParams(layoutParams4);
            gjvVar3.setPadding(iHn3, iHn4, iHn3, iHn4);
            gjvVar3.setImageDrawable(wu.qor(this, "tt_ad_link"));
            com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar4 = new com.bytedance.sdk.openadsdk.core.dkl.gjv(this);
            gjvVar4.setId(520093742);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(iHn8, iHn9);
            layoutParams5.addRule(21);
            layoutParams5.setMarginEnd(iHn2);
            gjvVar4.setLayoutParams(layoutParams5);
            gjvVar4.setPadding(iHn4, iHn6, iHn4, iHn6);
            gjvVar4.setImageDrawable(wu.qor(this, "tt_ad_threedots"));
            final com.bytedance.sdk.openadsdk.core.dkl.dkl dklVar2 = new com.bytedance.sdk.openadsdk.core.dkl.dkl(this, null, R.style.Widget.ProgressBar.Horizontal);
            dklVar2.setId(520093743);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, sq.hn(this, 2.0f));
            layoutParams6.addRule(12);
            dklVar2.setLayoutParams(layoutParams6);
            dklVar2.setProgress(1);
            dklVar2.setProgressDrawable(dnm.hnj(this, "tt_privacy_progress_style"));
            View view = new View(this);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, sq.hn(this, 1.0f));
            layoutParams7.addRule(12);
            view.setLayoutParams(layoutParams7);
            dseVar.addView(gjvVar);
            dseVar.addView(gjvVar2);
            dseVar.addView(aqVar);
            dseVar.addView(gjvVar3);
            dseVar.addView(gjvVar4);
            dseVar.addView(dklVar2);
            dseVar.addView(view);
            skVar.addView(dseVar);
            try {
                com.bytedance.sdk.component.ojm.dkl dklVar3 = new com.bytedance.sdk.component.ojm.dkl(this, com.bytedance.sdk.component.ojm.dkl.qor.PRIVACY);
                this.gjv = dklVar3;
                dklVar3.setBackgroundColor(-1);
                skVar.addView(this.gjv, new ViewGroup.LayoutParams(-1, -1));
                gjvVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.gjv.ojm()) {
                            TTWebsiteActivity.this.gjv.ta();
                        } else {
                            TTWebsiteActivity.this.finish();
                        }
                    }
                });
                gjvVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.this.finish();
                    }
                });
                gjvVar2.setVisibility(4);
                gjvVar2.setClickable(false);
                if (!TextUtils.isEmpty(str3)) {
                    aqVar.setText(str3);
                }
                gjvVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String url = TTWebsiteActivity.this.gjv.getUrl();
                        if (TextUtils.isEmpty(url)) {
                            return;
                        }
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.hn.hnj(TTWebsiteActivity.this, intent, null);
                    }
                });
                gjvVar4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.qor == null) {
                            TTWebsiteActivity.this.qor = new xn(TTWebsiteActivity.this);
                            TTWebsiteActivity.this.qor.hnj(asVar);
                            TTWebsiteActivity.this.qor.setCanceledOnTouchOutside(false);
                        }
                        TTWebsiteActivity.this.qor.show();
                    }
                });
                this.f13120hn = str2;
                if (!TextUtils.isEmpty(str)) {
                    String strEncode = URLEncoder.encode(str);
                    if (this.f13120hn.contains("?")) {
                        this.f13120hn += "&gdid_encrypted=" + strEncode;
                    } else {
                        this.f13120hn += "?gdid_encrypted=" + strEncode;
                    }
                }
                if (this.f13120hn != null && (dklVar = this.gjv) != null) {
                    WebView webView = dklVar.getWebView();
                    if (webView != null) {
                        WebSettings settings = webView.getSettings();
                        settings.setMixedContentMode(0);
                        try {
                            settings.setJavaScriptEnabled(true);
                            settings.setDomStorageEnabled(true);
                            settings.setSavePassword(false);
                            settings.setAllowFileAccess(false);
                        } catch (Throwable unused) {
                        }
                    }
                    HashMap map = new HashMap();
                    map.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
                    try {
                        this.gjv.hnj(this.f13120hn, map);
                    } catch (Throwable unused2) {
                        this.gjv.a_(this.f13120hn);
                    }
                    this.gjv.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.7
                        @Override // android.webkit.WebChromeClient
                        public void onProgressChanged(WebView webView2, int i10) {
                            super.onProgressChanged(webView2, i10);
                            if (dklVar2 == null || TTWebsiteActivity.this.isFinishing()) {
                                return;
                            }
                            if (i10 != 100) {
                                dklVar2.setVisibility(0);
                                dklVar2.setProgress(i10);
                                return;
                            }
                            dklVar2.setVisibility(8);
                            if (webView2.canGoBack()) {
                                gjvVar2.setVisibility(0);
                                gjvVar2.setClickable(true);
                            } else {
                                gjvVar2.setVisibility(4);
                                gjvVar2.setClickable(false);
                            }
                        }
                    });
                    this.gjv.setWebViewClient(new com.bytedance.sdk.component.ojm.dkl.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.8
                        @Override // android.webkit.WebViewClient
                        public void onPageFinished(WebView webView2, String str4) {
                            super.onPageFinished(webView2, str4);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                            super.onReceivedError(webView2, webResourceRequest, webResourceError);
                            webResourceError.getErrorCode();
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                            super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                            Objects.toString(webResourceResponse);
                        }

                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView webView2, String str4) {
                            try {
                                Uri uri = Uri.parse(str4);
                                if (!com.bytedance.sdk.component.utils.oj.hnj(str4)) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.VIEW");
                                        intent.setData(uri);
                                        intent.addFlags(268435456);
                                        com.bytedance.sdk.component.utils.hn.hnj(TTWebsiteActivity.this, intent, null);
                                        return true;
                                    } catch (Throwable unused3) {
                                        return true;
                                    }
                                }
                            } catch (Throwable unused4) {
                            }
                            return super.shouldOverrideUrlLoading(webView2, str4);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(WebView webView2, int i10, String str4, String str5) {
                            super.onReceivedError(webView2, i10, str4, str5);
                        }
                    });
                    com.bytedance.sdk.openadsdk.core.widget.hnj.qor.hn(this.gjv.getWebView());
                    return;
                }
                finish();
            } catch (Exception e10) {
                apu.hnj("TTAD.TTWebsiteActivity", "onCreate: ", e10);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void hnj(View view) {
        com.bytedance.sdk.component.ojm.dkl dklVar = this.gjv;
        if (dklVar == null || !dklVar.dnm()) {
            return;
        }
        this.gjv.bug();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void hnj(final com.bytedance.sdk.openadsdk.core.dkl.dkl dklVar, final as asVar, View view) {
        final com.bytedance.sdk.openadsdk.common.apu apuVar = new com.bytedance.sdk.openadsdk.common.apu(this, true);
        apuVar.setOnMenuItemClickListener(new com.bytedance.sdk.openadsdk.common.apu.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.10
            @Override // com.bytedance.sdk.openadsdk.common.apu.hnj
            public void gjv() {
                if (TTWebsiteActivity.this.qor == null) {
                    TTWebsiteActivity.this.qor = new xn(TTWebsiteActivity.this);
                    TTWebsiteActivity.this.qor.hnj(asVar);
                    TTWebsiteActivity.this.qor.setCanceledOnTouchOutside(false);
                }
                TTWebsiteActivity.this.qor.show();
                apuVar.hnj();
            }

            @Override // com.bytedance.sdk.openadsdk.common.apu.hnj
            public void hn() {
                ClipboardManager clipboardManager;
                if (TTWebsiteActivity.this.gjv != null) {
                    String url = TTWebsiteActivity.this.gjv.getUrl();
                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTWebsiteActivity.this.getSystemService("clipboard")) != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                    }
                }
                apuVar.hnj();
            }

            @Override // com.bytedance.sdk.openadsdk.common.apu.hnj
            public void hnj() {
                com.bytedance.sdk.component.ojm.dkl dklVar2 = TTWebsiteActivity.this.gjv;
                if (dklVar2 == null || dklVar2.getUrl() == null || TTWebsiteActivity.this.dkl == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.dkl.dkl dklVar3 = dklVar;
                if (dklVar3 != null) {
                    dklVar3.setVisibility(0);
                    dklVar.setProgress(0);
                }
                dklVar2.dse();
                String url = dklVar2.getUrl();
                if (url != null) {
                    dklVar2.a_(url);
                }
                apuVar.hnj();
            }

            @Override // com.bytedance.sdk.openadsdk.common.apu.hnj
            public void qor() {
                if (TTWebsiteActivity.this.gjv != null) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = TTWebsiteActivity.this.gjv.getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.hn.hnj(TTWebsiteActivity.this, intent, null);
                    }
                    apuVar.hnj();
                }
            }
        });
        apuVar.hnj(view);
    }
}
