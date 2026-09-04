package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgxm {
    public static ArrayList zza(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList zzb(int i10) {
        zzgvi.zzb(i10, "initialArraySize");
        return new ArrayList(i10);
    }

    public static List zzc(List list, zzgta zzgtaVar) {
        return list instanceof RandomAccess ? new zzgxj(list, zzgtaVar) : new zzgxl(list, zzgtaVar);
    }
}
