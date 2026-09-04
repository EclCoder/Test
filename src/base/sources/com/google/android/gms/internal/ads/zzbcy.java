package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcy extends zzbdf {
    public zzbcy(zzbbs zzbbsVar, String str, String str2, zzaxm zzaxmVar, int i10, int i11) {
        super(zzbbsVar, "Qz9CKMoDCHphOXPELo049qp61nrfn738aUeATKOiX7hq+kw0ujtW3xI/vlQKBh37", "bze+wYBAHEMh8JSXqo0+D4B3Aq+R4fX2jHr7eo7ufbY=", zzaxmVar, i10, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() {
        zzaxm zzaxmVar = this.zzd;
        synchronized (zzaxmVar) {
            zzbbn zzbbnVar = new zzbbn((String) this.zze.invoke(null, null));
            zzaxmVar.zzF(zzbbnVar.zza.longValue());
            zzaxmVar.zzG(zzbbnVar.zzb.longValue());
        }
    }
}
