package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapl implements zzafy {
    private final zzapm zza = new zzapm(null, 0, "audio/ac4");
    private final zzet zzb = new zzet(16384);
    private boolean zzc;

    static {
        int i10 = zzapk.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws EOFException, InterruptedIOException {
        int i10;
        zzet zzetVar = new zzet(10);
        int i11 = 0;
        while (true) {
            zzafp zzafpVar = (zzafp) zzafzVar;
            zzafpVar.zzh(zzetVar.zzi(), 0, 10, false);
            zzetVar.zzh(0);
            if (zzetVar.zzx() != 4801587) {
                break;
            }
            zzetVar.zzk(3);
            int iZzG = zzetVar.zzG();
            i11 += iZzG + 10;
            zzafpVar.zzj(iZzG, false);
        }
        zzafzVar.zzl();
        zzafp zzafpVar2 = (zzafp) zzafzVar;
        zzafpVar2.zzj(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            zzafpVar2.zzh(zzetVar.zzi(), 0, 7, false);
            zzetVar.zzh(0);
            int iZzt = zzetVar.zzt();
            if (iZzt == 44096 || iZzt == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArrZzi = zzetVar.zzi();
                int i15 = zzafb.zza;
                if (bArrZzi.length < 7) {
                    i10 = -1;
                } else {
                    int i16 = ((bArrZzi[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArrZzi[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    if (i16 == 65535) {
                        i16 = ((bArrZzi[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArrZzi[5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArrZzi[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    } else {
                        i14 = 4;
                    }
                    if (iZzt == 44097) {
                        i14 += 2;
                    }
                    i10 = i16 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                zzafpVar2.zzj(i10 - 7, false);
            } else {
                zzafzVar.zzl();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                zzafpVar2.zzj(i13, false);
                i12 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        this.zza.zzb(zzagbVar, new zzarh(Integer.MIN_VALUE, 0, 1));
        zzagbVar.zzv();
        zzagbVar.zzw(new zzaha(C.TIME_UNSET, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) {
        zzet zzetVar = this.zzb;
        int iZza = zzafzVar.zza(zzetVar.zzi(), 0, 16384);
        if (iZza == -1) {
            return -1;
        }
        zzetVar.zzh(0);
        zzetVar.zzf(iZza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzetVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        this.zzc = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }
}
