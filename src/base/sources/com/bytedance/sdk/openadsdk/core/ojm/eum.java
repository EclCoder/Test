package com.bytedance.sdk.openadsdk.core.ojm;

import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.ua;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class eum extends com.bytedance.sdk.component.adexpress.hn.hnj<hnj> {
    private final com.bytedance.sdk.component.adexpress.hn.orl dkl;
    private com.bytedance.sdk.component.adexpress.hn.qor gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private hnj f14058hn;
    AtomicBoolean hnj = new AtomicBoolean(false);
    private final View qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.hn.dse f14059sk;

    public eum(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.component.adexpress.hn.orl orlVar) {
        this.qor = view;
        this.dkl = orlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn() {
        if (this.hnj.get()) {
            return;
        }
        com.bytedance.sdk.component.adexpress.hn.qor qorVar = this.gjv;
        if (qorVar == null || !qorVar.hnj((apu) this.qor, 0)) {
            this.f14059sk.hnj(107, "backup false");
            return;
        }
        this.dkl.sk().dkl();
        hnj hnjVar = (hnj) this.qor.findViewWithTag("tt_express_backup_fl_tag_26");
        this.f14058hn = hnjVar;
        if (hnjVar == null) {
            this.f14059sk.hnj(107, "backupview is null");
            return;
        }
        com.bytedance.sdk.component.adexpress.hn.mjg mjgVar = new com.bytedance.sdk.component.adexpress.hn.mjg();
        hnj hnjVar2 = this.f14058hn;
        float realWidth = hnjVar2 == null ? 0.0f : hnjVar2.getRealWidth();
        hnj hnjVar3 = this.f14058hn;
        float realHeight = hnjVar3 != null ? hnjVar3.getRealHeight() : 0.0f;
        mjgVar.hnj(true);
        mjgVar.hnj(realWidth);
        mjgVar.hn(realHeight);
        this.f14059sk.hnj(this.f14058hn, mjgVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.gjv
    public void hnj(com.bytedance.sdk.component.adexpress.hn.dse dseVar) {
        this.f14059sk = dseVar;
        ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.eum.1
            @Override // java.lang.Runnable
            public void run() {
                eum.this.hn();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.gjv
    /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
    public hnj sk() {
        return this.f14058hn;
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.hnj
    public void hnj(com.bytedance.sdk.component.adexpress.hn.qor qorVar) {
        this.gjv = qorVar;
    }
}
