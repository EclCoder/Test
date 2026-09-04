package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzicl implements zzifx {
    static {
        int i10 = zzido.zzb;
        int i11 = zzicn.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final /* synthetic */ Object zza(InputStream inputStream, zzido zzidoVar) throws zziet {
        zzigs zzigsVarZzaU;
        zzide zzideVarZzH = zzide.zzH(inputStream, 4096);
        zzifp zzifpVar = (zzifp) zzb(zzideVarZzH, zzidoVar);
        zzideVarZzH.zzb(0);
        if (zzifpVar == null || zzifpVar.zzbi()) {
            return zzifpVar;
        }
        if (zzifpVar instanceof zzicj) {
            zzigsVarZzaU = ((zzicj) zzifpVar).zzaU();
        } else {
            if (zzifpVar instanceof zzick) {
                throw null;
            }
            zzigsVarZzaU = new zzigs(zzifpVar);
        }
        throw zzigsVarZzaU.zza();
    }
}
