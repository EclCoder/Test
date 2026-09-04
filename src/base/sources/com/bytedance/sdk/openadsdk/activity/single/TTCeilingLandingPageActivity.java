package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.vf;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.hqh;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.xn;
import com.bytedance.sdk.openadsdk.core.ua;
import com.bytedance.sdk.openadsdk.gjv.orl;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class TTCeilingLandingPageActivity extends TTBaseLandingPageActivity {
    private orl aq;
    private com.bytedance.sdk.component.ojm.dkl bug;
    private int dkl;
    private com.bytedance.sdk.openadsdk.common.sk dnm;
    private String dse;
    private String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private as f13051hn;
    hnj hnj;
    private ua qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private String f13052sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj();
    }

    private void qor() {
        ua uaVar = new ua(this);
        this.qor = uaVar;
        uaVar.hn(this.bug).qor(this.gjv).gjv(this.f13052sk).hnj(this.f13051hn).hn(this.dkl).hnj(this.f13051hn.af()).sk(this.f13051hn.nl()).hnj(this.bug).hn("landingpage_split_ceiling");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fc.sk()) {
            finish();
            return;
        }
        Intent intent = getIntent();
        this.dkl = intent.getIntExtra("source", -1);
        as asVarHnj = hqh.hnj().hnj(hqh.hnj(intent));
        this.f13051hn = asVarHnj;
        if (asVarHnj == null) {
            finish();
            return;
        }
        this.dse = asVarHnj.dnm();
        this.gjv = this.f13051hn.sp();
        this.f13052sk = this.f13051hn.ldn();
        this.dkl = this.f13051hn.aip().getDurationSlotType() != 7 ? 5 : 7;
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(this);
        hnj(this, qorVar);
        setContentView(qorVar);
        qor();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.component.ojm.dkl dklVar = this.bug;
        if (dklVar != null) {
            vf.hnj(dklVar);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        orl orlVar = this.aq;
        if (orlVar != null) {
            orlVar.aq();
        }
    }

    private void hnj(Context context, FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar;
        this.bug = new com.bytedance.sdk.component.ojm.dkl(context, com.bytedance.sdk.component.ojm.dkl.qor.LANDING_PAGE);
        frameLayout.addView(this.bug, new FrameLayout.LayoutParams(-1, -1));
        View viewHn = com.bytedance.sdk.openadsdk.core.widget.dkl.hn(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = sq.hn(context, 18.0f);
        layoutParams.rightMargin = sq.hn(context, 18.0f);
        frameLayout.addView(viewHn, layoutParams);
        final int iDse = this.f13051hn.tgn().dse();
        if (iDse != 3) {
            gjvVar = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(sq.hn(context, 28.0f), sq.hn(context, 28.0f));
            layoutParams2.gravity = 8388659;
            layoutParams2.topMargin = sq.hn(context, 18.0f);
            layoutParams2.leftMargin = sq.hn(context, 18.0f);
            int iHn = sq.hn(context, 5.0f);
            gjvVar.setPadding(iHn, iHn, iHn, iHn);
            gjvVar.setScaleType(ImageView.ScaleType.FIT_XY);
            gjvVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.gjv.hnj());
            gjvVar.setImageDrawable(wu.qor(context, "tt_white_lefterbackicon_titlebar"));
            frameLayout.addView(gjvVar, layoutParams2);
        } else {
            gjvVar = null;
        }
        com.bytedance.sdk.openadsdk.utils.wu.hnj(this.bug, this.dse);
        final WebView webView = this.bug.getWebView();
        viewHn.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTCeilingLandingPageActivity.this.finish();
            }
        });
        orl orlVar = new orl(this.f13051hn, webView, true);
        this.aq = orlVar;
        orlVar.hnj("landingpage_split_ceiling");
        final com.bytedance.sdk.openadsdk.core.widget.hnj.dkl.hnj hnjVar = this.aq.hnj;
        if (gjvVar != null) {
            gjvVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int i10 = iDse;
                    if (i10 == 1) {
                        TTCeilingLandingPageActivity.this.finish();
                    } else if (i10 != 2) {
                        return;
                    }
                    WebView webView2 = webView;
                    if (webView2 == null || !webView2.canGoBack()) {
                        TTCeilingLandingPageActivity.this.finish();
                        return;
                    }
                    webView.goBack();
                    com.bytedance.sdk.openadsdk.core.widget.hnj.dkl.hnj hnjVar2 = hnjVar;
                    if (hnjVar2 != null) {
                        hnjVar2.hnj();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.common.sk skVarHnj = orp.hnj(this.f13051hn, this.bug, this, "landingpage_split_ceiling");
        this.dnm = skVarHnj;
        if (skVarHnj != null) {
            skVarHnj.hnj("landingpage_split_ceiling");
            this.dnm.hnj();
        }
        orp.hnj(this.f13051hn, this.bug, true);
        this.hnj = new hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.hnj
            public void hnj() {
                if (TTCeilingLandingPageActivity.this.f13051hn.tgn().aq() == xn.f14014hn) {
                    TTCeilingLandingPageActivity.this.finish();
                }
            }
        };
        com.bytedance.sdk.openadsdk.core.widget.hnj.sk skVar = new com.bytedance.sdk.openadsdk.core.widget.hnj.sk(this, this.qor, this.gjv, this.dnm, this.aq, true, true, this.hnj) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
            }
        };
        skVar.hnj(this.f13051hn);
        com.bytedance.sdk.openadsdk.core.widget.hnj.gjv gjvVar2 = new com.bytedance.sdk.openadsdk.core.widget.hnj.gjv(this.qor, this.aq, this.dnm) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.gjv, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView2, int i10) {
                super.onProgressChanged(webView2, i10);
            }
        };
        com.bytedance.sdk.component.ojm.dkl dklVar = this.bug;
        if (dklVar != null) {
            dklVar.setWebViewClient(skVar);
            this.bug.setWebChromeClient(gjvVar2);
        }
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.6
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (TTCeilingLandingPageActivity.this.aq == null) {
                        return false;
                    }
                    TTCeilingLandingPageActivity.this.aq.hnj(motionEvent);
                    return false;
                }
            });
            webView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.7
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    if (TTCeilingLandingPageActivity.this.aq != null) {
                        TTCeilingLandingPageActivity.this.aq.hn(i11);
                    }
                }
            });
        }
    }
}
