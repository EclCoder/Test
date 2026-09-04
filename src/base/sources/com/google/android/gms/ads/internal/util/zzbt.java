package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcfr;
import com.google.android.gms.internal.ads.zzfrt;
import com.google.android.gms.internal.ads.zzfru;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbt extends zzb {
    private final com.google.android.gms.ads.internal.util.client.zzu zza;
    private final String zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;

    public zzbt(Context context, String str, String str2, zzfru zzfruVar, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = new com.google.android.gms.ads.internal.util.client.zzu(context, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
        this.zzb = str2;
        this.zzc = zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        if (zzvVar == null) {
            this.zza.zzc(this.zzb, null);
        } else {
            new zzfrt(zzvVar.zza(), this.zza, zzcfr.zze, null, null).zza(this.zzb);
        }
    }
}
