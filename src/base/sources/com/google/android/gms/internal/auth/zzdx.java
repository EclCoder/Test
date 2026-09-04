package com.google.android.gms.internal.auth;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdx implements Comparator {
    zzdx() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzef zzefVar = (zzef) obj;
        zzef zzefVar2 = (zzef) obj2;
        zzdw zzdwVar = new zzdw(zzefVar);
        zzdw zzdwVar2 = new zzdw(zzefVar2);
        while (zzdwVar.hasNext() && zzdwVar2.hasNext()) {
            int iCompareTo = Integer.valueOf(zzdwVar.zza() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED).compareTo(Integer.valueOf(zzdwVar2.zza() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzefVar.zzd()).compareTo(Integer.valueOf(zzefVar2.zzd()));
    }
}
