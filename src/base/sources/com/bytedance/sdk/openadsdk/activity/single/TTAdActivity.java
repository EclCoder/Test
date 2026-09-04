package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.hqh;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.gjv.ta;
import com.bytedance.sdk.openadsdk.utils.fc;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class TTAdActivity extends TTBaseActivity {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private boolean f13032hn;
    private hn hnj;
    private int qor = -1;
    private final AtomicBoolean gjv = new AtomicBoolean(false);

    private void gjv() {
        if (!this.f13032hn) {
            hqh.hnj().hnj((com.bytedance.sdk.openadsdk.hnj.sk.hnj) null);
            hqh.hnj().hnj((com.bytedance.sdk.openadsdk.hnj.qor.hn) null);
        } else if (!TextUtils.isEmpty(this.f13043ta)) {
            hqh.hnj().hnj(this.f13043ta, isFinishing(), isChangingConfigurations());
        }
        fc.hnj();
        sq.hnj().hnj(String.valueOf(hashCode()));
    }

    private void qor() {
        if (this.gjv.compareAndSet(false, true)) {
            hn hnVar = this.hnj;
            if (hnVar != null) {
                hnVar.sk(this);
            }
            gjv();
        }
    }

    private void sk() {
        hn hnVar = this.hnj;
        if (hnVar == null) {
            super.onBackPressed();
        } else {
            hnVar.ojm();
        }
    }

    public com.bytedance.sdk.openadsdk.hnj.qor.hn hn(String str) {
        if (!this.f13032hn) {
            return hqh.hnj().qor();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (com.bytedance.sdk.openadsdk.hnj.qor.hn) hqh.hnj().hnj(str, com.bytedance.sdk.openadsdk.hnj.qor.hn.class);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean hnj() {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        hn hnVar = this.hnj;
        if (hnVar != null) {
            hnVar.hnj((Activity) this);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        sk();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076 A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:12:0x0053, B:14:0x0061, B:16:0x0067, B:19:0x006f, B:21:0x0076, B:22:0x007d), top: B:26:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        long longExtra;
        com.bytedance.sdk.openadsdk.hnj.sk.hnj hnjVarHnj;
        com.bytedance.sdk.openadsdk.hnj.qor.hn hnVarHn;
        as asVarHnj;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (bundle == null) {
            if (intent != null) {
                this.f13043ta = intent.getStringExtra("single_process_listener_key");
                this.f13032hn = intent.getBooleanExtra("enable_new_arch", false);
                longExtra = intent.getLongExtra("start_show_time", SystemClock.elapsedRealtime());
            }
            hnjVarHnj = hnj(this.f13043ta);
            hnVarHn = hn(this.f13043ta);
            asVarHnj = com.bytedance.sdk.openadsdk.component.reward.hnj.hn.hnj(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.mjg.gjv.hn) null);
            if (asVarHnj == null) {
                finish();
                return;
            }
            try {
                asVarHnj.hnj(longExtra);
                this.hnj = new hn(this, asVarHnj, this.f13032hn);
                if (bundle != null && asVarHnj.ff()) {
                    this.hnj.oj();
                }
                this.hnj.hnj(this, bundle, hnjVarHnj, hnVarHn);
                if (bundle != null) {
                    ta.hnj(asVarHnj, "activity_recreate", asVarHnj.sk(), "activity_recreate", null);
                }
                com.bytedance.sdk.openadsdk.utils.hn.hnj(asVarHnj);
            } catch (Throwable th2) {
                apu.hnj("BVA", "onCreate: ", th2);
                ta.hnj(asVarHnj, "show_ad_fail", asVarHnj.sk(), "init_view_crash");
                finish();
                return;
            }
        }
        this.f13043ta = bundle.getString("single_process_listener_key");
        this.f13032hn = bundle.getBoolean("enable_new_arch", false);
        longExtra = 0;
        hnjVarHnj = hnj(this.f13043ta);
        hnVarHn = hn(this.f13043ta);
        asVarHnj = com.bytedance.sdk.openadsdk.component.reward.hnj.hn.hnj(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.mjg.gjv.hn) null);
        if (asVarHnj == null) {
            finish();
            return;
        }
        asVarHnj.hnj(longExtra);
        this.hnj = new hn(this, asVarHnj, this.f13032hn);
        if (bundle != null) {
            this.hnj.oj();
        }
        this.hnj.hnj(this, bundle, hnjVarHnj, hnVarHn);
        if (bundle != null) {
            ta.hnj(asVarHnj, "activity_recreate", asVarHnj.sk(), "activity_recreate", null);
        }
        com.bytedance.sdk.openadsdk.utils.hn.hnj(asVarHnj);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        qor();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        hn hnVar = this.hnj;
        if (hnVar != null) {
            hnVar.qor(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        hn hnVar = this.hnj;
        if (hnVar != null) {
            hnVar.hn(this);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f13043ta)) {
            bundle.putString("single_process_listener_key", this.f13043ta);
        }
        bundle.putBoolean("enable_new_arch", this.f13032hn);
        hn hnVar = this.hnj;
        if (hnVar != null) {
            int iHnj = hqh.hnj().hnj(hnVar.hnj());
            this.qor = iHnj;
            this.hnj.hnj(this, bundle, iHnj);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.qor >= 0) {
            hqh.hnj().qor(this.qor);
            this.qor = -1;
        }
        hn hnVar = this.hnj;
        if (hnVar != null) {
            hnVar.hnj(this);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        hn hnVar = this.hnj;
        if (hnVar != null) {
            hnVar.gjv(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        hn hnVar = this.hnj;
        if (hnVar != null) {
            hnVar.hnj(z10);
        }
    }

    public com.bytedance.sdk.openadsdk.hnj.sk.hnj hnj(String str) {
        if (!this.f13032hn) {
            return hqh.hnj().hn();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (com.bytedance.sdk.openadsdk.hnj.sk.hnj) hqh.hnj().hnj(str, com.bytedance.sdk.openadsdk.hnj.sk.hnj.class);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected void hn() {
        sk();
    }
}
