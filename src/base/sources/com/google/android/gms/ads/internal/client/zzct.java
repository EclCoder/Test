package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbvb;
import com.google.android.gms.internal.ads.zzbvc;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzct extends zzbee implements zzcv {
    zzct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzbvc getAdapterCreator() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        zzbvc zzbvcVarZzf = zzbvb.zzf(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbvcVarZzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzez getLiteSdkVersion() {
        Parcel parcelZzcZ = zzcZ(1, zza());
        zzez zzezVar = (zzez) zzbeg.zzb(parcelZzcZ, zzez.CREATOR);
        parcelZzcZ.recycle();
        return zzezVar;
    }
}
