package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.PHx.jyeoXJ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhui extends zziee implements zzifq {
    private static final zzhui zzd;
    private static volatile zzifx zze;
    private int zza;
    private int zzb;
    private zzhuk zzc;

    static {
        zzhui zzhuiVar = new zzhui();
        zzd = zzhuiVar;
        zziee.zzbu(zzhui.class, zzhuiVar);
    }

    private zzhui() {
    }

    public static zzhui zzc(zzida zzidaVar, zzido zzidoVar) {
        return (zzhui) zziee.zzbT(zzd, zzidaVar, zzidoVar);
    }

    public static zzhuh zzd() {
        return (zzhuh) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhuk zzb() {
        zzhuk zzhukVar = this.zzc;
        return zzhukVar == null ? zzhuk.zzc() : zzhukVar;
    }

    final /* synthetic */ void zze(zzhuk zzhukVar) {
        zzhukVar.getClass();
        this.zzc = zzhukVar;
        this.zza |= 1;
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
                                zzifx zzifxVar = zze;
                                if (zzifxVar == null) {
                                    synchronized (zzhui.class) {
                                        try {
                                            zzidzVar = zze;
                                            if (zzidzVar == null) {
                                                zzidzVar = new zzidz(zzd);
                                                zze = zzidzVar;
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
                        return zzd;
                    }
                    return new zzhuh(bArr);
                }
                return new zzhui();
            }
            return zziee.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{jyeoXJ.pnXXYQQbUe, "zzb", "zzc"});
        }
        return (byte) 1;
    }
}
