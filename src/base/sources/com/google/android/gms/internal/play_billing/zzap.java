package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.android.vending.billing.IInAppBillingService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzap extends zzau implements zzar {
    zzap(IBinder iBinder) {
        super(iBinder, IInAppBillingService.DESCRIPTOR);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final int zza(int i10, String str, String str2) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(3);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        Parcel parcelZzv = zzv(5, parcelZzu);
        int i11 = parcelZzv.readInt();
        parcelZzv.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final int zzb(int i10, String str, String str2) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(i10);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        Parcel parcelZzv = zzv(1, parcelZzu);
        int i11 = parcelZzv.readInt();
        parcelZzv.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final int zzc(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(i10);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        zzaw.zzb(parcelZzu, bundle);
        Parcel parcelZzv = zzv(10, parcelZzu);
        int i11 = parcelZzv.readInt();
        parcelZzv.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle zzd(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(9);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        zzaw.zzb(parcelZzu, bundle);
        Parcel parcelZzv = zzv(902, parcelZzu);
        Bundle bundle2 = (Bundle) zzaw.zza(parcelZzv, Bundle.CREATOR);
        parcelZzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle zze(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(9);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        zzaw.zzb(parcelZzu, bundle);
        Parcel parcelZzv = zzv(12, parcelZzu);
        Bundle bundle2 = (Bundle) zzaw.zza(parcelZzv, Bundle.CREATOR);
        parcelZzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle zzf(int i10, String str, String str2, String str3, String str4) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(3);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        parcelZzu.writeString(str3);
        parcelZzu.writeString(null);
        Parcel parcelZzv = zzv(3, parcelZzu);
        Bundle bundle = (Bundle) zzaw.zza(parcelZzv, Bundle.CREATOR);
        parcelZzv.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle zzg(int i10, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(i10);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        parcelZzu.writeString(str3);
        parcelZzu.writeString(null);
        zzaw.zzb(parcelZzu, bundle);
        Parcel parcelZzv = zzv(8, parcelZzu);
        Bundle bundle2 = (Bundle) zzaw.zza(parcelZzv, Bundle.CREATOR);
        parcelZzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle zzh(int i10, String str, String str2, String str3) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(3);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        parcelZzu.writeString(str3);
        Parcel parcelZzv = zzv(4, parcelZzu);
        Bundle bundle = (Bundle) zzaw.zza(parcelZzv, Bundle.CREATOR);
        parcelZzv.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle zzi(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(i10);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        parcelZzu.writeString(str3);
        zzaw.zzb(parcelZzu, bundle);
        Parcel parcelZzv = zzv(11, parcelZzu);
        Bundle bundle2 = (Bundle) zzaw.zza(parcelZzv, Bundle.CREATOR);
        parcelZzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle zzj(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(i10);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        zzaw.zzb(parcelZzu, bundle);
        zzaw.zzb(parcelZzu, bundle2);
        Parcel parcelZzv = zzv(901, parcelZzu);
        Bundle bundle3 = (Bundle) zzaw.zza(parcelZzv, Bundle.CREATOR);
        parcelZzv.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzk(int i10, String str, Bundle bundle, zzx zzxVar) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(21);
        parcelZzu.writeString(str);
        zzaw.zzb(parcelZzu, bundle);
        zzaw.zzc(parcelZzu, zzxVar);
        zzx(1501, parcelZzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzl(int i10, String str, Bundle bundle, zzz zzzVar) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(22);
        parcelZzu.writeString(str);
        zzaw.zzb(parcelZzu, bundle);
        zzaw.zzc(parcelZzu, zzzVar);
        zzx(1801, parcelZzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzm(Bundle bundle, zzac zzacVar) {
        Parcel parcelZzu = zzu();
        zzaw.zzb(parcelZzu, bundle);
        zzaw.zzc(parcelZzu, zzacVar);
        zzx(2001, parcelZzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzn(int i10, String str, Bundle bundle, zzae zzaeVar) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(i10);
        parcelZzu.writeString(str);
        zzaw.zzb(parcelZzu, bundle);
        zzaw.zzc(parcelZzu, zzaeVar);
        zzx(1601, parcelZzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzo(int i10, String str, Bundle bundle, zzag zzagVar) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(18);
        parcelZzu.writeString(str);
        zzaw.zzb(parcelZzu, bundle);
        zzaw.zzc(parcelZzu, zzagVar);
        zzw(1301, parcelZzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzp(int i10, String str, Bundle bundle, zzai zzaiVar) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(i10);
        parcelZzu.writeString(str);
        zzaw.zzb(parcelZzu, bundle);
        zzaw.zzc(parcelZzu, zzaiVar);
        zzx(1901, parcelZzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzq(int i10, String str, Bundle bundle, zzak zzakVar) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(25);
        parcelZzu.writeString(str);
        zzaw.zzb(parcelZzu, bundle);
        zzaw.zzc(parcelZzu, zzakVar);
        zzx(2101, parcelZzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzr(int i10, String str, Bundle bundle, zzam zzamVar) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(21);
        parcelZzu.writeString(str);
        zzaw.zzb(parcelZzu, bundle);
        zzaw.zzc(parcelZzu, zzamVar);
        zzx(1401, parcelZzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzs(int i10, String str, Bundle bundle, zzao zzaoVar) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(24);
        parcelZzu.writeString(str);
        zzaw.zzb(parcelZzu, bundle);
        zzaw.zzc(parcelZzu, zzaoVar);
        zzx(1701, parcelZzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void zzt(int i10, String str, Bundle bundle, zzat zzatVar) {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(12);
        parcelZzu.writeString(str);
        zzaw.zzb(parcelZzu, bundle);
        zzaw.zzc(parcelZzu, zzatVar);
        zzw(1201, parcelZzu);
    }
}
