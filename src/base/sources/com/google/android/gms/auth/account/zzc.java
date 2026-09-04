package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzc extends com.google.android.gms.internal.auth.zza implements zze {
    zzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zzd(zzb zzbVar, String str) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.auth.zzc.zzd(parcelZza, zzbVar);
        parcelZza.writeString(str);
        zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zze(zzb zzbVar, Account account) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.auth.zzc.zzd(parcelZza, zzbVar);
        com.google.android.gms.internal.auth.zzc.zzc(parcelZza, account);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zzf(boolean z10) {
        Parcel parcelZza = zza();
        int i10 = com.google.android.gms.internal.auth.zzc.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzc(1, parcelZza);
    }
}
