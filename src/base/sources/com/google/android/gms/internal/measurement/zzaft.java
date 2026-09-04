package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaft implements Iterator {
    final /* synthetic */ zzafv zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzaft(zzafv zzafvVar, byte[] bArr) {
        Objects.requireNonNull(zzafvVar);
        this.zza = zzafvVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb + 1;
        zzafv zzafvVar = this.zza;
        if (i10 >= zzafvVar.zzj()) {
            return !zzafvVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        zzafv zzafvVar = this.zza;
        return i10 < zzafvVar.zzj() ? (zzafs) zzafvVar.zzi()[i10] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzafv zzafvVar = this.zza;
        zzafvVar.zzh();
        int i10 = this.zzb;
        if (i10 >= zzafvVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i10 - 1;
            zzafvVar.zzg(i10);
        }
    }
}
