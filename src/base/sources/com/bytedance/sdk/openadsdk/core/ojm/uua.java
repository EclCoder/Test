package com.bytedance.sdk.openadsdk.core.ojm;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class uua extends hnj {
    private apu bug;
    private FrameLayout hnj;
    private FrameLayout orl;

    public uua(Context context) {
        super(context);
        this.f14061hn = context;
    }

    private void hn() {
        this.dse = sq.hn(this.f14061hn, this.bug.getExpectExpressWidth());
        this.aq = sq.hn(this.f14061hn, this.bug.getExpectExpressWidth());
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
        this.qor.vh();
        qor();
    }

    private void qor() {
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(this.f14061hn);
        this.hnj = qorVar;
        addView(qorVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar2 = new com.bytedance.sdk.openadsdk.core.dkl.qor(this.f14061hn);
        this.orl = qorVar2;
        this.hnj.addView(qorVar2, new FrameLayout.LayoutParams(-1, -1));
        this.orl.removeAllViews();
    }

    public View getBackupContainerBackgroundView() {
        return this.hnj;
    }

    public FrameLayout getVideoContainer() {
        return this.orl;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, apu apuVar, ViewGroup viewGroup) {
        if (asVar == null) {
            return;
        }
        setBackgroundColor(-1);
        this.qor = asVar;
        this.bug = apuVar;
        if (asVar.iz() == 7) {
            this.dkl = "rewarded_video";
        } else {
            this.dkl = "fullscreen_interstitial_ad";
        }
        hn();
        if (com.bytedance.sdk.openadsdk.core.model.apu.qor(asVar)) {
            this.bug.addView(this, new ViewGroup.LayoutParams(-1, -1));
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.bug.addView(this, layoutParams);
        }
        int i10 = com.bytedance.sdk.openadsdk.utils.jip.rw;
        View viewFindViewById = viewGroup.findViewById(i10);
        if (viewFindViewById != null) {
            Object tag = viewFindViewById.getTag(i10);
            if (tag instanceof String) {
                String str = (String) tag;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(str, viewFindViewById);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.hnj
    protected void hnj(View view, int i10, com.bytedance.sdk.openadsdk.core.model.jip jipVar) {
        apu apuVar = this.bug;
        if (apuVar != null) {
            apuVar.hnj(view, i10, jipVar);
        }
    }
}
