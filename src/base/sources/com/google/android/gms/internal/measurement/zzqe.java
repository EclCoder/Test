package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.j;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import sc.p;
import sc.x;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqe {
    private final Context zza;
    private final x zzb;
    private final x zzc;
    private final x zzd;
    private volatile int zze = 0;
    private final CopyOnWriteArrayList zzf = new CopyOnWriteArrayList();
    private final Object zzg = new Object();
    private volatile ListenableFuture zzh = null;

    public zzqe(Context context, x xVar, x xVar2, x xVar3) {
        this.zza = context;
        this.zzb = xVar;
        this.zzc = xVar2;
        this.zzd = xVar3;
    }

    public final ListenableFuture zza(zzabz zzabzVar, boolean z10, zzqc zzqcVar) {
        final ListenableFuture listenableFutureM;
        final zzqm zzqmVar = (zzqm) this.zzc.get();
        if (zzqmVar == null && !z10) {
            return com.google.common.util.concurrent.x.h();
        }
        int iZza = zzabzVar.zza();
        p.d(true);
        int i10 = 1 << iZza;
        if ((this.zze & i10) == 0) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.zzf;
            synchronized (copyOnWriteArrayList) {
                try {
                    int i11 = this.zze;
                    if ((i11 & i10) == 0) {
                        copyOnWriteArrayList.add(zzqcVar);
                        this.zze = i10 | i11;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        ListenableFuture listenableFuture = this.zzh;
        if (listenableFuture != null) {
            return listenableFuture;
        }
        synchronized (this.zzg) {
            try {
                listenableFutureM = this.zzh;
                if (listenableFutureM == null) {
                    if (zzqmVar == null) {
                        zzqmVar = zzqb.zza;
                    }
                    Context context = this.zza;
                    if (zzky.zzb(context)) {
                        zzpz zzpzVar = zzpz.zza;
                        x xVar = this.zzb;
                        listenableFutureM = com.google.common.util.concurrent.x.m(zzky.zzd(context, Executors.callable(zzpzVar, null), (Executor) xVar.get()), new j() { // from class: com.google.android.gms.internal.measurement.zzqa
                            @Override // com.google.common.util.concurrent.j
                            public final /* synthetic */ ListenableFuture apply(Object obj) {
                                return this.zza.zzb(zzqmVar, (Void) obj);
                            }
                        }, (Executor) xVar.get());
                        this.zzh = listenableFutureM;
                    } else {
                        listenableFutureM = (ListenableFuture) p.o(((zzmj) this.zzd.get()).zze(new zzqd(this, zzqmVar)));
                        this.zzh = listenableFutureM;
                    }
                    listenableFutureM.addListener(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzpy
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            try {
                                com.google.common.util.concurrent.x.d(listenableFutureM);
                            } catch (Exception e10) {
                                Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e10);
                            }
                        }
                    }, (Executor) this.zzb.get());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return listenableFutureM;
    }

    final /* synthetic */ ListenableFuture zzb(zzqm zzqmVar, Void r10) {
        return (ListenableFuture) p.o(((zzmj) this.zzd.get()).zze(new zzqd(this, zzqmVar)));
    }

    final /* synthetic */ CopyOnWriteArrayList zzc() {
        return this.zzf;
    }
}
