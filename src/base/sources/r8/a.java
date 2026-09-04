package r8;

import android.util.Log;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import q8.j;
import q8.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends MBSplashLoadWithCodeListener implements MediationAppOpenAd, MBSplashShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final MediationAdLoadCallback f51144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected j f51145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected MediationAppOpenAdCallback f51146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected k f51147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final q8.a f51148e;

    protected a(MediationAdLoadCallback mediationAdLoadCallback, q8.a aVar) {
        this.f51144a = mediationAdLoadCallback;
        this.f51148e = aVar;
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onAdClicked(MBridgeIds mBridgeIds) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f51146c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onDismiss(MBridgeIds mBridgeIds, int i10) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f51146c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
        k kVar = this.f51147d;
        if (kVar != null) {
            kVar.onDestroy();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadWithCodeListener
    public void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i10, String str, int i11) {
        j jVar;
        if (this.f51148e.c() && (jVar = this.f51145b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(jVar);
        }
        AdError adErrorB = q8.e.b(i10, str);
        Log.d(MintegralMediationAdapter.TAG, adErrorB.toString());
        this.f51144a.onFailure(adErrorB);
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public void onLoadSuccessed(MBridgeIds mBridgeIds, int i10) {
        this.f51146c = (MediationAppOpenAdCallback) this.f51144a.onSuccess(this);
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onShowFailed(MBridgeIds mBridgeIds, String str) {
        j jVar;
        if (this.f51148e.c() && (jVar = this.f51145b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(jVar);
        }
        if (this.f51146c != null) {
            AdError adErrorB = q8.e.b(100, str);
            Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
            this.f51146c.onAdFailedToShow(adErrorB);
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onShowSuccessed(MBridgeIds mBridgeIds) {
        j jVar;
        if (this.f51148e.c() && (jVar = this.f51145b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(jVar);
        }
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f51146c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
            this.f51146c.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onZoomOutPlayFinish(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onZoomOutPlayStart(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public void isSupportZoomOut(MBridgeIds mBridgeIds, boolean z10) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onAdTick(MBridgeIds mBridgeIds, long j10) {
    }
}
