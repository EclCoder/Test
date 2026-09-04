package com.bytedance.sdk.openadsdk.core.gjv;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.nyv;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse extends PAGBannerAd {
    private int aq;
    private sk dkl;
    private List<com.bytedance.sdk.openadsdk.core.gjv.hnj> dnm;
    private boolean dse;
    private boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected as f13737hn;
    protected Context hnj;
    private int ojm;
    protected AdSlot qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f13738sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final AtomicBoolean f13739ta = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj();
    }

    public dse(Context context, as asVar, AdSlot adSlot) {
        this.aq = 0;
        this.ojm = 0;
        this.hnj = context;
        this.f13737hn = asVar;
        this.qor = adSlot;
        this.aq = (int) adSlot.getExpressViewAcceptedWidth();
        this.ojm = (int) this.qor.getExpressViewAcceptedHeight();
        hnj(this.f13737hn);
        hn(asVar);
    }

    private void hn(as asVar) {
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVarGjv;
        if (asVar == null || (hnjVarGjv = asVar.gjv()) == null) {
            return;
        }
        this.dnm = new ArrayList();
        int size = hnjVarGjv.gjv().size();
        if (!this.dse) {
            this.dnm.add(new com.bytedance.sdk.openadsdk.core.gjv.hnj(this.hnj, asVar, this.qor, this, false));
            return;
        }
        this.dkl = new sk(hnjVarGjv.dse(), this.hnj, this.aq, this.ojm);
        for (int i10 = 0; i10 < size; i10++) {
            this.qor.setExpressViewAccepted(((this.aq - sq.qor(this.hnj, hnjVarGjv.dse().sk())) - sq.qor(this.hnj, hnjVarGjv.dse().dkl())) - (sq.qor(this.hnj, hnjVarGjv.dse().dse()) * 2), this.ojm);
            as asVar2 = hnjVarGjv.gjv().get(i10);
            if (i10 != 0) {
                hnj(i10, asVar2);
            }
            com.bytedance.sdk.openadsdk.core.gjv.hnj hnjVar = new com.bytedance.sdk.openadsdk.core.gjv.hnj(this.hnj, asVar2, this.qor, this, true);
            hnjVar.hnj(i10);
            this.dnm.add(hnjVar);
        }
        this.dkl.hnj(this.dnm);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        try {
            List<com.bytedance.sdk.openadsdk.core.gjv.hnj> list = this.dnm;
            if (list == null || list.isEmpty()) {
                return;
            }
            if (this.dse) {
                this.dkl.hnj();
            } else {
                this.dnm.get(0).dse();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public PAGBannerSize getBannerSize() {
        return this.qor != null ? new PAGBannerSize(this.aq, this.ojm) : new PAGBannerSize(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        try {
            List<com.bytedance.sdk.openadsdk.core.gjv.hnj> list = this.dnm;
            if (list != null && !list.isEmpty()) {
                return this.dse ? this.dkl.hn() : this.dnm.get(0).hnj();
            }
        } catch (Throwable unused) {
        }
        return new View(this.hnj);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        as asVar = this.f13737hn;
        if (asVar == null || asVar.jd() == null) {
            return null;
        }
        try {
            return this.f13737hn.jd().get(str);
        } catch (Throwable th2) {
            apu.qor("PAGBannerAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        as asVar = this.f13737hn;
        if (asVar != null) {
            return asVar.jd();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.f13738sk) {
            return;
        }
        nyv.hnj(this.f13737hn, d10, str, str2);
        this.f13738sk = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(final PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        List<com.bytedance.sdk.openadsdk.core.gjv.hnj> list = this.dnm;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.dnm.size(); i10++) {
            this.dnm.get(i10).hnj(new PAGBannerAdInteractionCallback() { // from class: com.bytedance.sdk.openadsdk.core.gjv.dse.1
                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback
                public void onAdShowFailed(PAGErrorModel pAGErrorModel) {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdShowFailed(pAGErrorModel);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2;
                    if (!dse.this.f13739ta.compareAndSet(false, true) || (pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback) == null) {
                        return;
                    }
                    pAGBannerAdInteractionCallback2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(final PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        List<com.bytedance.sdk.openadsdk.core.gjv.hnj> list = this.dnm;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.dnm.size(); i10++) {
            this.dnm.get(i10).hnj(new PAGBannerAdInteractionListener() { // from class: com.bytedance.sdk.openadsdk.core.gjv.dse.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2;
                    if (!dse.this.f13739ta.compareAndSet(false, true) || (pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener) == null) {
                        return;
                    }
                    pAGBannerAdInteractionListener2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.gjv) {
            return;
        }
        nyv.hnj(this.f13737hn, d10);
        this.gjv = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    private void hnj(as asVar) {
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVarGjv;
        boolean z10;
        if (asVar == null || (hnjVarGjv = asVar.gjv()) == null) {
            return;
        }
        if (hnjVarGjv.aq()) {
            z10 = hnjVarGjv.gjv().size() > 1;
        }
        this.dse = z10;
    }

    public boolean hnj() {
        return this.dse;
    }

    private void hnj(int i10, as asVar) {
        if (i10 != 0) {
            if (!TextUtils.isEmpty(asVar.meb())) {
                asVar.mjg(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            }
            Map<String, Object> mapJd = asVar.jd();
            if (mapJd == null || !mapJd.containsKey(BidResponsed.KEY_PRICE)) {
                return;
            }
            mapJd.put(BidResponsed.KEY_PRICE, MBridgeConstans.ENDCARD_URL_TYPE_PL);
        }
    }
}
