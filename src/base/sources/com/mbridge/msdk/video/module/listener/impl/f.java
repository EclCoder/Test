package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class f implements com.mbridge.msdk.video.module.listener.a {
    @Override // com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        q0.b("NotifyListener", "onNotify,type=" + i10 + ",pt=" + obj);
    }
}
