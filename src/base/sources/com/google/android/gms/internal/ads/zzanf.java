package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzanf {
    public static void zza(zzang zzangVar, zzank zzankVar, zzdt zzdtVar) {
        for (int i10 = 0; i10 < zzangVar.zza(); i10++) {
            long jZzb = zzangVar.zzb(i10);
            List listZzc = zzangVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i10 == zzangVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzangVar.zzb(i10 + 1) - zzangVar.zzb(i10);
                if (jZzb2 > 0) {
                    zzdtVar.zza(new zzand(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
