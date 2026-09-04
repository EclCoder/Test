package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzasw {
    private final String zza;
    private final String zzb;

    public zzasw(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzasw.class == obj.getClass()) {
            zzasw zzaswVar = (zzasw) obj;
            if (TextUtils.equals(this.zza, zzaswVar.zza) && TextUtils.equals(this.zzb, zzaswVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        sb2.append("Header[name=");
        sb2.append(str);
        sb2.append(",value=");
        sb2.append(str2);
        sb2.append("]");
        return sb2.toString();
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
