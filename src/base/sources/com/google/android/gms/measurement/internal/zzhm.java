package com.google.android.gms.measurement.internal;

import androidx.collection.n;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhm extends n {
    final /* synthetic */ zzht zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhm(zzht zzhtVar, int i10) {
        super(20);
        Objects.requireNonNull(zzhtVar);
        this.zza = zzhtVar;
    }

    @Override // androidx.collection.n
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return this.zza.zzD(str);
    }
}
