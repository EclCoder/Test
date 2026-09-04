package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zam {
    private final int zaa;
    private final ConnectionResult zab;

    zam(ConnectionResult connectionResult, int i10) {
        Preconditions.checkNotNull(connectionResult);
        this.zab = connectionResult;
        this.zaa = i10;
    }

    final int zaa() {
        return this.zaa;
    }

    final ConnectionResult zab() {
        return this.zab;
    }
}
