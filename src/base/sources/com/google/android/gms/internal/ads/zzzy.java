package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzzy implements Comparator {
    static final /* synthetic */ zzzy zza = new zzzy();

    private /* synthetic */ zzzy() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzzx) Collections.max((List) obj)).compareTo((zzzx) Collections.max((List) obj2));
    }
}
