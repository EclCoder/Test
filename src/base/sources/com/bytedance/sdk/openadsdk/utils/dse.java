package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    static float f14633hn = 0.0f;
    static int hnj = -1;
    private static long qor;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public final float f14634hn;
        public final int hnj;

        public hnj(int i10, float f10) {
            this.hnj = i10;
            this.f14634hn = f10;
        }
    }

    private static void hnj(Intent intent) {
        if (intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) == 2) {
            hnj = 1;
        } else {
            hnj = 0;
        }
        f14633hn = (intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1);
    }

    public static hnj hnj() {
        if (qor == 0 || SystemClock.elapsedRealtime() - qor > ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
            Intent intentRegisterReceiver = com.bytedance.sdk.openadsdk.core.oj.hnj().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(intentRegisterReceiver)));
            if (intentRegisterReceiver != null) {
                hnj(intentRegisterReceiver);
                qor = SystemClock.elapsedRealtime();
            }
        }
        return new hnj(hnj, f14633hn);
    }
}
