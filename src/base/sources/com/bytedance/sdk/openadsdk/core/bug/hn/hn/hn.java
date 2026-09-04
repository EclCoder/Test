package com.bytedance.sdk.openadsdk.core.bug.hn.hn;

import android.content.Context;
import com.bytedance.adsdk.hn.dkl;
import com.bytedance.adsdk.ugeno.gjv;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends dkl {
    private gjv hnj;

    public hn(Context context) {
        super(context);
    }

    public void hnj(gjv gjvVar) {
        this.hnj = gjvVar;
    }

    @Override // com.bytedance.adsdk.hn.dkl, android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        gjv gjvVar = this.hnj;
        if (gjvVar != null) {
            gjvVar.dse();
        }
    }

    @Override // com.bytedance.adsdk.hn.dkl, android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gjv gjvVar = this.hnj;
        if (gjvVar != null) {
            gjvVar.aq();
        }
    }
}
