package com.bytedance.sdk.openadsdk.gjv.hnj;

import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.tgn;
import com.bytedance.sdk.openadsdk.utils.ua;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class aq implements com.bytedance.sdk.openadsdk.jip.hn.qor {
    public static final aq hnj = new aq();

    private aq() {
    }

    @Override // com.bytedance.sdk.openadsdk.jip.hn.qor
    public void hnj(com.bytedance.sdk.openadsdk.jip.hn hnVar) {
        hnj(hnVar, false);
    }

    @Override // com.bytedance.sdk.openadsdk.jip.hn.qor
    public void hnj(final com.bytedance.sdk.openadsdk.jip.hn hnVar, final boolean z10) {
        hnj(new com.bytedance.sdk.component.aq.hn.qor("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.gjv.hnj.aq.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.jip.hnj.qor qorVarHnj = hnVar.hnj();
                    if (qorVarHnj == null) {
                        return;
                    }
                    com.bytedance.sdk.component.dkl.hnj.gjv.hnj.hnj hnjVar = new com.bytedance.sdk.component.dkl.hnj.gjv.hnj.hnj(tgn.hnj(), qorVarHnj.hnj());
                    hnjVar.hnj((byte) 0);
                    hnjVar.qor(z10 ? (byte) 2 : (byte) 3);
                    hnjVar.hn((byte) 1);
                    if (com.bytedance.sdk.component.dkl.hnj.hn.hn()) {
                        hn.hnj(oj.hnj());
                    }
                    com.bytedance.sdk.component.dkl.hnj.hn.hnj(hnjVar);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void hnj(com.bytedance.sdk.component.aq.hn.qor qorVar) {
        if (qorVar == null) {
            return;
        }
        if (!ua.dse()) {
            ua.hn(qorVar, 5);
        } else {
            qorVar.run();
        }
    }
}
