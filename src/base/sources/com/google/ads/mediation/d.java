package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d extends FullScreenContentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f16286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final MediationInterstitialListener f16287b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f16286a = abstractAdViewAdapter;
        this.f16287b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f16287b.onAdClosed(this.f16286a);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f16287b.onAdOpened(this.f16286a);
    }
}
