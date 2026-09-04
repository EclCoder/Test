package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzw extends zzai {
    final Map zza;
    private final zzj zzb;

    public zzw(zzj zzjVar) {
        super("require");
        this.zza = new HashMap();
        this.zzb = zzjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(zzg zzgVar, List list) {
        zzao zzaoVar;
        zzh.zza("require", 1, list);
        String strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
        Map map = this.zza;
        if (map.containsKey(strZzc)) {
            return (zzao) map.get(strZzc);
        }
        Map map2 = this.zzb.zza;
        if (map2.containsKey(strZzc)) {
            try {
                zzaoVar = (zzao) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
            }
        } else {
            zzaoVar = zzao.zzf;
        }
        if (zzaoVar instanceof zzai) {
            this.zza.put(strZzc, (zzai) zzaoVar);
        }
        return zzaoVar;
    }
}
