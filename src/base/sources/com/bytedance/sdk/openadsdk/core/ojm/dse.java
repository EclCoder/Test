package com.bytedance.sdk.openadsdk.core.ojm;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.model.xyo;
import com.bytedance.sdk.openadsdk.utils.fvt;
import com.bytedance.sdk.openadsdk.utils.ua;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse {
    private com.bytedance.sdk.openadsdk.core.model.as aq;
    private PAGBannerAdLoadListener gjv;
    private AdSlot hnj;
    private final Context qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final AtomicBoolean f14054sk = new AtomicBoolean(false);
    private int dkl = 5;
    private final fvt dse = fvt.qor();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.as f14053hn = com.bytedance.sdk.openadsdk.core.oj.qor();

    private dse(Context context) {
        if (context != null) {
            this.qor = context.getApplicationContext();
        } else {
            this.qor = com.bytedance.sdk.openadsdk.core.oj.hnj();
        }
    }

    public static dse hnj(Context context) {
        return new dse(context);
    }

    public void hnj(AdSlot adSlot, int i10, com.bytedance.sdk.openadsdk.common.dse dseVar) {
        this.dse.sk();
        if (this.f14054sk.get()) {
            return;
        }
        this.dkl = i10;
        this.f14054sk.set(true);
        this.hnj = adSlot;
        if (dseVar instanceof PAGBannerAdLoadListener) {
            this.gjv = (PAGBannerAdLoadListener) dseVar;
        }
        hnj(adSlot);
    }

    private void hnj(final AdSlot adSlot) {
        if (adSlot == null) {
            return;
        }
        xyo xyoVar = new xyo();
        xyoVar.ojm = 2;
        this.f14053hn.hnj(adSlot, xyoVar, this.dkl, new com.bytedance.sdk.openadsdk.core.wu() { // from class: com.bytedance.sdk.openadsdk.core.ojm.dse.1
            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(int i10, String str) {
                dse.this.hnj(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.wu, com.bytedance.sdk.openadsdk.core.as.hnj
            public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar) {
                dse.this.hnj(hnjVar, qorVar, adSlot);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar, AdSlot adSlot) {
        if (hnjVar.gjv() != null && !hnjVar.gjv().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.as asVarOjm = hnjVar.ojm();
            this.aq = asVarOjm;
            hnj(asVarOjm, adSlot);
            if (com.bytedance.sdk.component.utils.fc.qor()) {
                Log.e("ExpressAdLoadManager", "onAdLoad: net work response duration = " + this.dse.gjv() + "run in  " + Thread.currentThread().getName());
            }
            if (this.f14054sk.getAndSet(false)) {
                ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ojm.dse.2
                    @Override // java.lang.Runnable
                    public void run() {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (dse.this.aq != null) {
                            dse dseVar = dse.this;
                            dseVar.hnj(dseVar.aq, jElapsedRealtime);
                        }
                    }
                });
                return;
            }
            return;
        }
        hnj(-3, com.bytedance.sdk.openadsdk.core.ojm.hnj(-3));
        qorVar.hnj(-3);
        qorVar.qor(8);
        com.bytedance.sdk.openadsdk.core.model.qor.hnj(qorVar);
    }

    private void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, AdSlot adSlot) {
        for (com.bytedance.sdk.openadsdk.core.model.as asVar2 : asVar.mr()) {
            if (com.bytedance.sdk.openadsdk.core.model.as.sk(asVar2) && asVar2.pwt() != null && asVar2.pwt().h() != null) {
                if (com.bytedance.sdk.openadsdk.core.oj.gjv().sk(String.valueOf(asVar2.atw())) && com.bytedance.sdk.openadsdk.core.oj.gjv().fr()) {
                    com.bytedance.sdk.openadsdk.core.mjg.hnj.hn hnVarHnj = com.bytedance.sdk.openadsdk.core.model.as.hnj(CacheDirFactory.getICacheDir(asVar2.gkx()).qor(), asVar2);
                    hnVarHnj.hnj("material_meta", asVar2);
                    hnVarHnj.hnj("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.mjg.sk.hnj.hnj(hnVarHnj, null);
                }
            }
        }
    }

    private PAGBannerAd hnj(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        int width;
        int height;
        PAGBannerSize pAGBannerSizeJmr = asVar.jmr();
        float fMin = Math.min(this.hnj.getExpressViewAcceptedHeight(), 250.0f);
        if (pAGBannerSizeJmr != null) {
            width = pAGBannerSizeJmr.getWidth();
            height = pAGBannerSizeJmr.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        float expressViewAcceptedWidth = width > 0 ? width : this.hnj.getExpressViewAcceptedWidth();
        if (height > 0) {
            fMin = height;
        }
        this.hnj.setExpressViewAccepted(expressViewAcceptedWidth, fMin);
        return new com.bytedance.sdk.openadsdk.core.gjv.dse(this.qor, asVar, this.hnj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, long j10) {
        if (this.gjv != null) {
            PAGBannerAd pAGBannerAdHnj = hnj(asVar);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jGjv = this.dse.gjv();
            if (!TextUtils.isEmpty(this.hnj.getBidAdm())) {
                com.bytedance.sdk.openadsdk.jip.gjv.hnj(asVar, jGjv);
            }
            this.gjv.onAdLoaded(pAGBannerAdHnj);
            hnj(asVar, jGjv, j10, jElapsedRealtime);
        }
    }

    private void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, final long j10, final long j11, final long j12) {
        try {
            if (!com.bytedance.sdk.openadsdk.core.oj.gjv().qb() || !com.bytedance.sdk.openadsdk.as.sk.gjv() || this.dkl != 1 || asVar == null || asVar.mr() == null || asVar.mr().isEmpty() || asVar.gjv().hnj() == null) {
                return;
            }
            final JSONObject jSONObjectHnj = asVar.gjv().hnj();
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), asVar, jSONObjectHnj.optString("tag", ""), "load_ad_time", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.core.ojm.dse.3
                @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                public JSONObject hn() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", jSONObjectHnj.optLong("duration", 0L));
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                public JSONObject qor() {
                    try {
                        long jOptLong = jSONObjectHnj.optLong("callback_start", 0L);
                        long j13 = j11;
                        long j14 = j13 - jOptLong;
                        long j15 = j12 - j13;
                        JSONObject jSONObjectOptJSONObject = jSONObjectHnj.optJSONObject("extra_data");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = new JSONObject();
                        }
                        jSONObjectOptJSONObject.put("thread_dispatch_duration", j14);
                        jSONObjectOptJSONObject.put("build_banner_ad_duration", j15);
                        jSONObjectOptJSONObject.put("ad_load_duration_full", j10);
                        return jSONObjectOptJSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(int i10, String str) {
        PAGBannerAdLoadListener pAGBannerAdLoadListener;
        if (!this.f14054sk.getAndSet(false) || (pAGBannerAdLoadListener = this.gjv) == null) {
            return;
        }
        pAGBannerAdLoadListener.onError(i10, str);
    }
}
