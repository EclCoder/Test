package com.google.android.gms.internal.measurement;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzst implements zzrt {
    private zzst() {
    }

    public static zzst zzb() {
        return new zzst();
    }

    public static final InputStream zzc(zzrs zzrsVar) {
        return (InputStream) zzrsVar.zzc(zzrsVar.zza().zzd(zzrsVar.zzb())).get(0);
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    public final /* bridge */ /* synthetic */ Object zza(zzrs zzrsVar) {
        return zzc(zzrsVar);
    }
}
