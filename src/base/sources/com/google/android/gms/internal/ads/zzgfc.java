package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgfc {
    private final ExecutorService zza;

    public zzgfc(ExecutorService executorService) {
        this.zza = executorService;
    }

    public final zzget zza(File file, zzifp zzifpVar, zzgta zzgtaVar) {
        return new zzgfb(file, this.zza, new zzgez(zzifpVar), zzgtaVar);
    }

    public final zzget zzb(File file, byte[] bArr, zzgta zzgtaVar) {
        return new zzgfb(file, this.zza, new zzgev(bArr), zzgtaVar);
    }
}
