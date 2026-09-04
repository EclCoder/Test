package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import sc.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzxg extends b0 {
    zzxg() {
    }

    @Override // sc.b0
    public final long read() {
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
