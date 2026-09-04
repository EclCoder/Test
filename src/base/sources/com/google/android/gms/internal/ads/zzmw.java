package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzmw {
    private final zzmv zza;
    private final zzmu zzb;
    private final zzbf zzc;
    private int zzd;
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;

    public zzmw(zzmu zzmuVar, zzmv zzmvVar, zzbf zzbfVar, int i10, zzdo zzdoVar, Looper looper) {
        this.zzb = zzmuVar;
        this.zza = zzmvVar;
        this.zzc = zzbfVar;
        this.zzf = looper;
        this.zzg = i10;
    }

    public final zzmv zza() {
        return this.zza;
    }

    public final zzmw zzb(int i10) {
        zzgtj.zzi(!this.zzh);
        this.zzd = i10;
        return this;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzmw zzd(Object obj) {
        zzgtj.zzi(!this.zzh);
        this.zze = obj;
        return this;
    }

    public final Object zze() {
        return this.zze;
    }

    public final Looper zzf() {
        return this.zzf;
    }

    public final zzmw zzg() {
        zzgtj.zzi(!this.zzh);
        this.zzh = true;
        this.zzb.zzk(this);
        return this;
    }

    public final synchronized boolean zzh() {
        return false;
    }

    public final synchronized void zzi(boolean z10) {
        this.zzi = z10 | this.zzi;
        notifyAll();
    }
}
