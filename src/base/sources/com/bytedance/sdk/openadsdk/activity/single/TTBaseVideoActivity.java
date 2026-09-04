package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.common.mjg;
import com.bytedance.sdk.openadsdk.component.reward.hnj.dnm;
import com.bytedance.sdk.openadsdk.component.reward.jip;
import com.bytedance.sdk.openadsdk.component.reward.uua;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.model.nyv;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.gjv.ta;
import com.bytedance.sdk.openadsdk.utils.pty;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.google.api.client.http.HttpStatusCodes;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements xyo.hnj, com.bytedance.sdk.openadsdk.core.mjg.gjv.hn {
    private int apu;
    int aq;
    protected boolean bug;
    boolean dkl;
    protected boolean dnm;
    protected pty dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    protected boolean f13045fc;
    final xyo gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.component.reward.hnj.hnj f13046hn;
    public final String hnj;
    private final AtomicBoolean jip;
    protected long mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private int f13047oj;
    protected boolean orl;
    protected com.bytedance.sdk.openadsdk.component.reward.hn.hn qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    int f13048sk;
    private boolean uua;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private final dnm.hn f13049xn;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj implements Runnable {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        AdSlot f13050hn;
        boolean hnj;

        hnj(boolean z10, AdSlot adSlot) {
            this.hnj = z10;
            this.f13050hn = adSlot;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.hnj) {
                if (com.bytedance.sdk.openadsdk.utils.hn.hn()) {
                    uua.hnj(oj.hnj()).hnj(this.f13050hn);
                    return;
                } else {
                    jip.hnj(oj.hnj()).hnj(this.f13050hn);
                    return;
                }
            }
            if (com.bytedance.sdk.openadsdk.utils.hn.hn()) {
                com.bytedance.sdk.openadsdk.component.reward.dse.hnj(oj.hnj()).hnj(this.f13050hn);
            } else {
                com.bytedance.sdk.openadsdk.component.reward.dkl.hnj(oj.hnj()).hnj(this.f13050hn);
            }
        }
    }

    public TTBaseVideoActivity() {
        this.hnj = tu() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.jip = new AtomicBoolean(false);
        this.gjv = new xyo(Looper.getMainLooper(), this);
        this.uua = false;
        this.f13047oj = 0;
        this.aq = 1;
        this.f13049xn = new dnm.hn();
        this.dnm = false;
        this.apu = -1;
    }

    private boolean ff() {
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.f13046hn.ojm.get();
        }
        return true;
    }

    private void jbd() {
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar;
        if (this.f13046hn == null || (hnVar = this.qor) == null) {
            super.onBackPressed();
        } else {
            hnVar.apu();
        }
    }

    private void sq() {
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
        this.qor.m20do();
        this.f13048sk = (int) this.f13046hn.eum.sq();
        if (this.f13045fc) {
            com.bytedance.sdk.openadsdk.common.hnj.hn(new mjg.hnj(this.f13046hn, "TTAD.BVA", new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity.this.finish();
                }
            }, new com.bytedance.sdk.openadsdk.common.hnj.hn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.2
                @Override // com.bytedance.sdk.openadsdk.common.hnj.hn
                public void hnj(boolean z10, int i10) {
                    TTBaseVideoActivity.this.hnj(z10, i10);
                }

                @Override // com.bytedance.sdk.openadsdk.common.hnj.hn
                public void hnj() {
                    TTBaseVideoActivity.this.finish();
                }
            }).hnj(ojm()).hnj(orl()).hnj());
        } else {
            mo15do();
        }
        oj();
        com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx = this.f13046hn.f13456hn.fvx();
        if (gjvVarFvx == null || (gjvVarHnj = gjvVarFvx.hnj()) == null) {
            return;
        }
        gjvVarHnj.hnj(0L);
    }

    protected void apu() {
        if (xyo() && !this.uua) {
            this.uua = true;
            getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = tTBaseVideoActivity.f13046hn;
                    hnjVar.xyo.hnj(hnjVar.tu.hnj(tTBaseVideoActivity.aq));
                    TTBaseVideoActivity.this.eum();
                }
            });
        }
    }

    protected void aq() {
        if (com.bytedance.sdk.openadsdk.as.sk.aq() && isChangingConfigurations()) {
            apu.hnj("BVA", "callback close is invoke by config change.");
            return;
        }
        if (this.dkl) {
            apu.hnj("BVA", "invoke callback onAdClose has already been called ");
            return;
        }
        this.dkl = true;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        as asVar = hnjVar != null ? hnjVar.f13456hn : null;
        if (asVar != null && !asVar.cm()) {
            long jOjm = asVar.ojm();
            if (jOjm > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - jOjm;
                if (jElapsedRealtime > 0) {
                    asVar.hn(jElapsedRealtime);
                }
            }
            this.f13046hn.hnj(BackupConstant.CLOSE_NOT_SHOW_CODE, BackupConstant.CLOSE_NOT_SHOW_CODE_MSG, BackupConstant.SCENE_CLOSED_WITHOUT_SHOW);
            this.f13046hn.tgn.hnj();
        }
        dkl();
        gjv();
    }

    protected void as() {
        this.gjv.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void bug() {
        dnm();
    }

    protected abstract void dkl();

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void dnm() {
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.qor;
        if (hnVar == null) {
            return;
        }
        hnVar.dnm();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    protected abstract void mo15do();

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void fc() {
        this.f13046hn.eum.jbd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.f13046hn == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.xyo.dkl()) {
            sq.hn((Activity) this);
        }
        if (!hqh.sk(this.f13046hn.f13456hn) || this.f13046hn.as.gjv(com.bytedance.sdk.openadsdk.component.reward.hnj.aq.f13430hn)) {
            return;
        }
        ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void fr() {
        this.f13046hn.tgn.hnj();
    }

    public void fvt() {
        if (!this.f13046hn.f13456hn.rmr()) {
            if (!as.sk(this.f13046hn.f13456hn)) {
                this.f13046hn.eum.hnj(FreeSpaceBox.TYPE, true);
            }
            finish();
        } else if (!this.f13046hn.f13456hn.dkl()) {
            this.f13046hn.f13454gm.qor();
        } else if (this.f13046hn.f33do.dnm() == 1) {
            this.f13046hn.f13454gm.qor();
        }
    }

    protected abstract void gjv();

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void gjv(boolean z10) {
    }

    public abstract FrameLayout gm();

    protected void hn(boolean z10, boolean z11) {
    }

    protected abstract void hnj(long j10, long j11);

    protected void hnj(Intent intent) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public View jip() {
        return this.f13046hn.eum.ff();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public List<as> ka() {
        return this.f13046hn.f13456hn.mr();
    }

    protected abstract void mjg();

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void nyv() {
        this.dnm = true;
    }

    protected void oj() {
        if (hqh.qor(this.f13046hn.f13456hn)) {
            hnj(false, com.bytedance.sdk.openadsdk.gjv.hn.C0241hn.qor);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.qor;
        if (hnVar != null) {
            hnVar.hnj(this.f13046hn.f13464ua.dkl());
            this.qor.as();
        }
    }

    protected boolean ojm() {
        return !tu();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        if (hnjVar == null) {
            return;
        }
        hnjVar.tu.hnj();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        jbd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        boolean z10;
        super.onCreate(bundle);
        if (bundle != null) {
            z10 = bundle.getBoolean("enable_new_arch", false);
        } else {
            z10 = getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false);
        }
        this.bug = z10;
        this.mjg = SystemClock.elapsedRealtime();
        oj.hn(getApplicationContext());
        if (!fc.sk()) {
            finish();
            return;
        }
        as asVarHnj = com.bytedance.sdk.openadsdk.component.reward.hnj.hn.hnj(getIntent(), bundle, this);
        if (asVarHnj == null) {
            finish();
            return;
        }
        this.f13045fc = com.bytedance.sdk.openadsdk.as.sk.ta();
        com.bytedance.sdk.openadsdk.utils.hn.hnj(asVarHnj);
        this.orl = com.bytedance.sdk.openadsdk.as.sk.hnj("adapt_decor_size", 0) == 1;
        asVarHnj.orp(String.valueOf(hashCode()));
        this.aq = asVarHnj.zf();
        hnj(asVarHnj, bundle);
        if (bundle != null) {
            ta.hnj(asVarHnj, "activity_recreate", asVarHnj.sk(), "activity_recreate", null);
        }
        try {
            dse();
            qor();
            sq();
        } catch (Throwable th2) {
            apu.hnj("TTAD.BVA", "onCreate: ", th2);
            ta.hnj(asVarHnj, "show_ad_fail", this.hnj, "init_view_crash");
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        as asVar;
        super.onDestroy();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        if (hnjVar == null || this.qor == null) {
            return;
        }
        if (hnjVar.mkl > 0 && (asVar = hnjVar.f13456hn) != null && asVar.cm()) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.f13046hn.mkl);
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.f13046hn;
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(strValueOf, hnjVar2.f13456hn, this.hnj, hnjVar2.eum.sk());
            this.f13046hn.mkl = 0L;
        }
        this.f13046hn.f13466vf.hn();
        this.gjv.removeCallbacksAndMessages(null);
        this.qor.xn();
        com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(this.f13046hn.f13456hn);
        com.bytedance.sdk.openadsdk.p000do.hnj.qor.hn(this.f13046hn.f13456hn);
        AdSlot adSlotAip = this.f13046hn.f13456hn.aip();
        if (!this.f13046hn.eum.ul() && adSlotAip != null && TextUtils.isEmpty(adSlotAip.getBidAdm()) && !this.f13046hn.f13456hn.era()) {
            fc.hn().post(new hnj(tu(), adSlotAip));
        }
        com.bytedance.sdk.openadsdk.utils.fc.hnj();
        pty ptyVar = this.dse;
        if (ptyVar != null) {
            ptyVar.sk();
            this.dse = null;
        }
        this.f13049xn.hnj(this);
        com.bytedance.sdk.openadsdk.core.sq.hnj().hnj(String.valueOf(hashCode()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.qor;
        if (hnVar == null) {
            return;
        }
        hnVar.uua();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        as asVar;
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        if (hnjVar == null || (asVar = hnjVar.f13456hn) == null) {
            return;
        }
        if (this.ojm && !asVar.dne() && !TextUtils.isEmpty(as.hnj(this, asVar))) {
            finish();
        }
        if (asVar.dne()) {
            asVar.fc(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar;
        super.onResume();
        toString();
        if (this.f13046hn == null || (hnVar = this.qor) == null) {
            return;
        }
        hnVar.fc();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        hnjVar.pnz = true;
        this.f13049xn.hnj(this, hnjVar.lu, hnjVar.rmr, this.orl);
        if (ff()) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.f13046hn;
            hnjVar2.f13454gm.hnj(hnjVar2.f13456hn.ij());
        }
        this.f13046hn.f13464ua.fc();
        this.f13046hn.nyv.uua();
        this.f13046hn.as.sk();
        if (this.qor.hn()) {
            this.f13046hn.eum.hnj(this.qor);
            this.f13046hn.eum.hnj(false, this, this.f13047oj != 0);
        }
        this.f13047oj++;
        apu();
        com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar = this.f13046hn.f33do;
        if (ojmVar != null) {
            ojmVar.dse();
        }
        this.f13046hn.tu.hnj(this.gjv);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (this.f13046hn == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (!TextUtils.isEmpty(this.f13043ta)) {
            bundle.putString("single_process_listener_key", this.f13043ta);
        }
        bundle.putBoolean("enable_new_arch", this.bug);
        as asVar = this.f13046hn.f13456hn;
        int iHnj = asVar != null ? com.bytedance.sdk.openadsdk.core.hqh.hnj().hnj(asVar) : -1;
        this.apu = iHnj;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hn.hnj(this.f13046hn, bundle, iHnj);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        toString();
        if (this.apu >= 0) {
            com.bytedance.sdk.openadsdk.core.hqh.hnj().qor(this.apu);
            this.apu = -1;
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        if (hnjVar == null) {
            return;
        }
        hnjVar.nyv.tu();
        com.bytedance.sdk.openadsdk.utils.gjv.hnj(this, this.f13046hn.f13456hn);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.qor;
        if (hnVar == null) {
            return;
        }
        hnVar.oj();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.hnj.ta taVar;
        super.onWindowFocusChanged(z10);
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        if (hnjVar == null || (taVar = hnjVar.tgn) == null) {
            return;
        }
        taVar.hn(z10);
        this.f13046hn.tgn.qor(z10);
    }

    protected abstract com.bytedance.sdk.openadsdk.common.jip orl();

    public Map<String, Object> orp() {
        return null;
    }

    protected void qor() {
        setContentView(this.f13046hn.fvt);
        this.f13046hn.fvt.hnj(this.qor);
        this.qor.hnj(this, this.gjv);
        this.qor.ta();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public final void ta() {
        as asVar;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        if (hnjVar == null || (asVar = hnjVar.f13456hn) == null || asVar.jbd()) {
            return;
        }
        toString();
        this.f13046hn.f13456hn.aq(true);
        xn();
    }

    public abstract boolean tgn();

    public abstract boolean tu();

    protected void vf() {
        as asVar;
        nyv nyvVarLq;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13046hn;
        if (hnjVar == null || (asVar = hnjVar.f13456hn) == null || (nyvVarLq = asVar.lq()) == null) {
            return;
        }
        if (nyvVarLq.hn() == 1 || nyvVarLq.hn() == 2) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.f13046hn;
            pty ptyVar = new pty(hnjVar2, hnjVar2.f13456hn);
            this.dse = ptyVar;
            com.bytedance.sdk.openadsdk.component.reward.hnj.fc fcVar = this.f13046hn.eum;
            if (fcVar != null) {
                fcVar.hnj(ptyVar);
            }
        }
    }

    protected void wu() {
        Message message = new Message();
        message.what = 400;
        if (tu()) {
            hn(10000);
        }
        this.gjv.sendMessageDelayed(message, 2000L);
    }

    protected abstract void xn();

    public boolean xyo() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected void hn() {
        jbd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hnj(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean hnj() {
        return true;
    }

    private void hnj(as asVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = new com.bytedance.sdk.openadsdk.component.reward.hnj.hnj(this, this.gjv, asVar, this, 0, this.orl);
        this.f13046hn = hnjVar;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hn.hnj(hnjVar, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            hnj(intent);
            asVar.hnj(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.f13046hn.izk) {
            mjg();
        }
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVarHnj = com.bytedance.sdk.openadsdk.component.reward.hn.dkl.hnj(this.f13046hn);
        this.qor = hnVarHnj;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.f13046hn;
        hnjVar2.f13460qb = hnVarHnj;
        com.bytedance.sdk.openadsdk.utils.fc.hnj(hnjVar2);
        Objects.toString(this.qor);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hnj(Bundle bundle) {
        if (this.bug) {
            if (bundle != null) {
                this.f13043ta = bundle.getString("single_process_listener_key");
            } else if (getIntent() != null) {
                this.f13043ta = getIntent().getStringExtra("single_process_listener_key");
            } else {
                this.f13043ta = "";
            }
        }
    }

    protected void eum() {
    }

    protected void hqh() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void izk() {
    }

    protected void pty() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void sk() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void uua() {
    }

    public void hnj(boolean z10, int i10) {
        hnj(z10, false, i10);
    }

    public void hnj(boolean z10, boolean z11, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.qor;
        if (hnVar == null) {
            return;
        }
        hnVar.hnj(z10, z11, false, i10);
    }

    public void hnj(boolean z10, boolean z11) {
        if (!this.bug || TextUtils.isEmpty(this.f13043ta)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.hqh.hnj().hnj(this.f13043ta, z10, z11);
    }

    @Override // com.bytedance.sdk.component.utils.xyo.hnj
    public void hnj(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar = this.qor;
        if (hnVar == null) {
            return;
        }
        hnVar.hnj(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public boolean hnj(long j10, boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.view.dnm dnmVar;
        com.bytedance.sdk.openadsdk.core.model.apu apuVar;
        if (this.f13046hn == null) {
            return false;
        }
        this.jip.set(false);
        com.bytedance.sdk.openadsdk.gjv.dse dseVarAq = this.f13046hn.aq();
        FrameLayout frameLayoutGm = gm();
        if (frameLayoutGm == null) {
            return false;
        }
        this.f13046hn.eum.hnj(frameLayoutGm, dseVarAq);
        Map<String, Object> mapOrp = orp();
        c.InterfaceC0870c interfaceC0870c = new c.InterfaceC0870c() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.4
            @Override // x6.c.InterfaceC0870c
            public void hn(long j11, int i10) {
                com.bytedance.sdk.openadsdk.core.model.apu apuVar2;
                TTBaseVideoActivity.this.f13046hn.eum.dnm();
                com.bytedance.sdk.openadsdk.component.reward.view.dnm dnmVar2 = TTBaseVideoActivity.this.f13046hn.f13464ua;
                if (dnmVar2 != null && (apuVar2 = dnmVar2.f13541fc) != null) {
                    apuVar2.ta();
                }
                if (TTBaseVideoActivity.this.f13046hn.eum.dkl()) {
                    TTBaseVideoActivity.this.wu();
                    return;
                }
                TTBaseVideoActivity.this.f13046hn.eum.apu();
                TTBaseVideoActivity.this.hqh();
                if (TTBaseVideoActivity.this.f13046hn.f13456hn.dkl()) {
                    TTBaseVideoActivity.this.f13046hn.f33do.hnj(true);
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (!tTBaseVideoActivity.f13046hn.qor) {
                    tTBaseVideoActivity.finish();
                    return;
                }
                tTBaseVideoActivity.hnj(false, true, 3);
                com.bytedance.sdk.openadsdk.component.reward.hnj.fc fcVar = TTBaseVideoActivity.this.f13046hn.eum;
                fcVar.hnj(1 ^ (fcVar.orp() ? 1 : 0), 2);
            }

            @Override // x6.c.InterfaceC0870c
            public void hnj(long j11, int i10) {
                com.bytedance.sdk.openadsdk.utils.mjg mjgVar;
                com.bytedance.sdk.openadsdk.utils.mjg mjgVar2;
                TTBaseVideoActivity.this.jip.get();
                if (TTBaseVideoActivity.this.jip.getAndSet(true)) {
                    return;
                }
                TTBaseVideoActivity.this.jip.set(true);
                TTBaseVideoActivity.this.as();
                TTBaseVideoActivity.this.hqh();
                TTBaseVideoActivity.this.f13046hn.eum.hnj(j11, j11);
                if (TTBaseVideoActivity.this.xyo()) {
                    TTBaseVideoActivity.this.f13046hn.f33do.hn(true);
                } else {
                    TTBaseVideoActivity.this.f13046hn.jip.set(true);
                }
                TTBaseVideoActivity.this.pty();
                if (TTBaseVideoActivity.this.f13046hn.f13456hn.qb() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = TTBaseVideoActivity.this.f13046hn;
                    if (hnjVar.qor) {
                        hnjVar.wu.qor().hnj(TTBaseVideoActivity.this.f13046hn.f13456hn);
                        com.bytedance.sdk.openadsdk.utils.fc.hn();
                    }
                }
                if (!TTBaseVideoActivity.this.xyo() && TTBaseVideoActivity.this.f13046hn.f13456hn.ac()) {
                    TTBaseVideoActivity.this.f13046hn.f13456hn.xo(1);
                    TTBaseVideoActivity.this.f13046hn.f13464ua.uua();
                }
                if (TTBaseVideoActivity.this.f13046hn.f13456hn.qb() == 21 && !TTBaseVideoActivity.this.f13046hn.f13456hn.xn()) {
                    TTBaseVideoActivity.this.f13046hn.f13456hn.sk(true);
                    TTBaseVideoActivity.this.f13046hn.f13464ua.uua();
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.dnm && tTBaseVideoActivity.f13046hn.f33do.bug()) {
                    return;
                }
                if (!TTBaseVideoActivity.this.xyo()) {
                    if (com.bytedance.sdk.openadsdk.core.model.apu.gjv(TTBaseVideoActivity.this.f13046hn.f13456hn) || com.bytedance.sdk.openadsdk.core.model.apu.hn(TTBaseVideoActivity.this.f13046hn.f13456hn) || com.bytedance.sdk.openadsdk.core.model.apu.dse(TTBaseVideoActivity.this.f13046hn.f13456hn)) {
                        TTBaseVideoActivity.this.hnj(false, 5);
                        if (!com.bytedance.sdk.openadsdk.core.model.apu.hn(TTBaseVideoActivity.this.f13046hn.f13456hn) || (mjgVar2 = TTBaseVideoActivity.this.f13046hn.f13455gn) == null) {
                            return;
                        }
                        mjgVar2.hnj(0L);
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.apu.hnj(TTBaseVideoActivity.this.f13046hn.f13456hn) && !TTBaseVideoActivity.this.f13046hn.orl.get()) {
                        TTBaseVideoActivity.this.f13046hn.hnj(true);
                        TTBaseVideoActivity.this.f13046hn.f13454gm.sk(true);
                        return;
                    }
                }
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = tTBaseVideoActivity2.f13046hn;
                if (!hnjVar2.qor) {
                    tTBaseVideoActivity2.fvt();
                    return;
                }
                if (hnjVar2.f13456hn.rmr()) {
                    if (!TTBaseVideoActivity.this.xyo()) {
                        TTBaseVideoActivity.this.f13046hn.f13454gm.qor();
                        return;
                    } else {
                        if (TTBaseVideoActivity.this.f13046hn.f33do.dnm() == 1) {
                            TTBaseVideoActivity.this.f13046hn.f13454gm.qor();
                            return;
                        }
                        return;
                    }
                }
                TTBaseVideoActivity.this.hnj(false, 5);
                if (!TTBaseVideoActivity.this.xyo() && com.bytedance.sdk.openadsdk.core.model.apu.hn(TTBaseVideoActivity.this.f13046hn.f13456hn) && (mjgVar = TTBaseVideoActivity.this.f13046hn.f13455gn) != null) {
                    mjgVar.hnj(0L);
                }
                if (as.sk(TTBaseVideoActivity.this.f13046hn.f13456hn)) {
                    return;
                }
                TTBaseVideoActivity.this.f13046hn.eum.hnj(FreeSpaceBox.TYPE, true);
            }

            @Override // x6.c.InterfaceC0870c
            public void hnj() {
                TTBaseVideoActivity.this.f13046hn.eum.dnm();
                TTBaseVideoActivity.this.as();
                TTBaseVideoActivity.this.hqh();
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.f13046hn.qor) {
                    tTBaseVideoActivity.hnj(false, true, 6);
                } else {
                    tTBaseVideoActivity.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.hnj.fc fcVar = TTBaseVideoActivity.this.f13046hn.eum;
                fcVar.hnj(!fcVar.orp() ? 1 : 0, 1 ^ (TTBaseVideoActivity.this.f13046hn.eum.orp() ? 1 : 0));
                TTBaseVideoActivity.this.f13046hn.eum.apu();
            }

            @Override // x6.c.InterfaceC0870c
            public void hnj(long j11, long j12) {
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = TTBaseVideoActivity.this.f13046hn;
                if (!hnjVar.pnz && hnjVar.eum.dkl()) {
                    TTBaseVideoActivity.this.f13046hn.eum.wu();
                }
                if (TTBaseVideoActivity.this.f13046hn.ojm.get()) {
                    return;
                }
                if (j11 != TTBaseVideoActivity.this.f13046hn.eum.mjg()) {
                    TTBaseVideoActivity.this.as();
                }
                if (TTBaseVideoActivity.this.xyo() && !TTBaseVideoActivity.this.f13046hn.eum.dkl()) {
                    TTBaseVideoActivity.this.gjv.removeMessages(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES);
                    return;
                }
                TTBaseVideoActivity.this.f13046hn.eum.hnj(j11, j12);
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                long j13 = j11 / 1000;
                tTBaseVideoActivity.f13048sk = (int) (tTBaseVideoActivity.f13046hn.eum.sq() - j13);
                int i10 = (int) j13;
                if ((TTBaseVideoActivity.this.f13046hn.uua.get() || TTBaseVideoActivity.this.f13046hn.f13462ta.get()) && TTBaseVideoActivity.this.f13046hn.eum.dkl()) {
                    TTBaseVideoActivity.this.f13046hn.eum.wu();
                }
                if (TTBaseVideoActivity.this.tu()) {
                    TTBaseVideoActivity.this.f13046hn.f13464ua.sk(i10);
                }
                if (TTBaseVideoActivity.this.tgn()) {
                    if (TTBaseVideoActivity.this.f13046hn.eum.gjv()) {
                        pty ptyVar = TTBaseVideoActivity.this.dse;
                        if (ptyVar != null) {
                            ptyVar.hnj(j11);
                            return;
                        }
                        return;
                    }
                    pty ptyVar2 = TTBaseVideoActivity.this.dse;
                    if (ptyVar2 == null || !ptyVar2.hnj()) {
                        TTBaseVideoActivity.this.hnj(j11, j12);
                        return;
                    }
                    return;
                }
                TTBaseVideoActivity.this.hnj(j11, j12);
            }
        };
        this.f13046hn.eum.hnj(interfaceC0870c);
        if (!this.f13046hn.f13456hn.dkl() && (dnmVar = this.f13046hn.f13464ua) != null && (apuVar = dnmVar.f13541fc) != null) {
            apuVar.hnj(interfaceC0870c);
        }
        boolean zHnj = this.f13046hn.eum.hnj(j10, z10, mapOrp, this.qor);
        hn(zHnj, z10);
        return zHnj;
    }
}
