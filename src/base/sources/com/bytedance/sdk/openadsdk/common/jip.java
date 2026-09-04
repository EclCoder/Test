package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.core.model.hqh;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class jip {
    protected String dkl;
    protected final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj dse;
    protected String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected String f13301hn;
    protected String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected String f13302sk;

    public jip(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        this.dse = hnjVar;
        sk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean aq() {
        if (!hqh.aq(this.dse.f13456hn)) {
            return false;
        }
        this.dse.as.ojm();
        return true;
    }

    private boolean dkl() {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.dse;
        return !hnjVar.dy && hnjVar.ojm.get();
    }

    private boolean dse() {
        return com.bytedance.sdk.openadsdk.core.oj.gjv().aq(String.valueOf(this.dse.dkl));
    }

    private boolean hn(boolean z10, boolean z11, Runnable runnable) {
        if ((z10 || !dkl() || !aq()) && runnable == null) {
            if (z11) {
                qor();
                return true;
            }
            gjv();
        }
        return false;
    }

    private boolean ojm() {
        return !this.dse.f13456hn.dzo() && hqh.aq(this.dse.f13456hn) && this.dse.nyv.aq().getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor(boolean z10) {
        this.dse.eum.eum();
        if (z10) {
            this.dse.as.hnj(1000);
        }
        this.dse.uua.set(false);
    }

    private void sk() {
        if (this.f13301hn != null) {
            return;
        }
        try {
            this.f13301hn = wu.hnj(this.dse.jbd, "tt_reward_msg");
            this.qor = wu.hnj(this.dse.jbd, "tt_msgPlayable");
            this.dkl = wu.hnj(this.dse.jbd, "tt_negtiveBtnBtnText");
            this.gjv = wu.hnj(this.dse.jbd, "tt_postiveBtnText");
            this.f13302sk = wu.hnj(this.dse.jbd, "tt_postiveBtnTextPlayable");
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("RewardTipDialogHelper", "init res text failed：" + th2.getMessage());
        }
    }

    public void gjv() {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.dse;
        if (hnjVar == null) {
            com.bytedance.sdk.component.utils.apu.qor("execSkipTaskBaseImpl adContext is null", new Object[0]);
            return;
        }
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar = hnjVar.f13463th;
        if (aqVar == null || !(aqVar instanceof com.bytedance.sdk.openadsdk.activity.single.sk)) {
            hnjVar.eum.gm();
            hnj.hnj(this.dse);
            hnj(this.dse);
        } else {
            if (((com.bytedance.sdk.openadsdk.activity.single.sk) aqVar).aq()) {
                return;
            }
            qor();
        }
    }

    protected abstract boolean hn();

    protected abstract void hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar);

    protected abstract void hnj(boolean z10);

    protected abstract boolean hnj();

    protected abstract void qor();

    public final boolean hnj(boolean z10, boolean z11, Runnable runnable) {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.dse;
        if (hnjVar.f13463th instanceof com.bytedance.sdk.openadsdk.activity.single.sk) {
            if (!hnjVar.gjv || hn() || (this.dse.f13463th.ff() != null && this.dse.f13463th.ff().uua())) {
                return false;
            }
            if (!z11 && hnj()) {
                return false;
            }
            if (!dse()) {
                if (!z11) {
                    return false;
                }
                if (runnable == null && z10) {
                    qor();
                    return true;
                }
            }
        } else {
            if (hnj(z11, runnable)) {
                return false;
            }
            if (!dse()) {
                return hn(z11, z10, runnable);
            }
            if (hn()) {
                hn(z10, runnable);
                return false;
            }
            if (ojm()) {
                this.dse.as.ojm();
                return false;
            }
        }
        qor(z10, runnable);
        return true;
    }

    private void hn(boolean z10, Runnable runnable) {
        if (!(dkl() && aq()) && runnable == null) {
            if (z10) {
                qor();
            } else {
                gjv();
            }
        }
    }

    private void qor(final boolean z10, final Runnable runnable) {
        hn(z10);
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.dse;
        if (hnjVar != null && !hnjVar.orp.isFinishing() && !this.dse.orp.isDestroyed()) {
            final com.bytedance.sdk.openadsdk.core.widget.hn hnVar = new com.bytedance.sdk.openadsdk.core.widget.hn(this.dse.orp);
            com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar2 = this.dse.f13460qb;
            if (hnVar2 == null) {
                com.bytedance.sdk.component.utils.apu.qor("RewardTipDialogHelper", "adContext or  adType == null");
                return;
            }
            hnVar2.bug = hnVar;
            if (z10) {
                hnVar.hnj(this.qor).hn(this.f13302sk).qor(this.dkl);
            } else {
                hnVar.hnj(this.f13301hn).hn(this.gjv).qor(this.dkl);
            }
            hnVar.hnj(new com.bytedance.sdk.openadsdk.core.widget.hn.InterfaceC0238hn() { // from class: com.bytedance.sdk.openadsdk.common.jip.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.hn.InterfaceC0238hn
                public void hn() {
                    hnVar.dismiss();
                    jip.this.hnj(true);
                    jip.this.dse.uua.set(false);
                    jip.this.dse.as.hn(Integer.MAX_VALUE);
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    if (!z10) {
                        jip.this.gjv();
                        return;
                    }
                    jip jipVar = jip.this;
                    if (jipVar.dse.dy || !jipVar.aq()) {
                        jip.this.dse.tgn.dkl();
                        jip.this.qor();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.hn.InterfaceC0238hn
                public void hnj() {
                    jip.this.qor(z10);
                    hnVar.dismiss();
                }
            }).show();
            return;
        }
        com.bytedance.sdk.component.utils.apu.qor("RewardTipDialogHelper", "adContext or activity is null");
    }

    private void hn(boolean z10) {
        this.dse.eum.wu();
        if (z10) {
            this.dse.as.dkl();
        }
        this.dse.uua.set(true);
    }

    private boolean hnj(boolean z10, Runnable runnable) {
        if (z10 || !hnj()) {
            return false;
        }
        if (!this.dse.dy) {
            if (dkl()) {
                return aq();
            }
            return false;
        }
        if (runnable != null) {
            return true;
        }
        gjv();
        return true;
    }
}
