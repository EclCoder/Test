package com.bytedance.sdk.openadsdk.component.ojm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.jip;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends qor {
    hnj orl;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj(View view, int i10);
    }

    public sk(Context context, as asVar) {
        super(context);
        hnj(context, asVar);
    }

    private void hnj(Context context, as asVar) {
        com.bytedance.sdk.openadsdk.core.ojm.sk skVar = new com.bytedance.sdk.openadsdk.core.ojm.sk(context);
        com.bytedance.sdk.openadsdk.core.ojm.gjv.hnj().qor(skVar);
        skVar.hnj(asVar, new com.bytedance.sdk.openadsdk.core.ojm.sk.hn() { // from class: com.bytedance.sdk.openadsdk.component.ojm.sk.1
            @Override // com.bytedance.sdk.openadsdk.core.ojm.sk.hn
            public void hnj(int i10, int i11) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.ojm.sk.hn
            public View hnj() {
                return sk.this;
            }

            @Override // com.bytedance.sdk.openadsdk.core.ojm.sk.hn
            public void hnj(View view, int i10) {
                hnj hnjVar = sk.this.orl;
                if (hnjVar != null) {
                    hnjVar.hnj(view, i10);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.ojm.sk.hn
            public void hn() {
            }
        }, "open_ad");
        addView(skVar, new ViewGroup.LayoutParams(-1, -1));
        skVar.apu();
        int iHn = sq.hn(context, 9.0f);
        int iHn2 = sq.hn(context, 10.0f);
        this.gjv = PAGLogoView.createPAGLogoViewByMaterial(context, asVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, sq.hn(context, 14.0f));
        layoutParams.leftMargin = iHn2;
        layoutParams.bottomMargin = iHn2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.gjv, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.qor qorVar = new com.bytedance.sdk.openadsdk.core.widget.qor(context);
        this.bug = qorVar;
        qorVar.setPadding(iHn, 0, iHn, 0);
        this.bug.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(sq.hn(context, 32.0f), sq.hn(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, iHn2, iHn2);
        addView(this.bug, layoutParams2);
        View view = this.aq;
        if (view != null) {
            addView(view);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.ojm.qor
    public com.bytedance.sdk.openadsdk.core.dkl.gjv getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.ojm.qor
    public com.bytedance.sdk.openadsdk.core.dkl.aq getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.ojm.qor
    public jip getScoreBar() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.ojm.qor
    public View getUserInfo() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.orl = null;
    }

    public void setRenderListener(hnj hnjVar) {
        this.orl = hnjVar;
    }
}
