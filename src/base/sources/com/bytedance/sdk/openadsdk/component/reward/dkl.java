package com.bytedance.sdk.openadsdk.component.reward;

import a7.a;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.c;
import com.bytedance.sdk.component.utils.tgn;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
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

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {
    private static volatile dkl hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Context f13388hn;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private com.bytedance.sdk.component.aq.hn.qor f13389sk;
    private final AtomicBoolean qor = new AtomicBoolean(false);
    private final List<qor> gjv = Collections.synchronizedList(new ArrayList());
    private final tgn.hnj dkl = new tgn.hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.dkl.6
        @Override // com.bytedance.sdk.component.utils.tgn.hnj
        public void hnj(Context context, Intent intent, boolean z10, int i10) {
            if (z10) {
                if (dkl.this.f13389sk == null) {
                    dkl dklVar = dkl.this;
                    dklVar.f13389sk = new com.bytedance.sdk.openadsdk.component.reward.qor("fsv net connect task", dklVar.gjv);
                }
                com.bytedance.sdk.component.utils.ojm.hnj().post(dkl.this.f13389sk);
            }
        }
    };

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hn implements PAGInterstitialAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.hnj gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final AtomicBoolean f13397hn;
        private final PAGInterstitialAdLoadListener hnj;
        private final AtomicInteger qor;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.dse
        public void onError(int i10, String str) {
            if (this.qor.decrementAndGet() > 0 || !this.f13397hn.compareAndSet(false, true)) {
                return;
            }
            this.hnj.onError(i10, str);
            com.bytedance.sdk.openadsdk.jip.gjv.hnj("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.component.reward.dkl.hn.1
                @Override // com.bytedance.sdk.openadsdk.jip.hn
                public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", hn.this.gjv.hn());
                    return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("choose_ad_load_error").hn(jSONObject.toString());
                }
            });
        }

        private hn(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
            this.f13397hn = new AtomicBoolean(false);
            this.hnj = pAGInterstitialAdLoadListener;
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
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.qor.decrementAndGet();
            if (this.hnj == null || !this.f13397hn.compareAndSet(false, true)) {
                return;
            }
            this.hnj.onAdLoaded(pAGInterstitialAd);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj implements PAGInterstitialAdLoadListener {
        private final PAGInterstitialAdLoadListener gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final AdSlot f13398hn;
        private final Context hnj;
        private final com.bytedance.sdk.openadsdk.core.model.hnj qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private final boolean f13399sk;

        public hnj(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, boolean z10) {
            this.hnj = context;
            this.f13398hn = adSlot;
            this.qor = hnjVar;
            this.gjv = pAGInterstitialAdLoadListener;
            this.f13399sk = z10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            dkl.hnj(this.hnj).hnj(this.f13398hn, this.qor, this.gjv, pAGInterstitialAd, this.f13399sk);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.dse
        public void onError(int i10, String str) {
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = this.gjv;
            if (pAGInterstitialAdLoadListener != null) {
                pAGInterstitialAdLoadListener.onError(i10, str);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class qor extends com.bytedance.sdk.component.aq.hn.qor {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        final AdSlot f13400hn;
        final as hnj;
        final com.bytedance.sdk.openadsdk.core.model.hnj qor;

        qor(as asVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
            super("Fullscreen Task");
            this.hnj = asVar;
            this.f13400hn = adSlot;
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
            hnVarHnj.hnj("ad_slot", this.f13400hn);
            com.bytedance.sdk.openadsdk.core.mjg.sk.hnj.hnj(hnVarHnj, new a() { // from class: com.bytedance.sdk.openadsdk.component.reward.dkl.qor.1
                @Override // a7.b.a
                public void hnj(c cVar, int i10, String str) {
                }

                @Override // a7.b.a
                public void hnj(c cVar, int i10) {
                    sk skVarHnj = sk.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj());
                    qor qorVar = qor.this;
                    skVarHnj.hnj(qorVar.f13400hn, qorVar.qor);
                }
            });
        }
    }

    private dkl(Context context) {
        this.f13388hn = context == null ? com.bytedance.sdk.openadsdk.core.oj.hnj() : context.getApplicationContext();
        hn();
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.f13389sk != null) {
            try {
                com.bytedance.sdk.component.utils.ojm.hnj().removeCallbacks(this.f13389sk);
            } catch (Exception unused) {
            }
            this.f13389sk = null;
        }
        qor();
    }

    private void hn(final AdSlot adSlot) {
        xyo xyoVar = new xyo();
        xyoVar.qor = 2;
        if (com.bytedance.sdk.openadsdk.core.oj.gjv().bug(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            xyoVar.ojm = 2;
        }
        com.bytedance.sdk.openadsdk.core.oj.qor().hnj(adSlot, xyoVar, 8, new wu() { // from class: com.bytedance.sdk.openadsdk.component.reward.dkl.1
            boolean hnj = false;

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.eum
            public String hnj() {
                return sk.hnj(dkl.this.f13388hn).hnj(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.eum
            public boolean hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
                boolean zHnj = sk.hnj(dkl.this.f13388hn).hnj(hnjVar);
                this.hnj = zHnj;
                return zHnj;
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar) {
                if (this.hnj || hnjVar.gjv() == null || hnjVar.gjv().isEmpty()) {
                    return;
                }
                dkl.this.hnj(hnjVar, new oj(dkl.this.f13388hn, hnjVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor(AdSlot adSlot) {
        sk.hnj(this.f13388hn).hnj(adSlot.getCodeId());
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

    public static dkl hnj(Context context) {
        if (hnj == null) {
            synchronized (dkl.class) {
                try {
                    if (hnj == null) {
                        hnj = new dkl(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    private void hn(final AdSlot adSlot, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        xyo xyoVar = new xyo();
        xyoVar.qor = 1;
        if (com.bytedance.sdk.openadsdk.core.oj.gjv().bug(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            xyoVar.ojm = 2;
        }
        com.bytedance.sdk.openadsdk.core.oj.qor().hnj(adSlot, xyoVar, 8, new wu() { // from class: com.bytedance.sdk.openadsdk.component.reward.dkl.2
            boolean hnj = false;

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(int i10, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar) {
                com.bytedance.sdk.openadsdk.core.model.hnj hnjVar2;
                if (hnjVar.gjv() != null && !hnjVar.gjv().isEmpty()) {
                    oj ojVar = new oj(dkl.this.f13388hn, hnjVar);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.wu.hnj.gjv.hnj().hnj(hnjVar.gjv().isEmpty() ? null : hnjVar.gjv().get(0));
                        com.bytedance.sdk.openadsdk.jip.gjv.hnj(hnjVar.dkl(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGInterstitialAdLoadListener == null || com.bytedance.sdk.openadsdk.core.oj.gjv().vf() != 0) {
                        hnjVar2 = hnjVar;
                    } else {
                        dkl.this.hnj(adSlot, hnjVar, pAGInterstitialAdLoadListener, ojVar.hnj(), this.hnj);
                        hnjVar2 = hnjVar;
                    }
                    dkl.this.hnj(hnjVar2, ojVar, adSlot, false, pAGInterstitialAdLoadListener);
                    return;
                }
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.ojm.hnj(-3));
                    qorVar.hnj(-3);
                    qorVar.qor(5);
                    com.bytedance.sdk.openadsdk.core.model.qor.hnj(qorVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.eum
            public String hnj() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strHnj = sk.hnj(dkl.this.f13388hn).hnj(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(strHnj)) {
                    return null;
                }
                return strHnj;
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.eum
            public boolean hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
                boolean zHnj = sk.hnj(dkl.this.f13388hn).hnj(hnjVar);
                this.hnj = zHnj;
                return zHnj;
            }
        });
    }

    public void hnj() {
        try {
            sk.hnj(this.f13388hn).hnj();
        } catch (Throwable unused) {
        }
    }

    public void hnj(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        hn(adSlot);
    }

    private void hn() {
        if (this.qor.get()) {
            return;
        }
        this.qor.set(true);
        tgn.hnj(this.dkl, this.f13388hn);
    }

    public void hnj(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        hn(adSlot, pAGInterstitialAdLoadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, PAGInterstitialAd pAGInterstitialAd, final boolean z10) {
        com.bytedance.sdk.openadsdk.core.fc.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.dkl.3
            @Override // java.lang.Runnable
            public void run() {
                if (z10) {
                    dkl.this.qor(adSlot);
                } else {
                    sk.hnj(dkl.this.f13388hn).hnj(adSlot, hnjVar);
                    dkl.this.qor(adSlot);
                }
            }
        });
        if (pAGInterstitialAdLoadListener != null) {
            pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, oj ojVar, AdSlot adSlot, boolean z10, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        if (!z10) {
            com.bytedance.sdk.openadsdk.mjg.hnj.hnj().hnj(hnjVar.dkl());
        }
        AdSlot adSlot2 = adSlot;
        hn hnVar = new hn(new hnj(this.f13388hn, adSlot2, hnjVar, pAGInterstitialAdLoadListener, false), hnjVar);
        hnj(hnjVar);
        int i10 = 0;
        while (i10 < hnjVar.gjv().size()) {
            as asVar = hnjVar.gjv().get(i10);
            int iQb = asVar.qb();
            if (i10 == 0 && iQb == 43) {
                asVar.pwt().f(0);
            }
            oj ojVar2 = ojVar;
            boolean z11 = z10;
            AdSlot adSlot3 = adSlot2;
            hnj(hnjVar, asVar, ojVar2, adSlot3, z11, hnVar);
            adSlot2 = adSlot3;
            if (hnjVar.aq() && asVar.qb() != 43) {
                return;
            }
            i10++;
            ojVar = ojVar2;
            z10 = z11;
        }
    }

    private void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        tu tuVarTa = hnjVar.ta();
        int iJip = hnjVar.aq() ? 10 : 1;
        if (tuVarTa != null) {
            iJip = tuVarTa.jip();
        }
        for (final int i10 = 0; i10 < hnjVar.gjv().size() && i10 < iJip; i10++) {
            com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hnj().hnj(hnjVar.gjv().get(i10), new com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.InterfaceC0224hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.dkl.4
                @Override // com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.InterfaceC0224hnj
                public void hnj(boolean z10) {
                    com.bytedance.sdk.component.utils.apu.hnj("ScreenVideoLoadM", "onCachedResponse: i=" + i10 + ", isSuccess=" + z10);
                }
            });
        }
    }

    private void hnj(final com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, as asVar, oj ojVar, final AdSlot adSlot, final boolean z10, hn hnVar) {
        final oj ojVar2;
        final hn hnVar2;
        if (z10 && !hqh.qor(asVar) && as.sk(asVar) && com.bytedance.sdk.openadsdk.core.oj.gjv().tgn(adSlot.getCodeId()).gjv == 1 && !com.bytedance.sdk.component.utils.oj.gjv(this.f13388hn)) {
            hnj(new qor(asVar, adSlot, hnjVar));
            return;
        }
        boolean z11 = false;
        boolean z12 = hnVar != null && com.bytedance.sdk.openadsdk.core.oj.gjv().vf() == 1;
        if (hqh.qor(asVar)) {
            ojVar2 = ojVar;
            hnVar2 = hnVar;
            if (z10) {
                sk.hnj(this.f13388hn).hnj(adSlot, hnjVar);
            }
        } else if (as.sk(asVar)) {
            if (asVar.pwt() != null) {
                com.bytedance.sdk.openadsdk.core.mjg.hnj.hn hnVarHnj = as.hnj(CacheDirFactory.getICacheDir(asVar.gkx()).hnj(), asVar);
                hnVarHnj.hnj("material_meta", asVar);
                hnVarHnj.hnj("ad_slot", adSlot);
                ojVar2 = ojVar;
                hnVar2 = hnVar;
                com.bytedance.sdk.openadsdk.core.mjg.sk.hnj.hnj(hnVarHnj, new a() { // from class: com.bytedance.sdk.openadsdk.component.reward.dkl.5
                    @Override // a7.b.a
                    public void hnj(c cVar, int i10) {
                        ojVar2.hn();
                        if (z10) {
                            sk.hnj(dkl.this.f13388hn).hnj(adSlot, hnjVar);
                        } else {
                            if (hnVar2 == null || com.bytedance.sdk.openadsdk.core.oj.gjv().vf() != 1) {
                                return;
                            }
                            hnVar2.onAdLoaded(ojVar2.hnj());
                        }
                    }

                    @Override // a7.b.a
                    public void hnj(c cVar, int i10, String str) {
                        if (hnVar2 == null || com.bytedance.sdk.openadsdk.core.oj.gjv().vf() != 1) {
                            return;
                        }
                        hnVar2.onError(i10, str);
                    }
                });
            } else {
                ojVar2 = ojVar;
                hnVar2 = hnVar;
                z11 = z12;
            }
            z12 = z11;
        } else {
            ojVar2 = ojVar;
            hnVar2 = hnVar;
            if (z10) {
                sk.hnj(this.f13388hn).hnj(adSlot, hnjVar);
            }
        }
        if (z12) {
            hnVar2.onAdLoaded(ojVar2.hnj());
        }
    }

    private void hnj(qor qorVar) {
        if (qorVar == null) {
            return;
        }
        if (this.gjv.size() > 0) {
            this.gjv.remove(0);
        }
        this.gjv.add(qorVar);
    }

    public void hnj(String str, as asVar) {
        sk.hnj(this.f13388hn).hnj(str, asVar);
    }
}
