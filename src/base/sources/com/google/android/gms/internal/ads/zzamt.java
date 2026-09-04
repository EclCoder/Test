package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzamt {
    private final zzamu zza = new zzamu();
    private final zzet zzb = new zzet(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzamt() {
    }

    private final int zzf(int i10) {
        int i11;
        int i12 = 0;
        this.zzd = 0;
        do {
            int i13 = this.zzd;
            int i14 = i10 + i13;
            zzamu zzamuVar = this.zza;
            if (i14 >= zzamuVar.zzc) {
                break;
            }
            this.zzd = i13 + 1;
            i11 = zzamuVar.zzf[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final boolean zzb(zzafz zzafzVar) {
        if (this.zze) {
            this.zze = false;
            this.zzb.zza(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i10 = this.zzc;
            if (i10 < 0) {
                zzamu zzamuVar = this.zza;
                if (!zzamuVar.zzb(zzafzVar, -1L) || !zzamuVar.zzc(zzafzVar, true)) {
                    return false;
                }
                int iZzf = zzamuVar.zzd;
                if ((zzamuVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    iZzf += zzf(0);
                    i10 = this.zzd;
                } else {
                    i10 = 0;
                }
                if (!zzagc.zzd(zzafzVar, iZzf)) {
                    return false;
                }
                this.zzc = i10;
            }
            int iZzf2 = zzf(i10);
            int i11 = this.zzc + this.zzd;
            if (iZzf2 > 0) {
                zzet zzetVar = this.zzb;
                zzetVar.zzc(zzetVar.zze() + iZzf2);
                if (!zzagc.zzc(zzafzVar, zzetVar.zzi(), zzetVar.zze(), iZzf2)) {
                    return false;
                }
                zzetVar.zzf(zzetVar.zze() + iZzf2);
                this.zze = this.zza.zzf[i11 + (-1)] != 255;
            }
            if (i11 == this.zza.zzc) {
                i11 = -1;
            }
            this.zzc = i11;
        }
    }

    public final zzamu zzc() {
        return this.zza;
    }

    public final zzet zzd() {
        return this.zzb;
    }

    public final void zze() {
        zzet zzetVar = this.zzb;
        if (zzetVar.zzi().length == 65025) {
            return;
        }
        zzetVar.zzb(Arrays.copyOf(zzetVar.zzi(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, zzetVar.zze())), zzetVar.zze());
    }
}
