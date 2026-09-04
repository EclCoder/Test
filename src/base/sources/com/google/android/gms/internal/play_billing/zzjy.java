package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzjy implements zzgs {
    static final zzgs zza = new zzjy();

    private zzjy() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzgs
    public final boolean zza(int i10) {
        zzjz zzjzVar;
        if (i10 == 0) {
            zzjzVar = zzjz.BROADCAST_ACTION_UNSPECIFIED;
        } else if (i10 == 1) {
            zzjzVar = zzjz.PURCHASES_UPDATED_ACTION;
        } else if (i10 == 2) {
            zzjzVar = zzjz.LOCAL_PURCHASES_UPDATED_ACTION;
        } else if (i10 == 3) {
            zzjzVar = zzjz.ALTERNATIVE_BILLING_ACTION;
        } else if (i10 != 4) {
            zzjzVar = i10 != 5 ? null : zzjz.PLAY_BILLING_ACTIVITY_CREATED_ACTION;
        } else {
            zzjzVar = zzjz.IN_APP_BILLING_RESULT_UPDATE_ACTION;
        }
        return zzjzVar != null;
    }
}
