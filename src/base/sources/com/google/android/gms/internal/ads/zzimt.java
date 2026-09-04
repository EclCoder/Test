package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzimt implements zzind, zzimo {
    private static final Object zza = new Object();
    private volatile zzind zzb;
    private volatile Object zzc = zza;

    private zzimt(zzind zzindVar) {
        this.zzb = zzindVar;
    }

    public static zzind zza(zzind zzindVar) {
        return zzindVar instanceof zzimt ? zzindVar : new zzimt(zzindVar);
    }

    public static zzimo zzc(zzind zzindVar) {
        if (zzindVar instanceof zzimo) {
            return (zzimo) zzindVar;
        }
        zzindVar.getClass();
        return new zzimt(zzindVar);
    }

    private final synchronized Object zzd() {
        try {
            Object obj = this.zzc;
            Object obj2 = zza;
            if (obj != obj2) {
                return obj;
            }
            Object objZzb = this.zzb.zzb();
            Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != objZzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
            }
            this.zzc = objZzb;
            this.zzb = null;
            return objZzb;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzd() : obj;
    }
}
