package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class SystemClock implements Clock {
    SystemClock() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.Clock
    public HandlerWrapper createHandler(Looper looper, Handler.Callback callback) {
        return new SystemHandlerWrapper(new Handler(looper, callback));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.Clock
    public long elapsedRealtime() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.Clock
    public void sleep(long j10) {
        android.os.SystemClock.sleep(j10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.Clock
    public long uptimeMillis() {
        return android.os.SystemClock.uptimeMillis();
    }
}
