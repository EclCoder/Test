package com.google.android.gms.internal.measurement;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzabt implements Closeable {
    private static final ThreadLocal zza = new zzabs();
    private int zzb = 0;

    public static int zza() {
        return zzd().zzb;
    }

    public static zzabt zzc() {
        zzabt zzabtVarZzd = zzd();
        int i10 = zzabtVarZzd.zzb + 1;
        zzabtVarZzd.zzb = i10;
        if (i10 != 0) {
            return zzabtVarZzd;
        }
        throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
    }

    private static zzabt zzd() {
        return (zzabt) zza.get();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.zzb;
        if (i10 <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.zzb = i10 - 1;
    }

    public final int zzb() {
        return this.zzb;
    }
}
