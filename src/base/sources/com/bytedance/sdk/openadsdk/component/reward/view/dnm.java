package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.hnj.mjg;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.fc;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm {
    private int apu;
    View aq;
    private com.bytedance.sdk.openadsdk.core.widget.dnm as;
    mjg bug;
    FrameLayout dkl;
    RelativeLayout dnm;
    View dse;
    private boolean eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    public apu f13541fc;
    final as gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    final Activity f13542hn;
    com.bytedance.sdk.openadsdk.core.dkl.dkl jip;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private final boolean f13543oj;
    PAGLogoView ojm;
    protected final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    ImageView f13544sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    ImageView f13545ta;
    private gjv wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private final String f13546xn;
    int hnj = 3;
    protected int orl = 0;
    protected final AtomicBoolean mjg = new AtomicBoolean(false);
    Runnable uua = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.dnm.2
        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView;
            try {
                as asVar = dnm.this.gjv;
                if ((asVar == null || !asVar.ouk()) && (imageView = dnm.this.f13544sk) != null) {
                    int[] iArr = new int[2];
                    imageView.getLocationOnScreen(iArr);
                    dnm.this.qor.f13454gm.hnj(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    public dnm(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        this.qor = hnjVar;
        this.f13542hn = hnjVar.orp;
        this.gjv = hnjVar.f13456hn;
        this.f13546xn = hnjVar.f13461sk;
        this.f13543oj = hnjVar.gjv;
    }

    private void oj() {
        RelativeLayout relativeLayout;
        gjv gjvVar = (gjv) this.qor.fvt.findViewById(jip.mjg);
        this.wu = gjvVar;
        gjvVar.hnj(this.qor);
        com.bytedance.sdk.openadsdk.core.widget.dnm dnmVar = (com.bytedance.sdk.openadsdk.core.widget.dnm) this.qor.fvt.findViewById(jip.jle);
        this.as = dnmVar;
        if (dnmVar != null) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.qor;
            dnmVar.hnj(hnjVar.f13456hn, hnjVar.f13461sk, null);
        }
        this.ojm = (PAGLogoView) this.qor.fvt.findViewById(520093757);
        this.f13545ta = (ImageView) this.qor.fvt.findViewById(jip.mdk);
        this.f13544sk = (ImageView) this.qor.fvt.findViewById(520093708);
        this.dkl = (FrameLayout) this.qor.fvt.findViewById(jip.orl);
        this.dse = this.qor.fvt.findViewById(jip.f14672oj);
        this.aq = this.qor.fvt.findViewById(jip.f14675rd);
        this.dnm = (RelativeLayout) this.qor.fvt.findViewById(jip.ajq);
        mjg mjgVar = this.bug;
        if (mjgVar == null || mjgVar.gjv() == null || (relativeLayout = this.dnm) == null) {
            return;
        }
        relativeLayout.addView(this.bug.gjv(), new LinearLayout.LayoutParams(-1, -1));
        this.bug.hn();
    }

    protected void aq() {
        gjv gjvVar = this.wu;
        if (gjvVar == null) {
            return;
        }
        gjvVar.hnj();
    }

    public void bug() {
        try {
            mjg mjgVar = this.bug;
            if (mjgVar != null) {
                mjgVar.qor();
            }
            RelativeLayout relativeLayout = this.dnm;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.dnm;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    public FrameLayout dkl() {
        return this.dkl;
    }

    public View dnm() {
        return this.wu;
    }

    public void dse() {
        if (this.f13545ta.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f13545ta.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.f13545ta.setLayoutParams(marginLayoutParams);
        }
    }

    public void fc() {
        apu apuVar = this.f13541fc;
        if (apuVar != null) {
            apuVar.dse();
        }
    }

    public void gjv() {
        if (this.qor.f13456hn.xj() && hqh.qor(this.qor.f13456hn)) {
            return;
        }
        sq.hnj((View) this.dkl, 8);
        sq.hnj((View) this.as, 8);
        sq.hnj(this.dse, 8);
        sq.hnj(this.aq, 8);
        hn(8);
        sq.hnj((View) this.f13544sk, 8);
        sq.hnj((View) this.ojm, 8);
        sq.hnj((View) this.dnm, 8);
        sq.hnj((View) this.f13545ta, 8);
    }

    public void hn() {
        if (this.eum) {
            return;
        }
        this.eum = true;
        this.apu = this.qor.lu;
        if (hnj()) {
            mjg mjgVar = new mjg(this.qor);
            this.bug = mjgVar;
            mjgVar.hnj();
        }
        oj();
        Activity activity = this.f13542hn;
        as asVar = this.gjv;
        String str = this.f13546xn;
        FrameLayout frameLayout = this.dkl;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.qor;
        apu apuVar = new apu(activity, asVar, str, frameLayout, hnjVar.sq, hnjVar.fvt);
        this.f13541fc = apuVar;
        apuVar.hnj();
    }

    protected boolean hnj() {
        return true;
    }

    public void jip() {
        apu apuVar = this.f13541fc;
        if (apuVar != null) {
            apuVar.aq();
        }
    }

    public void mjg() {
        apu apuVar = this.f13541fc;
        if (apuVar != null) {
            apuVar.dkl();
        }
        ImageView imageView = this.f13544sk;
        if (imageView != null) {
            imageView.removeCallbacks(this.uua);
        }
    }

    public boolean ojm() {
        ImageView imageView = this.f13544sk;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public void orl() {
        try {
            Activity activity = this.qor.orp;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(activity, wu.ojm(activity, "tt_fade_out"));
            if (animationLoadAnimation == null) {
                this.qor.f13464ua.bug();
            } else {
                animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.dnm.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        dnm.this.qor.f13464ua.bug();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                this.qor.f13464ua.hnj(animationLoadAnimation);
            }
        } catch (Throwable unused) {
            this.qor.f13464ua.bug();
        }
    }

    public void qor() {
        this.dkl.removeAllViews();
    }

    void sk() {
        int iJle = this.gjv.jle();
        this.hnj = iJle;
        if (iJle == -200) {
            this.hnj = oj.gjv().fc(String.valueOf(this.gjv.atw()));
        }
        if (this.hnj != -1 || hnj()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.qor.f13460qb;
        if ((hnVar instanceof com.bytedance.sdk.openadsdk.component.reward.hn.gjv) || (hnVar instanceof com.bytedance.sdk.openadsdk.component.reward.hn.qor)) {
            return;
        }
        hn(0);
    }

    public View ta() {
        return this.f13544sk;
    }

    public void uua() {
        com.bytedance.sdk.openadsdk.core.qor.sk skVarSk = this.qor.tgn.sk();
        View view = this.wu;
        if (view == null) {
            view = this.qor.fvt;
        }
        skVarSk.onClick(view);
    }

    public void dkl(int i10) {
        sq.hnj((View) this.f13544sk, i10);
    }

    public void qor(int i10) {
        as asVar = this.gjv;
        if (asVar != null && asVar.xj() && hqh.qor(this.gjv)) {
            sq.hnj((View) this.as, i10);
        }
    }

    public void hnj(boolean z10) {
        sq.hnj((View) this.ojm, hqh.qor(this.gjv) ? 8 : 0);
        sq.hnj((View) this.f13545ta, (this.gjv.qs() && this.gjv.as()) ? 0 : 8);
        hn(z10);
        if (this.f13543oj) {
            sk();
        }
    }

    public void sk(int i10) {
        int i11 = this.hnj;
        if (i11 == -1 || i10 != i11 || this.mjg.get()) {
            return;
        }
        hn(0);
        this.mjg.set(true);
        aq();
    }

    public void hnj(int i10) {
        if (this.jip == null) {
            this.jip = new com.bytedance.sdk.openadsdk.core.dkl.dkl(this.qor.orp);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL);
            layoutParams.gravity = 17;
            this.jip.setLayoutParams(layoutParams);
            this.jip.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.dnm.hnj(this.qor.orp, "tt_video_loading_progress_bar"));
            this.qor.f13464ua.dkl().addView(this.jip);
        }
        this.jip.setVisibility(i10);
    }

    void hn(boolean z10) {
        ImageView imageView;
        int iHnj;
        if (this.apu != 1 && (imageView = this.f13544sk) != null && z10) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (iHnj = hnj("navigation_bar_height")) > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (iHnj > marginLayoutParams.rightMargin) {
                    marginLayoutParams.rightMargin = iHnj;
                }
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.qor.f13460qb;
        if ((hnVar instanceof com.bytedance.sdk.openadsdk.component.reward.hn.gjv) || (hnVar instanceof com.bytedance.sdk.openadsdk.component.reward.hn.qor)) {
            return;
        }
        hn(0);
    }

    public void gjv(int i10) {
        sq.hnj((View) this.ojm, i10);
    }

    public void hnj(int i10, int i11) {
        FrameLayout frameLayout;
        if (this.gjv.vh() == 1 && (frameLayout = this.dkl) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int iQor = sq.qor((Context) this.f13542hn);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.dkl.getLayoutParams();
            layoutParams.width = iQor;
            int i12 = (iQor * 9) / 16;
            layoutParams.height = i12;
            this.dkl.setLayoutParams(layoutParams);
            this.orl = (sq.sk(this.f13542hn) - i12) / 2;
        }
    }

    public void hn(int i10) {
        as asVar = this.gjv;
        if (asVar != null && asVar.qs() && fc.hnj(this.gjv)) {
            sq.hnj((View) this.wu, 8);
        } else {
            sq.hnj((View) this.wu, i10);
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.qor.qor qorVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        as asVar;
        if (this.dkl != null && (asVar = this.gjv) != null && asVar.dl() != null) {
            if (this.gjv.dl().dkl && !apu.hn(this.gjv)) {
                hnj((View.OnClickListener) qorVar);
                hnj(qorVar);
            } else {
                hnj(onClickListener);
            }
        }
        as asVar2 = this.gjv;
        if (asVar2 != null && asVar2.vh() == 1) {
            if (this.gjv.dl() != null && (view2 = this.dse) != null) {
                sq.hnj(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.dse.getLayoutParams();
                layoutParams.height = this.orl;
                this.dse.setLayoutParams(layoutParams);
                if (this.gjv.dl().f13953hn) {
                    this.dse.setOnClickListener(qorVar);
                    this.dse.setOnTouchListener(onTouchListener);
                } else {
                    this.dse.setOnClickListener(onClickListener);
                }
            }
            if (this.gjv.dl() != null && (view = this.aq) != null) {
                sq.hnj(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.aq.getLayoutParams();
                layoutParams2.height = this.orl;
                this.aq.setLayoutParams(layoutParams2);
                if (this.gjv.dl().gjv) {
                    this.aq.setOnClickListener(qorVar);
                    this.aq.setOnTouchListener(onTouchListener);
                } else {
                    this.aq.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.ojm;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.dnm.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    try {
                        dnm dnmVar = dnm.this;
                        TTWebsiteActivity.hnj(dnmVar.f13542hn, dnmVar.gjv, dnmVar.f13546xn);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.apu.qor("TTAD.RFullVideoLayout", th2.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.f13545ta;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.apu.hn.hn().hnj((int) sq.hnj(oj.hnj(), 14.0f, true), this.f13545ta, this.qor.f13456hn);
        }
    }

    private int hnj(String str) {
        Resources resources = this.f13542hn.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    public void hnj(View.OnClickListener onClickListener) {
        sq.hnj(this.dkl, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void hnj(com.bytedance.sdk.openadsdk.core.qor.qor qorVar) {
        sq.hnj((View) this.dkl, (View.OnTouchListener) qorVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public void hnj(float f10) {
        sq.hnj(this.f13544sk, f10);
    }

    public void hnj(Animation animation) {
        RelativeLayout relativeLayout = this.dnm;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }

    public void hnj(int i10, com.bytedance.sdk.component.adexpress.hn.mjg mjgVar) {
        apu apuVar = this.f13541fc;
        if (apuVar != null) {
            apuVar.hnj(i10, mjgVar);
        }
    }
}
