package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfmz implements zzfmx {
    private final String zza;

    public zzfmz(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfmx
    public final boolean equals(Object obj) {
        if (obj instanceof zzfmz) {
            return this.zza.equals(((zzfmz) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfmx
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
