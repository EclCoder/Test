package n8;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.ads.mediation.inmobi.e;
import com.google.ads.mediation.inmobi.g;
import com.google.ads.mediation.inmobi.j;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends BannerAdEventListener implements MediationBannerAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final MediationAdLoadCallback f46919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected j f46920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediationBannerAdCallback f46921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.ads.mediation.inmobi.c f46922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.ads.mediation.inmobi.b f46923e;

    public a(MediationAdLoadCallback mediationAdLoadCallback, j jVar, com.google.ads.mediation.inmobi.b bVar) {
        this.f46919a = mediationAdLoadCallback;
        this.f46920b = jVar;
        this.f46923e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Context context, AdSize adSize, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        com.google.ads.mediation.inmobi.d.h();
        com.google.ads.mediation.inmobi.d.a(mediationBannerAdConfiguration.getMediationExtras());
        e eVarB = this.f46923e.b(context, Long.valueOf(com.google.ads.mediation.inmobi.d.g(mediationBannerAdConfiguration.getServerParameters())));
        eVarB.e(Boolean.FALSE);
        eVarB.d(InMobiBanner.AnimationType.ANIMATION_OFF);
        eVarB.i(this);
        String watermark = mediationBannerAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            eVarB.j(new WatermarkData(watermark, 0.3f));
        }
        com.google.ads.mediation.inmobi.c cVarA = this.f46923e.a(context);
        this.f46922d = cVarA;
        cVarA.c(new FrameLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context)));
        eVarB.h(new LinearLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context)));
        this.f46922d.a(eVarB);
        b(eVarB, mediationBannerAdConfiguration);
    }

    protected abstract void b(e eVar, MediationBannerAdConfiguration mediationBannerAdConfiguration);

    @Override // com.inmobi.ads.listeners.AdEventListener
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onAdClicked(InMobiBanner inMobiBanner, Map map) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f46921c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onAdImpression(InMobiBanner inMobiBanner) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f46921c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onAdLoadFailed(InMobiBanner inMobiBanner, InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError adErrorB = g.b(com.google.ads.mediation.inmobi.d.f(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        Log.w(InMobiMediationAdapter.TAG, adErrorB.toString());
        this.f46919a.onFailure(adErrorB);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onAdLoadSucceeded(InMobiBanner inMobiBanner, AdMetaInfo adMetaInfo) {
        this.f46921c = (MediationBannerAdCallback) this.f46919a.onSuccess(this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f46922d.b();
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onAdDismissed(InMobiBanner inMobiBanner) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f46921c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onAdDisplayed(InMobiBanner inMobiBanner) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f46921c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onUserLeftApplication(InMobiBanner inMobiBanner) {
        this.f46921c.onAdLeftApplication();
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onRewardsUnlocked(InMobiBanner inMobiBanner, Map map) {
    }
}
