package com.mbridge.msdk.tracker.network;

import android.os.Handler;
import java.util.concurrent.Executor;
import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class f implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f33777a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f33778a;

        a(Handler handler) {
            this.f33778a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f33778a.post(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    private static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f33780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v f33781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f33782c;

        public b(t tVar, v vVar, Runnable runnable) {
            this.f33780a = tVar;
            this.f33781b = vVar;
            this.f33782c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f33780a.v()) {
                this.f33780a.c("canceled-at-delivery");
                return;
            }
            if (this.f33781b.a()) {
                this.f33780a.a(this.f33781b.f33898a);
            } else {
                this.f33780a.b(this.f33781b.f33900c);
            }
            if (this.f33781b.f33901d) {
                this.f33780a.a("intermediate-response");
            } else {
                this.f33780a.c("done");
            }
            Runnable runnable = this.f33782c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public f(Handler handler) {
        this.f33777a = new a(handler);
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, v<?> vVar) {
        a(tVar, vVar, null);
    }

    public void a(t<?> tVar, v<?> vVar, Runnable runnable) {
        tVar.w();
        tVar.a("post-response");
        this.f33777a.execute(new b(tVar, vVar, runnable));
    }

    public f(Executor executor) {
        this.f33777a = executor;
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, b0 b0Var) {
        tVar.a(OGoz.mZclWaYsMhA);
        this.f33777a.execute(new b(tVar, v.a(b0Var), null));
    }
}
