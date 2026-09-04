package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzadq extends zzacd {
    private final zzadu zza;

    public zzadq(zzadu zzaduVar) {
        this.zza = zzaduVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzafj
    public final /* synthetic */ Object zzb(zzacv zzacvVar, zzadf zzadfVar) throws zzaeh {
        int i10 = zzadu.zzd;
        zzadu zzaduVarZzck = this.zza.zzck();
        try {
            zzafp zzafpVarZzb = zzafl.zza().zzb(zzaduVarZzck.getClass());
            zzafpVarZzb.zzg(zzaduVarZzck, zzacw.zza(zzacvVar), zzadfVar);
            zzafpVarZzb.zzk(zzaduVarZzck);
            return zzaduVarZzck;
        } catch (zzaeh e10) {
            if (e10.zzb()) {
                throw new zzaeh(e10);
            }
            throw e10;
        } catch (zzafy e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzaeh) {
                throw ((zzaeh) e12.getCause());
            }
            throw new zzaeh(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzaeh) {
                throw ((zzaeh) e13.getCause());
            }
            throw e13;
        }
    }
}
