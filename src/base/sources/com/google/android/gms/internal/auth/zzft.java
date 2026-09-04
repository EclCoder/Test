package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzft {
    private static final zzfs zza;
    private static final zzfs zzb;

    static {
        zzfs zzfsVar = null;
        try {
            zzfsVar = (zzfs) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzfsVar;
        zzb = new zzfs();
    }

    static zzfs zza() {
        return zza;
    }

    static zzfs zzb() {
        return zzb;
    }
}
