package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zacq implements Runnable {
    final /* synthetic */ zact zaa;

    zacq(zact zactVar) {
        this.zaa = zactVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zaa.zah.zae(new ConnectionResult(4));
    }
}
