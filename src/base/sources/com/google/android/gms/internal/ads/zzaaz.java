package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaaz {
    public final zzbg zza;
    public final int[] zzb;

    public zzaaz(zzbg zzbgVar, int[] iArr, int i10) {
        if (iArr.length == 0) {
            zzeg.zzf("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbgVar;
        this.zzb = iArr;
    }
}
