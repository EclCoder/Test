package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzccz extends zzcce {
    private final String zza;
    private final int zzb;

    public zzccz(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final String zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final int zzf() {
        return this.zzb;
    }

    public zzccz(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }
}
