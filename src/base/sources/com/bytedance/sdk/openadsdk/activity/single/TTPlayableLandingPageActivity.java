package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.jbd;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.nyv;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ua;
import com.bytedance.sdk.openadsdk.core.widget.ta;
import com.bytedance.sdk.openadsdk.gjv.orl;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.dnm;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class TTPlayableLandingPageActivity extends TTBaseLandingPageActivity implements xyo.hnj, com.bytedance.sdk.openadsdk.core.mjg.gjv.hn, com.bytedance.sdk.openadsdk.core.qor.gjv {
    private static final com.bytedance.sdk.openadsdk.wu.dse.hnj xad = new com.bytedance.sdk.openadsdk.wu.dse.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.1
    };
    private ua apu;
    private String as;
    private com.bytedance.sdk.openadsdk.core.dkl.gjv bug;
    private com.bytedance.sdk.component.ojm.dkl dkl;
    private boolean dzo;
    private int eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private Context f13078fc;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private orl f13079ff;
    private com.bytedance.sdk.openadsdk.wu.aq fvt;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    TTAdDislikeToast f13081hn;
    nyv hnj;
    private com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor hqh;
    private com.bytedance.sdk.openadsdk.gjv.gjv.sk jbd;
    private ta jip;
    private com.bytedance.sdk.openadsdk.core.dkl.gjv mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private String f13082oj;
    private com.bytedance.sdk.openadsdk.core.dkl.gjv orl;
    private ILoader orp;
    private com.bytedance.sdk.openadsdk.wu.hnj.hnj pnz;
    private String pty;
    private as tu;
    private String uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private boolean f13086vf;
    private String wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private ua f13087xn;
    private boolean xyo;
    private boolean dse = true;
    private boolean aq = false;
    private boolean dnm = true;
    final AtomicBoolean qor = new AtomicBoolean(false);

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private final String f20do = "embeded_ad";
    private final xyo tgn = new xyo(Looper.getMainLooper(), this);
    private final AtomicBoolean nyv = new AtomicBoolean(false);

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private final AtomicInteger f13080gm = new AtomicInteger(0);

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private final AtomicInteger f13085ul = new AtomicInteger(0);

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private final AtomicInteger f13084ua = new AtomicInteger(0);
    private boolean sq = false;
    int gjv = -1;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.orl.sk f13083sk = new com.bytedance.sdk.openadsdk.orl.sk() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.8
        @Override // com.bytedance.sdk.openadsdk.orl.sk
        public void hnj() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && hqh.orl(TTPlayableLandingPageActivity.this.tu) && hqh.mjg(TTPlayableLandingPageActivity.this.tu)) {
                TTPlayableLandingPageActivity.this.tgn.removeMessages(2);
                TTPlayableLandingPageActivity.this.tgn.sendMessage(TTPlayableLandingPageActivity.this.hnj(1, 0));
            }
        }
    };

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private int f13077cm = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public void apu() {
        TTAdDislikeToast tTAdDislikeToast = this.f13081hn;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    private void eum() {
        com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar = new com.bytedance.sdk.openadsdk.core.qor.hnj(this, this.tu, "embeded_ad", this.eum) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.qor.hnj, com.bytedance.sdk.openadsdk.core.qor.hn, com.bytedance.sdk.openadsdk.core.qor.qor
            public void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray, boolean z10) {
                as asVar = ((com.bytedance.sdk.openadsdk.core.qor.hn) this).dkl;
                if (asVar == null || asVar.idl() != 1 || z10) {
                    super.hnj(view, f10, f11, f12, f13, sparseArray, z10);
                    TTPlayableLandingPageActivity.this.wu();
                    TTPlayableLandingPageActivity.this.xyo = true;
                    TTPlayableLandingPageActivity.this.f13086vf = true;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.wu);
                    } catch (JSONException e10) {
                        apu.hnj("TTPWPActivity", "onClick JSON ERROR", e10);
                    }
                    com.bytedance.sdk.openadsdk.gjv.qor.hn(TTPlayableLandingPageActivity.this.tu, ((com.bytedance.sdk.openadsdk.core.qor.hn) this).dse, "click_playable_download_button_loading", jSONObject);
                }
            }
        };
        hnjVar.hnj(this.hqh);
        com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar2 = this.pnz;
        if (hnjVar2 != null) {
            hnjVar2.hnj(hnjVar);
        }
    }

    private void mjg() {
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = this.bug;
        if (gjvVar != null) {
            gjvVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.jbd != null) {
                        TTPlayableLandingPageActivity.this.jbd.dse();
                    }
                    TTPlayableLandingPageActivity.this.tgn.sendMessage(TTPlayableLandingPageActivity.this.hnj(4, 0));
                    TTPlayableLandingPageActivity.this.hnj("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar2 = this.orl;
        if (gjvVar2 != null) {
            gjvVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.qor();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar3 = this.mjg;
        if (gjvVar3 != null) {
            gjvVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity.sq = !tTPlayableLandingPageActivity.sq;
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity2 = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity2.dkl(tTPlayableLandingPageActivity2.sq);
                    if (TTPlayableLandingPageActivity.this.fvt != null) {
                        TTPlayableLandingPageActivity.this.fvt.hnj(TTPlayableLandingPageActivity.this.sq);
                    }
                }
            });
        }
    }

    private void oj() {
        super.onBackPressed();
        com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar = this.jbd;
        if (skVar != null) {
            skVar.dse();
        }
    }

    private void ojm() {
        if (this.tu.rg() == 4) {
            this.hqh = com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv.hnj(this.f13078fc, "interaction");
        }
    }

    private void orl() {
        int i10 = oj.gjv().tgn(String.valueOf(this.tu.atw())).uua;
        if (i10 >= 0) {
            this.tgn.sendEmptyMessageDelayed(1, ((long) i10) * 1000);
        } else {
            sq.hnj((View) this.bug, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wu() {
        com.bytedance.sdk.openadsdk.core.hqh.hnj().hn(this.tu);
    }

    private void xn() {
        TTAdDislikeToast tTAdDislikeToast = this.f13081hn;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void bug() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void dnm() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void fc() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void fr() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void gjv(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hn(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hnj(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void izk() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public View jip() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public List<as> ka() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void mkl() {
        wu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void nyv() {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        oj();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fc.sk()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(UserVerificationMethods.USER_VERIFY_ALL);
            getWindow().addFlags(C.DEFAULT_MUXED_BUFFER_SIZE);
            oj.hn(this);
            dkl();
        } catch (Throwable unused) {
        }
        hn(bundle);
        as asVar = this.tu;
        if (asVar == null) {
            return;
        }
        this.dzo = asVar.za();
        int iFc = hqh.fc(this.tu);
        if (iFc == 0) {
            setRequestedOrientation(14);
        } else if (iFc == 1) {
            setRequestedOrientation(1);
        } else if (iFc == 2) {
            setRequestedOrientation(0);
            this.f13077cm = 2;
        }
        this.f13078fc = this;
        try {
            setContentView(aq());
            mjg();
            ojm();
            eum();
            this.pnz.hnj(this);
            this.pnz.hnj(false, (com.bytedance.sdk.openadsdk.orl.dkl) null);
            orl();
            com.bytedance.sdk.openadsdk.gjv.qor.hnj.hnj(SystemClock.elapsedRealtime() - jElapsedRealtime, this.tu, "embeded_ad", this.orp, this.pty);
            com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar = this.pnz;
            if (hnjVar != null) {
                hnjVar.hnj();
            }
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.openadsdk.core.hqh.hnj().qor(this.tu);
        com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar = this.pnz;
        if (hnjVar != null) {
            hnjVar.gjv();
        }
        com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar = this.jbd;
        if (skVar != null) {
            skVar.hnj(true);
            this.jbd.dnm();
        }
        this.tgn.removeCallbacksAndMessages(null);
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(this.pty)) {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj.hnj(this.f13085ul.get(), this.f13080gm.get(), this.tu);
        }
        com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(this.orp);
        com.bytedance.sdk.component.ojm.dkl dklVar = this.dkl;
        if (dklVar != null) {
            jbd.hnj(dklVar.getWebView());
            this.dkl.jip();
        }
        this.dkl = null;
        ua uaVar = this.f13087xn;
        if (uaVar != null) {
            uaVar.bug();
        }
        ua uaVar2 = this.apu;
        if (uaVar2 != null) {
            uaVar2.bug();
        }
        com.bytedance.sdk.openadsdk.wu.aq aqVar = this.fvt;
        if (aqVar != null) {
            aqVar.fvt();
        }
        orl orlVar = this.f13079ff;
        if (orlVar != null) {
            orlVar.gjv(true);
        }
        nyv nyvVar = this.hnj;
        if (nyvVar != null) {
            nyvVar.hn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        ua uaVar = this.f13087xn;
        if (uaVar != null) {
            uaVar.hnj(false);
        }
        com.bytedance.sdk.openadsdk.wu.aq aqVar = this.fvt;
        if (aqVar != null) {
            aqVar.hnj(true);
            this.fvt.qor(false);
        }
        com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar = this.pnz;
        if (hnjVar != null) {
            hnjVar.qor();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        ua uaVar = this.f13087xn;
        if (uaVar != null) {
            uaVar.dnm();
            com.bytedance.sdk.component.ojm.dkl dklVar = this.dkl;
            if (dklVar != null) {
                this.f13087xn.hnj(dklVar.getVisibility() == 0);
            }
        }
        ua uaVar2 = this.apu;
        if (uaVar2 != null) {
            uaVar2.dnm();
        }
        com.bytedance.sdk.openadsdk.wu.aq aqVar = this.fvt;
        if (aqVar != null) {
            aqVar.qor(true);
        }
        orl orlVar = this.f13079ff;
        if (orlVar != null) {
            orlVar.dse();
        }
        if (DeviceUtils.dse() == 0) {
            this.sq = true;
        }
        dkl(this.sq);
        com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar = this.pnz;
        if (hnjVar != null) {
            hnjVar.hn();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int iHnj = this.tu != null ? com.bytedance.sdk.openadsdk.core.hqh.hnj().hnj(this.tu) : -1;
            this.gjv = iHnj;
            bundle.putInt("meta_index", iHnj);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.gjv >= 0) {
            com.bytedance.sdk.openadsdk.core.hqh.hnj().qor(this.gjv);
            this.gjv = -1;
        }
        com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar = this.jbd;
        if (skVar != null) {
            skVar.ojm();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.gjv.gjv.sk skVar = this.jbd;
        if (skVar != null) {
            skVar.aq();
        }
        orl orlVar = this.f13079ff;
        if (orlVar != null) {
            orlVar.aq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void sk() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void ta() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void ua() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void ul() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void uua() {
    }

    private View aq() {
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(this);
        qorVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.pnz = new com.bytedance.sdk.openadsdk.wu.hnj.hnj(this.f13078fc, this.tu, this.f13077cm, this.sq, qorVar, true);
        int iHn = sq.hn(this, 5.0f);
        this.mjg = new com.bytedance.sdk.openadsdk.core.dkl.gjv(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sq.hn(this, 28.0f), sq.hn(this, 28.0f));
        layoutParams.rightMargin = sq.hn(this, 56.0f);
        layoutParams.topMargin = sq.hn(this, 20.0f);
        layoutParams.gravity = 8388661;
        this.mjg.setLayoutParams(layoutParams);
        this.mjg.setPadding(iHn, iHn, iHn, iHn);
        this.mjg.setBackground(com.bytedance.sdk.openadsdk.core.widget.gjv.hnj());
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = this.mjg;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        gjvVar.setScaleType(scaleType);
        this.mjg.setImageDrawable(dnm.hnj(this, "tt_unmute_wrapper"));
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar2 = new com.bytedance.sdk.openadsdk.core.dkl.gjv(this);
        this.orl = gjvVar2;
        gjvVar2.setPadding(iHn, iHn, iHn, iHn);
        this.orl.setScaleType(scaleType);
        this.orl.setBackground(com.bytedance.sdk.openadsdk.core.widget.gjv.hnj());
        this.orl.setImageResource(wu.gjv(oj.hnj(), "tt_reward_full_feedback"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(sq.hn(this, 28.0f), sq.hn(this, 28.0f));
        layoutParams2.gravity = 8388661;
        layoutParams2.rightMargin = sq.hn(this, 16.0f);
        layoutParams2.topMargin = sq.hn(this, 20.0f);
        this.orl.setLayoutParams(layoutParams2);
        this.bug = new com.bytedance.sdk.openadsdk.core.dkl.gjv(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(sq.hn(this, 28.0f), sq.hn(this, 28.0f));
        layoutParams3.gravity = 8388659;
        layoutParams3.topMargin = sq.hn(this, 20.0f);
        layoutParams3.leftMargin = sq.hn(this, 16.0f);
        this.bug.setLayoutParams(layoutParams3);
        this.bug.setPadding(iHn, iHn, iHn, iHn);
        this.bug.setScaleType(ImageView.ScaleType.FIT_XY);
        this.bug.setBackground(com.bytedance.sdk.openadsdk.core.widget.gjv.hnj());
        this.bug.setImageDrawable(wu.qor(this, "tt_white_lefterbackicon_titlebar"));
        this.bug.setVisibility(0);
        qorVar.addView(this.mjg);
        qorVar.addView(this.orl);
        qorVar.addView(this.bug);
        return qorVar;
    }

    protected void dkl(boolean z10) {
        try {
            this.sq = z10;
            this.mjg.setImageDrawable(z10 ? dnm.hnj(this.f13078fc, "tt_mute_wrapper") : dnm.hnj(this.f13078fc, "tt_unmute_wrapper"));
            com.bytedance.sdk.openadsdk.wu.aq aqVar = this.fvt;
            if (aqVar != null) {
                aqVar.hnj(z10);
            }
            com.bytedance.sdk.openadsdk.wu.hnj.hnj hnjVar = this.pnz;
            if (hnjVar != null) {
                hnjVar.hnj(z10);
            }
        } catch (Exception e10) {
            apu.qor("TTPWPActivity", e10.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hn(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hnj(String str, JSONObject jSONObject) {
    }

    void gjv() {
        as asVar = this.tu;
        if (asVar != null) {
            this.hnj = new com.bytedance.sdk.openadsdk.qor.qor(this, asVar.ldn(), this.tu.yl(), this.tu);
        }
        if (this.f13081hn == null) {
            this.f13081hn = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(R.id.content)).addView(this.f13081hn);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public void hnj(boolean z10) {
    }

    protected void qor() {
        if (this.tu == null || isFinishing()) {
            return;
        }
        if (this.qor.get()) {
            xn();
            return;
        }
        if (this.hnj == null) {
            gjv();
        }
        this.hnj.hnj(new nyv.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.nyv.hnj
            public void hnj() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.nyv.hnj
            public void hnj(int i10, String str) {
                if (TTPlayableLandingPageActivity.this.qor.get() || TextUtils.isEmpty(str)) {
                    return;
                }
                TTPlayableLandingPageActivity.this.qor.set(true);
                TTPlayableLandingPageActivity.this.apu();
            }
        });
        nyv nyvVar = this.hnj;
        if (nyvVar != null) {
            nyvVar.hnj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qor.gjv
    public void sk(boolean z10) {
        com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor qorVar;
        this.xyo = true;
        this.f13086vf = z10;
        if (!z10) {
            try {
                Toast.makeText(this.f13078fc, "Download later", 0).show();
            } catch (Throwable unused) {
            }
        }
        if (!this.f13086vf || (qorVar = this.hqh) == null) {
            return;
        }
        qorVar.hnj(this.tu);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean hnj() {
        return true;
    }

    private void hn(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            as asVarHnj = com.bytedance.sdk.openadsdk.core.hqh.hnj().hnj(com.bytedance.sdk.openadsdk.core.hqh.hnj(intent));
            this.tu = asVarHnj;
            if (asVarHnj != null) {
                this.wu = asVarHnj.dnm();
                this.eum = this.tu.orl();
                this.xyo = this.tu.fc();
                this.uua = this.tu.sp();
                this.f13082oj = this.tu.ldn();
                this.pty = this.tu.rx();
                this.as = this.tu.kby();
            }
        }
        if (bundle != null) {
            try {
                as asVarHnj2 = com.bytedance.sdk.openadsdk.core.hqh.hnj().hnj(bundle.getInt("meta_index", -1));
                this.tu = asVarHnj2;
                if (asVarHnj2 != null) {
                    this.uua = asVarHnj2.sp();
                    this.f13082oj = this.tu.ldn();
                    this.pty = this.tu.rx();
                    this.as = this.tu.kby();
                    this.wu = this.tu.dnm();
                    this.eum = this.tu.orl();
                    this.xyo = this.tu.fc();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.tu == null) {
            finish();
            return;
        }
        try {
            this.sq = oj.gjv().uua(this.tu.aip().getCodeId());
        } catch (Throwable th2) {
            apu.qor("TTPWPActivity", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hn
    public boolean hnj(long j10, boolean z10) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message hnj(int i10, int i11) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = i10;
        if (i10 == 3) {
            messageObtain.arg2 = i11;
        }
        return messageObtain;
    }

    public void dkl() {
        sq.hnj((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (TTPlayableLandingPageActivity.this.isFinishing()) {
                            return;
                        }
                        TTPlayableLandingPageActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                sq.hnj((Activity) TTPlayableLandingPageActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e10) {
                        apu.qor("TTPWPActivity", e10.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(String str) {
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), this.tu, SVWsZyNSAChGIA.eUgsU, str);
    }

    @Override // com.bytedance.sdk.component.utils.xyo.hnj
    public void hnj(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            sq.hnj((View) this.bug, 0);
            return;
        }
        if (i10 != 2) {
            return;
        }
        ta taVar = this.jip;
        if (taVar == null || !taVar.gjv()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                int i11 = message.arg2;
                if (i11 != 0) {
                    jSONObject.put("remove_loading_page_reason", i11);
                }
                jSONObject.put("playable_url", this.wu);
                ta taVar2 = this.jip;
                jSONObject.put("duration", taVar2 != null ? taVar2.getDisplayDuration() : 0L);
            } catch (JSONException e10) {
                apu.hnj("TTPWPActivity", "handleMsg json error", e10);
            }
            com.bytedance.sdk.openadsdk.gjv.qor.hn(this.tu, "embeded_ad", "remove_loading_page", jSONObject);
            this.tgn.removeMessages(2);
            ta taVar3 = this.jip;
            if (taVar3 != null) {
                taVar3.qor();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected void hn() {
        oj();
    }
}
