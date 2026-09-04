package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzbyt extends zzbef implements zzbyu {
    public zzbyt() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbyu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof zzbyu ? (zzbyu) iInterfaceQueryLocalInterface : new zzbys(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                Intent intent = (Intent) zzbeg.zzb(parcel, Intent.CREATOR);
                zzbeg.zzh(parcel);
                zze(intent);
                break;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzbeg.zzh(parcel);
                zzf(iObjectWrapperAsInterface, string, string2);
                break;
            case 3:
                zzg();
                break;
            case 4:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbeg.zzh(parcel);
                zzh(iObjectWrapperAsInterface2);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbeg.zzh(parcel);
                zzi(strArrCreateStringArray, iArrCreateIntArray, iObjectWrapperAsInterface3);
                break;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) zzbeg.zzb(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
                zzbeg.zzh(parcel);
                zzj(iObjectWrapperAsInterface4, zzaVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
