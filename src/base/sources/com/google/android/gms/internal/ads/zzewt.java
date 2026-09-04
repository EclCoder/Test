package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzewt implements zzfck {
    private final zzfhe zza;

    zzewt(zzfhe zzfheVar) {
        this.zza = zzfheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        zzfhe zzfheVar = this.zza;
        if (zzfheVar == null) {
            return zzhbw.zza(new zzews(null));
        }
        String strZza = zzfheVar.zza();
        return Strings.isEmptyOrWhitespace(strZza) ? zzhbw.zza(new zzews(null)) : zzhbw.zza(new zzews(strZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 15;
    }
}
