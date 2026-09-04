package com.mbridge.msdk.foundation.same.report.crashreport;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c extends Thread {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile c f30674e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f30675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile b f30676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.crashreport.a f30677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30678d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f30679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f30680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f30681c;

        private b() {
            this.f30679a = SystemClock.uptimeMillis();
        }

        void b() {
            this.f30680b = false;
            this.f30681c = SystemClock.uptimeMillis();
            c.this.f30675a.postAtFrontOfQueue(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                this.f30680b = true;
                this.f30679a = SystemClock.uptimeMillis();
            }
        }

        boolean a() {
            return !this.f30680b || this.f30679a - this.f30681c >= ((long) c.this.f30678d);
        }
    }

    private c() {
        super("AnrMonitor-Thread");
        this.f30675a = new Handler(Looper.getMainLooper());
        this.f30678d = 5000;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0025 */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r6 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L5:
            boolean r0 = r6.isInterrupted()
            if (r0 != 0) goto L8e
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = r6.f30676b
            if (r0 == 0) goto L17
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = r6.f30676b
            boolean r0 = com.mbridge.msdk.foundation.same.report.crashreport.c.b.a(r0)
            if (r0 == 0) goto L8e
        L17:
            monitor-enter(r6)
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = r6.f30676b     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L27
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = new com.mbridge.msdk.foundation.same.report.crashreport.c$b     // Catch: java.lang.Throwable -> L25
            r1 = 0
            r0.<init>()     // Catch: java.lang.Throwable -> L25
            r6.f30676b = r0     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r0 = move-exception
            goto L8c
        L27:
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = r6.f30676b     // Catch: java.lang.Throwable -> L25
            r0.b()     // Catch: java.lang.Throwable -> L25
            int r0 = r6.f30678d     // Catch: java.lang.Throwable -> L25
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L25
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L25
        L33:
            r4 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L52
            r6.wait(r0)     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L3d
            goto L47
        L3d:
            r0 = move-exception
            java.lang.String r1 = "AnrMonitor"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L25
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L25
        L47:
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L25
            long r0 = r0 - r2
            int r4 = r6.f30678d     // Catch: java.lang.Throwable -> L25
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L25
            long r0 = r4 - r0
            goto L33
        L52:
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = r6.f30676b     // Catch: java.lang.Throwable -> L25
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L63
            com.mbridge.msdk.foundation.same.report.crashreport.a r0 = r6.f30677c     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L61
            r0.a()     // Catch: java.lang.Throwable -> L25
        L61:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L25
            goto L5
        L63:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L25
            boolean r0 = android.os.Debug.isDebuggerConnected()
            if (r0 != 0) goto L5
            boolean r0 = android.os.Debug.waitingForDebugger()
            if (r0 == 0) goto L71
            goto L5
        L71:
            com.mbridge.msdk.foundation.same.report.crashreport.a r0 = r6.f30677c
            if (r0 == 0) goto L5
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.String r1 = com.mbridge.msdk.foundation.same.report.crashreport.d.b(r0)
            com.mbridge.msdk.foundation.same.report.crashreport.a r2 = r6.f30677c
            r2.a(r1, r0)
            goto L5
        L8c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L25
            throw r0
        L8e:
            int r0 = r6.f30678d     // Catch: java.lang.Exception -> L5
            long r0 = (long) r0     // Catch: java.lang.Exception -> L5
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> L5
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.crashreport.c.run():void");
    }

    public static c a() {
        if (f30674e == null) {
            synchronized (c.class) {
                try {
                    if (f30674e == null) {
                        f30674e = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f30674e;
    }

    public c a(int i10, com.mbridge.msdk.foundation.same.report.crashreport.a aVar) {
        this.f30678d = i10;
        this.f30677c = aVar;
        return this;
    }
}
