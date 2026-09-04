package com.google.android.gms.internal.ads;

import android.content.Context;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzadi {
    private final Context zza;
    private final zzadu zzb;
    private zzbs zzc;
    private boolean zzd;
    private boolean zzf;
    private long zzg = MBInterstitialActivity.WEB_LOAD_TIME;
    private final zzadv zzh = new zzadv(1.0f);
    private zzdo zze = zzdo.zza;

    public zzadi(Context context, zzadu zzaduVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzaduVar;
    }

    public final zzadi zza(boolean z10) {
        this.zzd = true;
        return this;
    }

    public final zzadi zzb(zzdo zzdoVar) {
        this.zze = zzdoVar;
        return this;
    }

    public final zzadi zzc(long j10) {
        this.zzg = j10;
        return this;
    }

    public final zzadq zzd() {
        zzgtj.zzi(!this.zzf);
        if (this.zzc == null) {
            this.zzc = new zzado(false);
        }
        zzadq zzadqVar = new zzadq(this, null);
        this.zzf = true;
        return zzadqVar;
    }

    final /* synthetic */ Context zze() {
        return this.zza;
    }

    final /* synthetic */ zzadu zzf() {
        return this.zzb;
    }

    final /* synthetic */ zzbs zzg() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzd;
    }

    final /* synthetic */ zzdo zzi() {
        return this.zze;
    }

    final /* synthetic */ long zzj() {
        return this.zzg;
    }

    final /* synthetic */ zzadv zzk() {
        return this.zzh;
    }
}
