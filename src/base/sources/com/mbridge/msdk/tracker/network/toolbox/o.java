package com.mbridge.msdk.tracker.network.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.tracker.network.u;
import com.mbridge.msdk.tracker.network.w;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class o {
    public static u a(com.mbridge.msdk.tracker.network.m mVar, w wVar, int i10, com.mbridge.msdk.tracker.network.b bVar) {
        if (mVar == null) {
            mVar = new b(new h());
        }
        if (wVar == null) {
            wVar = new com.mbridge.msdk.tracker.network.f(new Handler(Looper.getMainLooper()));
        }
        if (i10 <= 0) {
            i10 = 4;
        }
        if (bVar == null) {
            bVar = new l();
        }
        return new u(mVar, wVar, i10, bVar);
    }
}
