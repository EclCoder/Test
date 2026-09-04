package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzae extends zzz {
    private final zzah zza;

    zzae(zzah zzahVar, int i10) {
        super(zzahVar.size(), i10);
        this.zza = zzahVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
