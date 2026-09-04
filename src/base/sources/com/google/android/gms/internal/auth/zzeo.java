package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzeo {
    private static final zzem zza = new zzen();
    private static final zzem zzb;

    static {
        zzem zzemVar = null;
        try {
            zzemVar = (zzem) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzemVar;
    }

    static zzem zza() {
        zzem zzemVar = zzb;
        if (zzemVar != null) {
            return zzemVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzem zzb() {
        return zza;
    }
}
