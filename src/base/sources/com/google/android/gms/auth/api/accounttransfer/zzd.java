package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzd extends zzj {
    final /* synthetic */ zze zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzd(zze zzeVar, zzl zzlVar) {
        super(zzlVar);
        this.zza = zzeVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzb(byte[] bArr) {
        this.zza.zzb.setResult(bArr);
    }
}
