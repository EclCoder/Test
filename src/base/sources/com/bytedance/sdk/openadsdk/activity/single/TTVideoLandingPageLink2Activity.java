package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.bug;
import com.bytedance.sdk.openadsdk.common.uua;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.mjg;
import com.bytedance.sdk.openadsdk.gjv.orl;
import com.bytedance.sdk.openadsdk.utils.dnm;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements com.bytedance.sdk.openadsdk.dnm.gjv {
    private com.bytedance.sdk.openadsdk.common.sk dy;
    private long fr;
    private com.bytedance.sdk.openadsdk.core.widget.hnj.sk hkr;
    private PAGLogoView idl;
    private View izk;

    /* JADX INFO: renamed from: ka, reason: collision with root package name */
    private View f13116ka;
    private TextView lhi;
    TTAdDislikeToast lu;
    private boolean mkl;

    /* JADX INFO: renamed from: qb, reason: collision with root package name */
    private TextView f13117qb;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    uua f13118xo;
    private bug zt;

    /* JADX INFO: renamed from: gn, reason: collision with root package name */
    private boolean f13115gn = false;
    final AtomicBoolean rmr = new AtomicBoolean(false);
    final AtomicBoolean eta = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public void apu() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.lu) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jip() {
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(this.jip, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    private void oj() {
        TTAdDislikeToast tTAdDislikeToast = this.lu;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uua() {
        bug bugVar = this.zt;
        if (bugVar != null) {
            bugVar.hn();
        }
    }

    private void xn() {
        try {
            if (this.f13118xo == null) {
                uua uuaVar = new uua(this.f13105sk, this.jip);
                this.f13118xo = uuaVar;
                uuaVar.setDislikeSource("landing_page");
                this.f13118xo.setCallback(new uua.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.4
                    @Override // com.bytedance.sdk.openadsdk.common.uua.hnj
                    public void hn(View view) {
                        TTVideoLandingPageLink2Activity.this.rmr.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.uua.hnj
                    public void hnj(View view) {
                        TTVideoLandingPageLink2Activity.this.rmr.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.uua.hnj
                    public void hnj(FilterWord filterWord) {
                        if (TTVideoLandingPageLink2Activity.this.eta.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTVideoLandingPageLink2Activity.this.eta.set(true);
                        TTVideoLandingPageLink2Activity.this.apu();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.f13118xo);
            if (this.lu == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.f13105sk);
                this.lu = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th2);
        }
    }

    protected void fc() {
        if (isFinishing()) {
            return;
        }
        if (this.eta.get()) {
            oj();
            return;
        }
        if (this.f13118xo == null) {
            xn();
        }
        uua uuaVar = this.f13118xo;
        if (uuaVar != null) {
            uuaVar.hnj();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        bug bugVar = this.zt;
        if (bugVar != null) {
            bugVar.hnj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        as asVar;
        com.bytedance.sdk.component.ojm.dkl dklVar;
        super.onCreate(bundle);
        if (!fc.sk() || (asVar = this.jip) == null || (dklVar = ((TTVideoLandingPageActivity) this).hnj) == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.common.sk skVarHnj = orp.hnj(asVar, dklVar, this.f13105sk, this.pty);
        this.dy = skVarHnj;
        if (skVarHnj != null) {
            skVarHnj.hnj("landingpage_split_screen");
        }
        if (((TTVideoLandingPageActivity) this).hnj.getWebView() != null) {
            ((TTVideoLandingPageActivity) this).hnj.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.1
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    orl orlVar = TTVideoLandingPageLink2Activity.this.jbd;
                    if (orlVar != null) {
                        orlVar.hn(i11);
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.widget.hnj.sk skVar = new com.bytedance.sdk.openadsdk.core.widget.hnj.sk(this.f13105sk, this.aq, this.dkl, this.dy, this.jbd, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.f13116ka != null && !TTVideoLandingPageLink2Activity.this.mkl) {
                        TTVideoLandingPageLink2Activity.this.f13116ka.setVisibility(8);
                    }
                    TTVideoLandingPageLink2Activity.this.f13115gn = true;
                    TTVideoLandingPageLink2Activity.this.uua();
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.gjv.qor.hnj(tTVideoLandingPageLink2Activity.jip, tTVideoLandingPageLink2Activity.pty, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.fr, true);
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                TTVideoLandingPageLink2Activity.this.fr = System.currentTimeMillis();
            }
        };
        this.hkr = skVar;
        skVar.hnj(this.jip);
        ((TTVideoLandingPageActivity) this).hnj.setWebViewClient(this.hkr);
        ((TTVideoLandingPageActivity) this).hnj.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.hnj.gjv(this.aq, this.jbd, this.dy) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.gjv, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                super.onProgressChanged(webView, i10);
                if (TTVideoLandingPageLink2Activity.this.zt != null) {
                    TTVideoLandingPageLink2Activity.this.zt.hnj(i10);
                }
            }
        });
        TextView textView = (TextView) findViewById(jip.f14655da);
        if (textView != null && this.jip.m31do() != null) {
            textView.setText(this.jip.m31do().sk());
        }
        as asVar2 = this.jip;
        fc.qor().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTVideoLandingPageLink2Activity.this.mkl = true;
                    if (TTVideoLandingPageLink2Activity.this.zt != null) {
                        TTVideoLandingPageLink2Activity.this.zt.hn();
                    }
                    TTVideoLandingPageLink2Activity.this.izk.setVisibility(0);
                    if (TTVideoLandingPageLink2Activity.this.idl != null) {
                        TTVideoLandingPageLink2Activity.this.idl.setVisibility(0);
                    }
                    if (TTVideoLandingPageLink2Activity.this.f13115gn) {
                        return;
                    }
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.gjv.qor.hnj(tTVideoLandingPageLink2Activity.jip, tTVideoLandingPageLink2Activity.pty, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.fr, false);
                } catch (Exception unused) {
                }
            }
        }, (asVar2 == null || asVar2.m31do() == null) ? 10000L : this.jip.m31do().hnj() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        uua();
        if (!this.mkl && this.jbd != null && ((TTVideoLandingPageActivity) this).hnj != null && this.zt.getVisibility() == 8) {
            this.jbd.hnj(((TTVideoLandingPageActivity) this).hnj);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    protected boolean aq() {
        int i10 = this.orl;
        return i10 == 5 || i10 == 15 || i10 == 50;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    public void bug() {
        super.bug();
        as asVar = this.jip;
        if (asVar != null) {
            asVar.mjg(true);
        }
        TextView textView = this.f13117qb;
        if (textView != null) {
            textView.setText(gjv());
            this.f13117qb.setClickable(true);
            this.f13117qb.setOnClickListener(this.pv);
            this.f13117qb.setOnTouchListener(this.pv);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    protected void dkl() {
        if (!aq()) {
            try {
                ImageView imageView = new ImageView(this);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.jip.lx().get(0), imageView, this.jip);
                this.bug.setVisibility(0);
                this.bug.removeAllViews();
                this.bug.addView(imageView);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        com.bytedance.sdk.openadsdk.gjv.qor.hn(TTVideoLandingPageLink2Activity.this.jip, "landingpage_split_screen");
                    }
                });
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.dkl();
        com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar = this.mjg;
        if (dklVar != null) {
            if (dklVar.getNativeVideoController() != null) {
                this.mjg.getNativeVideoController().hnj(false);
                this.mjg.getNativeVideoController().dkl(false);
                this.bug.setClickable(true);
                this.bug.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.12
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 0) {
                            return false;
                        }
                        TTVideoLandingPageLink2Activity.this.jip();
                        return false;
                    }
                });
            }
            this.mjg.getNativeVideoController().hnj(new c.InterfaceC0870c() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.2
                @Override // x6.c.InterfaceC0870c
                public void hnj() {
                }

                @Override // x6.c.InterfaceC0870c
                public void hnj(long j10, int i10) {
                }

                @Override // x6.c.InterfaceC0870c
                public void hnj(long j10, long j11) {
                    if (TTVideoLandingPageLink2Activity.this.lhi != null) {
                        int iMax = (int) Math.max(0L, (j11 - j10) / 1000);
                        TTVideoLandingPageLink2Activity.this.lhi.setText(String.valueOf(iMax));
                        if (iMax <= 0) {
                            TTVideoLandingPageLink2Activity.this.lhi.setVisibility(8);
                        }
                    }
                }

                @Override // x6.c.InterfaceC0870c
                public void hn(long j10, int i10) {
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    protected View qor() {
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(this);
        if (Build.VERSION.SDK_INT >= 35) {
            skVar.setFitsSystemWindows(true);
        }
        skVar.setOrientation(1);
        skVar.setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(this);
        skVar.addView(qorVar, new LinearLayout.LayoutParams(-1, sq.hn(this, 220.0f)));
        View qorVar2 = new com.bytedance.sdk.openadsdk.core.dkl.qor(this);
        qorVar2.setId(jip.sq);
        qorVar.addView(qorVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar2 = new com.bytedance.sdk.openadsdk.core.dkl.sk(this);
        skVar2.setOrientation(0);
        skVar2.setPadding(0, sq.hn(this, 20.0f), 0, 0);
        qorVar.addView(skVar2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        skVar2.addView(view, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.fc fcVar = new com.bytedance.sdk.openadsdk.core.widget.fc(this);
        fcVar.setId(520093713);
        fcVar.setGravity(17);
        fcVar.setText(wu.hnj(this, "tt_reward_feedback"));
        fcVar.setTextColor(-1);
        fcVar.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, sq.hn(this, 28.0f));
        int iHn = sq.hn(this, 16.0f);
        layoutParams2.rightMargin = iHn;
        layoutParams2.leftMargin = iHn;
        skVar2.addView(fcVar, layoutParams2);
        mjg mjgVar = new mjg(this);
        mjgVar.setId(jip.jbd);
        mjgVar.setPadding(sq.hn(this, 7.0f), sq.hn(this, 7.0f), sq.hn(this, 7.0f), sq.hn(this, 7.0f));
        mjgVar.setImageResource(wu.gjv(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(sq.hn(this, 28.0f), sq.hn(this, 28.0f));
        layoutParams3.rightMargin = sq.hn(this, 12.0f);
        skVar2.addView(mjgVar, layoutParams3);
        com.bytedance.sdk.openadsdk.core.dkl.dse dseVar = new com.bytedance.sdk.openadsdk.core.dkl.dse(this);
        dseVar.setVisibility(8);
        dseVar.setId(jip.f14658ff);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = sq.hn(this, 10.0f);
        skVar.addView(dseVar, layoutParams4);
        com.bytedance.sdk.openadsdk.core.widget.hnj hnjVar = new com.bytedance.sdk.openadsdk.core.widget.hnj(this);
        hnjVar.setId(jip.xad);
        hnjVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        hnjVar.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(sq.hn(this, 44.0f), sq.hn(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = sq.hn(this, 5.0f);
        dseVar.addView(hnjVar, layoutParams5);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(this);
        int i10 = jip.f14654cm;
        aqVar.setId(i10);
        aqVar.setBackground(dnm.hnj(this, "tt_circle_solid_mian"));
        aqVar.setGravity(17);
        aqVar.setTextColor(-1);
        aqVar.setTextSize(2, 19.0f);
        aqVar.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(sq.hn(this, 44.0f), sq.hn(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = sq.hn(this, 5.0f);
        dseVar.addView(aqVar, layoutParams6);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar2 = new com.bytedance.sdk.openadsdk.core.dkl.aq(this);
        aqVar2.setId(jip.dzo);
        aqVar2.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        aqVar2.setEllipsize(truncateAt);
        aqVar2.setTextColor(Color.parseColor("#e5000000"));
        aqVar2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15);
        layoutParams7.leftMargin = sq.hn(this, 5.0f);
        layoutParams7.rightMargin = sq.hn(this, 80.0f);
        layoutParams7.addRule(1, i10);
        dseVar.addView(aqVar2, layoutParams7);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar3 = new com.bytedance.sdk.openadsdk.core.dkl.aq(this);
        aqVar3.setId(jip.pnz);
        aqVar3.setClickable(true);
        aqVar3.setMaxLines(1);
        aqVar3.setEllipsize(truncateAt);
        aqVar3.setFocusable(true);
        aqVar3.setGravity(17);
        aqVar3.setText(wu.hnj(this, "tt_video_mobile_go_detail"));
        aqVar3.setTextColor(-1);
        aqVar3.setTextSize(2, 14.0f);
        aqVar3.setPadding(sq.hn(this, 2.0f), sq.hn(this, 2.0f), sq.hn(this, 2.0f), sq.hn(this, 2.0f));
        aqVar3.setBackground(dnm.hnj(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(sq.hn(this, 90.0f), sq.hn(this, 36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = sq.hn(this, 5.0f);
        dseVar.addView(aqVar3, layoutParams8);
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar3 = new com.bytedance.sdk.openadsdk.core.dkl.qor(this);
        skVar.addView(qorVar3, new LinearLayout.LayoutParams(-1, -1));
        View dklVar = new com.bytedance.sdk.component.ojm.dkl(this, com.bytedance.sdk.component.ojm.dkl.qor.LANDING_PAGE);
        dklVar.setId(jip.pv);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams9.topMargin = sq.hn(this, 2.0f);
        qorVar3.addView(dklVar, layoutParams9);
        com.bytedance.sdk.openadsdk.core.dkl.dse dseVar2 = new com.bytedance.sdk.openadsdk.core.dkl.dse(this);
        dseVar2.setId(jip.f14694xo);
        dseVar2.setBackgroundColor(Color.parseColor("#F8F8F8"));
        qorVar3.addView(dseVar2, new FrameLayout.LayoutParams(-1, -1));
        View bugVar = new bug(this);
        bugVar.setId(jip.lu);
        dseVar2.addView(bugVar, new RelativeLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar3 = new com.bytedance.sdk.openadsdk.core.dkl.sk(this);
        skVar3.setId(jip.orp);
        skVar3.setOrientation(1);
        skVar3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.addRule(13);
        dseVar2.addView(skVar3, layoutParams10);
        com.bytedance.sdk.openadsdk.core.widget.uua uuaVar = new com.bytedance.sdk.openadsdk.core.widget.uua(this);
        uuaVar.setId(jip.rmr);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(sq.hn(this, 80.0f), sq.hn(this, 80.0f));
        layoutParams11.gravity = 17;
        skVar3.addView(uuaVar, layoutParams11);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar4 = new com.bytedance.sdk.openadsdk.core.dkl.aq(this);
        aqVar4.setId(jip.eta);
        aqVar4.setTextColor(Color.parseColor("#161823"));
        aqVar4.setTextSize(0, sq.hn(this, 24.0f));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        layoutParams12.topMargin = sq.hn(this, 12.0f);
        skVar3.addView(aqVar4, layoutParams12);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar5 = new com.bytedance.sdk.openadsdk.core.dkl.aq(this);
        aqVar5.setId(jip.zt);
        aqVar5.setTextColor(Color.parseColor("#80161823"));
        aqVar5.setTextSize(0, sq.hn(this, 16.0f));
        aqVar5.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams13.gravity = 17;
        int iHn2 = sq.hn(this, 60.0f);
        layoutParams13.rightMargin = iHn2;
        layoutParams13.leftMargin = iHn2;
        layoutParams13.topMargin = sq.hn(this, 8.0f);
        skVar3.addView(aqVar5, layoutParams13);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar6 = new com.bytedance.sdk.openadsdk.core.dkl.aq(this);
        aqVar6.setId(jip.f14665ka);
        aqVar6.setGravity(17);
        aqVar6.setTextColor(-1);
        aqVar6.setText(wu.hnj(this, "tt_video_mobile_go_detail"));
        aqVar6.setBackground(dnm.hnj(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(sq.hn(this, 255.0f), sq.hn(this, 44.0f));
        layoutParams14.gravity = 17;
        layoutParams14.topMargin = sq.hn(this, 32.0f);
        skVar3.addView(aqVar6, layoutParams14);
        PAGLogoView pAGLogoView = new PAGLogoView(this);
        this.idl = pAGLogoView;
        pAGLogoView.setId(jip.izk);
        this.idl.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, sq.hn(this, 14.0f));
        layoutParams15.addRule(12);
        layoutParams15.leftMargin = sq.hn(this, 18.0f);
        layoutParams15.bottomMargin = sq.hn(this, 61.0f);
        dseVar2.addView(this.idl, layoutParams15);
        View fcVar2 = new com.bytedance.sdk.openadsdk.common.fc(this, new com.bytedance.sdk.openadsdk.common.fc.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.8
            @Override // com.bytedance.sdk.openadsdk.common.fc.hnj
            public View hnj(Context context) {
                return new com.bytedance.sdk.openadsdk.common.aq(context);
            }
        });
        fcVar2.setId(jip.mkl);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, sq.hn(this, 48.0f));
        layoutParams16.gravity = 81;
        qorVar3.addView(fcVar2, layoutParams16);
        return skVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    protected void sk() {
        super.sk();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(wu.hnj(oj.hnj(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTVideoLandingPageLink2Activity.this.fc();
                }
            });
        }
        this.lhi = (TextView) findViewById(520093714);
        this.zt = (bug) findViewById(jip.lu);
        this.f13116ka = findViewById(jip.f14694xo);
        this.izk = findViewById(jip.orp);
        TextView textView2 = (TextView) findViewById(jip.eta);
        TextView textView3 = (TextView) findViewById(jip.zt);
        com.bytedance.sdk.openadsdk.core.widget.uua uuaVar = (com.bytedance.sdk.openadsdk.core.widget.uua) findViewById(jip.rmr);
        this.f13117qb = (TextView) findViewById(jip.f14665ka);
        if (this.jip.mn() != null && !TextUtils.isEmpty(this.jip.mn().hnj())) {
            com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.jip.mn(), uuaVar, this.jip);
        }
        textView2.setText(this.jip.mw());
        textView3.setText(this.jip.br());
        View viewFindViewById = findViewById(jip.izk);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                TTWebsiteActivity.hnj(tTVideoLandingPageLink2Activity.f13105sk, tTVideoLandingPageLink2Activity.jip, tTVideoLandingPageLink2Activity.pty);
            }
        });
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.jip);
        }
        com.bytedance.sdk.component.ojm.dkl dklVar = ((TTVideoLandingPageActivity) this).hnj;
        if (dklVar != null && dklVar.getWebView() != null) {
            orp.hnj(this.jip, ((TTVideoLandingPageActivity) this).hnj);
        }
        if (((TTVideoLandingPageActivity) this).hnj.getWebView() != null) {
            ((TTVideoLandingPageActivity) this).hnj.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.11
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    orl orlVar = TTVideoLandingPageLink2Activity.this.jbd;
                    if (orlVar != null) {
                        orlVar.hnj(motionEvent);
                    }
                    if (TTVideoLandingPageLink2Activity.this.dy == null) {
                        return false;
                    }
                    TTVideoLandingPageLink2Activity.this.dy.hnj(motionEvent);
                    return false;
                }
            });
        }
        bug bugVar = this.zt;
        if (bugVar != null) {
            bugVar.hnj(this.jip);
        }
    }
}
