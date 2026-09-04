package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends com.bytedance.sdk.openadsdk.core.dkl.gjv {
    public qor(Context context) {
        super(context);
        hnj();
    }

    private void hnj() {
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.jip.mdk);
    }

    public void hnj(int i10, as asVar) {
        if (asVar.qs() || (asVar.ux() && asVar.as())) {
            sq.hnj((View) this, 0);
            com.bytedance.sdk.openadsdk.apu.hn.hn().hnj((int) sq.hnj(getContext(), i10, true), this, asVar);
        }
    }
}
