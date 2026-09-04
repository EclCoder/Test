package com.bytedance.sdk.openadsdk.component.reward.hnj;

import android.R;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.common.uua f13503hn;
    private final hnj hnj;
    private TTAdDislikeToast qor;

    public qor(hnj hnjVar) {
        this.hnj = hnjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gjv() {
        TTAdDislikeToast tTAdDislikeToast = this.qor;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean qor() {
        return this.hnj.lko;
    }

    public void hn() {
        TTAdDislikeToast tTAdDislikeToast = this.qor;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.onDestroy();
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar) {
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar;
        if (this.hnj.orp.isFinishing()) {
            return;
        }
        hnj hnjVar = this.hnj;
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar2 = hnjVar.f13463th;
        boolean z10 = (aqVar2 instanceof com.bytedance.sdk.openadsdk.activity.single.sk) && ((com.bytedance.sdk.openadsdk.activity.single.sk) aqVar2).hnj;
        if (hnjVar.dnm.get() || !((aqVar = this.hnj.f13463th) == null || !aqVar.ff().xyo() || z10)) {
            if (this.qor == null) {
                this.qor = new TTAdDislikeToast(this.hnj.orp);
                ((FrameLayout) this.hnj.orp.findViewById(R.id.content)).addView(this.qor);
            }
            this.qor.show(TTAdDislikeToast.getDislikeTip());
            this.hnj.dnm.set(true);
            return;
        }
        if (this.f13503hn == null) {
            try {
                hn(hnVar);
            } catch (Throwable th2) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th2);
            }
        }
        com.bytedance.sdk.openadsdk.common.uua uuaVar = this.f13503hn;
        if (uuaVar != null) {
            uuaVar.hnj();
        }
    }

    private void hn(final com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar) {
        if (this.f13503hn == null) {
            hnj hnjVar = this.hnj;
            com.bytedance.sdk.openadsdk.common.uua uuaVar = new com.bytedance.sdk.openadsdk.common.uua(hnjVar.orp, hnjVar.f13456hn);
            this.f13503hn = uuaVar;
            uuaVar.setCallback(new com.bytedance.sdk.openadsdk.common.uua.hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.qor.1
                @Override // com.bytedance.sdk.openadsdk.common.uua.hnj
                public void hn(View view) {
                    qor.this.hnj.f13462ta.set(false);
                    if (qor.this.hnj.eum.f13444sk) {
                        if (qor.this.hnj.f33do != null) {
                            qor.this.hnj.f33do.hnj(0, true);
                            return;
                        }
                        return;
                    }
                    qor.this.hnj.eum.hnj(hnVar);
                    if (qor.this.hnj.eum.ojm()) {
                        qor.this.hnj.eum.eum();
                    }
                    if (qor.this.qor()) {
                        qor.this.hnj.f13463th.ff().hn(qor.this.hnj.f13463th, 1);
                    }
                    com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(qor.this.hnj.f13456hn, 4);
                    qor.this.hnj.as.hnj(0);
                    qor.this.hnj.as.sk();
                    if (qor.this.hnj.f13455gn != null) {
                        qor.this.hnj.f13455gn.hnj();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.uua.hnj
                public void hnj(View view) {
                    qor.this.hnj.f13462ta.set(true);
                    String str = "landing_page";
                    if (!apu.hn(qor.this.hnj.f13456hn) && !apu.gjv(qor.this.hnj.f13456hn) && !apu.dkl(qor.this.hnj.f13456hn) && !apu.dse(qor.this.hnj.f13456hn)) {
                        if (!qor.this.hnj.ojm.get()) {
                            str = "video_player";
                        } else if (hqh.hn(qor.this.hnj.f13456hn)) {
                            str = "playable";
                        } else if (!qor.this.hnj.f13456hn.ko()) {
                            str = CampaignEx.JSON_NATIVE_VIDEO_ENDCARD;
                        }
                    }
                    qor.this.f13503hn.setDislikeSource(str);
                    if (qor.this.hnj.eum.f13444sk) {
                        if (qor.this.hnj.f33do != null) {
                            qor.this.hnj.f33do.hnj(8, false);
                            return;
                        }
                        return;
                    }
                    hnVar.mjg();
                    if (qor.this.hnj.eum.dkl()) {
                        qor.this.hnj.eum.wu();
                    }
                    if (qor.this.qor()) {
                        qor.this.hnj.f13463th.ff().hn(qor.this.hnj.f13463th, 2);
                    }
                    com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(qor.this.hnj.f13456hn, 8);
                    qor.this.hnj.as.dkl();
                    qor.this.hnj.as.aq();
                    if (qor.this.hnj.f13455gn != null) {
                        qor.this.hnj.f13455gn.hn();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.uua.hnj
                public void hnj(FilterWord filterWord) {
                    if (qor.this.hnj.dnm.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    qor.this.hnj.dnm.set(true);
                    if (qor.this.hnj.f13463th != null) {
                        qor.this.hnj.f13463th.ff().qor(true);
                    }
                    qor.this.gjv();
                }
            });
            ((FrameLayout) this.hnj.orp.findViewById(R.id.content)).addView(this.f13503hn);
        }
        if (this.qor == null) {
            this.qor = new TTAdDislikeToast(this.hnj.orp);
            ((FrameLayout) this.hnj.orp.findViewById(R.id.content)).addView(this.qor);
        }
    }

    public void hnj() {
        TTAdDislikeToast tTAdDislikeToast = this.qor;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.hide();
        }
    }
}
