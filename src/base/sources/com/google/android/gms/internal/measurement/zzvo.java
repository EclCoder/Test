package com.google.android.gms.internal.measurement;

import com.google.common.collect.c0;
import java.util.UUID;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzvo extends zzwv {
    private c0 zza;
    private c0 zzb;
    private UUID zzc;
    private long zzd;
    private byte zze;

    zzvo() {
    }

    @Override // com.google.android.gms.internal.measurement.zzwv
    public final zzwv zza(c0 c0Var) {
        if (c0Var == null) {
            throw new NullPointerException("Null spansNames");
        }
        this.zza = c0Var;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzwv
    public final zzwv zzb(c0 c0Var) {
        if (c0Var == null) {
            throw new NullPointerException("Null extras");
        }
        this.zzb = c0Var;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzwv
    public final zzwv zzc(UUID uuid) {
        if (uuid == null) {
            throw new NullPointerException("Null rootTraceId");
        }
        this.zzc = uuid;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzwv
    public final zzwv zzd(long j10) {
        this.zzd = -1L;
        this.zze = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzwv
    public final zzww zze() {
        c0 c0Var;
        c0 c0Var2;
        UUID uuid;
        if (this.zze == 1 && (c0Var = this.zza) != null && (c0Var2 = this.zzb) != null && (uuid = this.zzc) != null) {
            return new zzvp(c0Var, c0Var2, uuid, this.zzd, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" spansNames");
        }
        if (this.zzb == null) {
            sb2.append(" extras");
        }
        if (this.zzc == null) {
            sb2.append(" rootTraceId");
        }
        if (this.zze == 0) {
            sb2.append(qnwOeeQSSWa.MKJwlT);
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
