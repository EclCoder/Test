package com.bytedance.sdk.openadsdk.component.hn;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.dse;
import com.bytedance.sdk.openadsdk.core.as;
import com.bytedance.sdk.openadsdk.core.mjg.hnj.hn;
import com.bytedance.sdk.openadsdk.core.model.qor;
import com.bytedance.sdk.openadsdk.core.model.xyo;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ojm;
import com.bytedance.sdk.openadsdk.core.wu;
import com.bytedance.sdk.openadsdk.jip.gjv;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.fvt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private static volatile hnj hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final as f13360hn = oj.qor();

    private hnj() {
    }

    public static hnj hnj() {
        if (hnj == null) {
            synchronized (hnj.class) {
                try {
                    if (hnj == null) {
                        hnj = new hnj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    public void hnj(final Context context, final AdSlot adSlot, final dse dseVar) {
        final fvt fvtVarHn = fvt.hn();
        this.f13360hn.hnj(adSlot, new xyo(), 5, new wu() { // from class: com.bytedance.sdk.openadsdk.component.hn.hnj.1
            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(int i10, String str) {
                dseVar.onError(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, qor qorVar) {
                hnj.this.hnj(hnjVar, qorVar, context, adSlot, dseVar, fvtVarHn);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, qor qorVar, Context context, AdSlot adSlot, dse dseVar, fvt fvtVar) {
        if (hnjVar.gjv() != null && !hnjVar.gjv().isEmpty()) {
            List<com.bytedance.sdk.openadsdk.core.model.as> listGjv = hnjVar.gjv();
            ArrayList arrayList = new ArrayList(listGjv.size());
            for (com.bytedance.sdk.openadsdk.core.model.as asVar : listGjv) {
                if (com.bytedance.sdk.openadsdk.core.model.as.sk(asVar) || (asVar != null && asVar.lwt())) {
                    PAGNativeAd pAGNativeAdHnj = hnj(context, asVar, adSlot);
                    if (dseVar instanceof PAGNativeAdLoadListener) {
                        arrayList.add(pAGNativeAdHnj);
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.as.sk(asVar) && asVar.pwt() != null && asVar.pwt().h() != null) {
                    if (oj.gjv().sk(String.valueOf(asVar.atw())) && oj.gjv().fr()) {
                        if (asVar.pwt() != null) {
                            asVar.pwt().f(1);
                        }
                        if (asVar.exp() != null) {
                            asVar.exp().f(1);
                        }
                        hn hnVarHnj = com.bytedance.sdk.openadsdk.core.model.as.hnj(CacheDirFactory.getICacheDir(asVar.gkx()).qor(), asVar);
                        hnVarHnj.hnj("material_meta", asVar);
                        hnVarHnj.hnj("ad_slot", adSlot);
                        com.bytedance.sdk.openadsdk.core.mjg.sk.hnj.hnj(hnVarHnj, null);
                    }
                    IPBroadcastReceiver.hn(context, asVar);
                }
            }
            boolean z10 = dseVar instanceof PAGNativeAdLoadListener;
            if (z10 && !arrayList.isEmpty()) {
                if (adSlot != null && !TextUtils.isEmpty(adSlot.getBidAdm())) {
                    gjv.hnj(listGjv.get(0), fvtVar.gjv());
                }
                if (z10) {
                    ((PAGNativeAdLoadListener) dseVar).onAdLoaded(arrayList.get(0));
                }
                if (qorVar.sk() == null || qorVar.sk().isEmpty()) {
                    return;
                }
                qorVar.qor(4);
                qor.hnj(qorVar);
                return;
            }
            dseVar.onError(-4, ojm.hnj(-4));
            qorVar.hnj(-4);
            qorVar.qor(4);
            qor.hnj(qorVar);
            return;
        }
        dseVar.onError(-3, ojm.hnj(-3));
        qorVar.hnj(-3);
        qorVar.qor(4);
        qor.hnj(qorVar);
    }

    private PAGNativeAd hnj(Context context, com.bytedance.sdk.openadsdk.core.model.as asVar, AdSlot adSlot) {
        if (asVar.th() != 2) {
            return new com.bytedance.sdk.openadsdk.hnj.hn.hn(context, asVar, 5, adSlot);
        }
        if (asVar.pwt() != null) {
            return new com.bytedance.sdk.openadsdk.hnj.hn.hnj.hn(context, asVar, adSlot);
        }
        return new com.bytedance.sdk.openadsdk.hnj.hn.hnj.qor(context, asVar, adSlot);
    }
}
