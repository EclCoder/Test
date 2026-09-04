package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcjj extends zzcja implements zzchd {
    public static final /* synthetic */ int zzd = 0;
    private zzche zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcis zzi;
    private long zzj;
    private long zzk;

    public zzcjj(zzchn zzchnVar, zzchm zzchmVar) {
        super(zzchnVar);
        zzckc zzckcVar = new zzckc(zzchnVar.getContext(), zzchmVar, (zzchn) this.zzc.get(), null);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        this.zze = zzckcVar;
        zzckcVar.zzs(this);
    }

    protected static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzg(str)));
    }

    private final void zzd(long j10) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        }, j10);
    }

    private static String zzx(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        sb2.append(str);
        sb2.append("/");
        sb2.append(canonicalName);
        sb2.append(":");
        sb2.append(message);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcja, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzche zzcheVar = this.zze;
        if (zzcheVar != null) {
            zzcheVar.zzs(null);
            this.zze.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzD() {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache onRenderedFirstFrame");
    }

    public final zzche zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzs(null);
        zzche zzcheVar = this.zze;
        this.zze = null;
        return zzcheVar;
    }

    final /* synthetic */ void zzb() {
        long j10;
        long j11;
        long j12;
        String strZzc = zzc(this.zzf);
        try {
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzal)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzw)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcB)).booleanValue();
            synchronized (this) {
                if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj > jLongValue) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                    sb2.append("Timeout reached. Limit: ");
                    sb2.append(jLongValue);
                    sb2.append(" ms");
                    throw new IOException(sb2.toString());
                }
                if (this.zzg) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!this.zzh) {
                    if (!this.zze.zzB()) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long jZzH = this.zze.zzH();
                    if (jZzH > 0) {
                        long jZzN = this.zze.zzN();
                        if (jZzN != this.zzk) {
                            boolean z10 = jZzN > 0;
                            j11 = jZzH;
                            j12 = jZzN;
                            j10 = jIntValue;
                            zzm(this.zzf, strZzc, j12, j11, z10, zBooleanValue ? this.zze.zzI() : -1L, zBooleanValue ? this.zze.zzJ() : -1L, zBooleanValue ? this.zze.zzK() : -1L, zzche.zzP(), zzche.zzQ());
                            this.zzk = j12;
                        } else {
                            j10 = jIntValue;
                            j11 = jZzH;
                            j12 = jZzN;
                        }
                        if (j12 >= j11) {
                            zzp(this.zzf, strZzc, j11);
                        } else if (this.zze.zzO() >= j10 && j12 > 0) {
                        }
                    }
                    zzd(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzam)).longValue());
                    return;
                }
                com.google.android.gms.ads.internal.zzt.zzB().zzd(this.zzi);
            }
        } catch (Exception e10) {
            String str = this.zzf;
            String message = e10.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb3.append("Failed to preload url ");
            sb3.append(str);
            sb3.append(" Exception: ");
            sb3.append(message);
            String string = sb3.toString();
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(this.zzf, strZzc, "error", zzx("error", e10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final boolean zze(String str) {
        return zzf(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final boolean zzf(String str, String[] strArr) {
        long j10;
        long j11;
        long j12;
        long j13;
        this.zzf = str;
        String strZzc = zzc(str);
        String str2 = " ms";
        String str3 = "Timeout reached. Limit: ";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzchn zzchnVar = (zzchn) this.zzc.get();
            if (zzchnVar != null) {
                zzchnVar.zzt(strZzc, this);
            }
            Clock clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
            long jCurrentTimeMillis = clockZzk.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzam)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzal)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzw)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcB)).booleanValue();
            long j14 = -1;
            while (true) {
                synchronized (this) {
                    if (clockZzk.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                        long j15 = jLongValue2;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(j15).length() + 27);
                        sb2.append(str3);
                        sb2.append(j15);
                        sb2.append(str2);
                        throw new IOException(sb2.toString());
                    }
                    if (this.zzg) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (!this.zzh) {
                        if (!this.zze.zzB()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jZzH = this.zze.zzH();
                        if (jZzH > 0) {
                            long jZzN = this.zze.zzN();
                            if (jZzN != j14) {
                                long j16 = jLongValue;
                                j12 = jZzH;
                                j11 = j16;
                                j13 = jZzN;
                                zzm(str, strZzc, j13, j12, jZzN > 0, zBooleanValue ? this.zze.zzI() : -1L, zBooleanValue ? this.zze.zzJ() : -1L, zBooleanValue ? this.zze.zzK() : -1L, zzche.zzP(), zzche.zzQ());
                                j14 = j13;
                            } else {
                                j11 = jLongValue;
                                j12 = jZzH;
                                j13 = jZzN;
                            }
                            if (j13 >= j12) {
                                zzp(str, strZzc, j12);
                            } else if (this.zze.zzO() < jIntValue || j13 <= 0) {
                                j10 = j11;
                            }
                        } else {
                            str2 = str2;
                            str3 = str3;
                            jLongValue2 = jLongValue2;
                            jIntValue = jIntValue;
                            j10 = jLongValue;
                        }
                        try {
                            wait(j10);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    }
                    return true;
                }
                return true;
                jLongValue = j10;
                str2 = str2;
                jLongValue2 = jLongValue2;
                jIntValue = jIntValue;
                str3 = str3;
                clockZzk = clockZzk;
            }
        } catch (Exception e10) {
            String message = e10.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb3.append("Failed to preload url ");
            sb3.append(str);
            sb3.append(" Exception: ");
            sb3.append(message);
            String string = sb3.toString();
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, "error", zzx("error", e10));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final boolean zzg(String str, String[] strArr, zzcis zzcisVar) {
        this.zzf = str;
        this.zzi = zzcisVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzchn zzchnVar = (zzchn) this.zzc.get();
            if (zzchnVar != null) {
                zzchnVar.zzt(strZzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            this.zzk = -1L;
            zzd(0L);
            return true;
        } catch (Exception e10) {
            String message = e10.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb2.append("Failed to preload url ");
            sb2.append(str);
            sb2.append(" Exception: ");
            sb2.append(message);
            String string = sb2.toString();
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, "error", zzx("error", e10));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final void zzh(int i10) {
        this.zze.zzG(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final void zzi(int i10) {
        this.zze.zzF(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final void zzj(int i10) {
        this.zze.zzy(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final void zzk(int i10) {
        this.zze.zzz(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final void zzl() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzq(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzr(final boolean z10, final long j10) {
        final zzchn zzchnVar = (zzchn) this.zzc.get();
        if (zzchnVar != null) {
            zzcfr.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcji
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzchnVar.zzu(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzu(String str, Exception exc) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzv(String str, Exception exc) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzs(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzt(int i10, int i11) {
    }
}
