package com.mbridge.msdk.thrid.okhttp.internal.http1;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.internal.http.h;
import com.mbridge.msdk.thrid.okhttp.internal.http.k;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.i;
import com.mbridge.msdk.thrid.okio.l;
import com.mbridge.msdk.thrid.okio.r;
import com.mbridge.msdk.thrid.okio.s;
import com.mbridge.msdk.thrid.okio.t;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements com.mbridge.msdk.thrid.okhttp.internal.http.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final v f33221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.connection.g f33222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okio.e f33223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okio.d f33224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f33225e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f33226f = 262144;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private abstract class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final i f33227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected boolean f33228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected long f33229c;

        private b() {
            this.f33227a = new i(a.this.f33223c.b());
            this.f33229c = 0L;
        }

        protected final void a(boolean z10, IOException iOException) {
            a aVar = a.this;
            int i10 = aVar.f33225e;
            if (i10 == 6) {
                return;
            }
            if (i10 != 5) {
                throw new IllegalStateException("state: " + a.this.f33225e);
            }
            aVar.a(this.f33227a);
            a aVar2 = a.this;
            aVar2.f33225e = 6;
            com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = aVar2.f33222b;
            if (gVar != null) {
                gVar.a(!z10, aVar2, this.f33229c, iOException);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return this.f33227a;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            try {
                long jB = a.this.f33223c.b(cVar, j10);
                if (jB <= 0) {
                    return jB;
                }
                this.f33229c += jB;
                return jB;
            } catch (IOException e10) {
                a(false, e10);
                throw e10;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f33231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f33232b;

        c() {
            this.f33231a = new i(a.this.f33224d.b());
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) {
            if (this.f33232b) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            a.this.f33224d.a(j10);
            a.this.f33224d.a("\r\n");
            a.this.f33224d.a(cVar, j10);
            a.this.f33224d.a("\r\n");
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f33231a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f33232b) {
                return;
            }
            this.f33232b = true;
            a.this.f33224d.a("0\r\n\r\n");
            a.this.a(this.f33231a);
            a.this.f33225e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public synchronized void flush() {
            if (this.f33232b) {
                return;
            }
            a.this.f33224d.flush();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class d extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okhttp.s f33234e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f33235f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f33236g;

        d(com.mbridge.msdk.thrid.okhttp.s sVar) {
            super();
            this.f33235f = -1L;
            this.f33236g = true;
            this.f33234e = sVar;
        }

        private void d() throws ProtocolException {
            if (this.f33235f != -1) {
                a.this.f33223c.c();
            }
            try {
                this.f33235f = a.this.f33223c.i();
                String strTrim = a.this.f33223c.c().trim();
                if (this.f33235f < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f33235f + strTrim + "\"");
                }
                if (this.f33235f == 0) {
                    this.f33236g = false;
                    com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a.this.f33221a.i(), this.f33234e, a.this.f());
                    a(true, null);
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f33228b) {
                throw new IllegalStateException("closed");
            }
            if (!this.f33236g) {
                return -1L;
            }
            long j11 = this.f33235f;
            if (j11 == 0 || j11 == -1) {
                d();
                if (!this.f33236g) {
                    return -1L;
                }
            }
            long jB = super.b(cVar, Math.min(j10, this.f33235f));
            if (jB != -1) {
                this.f33235f -= jB;
                return jB;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(false, protocolException);
            throw protocolException;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f33228b) {
                return;
            }
            if (this.f33236g && !com.mbridge.msdk.thrid.okhttp.internal.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f33228b = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class e implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f33238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f33239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f33240c;

        e(long j10) {
            this.f33238a = new i(a.this.f33224d.b());
            this.f33240c = j10;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws ProtocolException {
            if (this.f33239b) {
                throw new IllegalStateException("closed");
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(cVar.size(), 0L, j10);
            if (j10 <= this.f33240c) {
                a.this.f33224d.a(cVar, j10);
                this.f33240c -= j10;
                return;
            }
            throw new ProtocolException("expected " + this.f33240c + " bytes but received " + j10);
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f33238a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws ProtocolException {
            if (this.f33239b) {
                return;
            }
            this.f33239b = true;
            if (this.f33240c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            a.this.a(this.f33238a);
            a.this.f33225e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() {
            if (this.f33239b) {
                return;
            }
            a.this.f33224d.flush();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class f extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f33242e;

        f(long j10) {
            super();
            this.f33242e = j10;
            if (j10 == 0) {
                a(true, null);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f33228b) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f33242e;
            if (j11 == 0) {
                return -1L;
            }
            long jB = super.b(cVar, Math.min(j11, j10));
            if (jB == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            }
            long j12 = this.f33242e - jB;
            this.f33242e = j12;
            if (j12 == 0) {
                a(true, null);
            }
            return jB;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f33228b) {
                return;
            }
            if (this.f33242e != 0 && !com.mbridge.msdk.thrid.okhttp.internal.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f33228b = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class g extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f33244e;

        g() {
            super();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f33228b) {
                throw new IllegalStateException("closed");
            }
            if (this.f33244e) {
                return -1L;
            }
            long jB = super.b(cVar, j10);
            if (jB != -1) {
                return jB;
            }
            this.f33244e = true;
            a(true, null);
            return -1L;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f33228b) {
                return;
            }
            if (!this.f33244e) {
                a(false, null);
            }
            this.f33228b = true;
        }
    }

    public a(v vVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, com.mbridge.msdk.thrid.okio.e eVar, com.mbridge.msdk.thrid.okio.d dVar) {
        this.f33221a = vVar;
        this.f33222b = gVar;
        this.f33223c = eVar;
        this.f33224d = dVar;
    }

    private String e() {
        String strD = this.f33223c.d(this.f33226f);
        this.f33226f -= (long) strD.length();
        return strD;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public r a(y yVar, long j10) {
        if ("chunked".equalsIgnoreCase(yVar.a("Transfer-Encoding"))) {
            return c();
        }
        if (j10 != -1) {
            return a(j10);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void b() {
        this.f33224d.flush();
    }

    public r c() {
        if (this.f33225e == 1) {
            this.f33225e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f33225e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void cancel() {
        com.mbridge.msdk.thrid.okhttp.internal.connection.c cVarC = this.f33222b.c();
        if (cVarC != null) {
            cVarC.d();
        }
    }

    public s d() {
        if (this.f33225e != 4) {
            throw new IllegalStateException("state: " + this.f33225e);
        }
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f33222b;
        if (gVar == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.f33225e = 5;
        gVar.e();
        return new g();
    }

    public com.mbridge.msdk.thrid.okhttp.r f() {
        com.mbridge.msdk.thrid.okhttp.r.a aVar = new com.mbridge.msdk.thrid.okhttp.r.a();
        while (true) {
            String strE = e();
            if (strE.length() == 0) {
                return aVar.a();
            }
            com.mbridge.msdk.thrid.okhttp.internal.a.f33105a.a(aVar, strE);
        }
    }

    public s b(long j10) {
        if (this.f33225e == 4) {
            this.f33225e = 5;
            return new f(j10);
        }
        throw new IllegalStateException("state: " + this.f33225e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a(y yVar) {
        a(yVar.c(), com.mbridge.msdk.thrid.okhttp.internal.http.i.a(yVar, this.f33222b.c().c().b().type()));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public b0 a(a0 a0Var) {
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f33222b;
        gVar.f33180f.responseBodyStart(gVar.f33179e);
        String strB = a0Var.b("Content-Type");
        if (!com.mbridge.msdk.thrid.okhttp.internal.http.e.b(a0Var)) {
            return new h(strB, 0L, l.a(b(0L)));
        }
        if ("chunked".equalsIgnoreCase(a0Var.b("Transfer-Encoding"))) {
            return new h(strB, -1L, l.a(a(a0Var.s().g())));
        }
        long jA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0Var);
        if (jA != -1) {
            return new h(strB, jA, l.a(b(jA)));
        }
        return new h(strB, -1L, l.a(d()));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a() {
        this.f33224d.flush();
    }

    public void a(com.mbridge.msdk.thrid.okhttp.r rVar, String str) {
        if (this.f33225e == 0) {
            this.f33224d.a(str).a("\r\n");
            int iB = rVar.b();
            for (int i10 = 0; i10 < iB; i10++) {
                this.f33224d.a(rVar.a(i10)).a(": ").a(rVar.b(i10)).a("\r\n");
            }
            this.f33224d.a("\r\n");
            this.f33225e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f33225e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public a0.a a(boolean z10) throws IOException {
        int i10 = this.f33225e;
        if (i10 != 1 && i10 != 3) {
            throw new IllegalStateException("state: " + this.f33225e);
        }
        try {
            k kVarA = k.a(e());
            a0.a aVarA = new a0.a().a(kVarA.f33218a).a(kVarA.f33219b).a(kVarA.f33220c).a(f());
            if (z10 && kVarA.f33219b == 100) {
                return null;
            }
            if (kVarA.f33219b == 100) {
                this.f33225e = 3;
                return aVarA;
            }
            this.f33225e = 4;
            return aVarA;
        } catch (EOFException e10) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f33222b);
            iOException.initCause(e10);
            throw iOException;
        }
    }

    public r a(long j10) {
        if (this.f33225e == 1) {
            this.f33225e = 2;
            return new e(j10);
        }
        throw new IllegalStateException("state: " + this.f33225e);
    }

    public s a(com.mbridge.msdk.thrid.okhttp.s sVar) {
        if (this.f33225e == 4) {
            this.f33225e = 5;
            return new d(sVar);
        }
        throw new IllegalStateException("state: " + this.f33225e);
    }

    void a(i iVar) {
        t tVarG = iVar.g();
        iVar.a(t.f33682d);
        tVarG.a();
        tVarG.b();
    }
}
