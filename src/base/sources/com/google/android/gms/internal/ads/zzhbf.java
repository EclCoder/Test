package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhbf extends zzhbh {
    zzhbf(zzgwi zzgwiVar, boolean z10) {
        super(zzgwiVar, z10);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList arrayListZzb = zzgxm.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhbg zzhbgVar = (zzhbg) it.next();
            arrayListZzb.add(zzhbgVar != null ? zzhbgVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZzb);
    }
}
