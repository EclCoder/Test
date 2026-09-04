package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhny extends RuntimeException {
    public zzhny(String str) {
        super(str);
    }

    public static Object zza(zzhnx zzhnxVar) {
        try {
            return zzhnxVar.zza();
        } catch (Exception e10) {
            throw new zzhny(e10);
        }
    }

    public zzhny(String str, Throwable th2) {
        super(str, th2);
    }

    public zzhny(Throwable th2) {
        super(th2);
    }
}
