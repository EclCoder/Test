package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapo implements zzafy {
    private final zzapp zza;
    private final zzet zzb;
    private final zzet zzc;
    private final zzes zzd;
    private zzagb zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        int i10 = zzapn.zza;
    }

    public zzapo() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws EOFException, InterruptedIOException {
        zzet zzetVar;
        int i10 = 0;
        while (true) {
            zzetVar = this.zzc;
            zzafp zzafpVar = (zzafp) zzafzVar;
            zzafpVar.zzh(zzetVar.zzi(), 0, 10, false);
            zzetVar.zzh(0);
            if (zzetVar.zzx() != 4801587) {
                break;
            }
            zzetVar.zzk(3);
            int iZzG = zzetVar.zzG();
            i10 += iZzG + 10;
            zzafpVar.zzj(iZzG, false);
        }
        zzafzVar.zzl();
        zzafp zzafpVar2 = (zzafp) zzafzVar;
        zzafpVar2.zzj(i10, false);
        if (this.zzg == -1) {
            this.zzg = i10;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = i10;
        do {
            zzafpVar2.zzh(zzetVar.zzi(), 0, 2, false);
            zzetVar.zzh(0);
            if (zzapp.zzf(zzetVar.zzt())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                zzafpVar2.zzh(zzetVar.zzi(), 0, 4, false);
                zzes zzesVar = this.zzd;
                zzesVar.zzf(14);
                int iZzj = zzesVar.zzj(13);
                if (iZzj <= 6) {
                    i13++;
                    zzafzVar.zzl();
                    zzafpVar2.zzj(i13, false);
                } else {
                    zzafpVar2.zzj(iZzj - 6, false);
                    i12 += iZzj;
                }
            } else {
                i13++;
                zzafzVar.zzl();
                zzafpVar2.zzj(i13, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i13 - i10 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        this.zze = zzagbVar;
        this.zza.zzb(zzagbVar, new zzarh(Integer.MIN_VALUE, 0, 1));
        zzagbVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) {
        this.zze.getClass();
        zzet zzetVar = this.zzb;
        int iZza = zzafzVar.zza(zzetVar.zzi(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzw(new zzaha(C.TIME_UNSET, 0L));
            this.zzi = true;
        }
        if (iZza == -1) {
            return -1;
        }
        zzetVar.zzh(0);
        zzetVar.zzf(iZza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzetVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j11;
    }

    public zzapo(int i10) {
        this.zza = new zzapp(true, null, 0, MimeTypes.AUDIO_AAC);
        this.zzb = new zzet(2048);
        this.zzg = -1L;
        zzet zzetVar = new zzet(10);
        this.zzc = zzetVar;
        byte[] bArrZzi = zzetVar.zzi();
        this.zzd = new zzes(bArrZzi, bArrZzi.length);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }
}
