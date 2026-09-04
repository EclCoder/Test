package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzabo {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzabp zzabpVar) {
        zzb(zzabpVar);
        this.zza.add(new zzabn(handler, zzabpVar));
    }

    public final void zzb(zzabp zzabpVar) {
        CopyOnWriteArrayList<zzabn> copyOnWriteArrayList = this.zza;
        for (zzabn zzabnVar : copyOnWriteArrayList) {
            if (zzabnVar.zzc() == zzabpVar) {
                zzabnVar.zza();
                copyOnWriteArrayList.remove(zzabnVar);
            }
        }
    }

    public final void zzc(final int i10, final long j10, final long j11) {
        for (final zzabn zzabnVar : this.zza) {
            if (!zzabnVar.zzd()) {
                zzabnVar.zzb().post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabm
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzabnVar.zzc().zzX(i10, j10, j11);
                    }
                });
            }
        }
    }
}
