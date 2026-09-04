package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzegi extends zzegc {
    private String zzg;
    private int zzh = 1;

    zzegi(Context context) {
        this.zzf = new zzcaf(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        int i10 = this.zzh;
                        if (i10 == 2) {
                            this.zzf.zzp().zzg(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzov)).booleanValue() ? new zzegb(this.zza, this.zze) : new zzega(this));
                        } else if (i10 == 3) {
                            this.zzf.zzp().zzh(this.zzg, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzov)).booleanValue() ? new zzegb(this.zza, this.zze) : new zzega(this));
                        } else {
                            this.zza.zzd(new zzegr(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzegr(1));
                    } catch (Throwable th2) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "RemoteUrlAndCacheKeyClientTask.onConnected");
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
                int i10 = this.zzh;
                if (i10 != 1 && i10 != 2) {
                    return zzhbw.zzc(new zzegr(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzcbdVar;
                this.zzf.checkAvailabilityAndConnect();
                zzcfw zzcfwVar = this.zza;
                zzcfwVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegh
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                }, zzcfr.zzh);
                return zzcfwVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ListenableFuture zzd(String str) {
        synchronized (this.zzb) {
            try {
                int i10 = this.zzh;
                if (i10 != 1 && i10 != 3) {
                    return zzhbw.zzc(new zzegr(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                zzcfw zzcfwVar = this.zza;
                zzcfwVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegg
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                }, zzcfr.zzh);
                return zzcfwVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
