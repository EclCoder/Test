package com.google.android.gms.internal.ads;

import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzihx extends zziee implements zzifq {
    private static final zzihx zzd;
    private static volatile zzifx zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        zzihx zzihxVar = new zzihx();
        zzd = zzihxVar;
        zziee.zzbu(zzihx.class, zzihxVar);
    }

    private zzihx() {
    }

    public static zzihw zzc() {
        return (zzihw) zzd.zzbn();
    }

    final /* synthetic */ void zzd(int i10) {
        this.zza = i10;
    }

    final /* synthetic */ void zze(long j10) {
        this.zzb = j10;
    }

    final /* synthetic */ void zzg(long j10) {
        this.zzc = j10;
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
                                    synchronized (zzihx.class) {
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
                    return new zzihw(bArr);
                }
                return new zzihx();
            }
            return zziee.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{UHbHibBvYxKnPE.IFBtOjDIwF, "zzb", "zzc"});
        }
        return (byte) 1;
    }
}
