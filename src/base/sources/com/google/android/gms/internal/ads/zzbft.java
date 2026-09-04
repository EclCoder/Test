package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbft implements Comparator {
    zzbft(zzbfv zzbfvVar) {
        Objects.requireNonNull(zzbfvVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbfy zzbfyVar = (zzbfy) obj;
        zzbfy zzbfyVar2 = (zzbfy) obj2;
        int i10 = zzbfyVar.zzc - zzbfyVar2.zzc;
        return i10 != 0 ? i10 : Long.compare(zzbfyVar.zza, zzbfyVar2.zza);
    }
}
