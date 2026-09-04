package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzblt;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbni;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbnp;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzbsk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbo extends zzbee implements zzbq {
    zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() {
        zzbn zzblVar;
        Parcel parcelZzcZ = zzcZ(1, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzblVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzblVar = iInterfaceQueryLocalInterface instanceof zzbn ? (zzbn) iInterfaceQueryLocalInterface : new zzbl(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbh zzbhVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzbhVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbmz zzbmzVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(zzbnc zzbncVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(String str, zzbni zzbniVar, zzbnf zzbnfVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbeg.zze(parcelZza, zzbniVar);
        zzbeg.zze(parcelZza, zzbnfVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzblt zzbltVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzbltVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbnm zzbnmVar, zzr zzrVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzbnmVar);
        zzbeg.zzc(parcelZza, zzrVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(zzbnp zzbnpVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzbnpVar);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbsb zzbsbVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbsk zzbskVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, adManagerAdViewOptions);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcp zzcpVar) {
        throw null;
    }
}
