package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzuk implements zzun {
    zzuk() {
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final zzug zza(zzui zzuiVar, zzv zzvVar) {
        if (zzvVar.zzt == null) {
            return null;
        }
        return new zzuo(new zzuf(new zzup(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final int zzb(zzv zzvVar) {
        return zzvVar.zzt != null ? 1 : 0;
    }
}
