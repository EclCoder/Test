package com.google.android.gms.internal.measurement;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaaq implements zzaai {
    private final String zza;
    private final Level zzb;
    private final Set zzc;
    private final zzzq zzd;
    private final int zze;

    private zzaaq(String str, boolean z10, int i10, Level level, boolean z11, Set set, zzzq zzzqVar) {
        this.zza = "";
        this.zze = 2;
        this.zzb = level;
        this.zzc = set;
        this.zzd = zzzqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzaai
    public final zzzf zza(String str) {
        return new zzaas(this.zza, str, true, 2, this.zzb, this.zzc, this.zzd, null);
    }

    public final zzaaq zzb(boolean z10) {
        Set set = this.zzc;
        zzzq zzzqVar = this.zzd;
        return new zzaaq(this.zza, true, 2, Level.OFF, false, set, zzzqVar);
    }

    private zzaaq() {
        this("", true, 2, Level.ALL, false, zzaas.zzb, zzaas.zzc);
    }

    /* synthetic */ zzaaq(byte[] bArr) {
        this("", true, 2, Level.ALL, false, zzaas.zzb, zzaas.zzc);
    }
}
