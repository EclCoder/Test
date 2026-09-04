package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgqb implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzgqd zza;

    zzgqb(zzgqd zzgqdVar) {
        Objects.requireNonNull(zzgqdVar);
        this.zza = zzgqdVar;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        zzgqd zzgqdVar = this.zza;
        synchronized (zzgqdVar) {
            try {
                if (z10) {
                    zzgqdVar.zzg(System.currentTimeMillis());
                    zzgqdVar.zzj(true);
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzgqdVar.zzh() > 0 && jCurrentTimeMillis >= zzgqdVar.zzh()) {
                        zzgqdVar.zzi(jCurrentTimeMillis - zzgqdVar.zzh());
                    }
                    zzgqdVar.zzj(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
