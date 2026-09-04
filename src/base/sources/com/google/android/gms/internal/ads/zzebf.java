package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzebf implements zzeau {
    private final long zza;
    private final zzetk zzb;

    zzebf(long j10, Context context, zzeay zzeayVar, zzcnj zzcnjVar, String str) {
        this.zza = j10;
        zzfik zzfikVarZzn = zzcnjVar.zzn();
        zzfikVarZzn.zzd(context);
        zzfikVarZzn.zzb(new com.google.android.gms.ads.internal.client.zzr());
        zzfikVarZzn.zzc(str);
        zzetk zzetkVarZza = zzfikVarZzn.zza().zza();
        this.zzb = zzetkVarZza;
        zzetkVarZza.zzdS(new zzebe(this, zzeayVar));
    }

    @Override // com.google.android.gms.internal.ads.zzeau
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zze(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeau
    public final void zzb() {
        this.zzb.zzR(ObjectWrapper.wrap(null));
    }

    @Override // com.google.android.gms.internal.ads.zzeau
    public final void zzc() {
        this.zzb.zzc();
    }

    final /* synthetic */ long zzd() {
        return this.zza;
    }
}
