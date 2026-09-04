package r8;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.api.client.http.HttpStatusCodes;
import com.mbridge.msdk.out.BannerAdWithCodeListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends BannerAdWithCodeListener implements MediationBannerAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final MediationAdLoadCallback f51149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected MBBannerView f51150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected MediationBannerAdCallback f51151c;

    public b(MediationAdLoadCallback mediationAdLoadCallback) {
        this.f51149a = mediationAdLoadCallback;
    }

    public static BannerSize a(AdSize adSize, Context context, boolean z10, q8.b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AdSize(Sdk$SDKError.b.WEBVIEW_ERROR_VALUE, 50));
        arrayList.add(new AdSize(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES, 250));
        arrayList.add(new AdSize(728, 90));
        AdSize adSizeA = bVar.a(context, adSize, arrayList);
        BannerSize bannerSize = null;
        if (adSizeA == null) {
            if (z10) {
            }
            return bannerSize;
        }
        adSize = adSizeA;
        bannerSize = adSize.equals(AdSize.BANNER) ? new BannerSize(4, 0, 0) : null;
        if (adSize.equals(AdSize.MEDIUM_RECTANGLE)) {
            bannerSize = new BannerSize(2, 0, 0);
        }
        if (adSize.equals(AdSize.LEADERBOARD)) {
            bannerSize = new BannerSize(3, adSize.getWidth(), 0);
        }
        if (bannerSize == null) {
            return new BannerSize(5, adSize.getWidth(), adSize.getHeight());
        }
        return bannerSize;
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void closeFullScreen(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f51151c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f51150b;
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onClick(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f51151c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onCloseBanner(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f51151c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onLeaveApp(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f51151c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdWithCodeListener
    public void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        AdError adErrorB = q8.e.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        this.f51149a.onFailure(adErrorB);
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onLoadSuccessed(MBridgeIds mBridgeIds) {
        MediationAdLoadCallback mediationAdLoadCallback = this.f51149a;
        if (mediationAdLoadCallback != null) {
            this.f51151c = (MediationBannerAdCallback) mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onLogImpression(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f51151c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void showFullScreen(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f51151c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }
}
