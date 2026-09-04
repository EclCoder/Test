package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzhlu {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzhlu(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhlu zzd(zzhlt zzhltVar, Class cls, Class cls2) {
        return new zzhls(cls, cls2, zzhltVar);
    }

    public abstract zzhns zza(zzhdq zzhdqVar, zzhel zzhelVar);

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
