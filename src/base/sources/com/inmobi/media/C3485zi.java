package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: renamed from: com.inmobi.media.zi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3485zi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3331ti f28023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f28024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f28025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f28028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f28029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f28030h;

    public C3485zi(C3331ti renderViewMetaData) {
        kotlin.jvm.internal.s.h(renderViewMetaData, "renderViewMetaData");
        this.f28023a = renderViewMetaData;
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(TelemetryConfig.class, "clazz");
        TelemetryConfig telemetryConfig = (TelemetryConfig) AbstractC2878c4.f26300a.a(TelemetryConfig.class);
        C3460yi c3460yi = renderViewMetaData.f27568k;
        this.f28028f = new AtomicInteger(c3460yi != null ? c3460yi.f27958a : telemetryConfig.getMaxTemplateEvents());
        this.f28029g = new AtomicBoolean(false);
    }

    public final void a(int i10) {
        short s10;
        Context context = Xi.f26021a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = La.f25197b;
            La laA = Ka.a(context, SVWsZyNSAChGIA.kIADYEbxbAPuPhj);
            String str = A1.f24431c;
            if (str == null) {
                str = "unknown";
            }
            kotlin.jvm.internal.s.h("last_app_version", "key");
            if (kotlin.jvm.internal.s.c(laA.f25198a.getString("last_app_version", null), str)) {
                return;
            }
            Map mapA = a();
            switch (i10) {
                case 8800:
                    s10 = 2365;
                    break;
                case 8801:
                default:
                    s10 = (short) i10;
                    break;
                case 8802:
                    s10 = 2366;
                    break;
                case 8803:
                    s10 = 2367;
                    break;
                case 8804:
                    s10 = 2368;
                    break;
            }
            mapA.put("errorCode", Short.valueOf(s10));
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("VideoPlayerNotSupported", mapA, EnumC3281rk.SDK);
            laA.a("last_app_version", str, false);
        }
    }

    public final void b() {
        String strA = a("WebViewLoadCalled");
        this.f28025c = SystemClock.elapsedRealtime();
        Map mapA = a();
        if (kotlin.jvm.internal.s.c(strA, "CompanionWebViewLoadCalled")) {
            long j10 = this.f28024b;
            em.o0 o0Var = AbstractC3488zl.f28033a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        } else {
            C3237q1 c3237q1 = this.f28023a.f27567j;
            if (c3237q1 != null) {
                long j11 = c3237q1.f27301a.f27363c;
                em.o0 o0Var2 = AbstractC3488zl.f28033a;
                mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j11));
            }
        }
        mapA.put("creativeId", this.f28023a.f27564g);
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b(strA, mapA, EnumC3281rk.SDK);
    }

    public final void a(String eventType, String str) {
        kotlin.jvm.internal.s.h(eventType, "eventType");
        if (this.f28029g.get()) {
            return;
        }
        if (this.f28028f.decrementAndGet() <= 0) {
            this.f28029g.set(true);
            Map mapA = a();
            long j10 = this.f28025c;
            em.o0 o0Var = AbstractC3488zl.f28033a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("TemplateEventDropped", mapA, EnumC3281rk.SDK);
            return;
        }
        if (str != null) {
            try {
                if (new JSONObject(str).length() == 0) {
                    str = null;
                }
            } catch (JSONException e10) {
                Log.e(C3178nk.f27066c, "Error parsing JSON: " + e10);
            }
        }
        String str2 = this.f28023a.f27569l;
        if (str2 == null) {
            str2 = "";
        }
        Map mapM = gl.l0.m(fl.w.a("trigger", str2), fl.w.a("plType", String.valueOf(this.f28023a.f27558a.f27664f)), fl.w.a("impressionId", this.f28023a.f27560c), fl.w.a("markupType", this.f28023a.f27559b), fl.w.a("networkType", B5.g()));
        if (str != null) {
            mapM.put("payload", str);
        }
        if (this.f28023a.f27561d.length() > 0) {
            mapM.put("metadataBlob", this.f28023a.f27561d);
        }
        C3178nk.b(eventType, mapM, EnumC3281rk.TEMPLATE);
    }

    public final void a(boolean z10, short s10) {
        String strA = a("WebViewRenderProcessGoneEvent");
        String str = this.f28023a.f27569l;
        if (str == null) {
            str = "";
        }
        fl.q qVarA = fl.w.a("trigger", str);
        long j10 = this.f28025c;
        em.o0 o0Var = AbstractC3488zl.f28033a;
        Map mapM = gl.l0.m(qVarA, fl.w.a("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10)), fl.w.a("source", "render_view_" + this.f28023a.f27558a.f27663e), fl.w.a("isCrashed", Boolean.valueOf(z10)), fl.w.a("creativeId", this.f28023a.f27564g), fl.w.a("errorCode", Short.valueOf(s10)));
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b(strA, mapM, EnumC3281rk.SDK);
    }

    public final void a(long j10, Short sh2) {
        Map mapA = a();
        em.o0 o0Var = AbstractC3488zl.f28033a;
        mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        if (sh2 != null) {
            mapA.put("errorCode", Short.valueOf(sh2.shortValue()));
        }
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("HtmlUrlPrefetchCompleted", mapA, EnumC3281rk.SDK);
    }

    public final Map a() {
        String str = this.f28023a.f27569l;
        if (str == null) {
            str = "";
        }
        Map mapM = gl.l0.m(fl.w.a("trigger", str), fl.w.a("plType", String.valueOf(this.f28023a.f27558a.f27664f)), fl.w.a("plId", String.valueOf(this.f28023a.f27558a.f27659a)), fl.w.a("adType", String.valueOf(this.f28023a.f27558a.f27663e)), fl.w.a("markupType", this.f28023a.f27559b), fl.w.a("networkType", B5.g()), fl.w.a("retryCount", String.valueOf(this.f28023a.f27562e)), fl.w.a("creativeType", this.f28023a.f27563f), fl.w.a("adPosition", String.valueOf(this.f28023a.f27566i)), fl.w.a("isRewarded", String.valueOf(this.f28023a.f27565h)), fl.w.a("impressionId", this.f28023a.f27560c));
        if (this.f28023a.f27561d.length() > 0) {
            mapM.put("metadataBlob", this.f28023a.f27561d);
        }
        return mapM;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String a(String str) {
        if (!kotlin.jvm.internal.s.c(this.f28023a.f27569l, "default")) {
            switch (str.hashCode()) {
                case -1395724590:
                    if (str.equals("PageStarted")) {
                        return "CompanionWebViewPageStarted";
                    }
                    break;
                case -81019210:
                    if (str.equals("FireAdFailed")) {
                        return "CompanionFireAdFailed";
                    }
                    break;
                case 147127306:
                    if (str.equals("FireAdReady")) {
                        return "CompanionFireAdReady";
                    }
                    break;
                case 260281564:
                    if (str.equals("WebViewLoadCalled")) {
                        return "CompanionWebViewLoadCalled";
                    }
                    break;
                case 520950289:
                    if (str.equals("WebViewLoadFinished")) {
                        return "CompanionWebViewLoadFinished";
                    }
                    break;
                case 570988141:
                    if (str.equals("RenderProcessResponsive")) {
                        return "RenderProcessResponsive";
                    }
                    break;
                case 1001819046:
                    if (str.equals("RenderProcessUnResponsive")) {
                        return "CompanionRenderProcessUnResponsive";
                    }
                    break;
            }
        }
        return str;
    }
}
