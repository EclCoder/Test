package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.PHx.jyeoXJ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfyc extends zziee implements zzifq {
    private static final zzfyc zzf;
    private static volatile zzifx zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private String zzd = "";
    private zzfxz zze;

    static {
        zzfyc zzfycVar = new zzfyc();
        zzf = zzfycVar;
        zziee.zzbu(zzfyc.class, zzfycVar);
    }

    private zzfyc() {
    }

    public static zzfya zza() {
        return (zzfya) zzf.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void zzc(zzfxz zzfxzVar) {
        zzfxzVar.getClass();
        this.zze = zzfxzVar;
        this.zza |= 8;
    }

    final /* synthetic */ void zze(int i10) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
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
                                    synchronized (zzfyc.class) {
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
                    return new zzfya(bArr);
                }
                return new zzfyc();
            }
            return zziee.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", zzfyb.zza, jyeoXJ.DEW, "zzd", "zze"});
        }
        return (byte) 1;
    }
}
