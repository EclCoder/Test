package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzefv extends zzegc {
    private final Context zzg;
    private final Executor zzh;

    public zzefv(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzcaf(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        this.zzf.zzp().zze(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzov)).booleanValue() ? new zzegb(this.zza, this.zze) : new zzega(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzegr(1));
                    } catch (Throwable th2) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "RemoteAdRequestClientTask.onConnected");
                        this.zza.zzd(new zzegr(1));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegc, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzegr(1));
    }

    public final ListenableFuture zza(zzcbd zzcbdVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return this.zza;
                }
                this.zzc = true;
                this.zze = zzcbdVar;
                this.zzf.checkAvailabilityAndConnect();
                zzcfw zzcfwVar = this.zza;
                zzcfwVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefu
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                }, zzcfr.zzh);
                zzegc.zzc(this.zzg, zzcfwVar, this.zzh);
                return zzcfwVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
