package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzlz {
    public static final void zza(Level level, Executor executor, String str, Object... objArr) {
        zzc(level, executor, null, str, objArr);
    }

    public static final void zzb(Level level, Executor executor, Throwable th2, String str, Object... objArr) {
        zzc(level, executor, th2, str, objArr);
    }

    private static final void zzc(final Level level, Executor executor, final Throwable th2, final String str, final Object... objArr) {
        executor.execute(zzxa.zza(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzly
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                ((zzxp) ((zzxp) zzlx.zza.zze(level).zzo(th2)).zzn("com/google/android/libraries/phenotype/client/Phlogger", "logInternal", 44, "Phlogger.java")).zzp(str, objArr);
            }
        }));
    }
}
