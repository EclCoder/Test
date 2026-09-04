package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbq<E> extends zzbo<E> {
    private final zzbs<E> zza;

    zzbq(zzbs<E> zzbsVar, int i10) {
        super(zzbsVar.size(), i10);
        this.zza = zzbsVar;
    }

    @Override // com.google.android.gms.internal.location.zzbo
    protected final E zza(int i10) {
        return this.zza.get(i10);
    }
}
