package com.apm.insight.runtime;

import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f10960a = -30000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static File f10961b;

    public static void a(long j10) throws Throwable {
        if (j10 - f10960a < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            return;
        }
        f10960a = j10;
        try {
            if (f10961b == null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                f10961b = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS)) / com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS) + mTFeqtajA.COgZCLk + com.apm.insight.e.f());
            }
            com.apm.insight.l.f.a(f10961b, String.valueOf(System.currentTimeMillis()), false);
        } catch (IOException unused) {
        }
    }

    public static String a(long j10, String str) {
        try {
            return com.apm.insight.l.f.a(new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/" + ((j10 - (j10 % com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS)) / com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS) + "/" + str), "\n");
        } catch (Throwable th2) {
            return th2.getMessage();
        }
    }

    public static void a() {
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i10 = 0; i10 < list.length - 5; i10++) {
                com.apm.insight.l.f.a(new File(file, list[i10]));
            }
        }
    }
}
