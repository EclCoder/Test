package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends com.facebook.internal.v0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, w.e request) {
        super(context, C.DEFAULT_BUFFER_SEGMENT_SIZE, 65537, 20121101, request.b(), String.valueOf(request.w()), request.u());
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(request, "request");
    }

    @Override // com.facebook.internal.v0
    protected void d(Bundle data) {
        kotlin.jvm.internal.s.h(data, "data");
    }
}
