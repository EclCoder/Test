package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzc;
import com.google.android.gms.ads.formats.zzh;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a extends UnifiedNativeAdMapper {
    public a(UnifiedNativeAd unifiedNativeAd) {
        setHeadline(unifiedNativeAd.zza());
        setImages(unifiedNativeAd.zzb());
        setBody(unifiedNativeAd.zzc());
        setIcon(unifiedNativeAd.zzd());
        setCallToAction(unifiedNativeAd.zze());
        setAdvertiser(unifiedNativeAd.zzf());
        setStarRating(unifiedNativeAd.zzg());
        setStore(unifiedNativeAd.zzh());
        setPrice(unifiedNativeAd.zzi());
        zzb(unifiedNativeAd.zzk());
        setOverrideImpressionRecording(true);
        setOverrideClickHandling(true);
        zza(unifiedNativeAd.zzj());
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        if ((view instanceof zzh) || ((zzc) zzc.zza.get(view)) != null) {
            throw null;
        }
    }
}
