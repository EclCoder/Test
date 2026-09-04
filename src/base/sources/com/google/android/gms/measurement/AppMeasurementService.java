package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zznt;
import n1.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class AppMeasurementService extends Service implements zznp {
    private zznt zza;

    private final zznt zzd() {
        if (this.zza == null) {
            this.zza = new zznt(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return zzd().zzd(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        zzd().zza();
    }

    @Override // android.app.Service
    public void onDestroy() {
        zzd().zzb();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        zzd();
        zznt.zzi(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        zzd().zzc(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        zzd();
        zznt.zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final boolean zza(int i10) {
        return stopSelfResult(i10);
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final void zzb(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final void zzc(Intent intent) {
        a.completeWakefulIntent(intent);
    }
}
