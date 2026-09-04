package com.google.android.gms.internal.auth;

import android.os.IInterface;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface zzat extends IInterface {
    void zzb(byte[] bArr);

    void zzc(DeviceMetaData deviceMetaData);

    void zzd(Status status);

    void zze();

    void zzf(Status status, com.google.android.gms.auth.api.accounttransfer.zzw zzwVar);

    void zzg(Status status, com.google.android.gms.auth.api.accounttransfer.zzo zzoVar);

    void zzh(Status status);
}
