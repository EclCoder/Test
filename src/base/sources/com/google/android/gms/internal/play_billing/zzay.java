package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzay extends zzau implements zzba {
    zzay(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    @Override // com.google.android.gms.internal.play_billing.zzba
    public final void zza(String str, String str2, zzbc zzbcVar) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        zzaw.zzc(parcelZzu, zzbcVar);
        zzx(1, parcelZzu);
    }
}
