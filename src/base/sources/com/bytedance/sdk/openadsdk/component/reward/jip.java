package com.bytedance.sdk.openadsdk.component.reward;

import a7.a;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.c;
import com.bytedance.sdk.component.utils.tgn;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.model.tu;
import com.bytedance.sdk.openadsdk.core.model.xyo;
import com.bytedance.sdk.openadsdk.core.wu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import w6.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class jip {
    private static volatile jip hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Context f13514hn;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private com.bytedance.sdk.component.aq.hn.qor f13515sk;
    private final AtomicBoolean qor = new AtomicBoolean(false);
    private final List<hn> gjv = Collections.synchronizedList(new ArrayList());
    private final tgn.hnj dkl = new tgn.hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.jip.6
        @Override // com.bytedance.sdk.component.utils.tgn.hnj
        public void hnj(Context context, Intent intent, boolean z10, int i10) {
            if (z10) {
                if (jip.this.f13515sk == null) {
                    jip jipVar = jip.this;
                    jipVar.f13515sk = new com.bytedance.sdk.openadsdk.component.reward.qor("net connect task", jipVar.gjv);
                }
                com.bytedance.sdk.component.utils.ojm.hnj().post(jip.this.f13515sk);
            }
        }
    };

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hn extends com.bytedance.sdk.component.aq.hn.qor {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        final AdSlot f13523hn;
        final as hnj;
        final com.bytedance.sdk.openadsdk.core.model.hnj qor;

        hn(as asVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
            super("Reward Task");
            this.hnj = asVar;
            this.f13523hn = adSlot;
            this.qor = hnjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            as asVar = this.hnj;
            if (asVar == null || asVar.pwt() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.mjg.hnj.hn hnVarHnj = as.hnj(CacheDirFactory.getICacheDir(this.hnj.gkx()).hnj(), this.hnj);
            hnVarHnj.hnj("material_meta", this.hnj);
            hnVarHnj.hnj("ad_slot", this.f13523hn);
            com.bytedance.sdk.openadsdk.core.mjg.sk.hnj.hnj(hnVarHnj, new a() { // from class: com.bytedance.sdk.openadsdk.component.reward.jip.hn.1
                @Override // a7.b.a
                public void hnj(c cVar, int i10, String str) {
                }

                @Override // a7.b.a
                public void hnj(c cVar, int i10) {
                    fc fcVarHnj = fc.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj());
                    hn hnVar = hn.this;
                    fcVarHnj.hnj(hnVar.f13523hn, hnVar.qor);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj implements PAGRewardedAdLoadListener {
        private final PAGRewardedAdLoadListener gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final AdSlot f13524hn;
        private final Context hnj;
        private final com.bytedance.sdk.openadsdk.core.model.hnj qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private final boolean f13525sk;

        public hnj(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, boolean z10) {
            this.hnj = context;
            this.f13524hn = adSlot;
            this.qor = hnjVar;
            this.gjv = pAGRewardedAdLoadListener;
            this.f13525sk = z10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            jip.hnj(this.hnj).hnj(this.f13524hn, this.qor, this.gjv, pAGRewardedAd, this.f13525sk);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.dse
        public void onError(int i10, String str) {
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener = this.gjv;
            if (pAGRewardedAdLoadListener != null) {
                pAGRewardedAdLoadListener.onError(i10, str);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class qor implements PAGRewardedAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.hnj gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final AtomicBoolean f13526hn;
        private final PAGRewardedAdLoadListener hnj;
        private final AtomicInteger qor;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.dse
        public void onError(int i10, String str) {
            if (this.qor.decrementAndGet() > 0 || this.hnj == null || !this.f13526hn.compareAndSet(false, true)) {
                return;
            }
            this.hnj.onError(i10, str);
            com.bytedance.sdk.openadsdk.jip.gjv.hnj("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.component.reward.jip.qor.1
                @Override // com.bytedance.sdk.openadsdk.jip.hn
                public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", qor.this.gjv.hn());
                    return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("choose_ad_load_error").hn(jSONObject.toString());
                }
            });
        }

        private qor(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
            this.f13526hn = new AtomicBoolean(false);
            this.hnj = pAGRewardedAdLoadListener;
            this.gjv = hnjVar;
            this.qor = new AtomicInteger(hnj());
        }

        private int hnj() {
            if (!this.gjv.sk()) {
                return 0;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.gjv.gjv().size(); i11++) {
                as asVar = this.gjv.gjv().get(i11);
                if (asVar != null && !hqh.qor(asVar) && asVar.pwt() != null) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.qor.decrementAndGet();
            if (this.hnj == null || !this.f13526hn.compareAndSet(false, true)) {
                return;
            }
            this.hnj.onAdLoaded(pAGRewardedAd);
        }
    }

    private jip(Context context) {
        this.f13514hn = context == null ? com.bytedance.sdk.openadsdk.core.oj.hnj() : context.getApplicationContext();
        hn();
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.f13515sk != null) {
            try {
                com.bytedance.sdk.component.utils.ojm.hnj().removeCallbacks(this.f13515sk);
            } catch (Exception unused) {
            }
            this.f13515sk = null;
        }
        qor();
    }

    private void hn(final AdSlot adSlot) {
        xyo xyoVar = new xyo();
        xyoVar.f14017hn = 2;
        if (com.bytedance.sdk.openadsdk.core.oj.gjv().bug(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            xyoVar.ojm = 2;
        }
        com.bytedance.sdk.openadsdk.core.oj.qor().hnj(adSlot, xyoVar, 7, new wu() { // from class: com.bytedance.sdk.openadsdk.component.reward.jip.1
            boolean hnj = false;

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.eum
            public String hnj() {
                return fc.hnj(jip.this.f13514hn).hnj(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.eum
            public boolean hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
                boolean zHnj = fc.hnj(jip.this.f13514hn).hnj(hnjVar);
                this.hnj = zHnj;
                return zHnj;
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar) {
                if (this.hnj || hnjVar.gjv() == null || hnjVar.gjv().isEmpty()) {
                    return;
                }
                jip.this.hnj(hnjVar, new xn(jip.this.f13514hn, hnjVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor(AdSlot adSlot) {
        fc.hnj(this.f13514hn).hnj(adSlot.getCodeId());
    }

    private void qor() {
        if (this.qor.get()) {
            this.qor.set(false);
            try {
                tgn.hnj(this.dkl);
            } catch (Exception unused) {
            }
        }
    }

    public static jip hnj(Context context) {
        if (hnj == null) {
            synchronized (jip.class) {
                try {
                    if (hnj == null) {
                        hnj = new jip(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    private void hn(final AdSlot adSlot, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (com.bytedance.sdk.component.utils.fc.qor()) {
            b.a(adSlot.getBidAdm());
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        xyo xyoVar = new xyo();
        xyoVar.f14017hn = 1;
        if (com.bytedance.sdk.openadsdk.core.oj.gjv().bug(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            xyoVar.ojm = 2;
        }
        com.bytedance.sdk.openadsdk.core.oj.qor().hnj(adSlot, xyoVar, 7, new wu() { // from class: com.bytedance.sdk.openadsdk.component.reward.jip.2
            boolean hnj = false;

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(int i10, String str) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar) {
                com.bytedance.sdk.openadsdk.core.model.hnj hnjVar2;
                if (hnjVar.gjv() != null && !hnjVar.gjv().isEmpty()) {
                    xn xnVar = new xn(jip.this.f13514hn, hnjVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.wu.hnj.gjv.hnj().hnj(hnjVar.gjv().isEmpty() ? null : hnjVar.gjv().get(0));
                        com.bytedance.sdk.openadsdk.jip.gjv.hnj(hnjVar.dkl(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGRewardedAdLoadListener == null || com.bytedance.sdk.openadsdk.core.oj.gjv().vf() != 0) {
                        hnjVar2 = hnjVar;
                    } else {
                        jip.this.hnj(adSlot, hnjVar, pAGRewardedAdLoadListener, xnVar.hnj(), this.hnj);
                        hnjVar2 = hnjVar;
                    }
                    jip.this.hnj(hnjVar2, xnVar, adSlot, false, pAGRewardedAdLoadListener);
                    return;
                }
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.ojm.hnj(-3));
                    qorVar.hnj(-3);
                    qorVar.qor(6);
                    com.bytedance.sdk.openadsdk.core.model.qor.hnj(qorVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.eum
            public String hnj() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strHnj = fc.hnj(jip.this.f13514hn).hnj(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(strHnj)) {
                    return null;
                }
                return strHnj;
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.eum
            public boolean hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
                boolean zHnj = fc.hnj(jip.this.f13514hn).hnj(hnjVar);
                this.hnj = zHnj;
                return zHnj;
            }
        });
    }

    public void hnj(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        hn(adSlot);
    }

    public void hnj(String str, as asVar) {
        fc.hnj(this.f13514hn).hnj(str, asVar);
    }

    public void hnj() {
        try {
            fc.hnj(this.f13514hn).hnj();
        } catch (Throwable unused) {
        }
    }

    public void hnj(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        hn(adSlot, pAGRewardedAdLoadListener);
    }

    private void hn() {
        if (this.qor.get()) {
            return;
        }
        this.qor.set(true);
        tgn.hnj(this.dkl, this.f13514hn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, xn xnVar, AdSlot adSlot, boolean z10, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (!z10) {
            com.bytedance.sdk.openadsdk.mjg.hnj.hnj().hnj(hnjVar.dkl());
        }
        AdSlot adSlot2 = adSlot;
        qor qorVar = new qor(new hnj(this.f13514hn, adSlot2, hnjVar, pAGRewardedAdLoadListener, false), hnjVar);
        hnj(hnjVar);
        int i10 = 0;
        while (i10 < hnjVar.gjv().size()) {
            as asVar = hnjVar.gjv().get(i10);
            int iQb = asVar.qb();
            if (i10 == 0 && iQb == 43) {
                asVar.pwt().f(0);
            }
            xn xnVar2 = xnVar;
            boolean z11 = z10;
            AdSlot adSlot3 = adSlot2;
            hnj(hnjVar, asVar, xnVar2, adSlot3, z11, qorVar);
            adSlot2 = adSlot3;
            if (hnjVar.aq() && iQb != 43) {
                return;
            }
            i10++;
            xnVar = xnVar2;
            z10 = z11;
        }
    }

    private void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        tu tuVarTa = hnjVar.ta();
        int iJip = hnjVar.aq() ? 10 : 1;
        if (tuVarTa != null) {
            iJip = tuVarTa.jip();
        }
        for (final int i10 = 0; i10 < hnjVar.gjv().size(); i10++) {
            as asVar = hnjVar.gjv().get(i10);
            if (i10 >= iJip) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hnj().hnj(asVar, new com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.InterfaceC0224hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.jip.3
                @Override // com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.InterfaceC0224hnj
                public void hnj(boolean z10) {
                    com.bytedance.sdk.component.utils.apu.hnj("RewardVideoLoadManager", "onCachedResponse: i=" + i10 + ", isSuccess=" + z10);
                }
            });
        }
    }

    private void hnj(final com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, as asVar, xn xnVar, final AdSlot adSlot, final boolean z10, qor qorVar) {
        final xn xnVar2;
        final qor qorVar2;
        if (z10 && !hqh.qor(asVar) && com.bytedance.sdk.openadsdk.core.oj.gjv().tgn(adSlot.getCodeId()).gjv == 1 && !com.bytedance.sdk.component.utils.oj.gjv(this.f13514hn)) {
            hnj(new hn(asVar, adSlot, hnjVar));
            return;
        }
        boolean z11 = false;
        boolean z12 = qorVar != null && com.bytedance.sdk.openadsdk.core.oj.gjv().vf() == 1;
        if (hqh.qor(asVar)) {
            xnVar2 = xnVar;
            qorVar2 = qorVar;
            if (z10) {
                fc.hnj(this.f13514hn).hnj(adSlot, hnjVar);
            }
        } else {
            if (asVar.pwt() != null) {
                com.bytedance.sdk.openadsdk.core.mjg.hnj.hn hnVarHnj = as.hnj(CacheDirFactory.getICacheDir(asVar.gkx()).hnj(), asVar);
                hnVarHnj.hnj("material_meta", asVar);
                hnVarHnj.hnj("ad_slot", adSlot);
                xnVar2 = xnVar;
                qorVar2 = qorVar;
                com.bytedance.sdk.openadsdk.core.mjg.sk.hnj.hnj(hnVarHnj, new a() { // from class: com.bytedance.sdk.openadsdk.component.reward.jip.4
                    @Override // a7.b.a
                    public void hnj(c cVar, int i10) {
                        xnVar2.hn();
                        if (z10) {
                            fc.hnj(jip.this.f13514hn).hnj(adSlot, hnjVar);
                        } else {
                            if (qorVar2 == null || com.bytedance.sdk.openadsdk.core.oj.gjv().vf() != 1) {
                                return;
                            }
                            qorVar2.onAdLoaded(xnVar2.hnj());
                        }
                    }

                    @Override // a7.b.a
                    public void hnj(c cVar, int i10, String str) {
                        if (qorVar2 == null || com.bytedance.sdk.openadsdk.core.oj.gjv().vf() != 1) {
                            return;
                        }
                        qorVar2.onError(i10, str);
                    }
                });
            } else {
                xnVar2 = xnVar;
                qorVar2 = qorVar;
                z11 = z12;
            }
            z12 = z11;
        }
        if (z12) {
            qorVar2.onAdLoaded(xnVar2.hnj());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAd pAGRewardedAd, final boolean z10) {
        com.bytedance.sdk.openadsdk.core.fc.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.jip.5
            @Override // java.lang.Runnable
            public void run() {
                if (z10) {
                    jip.this.qor(adSlot);
                } else {
                    fc.hnj(jip.this.f13514hn).hnj(adSlot, hnjVar);
                    jip.this.qor(adSlot);
                }
            }
        });
        if (pAGRewardedAdLoadListener != null) {
            pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
        }
    }

    private void hnj(hn hnVar) {
        if (hnVar == null) {
            return;
        }
        if (this.gjv.size() > 0) {
            this.gjv.remove(0);
        }
        this.gjv.add(hnVar);
    }
}
