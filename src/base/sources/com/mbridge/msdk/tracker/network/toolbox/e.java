package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.tracker.network.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e implements com.mbridge.msdk.tracker.network.c {
    @Override // com.mbridge.msdk.tracker.network.c
    public String a(t<?> tVar) {
        String strT = tVar.t();
        int iG = tVar.g();
        if (iG == 0) {
            return strT;
        }
        return Integer.toString(iG) + '-' + strT;
    }
}
