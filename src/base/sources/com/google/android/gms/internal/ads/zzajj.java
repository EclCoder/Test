package com.google.android.gms.internal.ads;

import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzajj extends zzajo {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public zzajj(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajj.class == obj.getClass()) {
            zzajj zzajjVar = (zzajj) obj;
            if (Objects.equals(this.zza, zzajjVar.zza) && Objects.equals(this.zzb, zzajjVar.zzb) && Objects.equals(this.zzc, zzajjVar.zzc) && Arrays.equals(this.zzd, zzajjVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((((((str != null ? str.hashCode() : 0) + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzb;
        int length3 = length + 11 + length2 + 11 + str3.length();
        String str4 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length3 + 14 + str4.length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(mTFeqtajA.swQCKc);
        sb2.append(str3);
        sb2.append(", description=");
        sb2.append(str4);
        return sb2.toString();
    }
}
