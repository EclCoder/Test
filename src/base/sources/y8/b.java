package y8;

import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.h0;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends w8.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.vungle.b vungleFactory) {
        super(mediationAdLoadCallback, vungleFactory);
        s.h(mediationAdLoadCallback, "mediationAdLoadCallback");
        s.h(vungleFactory, "vungleFactory");
    }

    @Override // w8.b
    protected void d(h0 bannerAdView, MediationBannerAdConfiguration mediationBannerAdConfiguration) throws Throwable {
        s.h(bannerAdView, "bannerAdView");
        s.h(mediationBannerAdConfiguration, "mediationBannerAdConfiguration");
        bannerAdView.load((String) null);
    }
}
