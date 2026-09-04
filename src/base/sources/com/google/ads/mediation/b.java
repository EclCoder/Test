package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b extends AdListener implements AppEventListener, zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f16282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final MediationBannerListener f16283b;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f16282a = abstractAdViewAdapter;
        this.f16283b = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.f16283b.onAdClicked(this.f16282a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f16283b.onAdClosed(this.f16282a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f16283b.onAdFailedToLoad(this.f16282a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f16283b.onAdLoaded(this.f16282a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f16283b.onAdOpened(this.f16282a);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f16283b.zza(this.f16282a, str, str2);
    }
}
