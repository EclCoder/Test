package com.inmobi.media;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: renamed from: com.inmobi.media.sb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3298sb implements GoogleApiClient.ConnectionCallbacks {
    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        kotlin.jvm.internal.s.g(C3350ub.f27620e, "access$getTAG$p(...)");
        C3350ub.f27621f = true;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        C3350ub.f27621f = false;
        kotlin.jvm.internal.s.g(C3350ub.f27620e, "access$getTAG$p(...)");
    }
}
