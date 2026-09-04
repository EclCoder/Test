package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import java.util.LinkedHashMap;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Xa {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    public static void a(String telemetryEventName, C2988gb c2988gb, String reason, Long l10) {
        Integer numValueOf;
        int i10;
        kotlin.jvm.internal.s.h(telemetryEventName, "telemetryEventName");
        if (c2988gb != null) {
            if (reason != null) {
                kotlin.jvm.internal.s.h(reason, "reason");
                switch (reason) {
                    case "PAGE_COMMIT_VISIBLE":
                        i10 = 2404;
                        break;
                    case "LOADER_TIMEOUT":
                        i10 = 2405;
                        break;
                    case "RECEIVED_ERROR":
                        i10 = 2403;
                        break;
                    case "UNKNOWN":
                        i10 = 2407;
                        break;
                    case "RENDER_PROCESS_GONE":
                        i10 = 2401;
                        break;
                    case "RECEIVED_HTTP_ERROR":
                        i10 = 2402;
                        break;
                    case "ACTIVITY_STOP":
                        i10 = 2406;
                        break;
                    default:
                        i10 = 0;
                        break;
                }
                numValueOf = Integer.valueOf(i10);
            } else {
                numValueOf = null;
            }
            LinkedHashMap linkedHashMapA = a(c2988gb, numValueOf);
            if (l10 != null) {
                linkedHashMapA.put("latency", Long.valueOf(l10.longValue()));
            }
            em.k.d(H9.f24930c, null, null, new Wa(linkedHashMapA, telemetryEventName, null), 3, null);
        }
    }

    public static void a(Ua funnelState, C2988gb c2988gb, Integer num, tl.o oVar) {
        kotlin.jvm.internal.s.h(funnelState, "funnelState");
        if (c2988gb == null || funnelState.f25827c <= c2988gb.f26601e) {
            return;
        }
        LinkedHashMap linkedHashMapA = a(c2988gb, num);
        long j10 = c2988gb.f26600d;
        if (j10 != 0) {
            em.o0 o0Var = AbstractC3488zl.f28033a;
            linkedHashMapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        }
        c2988gb.f26601e = funnelState.f25827c;
        em.k.d(H9.f24930c, null, null, new Va(linkedHashMapA, funnelState, null), 3, null);
        int i10 = c2988gb.f26599c;
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(TelemetryConfig.class, "clazz");
        if (i10 > ((TelemetryConfig) AbstractC2878c4.f26300a.a(TelemetryConfig.class)).getLpConfig().getMaxFunnelsToTrackPerAd() || oVar == null) {
            return;
        }
        String str = funnelState.f25826b;
        String str2 = c2988gb.f26602f;
        if (str2 == null) {
            str2 = c2988gb.f26597a.f26674i;
        }
        oVar.invoke(str, gl.l0.l(fl.w.a("$OPENMODE", str2), fl.w.a("$URLTYPE", c2988gb.f26598b)));
    }

    public static String a(String str) {
        if (str == null || str.length() == 0 || !bm.r.T(str, "://", false, 2, null)) {
            return "invalid";
        }
        if (bm.r.L(str, "inmobideeplink://", true)) {
            return "inmobideeplink";
        }
        if (bm.r.L(str, "inmobinativebrowser://", true)) {
            return "inmobinativebrowser";
        }
        if (bm.r.L(str, "https://", true)) {
            return "https";
        }
        if (bm.r.L(str, "http://", true)) {
            return "http";
        }
        return bm.r.L(str, "market://", true) ? "market" : HqKnbV.eSc;
    }

    public static LinkedHashMap a(C2988gb c2988gb, Integer num) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Saucuwx.aeHpvDPzM, c2988gb.f26597a.f26668c);
        linkedHashMap.put("impressionId", c2988gb.f26597a.f26667b);
        linkedHashMap.put("plId", Long.valueOf(c2988gb.f26597a.f26666a));
        linkedHashMap.put("adType", c2988gb.f26597a.f26669d);
        linkedHashMap.put("markupType", c2988gb.f26597a.f26670e);
        linkedHashMap.put("creativeType", c2988gb.f26597a.f26671f);
        linkedHashMap.put("metadataBlob", c2988gb.f26597a.f26672g);
        linkedHashMap.put("isRewarded", Boolean.valueOf(c2988gb.f26597a.f26673h));
        String str = c2988gb.f26602f;
        if (str == null) {
            str = c2988gb.f26597a.f26674i;
        }
        linkedHashMap.put("trigger", str);
        linkedHashMap.put("urlType", c2988gb.f26598b);
        if (num != null) {
            linkedHashMap.put("errorCode", num);
        }
        return linkedHashMap;
    }
}
