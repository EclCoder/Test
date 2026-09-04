package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzadu {
    private final zzadt zza;
    private final zzaeb zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private boolean zzl;
    private boolean zzm;
    private int zzd = 0;
    private long zze = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private float zzj = 1.0f;
    private zzdo zzk = zzdo.zza;

    public zzadu(Context context, zzadt zzadtVar, long j10) {
        this.zza = zzadtVar;
        this.zzb = new zzaeb(context);
    }

    private final void zzo(int i10) {
        this.zzd = Math.min(this.zzd, i10);
    }

    public final void zza(int i10) {
        if (i10 == 0) {
            this.zzd = 1;
        } else if (i10 != 1) {
            zzo(2);
        } else {
            this.zzd = 0;
        }
        this.zzb.zzd();
    }

    public final void zzb() {
        this.zzc = true;
        this.zzf = zzfl.zzs(this.zzk.zzb());
        this.zzb.zzb();
    }

    public final void zzc() {
        this.zzc = false;
        this.zzh = C.TIME_UNSET;
        this.zzb.zzh();
    }

    public final void zzd(Surface surface) {
        this.zzl = surface != null;
        this.zzm = false;
        this.zzb.zzc(surface);
        zzo(1);
    }

    public final void zze(float f10) {
        this.zzb.zzf(f10);
    }

    public final boolean zzf() {
        int i10 = this.zzd;
        this.zzd = 3;
        this.zzf = zzfl.zzs(this.zzk.zzb());
        return i10 != 3;
    }

    public final void zzg(zzdo zzdoVar) {
        this.zzk = zzdoVar;
    }

    public final void zzh() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final boolean zzi(boolean z10) {
        if (z10 && (this.zzd == 3 || (this.zzm && !this.zzl))) {
            this.zzh = C.TIME_UNSET;
            return true;
        }
        if (this.zzh == C.TIME_UNSET) {
            return false;
        }
        if (this.zzk.zzb() < this.zzh) {
            return true;
        }
        this.zzh = C.TIME_UNSET;
        return false;
    }

    public final void zzj(boolean z10) {
        this.zzi = z10;
        this.zzh = C.TIME_UNSET;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bd, code lost:
    
        if (r17 > 100000) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
    
        if (r24 >= r28) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d1, code lost:
    
        if (r21.zzc != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzk(long r22, long r24, long r26, long r28, boolean r30, boolean r31, com.google.android.gms.internal.ads.zzads r32) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadu.zzk(long, long, long, long, boolean, boolean, com.google.android.gms.internal.ads.zzads):int");
    }

    public final void zzl() {
        this.zzb.zzd();
        this.zzg = C.TIME_UNSET;
        this.zze = C.TIME_UNSET;
        zzo(1);
        this.zzh = C.TIME_UNSET;
        this.zzm = false;
    }

    public final void zzm(int i10) {
        this.zzb.zza(i10);
    }

    public final void zzn(float f10) {
        zzgtj.zza(f10 > 0.0f);
        if (f10 == this.zzj) {
            return;
        }
        this.zzj = f10;
        this.zzb.zze(f10);
    }
}
