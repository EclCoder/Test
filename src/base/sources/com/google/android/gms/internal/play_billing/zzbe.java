package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbe extends zzbq {
    zzbe() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final long zza() {
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
