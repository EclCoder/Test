package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaaf {
    private final zzabn zza;
    private final String zzb;

    public zzaaf(zzabn zzabnVar, String str) {
        zzabr.zza(zzabnVar, "parser");
        this.zza = zzabnVar;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaaf) {
            zzaaf zzaafVar = (zzaaf) obj;
            if (this.zza.equals(zzaafVar.zza) && this.zzb.equals(zzaafVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return str.hashCode() ^ this.zza.hashCode();
    }

    public final zzabn zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
