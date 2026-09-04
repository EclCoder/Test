package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbgb implements Comparator {
    public zzbgb(zzbgc zzbgcVar) {
        Objects.requireNonNull(zzbgcVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbfr zzbfrVar = (zzbfr) obj;
        zzbfr zzbfrVar2 = (zzbfr) obj2;
        if (zzbfrVar.zzb() < zzbfrVar2.zzb()) {
            return -1;
        }
        if (zzbfrVar.zzb() > zzbfrVar2.zzb()) {
            return 1;
        }
        if (zzbfrVar.zza() < zzbfrVar2.zza()) {
            return -1;
        }
        if (zzbfrVar.zza() > zzbfrVar2.zza()) {
            return 1;
        }
        float fZzd = (zzbfrVar.zzd() - zzbfrVar.zzb()) * (zzbfrVar.zzc() - zzbfrVar.zza());
        float fZzd2 = (zzbfrVar2.zzd() - zzbfrVar2.zzb()) * (zzbfrVar2.zzc() - zzbfrVar2.zza());
        if (fZzd > fZzd2) {
            return -1;
        }
        return fZzd < fZzd2 ? 1 : 0;
    }
}
