package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import sc.p;
import sc.x;
import sc.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzlw {
    public static final /* synthetic */ int zza = 0;
    private static final Object zzb = new Object();
    private static volatile zzlt zzc = null;
    private static volatile boolean zzd = false;
    private static final AtomicInteger zze;

    static {
        new AtomicReference();
        p.p(zzlu.zza, "BuildInfo must be non-null");
        zze = new AtomicInteger();
    }

    public static void zza(final Context context) {
        if (zzc != null || context == null) {
            return;
        }
        Object obj = zzb;
        synchronized (obj) {
            try {
                if (zzc == null) {
                    synchronized (obj) {
                        try {
                            zzlt zzltVar = zzc;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zzltVar == null || zzltVar.zza() != context) {
                                if (zzltVar != null) {
                                    zzld.zza();
                                    zzma.zza();
                                }
                                zzc = new zzlc(context, y.a(new x() { // from class: com.google.android.gms.internal.measurement.zzlv
                                    @Override // sc.x
                                    public final /* synthetic */ Object get() {
                                        int i10 = zzlw.zza;
                                        return zzlf.zza(context);
                                    }
                                }));
                                zze.incrementAndGet();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
