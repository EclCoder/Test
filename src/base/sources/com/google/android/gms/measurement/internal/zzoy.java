package com.google.android.gms.measurement.internal;

import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzoy extends zzaz {
    final /* synthetic */ zzpg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzoy(zzpg zzpgVar, zzjg zzjgVar) {
        super(zzjgVar);
        Objects.requireNonNull(zzpgVar);
        this.zza = zzpgVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zza() {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzaX().zzg();
        String str = (String) zzpgVar.zzaz().pollFirst();
        if (str != null) {
            zzpgVar.zzaA(zzpgVar.zzba().elapsedRealtime());
            zzpgVar.zzaW().zzk().zzb("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            zzpg.zzaR(zzpgVar.zzaZ(), intent);
        }
        zzpgVar.zzaw();
    }
}
