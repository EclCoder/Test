package com.mbridge.msdk.thrid.okhttp;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class x implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final v f33599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.http.j f33600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okio.a f33601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f33602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final y f33603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f33604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f33605g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends com.mbridge.msdk.thrid.okio.a {
        a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        protected void j() {
            x.this.cancel();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ boolean f33607d = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f33608b;

        b(e eVar) {
            super("OkHttp %s", x.this.e());
            this.f33608b = eVar;
        }

        void a(ExecutorService executorService) {
            if (!f33607d && Thread.holdsLock(x.this.f33599a.j())) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    x.this.f33602d.callFailed(x.this, interruptedIOException);
                    this.f33608b.a(x.this, interruptedIOException);
                    x.this.f33599a.j().b(this);
                }
            } catch (Throwable th2) {
                x.this.f33599a.j().b(this);
                throw th2;
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        protected void b() {
            x.this.f33601c.h();
            boolean z10 = false;
            try {
                try {
                    try {
                        this.f33608b.a(x.this, x.this.c());
                        x.this.f33599a.j().b(this);
                    } catch (IOException e10) {
                        e = e10;
                        z10 = true;
                        IOException iOExceptionA = x.this.a(e);
                        if (z10) {
                            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(4, "Callback failure for " + x.this.f(), iOExceptionA);
                        } else {
                            x.this.f33602d.callFailed(x.this, iOExceptionA);
                            this.f33608b.a(x.this, iOExceptionA);
                        }
                        x.this.f33599a.j().b(this);
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = true;
                        x.this.cancel();
                        if (!z10) {
                            this.f33608b.a(x.this, new IOException("canceled due to " + th));
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    x.this.f33599a.j().b(this);
                    throw th3;
                }
            } catch (IOException e11) {
                e = e11;
            } catch (Throwable th4) {
                th = th4;
            }
        }

        x c() {
            return x.this;
        }

        String d() {
            return x.this.f33603e.g().g();
        }
    }

    private x(v vVar, y yVar, boolean z10) {
        this.f33599a = vVar;
        this.f33603e = yVar;
        this.f33604f = z10;
        this.f33600b = new com.mbridge.msdk.thrid.okhttp.internal.http.j(vVar, z10);
        a aVar = new a();
        this.f33601c = aVar;
        aVar.a(vVar.b(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x clone() {
        return a(this.f33599a, this.f33603e, this.f33604f);
    }

    a0 c() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f33599a.p());
        arrayList.add(this.f33600b);
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.a(this.f33599a.i()));
        this.f33599a.q();
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.cache.a(null));
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.connection.a(this.f33599a));
        if (!this.f33604f) {
            arrayList.addAll(this.f33599a.r());
        }
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.b(this.f33604f));
        a0 a0VarA = new com.mbridge.msdk.thrid.okhttp.internal.http.g(arrayList, null, null, null, 0, this.f33603e, this, this.f33602d, this.f33599a.e(), this.f33599a.y(), this.f33599a.C()).a(this.f33603e);
        if (!this.f33600b.b()) {
            return a0VarA;
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(a0VarA);
        throw new IOException("Canceled");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void cancel() {
        this.f33600b.a();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public a0 d() {
        synchronized (this) {
            if (this.f33605g) {
                throw new IllegalStateException("Already Executed");
            }
            this.f33605g = true;
        }
        a();
        this.f33601c.h();
        this.f33602d.callStart(this);
        try {
            try {
                this.f33599a.j().a(this);
                a0 a0VarC = c();
                if (a0VarC == null) {
                    throw new IOException("Canceled");
                }
                this.f33599a.j().b(this);
                return a0VarC;
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                this.f33602d.callFailed(this, iOExceptionA);
                throw iOExceptionA;
            }
        } catch (Throwable th2) {
            this.f33599a.j().b(this);
            throw th2;
        }
        this.f33599a.j().b(this);
        throw th2;
    }

    String e() {
        return this.f33603e.g().l();
    }

    String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h() ? "canceled " : "");
        sb2.append(this.f33604f ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb2.append(" to ");
        sb2.append(e());
        return sb2.toString();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public boolean h() {
        return this.f33600b.b();
    }

    static x a(v vVar, y yVar, boolean z10) {
        x xVar = new x(vVar, yVar, z10);
        xVar.f33602d = vVar.l().a(xVar);
        return xVar;
    }

    IOException a(IOException iOException) {
        if (!this.f33601c.i()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    private void a() {
        this.f33600b.a(com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a("response.body().close()"));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void a(e eVar) {
        synchronized (this) {
            if (!this.f33605g) {
                this.f33605g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        a();
        this.f33602d.callStart(this);
        this.f33599a.j().a(new b(eVar));
    }
}
