package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbxv implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbxx zza;

    zzbxv(zzbxx zzbxxVar) {
        Objects.requireNonNull(zzbxxVar);
        this.zza = zzbxxVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        zzbxx zzbxxVar = this.zza;
        Intent intentZzb = zzbxxVar.zzb();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzY(zzbxxVar.zzc(), intentZzb);
    }
}
