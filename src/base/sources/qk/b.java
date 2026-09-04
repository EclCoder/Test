package qk;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import ok.h;
import rk.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class b extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f50882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f50883c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f50884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f50885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f50886c;

        a(Handler handler, boolean z10) {
            this.f50884a = handler;
            this.f50885b = z10;
        }

        @Override // ok.h.b
        public rk.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f50886c) {
                return c.a();
            }
            RunnableC0785b runnableC0785b = new RunnableC0785b(this.f50884a, cl.a.l(runnable));
            Message messageObtain = Message.obtain(this.f50884a, runnableC0785b);
            messageObtain.obj = this;
            if (this.f50885b) {
                messageObtain.setAsynchronous(true);
            }
            this.f50884a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
            if (!this.f50886c) {
                return runnableC0785b;
            }
            this.f50884a.removeCallbacks(runnableC0785b);
            return c.a();
        }

        @Override // rk.b
        public void d() {
            this.f50886c = true;
            this.f50884a.removeCallbacksAndMessages(this);
        }
    }

    /* JADX INFO: renamed from: qk.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class RunnableC0785b implements Runnable, rk.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f50887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f50888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f50889c;

        RunnableC0785b(Handler handler, Runnable runnable) {
            this.f50887a = handler;
            this.f50888b = runnable;
        }

        @Override // rk.b
        public void d() {
            this.f50887a.removeCallbacks(this);
            this.f50889c = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f50888b.run();
            } catch (Throwable th2) {
                cl.a.k(th2);
            }
        }
    }

    b(Handler handler, boolean z10) {
        this.f50882b = handler;
        this.f50883c = z10;
    }

    @Override // ok.h
    public h.b a() {
        return new a(this.f50882b, this.f50883c);
    }

    @Override // ok.h
    public rk.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        RunnableC0785b runnableC0785b = new RunnableC0785b(this.f50882b, cl.a.l(runnable));
        Message messageObtain = Message.obtain(this.f50882b, runnableC0785b);
        if (this.f50883c) {
            messageObtain.setAsynchronous(true);
        }
        this.f50882b.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
        return runnableC0785b;
    }
}
