package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import n1.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class GCoreWakefulBroadcastReceiver extends a {
    public static boolean completeWakefulIntent(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        return a.completeWakefulIntent(intent);
    }
}
