package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzedi extends AdListener {
    final /* synthetic */ zzedo zza;

    zzedi(zzedo zzedoVar) {
        Objects.requireNonNull(zzedoVar);
        this.zza = zzedoVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zza.zzg(zzedo.zzm(loadAdError));
    }
}
