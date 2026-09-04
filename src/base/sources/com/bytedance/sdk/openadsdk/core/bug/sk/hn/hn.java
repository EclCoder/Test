package com.bytedance.sdk.openadsdk.core.bug.sk.hn;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends com.bytedance.adsdk.ugeno.gjv.gjv.qor {
    private String dnm;

    public hn(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.gjv.qor
    public boolean hnj(Object... objArr) {
        com.bytedance.adsdk.ugeno.hn.qor qorVar;
        com.bytedance.adsdk.ugeno.hn.qor qorVarHn;
        Map<String, String> map = this.f12244sk;
        if (map != null && map.size() > 0) {
            String str = this.f12244sk.get("id");
            this.dnm = this.f12244sk.get("state");
            if (TextUtils.isEmpty(str) || (qorVarHn = (qorVar = this.f12243hn).hn(qorVar)) == null) {
                return false;
            }
            com.bytedance.adsdk.ugeno.hn.qor qorVarSk = qorVarHn.sk(str);
            if (qorVarSk instanceof com.bytedance.sdk.openadsdk.core.bug.hn.hn.hnj) {
                ((com.bytedance.sdk.openadsdk.core.bug.hn.hn.hnj) qorVarSk).hnj(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.bug.sk.hn.hn.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        if (!TextUtils.equals(hn.this.dnm, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE) || ((com.bytedance.adsdk.ugeno.gjv.gjv.qor) hn.this).hnj == null) {
                            return;
                        }
                        ((com.bytedance.adsdk.ugeno.gjv.gjv.qor) hn.this).hnj.hnj(((com.bytedance.adsdk.ugeno.gjv.gjv.qor) hn.this).f12243hn, ((com.bytedance.adsdk.ugeno.gjv.gjv.qor) hn.this).dkl, ((com.bytedance.adsdk.ugeno.gjv.gjv.qor) hn.this).qor.hn());
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        if (!TextUtils.equals(hn.this.dnm, "start") || ((com.bytedance.adsdk.ugeno.gjv.gjv.qor) hn.this).hnj == null) {
                            return;
                        }
                        ((com.bytedance.adsdk.ugeno.gjv.gjv.qor) hn.this).hnj.hnj(((com.bytedance.adsdk.ugeno.gjv.gjv.qor) hn.this).f12243hn, ((com.bytedance.adsdk.ugeno.gjv.gjv.qor) hn.this).dkl, ((com.bytedance.adsdk.ugeno.gjv.gjv.qor) hn.this).qor.hn());
                    }
                });
            }
        }
        return false;
    }
}
