package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfw implements zzao {
    public final int zza;

    public zzfw(int i10) {
        this.zza = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzfw) && this.zza == ((zzfw) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final String toString() {
        int i10 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 19);
        sb2.append("Mp4AlternateGroup: ");
        sb2.append(i10);
        return sb2.toString();
    }
}
