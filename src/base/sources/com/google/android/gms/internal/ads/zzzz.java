package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzzz implements Comparator {
    static final /* synthetic */ zzzz zza = new zzzz();

    private /* synthetic */ zzzz() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzaaj) ((List) obj).get(0)).compareTo((zzaaj) ((List) obj2).get(0));
    }
}
