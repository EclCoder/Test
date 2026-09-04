package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfh extends zzfi {
    final /* synthetic */ zzfp zza;
    private int zzb;
    private final int zzc;

    zzfh(zzfp zzfpVar) {
        Objects.requireNonNull(zzfpVar);
        this.zza = zzfpVar;
        this.zzb = 0;
        this.zzc = zzfpVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfk
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zza(i10);
    }
}
