package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class eum {
    private View apu;
    private final Context aq;
    private TextView as;
    private ImageView bug;
    private final RelativeLayout dkl;
    private ImageView dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private com.bytedance.sdk.openadsdk.core.dkl.sk f29do;
    private final as dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private boolean f13282fc;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    TTAdDislikeToast f13283hn;
    uua hnj;
    private final com.bytedance.sdk.component.ojm.dkl jip;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private final String f13284oj;
    private ImageView ojm;
    private ImageView orl;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    apu f13285sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.dkl.dkl f13286ta;
    private com.bytedance.sdk.openadsdk.core.widget.hnj.dkl.hnj uua;
    private TextView wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private boolean f13287xn;
    final AtomicBoolean qor = new AtomicBoolean(false);
    final AtomicBoolean gjv = new AtomicBoolean(false);
    private boolean eum = false;
    private final int mjg = sq.hn(com.bytedance.sdk.openadsdk.core.oj.hnj(), 44.0f);

    public eum(Context context, RelativeLayout relativeLayout, as asVar, com.bytedance.sdk.component.ojm.dkl dklVar, String str, boolean z10) {
        this.aq = context;
        this.dkl = relativeLayout;
        this.dse = asVar;
        this.jip = dklVar;
        this.f13284oj = str;
        this.f13287xn = z10;
        this.f13285sk = new apu(context, this.f13287xn);
        dse();
        aq();
    }

    private void aq() {
        View view = this.apu;
        if (view == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f13293a.hnj(view2);
            }
        });
    }

    private boolean dnm() {
        return this.aq.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    private void dse() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.dkl.getLayoutParams();
        layoutParams.height = this.mjg;
        this.dkl.setLayoutParams(layoutParams);
        int iHn = sq.hn(this.aq, 8.0f);
        this.dkl.setPadding(iHn, 0, iHn, 0);
        this.ojm = (ImageView) this.dkl.findViewById(com.bytedance.sdk.openadsdk.utils.jip.hkr);
        this.dnm = (ImageView) this.dkl.findViewById(com.bytedance.sdk.openadsdk.utils.jip.znr);
        this.bug = (ImageView) this.dkl.findViewById(com.bytedance.sdk.openadsdk.utils.jip.rq);
        this.orl = (ImageView) this.dkl.findViewById(520093740);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = (com.bytedance.sdk.openadsdk.core.dkl.sk) this.dkl.findViewById(com.bytedance.sdk.openadsdk.utils.jip.tll);
        this.f29do = skVar;
        this.wu = (TextView) skVar.findViewById(com.bytedance.sdk.openadsdk.utils.jip.hnj);
        this.as = (TextView) this.f29do.findViewById(com.bytedance.sdk.openadsdk.utils.jip.f14661hn);
        if (dnm()) {
            this.wu.setTextDirection(4);
            this.as.setTextDirection(4);
            this.wu.setGravity(8388629);
            this.as.setGravity(8388629);
            this.dnm.setImageResource(wu.gjv(this.aq, "tt_titlebar_forward"));
            this.bug.setImageResource(wu.gjv(this.aq, "tt_titlebar_backward"));
        }
        this.f13286ta = (com.bytedance.sdk.openadsdk.core.dkl.dkl) this.dkl.findViewById(com.bytedance.sdk.openadsdk.utils.jip.dy);
        this.bug.setVisibility(0);
        this.dnm.setVisibility(0);
        this.ojm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.eum.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (eum.this.jip != null) {
                    eum.this.jip.dse();
                    eum.this.jip.removeAllViews();
                    ViewGroup viewGroup = (ViewGroup) eum.this.jip.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(eum.this.jip);
                    }
                    eum.this.jip.jip();
                }
                if (eum.this.aq instanceof Activity) {
                    ((Activity) eum.this.aq).finish();
                }
            }
        });
        this.dnm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.eum.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (eum.this.jip == null || !eum.this.jip.ojm()) {
                    return;
                }
                if (eum.this.uua != null) {
                    eum.this.uua.hnj();
                }
                eum.this.jip.ta();
            }
        });
        this.bug.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.eum.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (eum.this.jip == null || !eum.this.jip.dnm()) {
                    return;
                }
                eum.this.jip.bug();
            }
        });
        this.orl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.eum.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                eum eumVar = eum.this;
                eumVar.hnj(eumVar.f13285sk, view);
            }
        });
        hnj(true);
        this.dnm.setClickable(false);
        this.bug.setClickable(false);
        ImageView imageView = this.dnm;
        int color = Color.parseColor("#A8FFFFFF");
        PorterDuff.Mode mode = PorterDuff.Mode.ADD;
        imageView.setColorFilter(color, mode);
        this.bug.setColorFilter(Color.parseColor("#A8FFFFFF"), mode);
        this.apu = this.dkl;
    }

    private void ta() {
        this.f13283hn.show(TTAdDislikeToast.getDislikeTip());
    }

    private void ojm() {
        try {
            if (this.hnj == null) {
                uua uuaVar = new uua(this.aq, this.dse);
                this.hnj = uuaVar;
                uuaVar.setDislikeSource(jyeoXJ.yjiEn);
                this.hnj.setCallback(new uua.hnj() { // from class: com.bytedance.sdk.openadsdk.common.eum.2
                    @Override // com.bytedance.sdk.openadsdk.common.uua.hnj
                    public void hn(View view) {
                        eum.this.qor.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.uua.hnj
                    public void hnj(View view) {
                        eum.this.qor.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.uua.hnj
                    public void hnj(FilterWord filterWord) {
                        if (eum.this.gjv.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        eum.this.gjv.set(true);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) this.dkl.getRootView().findViewById(R.id.content);
            frameLayout.addView(this.hnj);
            if (this.f13283hn == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.aq);
                this.f13283hn = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th2);
        }
    }

    protected void dkl() {
        if (this.gjv.get()) {
            ta();
            return;
        }
        if (this.hnj == null) {
            ojm();
        }
        uua uuaVar = this.hnj;
        if (uuaVar != null) {
            uuaVar.hnj();
        }
    }

    public TextView gjv() {
        return this.wu;
    }

    public ImageView qor() {
        return this.ojm;
    }

    public TextView sk() {
        return this.as;
    }

    private boolean gjv(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (char c10 : str.toCharArray()) {
            if (Character.getDirectionality(c10) == 1 || Character.getDirectionality(c10) == 2) {
                return true;
            }
        }
        return false;
    }

    public void hn() {
        try {
            final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.dkl.getLayoutParams();
            if (this.f13282fc) {
                return;
            }
            int i10 = layoutParams.height;
            int i11 = this.mjg;
            if (i10 == i11) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i11, i11 / 2);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.eum.9
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        eum.this.dkl.setLayoutParams(layoutParams);
                        eum.this.dkl.requestLayout();
                    }
                });
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.eum.10
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        eum.this.f13282fc = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        eum.this.f13282fc = true;
                        eum.this.hnj(8);
                        eum.this.hnj(false);
                        eum.this.eum = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }
                });
                valueAnimatorOfInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    public String qor(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String str2 = NhHRaDJCHtCTJR.PcubLDUlHzDO;
        if (zIsEmpty) {
            return str2;
        }
        try {
            String host = Uri.parse(str).getHost();
            if (!TextUtils.isEmpty(host)) {
                return host.startsWith("www.") ? host.substring(4) : host;
            }
        } catch (Exception unused) {
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void hnj(View view) {
        if (this.eum) {
            hnj();
            this.eum = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(final apu apuVar, View view) {
        apuVar.setOnMenuItemClickListener(new apu.hnj() { // from class: com.bytedance.sdk.openadsdk.common.eum.6
            @Override // com.bytedance.sdk.openadsdk.common.apu.hnj
            public void gjv() {
                if (!eum.this.f13287xn) {
                    eum.this.dkl();
                }
                apuVar.hnj();
            }

            @Override // com.bytedance.sdk.openadsdk.common.apu.hnj
            public void hn() {
                ClipboardManager clipboardManager;
                if (eum.this.jip != null) {
                    String url = eum.this.jip.getWebView().getUrl();
                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) eum.this.aq.getSystemService("clipboard")) != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                    }
                }
                apuVar.hnj();
            }

            @Override // com.bytedance.sdk.openadsdk.common.apu.hnj
            public void hnj() {
                if (eum.this.jip != null) {
                    eum.this.jip.aq();
                    if (eum.this.f13286ta != null) {
                        eum.this.f13286ta.setVisibility(0);
                        eum.this.f13286ta.setProgress(0);
                    }
                    apuVar.hnj();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.apu.hnj
            public void qor() {
                if (eum.this.jip != null) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = eum.this.jip.getWebView().getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.hn.hnj(eum.this.aq, intent, null);
                    }
                    apuVar.hnj();
                }
            }
        });
        apuVar.hnj(view);
    }

    public void hn(String str) {
        String strQor = qor(str);
        TextView textView = this.as;
        if (!TextUtils.isEmpty(strQor)) {
            str = strQor;
        }
        textView.setText(str);
    }

    void hnj(boolean z10) {
        if (this.wu == null || this.as == null) {
            return;
        }
        String string = gjv().getText().toString();
        String strReplaceAll = TextUtils.isEmpty(string) ? " " : string.replaceAll("[\n\r]+", " ");
        String string2 = sk().getText().toString();
        this.wu.setText(strReplaceAll);
        this.as.setText(string2);
        if (z10) {
            this.wu.setVisibility(0);
            com.bytedance.sdk.openadsdk.core.dkl.sk skVar = this.f29do;
            if (skVar != null) {
                ViewGroup.LayoutParams layoutParams = skVar.getLayoutParams();
                layoutParams.width = -2;
                this.f29do.setLayoutParams(layoutParams);
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.dkl.getLayoutParams();
            layoutParams2.height = this.mjg;
            this.dkl.setLayoutParams(layoutParams2);
            return;
        }
        this.wu.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar2 = this.f29do;
        if (skVar2 != null) {
            ViewGroup.LayoutParams layoutParams3 = skVar2.getLayoutParams();
            layoutParams3.width = -1;
            this.f29do.setLayoutParams(layoutParams3);
        }
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.dkl.getLayoutParams();
        layoutParams4.height = this.mjg / 2;
        this.dkl.setLayoutParams(layoutParams4);
    }

    public void hnj() {
        try {
            final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.dkl.getLayoutParams();
            if (this.f13282fc) {
                return;
            }
            int i10 = layoutParams.height;
            int i11 = this.mjg;
            if (i10 == i11 / 2) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i11 / 2, i11);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.eum.7
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        eum.this.dkl.setLayoutParams(layoutParams);
                        eum.this.dkl.requestLayout();
                    }
                });
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.eum.8
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        eum.this.f13282fc = false;
                        eum.this.hnj(0);
                        eum.this.hnj(true);
                        eum.this.eum = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        eum.this.f13282fc = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }
                });
                valueAnimatorOfInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    public void hnj(String str) {
        this.wu.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(int i10) {
        ImageView imageView = this.ojm;
        if (imageView != null) {
            imageView.setVisibility(i10);
        }
        ImageView imageView2 = this.dnm;
        if (imageView2 != null) {
            imageView2.setVisibility(i10);
        }
        ImageView imageView3 = this.bug;
        if (imageView3 != null) {
            imageView3.setVisibility(i10);
        }
        ImageView imageView4 = this.orl;
        if (imageView4 != null) {
            imageView4.setVisibility(i10);
        }
    }

    public void hnj(WebView webView, com.bytedance.sdk.openadsdk.core.widget.hnj.dkl.hnj hnjVar) {
        this.uua = hnjVar;
        try {
            if (this.dnm != null) {
                if (webView.canGoBack()) {
                    this.dnm.setClickable(true);
                    this.dnm.clearColorFilter();
                } else {
                    this.dnm.setClickable(false);
                    this.dnm.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.bug != null) {
                if (webView.canGoForward()) {
                    this.bug.setClickable(true);
                    this.bug.clearColorFilter();
                } else {
                    this.bug.setClickable(false);
                    this.bug.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
