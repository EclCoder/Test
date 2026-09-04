package com.google.android.gms.internal.measurement;

import com.google.common.collect.c0;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzvp extends zzww {
    private final c0 zza;
    private final c0 zzb;
    private final UUID zzc;
    private final long zzd;

    /* synthetic */ zzvp(c0 c0Var, c0 c0Var2, UUID uuid, long j10, byte[] bArr) {
        this.zza = c0Var;
        this.zzb = c0Var2;
        this.zzc = uuid;
        this.zzd = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzww) {
            zzww zzwwVar = (zzww) obj;
            if (this.zza.equals(zzwwVar.zza()) && this.zzb.equals(zzwwVar.zzb()) && this.zzc.equals(zzwwVar.zzc()) && this.zzd == zzwwVar.zzd()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
        long j10 = this.zzd;
        return (iHashCode * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final c0 zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final c0 zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final UUID zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final long zzd() {
        return this.zzd;
    }
}
