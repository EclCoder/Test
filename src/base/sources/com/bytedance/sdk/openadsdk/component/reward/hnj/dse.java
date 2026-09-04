package com.bytedance.sdk.openadsdk.component.reward.hnj;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse extends ojm implements Handler.Callback {
    private final Handler apu;
    private int as;
    boolean dkl;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private boolean f31do;
    protected int dse;
    private boolean eum;
    int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    long f13439hn;
    boolean hnj;
    int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    int f13440sk;
    private int tgn;
    private int tu;
    private int wu;
    private boolean xyo;

    public dse(hnj hnjVar) {
        super(hnjVar);
        this.apu = new Handler(this);
        this.hnj = false;
        this.f13439hn = 0L;
        this.qor = 0;
        this.gjv = 0;
        this.f13440sk = 0;
        this.dkl = false;
        this.eum = false;
        this.wu = 0;
        this.f31do = false;
        this.tu = 0;
        this.tgn = 0;
        this.xyo = false;
        this.dse = hqh.ojm(this.f13497ta);
        this.gjv = this.f13497ta.bf();
        int iAcd = this.f13497ta.acd();
        this.f13440sk = iAcd;
        this.tu = Math.max(0, this.gjv - iAcd);
    }

    private boolean jip() {
        if (this.bug.dy) {
            return false;
        }
        int i10 = this.dse;
        return 1 == i10 || 2 == i10;
    }

    private boolean oj() {
        return this.aq && hqh.qor(this.bug.f13456hn) && !this.f13498xn.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uua() {
        int i10 = !this.f31do ? this.f13440sk - this.qor : this.f13440sk + this.tgn;
        int i11 = oj.gjv().tgn(String.valueOf(this.bug.dkl)).dkl;
        int i12 = this.gjv;
        boolean z10 = false;
        boolean z11 = i12 <= 0 || (((float) i10) / ((float) i12)) * 100.0f >= ((float) i11);
        int iHnj = oj.gjv().hnj(String.valueOf(this.bug.dkl));
        if (iHnj == 0) {
            com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar = this.f13496oj;
            boolean zDkl = hnjVar != null ? hnjVar.dkl() : false;
            if (this.f13494fc) {
                zDkl = true;
            }
            if (z11 && zDkl) {
                z10 = true;
            }
        } else if (iHnj == 1) {
            z10 = z11;
        }
        if (z10) {
            this.bug.sq.hn(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.ojm
    public int aq() {
        return this.as;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.ojm
    public void dkl() {
        if (this.mjg && !this.jip) {
            super.dkl();
            this.apu.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.ojm
    public int dse() {
        return this.qor;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.ojm
    public void gjv() {
        com.bytedance.sdk.openadsdk.core.widget.hn hnVar;
        if (this.mjg) {
            super.gjv();
            if (DeviceUtils.dse() == 0) {
                this.bug.dzo = true;
            }
            hnj hnjVar = this.bug;
            if (hnjVar.dzo) {
                hnjVar.f13454gm.hn(true);
                qor(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar2 = this.bug.f13460qb;
            if ((hnVar2 == null || (hnVar = hnVar2.bug) == null || !hnVar.isShowing()) && dnm() && dse() > 0) {
                hnj(0L);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 900 || !oj()) {
            return true;
        }
        int i10 = message.arg1;
        boolean z10 = false;
        if (this.f31do) {
            int i11 = this.f13440sk;
            int i12 = this.tgn;
            int i13 = i11 + i12;
            int i14 = this.gjv;
            if (i13 < i14) {
                this.tgn = i12 + 1;
                Message messageObtain = Message.obtain();
                messageObtain.what = 900;
                messageObtain.arg1 = 0;
                this.apu.sendMessageDelayed(messageObtain, 1000L);
            } else {
                this.tgn = i14 - i11;
            }
        } else if (i10 > 0) {
            if (this.wu == 0 && 2 == this.dse) {
                z10 = true;
            }
            this.bug.f13454gm.gjv(true);
            if (!z10) {
                this.bug.f13454gm.hnj(String.valueOf(i10), null);
            }
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 900;
            int i15 = i10 - 1;
            messageObtain2.arg1 = i15;
            this.apu.sendMessageDelayed(messageObtain2, 1000L);
            this.qor = i15;
            this.as = i10;
        } else {
            this.dkl = true;
            if (!hqh.aq(this.f13497ta) || (hqh.apu(this.f13497ta) && this.f13496oj.sk())) {
                this.bug.f13454gm.gjv(false);
                this.bug.jip.set(true);
                this.bug.f13460qb.orl();
            } else {
                this.bug.f13454gm.qor();
                this.bug.f13454gm.sk(true);
            }
            com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar = this.f13496oj;
            if (hnjVar == null || hnjVar.sk()) {
                this.f13494fc = true;
            }
            if (this.tu > 0) {
                this.f31do = true;
                this.tgn++;
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 900;
                messageObtain3.arg1 = 0;
                this.apu.sendMessageDelayed(messageObtain3, 1000L);
            }
            this.as = 0;
        }
        uua();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.ojm
    public void ojm() {
        if (this.mjg) {
            this.eum = true;
            this.apu.removeMessages(900);
            this.apu.removeMessages(Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.ojm
    public void qor() {
        if (this.mjg) {
            this.aq = true;
            boolean zJip = jip();
            if (zJip) {
                this.f13496oj.hnj(new com.bytedance.sdk.openadsdk.wu.hnj.hnj.InterfaceC0257hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.dse.2
                    @Override // com.bytedance.sdk.openadsdk.wu.hnj.hnj.InterfaceC0257hnj
                    public void hnj(int i10) {
                        if (dse.this.xyo) {
                            return;
                        }
                        dse.this.wu = i10;
                        dse.this.f13496oj.hnj((com.bytedance.sdk.openadsdk.wu.hnj.hnj.InterfaceC0257hnj) null);
                        dse.this.hn(i10);
                    }
                });
            }
            this.f13496oj.hnj();
            if (hqh.aq(this.f13497ta)) {
                this.bug.nyv.dkl();
            }
            this.f13439hn = System.currentTimeMillis();
            if (!zJip) {
                hn(0);
            }
            this.bug.sq.fr();
            com.bytedance.sdk.openadsdk.component.reward.bug bugVar = this.bug.f13457jo;
            if (bugVar != null) {
                bugVar.hnj(this.gjv);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.ojm
    public void sk() {
        if (this.mjg) {
            super.sk();
            ojm();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.ojm
    public boolean ta() {
        return this.dkl;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.ojm
    protected com.bytedance.sdk.openadsdk.orl.dkl hn() {
        return new com.bytedance.sdk.openadsdk.orl.dkl() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.dse.1
            @Override // com.bytedance.sdk.openadsdk.orl.dkl
            public void hnj() {
                dse.this.uua();
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.ojm
    public void hnj() {
        if (this.mjg && !this.orl) {
            super.hnj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(int i10) {
        hnj(this.f13440sk);
        if (this.eum) {
            return;
        }
        Handler handler = this.apu;
        handler.sendMessage(handler.obtainMessage(900, this.f13440sk, i10));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.ojm
    protected void hnj(boolean z10) {
        if (this.uua != null) {
            try {
                com.bytedance.sdk.openadsdk.wu.hnj.hn hnVarHnj = com.bytedance.sdk.openadsdk.wu.hnj.gjv.hnj().hnj(this.f13497ta, this.uua, hn());
                this.f13496oj = hnVarHnj;
                hnVarHnj.hnj(this.bug.sq);
            } catch (Throwable th2) {
                apu.qor("RVIVPlayableNewManager", "PreRender injection exception" + th2.getMessage());
            }
            if (this.f13496oj == null) {
                super.hnj(z10);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.ojm
    public void hnj(int i10) {
        this.qor = i10;
        this.as = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.ojm
    public void hnj(long j10) {
        if (this.mjg && this.aq && !this.bug.f13462ta.get() && this.eum) {
            this.eum = false;
            Message messageObtain = Message.obtain();
            messageObtain.what = 900;
            messageObtain.arg1 = dse();
            messageObtain.arg2 = this.wu;
            this.apu.sendMessageDelayed(messageObtain, j10);
        }
    }
}
