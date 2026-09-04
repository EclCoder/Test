package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public enum zzbds implements zziei {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);

    private final int zzh;

    zzbds(int i10) {
        this.zzh = i10;
    }

    public static zzbds zzb(int i10) {
        if (i10 == 0) {
            return UNSUPPORTED;
        }
        if (i10 == 2) {
            return ARM7;
        }
        if (i10 == 999) {
            return UNKNOWN;
        }
        if (i10 == 4) {
            return X86;
        }
        if (i10 == 5) {
            return ARM64;
        }
        if (i10 == 6) {
            return X86_64;
        }
        if (i10 != 7) {
            return null;
        }
        return RISCV64;
    }

    public static zziek zzc() {
        return zzbdr.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int zza() {
        return this.zzh;
    }
}
