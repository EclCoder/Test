package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zztf {
    private boolean zzA;
    private long zzB;
    private final zzte zza;
    private final zzdo zzb;
    private final long[] zzc;
    private final AudioTrack zzd;
    private final int zze;
    private final long zzf;
    private final boolean zzg;
    private final zzsg zzh;
    private float zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private Method zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zztf(zzte zzteVar, zzdo zzdoVar, AudioTrack audioTrack, int i10, int i11, int i12) {
        this.zza = zzteVar;
        this.zzb = zzdoVar;
        this.zzd = audioTrack;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzz = C.TIME_UNSET;
        this.zzy = C.TIME_UNSET;
        this.zzh = new zzsg(audioTrack, zzteVar);
        int sampleRate = audioTrack.getSampleRate();
        this.zze = sampleRate;
        boolean zZzD = zzfl.zzD(i10);
        this.zzg = zZzD;
        this.zzf = zZzD ? zzfl.zzt(i12 / i11, sampleRate) : -9223372036854775807L;
        this.zzq = 0L;
        this.zzr = 0L;
        this.zzA = false;
        this.zzB = 0L;
        this.zzu = C.TIME_UNSET;
        this.zzv = C.TIME_UNSET;
        this.zzo = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
        this.zzj = C.TIME_UNSET;
    }

    private final void zzg(long j10) {
        long j11 = this.zzj;
        if (j11 == C.TIME_UNSET || j10 < j11) {
            return;
        }
        long jZzy = zzfl.zzy(j10 - j11, this.zzi);
        zzdo zzdoVar = this.zzb;
        long jZza = zzdoVar.zza() - zzfl.zzr(jZzy);
        this.zzj = C.TIME_UNSET;
        this.zza.zzb(jZza);
    }

    private final long zzh(long j10) {
        long jZzx;
        if (this.zzt == 0) {
            jZzx = this.zzu != C.TIME_UNSET ? zzfl.zzt(zzl(), this.zze) : zzj();
        } else {
            jZzx = zzfl.zzx(j10 + this.zzk, this.zzi);
        }
        long jMax = Math.max(0L, jZzx - this.zzn);
        return this.zzu != C.TIME_UNSET ? Math.min(zzfl.zzt(this.zzx, this.zze), jMax) : jMax;
    }

    private final void zzi() {
        this.zzk = 0L;
        this.zzt = 0;
        this.zzs = 0;
        this.zzl = 0L;
        this.zzy = C.TIME_UNSET;
        this.zzz = C.TIME_UNSET;
    }

    private final long zzj() {
        return zzfl.zzt(zzk(), this.zze);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    private final long zzk() {
        if (this.zzu != C.TIME_UNSET) {
            return Math.min(this.zzx, zzl());
        }
        long jZzb = this.zzb.zzb();
        if (jZzb - this.zzp >= 5) {
            AudioTrack audioTrack = this.zzd;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    if (this.zzq > playbackHeadPosition) {
                        this.zzr++;
                    }
                    this.zzq = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.zzq <= 0 || playState != 3) {
                    this.zzv = C.TIME_UNSET;
                    if (this.zzq > playbackHeadPosition) {
                        this.zzr++;
                    }
                    this.zzq = playbackHeadPosition;
                } else if (this.zzv == C.TIME_UNSET) {
                    this.zzv = jZzb;
                }
            }
            this.zzp = jZzb;
        }
        return this.zzq + this.zzB + (this.zzr << 32);
    }

    private final long zzl() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzw;
        }
        return this.zzw + zzfl.zzu(zzfl.zzx(zzfl.zzs(this.zzb.zzb()) - this.zzu, this.zzi), this.zze);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    public final long zza() {
        long j10;
        Method method;
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        long j11 = 1000;
        if (audioTrack.getPlayState() == 3) {
            long jZzc = this.zzb.zzc() / 1000;
            if (jZzc - this.zzl >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                long jZzj = zzj();
                if (jZzj != 0) {
                    long[] jArr = this.zzc;
                    jArr[this.zzs] = zzfl.zzy(jZzj, this.zzi) - jZzc;
                    this.zzs = (this.zzs + 1) % 10;
                    int i10 = this.zzt;
                    if (i10 < 10) {
                        this.zzt = i10 + 1;
                    }
                    this.zzl = jZzc;
                    this.zzk = 0L;
                    int i11 = 0;
                    while (true) {
                        int i12 = this.zzt;
                        if (i11 >= i12) {
                            break;
                        }
                        this.zzk += jArr[i11] / ((long) i12);
                        i11++;
                        j11 = j11;
                    }
                } else {
                    j10 = 1000;
                }
            }
            j10 = j11;
            long j12 = this.zzn;
            if (this.zzg && (method = this.zzm) != null && jZzc - this.zzo >= 500000) {
                try {
                    Integer num = (Integer) method.invoke(audioTrack, null);
                    String str = zzfl.zza;
                    long jIntValue = (((long) num.intValue()) * j10) - this.zzf;
                    this.zzn = jIntValue;
                    long jMax = Math.max(jIntValue, 0L);
                    this.zzn = jMax;
                    if (jMax > 10000000) {
                        this.zza.zza(jMax);
                        this.zzn = 0L;
                    }
                } catch (Exception unused) {
                    this.zzm = null;
                }
                this.zzo = jZzc;
            }
            this.zzh.zza(jZzc, this.zzi, zzh(jZzc), j12 != this.zzn);
        } else {
            j10 = 1000;
        }
        long jZzc2 = this.zzb.zzc() / j10;
        zzsg zzsgVar = this.zzh;
        boolean zZzb = zzsgVar.zzb();
        long jZze = zZzb ? zzsgVar.zze(jZzc2, this.zzi) : zzh(jZzc2);
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (zZzb || !zzsgVar.zzc()) {
                zzg(jZze);
            }
            long j13 = this.zzz;
            if (j13 != C.TIME_UNSET) {
                long j14 = jZze - this.zzy;
                long jZzx = zzfl.zzx(jZzc2 - j13, this.zzi);
                long j15 = this.zzy + jZzx;
                long jAbs = Math.abs(j15 - jZze);
                if (j14 != 0 && jAbs < 1000000) {
                    long j16 = (jZzx * 10) / 100;
                    jZze = Math.max(j15 - j16, Math.min(jZze, j15 + j16));
                }
            }
            this.zzz = jZzc2;
            this.zzy = jZze;
        } else if (playState == 1) {
            zzg(jZze);
            return jZze;
        }
        return jZze;
    }

    public final void zzb() {
        if (this.zzu != C.TIME_UNSET) {
            this.zzu = zzfl.zzs(this.zzb.zzb());
        }
        this.zzj = zzj();
        this.zzh.zzd();
    }

    public final boolean zzc() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzd(long j10) {
        return this.zzv != C.TIME_UNSET && j10 > 0 && this.zzb.zzb() - this.zzv >= 200;
    }

    public final void zze(long j10) {
        this.zzw = zzk();
        this.zzu = zzfl.zzs(this.zzb.zzb());
        this.zzx = j10;
    }

    public final void zzf() {
        zzi();
        if (this.zzu == C.TIME_UNSET) {
            this.zzh.zzd();
        }
        this.zzw = zzk();
    }
}
