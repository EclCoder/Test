package com.bytedance.sdk.component.adexpress.dynamic.qor;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.hqh;
import com.bytedance.sdk.component.utils.wu;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm implements dse<ViewGroup> {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final FrameLayout f12629hn;
    private final com.bytedance.sdk.component.adexpress.dkl.ta hnj;

    public dnm(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk skVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar, String str, String str2) {
        com.bytedance.sdk.component.adexpress.dkl.ta taVar = new com.bytedance.sdk.component.adexpress.dkl.ta(context);
        this.hnj = taVar;
        taVar.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12629hn = frameLayout;
        frameLayout.addView(taVar, new FrameLayout.LayoutParams(-2, -2));
        double dGn = dseVar.gn();
        dGn = dGn == 0.0d ? 1.0d : dGn;
        double dDy = dseVar.dy();
        double d10 = dDy != 0.0d ? dDy : 1.0d;
        if ("22".equals(str2)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(context, 250.0f));
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(context, 120.0f);
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        if (!"20".equals(str2)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (((double) skVar.getDynamicWidth()) * 0.32d * dGn), (int) (((double) skVar.getDynamicWidth()) * 0.32d * d10));
            layoutParams2.gravity = 17;
            frameLayout.setLayoutParams(layoutParams2);
        } else {
            hnj(context, frameLayout, dseVar);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 81;
            layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(context, dseVar.pv() > 0 ? dseVar.pv() : com.bytedance.sdk.component.adexpress.gjv.hn() ? 0 : AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL);
            frameLayout.setLayoutParams(layoutParams3);
            frameLayout.setClipChildren(false);
        }
    }

    private void hnj(Context context, FrameLayout frameLayout, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, -hqh.hnj(context, 5.0f), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(context.getString(wu.hn(context, "tt_splash_brush_mask_title")));
        textView.setTextColor(-1);
        textView.setTextSize(2, 20.0f);
        TextView textView2 = new TextView(context);
        textView2.setId(2097610738);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, hqh.hnj(context, 5.0f), 0, 0);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(wu.hn(context, "tt_splash_brush_mask_hint")));
        if (dseVar != null && !TextUtils.isEmpty(dseVar.eta())) {
            textView2.setText(dseVar.eta());
        }
        textView2.setTextColor(-1);
        textView2.setTextSize(2, 14.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public void hn() {
        this.hnj.dkl();
        ViewParent parent = this.f12629hn.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f12629hn);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public ViewGroup qor() {
        return this.f12629hn;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public void hnj() {
        this.hnj.aq();
    }
}
