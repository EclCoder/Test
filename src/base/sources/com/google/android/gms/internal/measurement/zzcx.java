package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzcx extends zzbm implements zzcy {
    public zzcx() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
            long j10 = parcel.readLong();
            zzbn.zzf(parcel);
            zze(string, string2, bundle, j10);
            parcel2.writeNoException();
        } else {
            if (i10 != 2) {
                return false;
            }
            int iZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeInt(iZzf);
        }
        return true;
    }
}
