package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.uua;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.hqh;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ojm.bug;
import com.bytedance.sdk.openadsdk.core.settings.dnm;
import com.bytedance.sdk.openadsdk.core.vf;
import com.bytedance.sdk.openadsdk.utils.fvt;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class TTAppOpenAdActivity extends TTBaseActivity implements xyo.hnj, com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.InterfaceC0222hnj {
    private static com.bytedance.sdk.openadsdk.hnj.gjv.hn dnm;
    private float apu;
    protected boolean aq;
    private as as;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private com.bytedance.sdk.openadsdk.hnj.gjv.hn f18do;
    private boolean eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private TTAdDislikeToast f13033fc;
    private boolean hqh;
    private uua mjg;
    private com.bytedance.sdk.openadsdk.component.qor nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.gjv.dse f13036oj;
    private com.bytedance.sdk.openadsdk.component.dkl.hn orl;
    private AdSlot pty;
    private int tgn;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private boolean f13038ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private long f13039ul;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private FrameLayout f13040vf;
    private int wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private float f13041xn;
    private int xyo;
    protected final AtomicBoolean hnj = new AtomicBoolean(false);

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected final xyo f13035hn = new xyo(Looper.getMainLooper(), this);
    final AtomicBoolean qor = new AtomicBoolean(false);
    final AtomicBoolean gjv = new AtomicBoolean(false);
    private final com.bytedance.sdk.openadsdk.component.aq.hnj bug = new com.bytedance.sdk.openadsdk.component.aq.hnj();

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected boolean f13037sk = false;
    private final AtomicBoolean jip = new AtomicBoolean(false);
    private fvt uua = fvt.qor();
    private final AtomicBoolean tu = new AtomicBoolean(false);
    long dkl = 0;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private volatile boolean f13034gm = false;
    int dse = -1;
    private final com.bytedance.sdk.openadsdk.component.hnj fvt = new com.bytedance.sdk.openadsdk.component.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.hnj
        public void gjv() {
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.hnj, x6.c.InterfaceC0870c
        public void hn(long j10, int i10) {
            com.bytedance.sdk.openadsdk.component.aq.qor qorVarDse;
            StringBuilder sb2 = new StringBuilder("onError() called with: totalPlayTime = [");
            sb2.append(j10);
            sb2.append("], percent = [");
            sb2.append(i10);
            sb2.append("]");
            if (TTAppOpenAdActivity.this.nyv != null && (qorVarDse = TTAppOpenAdActivity.this.nyv.dse()) != null) {
                TTAppOpenAdActivity.this.tgn();
                qorVarDse.hnj(true);
            }
            TTAppOpenAdActivity.this.m14do();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.hnj, x6.c.InterfaceC0870c
        public void hnj() {
            TTAppOpenAdActivity.this.tgn();
            TTAppOpenAdActivity.this.m14do();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.hnj
        public void qor() {
            TTAppOpenAdActivity.this.aq();
            TTAppOpenAdActivity.this.uua.sk();
            TTAppOpenAdActivity.this.apu();
            if (TTAppOpenAdActivity.this.eum) {
                TTAppOpenAdActivity.this.mjg();
            }
            if (TTAppOpenAdActivity.this.nyv.dse() == null || TTAppOpenAdActivity.this.nyv.dse().hn() == null) {
                return;
            }
            TTAppOpenAdActivity.this.nyv.dse().hn().hnj(TTAppOpenAdActivity.this);
        }

        @Override // com.bytedance.sdk.openadsdk.component.hnj
        public void sk() {
            TTAppOpenAdActivity.this.as();
        }

        @Override // com.bytedance.sdk.openadsdk.component.hnj, x6.c.InterfaceC0870c
        public void hnj(long j10, long j11) {
            TTAppOpenAdActivity.this.bug.qor(j10);
            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
            if (!tTAppOpenAdActivity.f13037sk && tTAppOpenAdActivity.nyv != null && TTAppOpenAdActivity.this.nyv.dse() != null && TTAppOpenAdActivity.this.nyv.dse().sk()) {
                TTAppOpenAdActivity.this.nyv.dse().aq();
            }
            TTAppOpenAdActivity.this.fc();
            if (TTAppOpenAdActivity.this.nyv instanceof com.bytedance.sdk.openadsdk.component.hn) {
                ((com.bytedance.sdk.openadsdk.component.hn) TTAppOpenAdActivity.this.nyv).hnj(j10, j11);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.hnj, com.bytedance.sdk.openadsdk.component.dkl.hnj
        public void hn(View view) {
            TTAppOpenAdActivity.this.qor();
        }

        @Override // com.bytedance.sdk.openadsdk.component.hnj, com.bytedance.sdk.openadsdk.component.dkl.hnj
        public void hn() {
            TTAppOpenAdActivity.this.f13034gm = true;
            if (com.bytedance.sdk.openadsdk.as.sk.hnj("splash_auto_close_switch", 0) == 0) {
                TTAppOpenAdActivity.this.ojm();
                TTAppOpenAdActivity.this.finish();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.hnj, com.bytedance.sdk.openadsdk.component.dkl.hnj
        public void hnj(View view) {
            TTAppOpenAdActivity.this.tu();
        }

        @Override // com.bytedance.sdk.openadsdk.component.hnj, com.bytedance.sdk.openadsdk.component.dkl.hnj
        public void hnj(int i10, boolean z10) {
            if (TTAppOpenAdActivity.this.nyv != null) {
                TTAppOpenAdActivity.this.nyv.hnj(i10, z10);
            }
        }
    };
    private final Runnable orp = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.5
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx;
            com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
            if (TTAppOpenAdActivity.this.jip.get()) {
                return;
            }
            if (TTAppOpenAdActivity.this.as != null && (gjvVarFvx = TTAppOpenAdActivity.this.as.fvx()) != null && (gjvVarHnj = gjvVarFvx.hnj()) != null) {
                gjvVarHnj.hnj(0L);
            }
            TTAppOpenAdActivity.this.f13036oj = new com.bytedance.sdk.openadsdk.gjv.dse();
            TTAppOpenAdActivity.this.f13036oj.hnj(System.currentTimeMillis(), 1.0f);
            TTAppOpenAdActivity.this.uua.sk();
            if (TTAppOpenAdActivity.this.orl != null) {
                TTAppOpenAdActivity.this.orl.hn();
            }
            if (TTAppOpenAdActivity.this.nyv != null) {
                TTAppOpenAdActivity.this.nyv.sk();
            }
            TTAppOpenAdActivity.this.wu();
            View viewFindViewById = TTAppOpenAdActivity.this.findViewById(R.id.content);
            JSONObject jSONObject = new JSONObject();
            if (viewFindViewById != null) {
                try {
                    jSONObject.put("width", viewFindViewById.getWidth());
                    jSONObject.put("height", viewFindViewById.getHeight());
                    jSONObject.put(qnwOeeQSSWa.IAUnLov, viewFindViewById.getAlpha());
                } catch (JSONException e10) {
                    Log.e("TTAppOpenAdActivity", "run: ", e10);
                    TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", TTAppOpenAdActivity.this.tgn);
            jSONObject2.put("openad_creative_type", TTAppOpenAdActivity.this.eum ? "video_normal_ad" : "image_normal_ad");
            if (com.bytedance.sdk.openadsdk.component.ojm.aq.qor() == null) {
                jSONObject2.put("appicon_acquirefail", "1");
            }
            if (TTAppOpenAdActivity.this.hqh || TTAppOpenAdActivity.this.as.ux()) {
                if (TTAppOpenAdActivity.this.eum() || com.bytedance.sdk.openadsdk.component.dse.hnj.dnm()) {
                    jSONObject2.put("dynamic_show_type", TTAppOpenAdActivity.this.xn());
                } else {
                    jSONObject2.put("dynamic_show_type", 1);
                }
                TTAppOpenAdActivity.this.hnj(jSONObject2);
            }
            jSONObject2.put("is_icon_only", TTAppOpenAdActivity.this.as.nyv() ? 1 : 0);
            JSONObject jSONObject3 = new JSONObject();
            if (TTAppOpenAdActivity.this.tgn == 1) {
                jSONObject3.putOpt("cache_duration", Long.valueOf(System.currentTimeMillis() - TTAppOpenAdActivity.this.f13039ul));
            }
            if (TTAppOpenAdActivity.this.as != null) {
                int iTa = TTAppOpenAdActivity.this.as.ta();
                jSONObject3.putOpt("start_type", Integer.valueOf(iTa == 1 ? 1 : 2));
                jSONObject3.putOpt("load_index", Integer.valueOf(iTa));
            }
            jSONObject3.putOpt("start_type_backup", Integer.valueOf(com.bytedance.sdk.openadsdk.component.dse.hnj.gjv()));
            jSONObject3.putOpt("app_running_time", Long.valueOf(com.bytedance.sdk.openadsdk.component.dse.hnj.hn()));
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(TTAppOpenAdActivity.this.as, "open_ad", jSONObject2, jSONObject3);
            com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(TTAppOpenAdActivity.this.findViewById(R.id.content), TTAppOpenAdActivity.this.as, new com.bytedance.sdk.openadsdk.do.hn.sk.hnj(TTAppOpenAdActivity.this.xn()));
            com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(TTAppOpenAdActivity.this.as);
            TTAppOpenAdActivity.this.jip.set(true);
        }
    };

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean hnj() {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sq.hnj((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.6
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                sq.hnj((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e10) {
                        apu.qor("TTAppOpenAdActivity", e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        oj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        as asVar;
        super.onCreate(bundle);
        oj.hn(getApplicationContext());
        boolean z10 = false;
        if (bundle != null) {
            z10 = bundle.getBoolean("enable_new_arch", false);
        } else if (getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false)) {
            z10 = true;
        }
        this.f13038ua = z10;
        apu.hnj("BVA", "onCreate: isEnableNewArch = " + this.f13038ua);
        if (!hn(bundle)) {
            finish();
            return;
        }
        if (!fc.sk()) {
            finish();
            return;
        }
        if (bundle != null) {
            com.bytedance.sdk.openadsdk.gjv.qor.hn(this.as, "open_ad", (JSONObject) null, (JSONObject) null);
        }
        this.eum = as.sk(this.as);
        new StringBuilder("onCreate: isVideo is ").append(this.eum);
        if (!this.eum || (asVar = this.as) == null) {
            this.bug.hnj(oj.gjv().as(String.valueOf(this.wu)));
        } else {
            this.bug.hnj((float) asVar.pwt().e());
        }
        com.bytedance.sdk.openadsdk.component.dkl.hn hnVar = new com.bytedance.sdk.openadsdk.component.dkl.hn(this.bug);
        this.orl = hnVar;
        hnVar.hnj(this.fvt);
        ta();
        FrameLayout frameLayout = new FrameLayout(this);
        this.f13040vf = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        try {
            dse();
            setContentView(this.f13040vf);
            this.f13040vf.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (TTAppOpenAdActivity.this.as == null) {
                            TTAppOpenAdActivity.this.finish();
                            return;
                        }
                        int iRq = TTAppOpenAdActivity.this.as.rq();
                        boolean z11 = false;
                        if (com.bytedance.sdk.openadsdk.component.dse.hnj.dnm()) {
                            TTAppOpenAdActivity.this.hqh = iRq != 1;
                            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity.nyv = new com.bytedance.sdk.openadsdk.component.hn(tTAppOpenAdActivity, tTAppOpenAdActivity.as, TTAppOpenAdActivity.this.f13040vf, TTAppOpenAdActivity.this.fvt, TTAppOpenAdActivity.this.xyo, TTAppOpenAdActivity.this.eum, TTAppOpenAdActivity.this.bug, TTAppOpenAdActivity.this.orl);
                            if (!TTAppOpenAdActivity.this.hqh || !TTAppOpenAdActivity.this.eum()) {
                                TTAppOpenAdActivity.this.as.oj(1);
                                TTAppOpenAdActivity.this.as.xn(1);
                            }
                        } else {
                            TTAppOpenAdActivity tTAppOpenAdActivity2 = TTAppOpenAdActivity.this;
                            if (tTAppOpenAdActivity2.as.th() == 2 && iRq != 1) {
                                z11 = true;
                            }
                            tTAppOpenAdActivity2.hqh = z11;
                            if (TTAppOpenAdActivity.this.hqh && TTAppOpenAdActivity.this.eum()) {
                                TTAppOpenAdActivity tTAppOpenAdActivity3 = TTAppOpenAdActivity.this;
                                tTAppOpenAdActivity3.nyv = new com.bytedance.sdk.openadsdk.component.hn(tTAppOpenAdActivity3, tTAppOpenAdActivity3.as, TTAppOpenAdActivity.this.f13040vf, TTAppOpenAdActivity.this.fvt, TTAppOpenAdActivity.this.xyo, TTAppOpenAdActivity.this.eum, TTAppOpenAdActivity.this.bug, TTAppOpenAdActivity.this.orl);
                            } else {
                                TTAppOpenAdActivity tTAppOpenAdActivity4 = TTAppOpenAdActivity.this;
                                tTAppOpenAdActivity4.nyv = new com.bytedance.sdk.openadsdk.component.qor(tTAppOpenAdActivity4, tTAppOpenAdActivity4.as, TTAppOpenAdActivity.this.f13040vf, TTAppOpenAdActivity.this.fvt, TTAppOpenAdActivity.this.xyo, TTAppOpenAdActivity.this.eum, TTAppOpenAdActivity.this.bug);
                                TTAppOpenAdActivity.this.nyv.hnj(TTAppOpenAdActivity.this.apu, TTAppOpenAdActivity.this.f13041xn);
                            }
                        }
                        TTAppOpenAdActivity.this.nyv.hnj((ViewGroup) TTAppOpenAdActivity.this.f13040vf);
                        TTAppOpenAdActivity.this.nyv.hnj();
                        TTAppOpenAdActivity.this.nyv.hn();
                    } catch (Throwable th2) {
                        TTAppOpenAdActivity.this.finish();
                        apu.qor("TTAppOpenAdActivity", th2.getMessage());
                    }
                }
            });
            try {
                final View decorView = getWindow().getDecorView();
                if (Build.VERSION.SDK_INT >= 35) {
                    this.aq = true;
                    decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.3
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            List<Rect> boundingRects;
                            try {
                                DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                                if (displayCutout != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
                                    decorView.setPadding(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                                }
                            } catch (Throwable unused) {
                            }
                            return windowInsets;
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            com.bytedance.sdk.openadsdk.jip.gjv.hn();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        AdSlot adSlot;
        super.onDestroy();
        if (this.as != null) {
            com.bytedance.sdk.openadsdk.dkl.hn.hnj().hnj("videoForceBreak", this.as);
        }
        this.f13035hn.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.dkl.hn hnVar = this.orl;
        if (hnVar != null) {
            hnVar.sk();
        }
        com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(this.as);
        com.bytedance.sdk.openadsdk.p000do.hnj.qor.hn(this.as);
        if (this.eum) {
            com.bytedance.sdk.openadsdk.component.gjv.hnj.hnj(this.as, this.bug.gjv(), this.bug.hn(), true);
        } else {
            com.bytedance.sdk.openadsdk.component.gjv.hnj.hnj(this.as, -1L, this.bug.hn(), false);
        }
        if (this.uua.dkl() && this.jip.get()) {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(String.valueOf(this.uua.gjv()), this.as, "open_ad", this.f13036oj);
            this.uua = fvt.qor();
        }
        com.bytedance.sdk.openadsdk.component.qor qorVar = this.nyv;
        if (qorVar != null) {
            qorVar.qor();
        }
        ojm();
        dnm = null;
        if (this.f13038ua && !TextUtils.isEmpty(this.f13043ta)) {
            hqh.hnj().hnj(this.f13043ta, isFinishing(), isChangingConfigurations());
        }
        this.f18do = null;
        uua uuaVar = this.mjg;
        if (uuaVar != null) {
            uuaVar.setCallback(null);
        }
        as asVar = this.as;
        if (asVar == null || as.dkl(asVar) || this.as.era() || (adSlot = this.pty) == null) {
            return;
        }
        adSlot.setCacheScene(1);
        com.bytedance.sdk.openadsdk.component.dkl.hnj(oj.hnj()).hnj(this.pty);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f13037sk = false;
        sk();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        com.bytedance.sdk.openadsdk.component.qor qorVar;
        super.onResume();
        this.f13037sk = true;
        if (this.hnj.getAndSet(true)) {
            if (!this.tu.get()) {
                gjv();
                return;
            }
            m14do();
            if (this.eum && (qorVar = this.nyv) != null && qorVar.dse() != null) {
                tgn();
                this.nyv.dse().hnj(3);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            this.dse = this.as != null ? hqh.hnj().hnj(this.as) : -1;
            if (!TextUtils.isEmpty(this.f13043ta)) {
                bundle.putString("single_process_listener_key", this.f13043ta);
            }
            bundle.putBoolean("enable_new_arch", this.f13038ua);
            bundle.putInt("meta_index", this.dse);
            bundle.putInt("ad_source", this.tgn);
            bundle.putLong("start_show_time", this.dkl);
            bundle.putLong("cache_time", this.f13039ul);
        } catch (Throwable th2) {
            apu.qor("TTAppOpenAdActivity", th2.getMessage());
        }
        if (!this.f13038ua) {
            dnm = this.f18do;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.dse >= 0) {
            hqh.hnj().qor(this.dse);
            this.dse = -1;
        }
        com.bytedance.sdk.openadsdk.utils.gjv.hnj(this, this.as);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            if (!this.hqh) {
                this.uua.sk();
            }
            as asVar = this.as;
            if (asVar != null && asVar.tl() && !this.as.xyo()) {
                this.as.dse(true);
                as asVar2 = this.as;
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar2, "open_ad", asVar2.mpa());
            }
        } else if (this.jip.get()) {
            if (this.uua.dkl()) {
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(String.valueOf(this.uua.gjv()), this.as, "open_ad", this.f13036oj);
            }
            this.uua = fvt.qor();
        }
        com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(this.as, z10 ? 4 : 8);
        com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(this.as, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void apu() {
        if (this.jip.get()) {
            return;
        }
        try {
            getWindow().getDecorView().post(this.orp);
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aq() {
        Log.d("TTAppOpenAdActivity", "startCountDownTimer() called");
        as asVar = this.as;
        int iWu = (asVar == null || asVar.hn() < 0) ? oj.gjv().wu(String.valueOf(this.wu)) : this.as.hn();
        this.orl.hnj(this.bug.hn());
        this.orl.hn(iWu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void as() {
        com.bytedance.sdk.openadsdk.component.aq.qor qorVarDse;
        com.bytedance.sdk.openadsdk.hnj.gjv.hn hnVar = this.f18do;
        if (hnVar != null) {
            hnVar.onAdClicked();
        }
        if (dnm.hn().m38do(String.valueOf(this.wu))) {
            this.tu.set(true);
        }
        com.bytedance.sdk.openadsdk.component.qor qorVar = this.nyv;
        if (qorVar == null || (qorVarDse = qorVar.dse()) == null) {
            return;
        }
        qorVarDse.jip();
    }

    private void bug() {
        if (this.xyo != 2) {
            setRequestedOrientation(1);
        } else if (dkl()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
        if (this.xyo == 2 || !sq.qor((Activity) this)) {
            getWindow().addFlags(UserVerificationMethods.USER_VERIFY_ALL);
        }
    }

    private void dnm() {
        int iMin;
        int iMax;
        new StringBuilder("changeScreenOrientation: mOrientation=").append(this.xyo);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != 26) {
            if (i10 == 27) {
                try {
                    bug();
                } catch (Throwable th2) {
                    apu.qor("TTAppOpenAdActivity", th2.getMessage());
                    return;
                }
            } else {
                bug();
            }
        }
        Pair<Integer, Integer> pairDnm = sq.dnm(getApplicationContext());
        if (this.xyo == 2) {
            iMin = Math.max(((Integer) pairDnm.first).intValue(), ((Integer) pairDnm.second).intValue());
            iMax = Math.min(((Integer) pairDnm.first).intValue(), ((Integer) pairDnm.second).intValue());
        } else {
            iMin = Math.min(((Integer) pairDnm.first).intValue(), ((Integer) pairDnm.second).intValue());
            iMax = Math.max(((Integer) pairDnm.first).intValue(), ((Integer) pairDnm.second).intValue());
        }
        this.f13041xn = iMax;
        this.apu = iMin;
        float fHnj = sq.hnj();
        if (sq.qor((Activity) this)) {
            int i11 = this.xyo;
            if (i11 == 1) {
                this.f13041xn -= fHnj;
            } else if (i11 == 2) {
                this.apu -= fHnj;
            }
        }
        com.bytedance.sdk.openadsdk.component.qor qorVar = this.nyv;
        if (qorVar != null) {
            qorVar.hnj(this.apu, this.f13041xn);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m14do() {
        com.bytedance.sdk.openadsdk.hnj.gjv.hn hnVar = this.f18do;
        if (hnVar != null) {
            hnVar.hn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean eum() {
        if (!this.as.gm()) {
            return false;
        }
        int iRq = this.as.rq();
        return ((iRq == 0 || iRq == 9) && (com.bytedance.sdk.component.adexpress.hnj.hn.qor.hnj(bug.qor(), "3.1.78") || com.bytedance.sdk.component.adexpress.hnj.hn.qor.hnj(bug.gjv(), "3.1.78"))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fc() {
        if (!this.eum || this.as.nyv()) {
            return;
        }
        this.f13035hn.removeMessages(100);
    }

    private void jip() {
        this.f13033fc.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mjg() {
        if (!this.eum || this.as.nyv() || this.f13034gm) {
            return;
        }
        this.f13035hn.sendEmptyMessageDelayed(100, 5000L);
    }

    private void oj() {
        if (oj.gjv().eum(String.valueOf(this.wu)) == 1) {
            if (this.bug.qor() >= ((long) oj.gjv().wu(String.valueOf(this.wu))) * 1000) {
                tu();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ojm() {
        apu.hnj("TTAppOpenAdActivity", "invoke callback onAdDismiss, ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.hnj.gjv.hn hnVar = this.f18do;
        if (hnVar != null) {
            hnVar.qor();
        }
    }

    private void orl() {
        if (this.mjg == null) {
            uua uuaVar = new uua(this, this.as);
            this.mjg = uuaVar;
            uuaVar.setDislikeSource("video_player");
            this.mjg.setCallback(new uua.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.4
                @Override // com.bytedance.sdk.openadsdk.common.uua.hnj
                public void hn(View view) {
                    TTAppOpenAdActivity.this.qor.set(false);
                    TTAppOpenAdActivity.this.gjv();
                    com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(TTAppOpenAdActivity.this.as, 4);
                }

                @Override // com.bytedance.sdk.openadsdk.common.uua.hnj
                public void hnj(View view) {
                    TTAppOpenAdActivity.this.qor.set(true);
                    TTAppOpenAdActivity.this.sk();
                    com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj(TTAppOpenAdActivity.this.as, 8);
                }

                @Override // com.bytedance.sdk.openadsdk.common.uua.hnj
                public void hnj(FilterWord filterWord) {
                    if (TTAppOpenAdActivity.this.gjv.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    TTAppOpenAdActivity.this.gjv.set(true);
                    TTAppOpenAdActivity.this.uua();
                }
            });
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        frameLayout.addView(this.mjg);
        if (this.f13033fc == null) {
            TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this);
            this.f13033fc = tTAdDislikeToast;
            frameLayout.addView(tTAdDislikeToast);
        }
    }

    private void ta() {
        if (26 != Build.VERSION.SDK_INT) {
            this.xyo = this.as.zf();
        } else if (getResources().getConfiguration().orientation == 1) {
            this.xyo = 1;
        } else {
            this.xyo = 2;
        }
        dnm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tgn() {
        as asVar;
        try {
            if (this.orl == null || (asVar = this.as) == null || asVar.lq() == null) {
                return;
            }
            int iHn = this.as.lq().hn();
            if (iHn == 1 || iHn == 2) {
                this.orl.hnj(iHn, this.as.lq().hnj(), false);
                com.bytedance.sdk.openadsdk.component.qor qorVar = this.nyv;
                if (qorVar == null || qorVar.dse() == null) {
                    return;
                }
                this.nyv.dse().hn().hnj(this.bug.hnj());
                this.nyv.dse().hn().hnj(1.0f);
            }
        } catch (Throwable th2) {
            apu.qor("TTAppOpenAdActivity", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tu() {
        com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx;
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
        com.bytedance.sdk.openadsdk.component.qor qorVar;
        vf.qor(this.wu);
        m14do();
        if (this.eum && (qorVar = this.nyv) != null && qorVar.dse() != null) {
            tgn();
            this.nyv.dse().hnj(4);
        }
        com.bytedance.sdk.openadsdk.component.gjv.hnj.hnj(this.as, (int) this.bug.qor(), this.orl.hnj(), this.bug.hn());
        as asVar = this.as;
        if (asVar != null && (gjvVarFvx = asVar.fvx()) != null && (gjvVarHnj = gjvVarFvx.hnj()) != null) {
            com.bytedance.sdk.openadsdk.component.qor qorVar2 = this.nyv;
            long jOrl = (qorVar2 == null || qorVar2.dse() == null) ? 0L : this.nyv.dse().orl();
            gjvVarHnj.dkl(jOrl);
            gjvVarHnj.sk(jOrl);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uua() {
        this.f13033fc.show(TTAdDislikeToast.getDislikeSendTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wu() {
        com.bytedance.sdk.openadsdk.hnj.gjv.hn hnVar = this.f18do;
        if (hnVar != null) {
            hnVar.hnj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int xn() {
        if (this.as.ux()) {
            return 5;
        }
        if (this.hqh) {
            return this.nyv.gjv();
        }
        return -1;
    }

    protected boolean dkl() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception e10) {
            apu.qor("TTAppOpenAdActivity", e10.getMessage());
            return false;
        }
    }

    void gjv() {
        if (this.qor.get()) {
            return;
        }
        if (this.eum) {
            com.bytedance.sdk.openadsdk.component.qor qorVar = this.nyv;
            if (qorVar != null && qorVar.dse() != null && this.nyv.dse().dkl()) {
                this.nyv.dse().dnm();
            }
            mjg();
        }
        com.bytedance.sdk.openadsdk.component.dkl.hn hnVar = this.orl;
        if (hnVar != null) {
            hnVar.qor();
        }
    }

    protected void qor() {
        if (isFinishing()) {
            return;
        }
        if (this.gjv.get()) {
            jip();
            return;
        }
        if (this.mjg == null) {
            try {
                orl();
            } catch (Throwable th2) {
                ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th2);
            }
        }
        uua uuaVar = this.mjg;
        if (uuaVar != null) {
            uuaVar.hnj();
        }
    }

    void sk() {
        if (this.eum) {
            com.bytedance.sdk.openadsdk.component.qor qorVar = this.nyv;
            if (qorVar != null && qorVar.dse() != null && this.nyv.dse().sk()) {
                this.nyv.dse().aq();
            }
            fc();
        }
        com.bytedance.sdk.openadsdk.component.dkl.hn hnVar = this.orl;
        if (hnVar != null) {
            hnVar.gjv();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected void hn() {
        oj();
    }

    private boolean hn(Bundle bundle) {
        String stringExtra;
        this.as = hqh.hnj().hnj(hqh.hnj(getIntent()));
        if (this.f13038ua) {
            if (bundle != null) {
                stringExtra = bundle.getString("single_process_listener_key");
            } else {
                stringExtra = getIntent() != null ? getIntent().getStringExtra("single_process_listener_key") : null;
            }
            this.f13043ta = stringExtra;
            this.f18do = (com.bytedance.sdk.openadsdk.hnj.gjv.hn) hqh.hnj().hnj(this.f13043ta, com.bytedance.sdk.openadsdk.hnj.gjv.hn.class);
        } else {
            this.f18do = hqh.hnj().gjv();
        }
        hqh.hnj().sk();
        hnj(getIntent());
        hnj(bundle);
        as asVar = this.as;
        if (asVar == null) {
            finish();
            return false;
        }
        this.pty = asVar.aip();
        this.as.hnj(this.dkl);
        this.wu = this.as.atw();
        com.bytedance.sdk.openadsdk.utils.hn.hnj(this.as);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject hnj(JSONObject jSONObject) {
        if (xn() == 0) {
            return this.nyv.hnj(jSONObject);
        }
        return null;
    }

    protected void hnj(Intent intent) {
        if (intent != null) {
            this.tgn = intent.getIntExtra("ad_source", 0);
            this.f13039ul = intent.getLongExtra("cache_time", 0L);
            this.dkl = intent.getLongExtra("start_show_time", 0L);
        }
    }

    protected void hnj(Bundle bundle) {
        if (bundle != null) {
            if (!this.f13038ua && this.f18do == null) {
                this.f18do = dnm;
                dnm = null;
            }
            try {
                int i10 = bundle.getInt("meta_index", -1);
                this.tgn = bundle.getInt("ad_source", 0);
                this.dkl = bundle.getLong("start_show_time", 0L);
                this.f13039ul = bundle.getLong(Lykgign.WJlCxjsmNloWmp, 0L);
                this.as = hqh.hnj().hnj(i10);
            } catch (Throwable th2) {
                apu.qor("TTAppOpenAdActivity", th2.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.xyo.hnj
    public void hnj(Message message) {
        com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx;
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
        com.bytedance.sdk.openadsdk.component.qor qorVar;
        if (message.what == 100) {
            if (this.eum && (qorVar = this.nyv) != null && qorVar.dse() != null) {
                tgn();
                this.nyv.dse().hnj(1);
            }
            as asVar = this.as;
            if (asVar != null && (gjvVarFvx = asVar.fvx()) != null && (gjvVarHnj = gjvVarFvx.hnj()) != null) {
                gjvVarHnj.hnj(com.bytedance.sdk.openadsdk.core.orl.hnj.hnj.GENERAL_LINEAR_AD_ERROR);
            }
            m14do();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.gjv.hnj.InterfaceC0222hnj
    public void hnj(int i10) {
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            tgn();
        }
    }
}
