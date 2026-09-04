package com.bytedance.sdk.openadsdk.core.bug.dkl;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.gjv.dnm;
import com.bytedance.adsdk.ugeno.gjv.orl;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor implements orl {
    private boolean hnj = false;

    @Override // com.bytedance.adsdk.ugeno.gjv.orl
    public boolean hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, MotionEvent motionEvent, dnm dnmVar, com.bytedance.adsdk.ugeno.gjv.gjv.qor qorVar2) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hnj = true;
        } else if ((action == 1 || action == 3) && this.hnj) {
            this.hnj = false;
            if (hnj(qorVar.dnm(), motionEvent.getX(), motionEvent.getY()) && dnmVar != null) {
                dnmVar.hnj(qorVar, qorVar2.gjv(), qorVar2.dse().hn());
            }
        }
        return true;
    }

    private boolean hnj(View view, float f10, float f11) {
        return f10 >= 0.0f && f10 < ((float) view.getWidth()) && f11 >= 0.0f && f11 < ((float) view.getHeight());
    }
}
