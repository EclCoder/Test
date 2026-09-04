package com.google.android.gms.internal.measurement;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzacd implements zzafj {
    static {
        int i10 = zzadf.zzb;
        int i11 = zzacf.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzafj
    public final /* synthetic */ Object zza(InputStream inputStream, zzadf zzadfVar) throws zzaeh {
        zzafy zzafyVar;
        zzacv zzacvVarZzM = zzacv.zzM(inputStream, 4096);
        zzafc zzafcVar = (zzafc) zzb(zzacvVarZzM, zzadfVar);
        zzacvVarZzM.zzb(0);
        if (zzafcVar == null || zzafcVar.zzcJ()) {
            return zzafcVar;
        }
        if (zzafcVar instanceof zzacb) {
            zzafyVar = new zzafy((zzacb) zzafcVar);
        } else {
            if (zzafcVar instanceof zzacc) {
                throw null;
            }
            zzafyVar = new zzafy(zzafcVar);
        }
        throw zzafyVar.zza();
    }
}
