package com.bytedance.sdk.openadsdk.core.gjv;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.ojm.apu;
import com.bytedance.sdk.openadsdk.core.ojm.oj;
import com.bytedance.sdk.openadsdk.core.ojm.xn;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.bug;
import com.bytedance.sdk.openadsdk.core.widget.jip;
import com.bytedance.sdk.openadsdk.core.widget.orl;
import com.bytedance.sdk.openadsdk.core.widget.uua;
import com.bytedance.sdk.openadsdk.utils.dnm;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.google.api.client.http.HttpStatusCodes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends com.bytedance.sdk.openadsdk.core.ojm.hnj {
    public static oj[] hnj = {new oj(1, 6.4f, Sdk$SDKError.b.WEBVIEW_ERROR_VALUE, 50), new oj(4, 1.2f, HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES, 250)};
    private hnj bug;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private PAGBannerAdWrapperListener f13744fc;
    private String mjg;
    private apu orl;

    public hn(Context context) {
        super(context);
        this.f14061hn = context;
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.f13744fc = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.mjg = str;
    }

    private hnj aq() {
        int iHn = sq.hn(this.f14061hn, 8.0f);
        int iHn2 = sq.hn(this.f14061hn, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.f14061hn);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iHn, iHn, iHn, iHn2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.f14061hn);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        uua uuaVar = new uua(this.f14061hn);
        uuaVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(sq.hn(this.f14061hn, 52.0f), sq.hn(this.f14061hn, 52.0f));
        uuaVar.setScaleType(ImageView.ScaleType.FIT_XY);
        uuaVar.setLayoutParams(layoutParams3);
        linearLayout.addView(uuaVar);
        LinearLayout linearLayout2 = new LinearLayout(this.f14061hn);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iHn;
        layoutParams4.rightMargin = iHn;
        layoutParams4.setMarginStart(iHn);
        layoutParams4.setMarginEnd(iHn);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.f14061hn);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        jip jipVar = new jip(this.f14061hn);
        jipVar.setId(520093735);
        linearLayout2.addView(jipVar, new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = new TextView(this.f14061hn);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(sq.hn(this.f14061hn, 76.0f), sq.hn(this.f14061hn, 36.0f));
        textView2.setBackground(dnm.hnj(this.f14061hn, 18));
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(wu.hnj(this.f14061hn, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams6);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.f14061hn);
        frameLayout.setLayoutDirection(3);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams7.addRule(2, linearLayout.getId());
        layoutParams7.bottomMargin = iHn2;
        frameLayout.setLayoutParams(layoutParams7);
        relativeLayout.addView(frameLayout);
        orl orlVar = new orl(this.f14061hn);
        orlVar.setId(520093736);
        orlVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams8.gravity = 17;
        frameLayout.addView(orlVar, layoutParams8);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f14061hn, this.qor);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(10);
        layoutParams9.addRule(9);
        layoutParams9.setMargins(iHn, iHn, 0, 0);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams9);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        return new hnj(uuaVar, viewCreatePAGLogoViewByMaterial, textView2, textView, orlVar, jipVar, frameLayout);
    }

    private hnj dkl() {
        int iHn = sq.hn(this.f14061hn, 8.0f);
        orl orlVar = new orl(this.f14061hn);
        orlVar.setId(520093736);
        orlVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(orlVar, layoutParams);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f14061hn, this.qor);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(iHn, iHn, 0, 0);
        layoutParams2.gravity = 8388659;
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        addView(viewCreatePAGLogoViewByMaterial);
        return new hnj(viewCreatePAGLogoViewByMaterial, orlVar);
    }

    private hnj dse() {
        int iHn = sq.hn(this.f14061hn, 38.0f);
        int iHn2 = (int) (((double) sq.hn(this.f14061hn, 25.0f)) / 5.0d);
        int iHn3 = sq.hn(this.f14061hn, 10.0f);
        int iHn4 = sq.hn(this.f14061hn, 2.0f);
        int iHn5 = sq.hn(this.f14061hn, 6.0f);
        int iHn6 = sq.hn(this.f14061hn, 8.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.f14061hn);
        addView(relativeLayout, -1, -1);
        uua uuaVar = new uua(this.f14061hn);
        uuaVar.setId(520093738);
        TextView textView = new TextView(this.f14061hn);
        textView.setId(520093730);
        jip jipVar = new jip(this.f14061hn);
        jipVar.setId(520093735);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f14061hn, this.qor);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        TextView textView2 = new TextView(this.f14061hn);
        textView2.setId(520093703);
        hnj hnjVar = new hnj(uuaVar, textView, jipVar, viewCreatePAGLogoViewByMaterial, textView2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iHn, iHn);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.addRule(20);
        layoutParams.setMarginStart(iHn5);
        layoutParams.setMargins(iHn5, 0, 0, 0);
        uuaVar.setLayoutParams(layoutParams);
        uuaVar.setBackgroundColor(-1);
        uuaVar.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(uuaVar);
        LinearLayout linearLayout = new LinearLayout(this.f14061hn);
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(16, textView2.getId());
        layoutParams2.addRule(17, uuaVar.getId());
        layoutParams2.setMarginStart(iHn6);
        layoutParams2.setMarginEnd(iHn6);
        layoutParams2.addRule(0, textView2.getId());
        layoutParams2.addRule(1, uuaVar.getId());
        layoutParams2.setMargins(iHn6, 0, iHn6, 0);
        relativeLayout.addView(linearLayout, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        textView.setTextDirection(5);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(80);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF333333"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams3);
        linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = iHn4;
        jipVar.setLayoutParams(layoutParams4);
        linearLayout.addView(jipVar);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(20);
        layoutParams5.addRule(9);
        layoutParams5.addRule(12);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams5);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(11);
        layoutParams6.addRule(15);
        layoutParams6.setMarginEnd(iHn5);
        layoutParams6.addRule(21);
        layoutParams6.rightMargin = iHn5;
        textView2.setBackground(dnm.hnj(this.f14061hn, 12));
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        textView2.setPadding(iHn3, iHn2, iHn3, iHn2);
        textView2.setText(wu.hnj(this.f14061hn, "tt_video_download_apk"));
        textView2.setTextColor(Color.parseColor("#f0f0f0"));
        textView2.setTextSize(10.0f);
        textView2.setLayoutParams(layoutParams6);
        relativeLayout.addView(textView2);
        return hnjVar;
    }

    private void gjv() {
        hnj hnjVarDkl = dkl();
        this.bug = hnjVarDkl;
        View view = hnjVarDkl.dkl;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.gjv.hn.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.hnj(((com.bytedance.sdk.openadsdk.core.ojm.hnj) hn.this).f14061hn, ((com.bytedance.sdk.openadsdk.core.ojm.hnj) hn.this).qor, ((com.bytedance.sdk.openadsdk.core.ojm.hnj) hn.this).dkl);
                }
            });
        }
        orl orlVar = this.bug.hnj;
        if (orlVar != null) {
            List<com.bytedance.sdk.openadsdk.core.model.oj> listLx = this.qor.lx();
            if (listLx != null && !listLx.isEmpty()) {
                com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(listLx.get(0), orlVar, this.qor);
            }
            hnj((View) orlVar, true);
            orlVar.setTag(520093762, Boolean.TRUE);
        }
    }

    private void hn() {
        oj ojVarHnj = hnj(this.orl.getExpectExpressWidth(), this.orl.getExpectExpressHeight());
        if (this.orl.getExpectExpressWidth() <= 0 || this.orl.getExpectExpressHeight() <= 0) {
            int iQor = sq.qor(this.f14061hn);
            this.dse = iQor;
            this.aq = Float.valueOf(iQor / ojVarHnj.f14065hn).intValue();
        } else {
            this.dse = sq.hn(this.f14061hn, this.orl.getExpectExpressWidth());
            this.aq = sq.hn(this.f14061hn, this.orl.getExpectExpressHeight());
        }
        int i10 = this.dse;
        if (i10 > 0 && i10 > sq.qor(this.f14061hn)) {
            float fQor = sq.qor(this.f14061hn) / this.dse;
            this.dse = sq.qor(this.f14061hn);
            this.aq = Float.valueOf(this.aq * fQor).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.dse, this.aq);
        }
        layoutParams.width = this.dse;
        layoutParams.height = this.aq;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        as asVar = this.qor;
        if (asVar != null) {
            int iQri = asVar.qri();
            if (iQri == 1010 || iQri == 1011 || iQri == 1012) {
                gjv();
            } else {
                hnj(ojVarHnj);
            }
        }
    }

    private hnj ojm() {
        int iHn = sq.hn(this.f14061hn, 8.0f);
        int iHn2 = sq.hn(this.f14061hn, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.f14061hn);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iHn, iHn, iHn, iHn2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.f14061hn);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        uua uuaVar = new uua(this.f14061hn);
        uuaVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(sq.hn(this.f14061hn, 52.0f), sq.hn(this.f14061hn, 52.0f));
        uuaVar.setScaleType(ImageView.ScaleType.FIT_XY);
        uuaVar.setLayoutParams(layoutParams3);
        linearLayout.addView(uuaVar);
        LinearLayout linearLayout2 = new LinearLayout(this.f14061hn);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iHn;
        layoutParams4.rightMargin = iHn;
        layoutParams4.setMarginStart(iHn);
        layoutParams4.setMarginEnd(iHn);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.f14061hn);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        jip jipVar = new jip(this.f14061hn);
        jipVar.setId(520093735);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = sq.hn(this.f14061hn, 4.0f);
        linearLayout2.addView(jipVar, layoutParams6);
        TextView textView2 = new TextView(this.f14061hn);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(sq.hn(this.f14061hn, 76.0f), sq.hn(this.f14061hn, 36.0f));
        textView2.setBackground(dnm.hnj(this.f14061hn, 18));
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(wu.hnj(this.f14061hn, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams7);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.f14061hn);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams8.addRule(2, linearLayout.getId());
        layoutParams8.bottomMargin = iHn2;
        frameLayout.setLayoutParams(layoutParams8);
        relativeLayout.addView(frameLayout);
        bug bugVar = new bug(this.f14061hn);
        bugVar.setId(520093736);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams9.gravity = 17;
        bugVar.setLayoutParams(layoutParams9);
        frameLayout.addView(bugVar);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f14061hn, this.qor);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(10);
        layoutParams10.addRule(9);
        layoutParams10.setMargins(iHn, iHn, 0, 0);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams10);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        return new hnj(uuaVar, viewCreatePAGLogoViewByMaterial, textView2, textView, bugVar, jipVar, frameLayout);
    }

    private void qor() {
        sq.hn(this.f14061hn, 50.0f);
        hnj hnjVarDse = dse();
        this.bug = hnjVarDse;
        ImageView imageView = hnjVarDse.qor;
        TextView textView = hnjVarDse.f13745hn;
        jip jipVar = hnjVarDse.gjv;
        TextView textView2 = hnjVarDse.dse;
        View view = hnjVarDse.dkl;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.gjv.hn.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.hnj(((com.bytedance.sdk.openadsdk.core.ojm.hnj) hn.this).f14061hn, ((com.bytedance.sdk.openadsdk.core.ojm.hnj) hn.this).qor, ((com.bytedance.sdk.openadsdk.core.ojm.hnj) hn.this).dkl);
                }
            });
        }
        if (this.qor.mn() != null && !TextUtils.isEmpty(this.qor.mn().hnj())) {
            com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.qor.mn().hnj(), this.qor.mn().hn(), this.qor.mn().qor(), imageView, this.qor);
        }
        textView.setText(this.qor.kby());
        if (TextUtils.isEmpty(this.qor.cq())) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(this.qor.cq());
        }
        sq.hnj((TextView) null, jipVar, this.qor);
        hnj((View) imageView, true);
        imageView.setTag(520093762, Boolean.TRUE);
        hnj((View) this, true);
        hnj((View) textView2, true);
    }

    private void sk() {
        TextView textView;
        as asVar = this.qor;
        if (asVar != null) {
            int iQri = asVar.qri();
            if (this.qor.pwt() == null) {
                hnj hnjVarAq = aq();
                this.bug = hnjVarAq;
                orl orlVar = hnjVarAq.hnj;
                ImageView imageView = hnjVarAq.qor;
                TextView textView2 = hnjVarAq.f13745hn;
                TextView textView3 = hnjVarAq.dse;
                View view = hnjVarAq.dkl;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.gjv.hn.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            TTWebsiteActivity.hnj(((com.bytedance.sdk.openadsdk.core.ojm.hnj) hn.this).f14061hn, ((com.bytedance.sdk.openadsdk.core.ojm.hnj) hn.this).qor, ((com.bytedance.sdk.openadsdk.core.ojm.hnj) hn.this).dkl);
                        }
                    });
                }
                ViewGroup.LayoutParams layoutParams = orlVar.getLayoutParams();
                if (this.dse - (sq.hn(this.f14061hn, 8.0f) * 2) >= ((this.aq - sq.hn(this.f14061hn, 8.0f)) - (sq.hn(this.f14061hn, 21.0f) * 2)) - sq.hn(this.f14061hn, 52.0f)) {
                    layoutParams.width = -2;
                    layoutParams.height = -1;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                }
                orlVar.setLayoutParams(layoutParams);
                if (iQri == 33) {
                    orlVar.setRatio(1.0f);
                } else {
                    orlVar.setRatio(1.91f);
                }
                List<com.bytedance.sdk.openadsdk.core.model.oj> listLx = this.qor.lx();
                if (listLx != null && !listLx.isEmpty()) {
                    com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(listLx.get(0), orlVar, this.qor);
                    com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(listLx.get(0).hnj(), this.bug.f13746sk);
                }
                if (this.qor.mn() == null || TextUtils.isEmpty(this.qor.mn().hnj())) {
                    textView = textView2;
                } else {
                    textView = textView2;
                    com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.qor.mn().hnj(), this.qor.mn().hn(), this.qor.mn().qor(), imageView, this.qor);
                }
                textView.setText(this.qor.kby());
                if (TextUtils.isEmpty(this.qor.cq())) {
                    textView3.setVisibility(8);
                } else {
                    textView3.setText(this.qor.cq());
                }
                sq.hnj((TextView) null, this.bug.gjv, this.qor);
                hnj((View) orlVar, true);
                orlVar.setTag(520093762, Boolean.TRUE);
                hnj((View) this, true);
                hnj((View) textView3, true);
                return;
            }
            hnj hnjVarOjm = ojm();
            this.bug = hnjVarOjm;
            TextView textView4 = hnjVarOjm.f13745hn;
            TextView textView5 = hnjVarOjm.dse;
            bug bugVar = hnjVarOjm.aq;
            com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.qor.pwt().J(), this.bug.f13746sk);
            View view2 = this.bug.dkl;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.gjv.hn.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        TTWebsiteActivity.hnj(((com.bytedance.sdk.openadsdk.core.ojm.hnj) hn.this).f14061hn, ((com.bytedance.sdk.openadsdk.core.ojm.hnj) hn.this).qor, ((com.bytedance.sdk.openadsdk.core.ojm.hnj) hn.this).dkl);
                    }
                });
            }
            ViewGroup.LayoutParams layoutParams2 = bugVar.getLayoutParams();
            if (iQri == 15) {
                layoutParams2.width = -2;
                layoutParams2.height = -1;
                bugVar.setLayoutParams(layoutParams2);
                bugVar.setRatio(0.5625f);
            } else if (iQri == 5) {
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                bugVar.setLayoutParams(layoutParams2);
                bugVar.setRatio(1.7777778f);
            } else {
                if (this.dse - (sq.hn(this.f14061hn, 8.0f) * 2) >= ((this.aq - sq.hn(this.f14061hn, 8.0f)) - (sq.hn(this.f14061hn, 21.0f) * 2)) - sq.hn(this.f14061hn, 52.0f)) {
                    layoutParams2.width = -2;
                    layoutParams2.height = -1;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.height = -2;
                }
                bugVar.setLayoutParams(layoutParams2);
                bugVar.setRatio(1.0f);
            }
            bugVar.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            com.bytedance.sdk.openadsdk.core.mjg.hn.dkl videoView = getVideoView();
            if (videoView != null) {
                apu apuVar = this.orl;
                if (apuVar instanceof xn) {
                    videoView.setNeedSelfManagerVideo(!((xn) apuVar).orl());
                    ((xn) this.orl).setBackupVideoView(videoView);
                    videoView.setVideoAdInteractionListener((xn) this.orl);
                }
                bugVar.addView(videoView, layoutParams3);
                videoView.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.hnj() { // from class: com.bytedance.sdk.openadsdk.core.gjv.hn.5
                    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.dkl.hnj
                    public void hnj(View view3, int i10) {
                        if (hn.this.f13744fc != null) {
                            hn.this.f13744fc.onAdClicked();
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.core.ojm.aq clickCreativeListener = this.orl.getClickCreativeListener();
                if (clickCreativeListener != null) {
                    clickCreativeListener.hnj(videoView.getNativeVideoController());
                }
            }
            if (this.qor.mn() != null && !TextUtils.isEmpty(this.qor.mn().hnj())) {
                com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.qor.mn().hnj(), this.qor.mn().hn(), this.qor.mn().qor(), this.bug.qor, this.qor);
            }
            textView4.setText(this.qor.kby());
            sq.hnj((TextView) null, this.bug.gjv, this.qor);
            if (TextUtils.isEmpty(this.qor.cq())) {
                textView5.setVisibility(8);
            } else {
                textView5.setText(this.qor.cq());
            }
            hnj((View) videoView, true);
            if (videoView != null) {
                videoView.setTag(520093762, Boolean.TRUE);
            }
            hnj((View) this, true);
            hnj((View) textView5, true);
            hnj(bugVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.hnj
    protected void hnj(View view, int i10, com.bytedance.sdk.openadsdk.core.model.jip jipVar) {
        apu apuVar = this.orl;
        if (apuVar != null) {
            apuVar.hnj(view, i10, jipVar);
        }
    }

    void hnj(as asVar, apu apuVar, com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor qorVar) {
        setBackgroundColor(-1);
        this.qor = asVar;
        this.orl = apuVar;
        this.dkl = "banner_ad";
        apuVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        hn();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj {
        private bug aq;
        View dkl;
        TextView dse;
        jip gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public TextView f13745hn;
        public orl hnj;
        ImageView qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        FrameLayout f13746sk;

        hnj(ImageView imageView, TextView textView, jip jipVar, View view, TextView textView2) {
            this.qor = imageView;
            this.f13745hn = textView;
            this.gjv = jipVar;
            this.dkl = view;
            this.dse = textView2;
        }

        public hnj(ImageView imageView, View view, TextView textView, TextView textView2, orl orlVar, jip jipVar, FrameLayout frameLayout) {
            this.qor = imageView;
            this.dkl = view;
            this.dse = textView;
            this.f13745hn = textView2;
            this.hnj = orlVar;
            this.gjv = jipVar;
            this.f13746sk = frameLayout;
        }

        public hnj(ImageView imageView, View view, TextView textView, TextView textView2, bug bugVar, jip jipVar, FrameLayout frameLayout) {
            this.qor = imageView;
            this.dkl = view;
            this.dse = textView;
            this.f13745hn = textView2;
            this.aq = bugVar;
            this.gjv = jipVar;
            this.f13746sk = frameLayout;
        }

        public hnj(View view, orl orlVar) {
            this.dkl = view;
            this.hnj = orlVar;
        }
    }

    private void hnj(oj ojVar) {
        if (ojVar.hnj == 1) {
            qor();
        } else {
            sk();
        }
    }

    public static oj hnj(int i10, int i11) {
        try {
            return ((double) i11) >= Math.floor((((double) i10) * 450.0d) / 600.0d) ? hnj[1] : hnj[0];
        } catch (Throwable unused) {
            return hnj[0];
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.hnj
    public void hnj() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f14062sk;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.qor.qor qorVar = this.gjv;
        if (qorVar != null) {
            qorVar.hnj();
        } else {
            TTDelegateActivity.hnj(this.qor, this.mjg);
        }
    }
}
