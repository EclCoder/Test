package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzu implements zzgta {
    static final /* synthetic */ zzu zza = new zzu();

    private /* synthetic */ zzu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final /* synthetic */ Object apply(Object obj) {
        zzx zzxVar = (zzx) obj;
        int i10 = zzv.zzP;
        String str = zzxVar.zza;
        String str2 = zzxVar.zzb;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(": ");
        sb2.append(str2);
        return sb2.toString();
    }
}
