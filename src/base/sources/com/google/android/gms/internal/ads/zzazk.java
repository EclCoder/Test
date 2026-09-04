package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzazk implements PackageManager$OnChecksumsReadyListener {
    final zzhcp zza = zzhcp.zze();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zza("");
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ApkChecksum apkChecksumA = c.a(list.get(i10));
                if (apkChecksumA.getType() == 8) {
                    zzhcp zzhcpVar = this.zza;
                    zzgzh zzgzhVarZzi = zzgzh.zzn().zzi();
                    byte[] value = apkChecksumA.getValue();
                    zzhcpVar.zza(zzgzhVarZzi.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zza("");
    }
}
