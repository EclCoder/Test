package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzbvk extends zzbef implements zzbvl {
    public zzbvk() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzbvl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return iInterfaceQueryLocalInterface instanceof zzbvl ? (zzbvl) iInterfaceQueryLocalInterface : new zzbvj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            IObjectWrapper iObjectWrapperZze = zze();
            parcel2.writeNoException();
            zzbeg.zze(parcel2, iObjectWrapperZze);
        } else {
            if (i10 != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            int i12 = zzbeg.zza;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }
}
