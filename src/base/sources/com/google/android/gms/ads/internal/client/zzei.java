package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzei extends zzaz {
    final /* synthetic */ zzek zza;

    zzei(zzek zzekVar) {
        Objects.requireNonNull(zzekVar);
        this.zza = zzekVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzek zzekVar = this.zza;
        zzekVar.zzE().zza(zzekVar.zzz());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        zzek zzekVar = this.zza;
        zzekVar.zzE().zza(zzekVar.zzz());
        super.onAdLoaded();
    }
}
