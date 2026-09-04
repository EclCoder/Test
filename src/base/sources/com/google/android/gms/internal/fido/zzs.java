package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzs extends zza implements IInterface {
    zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzr zzrVar, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        Parcel parcelZza = zza();
        int i10 = zzc.zza;
        parcelZza.writeStrongBinder(zzrVar);
        zzc.zzd(parcelZza, publicKeyCredentialCreationOptions);
        zzb(1, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzr zzrVar, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        Parcel parcelZza = zza();
        int i10 = zzc.zza;
        parcelZza.writeStrongBinder(zzrVar);
        zzc.zzd(parcelZza, publicKeyCredentialRequestOptions);
        zzb(2, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zze zzeVar) {
        Parcel parcelZza = zza();
        int i10 = zzc.zza;
        parcelZza.writeStrongBinder(zzeVar);
        zzb(3, parcelZza);
    }
}
