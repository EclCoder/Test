package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgxb extends zzguk {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzgtk zzb;

    zzgxb(Iterator it, zzgtk zzgtkVar) {
        this.zza = it;
        this.zzb = zzgtkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    protected final Object zza() {
        zzgtk zzgtkVar;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            zzgtkVar = this.zzb;
            next = it.next();
        } while (!zzgtkVar.zza(next));
        return next;
    }
}
