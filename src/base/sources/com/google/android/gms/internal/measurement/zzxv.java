package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzxv extends zzyl {
    zzxv(String str, Class cls, boolean z10) {
        super("group_by", cls, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzyl
    public final void zza(Iterator it, zzyk zzykVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                zzykVar.zza(zzd(), next);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            sb2.append(next);
            do {
                sb2.append(',');
                sb2.append(it.next());
            } while (it.hasNext());
            String strZzd = zzd();
            sb2.append(']');
            zzykVar.zza(strZzd, sb2.toString());
        }
    }
}
