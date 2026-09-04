package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcen extends zzbee implements zzcep {
    zzcen(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final zzcem zze(IObjectWrapper iObjectWrapper, zzbvc zzbvcVar, int i10) {
        zzcem zzcekVar;
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzbeg.zze(parcelZza, zzbvcVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcekVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcekVar = iInterfaceQueryLocalInterface instanceof zzcem ? (zzcem) iInterfaceQueryLocalInterface : new zzcek(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcekVar;
    }
}
