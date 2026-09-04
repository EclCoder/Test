package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbdb extends zzbdf {
    public zzbdb(zzbbs zzbbsVar, String str, String str2, zzaxm zzaxmVar, int i10, int i11) {
        super(zzbbsVar, "GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", zzaxmVar, i10, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() {
        zzaxm zzaxmVar = this.zzd;
        zzaxmVar.zzae(3);
        boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (zzaxmVar) {
            try {
                if (zBooleanValue) {
                    zzaxmVar.zzae(2);
                } else {
                    zzaxmVar.zzae(1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
