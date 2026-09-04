package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzinf {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzinf(int i10, int i11, zzine zzineVar) {
        this.zza = zzimr.zza(i10);
        this.zzb = zzimr.zza(i11);
    }

    public final zzinf zza(zzind zzindVar) {
        this.zza.add(zzindVar);
        return this;
    }

    public final zzinf zzb(zzind zzindVar) {
        this.zzb.add(zzindVar);
        return this;
    }

    public final zzing zzc() {
        return new zzing(this.zza, this.zzb, null);
    }
}
