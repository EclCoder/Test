package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzelq {
    private final Context zza;

    zzelq(Context context) {
        this.zza = context;
    }

    public final ListenableFuture zza(boolean z10) {
        try {
            androidx.privacysandbox.ads.adservices.topics.a aVarA = new androidx.privacysandbox.ads.adservices.topics.a.C0072a().b(MobileAds.ERROR_DOMAIN).c(z10).a();
            i4.a aVarA2 = i4.a.a(this.zza);
            return aVarA2 != null ? aVarA2.b(aVarA) : zzhbw.zzc(new IllegalStateException());
        } catch (Exception e10) {
            return zzhbw.zzc(e10);
        }
    }
}
