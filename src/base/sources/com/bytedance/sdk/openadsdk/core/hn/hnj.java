package com.bytedance.sdk.openadsdk.core.hn;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.as.sk;
import com.bytedance.sdk.openadsdk.core.as;
import com.bytedance.sdk.openadsdk.oj.gjv;
import com.bytedance.sdk.openadsdk.oj.qor;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.vungle.ads.internal.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements as.hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final AdSlot f13769hn;
    private final as.hnj hnj;
    private final boolean qor;

    public hnj(as.hnj hnjVar, AdSlot adSlot, boolean z10) {
        this.hnj = hnjVar;
        this.f13769hn = adSlot;
        this.qor = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.as.hnj
    public void hnj(final int i10, final String str) {
        AdSlot adSlot;
        if (this.hnj != null) {
            if (ua.dkl() || !((adSlot = this.f13769hn) == null || adSlot.getDurationSlotType() == 5 || sk.hnj("getads_callback_async", 0) != 1)) {
                this.hnj.hnj(i10, str);
            } else {
                ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hn.hnj.1
                    @Override // java.lang.Runnable
                    public void run() {
                        hnj.this.hnj.hnj(i10, str);
                    }
                });
            }
            if (!this.qor || this.f13769hn == null) {
                return;
            }
            qor.qor(new gjv() { // from class: com.bytedance.sdk.openadsdk.core.hn.hnj.2
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn(f.LOAD_AD);
                    hnjVar.qor(hnj.this.f13769hn.getCodeId());
                    hnjVar.gjv(orp.qor(hnj.this.f13769hn.getDurationSlotType()));
                    hnjVar.hnj(BuildConfig.VERSION_NAME);
                    hnjVar.dse(orp.hnj(hnj.this.f13769hn).toString());
                    return hnjVar;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.as.hnj
    public void hnj(final com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, final com.bytedance.sdk.openadsdk.core.model.qor qorVar) {
        AdSlot adSlot;
        if (this.hnj != null) {
            if (!ua.dkl() && ((adSlot = this.f13769hn) == null || adSlot.getDurationSlotType() == 5 || sk.hnj("getads_callback_async", 0) != 1)) {
                ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hn.hnj.3
                    @Override // java.lang.Runnable
                    public void run() {
                        hnj.this.hnj.hnj(hnjVar, qorVar);
                    }
                });
            } else {
                this.hnj.hnj(hnjVar, qorVar);
            }
            if (!this.qor || this.f13769hn == null) {
                return;
            }
            qor.hn(new gjv() { // from class: com.bytedance.sdk.openadsdk.core.hn.hnj.4
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar2 = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar2.hn(f.LOAD_AD);
                    hnjVar2.qor(hnj.this.f13769hn.getCodeId());
                    hnjVar2.gjv(orp.qor(hnj.this.f13769hn.getDurationSlotType()));
                    hnjVar2.hnj(BuildConfig.VERSION_NAME);
                    hnjVar2.dse(orp.hnj(hnj.this.f13769hn).toString());
                    return hnjVar2;
                }
            });
        }
    }
}
