package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzigd extends zzict {
    final zzigf zza;
    zzicv zzb;
    final /* synthetic */ zzigg zzc;

    zzigd(zzigg zziggVar) {
        Objects.requireNonNull(zziggVar);
        this.zzc = zziggVar;
        this.zza = new zzigf(zziggVar, null);
        this.zzb = zzb();
    }

    private final zzicv zzb() {
        zzigf zzigfVar = this.zza;
        if (zzigfVar.hasNext()) {
            return zzigfVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzicv
    public final byte zza() {
        zzicv zzicvVar = this.zzb;
        if (zzicvVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzicvVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
