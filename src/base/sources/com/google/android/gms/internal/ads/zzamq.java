package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzamq extends zzamz {
    private zzagl zza;
    private zzamp zzb;

    zzamq() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    protected final void zza(boolean z10) {
        super.zza(z10);
        if (z10) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    protected final long zzb(zzet zzetVar) {
        if (!zzd(zzetVar.zzi())) {
            return -1L;
        }
        int i10 = (zzetVar.zzi()[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i10 == 6) {
            zzetVar.zzk(4);
            zzetVar.zzO();
        } else if (i10 == 7) {
            i10 = 7;
            zzetVar.zzk(4);
            zzetVar.zzO();
        }
        int iZzc = zzagg.zzc(zzetVar, i10);
        zzetVar.zzh(0);
        return iZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    protected final boolean zzc(zzet zzetVar, long j10, zzamx zzamxVar) {
        byte[] bArrZzi = zzetVar.zzi();
        zzagl zzaglVar = this.zza;
        if (zzaglVar == null) {
            zzagl zzaglVar2 = new zzagl(bArrZzi, 17);
            this.zza = zzaglVar2;
            zzt zztVarZza = zzaglVar2.zzc(Arrays.copyOfRange(bArrZzi, 9, zzetVar.zze()), null).zza();
            zztVarZza.zzn("audio/ogg");
            zzamxVar.zza = zztVarZza.zzO();
            return true;
        }
        if ((bArrZzi[0] & 127) == 3) {
            zzagk zzagkVarZzc = zzagi.zzc(zzetVar);
            zzagl zzaglVarZze = zzaglVar.zze(zzagkVarZzc);
            this.zza = zzaglVarZze;
            this.zzb = new zzamp(zzaglVarZze, zzagkVarZzc);
            return true;
        }
        if (!zzd(bArrZzi)) {
            return true;
        }
        zzamp zzampVar = this.zzb;
        if (zzampVar != null) {
            zzampVar.zzd(j10);
            zzamxVar.zzb = this.zzb;
        }
        zzamxVar.zza.getClass();
        return false;
    }
}
