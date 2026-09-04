package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccr;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzey extends com.google.android.gms.ads.preload.zzb {
    public zzey(Context context) {
        super(context, AdFormat.REWARDED);
    }

    public final RewardedAd zza(String str) {
        zzcci zzcciVarZzq;
        try {
            zzcciVarZzq = this.zza.zzq(str);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            zzcciVarZzq = null;
        }
        if (zzcciVarZzq == null) {
            return null;
        }
        return new zzccr(zzj(), zzcciVarZzq);
    }
}
