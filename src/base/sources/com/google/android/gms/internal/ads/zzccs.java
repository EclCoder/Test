package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzccs implements RewardItem {
    private final zzccf zza;

    public zzccs(zzccf zzccfVar) {
        this.zza = zzccfVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzccf zzccfVar = this.zza;
        if (zzccfVar != null) {
            try {
                return zzccfVar.zzf();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getAmount to RewardItem", e10);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzccf zzccfVar = this.zza;
        if (zzccfVar != null) {
            try {
                return zzccfVar.zze();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getType to RewardItem", e10);
            }
        }
        return null;
    }
}
