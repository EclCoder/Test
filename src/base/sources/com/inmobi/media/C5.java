package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C5 {
    public static final int a() {
        int i10 = Resources.getSystem().getDisplayMetrics().densityDpi;
        if (640 <= i10 && i10 <= Integer.MAX_VALUE) {
            return 1080;
        }
        if (480 <= i10 && i10 < 640) {
            return 720;
        }
        if (320 <= i10 && i10 < 480) {
            return 480;
        }
        if (240 > i10 || i10 >= 320) {
            return PsExtractor.VIDEO_STREAM_MASK;
        }
        return 360;
    }

    public static final boolean a(Context context) {
        kotlin.jvm.internal.s.h(context, "<this>");
        Object systemService = context.getSystemService("activity");
        kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) systemService;
        kotlin.jvm.internal.s.h(activityManager, "<this>");
        B5.f24500a.getClass();
        if (!(B5.w() ? activityManager.isLowRamDevice() : true)) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.availMem / ((long) ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) >= 100) {
                return false;
            }
        }
        return true;
    }
}
