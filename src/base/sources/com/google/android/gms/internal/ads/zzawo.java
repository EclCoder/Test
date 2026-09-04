package com.google.android.gms.internal.ads;

import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzawo extends zziee implements zzifq {
    private static final zzawo zzj;
    private static volatile zzifx zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private zzaxf zzg;
    private zzaxl zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        zzawo zzawoVar = new zzawo();
        zzj = zzawoVar;
        zziee.zzbu(zzawo.class, zzawoVar);
    }

    private zzawo() {
    }

    public static zzawn zze() {
        return (zzawn) zzj.zzbn();
    }

    public final String zza() {
        return this.zzd;
    }

    @Deprecated
    public final boolean zzb() {
        return this.zze;
    }

    public final zzaxf zzc() {
        zzaxf zzaxfVar = this.zzg;
        return zzaxfVar == null ? zzaxf.zzd() : zzaxfVar;
    }

    public final zzaxl zzd() {
        zzaxl zzaxlVar = this.zzh;
        return zzaxlVar == null ? zzaxl.zza() : zzaxlVar;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void zzh(boolean z10) {
        this.zza |= 8;
        this.zze = z10;
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
                                zzifx zzifxVar = zzk;
                                if (zzifxVar == null) {
                                    synchronized (zzawo.class) {
                                        try {
                                            zzidzVar = zzk;
                                            if (zzidzVar == null) {
                                                zzidzVar = new zzidz(zzj);
                                                zzk = zzidzVar;
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
                        return zzj;
                    }
                    return new zzawn(bArr);
                }
                return new zzawo();
            }
            return zziee.zzbv(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", zzawr.zza, "zzc", "zzd", "zze", "zzf", "zzg", Saucuwx.xtATwioXLMEiVOz, "zzi"});
        }
        return (byte) 1;
    }
}
