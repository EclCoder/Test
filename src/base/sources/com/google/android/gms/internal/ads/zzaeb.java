package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaeb {
    private final Context zzb;
    private zzadx zzc;
    private boolean zzd;
    private Surface zze;
    private float zzg;
    private float zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private final zzacx zza = new zzacx();
    private float zzf = -1.0f;
    private float zzi = 1.0f;
    private int zzj = 0;

    public zzaeb(Context context) {
        this.zzb = context;
    }

    private final void zzj() {
        this.zzm = 0L;
        this.zzq = -1L;
        this.zzn = -1L;
        this.zzk = 0L;
        this.zzl = 0L;
    }

    private final void zzk() {
        if (Build.VERSION.SDK_INT < 30 || this.zze == null) {
            return;
        }
        zzacx zzacxVar = this.zza;
        float fZzg = zzacxVar.zzc() ? zzacxVar.zzg() : this.zzf;
        float f10 = this.zzg;
        if (fZzg != f10) {
            if (fZzg != -1.0f && f10 != -1.0f) {
                float f11 = 1.0f;
                if (zzacxVar.zzc() && zzacxVar.zze() >= 5000000000L) {
                    f11 = 0.1f;
                }
                if (Math.abs(fZzg - this.zzg) < f11) {
                    return;
                }
            } else if (fZzg == -1.0f && zzacxVar.zzd() < 30) {
                return;
            }
            this.zzg = fZzg;
            zzl(false);
        }
    }

    private final void zzl(boolean z10) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        float f10 = 0.0f;
        if (this.zzd) {
            float f11 = this.zzg;
            if (f11 != -1.0f) {
                f10 = this.zzi * f11;
            }
        }
        if (z10 || this.zzh != f10) {
            this.zzh = f10;
            zzadw.zza(this.zze, f10);
        }
    }

    private final void zzm() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f || !surface.isValid()) {
            return;
        }
        this.zzh = 0.0f;
        zzadw.zza(this.zze, 0.0f);
    }

    public final void zza(int i10) {
        if (this.zzj == i10) {
            return;
        }
        this.zzj = i10;
        zzl(true);
    }

    public final void zzb() {
        this.zzd = true;
        zzj();
        DisplayManager displayManager = (DisplayManager) this.zzb.getSystemService("display");
        zzadx zzaeaVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                zzaeaVar = Build.VERSION.SDK_INT >= 33 ? new zzaea(choreographer, displayManager, null) : new zzady(choreographer, displayManager, null);
            } catch (RuntimeException e10) {
                zzeg.zzd("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }
        this.zzc = zzaeaVar;
        if (zzaeaVar != null) {
            zzaeaVar.zza();
        }
        zzl(false);
    }

    public final void zzc(Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzm();
        this.zze = surface;
        zzl(true);
    }

    public final void zzd() {
        zzj();
    }

    public final void zze(float f10) {
        this.zzi = f10;
        zzl(false);
    }

    public final void zzf(float f10) {
        this.zzf = f10;
        this.zza.zza();
        zzk();
    }

    public final void zzg(long j10) {
        long j11 = this.zzn;
        if (j11 != -1) {
            this.zzq = j11;
            this.zzr = this.zzo;
            this.zzs = this.zzp;
            this.zzk = this.zzl;
        }
        this.zzm++;
        this.zza.zzb(j10 * 1000);
        zzk();
    }

    public final void zzh() {
        this.zzd = false;
        zzadx zzadxVar = this.zzc;
        if (zzadxVar != null) {
            zzadxVar.zzb();
        }
        zzm();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    public final long zzi(long j10, long j11) {
        long j12;
        long j13;
        long j14;
        float f10;
        long jZzf;
        if (this.zzq != -1) {
            zzacx zzacxVar = this.zza;
            if (zzacxVar.zzc()) {
                jZzf = zzacxVar.zzf() * (this.zzm - this.zzq);
                f10 = this.zzi;
            } else {
                long j15 = j11 - this.zzs;
                f10 = this.zzi;
                jZzf = j15 * 1000;
            }
            j12 = this.zzr + ((long) (jZzf / f10));
            if (Math.abs(j10 - j12) > 20000000) {
                zzj();
                j12 = j10;
            }
        } else {
            j12 = j10;
        }
        this.zzn = this.zzm;
        this.zzo = j12;
        this.zzp = j11;
        zzadx zzadxVar = this.zzc;
        if (zzadxVar != null) {
            long j16 = zzadxVar.zzc;
            long j17 = this.zzc.zzd;
            if (j16 != C.TIME_UNSET && j17 != C.TIME_UNSET) {
                long j18 = j16 + (((j12 - j16) / j17) * j17);
                if (j12 <= j18) {
                    j13 = j18 - j17;
                } else {
                    j13 = j18;
                    j18 += j17;
                }
                long j19 = j17 / 2;
                long j20 = j18 - j12;
                long j21 = j12 - j13;
                long jAbs = Math.abs(j20 - j21);
                if (jAbs < j19) {
                    long j22 = j17 / 4;
                    if (jAbs < j22) {
                        j14 = this.zzk;
                        if (j14 == 0) {
                            if (j20 < j21) {
                                j22 = -j22;
                            }
                        }
                        if (j20 + j14 >= j21) {
                            j18 = j13;
                        }
                        return j18 - ((j17 * 80) / 100);
                    }
                    j22 = 0;
                    this.zzl = j22;
                    j14 = j22;
                    if (j20 + j14 >= j21) {
                        j18 = j13;
                    }
                    return j18 - ((j17 * 80) / 100);
                }
                j14 = this.zzk;
                this.zzl = j14;
                if (j20 + j14 >= j21) {
                    j18 = j13;
                }
                return j18 - ((j17 * 80) / 100);
            }
        }
        return j12;
    }
}
