package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzbne extends zzbef implements zzbnf {
    public zzbne() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzbnf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof zzbnf ? (zzbnf) iInterfaceQueryLocalInterface : new zzbnd(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbmv zzbmtVar;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzbmtVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zzbmtVar = iInterfaceQueryLocalInterface instanceof zzbmv ? (zzbmv) iInterfaceQueryLocalInterface : new zzbmt(strongBinder);
        }
        String string = parcel.readString();
        zzbeg.zzh(parcel);
        zze(zzbmtVar, string);
        parcel2.writeNoException();
        return true;
    }
}
