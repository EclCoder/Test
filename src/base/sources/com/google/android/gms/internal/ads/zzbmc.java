package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbmc extends zzbee implements zzbme {
    zzbmc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final IObjectWrapper zzb() {
        Parcel parcelZzcZ = zzcZ(1, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final Uri zzc() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        Uri uri = (Uri) zzbeg.zzb(parcelZzcZ, Uri.CREATOR);
        parcelZzcZ.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final double zzd() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        double d10 = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final int zze() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        int i10 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final int zzf() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        int i10 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final Map zzg() {
        Parcel parcelZzcZ = zzcZ(6, zza());
        HashMap mapZzg = zzbeg.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return mapZzg;
    }
}
