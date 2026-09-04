package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gm extends dkl implements com.bytedance.sdk.component.adexpress.dynamic.sk {
    boolean apu;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    FrameLayout f12538hn;
    TextView hnj;

    public gm(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        this.apu = false;
        View view = new View(context);
        this.f12547fc = view;
        view.setTag(Integer.valueOf(getClickArea()));
        this.hnj = new TextView(context);
        this.f12538hn = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(context, 40.0f), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.hnj.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.hnj.setBackground(gradientDrawable);
        this.hnj.setTextSize(10.0f);
        this.hnj.setGravity(17);
        this.hnj.setTextColor(-1);
        this.hnj.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
            addView(this.f12538hn, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.hnj);
        addView(this.f12547fc, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.gjv.hn()) {
            addView(this.f12538hn, getWidgetLayoutParams());
        }
        dynamicRootView.videoView = this.f12538hn;
        dynamicRootView.setVideoListener(this);
    }

    private void qor(View view) {
        if (view == this.hnj || view == ((dkl) this).f12526xn) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.hnj.dkl)).intValue() == 1) {
                return;
            }
        } catch (Throwable unused) {
        }
        int i10 = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i10 >= viewGroup.getChildCount()) {
                return;
            }
            qor(viewGroup.getChildAt(i10));
            i10++;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sk
    public void hnj() {
        this.hnj.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul
    public boolean ojm() {
        super.ojm();
        double dSk = 0.0d;
        double dGjv = 0.0d;
        for (com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVarBug = this.orl; aqVarBug != null; aqVarBug = aqVarBug.bug()) {
            double dDkl = dGjv + ((double) aqVarBug.dkl());
            double dDse = dSk + ((double) aqVarBug.dse());
            dGjv = dDkl - ((double) aqVarBug.gjv());
            dSk = dDse - ((double) aqVarBug.sk());
        }
        try {
            float f10 = (float) dGjv;
            int iHnj = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), f10);
            int iHnj2 = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), f10 + this.f12550sk);
            if (com.bytedance.sdk.component.adexpress.gjv.hn.hnj(getContext())) {
                int dynamicWidth = ((oj) this.mjg.getChildAt(0)).getDynamicWidth();
                int i10 = dynamicWidth - iHnj2;
                iHnj2 = dynamicWidth - iHnj;
                iHnj = i10;
            }
            if ("open_ad".equals(this.mjg.getRenderRequest().gjv())) {
                this.mjg.videoView = this.f12538hn;
            } else {
                float f11 = (float) dSk;
                ((oj) this.mjg.getChildAt(0)).hnj.hnj(iHnj, (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), f11), iHnj2, (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), f11 + this.dkl));
            }
        } catch (Exception unused) {
        }
        this.mjg.updateRenderInfoForVideo(dGjv, dSk, this.f12550sk, this.dkl, this.bug.fc());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sk
    public void setTimeUpdate(int i10) {
        if (!this.orl.ta().sk().hw() || i10 <= 0 || this.apu) {
            this.apu = true;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                qor(getChildAt(i11));
            }
            this.hnj.setVisibility(8);
            return;
        }
        String str = (i10 >= 60 ? "" + MBridgeConstans.ENDCARD_URL_TYPE_PL + (i10 / 60) : "00") + ":";
        int i12 = i10 % 60;
        this.hnj.setText(i12 > 9 ? str + i12 : str + MBridgeConstans.ENDCARD_URL_TYPE_PL + i12);
        this.hnj.setVisibility(0);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk
    public boolean sk() {
        return true;
    }
}
