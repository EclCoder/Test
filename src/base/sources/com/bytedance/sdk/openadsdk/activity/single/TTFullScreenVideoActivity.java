package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.jip;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.vf;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.fc;
import com.bytedance.sdk.openadsdk.gjv.ta;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static com.bytedance.sdk.openadsdk.hnj.qor.hn uua;
    private com.bytedance.sdk.openadsdk.hnj.qor.hn jip;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private boolean f13056oj;

    private void qor(int i10) {
        this.f13046hn.f13454gm.hnj(null, String.format(wu.hnj(oj.hnj(), "tt_skip_ad_time_text"), Integer.valueOf(i10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sq() {
        toString();
        com.bytedance.sdk.openadsdk.hnj.qor.hn hnVar = this.jip;
        if (hnVar != null) {
            hnVar.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: do */
    protected void mo15do() {
        final View viewTa = this.f13046hn.f13464ua.ta();
        if (viewTa != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTFullScreenVideoActivity.this.f13046hn.nyv.apu() && TTFullScreenVideoActivity.this.f13046hn.ojm.get()) {
                        boolean zOrl = TTFullScreenVideoActivity.this.f13046hn.pty.orl();
                        TTFullScreenVideoActivity.this.f13046hn.nyv.dkl(zOrl);
                        TTFullScreenVideoActivity.this.f13046hn.f13464ua.dkl(8);
                        View view2 = viewTa;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.dkl.gjv) {
                            ((com.bytedance.sdk.openadsdk.core.dkl.gjv) view2).setImageResource(wu.gjv(TTFullScreenVideoActivity.this.f13046hn.jbd, "tt_close_btn"));
                        }
                        TTFullScreenVideoActivity.this.f13046hn.f13453ff.sendEmptyMessageDelayed(Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE, 5000L);
                        if (!as.qor(TTFullScreenVideoActivity.this.f13046hn.f13456hn)) {
                            return;
                        }
                        if (as.qor(TTFullScreenVideoActivity.this.f13046hn.f13456hn) && zOrl) {
                            return;
                        }
                    }
                    TTFullScreenVideoActivity.this.f13046hn.nyv.eum();
                    TTFullScreenVideoActivity.this.f13046hn.pty.dnm();
                    TTFullScreenVideoActivity.this.f13046hn.tgn.dkl();
                    TTFullScreenVideoActivity.this.finish();
                }
            };
            viewTa.setOnClickListener(onClickListener);
            viewTa.setTag(viewTa.getId(), onClickListener);
        }
        this.f13046hn.f13454gm.hnj(new com.bytedance.sdk.openadsdk.component.reward.top.hn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hn(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.f13046hn.f13466vf.hnj(tTFullScreenVideoActivity.qor);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hnj(View view) {
                com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx;
                com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
                com.bytedance.sdk.openadsdk.component.reward.view.qor qorVarHnj;
                if (hqh.dkl(TTFullScreenVideoActivity.this.f13046hn.f13456hn) || (hqh.sk(TTFullScreenVideoActivity.this.f13046hn.f13456hn) && TTFullScreenVideoActivity.this.f13046hn.as.gjv(com.bytedance.sdk.openadsdk.component.reward.hnj.aq.f13430hn))) {
                    if (hqh.aq(TTFullScreenVideoActivity.this.f13046hn.f13456hn)) {
                        TTFullScreenVideoActivity.this.f13046hn.as.ojm();
                        return;
                    }
                    View view2 = viewTa;
                    if (view2 != null) {
                        view2.performClick();
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.finish();
                        return;
                    }
                }
                if (apu.hnj(TTFullScreenVideoActivity.this.f13046hn.f13456hn) && !TTFullScreenVideoActivity.this.f13046hn.orl.get()) {
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                fc.hnj hnjVar = new fc.hnj();
                hnjVar.hn(TTFullScreenVideoActivity.this.f13046hn.eum.orl());
                hnjVar.gjv(TTFullScreenVideoActivity.this.f13046hn.eum.tgn());
                hnjVar.qor(TTFullScreenVideoActivity.this.f13046hn.eum.uua());
                hnjVar.qor(3);
                hnjVar.gjv(TTFullScreenVideoActivity.this.f13046hn.eum.tu());
                hnjVar.hnj(TTFullScreenVideoActivity.this.f13046hn.eum.hn());
                com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hnj(TTFullScreenVideoActivity.this.f13046hn.eum.aq(), hnjVar, TTFullScreenVideoActivity.this.f13046hn.eum.sk());
                vf.qor(TTFullScreenVideoActivity.this.f13046hn.dkl);
                TTFullScreenVideoActivity.this.f13046hn.eum.hnj(FreeSpaceBox.TYPE, false);
                TTFullScreenVideoActivity.this.f13046hn.f13454gm.gjv(false);
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = TTFullScreenVideoActivity.this.f13046hn;
                if (!hnjVar2.qor || (apu.qor(hnjVar2.f13456hn) && (qorVarHnj = TTFullScreenVideoActivity.this.f13046hn.f33do.hnj()) != null && qorVarHnj.gjv == 0)) {
                    TTFullScreenVideoActivity.this.finish();
                } else {
                    TTFullScreenVideoActivity.this.hnj(true, 4);
                }
                as asVar = TTFullScreenVideoActivity.this.f13046hn.f13456hn;
                if (asVar != null && (gjvVarFvx = asVar.fvx()) != null && (gjvVarHnj = gjvVarFvx.hnj()) != null) {
                    gjvVarHnj.dkl(TTFullScreenVideoActivity.this.f13046hn.eum.orl());
                    gjvVarHnj.sk(TTFullScreenVideoActivity.this.f13046hn.eum.orl());
                }
                com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(TTFullScreenVideoActivity.this.f13046hn.f13456hn, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void qor(View view) {
                View view2 = viewTa;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void gjv(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hnj(View view, String str) {
                com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx;
                com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = TTFullScreenVideoActivity.this.f13046hn;
                boolean z10 = !hnjVar.dzo;
                hnjVar.dzo = z10;
                hnjVar.eum.hnj(z10, str);
                if (!hqh.jip(TTFullScreenVideoActivity.this.f13046hn.f13456hn) || TTFullScreenVideoActivity.this.f13046hn.ojm.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = TTFullScreenVideoActivity.this.f13046hn;
                    hnjVar2.nyv.sk(hnjVar2.dzo);
                    com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = TTFullScreenVideoActivity.this.f13046hn;
                    hnjVar3.as.hn(hnjVar3.dzo);
                    as asVar = TTFullScreenVideoActivity.this.f13046hn.f13456hn;
                    if (asVar == null || (gjvVarFvx = asVar.fvx()) == null || (gjvVarHnj = gjvVarFvx.hnj()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar4 = TTFullScreenVideoActivity.this.f13046hn;
                    if (hnjVar4.dzo) {
                        gjvVarHnj.aq(hnjVar4.eum.orl());
                    } else {
                        gjvVarHnj.ojm(hnjVar4.eum.orl());
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void eum() {
        com.bytedance.sdk.openadsdk.component.reward.view.qor qorVarHnj;
        super.eum();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        if (hnjVar == null || (qorVarHnj = hnjVar.f33do.hnj()) == null) {
            return;
        }
        qorVarHnj.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.sk() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.sk
            public void hnj() {
                TTFullScreenVideoActivity.this.sq();
            }
        });
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.bug) {
            return;
        }
        uua = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.f13046hn != null) {
            com.bytedance.sdk.openadsdk.dkl.hn.hnj().hnj("videoForceBreak", this.f13046hn.f13456hn);
        }
        try {
            aq();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void gjv() {
        toString();
        com.bytedance.sdk.openadsdk.hnj.qor.hn hnVar = this.jip;
        if (hnVar != null) {
            hnVar.hn();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
            ta.hnj(hnjVar != null ? hnjVar.f13456hn : null, "close", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout gm() {
        return this.f13046hn.f13464ua.dkl();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hn(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hnj(String str, JSONObject jSONObject) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void mjg() {
        if (as.sk(this.f13046hn.f13456hn)) {
            this.f13046hn.f13454gm.hnj(null, TTAdDislikeToast.getSkipText());
        } else {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
            if (hnjVar.qor) {
                this.f13046hn.f13454gm.hnj(null, TTAdDislikeToast.getSkipText());
            } else {
                hnjVar.f13454gm.hnj(null, "X");
            }
        }
        this.f13046hn.f13454gm.sk(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void mkl() {
        sq();
        this.f13046hn.f13456hn.mfh();
        this.f13046hn.f13456hn.gjv(true);
        if (as.sk(this.f13046hn.f13456hn)) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
            as asVar = hnjVar.f13456hn;
            com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, hnjVar.f13461sk, asVar.zxr());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        if (hnjVar == null || as.sk(hnjVar.f13456hn)) {
            return;
        }
        com.bykv.vk.openvk.hnj.hnj.hnj.qor.a aVarPwt = this.f13046hn.f13456hn.pwt();
        if (aVarPwt == null) {
            com.bykv.vk.openvk.hnj.hnj.hnj.qor.a aVar = new com.bykv.vk.openvk.hnj.hnj.hnj.qor.a();
            aVar.t(10.0d);
            this.f13046hn.f13456hn.hnj(aVar);
        } else if (aVarPwt.e() <= 0.0d) {
            aVarPwt.t(10.0d);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        aq();
        hnj(isFinishing(), isChangingConfigurations());
        if (this.bug) {
            return;
        }
        this.jip = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.bug) {
            uua = this.jip;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        if (hnjVar == null || !hn(hnjVar.f13456hn) || hnj(this.f13046hn.f13456hn)) {
            return;
        }
        if (this.f13056oj) {
            this.f13056oj = false;
            finish();
        } else if (this.f13046hn.nyv.tgn()) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected jip orl() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean tgn() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean tu() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void ul() {
        if (this.f13046hn.f13456hn.m34if() != 100.0f) {
            this.f13056oj = true;
        }
        sq();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void xn() {
        com.bytedance.sdk.openadsdk.hnj.qor.hn hnVar = this.jip;
        if (hnVar != null) {
            hnVar.hnj();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
            ta.hnj(hnjVar != null ? hnjVar.f13456hn : null, "show", 0);
        }
        if (xyo()) {
            this.f13046hn.f33do.orl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hn(boolean z10) {
    }

    private boolean hn(as asVar) {
        if (asVar == null) {
            return false;
        }
        return oj.gjv().apu(String.valueOf(this.f13046hn.dkl));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void hnj(Intent intent) {
        super.hnj(intent);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hnj(Bundle bundle) {
        if (this.bug) {
            super.hnj(bundle);
            this.jip = (com.bytedance.sdk.openadsdk.hnj.qor.hn) com.bytedance.sdk.openadsdk.core.hqh.hnj().hnj(this.f13043ta, com.bytedance.sdk.openadsdk.hnj.qor.hn.class);
            return;
        }
        com.bytedance.sdk.openadsdk.hnj.qor.hn hnVarQor = com.bytedance.sdk.openadsdk.core.hqh.hnj().qor();
        this.jip = hnVarQor;
        if (hnVarQor != null || bundle == null) {
            return;
        }
        this.jip = uua;
        uua = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void hnj(long j10, long j11) {
        hnj((int) (j10 / 1000));
        int i10 = this.f13048sk;
        if (i10 >= 0) {
            this.f13046hn.f13454gm.hnj(String.valueOf(i10), null);
        }
    }

    public void hnj(int i10) {
        int iKht = this.f13046hn.f13456hn.kht();
        if (!oj.gjv().dkl(String.valueOf(this.f13046hn.dkl)) || (!as.sk(this.f13046hn.f13456hn) && !this.f13046hn.qor)) {
            if (i10 >= iKht) {
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
                if (!hnjVar.izk) {
                    hnjVar.hnj(true);
                }
                mjg();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.f13046hn;
        if (!hnjVar2.izk) {
            hnjVar2.hnj(true);
        }
        if (i10 <= iKht) {
            qor(iKht - i10);
            this.f13046hn.f13454gm.sk(false);
        } else {
            mjg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void dkl() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void ua() {
    }

    private boolean hnj(as asVar) {
        return asVar == null || asVar.m34if() == 100.0f;
    }
}
