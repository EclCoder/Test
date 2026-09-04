package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzhay extends zzhbc {
    private static final zzhce zza = new zzhce(zzhay.class);
    private zzgwi zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzhay(zzgwi zzgwiVar, boolean z10, boolean z11) {
        super(zzgwiVar.size());
        this.zzb = zzgwiVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i10, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i10, listenableFuture);
            }
        } finally {
            zzz(null);
        }
    }

    private final void zzE(Throwable th2) {
        th2.getClass();
        if (this.zzc && !zzb(th2) && zzI(zzB(), th2)) {
            zzF(th2);
        } else if (th2 instanceof Error) {
            zzF(th2);
        }
    }

    private static void zzF(Throwable th2) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", OGoz.NuXasOWgR, true != (th2 instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th2);
    }

    private final void zzG(int i10, Future future) {
        try {
            zzw(i10, zzhcx.zza(future));
        } catch (ExecutionException e10) {
            zzE(e10.getCause());
        } catch (Throwable th2) {
            zzE(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzgwi zzgwiVar) {
        int iZzC = zzC();
        int i10 = 0;
        zzgtj.zzj(iZzC >= 0, "Less than 0 remaining futures");
        if (iZzC == 0) {
            if (zzgwiVar != null) {
                zzgza it = zzgwiVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i10, future);
                    }
                    i10++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
        }
    }

    private static boolean zzI(Set set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    void zzA(int i10) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final void zzc() {
        zzgwi zzgwiVar = this.zzb;
        zzA(1);
        if ((zzgwiVar != null) && isCancelled()) {
            boolean zZzj = zzj();
            zzgza it = zzgwiVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final String zzd() {
        zzgwi zzgwiVar = this.zzb;
        return zzgwiVar != null ? "futures=".concat(zzgwiVar.toString()) : super.zzd();
    }

    final void zze() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        if (this.zzc) {
            zzgza it = this.zzb.iterator();
            final int i10 = 0;
            while (it.hasNext()) {
                final ListenableFuture listenableFuture = (ListenableFuture) it.next();
                int i11 = i10 + 1;
                if (listenableFuture.isDone()) {
                    zzy(i10, listenableFuture);
                } else {
                    listenableFuture.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhax
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzy(i10, listenableFuture);
                        }
                    }, zzhbl.INSTANCE);
                }
                i10 = i11;
            }
            return;
        }
        zzgwi zzgwiVar = this.zzb;
        final zzgwi zzgwiVar2 = true != this.zzd ? null : zzgwiVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzhaw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgwiVar2);
            }
        };
        zzgza it2 = zzgwiVar.iterator();
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            if (listenableFuture2.isDone()) {
                zzz(zzgwiVar2);
            } else {
                listenableFuture2.addListener(runnable, zzhbl.INSTANCE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    final void zzf(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzl = zzl();
        Objects.requireNonNull(thZzl);
        zzI(set, thZzl);
    }

    abstract void zzw(int i10, Object obj);

    abstract void zzx();
}
