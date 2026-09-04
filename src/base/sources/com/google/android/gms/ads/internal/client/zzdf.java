package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbef;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzdf extends zzbef implements zzdg {
    public zzdf() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else {
            if (i10 != 2) {
                return false;
            }
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        }
        return true;
    }

    public static zzdg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(jyeoXJ.iCYJEvKGsICR);
        return iInterfaceQueryLocalInterface instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface : new zzde(iBinder);
    }
}
