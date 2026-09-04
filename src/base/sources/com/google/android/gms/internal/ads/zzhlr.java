package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzhlr {
    private final zziaz zza;
    private final Class zzb;

    /* synthetic */ zzhlr(zziaz zziazVar, Class cls, byte[] bArr) {
        this.zza = zziazVar;
        this.zzb = cls;
    }

    public static zzhlr zzd(zzhlq zzhlqVar, zziaz zziazVar, Class cls) {
        return new zzhlp(zziazVar, cls, zzhlqVar);
    }

    public abstract zzhdq zza(zzhns zzhnsVar, zzhel zzhelVar);

    public final zziaz zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
