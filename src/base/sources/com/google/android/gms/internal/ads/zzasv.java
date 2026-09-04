package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzasv {
    private final Executor zza;

    public zzasv(Handler handler) {
        this.zza = new zzast(this, handler);
    }

    public final void zza(zzate zzateVar, zzatk zzatkVar, Runnable runnable) {
        zzateVar.zzp();
        zzateVar.zzc("post-response");
        ((zzast) this.zza).zza.post(new zzasu(zzateVar, zzatkVar, runnable));
    }

    public final void zzb(zzate zzateVar, zzatn zzatnVar) {
        zzateVar.zzc("post-error");
        ((zzast) this.zza).zza.post(new zzasu(zzateVar, zzatk.zzb(zzatnVar), null));
    }
}
