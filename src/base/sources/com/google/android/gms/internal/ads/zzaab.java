package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzaab implements Comparator {
    static final /* synthetic */ zzaab zza = new zzaab();

    private /* synthetic */ zzaab() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = (List) obj2;
        List list2 = (List) obj;
        return zzgvz.zzg().zza((zzaax) Collections.max(list2, zzaaw.zza), (zzaax) Collections.max(list, zzaar.zza), zzaas.zza).zzb(list2.size(), list.size()).zza((zzaax) Collections.max(list2, zzaat.zza), (zzaax) Collections.max(list, zzaau.zza), zzaav.zza).zze();
    }
}
