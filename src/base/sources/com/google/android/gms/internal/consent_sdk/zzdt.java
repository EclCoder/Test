package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdt extends zzdq {
    private final zzdv zza;

    zzdt(zzdv zzdvVar, int i10) {
        super(zzdvVar.size(), i10);
        this.zza = zzdvVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdq
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
