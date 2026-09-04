package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zabx extends BroadcastReceiver {
    Context zaa;
    private final zabw zab;

    public zabx(zabw zabwVar) {
        this.zab = zabwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.zab.zaa();
            zab();
        }
    }

    public final void zaa(Context context) {
        this.zaa = context;
    }

    public final synchronized void zab() {
        try {
            Context context = this.zaa;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.zaa = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
