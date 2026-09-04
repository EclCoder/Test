package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.hqh;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.orp;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    public static void hnj(final as asVar, final boolean z10, final boolean z11) {
        com.bytedance.sdk.openadsdk.core.fc.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.hn.1
            @Override // java.lang.Runnable
            public void run() {
                as asVar2 = asVar;
                if (asVar2 == null || asVar2.era()) {
                    return;
                }
                try {
                    Context contextHnj = com.bytedance.sdk.openadsdk.core.oj.hnj();
                    AdSlot adSlotAip = asVar.aip();
                    if (adSlotAip != null) {
                        boolean zHn = com.bytedance.sdk.openadsdk.utils.hn.hn();
                        if (zHn) {
                            if (z11) {
                                uua.hnj(contextHnj).hnj(adSlotAip.getCodeId(), asVar);
                            } else {
                                dse.hnj(contextHnj).hnj(adSlotAip.getCodeId(), asVar);
                            }
                        } else if (z11) {
                            jip.hnj(contextHnj).hnj(adSlotAip.getCodeId(), asVar);
                        } else {
                            dkl.hnj(contextHnj).hnj(adSlotAip.getCodeId(), asVar);
                        }
                        if (z10) {
                            if (zHn) {
                                if (z11) {
                                    uua.hnj(contextHnj).hnj(adSlotAip);
                                    return;
                                } else {
                                    dse.hnj(contextHnj).hnj(adSlotAip);
                                    return;
                                }
                            }
                            if (z11) {
                                jip.hnj(contextHnj).hnj(adSlotAip);
                            } else {
                                dkl.hnj(contextHnj).hnj(adSlotAip);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static boolean hnj(final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        com.bytedance.sdk.openadsdk.activity.single.hn hnVarFf;
        int iGm = 0;
        if (hnjVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar = hnjVar.f13463th;
        if (aqVar == null || aqVar.ff() == null) {
            hnVarFf = null;
        } else {
            hnVarFf = hnjVar.f13463th.ff();
            if (hnVarFf != null) {
                iGm = hnVarFf.gm();
            }
        }
        boolean zHnj = orp.hnj(hnjVar.orp, hnjVar.f13456hn, hnjVar.f13461sk, hnjVar.gjv ? 7 : 5, iGm);
        if (zHnj) {
            if (hnjVar.f13456hn != null) {
                hqh.hnj().hnj(hnjVar.f13456hn, new hqh.hn() { // from class: com.bytedance.sdk.openadsdk.component.reward.hn.2
                    @Override // com.bytedance.sdk.openadsdk.core.hqh.hn
                    public void hnj() {
                        com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar;
                        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = hnjVar;
                        if (hnjVar2 == null || (hnVar = hnjVar2.sq) == null) {
                            return;
                        }
                        hnVar.mkl();
                    }
                });
            }
            if (hnVarFf != null && hnVarFf.tgn()) {
                hnVarFf.hqh();
            }
        }
        return zHnj;
    }
}
