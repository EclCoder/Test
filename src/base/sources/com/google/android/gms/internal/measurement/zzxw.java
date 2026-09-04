package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzxw extends zzyl {
    zzxw(String str, Class cls, boolean z10) {
        super("tags", cls, false);
    }

    @Override // com.google.android.gms.internal.measurement.zzyl
    public final /* bridge */ /* synthetic */ void zzb(Object obj, zzyk zzykVar) {
        zzabe zzabeVar = (zzabe) obj;
        if (zzabeVar == null) {
            return;
        }
        for (Map.Entry entry : zzabeVar.zzb().entrySet()) {
            if (((Set) entry.getValue()).isEmpty()) {
                zzykVar.zza((String) entry.getKey(), null);
            } else {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    zzykVar.zza((String) entry.getKey(), it.next());
                }
            }
        }
    }
}
