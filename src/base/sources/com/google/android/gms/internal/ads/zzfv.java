package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfv implements zzao {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x003c A[PHI: r8
      0x003c: PHI (r8v13 int) = (r8v0 int), (r8v16 int) binds: [B:17:0x0032, B:21:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public zzfv(String str, byte[] bArr, int i10, int i11) {
        byte b10;
        boolean z10 = true;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    if (i11 != 23) {
                        z10 = false;
                    } else if (bArr.length == 4) {
                        i11 = 23;
                    } else {
                        i11 = 23;
                        z10 = false;
                    }
                    zzgtj.zza(z10);
                }
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    if (i11 != 75) {
                        z10 = false;
                    } else if (bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                        i11 = 75;
                    } else {
                        i11 = 75;
                        z10 = false;
                    }
                    zzgtj.zza(z10);
                }
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    if (i11 != 78) {
                        z10 = false;
                    } else if (bArr.length == 8) {
                        i11 = 78;
                    } else {
                        i11 = 78;
                        z10 = false;
                    }
                    zzgtj.zza(z10);
                }
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    if (i11 != 78) {
                        z10 = false;
                    } else if (bArr.length == 8) {
                        i11 = 78;
                    } else {
                        i11 = 78;
                        z10 = false;
                    }
                    zzgtj.zza(z10);
                }
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    zzgtj.zza(i11 == 0);
                }
                break;
        }
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfv.class == obj.getClass()) {
            zzfv zzfvVar = (zzfv) obj;
            if (this.zza.equals(zzfvVar.zza) && Arrays.equals(this.zzb, zzfvVar.zzb) && this.zzc == zzfvVar.zzc && this.zzd == zzfvVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    public final String toString() {
        String string;
        int i10 = this.zzd;
        if (i10 != 0) {
            if (i10 == 1) {
                string = zzfl.zzj(this.zzb);
            } else if (i10 == 23) {
                string = String.valueOf(Float.intBitsToFloat(zzhah.zzd(this.zzb)));
            } else if (i10 == 67) {
                string = String.valueOf(zzhah.zzd(this.zzb));
            } else if (i10 == 75) {
                string = String.valueOf(f.a(this.zzb[0]));
            } else if (i10 != 78) {
                byte[] bArr = this.zzb;
                String str = zzfl.zza;
                string = zzgzh.zzn().zzi().zzj(bArr, 0, bArr.length);
            } else {
                string = String.valueOf(new zzet(this.zzb).zzJ());
            }
        } else if (this.zza.equals("auxiliary.tracks.map")) {
            List listZzb = zzb();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("track types = ");
            zzgtd.zzb(sb2, listZzb, ",");
            string = sb2.toString();
        } else {
            byte[] bArr2 = this.zzb;
            String str2 = zzfl.zza;
            string = zzgzh.zzn().zzi().zzj(bArr2, 0, bArr2.length);
        }
        String str3 = this.zza;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 18 + String.valueOf(string).length());
        sb3.append("mdta: key=");
        sb3.append(str3);
        sb3.append(", value=");
        sb3.append(string);
        return sb3.toString();
    }

    public final List zzb() {
        zzgtj.zzj(this.zza.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.zzb;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        return arrayList;
    }
}
