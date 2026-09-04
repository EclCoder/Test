package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaja implements zzao {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzt zztVar = new zzt();
        zztVar.zzo(MimeTypes.APPLICATION_ID3);
        zztVar.zzO();
        zzt zztVar2 = new zzt();
        zztVar2.zzo(MimeTypes.APPLICATION_SCTE35);
        zztVar2.zzO();
    }

    public zzaja(String str, String str2, long j10, long j11, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaja.class == obj.getClass()) {
            zzaja zzajaVar = (zzaja) obj;
            if (this.zzc == zzajaVar.zzc && this.zzd == zzajaVar.zzd && Objects.equals(this.zza, zzajaVar.zza) && Objects.equals(this.zzb, zzajaVar.zzb) && Arrays.equals(this.zze, zzajaVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzf;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
        long j10 = this.zzc;
        int iHashCode2 = (((((iHashCode * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) this.zzd)) * 31) + Arrays.hashCode(this.zze);
        this.zzf = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        long j10 = this.zzd;
        int length = String.valueOf(j10).length();
        long j11 = this.zzc;
        int length2 = String.valueOf(j11).length();
        String str = this.zza;
        int length3 = str.length() + 18 + length + 13 + length2;
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length3 + 8 + str2.length());
        sb2.append("EMSG: scheme=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(j10);
        sb2.append(", durationMs=");
        sb2.append(j11);
        sb2.append(", value=");
        sb2.append(str2);
        return sb2.toString();
    }
}
