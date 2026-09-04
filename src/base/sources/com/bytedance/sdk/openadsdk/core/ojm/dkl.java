package com.bytedance.sdk.openadsdk.core.ojm;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.ua;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends com.bytedance.sdk.component.adexpress.dynamic.hnj.hnj {
    private final Runnable gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.hn.dse f14048hn;
    private final com.bytedance.sdk.component.adexpress.hn.orl hnj;
    private final com.bytedance.sdk.component.aq.hn.qor qor;

    public dkl(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.dynamic.sk.aq aqVar, com.bytedance.sdk.component.adexpress.hn.orl orlVar, com.bytedance.sdk.component.adexpress.dynamic.dkl.hnj hnjVar) {
        super(context, themeStatusBroadcastReceiver, z10, aqVar, orlVar, hnjVar);
        this.qor = new com.bytedance.sdk.component.aq.hn.qor("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.ojm.dkl.1
            @Override // java.lang.Runnable
            public void run() {
                dkl.this.hnj.qor();
                com.bytedance.sdk.openadsdk.core.fc.qor().post(dkl.this.gjv);
            }
        };
        this.gjv = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.dkl.2
            @Override // java.lang.Runnable
            public void run() {
                if (dkl.this.f14048hn != null) {
                    dkl dklVar = dkl.this;
                    dkl.super.hnj(dklVar.f14048hn);
                }
            }
        };
        this.hnj = orlVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.hnj.hnj
    public void hn() {
        super.hn();
        com.bytedance.sdk.openadsdk.core.fc.qor().removeCallbacks(this.gjv);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.hnj.hnj, com.bytedance.sdk.component.adexpress.hn.gjv
    public void hnj(com.bytedance.sdk.component.adexpress.hn.dse dseVar) {
        this.f14048hn = dseVar;
        ua.qor((Runnable) this.qor);
    }
}
