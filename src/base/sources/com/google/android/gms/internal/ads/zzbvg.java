package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbvg extends zzbee implements zzbvi {
    zzbvg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zze() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzf() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzg(int i10) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzh() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzi() {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzj() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzk() {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzl(String str, String str2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzm(zzbmv zzbmvVar, String str) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzbmvVar);
        parcelZza.writeString(str);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzn() {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzo() {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzp(zzccb zzccbVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzq() {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzr(zzccf zzccfVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzccfVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzs(int i10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzt() {
        zzda(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzu() {
        zzda(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzv(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzw(int i10, String str) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        parcelZza.writeString(str);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzeVar);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzeVar);
        zzda(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzz() {
        zzda(25, zza());
    }
}
