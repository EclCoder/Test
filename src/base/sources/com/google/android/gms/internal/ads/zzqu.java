package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqu extends Exception {
    public final int zza;
    public final boolean zzb;

    public zzqu(int i10, boolean z10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("AudioOutput write failed: ");
        sb2.append(i10);
        super(sb2.toString());
        this.zzb = z10;
        this.zza = i10;
    }
}
