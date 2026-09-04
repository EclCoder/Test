package com.bytedance.sdk.openadsdk.core.bug.sk.hnj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.gjv.dkl;
import com.bytedance.adsdk.ugeno.hn.qor;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends com.bytedance.adsdk.ugeno.gjv.hn.hnj {
    public hnj(qor qorVar, String str, dkl.hnj hnjVar) {
        super(qorVar, str, hnjVar);
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.hn.hnj
    public void hnj() {
        qor qorVar;
        qor qorVarHn;
        Map<String, String> map = this.dkl;
        if (map == null || map.isEmpty()) {
            return;
        }
        String str = this.dkl.get("id");
        if (TextUtils.isEmpty(str) || (qorVarHn = (qorVar = this.qor).hn(qorVar)) == null) {
            return;
        }
        qor qorVarSk = qorVarHn.sk(str);
        if (qorVarSk instanceof com.bytedance.sdk.openadsdk.core.bug.hn.hn.hnj) {
            com.bytedance.sdk.openadsdk.core.bug.hn.hn.hnj hnjVar = (com.bytedance.sdk.openadsdk.core.bug.hn.hn.hnj) qorVarSk;
            hnjVar.gjv();
            hnjVar.hnj(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.bug.sk.hnj.hnj.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    hnj.this.qor();
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.hn.hnj
    public void hn() {
    }
}
