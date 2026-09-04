package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbca implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzbcb zza;

    zzbca(zzbcb zzbcbVar) {
        Objects.requireNonNull(zzbcbVar);
        this.zza = zzbcbVar;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        if (z10) {
            zzbcb zzbcbVar = this.zza;
            zzbcbVar.zze(System.currentTimeMillis());
            zzbcbVar.zzh(true);
            return;
        }
        zzbcb zzbcbVar2 = this.zza;
        long jZzf = zzbcbVar2.zzf();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jZzf > 0 && jCurrentTimeMillis >= zzbcbVar2.zzf()) {
            zzbcbVar2.zzg(jCurrentTimeMillis - zzbcbVar2.zzf());
        }
        zzbcbVar2.zzh(false);
    }
}
