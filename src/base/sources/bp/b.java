package bp;

import co.h;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import oo.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
class b implements oo.f, mo.a, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f9218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f9219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f9220c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f9221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f9222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile long f9223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile TimeUnit f9224g;

    public b(zn.a aVar, k kVar, h hVar) {
        this.f9218a = kVar;
        this.f9219b = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(boolean r9) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.f9220c
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L3b
            co.h r1 = r8.f9219b
            monitor-enter(r1)
            if (r9 == 0) goto L21
            oo.k r2 = r8.f9218a     // Catch: java.lang.Throwable -> L1e
            co.h r3 = r8.f9219b     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r4 = r8.f9222e     // Catch: java.lang.Throwable -> L1e
            long r5 = r8.f9223f     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.TimeUnit r7 = r8.f9224g     // Catch: java.lang.Throwable -> L1e
            r2.d(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r0 = move-exception
            r9 = r0
            goto L39
        L21:
            r9 = 0
            co.h r0 = r8.f9219b     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            r0.close()     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            throw r9     // Catch: java.lang.Throwable -> L28
        L28:
            r0 = move-exception
            r9 = r0
            goto L2c
        L2b:
            throw r9     // Catch: java.lang.Throwable -> L28
        L2c:
            oo.k r2 = r8.f9218a     // Catch: java.lang.Throwable -> L1e
            co.h r3 = r8.f9219b     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L1e
            r4 = 0
            r5 = 0
            r2.d(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L1e
            throw r9     // Catch: java.lang.Throwable -> L1e
        L39:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r9
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.b.a(boolean):void");
    }

    @Override // mo.a
    public boolean cancel() {
        this.f9220c.get();
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        throw null;
     */
    @Override // oo.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.f9220c
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            co.h r1 = r8.f9219b
            monitor-enter(r1)
            r0 = 0
            co.h r2 = r8.f9219b     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L17
            r2.shutdown()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L17
            throw r0     // Catch: java.lang.Throwable -> L15
        L15:
            r0 = move-exception
            goto L18
        L17:
            throw r0     // Catch: java.lang.Throwable -> L15
        L18:
            oo.k r2 = r8.f9218a     // Catch: java.lang.Throwable -> L25
            co.h r3 = r8.f9219b     // Catch: java.lang.Throwable -> L25
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L25
            r4 = 0
            r5 = 0
            r2.d(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L25
            throw r0     // Catch: java.lang.Throwable -> L25
        L25:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.b.d():void");
    }

    @Override // oo.f
    public void h() {
        a(this.f9221d);
    }
}
