package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaiz implements zzao {
    public final long zza;

    public zzaiz(long j10) {
        this.zza = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzaiz.class == obj.getClass() && this.zza == ((zzaiz) obj).zza;
    }

    public final int hashCode() {
        return Long.hashCode(this.zza) + 527;
    }

    public final String toString() {
        long j10 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 38);
        sb2.append("ThumbnailMetadata: presentationTimeUs=");
        sb2.append(j10);
        return sb2.toString();
    }
}
