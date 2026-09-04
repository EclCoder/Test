package com.google.android.gms.common;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int i10, String str, Intent intent) {
        super(str, intent);
        this.zza = i10;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
