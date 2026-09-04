package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzenv implements zzely {
    private final Context zza;
    private final zzdng zzb;

    public zzenv(Context context, zzdng zzdngVar) {
        this.zza = context;
        this.zzb = zzdngVar;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final void zza(zzfkq zzfkqVar, zzfkf zzfkfVar, zzelv zzelvVar) throws zzflf {
        try {
            zzbxb zzbxbVar = (zzbxb) zzelvVar.zzb;
            zzbxbVar.zzo(zzfkfVar.zzZ);
            zzbxbVar.zzj(zzfkfVar.zzU, zzfkfVar.zzv.toString(), zzfkqVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzenu(this, zzelvVar, null), (zzbvi) zzelvVar.zzc);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e10);
            throw new zzflf(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final /* bridge */ /* synthetic */ Object zzb(zzfkq zzfkqVar, zzfkf zzfkfVar, zzelv zzelvVar) {
        zzenq zzenqVar = new zzenq(zzfkfVar, (zzbxb) zzelvVar.zzb, AdFormat.INTERSTITIAL);
        zzdma zzdmaVarZzd = this.zzb.zzd(new zzcyj(zzfkqVar, zzfkfVar, zzelvVar.zza), new zzdmd(zzenqVar, null));
        zzenqVar.zzc(zzdmaVarZzd.zzd());
        ((zzenh) zzelvVar.zzc).zzc(zzdmaVarZzd.zzg());
        return zzdmaVarZzd.zzh();
    }
}
