package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgqq extends zzgqy {
    private final String zza;
    private final String zzb;

    /* synthetic */ zzgqq(String str, String str2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgqy) {
            zzgqy zzgqyVar = (zzgqy) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzgqyVar.zza()) : zzgqyVar.zza() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzgqyVar.zzb()) : zzgqyVar.zzb() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgqy
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgqy
    public final String zzb() {
        return this.zzb;
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        sb2.append("OverlayDisplayDismissRequest{sessionToken=");
        sb2.append(str);
        sb2.append(vHmGJpUTWNVV.eayEG);
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
