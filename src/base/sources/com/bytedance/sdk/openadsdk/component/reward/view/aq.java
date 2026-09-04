package com.bytedance.sdk.openadsdk.component.reward.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq extends com.bytedance.sdk.openadsdk.core.dkl.qor {
    private final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnj;

    public aq(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        super(hnjVar.jbd);
        this.hnj = hnjVar;
        if (hnjVar.f13463th != null || Build.VERSION.SDK_INT < 35) {
            return;
        }
        setFitsSystemWindows(true);
    }

    public void hnj(com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar) {
        RFEndCardBackUpLayout rFEndCardBackUpLayoutDse;
        hnVar.hnj(this);
        if (this.hnj.hnj != 1 && (rFEndCardBackUpLayoutDse = hnVar.dse()) != null) {
            addView(rFEndCardBackUpLayoutDse, new FrameLayout.LayoutParams(-1, -1));
        }
        hnj(hnVar.aq(), this);
        hnj(hnVar.ojm(), this);
    }

    private void hnj(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
