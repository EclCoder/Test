package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzetn {
    private final zzets zza;
    private final String zzb;
    private com.google.android.gms.ads.internal.client.zzdx zzc;

    public zzetn(zzets zzetsVar, String str) {
        this.zza = zzetsVar;
        this.zzb = str;
    }

    public final synchronized boolean zza() {
        return this.zza.zzb();
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, int i10) {
        this.zzc = null;
        zzett zzettVar = new zzett(i10);
        zzetm zzetmVar = new zzetm(this);
        this.zza.zza(zzmVar, this.zzb, zzettVar, zzetmVar);
    }

    public final synchronized String zzc() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar;
        try {
            zzdxVar = this.zzc;
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return zzdxVar != null ? zzdxVar.zze() : null;
    }

    public final synchronized String zzd() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar;
        try {
            zzdxVar = this.zzc;
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return zzdxVar != null ? zzdxVar.zze() : null;
    }

    final /* synthetic */ void zze(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zzc = zzdxVar;
    }
}
