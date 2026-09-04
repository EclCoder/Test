package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzibs extends zzibu {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzibs(zzibt zzibtVar) {
        super(zzibtVar.zza);
        Objects.requireNonNull(zzibtVar);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza().zzf;
    }
}
