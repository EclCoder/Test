package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbeg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdy extends zzbee implements zzea {
    zzdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zze() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzf() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzg(boolean z10) {
        Parcel parcelZza = zza();
        int i10 = zzbeg.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzh() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzi() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        int i10 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzj() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzl(zzed zzedVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzedVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzm() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzn() {
        Parcel parcelZzcZ = zzcZ(10, zza());
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final zzed zzo() {
        zzed zzebVar;
        Parcel parcelZzcZ = zzcZ(11, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzebVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzebVar = iInterfaceQueryLocalInterface instanceof zzed ? (zzed) iInterfaceQueryLocalInterface : new zzeb(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzebVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzp() {
        Parcel parcelZzcZ = zzcZ(12, zza());
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzq() {
        zzda(13, zza());
    }
}
