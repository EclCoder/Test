package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzacg {
    public int zza;
    public long zzb;
    public Object zzc;
    public final zzadf zzd;
    public int zze;

    zzacg() {
        int i10 = zzadf.zzb;
        int i11 = zzacf.zza;
        this.zzd = zzadf.zza;
    }

    static /* synthetic */ String zza(int i10, int i11, byte b10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + b10 + String.valueOf(i10).length());
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
        sb2.append(i10);
        return sb2.toString();
    }

    zzacg(zzadf zzadfVar) {
        zzadfVar.getClass();
        this.zzd = zzadfVar;
    }
}
