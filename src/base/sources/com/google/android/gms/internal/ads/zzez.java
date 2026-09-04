package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzez {
    final /* synthetic */ zzfc zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private boolean zzg;
    private long zzh;

    public zzez(zzfc zzfcVar, int i10) {
        Objects.requireNonNull(zzfcVar);
        this.zza = zzfcVar;
        this.zzb = i10;
    }

    public final void zza() {
        zzfc zzfcVar = this.zza;
        if (!zzfcVar.zzd().zza()) {
            if (this.zzg) {
                zzfcVar.zzg().zzk(2);
            }
            this.zzg = false;
            return;
        }
        zzbf zzbfVarZzq = zzfcVar.zzd().zzq();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(zzfcVar.zzd().zzr());
        zzbb zzbbVarZzd = zzfcVar.zzd();
        zzbb zzbbVarZzd2 = zzfcVar.zzd();
        zzbb zzbbVarZzd3 = zzfcVar.zzd();
        int iZzy = zzbbVarZzd.zzy();
        int iZzz = zzbbVarZzd2.zzz();
        long jZzu = zzbbVarZzd3.zzu();
        if (objZzf != null && iZzy == -1) {
            zzbfVarZzq.zzo(objZzf, zzfcVar.zzf());
            jZzu -= zzfl.zzr(0L);
            iZzy = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzg && Objects.equals(objZzf, this.zzc) && iZzy == this.zzd && iZzz == this.zze && jZzu == this.zzf) {
            long j10 = jElapsedRealtime - this.zzh;
            int i10 = this.zzb;
            if (j10 >= i10) {
                zzfcVar.zze().zza(new zzfd(2, i10));
                return;
            }
            return;
        }
        this.zzg = true;
        this.zzh = jElapsedRealtime;
        this.zzc = objZzf;
        this.zzd = iZzy;
        this.zze = iZzz;
        this.zzf = jZzu;
        zzfcVar.zzg().zzk(2);
        zzfcVar.zzg().zzi(2, this.zzb);
    }
}
