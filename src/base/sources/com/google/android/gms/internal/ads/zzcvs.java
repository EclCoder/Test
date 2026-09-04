package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class zzcvs {
    private final zzcxr zza;
    private final View zzb;
    private final zzfkg zzc;
    private final zzcku zzd;

    public zzcvs(View view, zzcku zzckuVar, zzcxr zzcxrVar, zzfkg zzfkgVar) {
        this.zzb = view;
        this.zzd = zzckuVar;
        this.zza = zzcxrVar;
        this.zzc = zzfkgVar;
    }

    public final zzcku zza() {
        return this.zzd;
    }

    public final View zzb() {
        return this.zzb;
    }

    public final zzcxr zzc() {
        return this.zza;
    }

    public final zzfkg zzd() {
        return this.zzc;
    }

    public zzded zze(Set set) {
        return new zzded(set);
    }
}
