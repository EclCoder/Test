package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okio.s;
import com.mbridge.msdk.thrid.okio.t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final /* synthetic */ boolean f33383l = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f33384a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f33385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f33386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final g f33387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Deque<r> f33388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f33389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f33390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final a f33391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final c f33392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final c f33393j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    com.mbridge.msdk.thrid.okhttp.internal.http2.b f33394k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends com.mbridge.msdk.thrid.okio.a {
        c() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        protected IOException b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        protected void j() {
            i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
            i.this.f33387d.l();
        }

        public void k() throws IOException {
            if (i()) {
                throw b((IOException) null);
            }
        }
    }

    i(int i10, g gVar, boolean z10, boolean z11, r rVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f33388e = arrayDeque;
        this.f33392i = new c();
        this.f33393j = new c();
        this.f33394k = null;
        if (gVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f33386c = i10;
        this.f33387d = gVar;
        this.f33385b = gVar.f33323u.c();
        b bVar = new b(gVar.f33322t.c());
        this.f33390g = bVar;
        a aVar = new a();
        this.f33391h = aVar;
        bVar.f33405e = z11;
        aVar.f33398c = z10;
        if (rVar != null) {
            arrayDeque.add(rVar);
        }
        if (f() && rVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!f() && rVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    static /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.c.a b(i iVar) {
        iVar.getClass();
        return null;
    }

    public int c() {
        return this.f33386c;
    }

    public com.mbridge.msdk.thrid.okio.r d() {
        synchronized (this) {
            try {
                if (!this.f33389f && !f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f33391h;
    }

    public s e() {
        return this.f33390g;
    }

    public boolean f() {
        return this.f33387d.f33303a == ((this.f33386c & 1) == 1);
    }

    public synchronized boolean g() {
        try {
            if (this.f33394k != null) {
                return false;
            }
            b bVar = this.f33390g;
            if (bVar.f33405e || bVar.f33404d) {
                a aVar = this.f33391h;
                if ((aVar.f33398c || aVar.f33397b) && this.f33389f) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public t h() {
        return this.f33392i;
    }

    void i() {
        boolean zG;
        if (!f33383l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f33390g.f33405e = true;
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.f33387d.c(this.f33386c);
    }

    public synchronized r j() {
        this.f33392i.h();
        while (this.f33388e.isEmpty() && this.f33394k == null) {
            try {
                k();
            } catch (Throwable th2) {
                this.f33392i.k();
                throw th2;
            }
        }
        this.f33392i.k();
        if (this.f33388e.isEmpty()) {
            throw new n(this.f33394k);
        }
        return this.f33388e.removeFirst();
    }

    void k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public t l() {
        return this.f33393j;
    }

    private boolean b(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (!f33383l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.f33394k != null) {
                    return false;
                }
                if (this.f33390g.f33405e && this.f33391h.f33398c) {
                    return false;
                }
                this.f33394k = bVar;
                notifyAll();
                this.f33387d.c(this.f33386c);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (b(bVar)) {
            this.f33387d.b(this.f33386c, bVar);
        }
    }

    public void c(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (b(bVar)) {
            this.f33387d.c(this.f33386c, bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class a implements com.mbridge.msdk.thrid.okio.r {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ boolean f33395e = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f33396a = new com.mbridge.msdk.thrid.okio.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f33397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f33398c;

        a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (!f33395e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            this.f33396a.a(cVar, j10);
            while (this.f33396a.size() >= 16384) {
                a(false);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return i.this.f33393j;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!f33395e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                try {
                    if (this.f33397b) {
                        return;
                    }
                    if (!i.this.f33391h.f33398c) {
                        if (this.f33396a.size() > 0) {
                            while (this.f33396a.size() > 0) {
                                a(true);
                            }
                        } else {
                            i iVar = i.this;
                            iVar.f33387d.a(iVar.f33386c, true, (com.mbridge.msdk.thrid.okio.c) null, 0L);
                        }
                    }
                    synchronized (i.this) {
                        this.f33397b = true;
                    }
                    i.this.f33387d.flush();
                    i.this.a();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            if (!f33395e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                i.this.b();
            }
            while (this.f33396a.size() > 0) {
                a(false);
                i.this.f33387d.flush();
            }
        }

        private void a(boolean z10) throws IOException {
            i iVar;
            long jMin;
            i iVar2;
            synchronized (i.this) {
                i.this.f33393j.h();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.f33385b > 0 || this.f33398c || this.f33397b || iVar.f33394k != null) {
                            break;
                        } else {
                            iVar.k();
                        }
                    } catch (Throwable th2) {
                        i.this.f33393j.k();
                        throw th2;
                    }
                }
                iVar.f33393j.k();
                i.this.b();
                jMin = Math.min(i.this.f33385b, this.f33396a.size());
                iVar2 = i.this;
                iVar2.f33385b -= jMin;
            }
            iVar2.f33393j.h();
            try {
                i iVar3 = i.this;
                iVar3.f33387d.a(iVar3.f33386c, z10 && jMin == this.f33396a.size(), this.f33396a, jMin);
            } finally {
                i.this.f33393j.k();
            }
        }
    }

    void a(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
        boolean zG;
        if (!f33383l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f33389f = true;
            this.f33388e.add(com.mbridge.msdk.thrid.okhttp.internal.c.b(list));
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.f33387d.c(this.f33386c);
    }

    synchronized void d(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (this.f33394k == null) {
            this.f33394k = bVar;
            notifyAll();
        }
    }

    void a(com.mbridge.msdk.thrid.okio.e eVar, int i10) throws EOFException {
        if (!f33383l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.f33390g.a(eVar, i10);
    }

    void b() throws IOException {
        a aVar = this.f33391h;
        if (!aVar.f33397b) {
            if (!aVar.f33398c) {
                if (this.f33394k != null) {
                    throw new n(this.f33394k);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002b  */
    void a() {
        boolean z10;
        boolean zG;
        if (!f33383l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                b bVar = this.f33390g;
                if (bVar.f33405e || !bVar.f33404d) {
                    z10 = false;
                } else {
                    a aVar = this.f33391h;
                    if (aVar.f33398c || aVar.f33397b) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                zG = g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
        } else {
            if (zG) {
                return;
            }
            this.f33387d.c(this.f33386c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b implements s {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final /* synthetic */ boolean f33400g = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f33401a = new com.mbridge.msdk.thrid.okio.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f33402b = new com.mbridge.msdk.thrid.okio.c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f33403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f33404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f33405e;

        b(long j10) {
            this.f33403c = j10;
        }

        private void f(long j10) {
            if (!f33400g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            i.this.f33387d.g(j10);
        }

        void a(com.mbridge.msdk.thrid.okio.e eVar, long j10) throws EOFException {
            boolean z10;
            boolean z11;
            long size;
            if (!f33400g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            while (j10 > 0) {
                synchronized (i.this) {
                    z10 = this.f33405e;
                    z11 = this.f33402b.size() + j10 > this.f33403c;
                }
                if (z11) {
                    eVar.skip(j10);
                    i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    eVar.skip(j10);
                    return;
                }
                long jB = eVar.b(this.f33401a, j10);
                if (jB == -1) {
                    throw new EOFException();
                }
                j10 -= jB;
                synchronized (i.this) {
                    try {
                        if (this.f33404d) {
                            size = this.f33401a.size();
                            this.f33401a.k();
                        } else {
                            boolean z12 = this.f33402b.size() == 0;
                            this.f33402b.a(this.f33401a);
                            if (z12) {
                                i.this.notifyAll();
                            }
                            size = 0;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (size > 0) {
                    f(size);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0094  */
        /* JADX WARN: Code duplicated, block: B:41:0x0098 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x009a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:43:0x009b  */
        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws n {
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar;
            long jB;
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            while (true) {
                synchronized (i.this) {
                    try {
                        i.this.f33392i.h();
                        try {
                            i iVar = i.this;
                            bVar = iVar.f33394k;
                            if (bVar == null) {
                                bVar = null;
                            }
                            if (this.f33404d) {
                                throw new IOException("stream closed");
                            }
                            if (!iVar.f33388e.isEmpty()) {
                                i.b(i.this);
                            }
                            if (this.f33402b.size() > 0) {
                                com.mbridge.msdk.thrid.okio.c cVar2 = this.f33402b;
                                jB = cVar2.b(cVar, Math.min(j10, cVar2.size()));
                                i iVar2 = i.this;
                                long j11 = iVar2.f33384a + jB;
                                iVar2.f33384a = j11;
                                if (bVar != null || j11 < iVar2.f33387d.f33322t.c() / 2) {
                                    break;
                                    break;
                                }
                                i iVar3 = i.this;
                                iVar3.f33387d.a(iVar3.f33386c, iVar3.f33384a);
                                i.this.f33384a = 0L;
                                break;
                            }
                            if (this.f33405e || bVar != null) {
                                jB = -1;
                                break;
                            }
                            i.this.k();
                            i.this.f33392i.k();
                        } catch (Throwable th2) {
                            i.this.f33392i.k();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (jB != -1) {
                    f(jB);
                    return jB;
                }
                if (bVar == null) {
                    return -1L;
                }
                throw new n(bVar);
            }
            i.this.f33392i.k();
            if (jB != -1) {
                f(jB);
                return jB;
            }
            if (bVar == null) {
                return -1L;
            }
            throw new n(bVar);
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            synchronized (i.this) {
                try {
                    this.f33404d = true;
                    size = this.f33402b.size();
                    this.f33402b.k();
                    if (!i.this.f33388e.isEmpty()) {
                        i.b(i.this);
                    }
                    i.this.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (size > 0) {
                f(size);
            }
            i.this.a();
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return i.this.f33392i;
        }
    }

    void a(long j10) {
        this.f33385b += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }
}
