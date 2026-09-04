package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzati;
import com.google.android.gms.internal.ads.zzatn;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzbg implements zzati {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbi zzb;

    zzbg(zzbl zzblVar, String str, zzbi zzbiVar) {
        this.zza = str;
        this.zzb = zzbiVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzati
    public final void zza(zzatn zzatnVar) {
        String str = this.zza;
        String string = zzatnVar.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length());
        sb2.append("Failed to load URL: ");
        sb2.append(str);
        sb2.append("\n");
        sb2.append(string);
        String string2 = sb2.toString();
        int i10 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(string2);
        this.zzb.zza((Object) null);
    }
}
