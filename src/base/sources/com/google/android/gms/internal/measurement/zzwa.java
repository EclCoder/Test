package com.google.android.gms.internal.measurement;

import com.google.common.collect.g0;
import java.util.UUID;
import java.util.function.Consumer;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzwa extends zzwb {
    zzwa() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzwb
    public final zzwi zza(String str, zzxd zzxdVar) {
        zzws zzwsVar;
        boolean z10;
        zzwq zzwqVar;
        zzws zzwsVarZzg;
        zzwl zzwlVar = zzwk.zza;
        p.o(zzxdVar);
        zzwq zzwqVarZzd = zzvy.zzd();
        zzws zzwsVar2 = zzwqVarZzd.zzb;
        final Exception exc = null;
        if (zzwsVar2 == zzwg.zza) {
            zzvy.zzc(zzwqVarZzd, null);
            z10 = true;
            zzwsVar = null;
        } else {
            zzwsVar = zzwsVar2;
            z10 = false;
        }
        if (zzwsVar == null) {
            final UUID uuidZzc = zzvz.zza().zzc();
            String strZzcL = zzvn.zzcL(uuidZzc);
            zzvq zzvqVar = zzwd.zza;
            g0 g0VarZza = zzvy.zza();
            if (!g0VarZza.isEmpty()) {
                g0VarZza.forEach(new Consumer(uuidZzc, exc) { // from class: com.google.android.gms.internal.measurement.zzwe
                    @Override // java.util.function.Consumer
                    public final /* synthetic */ void accept(Object obj) {
                        ((zzwu) obj).zza();
                    }
                });
            }
            zzwqVar = zzwqVarZzd;
            zzwsVarZzg = new zzwf(uuidZzc, strZzcL, str, zzwlVar, zzvqVar, false, false, zzwqVar);
        } else {
            zzwqVar = zzwqVarZzd;
            zzwsVarZzg = zzwsVar instanceof zzvs ? ((zzvs) zzwsVar).zzg(str, zzwlVar, false, zzwqVar) : zzwsVar.zzj(str, "", "", 0, zzwlVar, zzwqVar);
        }
        zzvy.zzc(zzwqVar, zzwsVarZzg);
        return new zzwi(zzwsVarZzg, z10);
    }
}
