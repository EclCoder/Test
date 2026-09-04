package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f33625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f33626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static a f33627j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f33628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f33629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f33630g;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0460a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f33631a;

        C0460a(r rVar) {
            this.f33631a = rVar;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            u.a(cVar.f33639b, 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                o oVar = cVar.f33638a;
                while (j11 < 65536) {
                    j11 += (long) (oVar.f33673c - oVar.f33672b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    }
                    oVar = oVar.f33676f;
                }
                a.this.h();
                try {
                    try {
                        this.f33631a.a(cVar, j11);
                        j10 -= j11;
                        a.this.a(true);
                    } catch (IOException e10) {
                        throw a.this.a(e10);
                    }
                } catch (Throwable th2) {
                    a.this.a(false);
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return a.this;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a.this.h();
            try {
                try {
                    this.f33631a.close();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            a.this.h();
            try {
                try {
                    this.f33631a.flush();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f33631a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0017, code lost:
        
            r1.j();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<com.mbridge.msdk.thrid.okio.a> r0 = com.mbridge.msdk.thrid.okio.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                com.mbridge.msdk.thrid.okio.a r1 = com.mbridge.msdk.thrid.okio.a.g()     // Catch: java.lang.Throwable -> Lb
                if (r1 != 0) goto Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                goto L0
            Lb:
                r1 = move-exception
                goto L1b
            Ld:
                com.mbridge.msdk.thrid.okio.a r2 = com.mbridge.msdk.thrid.okio.a.f33627j     // Catch: java.lang.Throwable -> Lb
                if (r1 != r2) goto L16
                r1 = 0
                com.mbridge.msdk.thrid.okio.a.f33627j = r1     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return
            L16:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                r1.j()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L1b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f33625h = millis;
        f33626i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    private static synchronized void a(a aVar, long j10, boolean z10) {
        try {
            if (f33627j == null) {
                f33627j = new a();
                new c().start();
            }
            long jNanoTime = System.nanoTime();
            if (j10 != 0 && z10) {
                aVar.f33630g = Math.min(j10, aVar.c() - jNanoTime) + jNanoTime;
            } else if (j10 != 0) {
                aVar.f33630g = j10 + jNanoTime;
            } else {
                if (!z10) {
                    throw new AssertionError();
                }
                aVar.f33630g = aVar.c();
            }
            long jB = aVar.b(jNanoTime);
            a aVar2 = f33627j;
            while (true) {
                a aVar3 = aVar2.f33629f;
                if (aVar3 == null || jB < aVar3.b(jNanoTime)) {
                    break;
                    break;
                }
                aVar2 = aVar2.f33629f;
            }
            aVar.f33629f = aVar2.f33629f;
            aVar2.f33629f = aVar;
            if (aVar2 == f33627j) {
                a.class.notify();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private long b(long j10) {
        return this.f33630g - j10;
    }

    static a g() throws InterruptedException {
        a aVar = f33627j.f33629f;
        if (aVar == null) {
            long jNanoTime = System.nanoTime();
            a.class.wait(f33625h);
            if (f33627j.f33629f != null || System.nanoTime() - jNanoTime < f33626i) {
                return null;
            }
            return f33627j;
        }
        long jB = aVar.b(System.nanoTime());
        if (jB > 0) {
            long j10 = jB / 1000000;
            a.class.wait(j10, (int) (jB - (1000000 * j10)));
            return null;
        }
        f33627j.f33629f = aVar.f33629f;
        aVar.f33629f = null;
        return aVar;
    }

    public final void h() {
        if (this.f33628e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jF = f();
        boolean zD = d();
        if (jF != 0 || zD) {
            this.f33628e = true;
            a(this, jF, zD);
        }
    }

    public final boolean i() {
        if (!this.f33628e) {
            return false;
        }
        this.f33628e = false;
        return a(this);
    }

    protected IOException b(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f33633a;

        b(s sVar) {
            this.f33633a = sVar;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            a.this.h();
            try {
                try {
                    long jB = this.f33633a.b(cVar, j10);
                    a.this.a(true);
                    return jB;
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                try {
                    this.f33633a.close();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f33633a + ")";
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return a.this;
        }
    }

    private static synchronized boolean a(a aVar) {
        a aVar2 = f33627j;
        while (aVar2 != null) {
            a aVar3 = aVar2.f33629f;
            if (aVar3 == aVar) {
                aVar2.f33629f = aVar.f33629f;
                aVar.f33629f = null;
                return false;
            }
            aVar2 = aVar3;
        }
        return true;
    }

    protected void j() {
    }

    public final r a(r rVar) {
        return new C0460a(rVar);
    }

    public final s a(s sVar) {
        return new b(sVar);
    }

    final void a(boolean z10) throws IOException {
        if (i() && z10) {
            throw b((IOException) null);
        }
    }

    final IOException a(IOException iOException) {
        return !i() ? iOException : b(iOException);
    }
}
