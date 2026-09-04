package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.oj;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.jip;
import com.bytedance.sdk.openadsdk.component.reward.bug;
import com.bytedance.sdk.openadsdk.core.Cdo;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.vf;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.fc;
import com.bytedance.sdk.openadsdk.gjv.ta;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.tgn;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.google.firebase.installations.ktx.gUsI.dmHT;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String apu;
    private static String as;
    private static String eum;
    private static com.bytedance.sdk.openadsdk.hnj.sk.hnj tgn;
    private static String wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private static String f13088xn;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private String f21do;
    protected int jip;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.hnj.sk.hnj f13089oj;
    private String tu;
    protected int uua;
    private final AtomicBoolean xyo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private int f13090vf = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public void ff() {
        toString();
        com.bytedance.sdk.openadsdk.hnj.sk.hnj hnjVar = this.f13089oj;
        if (hnjVar != null) {
            hnjVar.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x00a1  */
    public void jbd() {
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
        com.bytedance.sdk.openadsdk.component.reward.view.qor qorVarHnj;
        fc.hnj hnjVar = new fc.hnj();
        hnjVar.hn(this.f13046hn.eum.orl());
        hnjVar.gjv(this.f13046hn.eum.tgn());
        hnjVar.qor(this.f13046hn.eum.uua());
        hnjVar.qor(3);
        hnjVar.gjv(this.f13046hn.eum.tu());
        hnjVar.hnj(this.f13046hn.eum.hn());
        com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hnj(this.f13046hn.eum.aq(), hnjVar, this.f13046hn.eum.sk());
        vf.qor(this.f13046hn.dkl);
        this.f13046hn.eum.hnj(FreeSpaceBox.TYPE, false);
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.f13046hn;
        if (hnjVar2.qor) {
            if (apu.qor(hnjVar2.f13456hn) && (qorVarHnj = this.f13046hn.f33do.hnj()) != null && qorVarHnj.gjv == 0) {
                finish();
            } else {
                hnj(true, 4);
            }
            if (apu.hnj(this.f13046hn.f13456hn) && !this.f13046hn.orl.get()) {
                finish();
            }
        } else {
            finish();
        }
        com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = this.f13046hn.f13456hn.fvx();
        if (gjvVarFvx != null && (gjvVarHnj = gjvVarFvx.hnj()) != null) {
            long jOrl = this.f13046hn.eum.orl();
            gjvVarHnj.dkl(jOrl);
            gjvVarHnj.sk(jOrl);
        }
        com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(this.f13046hn.f13456hn, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void dkl() {
        bug bugVar;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        if (hnjVar == null || (bugVar = hnjVar.f13457jo) == null) {
            return;
        }
        bugVar.gjv();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: do */
    protected void mo15do() {
        final View viewTa = this.f13046hn.f13464ua.ta();
        if (viewTa != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTRewardVideoActivity.this.f13046hn.nyv.apu() && TTRewardVideoActivity.this.f13046hn.ojm.get()) {
                        boolean zOrl = TTRewardVideoActivity.this.f13046hn.pty.orl();
                        TTRewardVideoActivity.this.f13046hn.nyv.dkl(zOrl);
                        TTRewardVideoActivity.this.f13046hn.f13464ua.dkl(8);
                        View view2 = viewTa;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.dkl.gjv) {
                            ((com.bytedance.sdk.openadsdk.core.dkl.gjv) view2).setImageResource(wu.gjv(TTRewardVideoActivity.this.f13046hn.jbd, "tt_close_btn"));
                        }
                        TTRewardVideoActivity.this.f13046hn.f13453ff.sendEmptyMessageDelayed(Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE, 5000L);
                        if (!as.qor(TTRewardVideoActivity.this.f13046hn.f13456hn)) {
                            return;
                        }
                        if (as.qor(TTRewardVideoActivity.this.f13046hn.f13456hn) && zOrl) {
                            return;
                        }
                    }
                    TTRewardVideoActivity.this.f13046hn.nyv.eum();
                    TTRewardVideoActivity.this.f13046hn.pty.dnm();
                    TTRewardVideoActivity.this.f13046hn.tgn.dkl();
                    if (hqh.gjv(TTRewardVideoActivity.this.f13046hn.f13456hn)) {
                        TTRewardVideoActivity.this.qor(true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            };
            viewTa.setOnClickListener(onClickListener);
            viewTa.setTag(viewTa.getId(), onClickListener);
        }
        this.f13046hn.f13454gm.hnj(new com.bytedance.sdk.openadsdk.component.reward.top.hn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hn(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.f13046hn.f13466vf.hnj(tTRewardVideoActivity.qor);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hnj(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.qor(hqh.qor(tTRewardVideoActivity.f13046hn.f13456hn), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void qor(View view) {
                View view2 = viewTa;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hnj(View view, String str) {
                com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx;
                com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = TTRewardVideoActivity.this.f13046hn;
                hnjVar.dzo = !hnjVar.dzo;
                StringBuilder sb2 = new StringBuilder("will set is Mute ");
                sb2.append(TTRewardVideoActivity.this.f13046hn.dzo);
                sb2.append(" mLastVolume=");
                sb2.append(TTRewardVideoActivity.this.f13046hn.hqh.hnj());
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = TTRewardVideoActivity.this.f13046hn;
                hnjVar2.eum.hnj(hnjVar2.dzo, str);
                if (!hqh.jip(TTRewardVideoActivity.this.f13046hn.f13456hn) || TTRewardVideoActivity.this.f13046hn.ojm.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = TTRewardVideoActivity.this.f13046hn;
                    hnjVar3.nyv.sk(hnjVar3.dzo);
                    com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar4 = TTRewardVideoActivity.this.f13046hn;
                    hnjVar4.as.hn(hnjVar4.dzo);
                    as asVar = TTRewardVideoActivity.this.f13046hn.f13456hn;
                    if (asVar == null || (gjvVarFvx = asVar.fvx()) == null || (gjvVarHnj = gjvVarFvx.hnj()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar5 = TTRewardVideoActivity.this.f13046hn;
                    if (hnjVar5.dzo) {
                        gjvVarHnj.aq(hnjVar5.eum.orl());
                    } else {
                        gjvVarHnj.ojm(hnjVar5.eum.orl());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void gjv(View view) {
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
        qorVarHnj.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.sk() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.sk
            public void hnj() {
                TTRewardVideoActivity.this.ff();
            }
        });
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.bug) {
            return;
        }
        tgn = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.f13046hn != null) {
            com.bytedance.sdk.openadsdk.dkl.hn.hnj().hnj("videoForceBreak", this.f13046hn.f13456hn);
        }
        aq();
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void gjv() {
        com.bytedance.sdk.openadsdk.hnj.sk.hnj hnjVar = this.f13089oj;
        if (hnjVar != null) {
            hnjVar.hn();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.f13046hn;
            ta.hnj(hnjVar2 != null ? hnjVar2.f13456hn : null, "close", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout gm() {
        return this.f13046hn.f13464ua.dkl();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hnj(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void hqh() {
        sq();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void mjg() {
        this.f13046hn.f13454gm.hnj(null, TTAdDislikeToast.getSkipText());
        this.f13046hn.f13454gm.sk(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void mkl() {
        ff();
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
        try {
            if (f13088xn == null) {
                f13088xn = wu.hnj(this, "tt_reward_msg");
                apu = wu.hnj(this, "tt_msgPlayable");
                eum = wu.hnj(this, "tt_negtiveBtnBtnText");
                wu = wu.hnj(this, "tt_postiveBtnText");
                as = wu.hnj(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.RVA", th2.getMessage());
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
        this.f13089oj = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        bug bugVar;
        super.onPause();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        if (hnjVar == null || (bugVar = hnjVar.f13457jo) == null) {
            return;
        }
        bugVar.hnj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        bug bugVar;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        if (hnjVar == null || (bugVar = hnjVar.f13457jo) == null) {
            return;
        }
        bugVar.hn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.bug) {
            tgn = this.f13089oj;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected jip orl() {
        return new jip(this.f13046hn) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.jip
            protected boolean hn() {
                as asVar;
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.dse;
                return (hnjVar == null || (asVar = hnjVar.f13456hn) == null || !asVar.ff()) ? false : true;
            }

            @Override // com.bytedance.sdk.openadsdk.common.jip
            protected boolean hnj() {
                as asVar;
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.dse;
                return (hnjVar == null || (asVar = hnjVar.f13456hn) == null || !asVar.jip()) ? false : true;
            }

            @Override // com.bytedance.sdk.openadsdk.common.jip
            protected void qor() {
                TTRewardVideoActivity.this.finish();
            }

            @Override // com.bytedance.sdk.openadsdk.common.jip
            protected void hnj(boolean z10) {
                TTRewardVideoActivity.this.sk(z10);
            }

            @Override // com.bytedance.sdk.openadsdk.common.jip
            protected void hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
                com.bytedance.sdk.openadsdk.common.hnj.hnj(hnjVar, new com.bytedance.sdk.openadsdk.common.hnj.hn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.2.1
                    @Override // com.bytedance.sdk.openadsdk.common.hnj.hn
                    public void hnj(boolean z10, int i10) {
                        TTRewardVideoActivity.this.hnj(z10, i10);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.hnj.hn
                    public void hnj() {
                        TTRewardVideoActivity.this.finish();
                    }
                });
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void pty() {
        this.uua = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void qor() {
        final as asVar;
        super.qor();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        if (hnjVar == null || (asVar = hnjVar.f13456hn) == null || asVar.ff()) {
            return;
        }
        this.f13046hn.f13457jo = new bug(new bug.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.bug.hnj
            public void hnj(int i10) {
                if (asVar.ff() || asVar.jip()) {
                    return;
                }
                TTRewardVideoActivity.this.hnj(i10);
            }
        });
    }

    public void sk(boolean z10) {
        as asVar;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        if (hnjVar == null || (asVar = hnjVar.f13456hn) == null) {
            return;
        }
        asVar.qor(z10);
        bug.hnj(this.f13046hn.f13456hn, false, 3);
    }

    protected void sq() {
        hnj(0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean tgn() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean tu() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void ua() {
        hnj(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void ul() {
        ff();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void uua() {
        sq();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void xn() {
        com.bytedance.sdk.openadsdk.hnj.sk.hnj hnjVar = this.f13089oj;
        if (hnjVar != null) {
            hnjVar.hnj();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.f13046hn;
            ta.hnj(hnjVar2 != null ? hnjVar2.f13456hn : null, "show", 0);
        }
        if (xyo()) {
            this.f13046hn.f33do.orl();
        }
    }

    private JSONObject xad() {
        JSONObject jSONObject = new JSONObject();
        int iXyo = (int) this.f13046hn.eum.xyo();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.f13046hn.f13456hn.hkr());
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.f13046hn.f13456hn.tll());
            jSONObject.put("network", oj.qor(getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int iAf = this.f13046hn.f13456hn.af();
            String strGjv = "unKnow";
            if (iAf == 2) {
                strGjv = orp.hn();
            } else if (iAf == 1) {
                strGjv = orp.gjv();
            }
            jSONObject.put("user_agent", strGjv);
            JSONObject jSONObjectAzk = this.f13046hn.f13456hn.azk();
            jSONObjectAzk.put(dmHT.CDGCuqY, com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hn());
            jSONObject.put("extra", jSONObjectAzk);
            jSONObject.put("media_extra", this.f21do);
            jSONObject.put("video_duration", this.f13046hn.f13456hn.pwt().e());
            jSONObject.put("play_start_ts", this.jip);
            jSONObject.put("play_end_ts", this.uua);
            jSONObject.put("duration", iXyo);
            jSONObject.put("user_id", this.tu);
            jSONObject.put("trans_id", tgn.hnj().replace("-", ""));
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.hnj("TTAD.RVA", "", th2);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void hn(boolean z10, boolean z11) {
        this.jip = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hn(int i10) {
        if (i10 == 10000) {
            sq();
        }
    }

    protected void hn(long j10, long j11) {
        if (j11 <= 0) {
            return;
        }
        if (this.f13090vf == -1) {
            this.f13090vf = Math.min(100, this.f13046hn.f13456hn.jo());
        }
        if (((j10 / 1000.0f) / j11) * 100.0f >= this.f13090vf) {
            sq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor(final boolean z10, boolean z11) {
        as asVar;
        as asVar2;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        if (hnjVar == null || (asVar = hnjVar.f13456hn) == null) {
            return;
        }
        if (!z11 && asVar.jip() && this.f13046hn.ojm.get() && hqh.aq(this.f13046hn.f13456hn)) {
            this.f13046hn.as.ojm();
            return;
        }
        if (!com.bytedance.sdk.openadsdk.core.oj.gjv().aq(String.valueOf(this.f13046hn.dkl))) {
            if (!z11 && this.f13046hn.ojm.get() && hqh.aq(this.f13046hn.f13456hn)) {
                this.f13046hn.as.ojm();
                return;
            } else if (z10) {
                finish();
                return;
            } else {
                jbd();
                return;
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.f13046hn;
        if (hnjVar2 != null && (asVar2 = hnjVar2.f13456hn) != null && asVar2.ff()) {
            if (this.f13046hn.ojm.get() && hqh.aq(this.f13046hn.f13456hn)) {
                this.f13046hn.as.ojm();
                return;
            } else if (z10) {
                finish();
                return;
            } else {
                jbd();
                return;
            }
        }
        if (hqh.aq(this.f13046hn.f13456hn) && this.f13046hn.nyv.aq().getVisibility() == 0) {
            this.f13046hn.as.ojm();
            return;
        }
        this.f13046hn.uua.set(true);
        this.f13046hn.eum.wu();
        if (z10) {
            this.f13046hn.as.dkl();
        }
        final com.bytedance.sdk.openadsdk.core.widget.hn hnVar = new com.bytedance.sdk.openadsdk.core.widget.hn(this);
        this.qor.bug = hnVar;
        if (z10) {
            hnVar.hnj(apu).hn(as).qor(eum);
        } else {
            hnVar.hnj(f13088xn).hn(wu).qor(eum);
        }
        this.qor.bug.hnj(new com.bytedance.sdk.openadsdk.core.widget.hn.InterfaceC0238hn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.hn.InterfaceC0238hn
            public void hn() {
                hnVar.dismiss();
                TTRewardVideoActivity.this.sk(true);
                TTRewardVideoActivity.this.f13046hn.uua.set(false);
                TTRewardVideoActivity.this.f13046hn.as.hn(Integer.MAX_VALUE);
                if (!z10 || !hqh.dkl(TTRewardVideoActivity.this.f13046hn.f13456hn)) {
                    TTRewardVideoActivity.this.jbd();
                } else if (hqh.aq(TTRewardVideoActivity.this.f13046hn.f13456hn)) {
                    TTRewardVideoActivity.this.f13046hn.as.ojm();
                } else {
                    TTRewardVideoActivity.this.f13046hn.tgn.dkl();
                    TTRewardVideoActivity.this.finish();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.hn.InterfaceC0238hn
            public void hnj() {
                TTRewardVideoActivity.this.f13046hn.eum.eum();
                if (z10) {
                    TTRewardVideoActivity.this.f13046hn.as.hnj(1000);
                }
                hnVar.dismiss();
                TTRewardVideoActivity.this.f13046hn.uua.set(false);
            }
        }).show();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hnj(Bundle bundle) {
        if (this.bug) {
            super.hnj(bundle);
            this.f13089oj = (com.bytedance.sdk.openadsdk.hnj.sk.hnj) com.bytedance.sdk.openadsdk.core.hqh.hnj().hnj(this.f13043ta, com.bytedance.sdk.openadsdk.hnj.sk.hnj.class);
        } else {
            com.bytedance.sdk.openadsdk.hnj.sk.hnj hnjVarHn = com.bytedance.sdk.openadsdk.core.hqh.hnj().hn();
            this.f13089oj = hnjVarHn;
            if (hnjVarHn == null && bundle != null) {
                this.f13089oj = tgn;
                tgn = null;
            }
        }
        Log.e("TTAD.RVA", "initListener: listenerKey = " + this.f13043ta + ",mRewardAdInteractionListener = " + this.f13089oj + ",savedInstanceState = " + bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hn(boolean z10) {
        if (z10) {
            sq();
            return;
        }
        if ((1.0d - (((double) this.f13048sk) / this.f13046hn.eum.sq())) * 100.0d >= com.bytedance.sdk.openadsdk.core.oj.gjv().tgn(String.valueOf(this.f13046hn.dkl)).dkl) {
            sq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void hnj(Intent intent) {
        super.hnj(intent);
        this.f21do = intent.getStringExtra("media_extra");
        this.tu = intent.getStringExtra("user_id");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void hnj(long j10, long j11) {
        int i10 = (int) (j10 / 1000);
        int iQlh = this.f13046hn.f13456hn.qlh();
        boolean z10 = iQlh >= 0;
        qor(j10, j11);
        if (this.f13048sk > 0) {
            this.f13046hn.f13454gm.gjv(true);
            if (z10 && i10 >= iQlh) {
                this.f13046hn.hnj(true);
                this.f13046hn.f13454gm.hnj(String.valueOf(this.f13048sk), TTAdDislikeToast.getSkipText());
                this.f13046hn.f13454gm.sk(true);
                return;
            }
            this.f13046hn.f13454gm.hnj(String.valueOf(this.f13048sk), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(final boolean z10, final int i10, final String str, final int i11, final String str2, final int i12) {
        toString();
        ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.7
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.hnj.sk.hnj hnjVar = TTRewardVideoActivity.this.f13089oj;
                if (hnjVar != null) {
                    hnjVar.hnj(z10, i10, str, i11, str2);
                    bug.hnj(TTRewardVideoActivity.this.f13046hn.f13456hn, z10, i12);
                }
            }
        });
    }

    protected void hnj(final int i10) {
        as asVar;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        if (hnjVar == null || (asVar = hnjVar.f13456hn) == null || asVar.ff() || this.f13046hn.f13456hn.jip()) {
            return;
        }
        this.f13046hn.f13456hn.ojm(true);
        bug bugVar = this.f13046hn.f13457jo;
        if (bugVar != null) {
            bugVar.qor();
        }
        if (com.bytedance.sdk.openadsdk.core.oj.gjv().jip(String.valueOf(this.f13046hn.dkl))) {
            hnj(true, this.f13046hn.f13456hn.tll(), this.f13046hn.f13456hn.hkr(), 0, "", i10);
        } else {
            com.bytedance.sdk.openadsdk.core.oj.qor().hnj(xad(), new com.bytedance.sdk.openadsdk.core.as.hn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.8
                @Override // com.bytedance.sdk.openadsdk.core.as.hn
                public void hnj(int i11, String str) {
                    TTRewardVideoActivity.this.hnj(false, 0, "", i11, str, i10);
                }

                @Override // com.bytedance.sdk.openadsdk.core.as.hn
                public void hnj(Cdo.hn hnVar) {
                    boolean z10 = hnVar.f13719hn;
                    TTRewardVideoActivity.this.hnj(hnVar.f13719hn, hnVar.qor.hnj(), hnVar.qor.hn(), 0, "", i10);
                }
            });
        }
    }

    public void qor(long j10, long j11) {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        boolean z10 = false;
        if (hnjVar != null) {
            if (hnjVar.f13456hn.jo() >= 0 && this.f13046hn.f13456hn.afv() >= 0) {
                z10 = true;
            }
            if (z10) {
                j11 = this.f13046hn.f13456hn.afv();
            }
        }
        long j12 = j10 + (((long) this.f13046hn.pv) * 1000);
        if (z10) {
            hn(j12, j11);
            return;
        }
        if (this.f13090vf == -1) {
            this.f13090vf = com.bytedance.sdk.openadsdk.core.oj.gjv().tgn(String.valueOf(this.f13046hn.dkl)).dkl;
        }
        if (j11 <= 0) {
            return;
        }
        if (j11 >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL && j12 >= 27000) {
            sq();
        } else if ((j12 * 100) / j11 >= this.f13090vf) {
            sq();
        }
    }
}
