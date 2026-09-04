package com.google.android.gms.internal.measurement;

import android.os.Process;
import android.util.Log;
import com.google.common.util.concurrent.f0;
import java.util.concurrent.TimeUnit;
import sc.x;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqi implements zzqm {
    private static boolean zza;
    private final x zzb;
    private final int zzc;
    private final x zzd;

    public zzqi(x xVar, int i10) {
        zzqh zzqhVar = zzqh.zza;
        this.zzb = xVar;
        this.zzc = Math.max(5, 10);
        this.zzd = zzqhVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzqm
    public final void zza() {
        synchronized (zzqi.class) {
            try {
                if (!zza) {
                    Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.measurement.zzqg
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzb();
                        }
                    };
                    long j10 = this.zzc;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    f0 f0Var = (f0) this.zzb.get();
                    zzpx.zza(f0Var.schedule((Runnable) new zzqf(this, runnable, f0Var, j10, timeUnit), j10, timeUnit));
                    zza = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void zzb() {
        if (((Boolean) this.zzd.get()).booleanValue()) {
            Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }
}
