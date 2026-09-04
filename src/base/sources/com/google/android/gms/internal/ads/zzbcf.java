package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcf extends zzbdf {
    private static final zzbdg zzh = new zzbdg();
    private final Context zzi;

    public zzbcf(zzbbs zzbbsVar, String str, String str2, zzaxm zzaxmVar, int i10, int i11, Context context) {
        super(zzbbsVar, "00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", zzaxmVar, i10, 29);
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() {
        this.zzd.zzp("E");
        Context context = this.zzi;
        AtomicReference atomicReferenceZza = zzh.zza(context.getPackageName());
        if (atomicReferenceZza.get() == null) {
            synchronized (atomicReferenceZza) {
                try {
                    if (atomicReferenceZza.get() == null) {
                        atomicReferenceZza.set((String) this.zze.invoke(null, context));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        String str = (String) atomicReferenceZza.get();
        zzaxm zzaxmVar = this.zzd;
        synchronized (zzaxmVar) {
            zzaxmVar.zzp(zzazi.zza(str.getBytes(), true));
        }
    }
}
