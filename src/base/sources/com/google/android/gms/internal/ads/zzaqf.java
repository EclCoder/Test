package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaqf implements zzapt {
    private final zzet zza;
    private final zzagv zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private zzahk zzf;
    private String zzg;
    private int zzh = 0;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaqf(String str, int i10, String str2) {
        zzet zzetVar = new zzet(4);
        this.zza = zzetVar;
        zzetVar.zzi()[0] = -1;
        this.zzb = new zzagv();
        this.zzn = C.TIME_UNSET;
        this.zzc = str;
        this.zzd = i10;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzk = false;
        this.zzn = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(zzagb zzagbVar, zzarh zzarhVar) {
        zzarhVar.zza();
        this.zzg = zzarhVar.zzc();
        this.zzf = zzagbVar.zzu(zzarhVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j10, int i10) {
        this.zzn = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzd(zzet zzetVar) {
        this.zzf.getClass();
        while (zzetVar.zzd() > 0) {
            int i10 = this.zzh;
            if (i10 == 0) {
                byte[] bArrZzi = zzetVar.zzi();
                int iZzg = zzetVar.zzg();
                int iZze = zzetVar.zze();
                while (true) {
                    if (iZzg >= iZze) {
                        zzetVar.zzh(iZze);
                        break;
                    }
                    int i11 = iZzg + 1;
                    byte b10 = bArrZzi[iZzg];
                    boolean z10 = (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255;
                    boolean z11 = this.zzk && (b10 & 224) == 224;
                    this.zzk = z10;
                    if (z11) {
                        zzetVar.zzh(i11);
                        this.zzk = false;
                        this.zza.zzi()[1] = bArrZzi[iZzg];
                        this.zzi = 2;
                        this.zzh = 1;
                        break;
                    }
                    iZzg = i11;
                }
            } else if (i10 != 1) {
                int iMin = Math.min(zzetVar.zzd(), this.zzm - this.zzi);
                this.zzf.zzc(zzetVar, iMin);
                int i12 = this.zzi + iMin;
                this.zzi = i12;
                if (i12 >= this.zzm) {
                    zzgtj.zzi(this.zzn != C.TIME_UNSET);
                    this.zzf.zze(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzl;
                    this.zzi = 0;
                    this.zzh = 0;
                }
            } else {
                int iMin2 = Math.min(zzetVar.zzd(), 4 - this.zzi);
                zzet zzetVar2 = this.zza;
                zzetVar.zzm(zzetVar2.zzi(), this.zzi, iMin2);
                int i13 = this.zzi + iMin2;
                this.zzi = i13;
                if (i13 >= 4) {
                    zzetVar2.zzh(0);
                    zzagv zzagvVar = this.zzb;
                    if (zzagvVar.zza(zzetVar2.zzB())) {
                        this.zzm = zzagvVar.zzc;
                        if (!this.zzj) {
                            this.zzl = (((long) zzagvVar.zzg) * 1000000) / ((long) zzagvVar.zzd);
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzg);
                            zztVar.zzn(this.zze);
                            zztVar.zzo(zzagvVar.zzb);
                            zztVar.zzp(4096);
                            zztVar.zzG(zzagvVar.zze);
                            zztVar.zzH(zzagvVar.zzd);
                            zztVar.zze(this.zzc);
                            zztVar.zzg(this.zzd);
                            this.zzf.zzA(zztVar.zzO());
                            this.zzj = true;
                        }
                        zzetVar2.zzh(0);
                        this.zzf.zzc(zzetVar2, 4);
                        this.zzh = 2;
                    } else {
                        this.zzi = 0;
                        this.zzh = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z10) {
    }
}
