package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzevq implements zzgta {
    static final /* synthetic */ zzevq zza = new zzevq();

    private /* synthetic */ zzevq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (true == arrayList.isEmpty()) {
            arrayList = null;
        }
        return new zzevs(arrayList);
    }
}
