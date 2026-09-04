package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcje extends zzcja {
    public zzcje(zzchn zzchnVar) {
        super(zzchnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final boolean zze(String str) {
        String strZzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str);
        zzchn zzchnVar = (zzchn) this.zzc.get();
        if (zzchnVar != null && strZzg != null) {
            zzchnVar.zzt(strZzg, this);
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("VideoStreamNoopCache is doing nothing.");
        zzq(str, strZzg, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final void zzl() {
    }
}
