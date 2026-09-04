package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface zznc {
    static boolean zzac(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }

    String zzU();

    int zza();

    int zzad(zzv zzvVar);

    int zzu();

    default void zzw() {
    }

    default void zzv(zznb zznbVar) {
    }
}
