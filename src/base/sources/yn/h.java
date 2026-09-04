package yn;

import fl.g0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import xn.l0;
import xn.m0;
import xn.o0;
import xn.p0;
import xn.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class h implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Socket f58108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicInteger f58109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q0 f58110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o0 f58111d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OutputStream f58112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n f58113b;

        public a() {
            this.f58112a = h.this.d().getOutputStream();
            this.f58113b = new n(h.this.d());
        }

        @Override // xn.o0
        public void W(xn.e source, long j10) throws IOException {
            kotlin.jvm.internal.s.h(source, "source");
            xn.b.b(source.size(), 0L, j10);
            while (j10 > 0) {
                this.f58113b.f();
                l0 l0Var = source.f56903a;
                kotlin.jvm.internal.s.e(l0Var);
                int iMin = (int) Math.min(j10, l0Var.f56954c - l0Var.f56953b);
                n nVar = this.f58113b;
                nVar.s();
                try {
                    try {
                        this.f58112a.write(l0Var.f56952a, l0Var.f56953b, iMin);
                        g0 g0Var = g0.f38750a;
                        if (nVar.t()) {
                            throw nVar.p(null);
                        }
                        l0Var.f56953b += iMin;
                        long j11 = iMin;
                        j10 -= j11;
                        source.Z0(source.size() - j11);
                        if (l0Var.f56953b == l0Var.f56954c) {
                            source.f56903a = l0Var.b();
                            m0.b(l0Var);
                        }
                    } catch (IOException e10) {
                        if (!nVar.t()) {
                            throw e10;
                        }
                        throw nVar.p(e10);
                    }
                } catch (Throwable th2) {
                    nVar.t();
                    throw th2;
                }
            }
        }

        @Override // xn.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            n nVar = this.f58113b;
            h hVar = h.this;
            nVar.s();
            try {
                try {
                    int iA = t.a(hVar.f58109b, 1);
                    if (iA == 0) {
                        nVar.t();
                        return;
                    }
                    if (iA != 3) {
                        if (!hVar.d().isClosed() && !hVar.d().isOutputShutdown()) {
                            this.f58112a.flush();
                            try {
                                hVar.d().shutdownOutput();
                            } catch (UnsupportedOperationException unused) {
                                this.f58112a.close();
                            }
                        }
                        nVar.t();
                        return;
                    }
                    hVar.d().close();
                    g0 g0Var = g0.f38750a;
                    if (nVar.t()) {
                        throw nVar.p(null);
                    }
                    return;
                } catch (IOException e10) {
                    if (!nVar.t()) {
                        throw e10;
                    }
                    throw nVar.p(e10);
                }
            } catch (Throwable th2) {
                nVar.t();
                throw th2;
            }
            nVar.t();
            throw th2;
        }

        @Override // xn.o0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public n timeout() {
            return this.f58113b;
        }

        @Override // xn.o0, java.io.Flushable
        public void flush() throws IOException {
            n nVar = this.f58113b;
            nVar.s();
            try {
                try {
                    this.f58112a.flush();
                    g0 g0Var = g0.f38750a;
                    if (nVar.t()) {
                        throw nVar.p(null);
                    }
                } catch (IOException e10) {
                    if (!nVar.t()) {
                        throw e10;
                    }
                    throw nVar.p(e10);
                }
            } catch (Throwable th2) {
                nVar.t();
                throw th2;
            }
        }

        public String toString() {
            return "sink(" + h.this.d() + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class b implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputStream f58115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n f58116b;

        public b() {
            this.f58115a = h.this.d().getInputStream();
            this.f58116b = new n(h.this.d());
        }

        @Override // xn.q0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            n nVar = this.f58116b;
            h hVar = h.this;
            nVar.s();
            try {
                try {
                    int iA = t.a(hVar.f58109b, 2);
                    if (iA == 0) {
                        nVar.t();
                        return;
                    }
                    if (iA == 3) {
                        hVar.d().close();
                    } else if (hVar.d().isClosed() || hVar.d().isInputShutdown()) {
                        nVar.t();
                        return;
                    } else {
                        try {
                            hVar.d().shutdownInput();
                        } catch (UnsupportedOperationException unused) {
                            this.f58115a.close();
                        }
                    }
                    g0 g0Var = g0.f38750a;
                    if (nVar.t()) {
                        throw nVar.p(null);
                    }
                } catch (Throwable th2) {
                    nVar.t();
                    throw th2;
                }
            } catch (IOException e10) {
                if (!nVar.t()) {
                    throw e10;
                }
                throw nVar.p(e10);
            }
        }

        @Override // xn.q0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public n timeout() {
            return this.f58116b;
        }

        @Override // xn.q0
        public long read(xn.e sink, long j10) throws IOException {
            kotlin.jvm.internal.s.h(sink, "sink");
            if (j10 == 0) {
                return 0L;
            }
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            this.f58116b.f();
            l0 l0VarC1 = sink.c1(1);
            int iMin = (int) Math.min(j10, 8192 - l0VarC1.f56954c);
            try {
                n nVar = this.f58116b;
                nVar.s();
                try {
                    try {
                        int i10 = this.f58115a.read(l0VarC1.f56952a, l0VarC1.f56954c, iMin);
                        if (nVar.t()) {
                            throw nVar.p(null);
                        }
                        if (i10 != -1) {
                            l0VarC1.f56954c += i10;
                            long j11 = i10;
                            sink.Z0(sink.size() + j11);
                            return j11;
                        }
                        if (l0VarC1.f56953b != l0VarC1.f56954c) {
                            return -1L;
                        }
                        sink.f56903a = l0VarC1.b();
                        m0.b(l0VarC1);
                        return -1L;
                    } catch (IOException e10) {
                        if (nVar.t()) {
                            throw nVar.p(e10);
                        }
                        throw e10;
                    }
                } catch (Throwable th2) {
                    nVar.t();
                    throw th2;
                }
            } catch (AssertionError e11) {
                if (u.b(e11)) {
                    throw new IOException(e11);
                }
                throw e11;
            }
        }

        public String toString() {
            return "source(" + h.this.d() + ')';
        }
    }

    public h(Socket socket) {
        kotlin.jvm.internal.s.h(socket, "socket");
        this.f58108a = socket;
        this.f58109b = new AtomicInteger();
        this.f58110c = new b();
        this.f58111d = new a();
    }

    @Override // xn.p0
    public q0 a() {
        return this.f58110c;
    }

    @Override // xn.p0
    public o0 b() {
        return this.f58111d;
    }

    @Override // xn.p0
    public void cancel() throws IOException {
        this.f58108a.close();
    }

    public final Socket d() {
        return this.f58108a;
    }

    public String toString() {
        String string = this.f58108a.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }
}
