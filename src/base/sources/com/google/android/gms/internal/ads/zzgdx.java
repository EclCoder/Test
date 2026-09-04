package com.google.android.gms.internal.ads;

import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgdx extends zziee implements zzifq {
    private static final zzgdx zzf;
    private static volatile zzifx zzg;
    private int zza;
    private float zzc;
    private String zzb = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long zzd = 1000;
    private long zze = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;

    static {
        zzgdx zzgdxVar = new zzgdx();
        zzf = zzgdxVar;
        zziee.zzbu(zzgdx.class, zzgdxVar);
    }

    private zzgdx() {
    }

    public static zzgdw zze() {
        return (zzgdw) zzf.zzbn();
    }

    public static zzgdx zzg() {
        return zzf;
    }

    public final String zza() {
        return this.zzb;
    }

    public final float zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zze;
    }

    final /* synthetic */ void zzh(float f10) {
        this.zza |= 2;
        this.zzc = f10;
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
                                    synchronized (zzgdx.class) {
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
                    return new zzgdw(bArr);
                }
                return new zzgdx();
            }
            return zziee.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", giNWGaNAgVQoO.jdafPPTIRWxLO, "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
