package com.google.android.gms.internal.ads;

import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbdz extends zziee implements zzifq {
    private static final zzbdz zzf;
    private static volatile zzifx zzg;
    private int zza;
    private zzbed zzb;
    private zzida zzc = zzida.zza;
    private long zzd;
    private long zze;

    static {
        zzbdz zzbdzVar = new zzbdz();
        zzf = zzbdzVar;
        zziee.zzbu(zzbdz.class, zzbdzVar);
    }

    private zzbdz() {
    }

    public static zzbdz zzd() {
        return zzf;
    }

    public final zzbed zza() {
        zzbed zzbedVar = this.zzb;
        return zzbedVar == null ? zzbed.zzc() : zzbedVar;
    }

    public final zzida zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    byte[] bArr = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                zzifx zzifxVar = zzg;
                                if (zzifxVar == null) {
                                    synchronized (zzbdz.class) {
                                        try {
                                            zzidzVar = zzg;
                                            if (zzidzVar == null) {
                                                zzidzVar = new zzidz(zzf);
                                                zzg = zzidzVar;
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    return zzidzVar;
                                }
                                return zzifxVar;
                            }
                            throw null;
                        }
                        return zzf;
                    }
                    return new zzbdy(bArr);
                }
                return new zzbdz();
            }
            return zziee.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", obFGmWgqyy.uJaKhLKlF, "zzd", "zze"});
        }
        return (byte) 1;
    }
}
