package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.inmobi.media.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3079k extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (kotlin.jvm.internal.s.c(intent != null ? intent.getAction() : null, "android.media.VOLUME_CHANGED_ACTION")) {
            C3235q c3235q = C3235q.f27289a;
            B5.f24500a.getClass();
            if (B5.y()) {
                em.k.d(C3235q.f27295g, null, null, new C3131m(null), 3, null);
            } else {
                C3235q.a((Float) null);
            }
        }
    }
}
