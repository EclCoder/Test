package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class zzgul extends zzgvc implements zzgxh {
    protected zzgul(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    final Collection zza(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    final Collection zzb(Object obj, Collection collection) {
        return zzg(obj, (List) collection, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}
