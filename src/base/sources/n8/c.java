package n8;

import android.content.Context;
import android.util.Log;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.ads.mediation.inmobi.g;
import com.google.ads.mediation.inmobi.j;
import com.google.ads.mediation.inmobi.n;
import com.google.ads.mediation.inmobi.p;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends NativeAdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final MediationNativeAdConfiguration f46929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final MediationAdLoadCallback f46930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f46931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediationNativeAdCallback f46932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f46933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.google.ads.mediation.inmobi.b f46934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f46935g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends VideoEventListener {
        a() {
        }

        @Override // com.inmobi.ads.listeners.VideoEventListener
        public void onVideoCompleted(InMobiNative inMobiNative) {
            super.onVideoCompleted(inMobiNative);
            Log.d(InMobiMediationAdapter.TAG, "InMobi native ad video has completed.");
            MediationNativeAdCallback mediationNativeAdCallback = c.this.f46932d;
            if (mediationNativeAdCallback != null) {
                mediationNativeAdCallback.onVideoComplete();
            }
        }

        @Override // com.inmobi.ads.listeners.VideoEventListener
        public void onVideoSkipped(InMobiNative inMobiNative) {
            super.onVideoSkipped(inMobiNative);
            Log.d(InMobiMediationAdapter.TAG, "InMobi native ad video has been skipped.");
        }
    }

    public c(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, j jVar, com.google.ads.mediation.inmobi.b bVar) {
        this.f46929a = mediationNativeAdConfiguration;
        this.f46930b = mediationAdLoadCallback;
        this.f46933e = jVar;
        this.f46934f = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Context context, long j10) {
        n nVarD = this.f46934f.d(context, Long.valueOf(j10), this);
        this.f46931c = nVarD;
        nVarD.n(new a());
        com.google.ads.mediation.inmobi.d.h();
        com.google.ads.mediation.inmobi.d.a(this.f46929a.getMediationExtras());
        b(this.f46931c);
    }

    protected abstract void b(n nVar);

    @Override // com.inmobi.ads.listeners.AdEventListener
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onAdImpression(InMobiNative inMobiNative) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi native ad has logged an impression.");
        MediationNativeAdCallback mediationNativeAdCallback = this.f46932d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onAdLoadFailed(InMobiNative inMobiNative, InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError adErrorB = g.b(com.google.ads.mediation.inmobi.d.f(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        Log.w(InMobiMediationAdapter.TAG, adErrorB.toString());
        this.f46930b.onFailure(adErrorB);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onAdLoadSucceeded(InMobiNative inMobiNative, AdMetaInfo adMetaInfo) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi native ad has been loaded.");
        NativeAdOptions nativeAdOptions = this.f46929a.getNativeAdOptions();
        p pVar = new p(this.f46934f.e(inMobiNative), Boolean.valueOf(nativeAdOptions != null ? nativeAdOptions.shouldReturnUrlsForImageAssets() : false), this.f46930b, this);
        this.f46935g = pVar;
        pVar.c(this.f46929a.getContext());
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onAdClicked(InMobiNative inMobiNative) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi native ad has been clicked.");
        MediationNativeAdCallback mediationNativeAdCallback = this.f46932d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onAdFullScreenDismissed(InMobiNative inMobiNative) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi native ad has been dismissed.");
        MediationNativeAdCallback mediationNativeAdCallback = this.f46932d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onAdFullScreenDisplayed(InMobiNative inMobiNative) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi native ad has been displayed.");
        MediationNativeAdCallback mediationNativeAdCallback = this.f46932d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onUserWillLeaveApplication(InMobiNative inMobiNative) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi native ad has caused the user to leave the application.");
        MediationNativeAdCallback mediationNativeAdCallback = this.f46932d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }
}
