package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzajg extends zzajo implements zzaiv {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzajo[] zzg;

    public zzajg(String str, int i10, int i11, long j10, long j11, zzajo[] zzajoVarArr) {
        super(ChapterFrame.ID);
        zzgtj.zza(i10 <= i11);
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = j11;
        this.zzg = zzajoVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajg.class == obj.getClass()) {
            zzajg zzajgVar = (zzajg) obj;
            if (this.zzb == zzajgVar.zzb && this.zzc == zzajgVar.zzc && this.zzd == zzajgVar.zzd && this.zze == zzajgVar.zze && Objects.equals(this.zza, zzajgVar.zza) && Arrays.equals(this.zzg, zzajgVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb + 527;
        String str = this.zza;
        long j10 = this.zze;
        return (((((((i10 * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j10)) * 31) + str.hashCode();
    }
}
