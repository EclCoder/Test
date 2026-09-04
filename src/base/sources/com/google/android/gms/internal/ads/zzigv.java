package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzigv extends zzigt {
    zzigv() {
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* bridge */ /* synthetic */ void zza(Object obj, int i10, long j10) {
        ((zzigu) obj).zzk(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* bridge */ /* synthetic */ void zzb(Object obj, int i10, int i11) {
        ((zzigu) obj).zzk((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* bridge */ /* synthetic */ void zzc(Object obj, int i10, long j10) {
        ((zzigu) obj).zzk((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* bridge */ /* synthetic */ void zzd(Object obj, int i10, zzida zzidaVar) {
        ((zzigu) obj).zzk((i10 << 3) | 2, zzidaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* bridge */ /* synthetic */ void zze(Object obj, int i10, Object obj2) {
        ((zzigu) obj).zzk((i10 << 3) | 3, (zzigu) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* synthetic */ Object zzf() {
        return zzigu.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* synthetic */ Object zzg(Object obj) {
        zzigu zziguVar = (zzigu) obj;
        zziguVar.zzd();
        return zziguVar;
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* bridge */ /* synthetic */ Object zzh(Object obj) {
        zziee zzieeVar = (zziee) obj;
        zzigu zziguVar = zzieeVar.zzt;
        if (zziguVar != zzigu.zza()) {
            return zziguVar;
        }
        zzigu zziguVarZzb = zzigu.zzb();
        zzieeVar.zzt = zziguVarZzb;
        return zziguVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zziee) obj).zzt = (zzigu) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzigt
    final void zzj(Object obj) {
        ((zziee) obj).zzt.zzd();
    }
}
