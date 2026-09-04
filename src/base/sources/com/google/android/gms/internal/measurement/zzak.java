package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface zzak {
    static zzao zzu(zzak zzakVar, zzao zzaoVar, zzg zzgVar, List list) {
        if (zzakVar.zzj(zzaoVar.zzc())) {
            zzao zzaoVarZzk = zzakVar.zzk(zzaoVar.zzc());
            if (zzaoVarZzk instanceof zzai) {
                return ((zzai) zzaoVarZzk).zza(zzgVar, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", zzaoVar.zzc()));
        }
        if (!"hasOwnProperty".equals(zzaoVar.zzc())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", zzaoVar.zzc()));
        }
        zzh.zza("hasOwnProperty", 1, list);
        return zzakVar.zzj(zzgVar.zza((zzao) list.get(0)).zzc()) ? zzao.zzk : zzao.zzl;
    }

    static Iterator zzv(Map map) {
        return new zzaj(map.keySet().iterator());
    }

    boolean zzj(String str);

    zzao zzk(String str);

    void zzm(String str, zzao zzaoVar);
}
