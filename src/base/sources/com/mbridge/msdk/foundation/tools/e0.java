package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f30875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f30876b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f30877a;

        a(Runnable runnable) {
            this.f30877a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f30877a.run();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("LimitExecutor", e10.getMessage());
                }
            } finally {
                e0.this.a();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        try {
            if (this.f30875a == null) {
                this.f30875a = a(runnable);
                c0.a().execute(this.f30875a);
            } else if (this.f30876b == null) {
                this.f30876b = a(runnable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private Runnable a(Runnable runnable) {
        return new a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Runnable runnable = this.f30876b;
        this.f30875a = runnable;
        this.f30876b = null;
        if (runnable != null) {
            c0.a().execute(this.f30875a);
        }
    }
}
