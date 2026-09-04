package com.inmobi.media;

import android.os.Debug;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.pf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3225pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CrashConfig f27203a;

    static {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(CrashConfig.class, "clazz");
        f27203a = (CrashConfig) AbstractC2878c4.f26300a.a(CrashConfig.class);
        System.currentTimeMillis();
    }

    public static void a(JSONObject payload, boolean z10, boolean z11, long j10) {
        int i10;
        int i11;
        long j11;
        long j12;
        long[] jArr;
        kotlin.jvm.internal.s.h(payload, "payload");
        if (f27203a.getCrashConfig().getReportOOMInfo() && z10) {
            AbstractC2853b5 crashType = z11 ? C2827a5.f26168d : Y4.f26057d;
            kotlin.jvm.internal.s.h(crashType, "type");
            La laA = Z9.a();
            if (laA != null) {
                String key = crashType.f26247c;
                kotlin.jvm.internal.s.h(key, "key");
                laA.a(crashType.f26247c, laA.f25198a.getInt(key, 0) + 1, true);
            }
            kotlin.jvm.internal.s.h(crashType, "crashType");
            La laA2 = Z9.a();
            if (laA2 != null) {
                String key2 = crashType.f26245a;
                kotlin.jvm.internal.s.h(key2, "key");
                long j13 = laA2.f25198a.getLong(key2, 0L);
                String str = crashType.f26246b;
                if (j13 == 0) {
                    laA2.a(str, j10, true);
                } else {
                    laA2.a(str, j10 - j13, true);
                }
            }
            if (z11) {
                C2827a5 crashType2 = C2827a5.f26168d;
                kotlin.jvm.internal.s.h(crashType2, "type");
                La laA3 = Z9.a();
                if (laA3 != null) {
                    String key3 = crashType2.f26247c;
                    kotlin.jvm.internal.s.h(key3, "key");
                    i10 = laA3.f25198a.getInt(key3, 0);
                } else {
                    i10 = 0;
                }
                Y4 crashType3 = Y4.f26057d;
                kotlin.jvm.internal.s.h(crashType3, "type");
                La laA4 = Z9.a();
                if (laA4 != null) {
                    String key4 = crashType3.f26247c;
                    kotlin.jvm.internal.s.h(key4, "key");
                    i11 = laA4.f25198a.getInt(key4, 0);
                } else {
                    i11 = 0;
                }
                int i12 = i10 + i11;
                float f10 = i12 > 0 ? (i10 * 100.0f) / i12 : 0.0f;
                payload.put("inmobiOOMCount", i10);
                payload.put("appOOMCount", i11);
                kotlin.jvm.internal.s.h(crashType3, "crashType");
                La laA5 = Z9.a();
                if (laA5 != null) {
                    String key5 = crashType3.f26246b;
                    kotlin.jvm.internal.s.h(key5, "key");
                    j11 = laA5.f25198a.getLong(key5, 0L);
                } else {
                    j11 = 0;
                }
                payload.put("appOomCrashInterval", j11);
                kotlin.jvm.internal.s.h(crashType2, "crashType");
                La laA6 = Z9.a();
                if (laA6 != null) {
                    String key6 = crashType2.f26246b;
                    kotlin.jvm.internal.s.h(key6, "key");
                    j12 = laA6.f25198a.getLong(key6, 0L);
                } else {
                    j12 = 0;
                }
                payload.put("inmOOMCrashInterval", j12);
                payload.put("oomRatioInMobiToApp", Float.valueOf(f10));
                B5.f24500a.getClass();
                if (B5.y()) {
                    long jLongValue = 0;
                    long jLongValue2 = 0;
                    for (Map.Entry<String, String> entry : Debug.getRuntimeStats().entrySet()) {
                        String key7 = entry.getKey();
                        String value = entry.getValue();
                        if (kotlin.jvm.internal.s.c(key7, "art.gc.blocking-gc-count")) {
                            kotlin.jvm.internal.s.e(value);
                            Long lS = bm.r.s(value);
                            jLongValue = lS != null ? lS.longValue() : 0L;
                        } else if (kotlin.jvm.internal.s.c(key7, "art.gc.gc-count")) {
                            kotlin.jvm.internal.s.e(value);
                            Long lS2 = bm.r.s(value);
                            jLongValue2 = lS2 != null ? lS2.longValue() : 0L;
                        }
                    }
                    jArr = new long[]{jLongValue, jLongValue2};
                } else {
                    jArr = null;
                }
                if (jArr != null) {
                    payload.put("blockingGcCount", jArr[0]);
                    payload.put("gcCount", jArr[1]);
                }
            }
        }
    }
}
