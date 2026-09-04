package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.UserHandle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class GmsClientSupervisor {
    static HandlerThread zza = null;
    private static final Object zzb = new Object();
    private static int zzc = 9;
    private static zzq zzd = null;
    private static Executor zze = null;
    private static boolean zzf = false;

    public static int getDefaultBindFlags() {
        return 4225;
    }

    public static GmsClientSupervisor getInstance(Context context) {
        synchronized (zzb) {
            try {
                if (zzd == null) {
                    if (!zzf) {
                        zzf = GmsClientFlags.isBindServiceOptimizationEnabled(context.getPackageName());
                    }
                    zzd = new zzq(context.getApplicationContext(), zzf ? getOrStartHandlerThread().getLooper() : context.getMainLooper(), zze);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzd;
    }

    public static HandlerThread getOrStartHandlerThread() {
        synchronized (zzb) {
            try {
                HandlerThread handlerThread = zza;
                if (handlerThread != null && handlerThread.isAlive()) {
                    return zza;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", zzc);
                zza = handlerThread2;
                handlerThread2.start();
                return zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void setDefaultBindExecutor(Executor executor) {
        synchronized (zzb) {
            try {
                zzq zzqVar = zzd;
                if (zzqVar != null) {
                    zzqVar.zze(executor);
                }
                zze = executor;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean setGamHandlerThreadPriorityIfNotInitialized(int i10) {
        synchronized (zzb) {
            try {
                if (zza != null) {
                    return false;
                }
                zzc = i10;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void setUseHandlerThreadForCallbacks() {
        synchronized (zzb) {
            try {
                zzq zzqVar = zzd;
                if (zzqVar != null && !zzf) {
                    zzqVar.zzd(getOrStartHandlerThread().getLooper());
                }
                zzf = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return zza(new zzn(componentName, 4225, (UserHandle) null), serviceConnection, str, null).isSuccess();
    }

    public void unbindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        zzc(new zzn(componentName, 4225, (UserHandle) null), serviceConnection, str);
    }

    protected abstract ConnectionResult zza(zzn zznVar, ServiceConnection serviceConnection, String str, Executor executor);

    public final void zzb(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10, UserHandle userHandle) {
        zzc(new zzn(str, str2, 4225, z10, userHandle), serviceConnection, str3);
    }

    protected abstract void zzc(zzn zznVar, ServiceConnection serviceConnection, String str);

    public void unbindService(String str, ServiceConnection serviceConnection, String str2) {
        zzc(new zzn(str, 4225, false), serviceConnection, str2);
    }

    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str, Executor executor) {
        return zza(new zzn(componentName, 4225, (UserHandle) null), serviceConnection, str, executor).isSuccess();
    }

    public static HandlerThread getOrStartHandlerThread(int i10) {
        synchronized (zzb) {
            try {
                HandlerThread handlerThread = zza;
                if (handlerThread != null && handlerThread.isAlive()) {
                    return zza;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", i10);
                zza = handlerThread2;
                handlerThread2.start();
                return zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean bindService(String str, ServiceConnection serviceConnection, String str2) {
        return zza(new zzn(str, 4225, false), serviceConnection, str2, null).isSuccess();
    }
}
