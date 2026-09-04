package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbmw;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e extends AdListener implements zzg, zze, zzd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f16288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final MediationNativeListener f16289b;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f16288a = abstractAdViewAdapter;
        this.f16289b = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.f16289b.onAdClicked(this.f16288a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f16289b.onAdClosed(this.f16288a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f16289b.onAdFailedToLoad(this.f16288a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f16289b.onAdImpression(this.f16288a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f16289b.onAdOpened(this.f16288a);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        this.f16289b.onAdLoaded(this.f16288a, new a(unifiedNativeAd));
    }

    @Override // com.google.android.gms.ads.formats.zze
    public final void zzb(zzbmw zzbmwVar) {
        this.f16289b.zzc(this.f16288a, zzbmwVar);
    }

    @Override // com.google.android.gms.ads.formats.zzd
    public final void zzc(zzbmw zzbmwVar, String str) {
        this.f16289b.zzd(this.f16288a, zzbmwVar, str);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }
}
