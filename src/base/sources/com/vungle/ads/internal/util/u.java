package com.vungle.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends BroadcastReceiver {
    private r listener;

    public final r getListener() {
        return this.listener;
    }

    public final void setListener(r rVar) {
        this.listener = rVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        r rVar;
        String str = PvZsvNiPV.HBxYcvHp;
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (Exception e10) {
                String localizedMessage = e10.getLocalizedMessage();
                if (localizedMessage != null) {
                    q.Companion.e(str, localizedMessage);
                    return;
                }
                return;
            }
        } else {
            action = null;
        }
        if (kotlin.jvm.internal.s.c(action, "android.media.RINGER_MODE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
            q.Companion.d(str, "receive ringermode: " + intExtra);
            if (intExtra == 0) {
                r rVar2 = this.listener;
                if (rVar2 != null) {
                    rVar2.notifySilentModeChange(true);
                    return;
                }
                return;
            }
            if (intExtra != 1) {
                if (intExtra == 2 && (rVar = this.listener) != null) {
                    rVar.notifySilentModeChange(false);
                    return;
                }
                return;
            }
            r rVar3 = this.listener;
            if (rVar3 != null) {
                rVar3.notifySilentModeChange(true);
            }
        }
    }
}
