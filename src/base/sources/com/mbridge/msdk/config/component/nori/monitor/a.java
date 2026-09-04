package com.mbridge.msdk.config.component.nori.monitor;

import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    private static boolean H = MBridgeConstans.DEBUG;
    private static final AtomicInteger I = new AtomicInteger(0);
    private static final AtomicInteger J = new AtomicInteger(0);
    private Map<String, Object> F;
    private Map<String, Integer> G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f29041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f29042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f29043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f29044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f29045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f29046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f29047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f29048j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f29049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f29050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f29051m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f29052n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f29053o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f29054p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f29055q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f29056r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f29057s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f29058t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f29059u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f29060v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f29061w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f29062x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f29063y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f29064z = 0;
    private long A = 0;
    private long B = 0;
    private long C = 0;
    private long D = 0;
    private long E = 0;

    public void a(int i10, int i11, int i12) {
        if (this.f29039a) {
            return;
        }
        HashMap map = new HashMap();
        this.G = map;
        map.put("threadPoolSize", Integer.valueOf(i10));
        this.G.put("activeThreads", Integer.valueOf(i11));
        this.G.put("queuedTasks", Integer.valueOf(i12));
    }

    public void b() {
        if (this.f29039a) {
            return;
        }
        l();
    }

    public void c() {
        if (this.f29039a) {
            return;
        }
        this.f29045g = (System.nanoTime() - this.f29055q) / 1000000;
    }

    public void d() {
    }

    public void e() {
        if (this.f29039a) {
            return;
        }
        this.f29055q = System.nanoTime();
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
        if (this.f29039a) {
            return;
        }
        this.f29044f = (System.nanoTime() - this.f29053o) / 1000000;
    }

    public void i() {
        if (this.f29039a) {
            return;
        }
        this.f29053o = System.nanoTime();
    }

    public void k() {
        if (this.f29039a) {
            return;
        }
        this.f29043e = (System.nanoTime() - this.f29051m) / 1000000;
    }

    public void l() {
        if (this.f29039a) {
            return;
        }
        this.f29049k = (System.nanoTime() - this.f29051m) / 1000000;
    }

    public void m() {
        if (this.f29039a) {
            return;
        }
        this.f29051m = System.nanoTime();
    }

    public void n() {
        if (this.f29039a) {
            return;
        }
        this.f29061w = System.nanoTime();
    }

    public void o() {
        if (this.f29039a) {
            return;
        }
        this.f29060v = System.nanoTime();
    }

    public void p() {
        if (this.f29039a) {
            return;
        }
        this.f29059u = System.nanoTime();
    }

    public void q() {
        if (this.f29039a) {
            return;
        }
        this.A = System.nanoTime();
    }

    public void r() {
        if (this.f29039a) {
            return;
        }
        this.f29064z = System.nanoTime();
    }

    public void s() {
        if (this.f29039a) {
            return;
        }
        long jNanoTime = System.nanoTime();
        this.f29063y = jNanoTime;
        this.f29047i = (jNanoTime - this.f29062x) / 1000000;
    }

    public void t() {
        if (this.f29039a) {
            return;
        }
        this.f29057s = System.nanoTime();
    }

    public void u() {
        if (this.f29039a) {
            return;
        }
        this.f29056r = System.nanoTime();
    }

    public Map<String, Object> j() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("isRetry", Boolean.valueOf(this.f29039a));
        map2.put("retryCount", Integer.valueOf(this.f29040b));
        map2.put("requestBodySize", Long.valueOf(this.f29041c));
        map2.put("responseBodySize", Long.valueOf(this.f29042d));
        map.put("basicInfo", map2);
        HashMap map3 = new HashMap();
        map3.put("totalTime", Long.valueOf(this.f29043e));
        map3.put("dnsTime", Long.valueOf(this.f29044f));
        map3.put(IAoPeRfJn.nNtKIIzhpcUDXf, Long.valueOf(this.f29045g));
        map3.put("requestTime", Long.valueOf(this.f29046h));
        map3.put("serverTime", Long.valueOf(this.f29047i));
        map3.put("responseTime", Long.valueOf(this.f29048j));
        map3.put("queueTime", Long.valueOf(this.f29049k));
        map3.put("parsingTime", Long.valueOf(this.f29050l));
        map.put("timingInfo", map3);
        map.put("connectionInfo", this.F);
        map.put("threadPoolInfo", this.G);
        return map;
    }

    public void b(long j10) {
        if (this.f29039a) {
            return;
        }
        this.f29048j = (System.nanoTime() - this.f29063y) / 1000000;
        this.f29042d = j10;
    }

    public void a(boolean z10) {
        this.f29039a = z10;
        if (z10) {
            this.f29040b++;
        }
    }

    public void a(long j10) {
        if (this.f29039a) {
            return;
        }
        this.f29046h = (System.nanoTime() - this.f29059u) / 1000000;
        this.f29041c = j10;
    }

    public void a() {
        if (this.f29039a) {
            return;
        }
        k();
    }

    public void a(IOException iOException) {
        if (this.f29039a) {
            return;
        }
        k();
    }

    public void a(String str) {
        if (H) {
            try {
                int iH = m0.h();
                int iX = m0.x();
                HashMap map = new HashMap();
                map.put("reason", str);
                map.put(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
                map.put("available_memory_mb", Integer.valueOf(iH));
                map.put("total_memory_mb", Integer.valueOf(iX));
                j().put("task_rejection", map);
            } catch (Exception e10) {
                q0.b("NetworkRequestMonitor", "Failed to record task rejection: " + e10.getMessage());
            }
        }
    }
}
