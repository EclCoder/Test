package com.mbridge.msdk.tracker;

import android.util.Log;
import com.mbridge.msdk.tracker.network.b0;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f33902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f33904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f33905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f33906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.u f33907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f33908g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeReportResponseThread");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements com.mbridge.msdk.tracker.network.v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f33910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f33911b;

        public b(r rVar, t tVar) {
            this.f33910a = rVar;
            this.f33911b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.v.a
        public void a(b0 b0Var) {
            int iD;
            int iG;
            String message;
            if (y.a(this.f33910a)) {
                if (b0Var != null) {
                    try {
                        iD = b0Var.d();
                        iG = b0Var.g();
                        message = b0Var.getMessage();
                    } catch (Exception e10) {
                        if (com.mbridge.msdk.tracker.a.f33703a) {
                            Log.e("TrackManager", "onErrorResponse error", e10);
                            return;
                        }
                        return;
                    }
                } else {
                    message = "";
                    iD = 0;
                    iG = 0;
                }
                this.f33910a.a(this.f33911b, 0, String.format("volleyError:%s,responseCode:%s,errorMessage:%s", Integer.valueOf(iD), Integer.valueOf(iG), message));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements com.mbridge.msdk.tracker.network.v.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f33912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f33913b;

        public c(r rVar, t tVar) {
            this.f33912a = rVar;
            this.f33913b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.v.b
        public void a(Object obj) {
            if (y.a(this.f33912a)) {
                try {
                    this.f33912a.a(this.f33913b);
                } catch (Exception e10) {
                    if (com.mbridge.msdk.tracker.a.f33703a) {
                        Log.e("TrackManager", "onResponse error", e10);
                    }
                }
            }
        }
    }

    public o(int i10, p pVar, w wVar, int i11) {
        this.f33903b = i10;
        this.f33904c = pVar;
        this.f33905d = wVar;
        this.f33906e = i11;
        this.f33908g = new ThreadPoolExecutor(i10, i10, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public void a(r rVar) {
        this.f33902a = rVar;
    }

    public void b(t tVar, Map<String, String> map, boolean z10) {
        if (y.b(map)) {
            r rVar = this.f33902a;
            if (rVar != null) {
                try {
                    rVar.a(tVar, 0, "params is null");
                    return;
                } catch (Exception e10) {
                    if (com.mbridge.msdk.tracker.a.f33703a) {
                        Log.e("TrackManager", "send error", e10);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        try {
            a();
            this.f33907f.a(a(tVar, map, z10));
        } catch (Exception e11) {
            if (com.mbridge.msdk.tracker.a.f33703a) {
                Log.e("TrackManager", "send error", e11);
            }
            if (y.a(this.f33902a)) {
                this.f33902a.a(tVar, 0, e11.getMessage());
            }
        }
    }

    private v<Object> a(t tVar, Map<String, String> map, boolean z10) {
        v<Object> vVar = this.f33906e == 1 ? new v<>(this.f33904c.c(), 1, this.f33904c.a()) : new v<>(this.f33904c.c(), 1);
        vVar.a(map);
        vVar.a(false);
        vVar.c(true);
        vVar.b(true);
        vVar.a(this.f33905d);
        vVar.a(z10 ? com.mbridge.msdk.tracker.network.t.a.HIGH : com.mbridge.msdk.tracker.network.t.a.NORMAL);
        vVar.a((com.mbridge.msdk.tracker.network.v.b<Object>) new c(this.f33902a, tVar));
        vVar.a((com.mbridge.msdk.tracker.network.v.a) new b(this.f33902a, tVar));
        return vVar;
    }

    private void a() {
        if (y.a(this.f33907f)) {
            return;
        }
        com.mbridge.msdk.tracker.network.u uVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(this.f33904c.b()), new com.mbridge.msdk.tracker.network.f(this.f33908g), this.f33903b, null);
        this.f33907f = uVarA;
        uVarA.b();
    }
}
