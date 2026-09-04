package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.google.android.gms.location.GeofenceStatusCodes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzihu implements zziek {
    static final zziek zza = new zzihu();

    private zzihu() {
    }

    @Override // com.google.android.gms.internal.ads.zziek
    public final boolean zza(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 1999) {
            switch (i10) {
                case 1000:
                case 1001:
                case 1002:
                case BackupConstant.SCENE_CLOSED_WITHOUT_SHOW /* 1003 */:
                case 1004:
                case GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT /* 1005 */:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                case TTAdConstant.IMAGE_MODE_1010 /* 1010 */:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
