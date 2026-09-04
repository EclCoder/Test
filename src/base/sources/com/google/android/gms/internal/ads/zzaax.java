package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaax extends zzaaq {
    private final boolean zze;
    private final zzaam zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final int zzv;

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzaax zzaaxVar, zzaax zzaaxVar2) {
        zzgvz zzgvzVarZza = zzgvz.zzg().zzd(zzaaxVar.zzh, zzaaxVar2.zzh).zza(Integer.valueOf(zzaaxVar.zzm), Integer.valueOf(zzaaxVar2.zzm), zzgyg.zzb().zza()).zzb(zzaaxVar.zzn, zzaaxVar2.zzn).zzb(zzaaxVar.zzo, zzaaxVar2.zzo).zza(Integer.valueOf(zzaaxVar.zzp), Integer.valueOf(zzaaxVar2.zzp), zzgyg.zzb().zza()).zzd(zzaaxVar.zzq, zzaaxVar2.zzq).zzb(zzaaxVar.zzr, zzaaxVar2.zzr).zzd(zzaaxVar.zzi, zzaaxVar2.zzi).zzd(zzaaxVar.zze, zzaaxVar2.zze).zzd(zzaaxVar.zzg, zzaaxVar2.zzg).zza(Integer.valueOf(zzaaxVar.zzl), Integer.valueOf(zzaaxVar2.zzl), zzgyg.zzb().zza());
        boolean z10 = zzaaxVar.zzt;
        zzgvz zzgvzVarZzd = zzgvzVarZza.zzd(z10, zzaaxVar2.zzt);
        boolean z11 = zzaaxVar.zzu;
        zzgvz zzgvzVarZzd2 = zzgvzVarZzd.zzd(z11, zzaaxVar2.zzu);
        if (z10 && z11) {
            zzgvzVarZzd2 = zzgvzVarZzd2.zzb(zzaaxVar.zzv, zzaaxVar2.zzv);
        }
        return zzgvzVarZzd2.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzaax zzaaxVar, zzaax zzaaxVar2) {
        zzgyg zzgygVarZza = (zzaaxVar.zze && zzaaxVar.zzh) ? zzaay.zzc : zzaay.zzc.zza();
        zzgvz zzgvzVarZzg = zzgvz.zzg();
        boolean z10 = zzaaxVar.zzf.zzF;
        return zzgvzVarZzg.zza(Integer.valueOf(zzaaxVar.zzk), Integer.valueOf(zzaaxVar2.zzk), zzgygVarZza).zza(Integer.valueOf(zzaaxVar.zzj), Integer.valueOf(zzaaxVar2.zzj), zzgygVarZza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final /* bridge */ /* synthetic */ boolean zzc(zzaaq zzaaqVar) {
        zzaax zzaaxVar = (zzaax) zzaaqVar;
        if (!Objects.equals(this.zzd.zzp, zzaaxVar.zzd.zzp)) {
            return false;
        }
        boolean z10 = this.zzf.zzN;
        return this.zzt == zzaaxVar.zzt && this.zzu == zzaaxVar.zzu;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0168  */
    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX WARN: Code duplicated, block: B:33:0x004d  */
    public zzaax(int i10, zzbg zzbgVar, int i11, zzaam zzaamVar, int i12, String str, int i13, boolean z10) {
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        int i15;
        int iZzj;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i16;
        boolean z18;
        zzv zzvVar;
        int i17;
        int i18;
        int i19;
        zzv zzvVar2;
        int i20;
        int i21;
        int i22;
        super(i10, zzbgVar, i11);
        this.zzf = zzaamVar;
        int i23 = 1;
        if (true != zzaamVar.zzM) {
            i14 = 16;
        } else {
            i14 = 24;
        }
        if (!z10 || (((i20 = (zzvVar2 = this.zzd).zzw) != -1 && i20 > zzaamVar.zza) || ((i21 = zzvVar2.zzx) != -1 && i21 > zzaamVar.zzb))) {
            z11 = false;
        } else {
            float f10 = zzvVar2.zzA;
            if ((f10 != -1.0f && f10 > zzaamVar.zzc) || ((i22 = zzvVar2.zzj) != -1 && i22 > zzaamVar.zzd)) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        this.zze = z11;
        if (!z10 || (((i17 = (zzvVar = this.zzd).zzw) != -1 && i17 < 0) || ((i18 = zzvVar.zzx) != -1 && i18 < 0))) {
            z12 = false;
        } else {
            float f11 = zzvVar.zzA;
            if ((f11 != -1.0f && f11 < 0.0f) || ((i19 = zzvVar.zzj) != -1 && i19 < 0)) {
                z12 = false;
            } else {
                z12 = true;
            }
        }
        this.zzg = z12;
        this.zzh = zznc.zzac(i12, false);
        zzv zzvVar3 = this.zzd;
        float f12 = zzvVar3.zzA;
        if (f12 != -1.0f && f12 >= 10.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.zzi = z13;
        this.zzj = zzvVar3.zzj;
        this.zzk = zzvVar3.zzc();
        int i24 = 0;
        while (true) {
            i15 = Integer.MAX_VALUE;
            if (i24 < zzaamVar.zzo.size()) {
                iZzj = zzaay.zzj(this.zzd, (String) zzaamVar.zzo.get(i24), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i24++;
                }
            } else {
                iZzj = 0;
                i24 = Integer.MAX_VALUE;
                break;
            }
        }
        this.zzm = i24;
        this.zzn = iZzj;
        this.zzo = zzaay.zzm(this.zzd.zzf, 0);
        int i25 = this.zzd.zzf;
        if (i25 == 0 || (i25 & 1) != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.zzq = z14;
        if (zzaay.zzi(str) == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.zzr = zzaay.zzj(this.zzd, str, z15);
        for (int i26 = 0; i26 < zzaamVar.zzm.size(); i26++) {
            String str2 = this.zzd.zzp;
            if (str2 != null && str2.equals(zzaamVar.zzm.get(i26))) {
                i15 = i26;
                break;
            }
        }
        this.zzl = i15;
        this.zzp = zzaay.zzn(this.zzd, zzaamVar.zzn);
        if ((i12 & 384) == 128) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.zzt = z16;
        if ((i12 & 64) == 64) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.zzu = z17;
        zzv zzvVar4 = this.zzd;
        String str3 = zzvVar4.zzp;
        if (str3 == null) {
            i16 = 0;
        } else {
            switch (str3.hashCode()) {
                case -1851077871:
                    i16 = !str3.equals("video/dolby-vision") ? 0 : 5;
                    break;
                case -1662735862:
                    i16 = !str3.equals("video/av01") ? 0 : 4;
                    break;
                case -1662541442:
                    i16 = !str3.equals(Saucuwx.TzFKQNQ) ? 0 : 3;
                    break;
                case 1331836730:
                    i16 = !str3.equals(MimeTypes.VIDEO_H264) ? 0 : 1;
                    break;
                case 1599127257:
                    i16 = !str3.equals(MimeTypes.VIDEO_VP9) ? 0 : 2;
                    break;
                default:
                    i16 = 0;
                    break;
            }
        }
        this.zzv = i16;
        if ((zzvVar4.zzf & 16384) != 0) {
            i23 = 0;
        } else {
            zzaam zzaamVar2 = this.zzf;
            if (!zznc.zzac(i12, zzaamVar2.zzV) || (!(z18 = this.zze) && !zzaamVar2.zzK)) {
                i23 = 0;
            } else if (zznc.zzac(i12, false) && this.zzg && z18 && zzvVar4.zzj != -1 && (i14 & i12) != 0) {
                i23 = 2;
            }
        }
        this.zzs = i23;
    }
}
