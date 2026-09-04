package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class pty implements Handler.Callback, com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.InterfaceC0222hnj {
    private boolean aq;
    private int bug;
    private boolean dkl;
    private boolean dse;
    private final com.bytedance.sdk.openadsdk.core.model.as gjv;
    private boolean ojm;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj f14709sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f14710ta;
    private float hnj = 1.0f;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f14708hn = 1000;
    private final Handler qor = new Handler(Looper.getMainLooper(), this);
    private int dnm = 0;

    public pty(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.as asVar) {
        this.f14710ta = 0;
        this.bug = 0;
        this.f14709sk = hnjVar;
        this.gjv = asVar;
        if (asVar.hhw()) {
            if (asVar.qlh() >= 0) {
                this.bug = asVar.qlh();
            } else {
                this.bug = com.bytedance.sdk.openadsdk.core.oj.gjv().ta(String.valueOf(asVar.atw()));
            }
        } else if (asVar.oq()) {
            if (asVar.kht() >= 0) {
                this.bug = asVar.kht();
            } else {
                this.bug = com.bytedance.sdk.openadsdk.core.oj.gjv().xn(String.valueOf(asVar.atw()));
            }
        }
        this.f14710ta = (int) hnjVar.eum.sq();
        com.bytedance.sdk.component.utils.apu.hnj("TTAD.TopLayoutHelper", "totalTime: " + this.f14710ta + ", skipTime=" + this.bug);
    }

    public void gjv() {
        if (!this.dkl || this.dse) {
            return;
        }
        this.qor.removeMessages(UserVerificationMethods.USER_VERIFY_ALL);
        this.dse = true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1024) {
            int i10 = this.f14710ta;
            int i11 = this.dnm;
            int i12 = i10 - i11;
            this.f14709sk.eum.hnj(((long) i11) * 1000);
            com.bytedance.sdk.component.utils.apu.hnj("TTAD.TopLayoutHelper", "handleMessage: currentTime= " + this.dnm + ", mRemainTimeInSeconds=" + i12);
            if (i12 > 0) {
                Activity activity = this.f14709sk.orp;
                if (activity instanceof TTRewardVideoActivity) {
                    ((TTRewardVideoActivity) activity).qor(((long) this.dnm) * 1000, this.f14710ta);
                }
                com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar = this.f14709sk.f33do;
                boolean z10 = false;
                if (ojmVar != null && ojmVar.hnj() != null) {
                    this.f14709sk.f33do.hnj().setTime(String.valueOf(i12), this.dnm, 0, false);
                }
                if (this.gjv.hhw()) {
                    com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar2 = this.f14709sk.f33do;
                    if (ojmVar2 != null) {
                        if (ojmVar2.ojm() && this.bug > 0) {
                            z10 = true;
                        }
                        this.ojm = z10;
                    }
                    if (!this.ojm || this.dnm < this.bug || this.f14709sk.f13456hn.qb() == 5 || this.f14709sk.f13456hn.qb() == 33) {
                        this.f14709sk.f13454gm.hnj(String.valueOf(i12), null);
                    } else {
                        this.f14709sk.hnj(true);
                        this.f14709sk.f13454gm.hnj(String.valueOf(i12), TTAdDislikeToast.getSkipText());
                        this.f14709sk.f13454gm.sk(true);
                    }
                } else if (this.gjv.oq() && (this.f14709sk.f33do.ojm() || this.f14709sk.f13456hn.ouk())) {
                    Activity activity2 = this.f14709sk.orp;
                    if (activity2 instanceof TTFullScreenVideoActivity) {
                        ((TTFullScreenVideoActivity) activity2).hnj(this.dnm);
                    }
                    this.f14709sk.f13454gm.gjv(true);
                    this.f14709sk.f13454gm.hnj(String.valueOf(i12), null);
                }
                this.dnm++;
                if (this.f14709sk.eum.qor()) {
                    com.bytedance.sdk.openadsdk.core.model.nyv nyvVarLq = this.f14709sk.f13456hn.lq();
                    if (nyvVarLq != null) {
                        float fHnj = nyvVarLq.hnj();
                        this.hnj = fHnj;
                        if (fHnj <= 0.0f) {
                            this.hnj = 1.0f;
                        }
                    }
                } else {
                    this.hnj = 1.0f;
                }
                int i13 = (int) (1000.0f / this.hnj);
                com.bytedance.sdk.component.utils.apu.hnj("TTAD.TopLayoutHelper", "handleMessage: next msg intervalInMillis = ".concat(String.valueOf(i13)));
                this.qor.sendEmptyMessageDelayed(message.what, i13);
            }
        }
        return true;
    }

    public void hn() {
        this.qor.sendEmptyMessage(UserVerificationMethods.USER_VERIFY_ALL);
        this.dse = false;
    }

    public boolean hnj() {
        return this.dkl;
    }

    public void qor() {
        if (this.dkl) {
            this.qor.removeMessages(UserVerificationMethods.USER_VERIFY_ALL);
            this.qor.sendEmptyMessage(UserVerificationMethods.USER_VERIFY_ALL);
            this.dse = false;
        }
    }

    public void sk() {
        this.qor.removeMessages(UserVerificationMethods.USER_VERIFY_ALL);
        this.dkl = false;
        this.aq = true;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f14709sk;
        if (hnjVar != null) {
            hnjVar.eum.gm();
        }
    }

    public void hnj(long j10) {
        int iCeil = (int) Math.ceil(j10 / 1000.0d);
        if (this.dse && !this.aq) {
            this.dnm = iCeil;
            qor();
        } else {
            if (this.dkl || this.aq) {
                return;
            }
            this.dnm = iCeil;
            this.dkl = true;
            hn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.InterfaceC0222hnj
    public void hnj(int i10) {
        com.bytedance.sdk.component.utils.apu.hnj("TTAD.TopLayoutHelper", "onPlayerStateChanged: ".concat(String.valueOf(i10)));
        if (i10 == 1) {
            qor();
            return;
        }
        if (i10 == 2) {
            gjv();
        } else if (i10 == 3 || i10 == 4) {
            sk();
        }
    }
}
