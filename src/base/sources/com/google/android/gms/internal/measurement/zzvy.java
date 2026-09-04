package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.Trace;
import com.google.common.collect.g0;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzvy {
    public static final /* synthetic */ int zzb = 0;
    private static final g0 zzc = g0.D("androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
    private static final AtomicReference zzd = new AtomicReference(g0.z());
    static final zzrg zza = new zzrg("tiktok_systrace");
    private static final WeakHashMap zze = new WeakHashMap();
    private static final zzvx zzf = new zzvx();

    static {
        new ArrayDeque();
        new ArrayDeque();
    }

    static g0 zza() {
        return (g0) zzd.get();
    }

    static zzws zzb(boolean z10) {
        zzwq zzwqVarZzd = zzd();
        zzws zzwsVar = zzwqVarZzd.zzb;
        return (zzwsVar == null || zzwsVar == zzwg.zza) ? zzwd.zzi(zzwqVarZzd) : zzwsVar;
    }

    public static zzws zzc(zzwq zzwqVar, zzws zzwsVar) {
        zzxb zzxbVar = zzwqVar.zzc;
        zzws zzwsVar2 = zzwqVar.zzb;
        if (zzwsVar2 != zzwsVar) {
            if (zzwsVar2 == null) {
                zzwqVar.zza = Build.VERSION.SDK_INT >= 29 ? Trace.isEnabled() : zzrk.zza(zza);
            }
            if (zzwqVar.zza) {
                zzwr.zza(zzwsVar2, zzwsVar);
            }
            if (zzwsVar2 != zzwsVar) {
                zzwqVar.zzb = zzwsVar;
                return zzwsVar2;
            }
        }
        return zzwsVar;
    }

    public static zzwq zzd() {
        return (zzwq) zzf.get();
    }
}
