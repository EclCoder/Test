package x8;

import android.text.TextUtils;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.h;
import com.vungle.ads.h0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b extends w8.b implements h {
    public b(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.vungle.b bVar) {
        super(mediationAdLoadCallback, bVar);
    }

    @Override // w8.b
    protected void d(h0 h0Var, MediationBannerAdConfiguration mediationBannerAdConfiguration) throws Throwable {
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        String watermark = mediationBannerAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            h0Var.getAdConfig().setWatermark(watermark);
        }
        h0Var.load(bidResponse);
    }
}
