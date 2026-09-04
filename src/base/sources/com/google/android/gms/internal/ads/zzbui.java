package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbui {
    static final com.google.android.gms.ads.internal.util.zzbc zza = new zzbug();
    static final com.google.android.gms.ads.internal.util.zzbc zzb = new zzbuh();
    private final zzbtu zzc;

    public zzbui(Context context, VersionInfoParcel versionInfoParcel, String str, zzfqj zzfqjVar) {
        this.zzc = new zzbtu(context, versionInfoParcel, str, zza, zzb, zzfqjVar);
    }

    public final zzbty zza(String str, zzbub zzbubVar, zzbua zzbuaVar) {
        return new zzbum(this.zzc, str, zzbubVar, zzbuaVar);
    }

    public final zzbur zzb() {
        return new zzbur(this.zzc);
    }

    public final void zzc() {
        this.zzc.zzc();
    }
}
