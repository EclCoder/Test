package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzti implements zzth {
    private final Object zza;

    private zzti(Object obj) {
        this.zza = obj;
    }

    public static zzth zza(Object obj) {
        if (obj != null) {
            return new zzti(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final Object zzb() {
        return this.zza;
    }
}
