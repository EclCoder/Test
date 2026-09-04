package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzadc {
    private final Context zza;
    private boolean zzb;
    private zzvv zzc = zzvv.zzb;
    private final zzvh zzd;
    private Handler zze;
    private zzaep zzf;

    public zzadc(Context context) {
        this.zza = context;
        this.zzd = new zzvb(context, null, null);
    }

    public final zzadc zza(zzvv zzvvVar) {
        this.zzc = zzvvVar;
        return this;
    }

    public final zzadc zzb(Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzadc zzc(zzaep zzaepVar) {
        this.zzf = zzaepVar;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    public final zzade zzd() {
        boolean z10;
        zzgtj.zzi(!this.zzb);
        Handler handler = this.zze;
        if (handler == null && this.zzf == null) {
            z10 = true;
        } else {
            z10 = false;
            if (handler != null && this.zzf != null) {
                z10 = true;
            }
        }
        zzgtj.zzi(z10);
        this.zzb = true;
        return new zzade(this);
    }

    final /* synthetic */ Context zze() {
        return this.zza;
    }

    final /* synthetic */ zzvv zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzvh zzg() {
        return this.zzd;
    }

    final /* synthetic */ Handler zzh() {
        return this.zze;
    }

    final /* synthetic */ zzaep zzi() {
        return this.zzf;
    }
}
