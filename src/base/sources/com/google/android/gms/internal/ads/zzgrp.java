package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgrp extends zzgqn {
    final /* synthetic */ zzgrr zza;
    private final zzgrw zzb;

    zzgrp(zzgrr zzgrrVar, zzgrw zzgrwVar) {
        Objects.requireNonNull(zzgrrVar);
        this.zza = zzgrrVar;
        this.zzb = zzgrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqo
    public final void zzb(Bundle bundle) {
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i11 = bundle.getInt("uiMode", 0);
        zzgru zzgruVarZzd = zzgrv.zzd();
        zzgruVarZzd.zza(i10);
        if (string != null) {
            zzgruVarZzd.zzb(string);
        }
        zzgruVarZzd.zzc(i11);
        this.zzb.zza(zzgruVarZzd.zzd());
        if (i10 == 8157) {
            this.zza.zzd();
        }
    }
}
