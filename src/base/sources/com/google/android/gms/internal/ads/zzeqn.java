package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeqn implements zzelu {
    private final zzerr zza;
    private final zzdxc zzb;

    zzeqn(zzerr zzerrVar, zzdxc zzdxcVar) {
        this.zza = zzerrVar;
        this.zzb = zzdxcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelu
    public final zzelv zza(String str, JSONObject jSONObject) {
        zzbxb zzbxbVarZzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcp)).booleanValue()) {
            try {
                zzbxbVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Coundn't create RTB adapter: ", e10);
                zzbxbVarZzb = null;
            }
        } else {
            zzbxbVarZzb = this.zza.zzb(str);
        }
        if (zzbxbVarZzb == null) {
            return null;
        }
        return new zzelv(zzbxbVarZzb, new zzenh(), str);
    }
}
