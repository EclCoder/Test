package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzbc extends com.google.android.gms.internal.location.zzb implements zzbd {
    public zzbc() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static zzbd zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return iInterfaceQueryLocalInterface instanceof zzbd ? (zzbd) iInterfaceQueryLocalInterface : new zzbb(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzd((Location) com.google.android.gms.internal.location.zzc.zzb(parcel, Location.CREATOR));
        return true;
    }
}
