package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfze extends zzbef implements zzfzf {
    public zzfze() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                zzbeg.zzh(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzbeg.zzh(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzbeg.zzh(parcel);
                break;
            case 6:
                parcel.readInt();
                zzbeg.zzh(parcel);
                break;
            case 7:
                parcel.readInt();
                zzbeg.zzh(parcel);
                break;
            case 8:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzbeg.zzh(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
