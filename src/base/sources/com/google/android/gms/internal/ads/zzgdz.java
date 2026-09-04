package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgdz extends zziee implements zzifq {
    private static final zzgdz zzl;
    private static volatile zzifx zzm;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzi;
    private boolean zzb = true;
    private long zze = TTAdConstant.AD_MAX_EVENT_TIME;
    private long zzf = 3600000;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";
    private long zzj = 5;
    private long zzk = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;

    static {
        zzgdz zzgdzVar = new zzgdz();
        zzl = zzgdzVar;
        zziee.zzbu(zzgdz.class, zzgdzVar);
    }

    private zzgdz() {
    }

    public static zzgdy zzi() {
        return (zzgdy) zzl.zzbn();
    }

    public static zzgdz zzj() {
        return zzl;
    }

    public final boolean zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zzl, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new zzgdz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgdy(bArr);
        }
        if (iOrdinal == 5) {
            return zzl;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifx zzifxVar = zzm;
        if (zzifxVar != null) {
            return zzifxVar;
        }
        synchronized (zzgdz.class) {
            try {
                zzidzVar = zzm;
                if (zzidzVar == null) {
                    zzidzVar = new zzidz(zzl);
                    zzm = zzidzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzidzVar;
    }

    public final boolean zze() {
        return this.zzi;
    }

    public final long zzg() {
        return this.zzj;
    }

    public final long zzh() {
        return this.zzk;
    }

    final /* synthetic */ void zzk(boolean z10) {
        this.zza |= 4;
        this.zzd = z10;
    }

    final /* synthetic */ void zzl(long j10) {
        this.zza |= 64;
        this.zzh = j10;
    }
}
