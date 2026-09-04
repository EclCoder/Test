package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class g implements com.mbridge.msdk.video.signal.i {
    @Override // com.mbridge.msdk.video.signal.i
    public void a(String str) {
        q0.a("js", "setOrientation,landscape=" + str);
    }

    @Override // com.mbridge.msdk.video.signal.i
    public String b() {
        q0.a("js", "getEndScreenInfo");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void handlerPlayableException(String str) {
        q0.a("js", "handlerPlayableException，msg=" + str);
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        q0.a("js", "notifyCloseBtn,state=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        q0.a("js", "toggleCloseBtn,state=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void triggerCloseBtn(String str) {
        q0.a("js", "triggerCloseBtn,state=" + str);
    }
}
