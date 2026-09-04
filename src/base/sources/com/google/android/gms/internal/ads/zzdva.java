package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdva extends zzdul implements zzdky {
    private zzdky zza;

    @Override // com.google.android.gms.internal.ads.zzdky
    public final synchronized void zzdR() {
        zzdky zzdkyVar = this.zza;
        if (zzdkyVar != null) {
            zzdkyVar.zzdR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final synchronized void zzdu() {
        zzdky zzdkyVar = this.zza;
        if (zzdkyVar != null) {
            zzdkyVar.zzdu();
        }
    }

    protected final synchronized void zzn(com.google.android.gms.ads.internal.client.zza zzaVar, zzbog zzbogVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzboi zzboiVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, zzdky zzdkyVar) throws Throwable {
        try {
            try {
                super.zzm(zzaVar, zzbogVar, zzrVar, zzboiVar, zzadVar);
                this.zza = zzdkyVar;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }
}
