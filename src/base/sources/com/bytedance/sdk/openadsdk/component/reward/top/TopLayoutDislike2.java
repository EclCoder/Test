package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.core.dkl.aq;
import com.bytedance.sdk.openadsdk.core.dkl.gjv;
import com.bytedance.sdk.openadsdk.core.dkl.sk;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.model.tu;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.widget.dkl;
import com.bytedance.sdk.openadsdk.utils.dnm;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class TopLayoutDislike2 extends sk implements hnj<TopLayoutDislike2> {
    sk container;
    private boolean hasCutDown;
    private boolean hasShowClose;
    private boolean isVast;
    private gjv mCloseBtn;
    private View mImgDislike;
    private ImageView mImgSound;
    private boolean mIsSoundMute;
    private TextView mNextAdTextTv;
    private sk mPlayableNextAd;
    private com.bytedance.sdk.openadsdk.core.bug.hn.gjv.hnj mProgressBar;
    private int mProgressBgColor;
    private int mProgressColor;
    private int mProgressRadiusSize;
    private com.bytedance.sdk.openadsdk.core.bug.hn.gjv.hnj mProgressRing;
    private int mProgressSize;
    private CharSequence mProgressStr;
    private int mProgressType;
    private ImageView mSkipIV;
    private TextView mTextViewCountDown;
    private hn mTopListener;
    private boolean shouldShowSkipTime;
    private int skipTime;
    private int videoDuration;

    public TopLayoutDislike2(Context context) {
        this(context, null);
    }

    private ImageView getCommonRingBGImageView() {
        gjv gjvVar = new gjv(getContext());
        int iHn = sq.hn(getContext(), 5.0f);
        gjvVar.setPadding(iHn, iHn, iHn, iHn);
        gjvVar.setScaleType(ImageView.ScaleType.CENTER);
        gjvVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.gjv.hnj());
        return gjvVar;
    }

    private void initListener() {
        View view = this.mImgDislike;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.hn(view2);
                    }
                }
            });
        }
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Drawable drawableHnj;
                    TopLayoutDislike2 topLayoutDislike2 = TopLayoutDislike2.this;
                    topLayoutDislike2.mIsSoundMute = !topLayoutDislike2.mIsSoundMute;
                    if (TopLayoutDislike2.this.mSkipIV != null) {
                        drawableHnj = TopLayoutDislike2.this.mIsSoundMute ? wu.qor(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute") : wu.qor(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute");
                    } else {
                        drawableHnj = TopLayoutDislike2.this.mIsSoundMute ? dnm.hnj(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper") : dnm.hnj(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper");
                    }
                    TopLayoutDislike2.this.mImgSound.setImageDrawable(drawableHnj);
                    if (TopLayoutDislike2.this.mImgSound.getDrawable() != null) {
                        TopLayoutDislike2.this.mImgSound.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        Object tag = TopLayoutDislike2.this.mImgSound.getTag(TopLayoutDislike2.this.mImgSound.getId());
                        TopLayoutDislike2.this.mTopListener.hnj(view2, tag instanceof String ? tag.toString() : "nativeClick");
                    }
                    TopLayoutDislike2.this.mImgSound.setTag(TopLayoutDislike2.this.mImgSound.getId(), null);
                }
            });
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.hnj(view2);
                    }
                }
            });
        } else {
            TextView textView = this.mTextViewCountDown;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TopLayoutDislike2.this.mTopListener != null) {
                            TopLayoutDislike2.this.mTopListener.hnj(view2);
                        }
                    }
                });
            }
        }
        gjv gjvVar = this.mCloseBtn;
        if (gjvVar != null) {
            gjvVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.qor(view2);
                    }
                }
            });
        }
        sk skVar = this.mPlayableNextAd;
        if (skVar != null) {
            skVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.gjv(view2);
                    }
                }
            });
        }
    }

    private void initProgressBar(as asVar) {
        tu tuVarTa;
        tu.hn hnVarUua;
        if (asVar == null || asVar.gjv() == null || asVar.gjv().ta() == null || (tuVarTa = asVar.gjv().ta()) == null || tuVarTa.uua() == null || (hnVarUua = tuVarTa.uua()) == null) {
            return;
        }
        if (!TextUtils.isEmpty(hnVarUua.hn())) {
            this.mProgressColor = com.bytedance.adsdk.ugeno.dse.hnj.hnj(hnVarUua.hn());
        }
        if (!TextUtils.isEmpty(hnVarUua.qor())) {
            this.mProgressBgColor = com.bytedance.adsdk.ugeno.dse.hnj.hnj(hnVarUua.qor());
        }
        if (hnVarUua.gjv() <= 0.0f) {
            this.mProgressSize = sq.hn(getContext(), 1.0f);
        } else {
            this.mProgressSize = sq.hn(getContext(), hnVarUua.gjv());
        }
        if (hnVarUua.sk() > 0.0f) {
            this.mProgressRadiusSize = sq.hn(getContext(), hnVarUua.sk());
        }
        this.mProgressType = hnVarUua.hnj();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void initView(as asVar) {
        sk skVar = new sk(getContext());
        this.container = skVar;
        skVar.setOrientation(0);
        int iHn = sq.hn(getContext(), 16.0f);
        int iHn2 = sq.hn(getContext(), 12.0f);
        int iHn3 = sq.hn(getContext(), 24.0f);
        int iHn4 = sq.hn(getContext(), 28.0f);
        ImageView commonRingBGImageView = getCommonRingBGImageView();
        this.mImgDislike = commonRingBGImageView;
        commonRingBGImageView.setId(520093713);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iHn4, iHn4);
        layoutParams.topMargin = iHn3;
        layoutParams.leftMargin = iHn;
        this.mImgDislike.setLayoutParams(layoutParams);
        this.mImgSound = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iHn4, iHn4);
        layoutParams2.leftMargin = iHn2;
        layoutParams2.topMargin = iHn3;
        this.mImgSound.setId(jip.fzx);
        this.mImgSound.setLayoutParams(layoutParams2);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        aq aqVar = new aq(getContext());
        this.mTextViewCountDown = aqVar;
        aqVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.gjv.hn());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, sq.hn(getContext(), 28.0f));
        layoutParams4.topMargin = iHn3;
        layoutParams4.rightMargin = iHn;
        this.mTextViewCountDown.setPadding(iHn2, 0, iHn2, 0);
        this.mTextViewCountDown.setLayoutParams(layoutParams4);
        this.mTextViewCountDown.setGravity(17);
        this.mTextViewCountDown.setTextColor(-1);
        this.mTextViewCountDown.setTextSize(14.0f);
        this.mTextViewCountDown.setVisibility(8);
        sk skVar2 = new sk(getContext());
        this.mPlayableNextAd = skVar2;
        skVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, iHn4);
        layoutParams5.topMargin = iHn3;
        if (asVar == null || !asVar.btk()) {
            layoutParams5.rightMargin = iHn;
        } else {
            layoutParams5.rightMargin = sq.hn(getContext(), 8.0f);
        }
        this.mPlayableNextAd.setLayoutParams(layoutParams5);
        this.mPlayableNextAd.setBackground(com.bytedance.sdk.openadsdk.core.widget.gjv.hn());
        this.mPlayableNextAd.setVisibility(8);
        this.mNextAdTextTv = new aq(getContext());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, sq.hn(getContext(), 28.0f));
        layoutParams6.gravity = 16;
        this.mNextAdTextTv.setLayoutParams(layoutParams6);
        this.mNextAdTextTv.setPadding(iHn2, 0, 0, 0);
        String strWu = hqh.wu(asVar);
        if (TextUtils.isEmpty(strWu)) {
            this.mNextAdTextTv.setText(wu.hn(getContext(), "tt_multiple_playable_next_ad_tips"));
        } else {
            this.mNextAdTextTv.setText(strWu);
        }
        this.mNextAdTextTv.setGravity(17);
        this.mNextAdTextTv.setTextColor(-1);
        this.mNextAdTextTv.setTextSize(14.0f);
        gjv gjvVar = new gjv(getContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(iHn2, iHn2);
        layoutParams7.rightMargin = iHn2;
        gjvVar.setScaleType(ImageView.ScaleType.CENTER);
        layoutParams7.gravity = 16;
        gjvVar.setLayoutParams(layoutParams7);
        gjvVar.setImageResource(wu.gjv(oj.hnj(), "tt_ad_arrow_right"));
        this.mPlayableNextAd.addView(this.mNextAdTextTv);
        this.mPlayableNextAd.addView(gjvVar);
        ImageView commonRingBGImageView2 = getCommonRingBGImageView();
        this.mSkipIV = commonRingBGImageView2;
        commonRingBGImageView2.setId(520093714);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(iHn4, iHn4);
        layoutParams8.topMargin = iHn3;
        layoutParams8.rightMargin = iHn;
        this.mSkipIV.setLayoutParams(layoutParams8);
        this.mSkipIV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        gjv gjvVarHn = dkl.hn(getContext());
        this.mCloseBtn = gjvVarHn;
        gjvVarHn.setId(520093708);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams9.gravity = 8388661;
        layoutParams9.topMargin = iHn3;
        layoutParams9.rightMargin = iHn3;
        this.mCloseBtn.setLayoutParams(layoutParams9);
        this.mCloseBtn.setContentDescription(wu.hnj(getContext(), "tt_ad_close_text"));
        this.mCloseBtn.setVisibility(8);
        if (this.mProgressType == 1) {
            this.mProgressRing = new com.bytedance.sdk.openadsdk.core.bug.hn.gjv.hnj(getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor("#66666666"));
            gradientDrawable.setCornerRadius(sq.hn(getContext(), 14.0f));
            gradientDrawable.setShape(0);
            this.mProgressRing.setBackground(gradientDrawable);
            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(iHn4, iHn4);
            layoutParams10.topMargin = iHn3;
            layoutParams10.rightMargin = iHn;
            this.mProgressRing.setLayoutParams(layoutParams10);
            this.mProgressRing.hnj("ring").hnj(this.mProgressSize).hnj(this.mProgressColor).hn(this.mProgressBgColor).hn(this.mProgressRadiusSize);
            this.mProgressRing.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(getContext());
        qorVar.addView(this.mSkipIV);
        com.bytedance.sdk.openadsdk.core.bug.hn.gjv.hnj hnjVar = this.mProgressRing;
        if (hnjVar != null) {
            qorVar.addView(hnjVar);
        }
        if (this.mProgressType == 2) {
            this.mProgressBar = new com.bytedance.sdk.openadsdk.core.bug.hn.gjv.hnj(getContext());
            this.mProgressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.mProgressBar.hnj("line").hnj(this.mProgressSize).hnj(this.mProgressColor).hn(this.mProgressBgColor).hn(this.mProgressRadiusSize);
            this.mProgressBar.setVisibility(8);
        }
        this.container.addView(this.mImgDislike);
        this.container.addView(this.mImgSound);
        this.container.addView(view);
        if (this.mProgressRing == null) {
            this.container.addView(this.mPlayableNextAd);
        } else {
            qorVar.addView(this.mPlayableNextAd);
        }
        this.container.addView(this.mTextViewCountDown);
        this.container.addView(qorVar);
        this.container.addView(this.mCloseBtn);
        com.bytedance.sdk.openadsdk.core.bug.hn.gjv.hnj hnjVar2 = this.mProgressBar;
        if (hnjVar2 != null) {
            addView(hnjVar2);
        }
        addView(this.container);
    }

    private void updateTime(boolean z10) {
        if (this.hasShowClose) {
            return;
        }
        if (this.shouldShowSkipTime) {
            this.mSkipIV.setVisibility(8);
            this.mTextViewCountDown.setVisibility(0);
        } else if (z10) {
            this.mTextViewCountDown.setVisibility(0);
            this.mSkipIV.setVisibility(8);
        } else {
            this.mTextViewCountDown.setVisibility(8);
            this.mSkipIV.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void clickSkip() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.performClick();
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void clickSound(String str) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setTag(imageView.getId(), str);
            this.mImgSound.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public View getCloseButton() {
        return this.mCloseBtn;
    }

    public void hideCountDownText() {
        this.mTextViewCountDown.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setCountDownFor1InN(CharSequence charSequence, int i10) {
        int i11 = this.mProgressType;
        if (i11 == 1) {
            this.mTextViewCountDown.setVisibility(8);
            if (i10 < 0) {
                this.mProgressRing.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            }
            this.mProgressRing.setVisibility(0);
            this.mProgressRing.setAnimationDuration(1000);
            this.mProgressRing.setProgress(i10);
            this.mProgressRing.setClickable(false);
            this.mProgressRing.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
            ImageView imageView = this.mSkipIV;
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        if (i11 == 2) {
            this.mTextViewCountDown.setVisibility(8);
            if (i10 < 0) {
                this.mProgressBar.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            } else {
                this.mProgressBar.setVisibility(0);
                this.mProgressBar.setAnimationDuration(1000);
                this.mProgressBar.setProgress(i10);
                return;
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.mTextViewCountDown.setVisibility(8);
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setListener(hn hnVar) {
        this.mTopListener = hnVar;
    }

    public void setShouldShowSkipTime(boolean z10) {
        this.shouldShowSkipTime = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setShowDislike(boolean z10) {
        View view = this.mImgDislike;
        if (view == null || this.isVast) {
            return;
        }
        view.setVisibility(z10 ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setShowEndCardNextAd(boolean z10, as asVar) {
        sk skVar = this.mPlayableNextAd;
        if (skVar != null) {
            skVar.setVisibility(z10 ? 0 : 8);
            if (this.mNextAdTextTv == null || !z10 || asVar == null || asVar.jlw() == null) {
                return;
            }
            String strQor = asVar.jlw().qor();
            if (TextUtils.isEmpty(strQor)) {
                return;
            }
            this.mNextAdTextTv.setText(strQor);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setShowPlayableNextAd(boolean z10, as asVar) {
        sk skVar = this.mPlayableNextAd;
        if (skVar != null) {
            skVar.setVisibility(z10 ? 0 : 8);
            if (this.mNextAdTextTv == null || !z10) {
                return;
            }
            String strWu = hqh.wu(asVar);
            if (TextUtils.isEmpty(strWu)) {
                this.mNextAdTextTv.setText(wu.hn(getContext(), "tt_multiple_playable_next_ad_tips"));
            } else {
                this.mNextAdTextTv.setText(strWu);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setShowSkip(boolean z10) {
        TextView textView = this.mTextViewCountDown;
        if (textView == null) {
            return;
        }
        if (!z10) {
            textView.setText("");
        }
        if (this.mSkipIV.getVisibility() == 4) {
            return;
        }
        this.hasShowClose = !z10;
        this.mSkipIV.setVisibility((z10 && this.hasCutDown) ? 0 : 8);
        this.mTextViewCountDown.setVisibility(z10 & (TextUtils.isEmpty(this.mTextViewCountDown.getText()) ^ true) ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setShowSound(boolean z10) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setSkipEnable(boolean z10) {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setEnabled(z10);
            this.mSkipIV.setClickable(z10);
            return;
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.setEnabled(z10);
            this.mTextViewCountDown.setClickable(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setSkipInvisiable() {
        this.mTextViewCountDown.setWidth(20);
        this.mTextViewCountDown.setVisibility(4);
        this.mSkipIV.setVisibility(4);
        this.hasShowClose = true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setSkipText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.mTextViewCountDown.setVisibility(8);
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setSoundMute(boolean z10) {
        Drawable drawableHnj;
        this.mIsSoundMute = z10;
        if (this.mSkipIV != null) {
            drawableHnj = z10 ? wu.qor(getContext(), "tt_reward_full_mute") : wu.qor(getContext(), "tt_reward_full_unmute");
        } else {
            drawableHnj = z10 ? dnm.hnj(getContext(), "tt_mute_wrapper") : dnm.hnj(getContext(), "tt_unmute_wrapper");
        }
        this.mImgSound.setImageDrawable(drawableHnj);
        if (this.mImgSound.getDrawable() != null) {
            this.mImgSound.getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.mProgressStr = charSequence;
        }
        if (this.mSkipIV == null) {
            return;
        }
        this.hasCutDown = true;
        if (this.shouldShowSkipTime) {
            this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
            updateTime(false);
            return;
        }
        String str = (String) this.mProgressStr;
        try {
            int i10 = this.skipTime;
            int i11 = i10 == 0 ? Integer.parseInt(str) : i10 - (this.videoDuration - Integer.parseInt(str));
            if (i11 <= 0) {
                this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
                updateTime(false);
                return;
            }
            if (this.skipTime == 0) {
                updateTime(false);
                return;
            }
            this.mTextViewCountDown.setText(i11 + "s");
            updateTime(true);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void showCloseButton() {
        setSkipInvisiable();
        this.mSkipIV.setVisibility(8);
        this.mCloseBtn.setVisibility(0);
        com.bytedance.sdk.openadsdk.core.bug.hn.gjv.hnj hnjVar = this.mProgressRing;
        if (hnjVar != null) {
            hnjVar.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.bug.hn.gjv.hnj hnjVar2 = this.mProgressBar;
        if (hnjVar2 != null) {
            hnjVar2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void showCountDownText() {
        this.mTextViewCountDown.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.hnj
    public void showSkipButton() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.mTextViewCountDown.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.bug.hn.gjv.hnj hnjVar = this.mProgressRing;
        if (hnjVar != null) {
            hnjVar.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.bug.hn.gjv.hnj hnjVar2 = this.mProgressBar;
        if (hnjVar2 != null) {
            hnjVar2.setVisibility(8);
        }
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    public TopLayoutDislike2 load(as asVar) {
        boolean z10;
        initProgressBar(asVar);
        initView(asVar);
        this.mImgDislike.setVisibility(0);
        ((ImageView) this.mImgDislike).setImageResource(wu.gjv(oj.hnj(), "tt_reward_full_feedback"));
        if (!com.bytedance.sdk.openadsdk.core.settings.dnm.hn().mjg(String.valueOf(asVar.atw())) || asVar.qb() == 5 || asVar.qb() == 6) {
            this.mSkipIV.setImageResource(wu.gjv(oj.hnj(), "tt_close_btn"));
        } else {
            this.mSkipIV.setImageResource(wu.gjv(oj.hnj(), "tt_skip_btn"));
        }
        if (this.mSkipIV.getDrawable() != null) {
            this.mSkipIV.getDrawable().setAutoMirrored(true);
        }
        this.mSkipIV.setVisibility(8);
        this.videoDuration = asVar.pwt() == null ? 0 : ((int) asVar.pwt().e()) * asVar.pwt().M();
        if (apu.gjv(asVar) && asVar.m31do() != null) {
            this.videoDuration = (int) asVar.m31do().hn();
        } else if (apu.dse(asVar) && asVar.m31do() != null) {
            this.videoDuration = (int) asVar.m31do().gjv();
        }
        if (this.videoDuration <= 0) {
            this.videoDuration = 10;
        }
        if (asVar.iz() != 8 || asVar.aip() == null) {
            this.skipTime = asVar.qlh();
        } else {
            this.skipTime = asVar.kht();
        }
        if (!hqh.qor(asVar)) {
            int i10 = this.skipTime;
            if (i10 != -1 && i10 < this.videoDuration) {
                z10 = false;
            }
            this.shouldShowSkipTime = z10;
            if (asVar.qs()) {
                this.mImgDislike.setVisibility(8);
                this.isVast = true;
            }
            this.mTextViewCountDown.setVisibility(4);
            this.mTextViewCountDown.setText("");
            this.mTextViewCountDown.setEnabled(false);
            this.mTextViewCountDown.setClickable(false);
            initListener();
            return this;
        }
        this.skipTime = asVar.acd();
        this.videoDuration = asVar.bf();
        z10 = true;
        this.shouldShowSkipTime = z10;
        if (asVar.qs()) {
            this.mImgDislike.setVisibility(8);
            this.isVast = true;
        }
        this.mTextViewCountDown.setVisibility(4);
        this.mTextViewCountDown.setText("");
        this.mTextViewCountDown.setEnabled(false);
        this.mTextViewCountDown.setClickable(false);
        initListener();
        return this;
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mProgressStr = "";
        this.mProgressColor = com.bytedance.adsdk.ugeno.dse.hnj.hnj("#FFD813");
        this.mProgressBgColor = com.bytedance.adsdk.ugeno.dse.hnj.hnj("rgba(0, 0, 0, 0.5)");
        setOrientation(1);
    }

    public void clickDislike() {
    }
}
