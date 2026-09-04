package r8;

import android.content.Context;
import android.util.Log;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeAdWithCodeListener;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class e extends NativeAdWithCodeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected MediationAdLoadCallback f51165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f51166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f51167c;

    public e(d dVar, Context context, MediationAdLoadCallback mediationAdLoadCallback) {
        this.f51167c = context;
        this.f51166b = dVar;
        this.f51165a = mediationAdLoadCallback;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f51166b.f51159c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.f51166b.f51159c.onAdLeftApplication();
        }
    }

    @Override // com.mbridge.msdk.out.NativeAdWithCodeListener
    public void onAdLoadErrorWithCode(int i10, String str) {
        AdError adErrorB = q8.e.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        this.f51165a.onFailure(adErrorB);
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List list, int i10) {
        if (list == null || list.size() == 0) {
            AdError adErrorA = q8.e.a(104, "Mintegral SDK failed to return a native ad.");
            Log.w(MintegralMediationAdapter.TAG, adErrorA.toString());
            this.f51165a.onFailure(adErrorA);
        } else {
            this.f51166b.a((Campaign) list.get(0), this.f51167c);
            d dVar = this.f51166b;
            dVar.f51159c = (MediationNativeAdCallback) this.f51165a.onSuccess(dVar);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i10) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f51166b.f51159c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List list) {
    }
}
