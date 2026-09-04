package com.mbridge.msdk.thrid.okhttp;

import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Executor f33096g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f33097h = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f33099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f33100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Deque<com.mbridge.msdk.thrid.okhttp.internal.connection.c> f33101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.connection.d f33102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f33103f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long jA = i.this.a(System.nanoTime());
                if (jA == -1) {
                    return;
                }
                if (jA > 0) {
                    long j10 = jA / 1000000;
                    long j11 = jA - (1000000 * j10);
                    synchronized (i.this) {
                        try {
                            i.this.wait(j10, (int) j11);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public i() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    com.mbridge.msdk.thrid.okhttp.internal.connection.c a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c0 c0Var) {
        if (!f33097h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar : this.f33101d) {
            if (cVar.a(aVar, c0Var)) {
                gVar.a(cVar, true);
                return cVar;
            }
        }
        return null;
    }

    void b(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
        if (!f33097h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.f33103f) {
            this.f33103f = true;
            f33096g.execute(this.f33100c);
        }
        this.f33101d.add(cVar);
    }

    public i(int i10, long j10, TimeUnit timeUnit) {
        this.f33100c = new a();
        this.f33101d = new ArrayDeque();
        this.f33102e = new com.mbridge.msdk.thrid.okhttp.internal.connection.d();
        this.f33098a = i10;
        this.f33099b = timeUnit.toNanos(j10);
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j10);
    }

    Socket a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar) {
        if (!f33097h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar : this.f33101d) {
            if (cVar.a(aVar, null) && cVar.f() && cVar != gVar.c()) {
                return gVar.b(cVar);
            }
        }
        return null;
    }

    boolean a(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
        if (!f33097h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!cVar.f33156k && this.f33098a != 0) {
            notifyAll();
            return false;
        }
        this.f33101d.remove(cVar);
        return true;
    }

    long a(long j10) {
        synchronized (this) {
            try {
                com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar = null;
                long j11 = Long.MIN_VALUE;
                int i10 = 0;
                int i11 = 0;
                for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2 : this.f33101d) {
                    if (a(cVar2, j10) > 0) {
                        i11++;
                    } else {
                        i10++;
                        long j12 = j10 - cVar2.f33160o;
                        if (j12 > j11) {
                            cVar = cVar2;
                            j11 = j12;
                        }
                    }
                }
                long j13 = this.f33099b;
                if (j11 < j13 && i10 <= this.f33098a) {
                    if (i10 > 0) {
                        return j13 - j11;
                    }
                    if (i11 > 0) {
                        return j13;
                    }
                    this.f33103f = false;
                    return -1L;
                }
                this.f33101d.remove(cVar);
                com.mbridge.msdk.thrid.okhttp.internal.c.a(cVar.g());
                return 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private int a(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar, long j10) {
        List<Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g>> list = cVar.f33159n;
        int i10 = 0;
        while (i10 < list.size()) {
            Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g> reference = list.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a("A connection to " + cVar.c().a().k() + UHbHibBvYxKnPE.TxDfNBhRaTL, ((com.mbridge.msdk.thrid.okhttp.internal.connection.g.a) reference).f33189a);
                list.remove(i10);
                cVar.f33156k = true;
                if (list.isEmpty()) {
                    cVar.f33160o = j10 - this.f33099b;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
