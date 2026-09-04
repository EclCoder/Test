package gn;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g0 implements Closeable {
    public static final b Companion;
    public static final g0 EMPTY;
    private Reader reader;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final xn.g f39615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Charset f39616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f39617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Reader f39618d;

        public a(xn.g source, Charset charset) {
            kotlin.jvm.internal.s.h(source, "source");
            kotlin.jvm.internal.s.h(charset, "charset");
            this.f39615a = source;
            this.f39616b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f39617c = true;
            Reader reader = this.f39618d;
            if (reader != null) {
                reader.close();
            } else {
                this.f39615a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i10, int i11) throws IOException {
            kotlin.jvm.internal.s.h(cbuf, "cbuf");
            if (this.f39617c) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f39618d;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f39615a.S0(), hn.p.n(this.f39615a, this.f39616b));
                this.f39618d = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a extends g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a0 f39619a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f39620b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ xn.g f39621c;

            a(a0 a0Var, long j10, xn.g gVar) {
                this.f39619a = a0Var;
                this.f39620b = j10;
                this.f39621c = gVar;
            }

            @Override // gn.g0
            public long contentLength() {
                return this.f39620b;
            }

            @Override // gn.g0
            public a0 contentType() {
                return this.f39619a;
            }

            @Override // gn.g0
            public xn.g source() {
                return this.f39621c;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ g0 i(b bVar, xn.h hVar, a0 a0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                a0Var = null;
            }
            return bVar.g(hVar, a0Var);
        }

        public final g0 a(a0 a0Var, long j10, xn.g content) {
            kotlin.jvm.internal.s.h(content, "content");
            return f(content, a0Var, j10);
        }

        public final g0 b(a0 a0Var, String content) {
            kotlin.jvm.internal.s.h(content, "content");
            return e(content, a0Var);
        }

        public final g0 c(a0 a0Var, xn.h content) {
            kotlin.jvm.internal.s.h(content, "content");
            return g(content, a0Var);
        }

        public final g0 d(a0 a0Var, byte[] content) {
            kotlin.jvm.internal.s.h(content, "content");
            return h(content, a0Var);
        }

        public final g0 e(String str, a0 a0Var) {
            kotlin.jvm.internal.s.h(str, "<this>");
            fl.q qVarB = hn.b.b(a0Var);
            Charset charset = (Charset) qVarB.d();
            a0 a0Var2 = (a0) qVarB.g();
            xn.e eVarN1 = new xn.e().n1(str, charset);
            return f(eVarN1, a0Var2, eVarN1.size());
        }

        public final g0 f(xn.g gVar, a0 a0Var, long j10) {
            kotlin.jvm.internal.s.h(gVar, "<this>");
            return new a(a0Var, j10, gVar);
        }

        public final g0 g(xn.h hVar, a0 a0Var) {
            kotlin.jvm.internal.s.h(hVar, "<this>");
            return f(new xn.e().k0(hVar), a0Var, hVar.D());
        }

        public final g0 h(byte[] bArr, a0 a0Var) {
            kotlin.jvm.internal.s.h(bArr, "<this>");
            return f(new xn.e().write(bArr), a0Var, bArr.length);
        }

        private b() {
        }
    }

    static {
        b bVar = new b(null);
        Companion = bVar;
        EMPTY = b.i(bVar, xn.h.f56913e, null, 1, null);
    }

    public static final g0 create(a0 a0Var, long j10, xn.g gVar) {
        return Companion.a(a0Var, j10, gVar);
    }

    private final Charset d() {
        return hn.b.a(contentType());
    }

    public final InputStream byteStream() {
        return source().S0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final xn.h byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        xn.g gVarSource = source();
        xn.h th2 = null;
        try {
            xn.h hVarB0 = gVarSource.B0();
            if (gVarSource != null) {
                try {
                    gVarSource.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = hVarB0;
        } catch (Throwable th4) {
            th = th4;
            if (gVarSource != null) {
                try {
                    gVarSource.close();
                } catch (Throwable th5) {
                    fl.e.a(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int iD = th2.D();
        if (jContentLength == -1 || jContentLength == iD) {
            return th2;
        }
        throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iD + ") disagree");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        xn.g gVarSource = source();
        byte[] th2 = null;
        try {
            byte[] bArrL0 = gVarSource.l0();
            if (gVarSource != null) {
                try {
                    gVarSource.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = bArrL0;
        } catch (Throwable th4) {
            th = th4;
            if (gVarSource != null) {
                try {
                    gVarSource.close();
                } catch (Throwable th5) {
                    fl.e.a(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th2.length;
        if (jContentLength == -1 || jContentLength == length) {
            return th2;
        }
        throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(source(), d());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        hn.m.f(source());
    }

    public abstract long contentLength();

    public abstract a0 contentType();

    public abstract xn.g source();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final String string() {
        xn.g gVarSource = source();
        String th2 = null;
        try {
            String strX0 = gVarSource.x0(hn.p.n(gVarSource, d()));
            if (gVarSource != null) {
                try {
                    gVarSource.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = strX0;
        } catch (Throwable th4) {
            th = th4;
            if (gVarSource != null) {
                try {
                    gVarSource.close();
                } catch (Throwable th5) {
                    fl.e.a(th, th5);
                }
            }
        }
        if (th == 0) {
            return th2;
        }
        throw th;
    }

    public static final g0 create(a0 a0Var, String str) {
        return Companion.b(a0Var, str);
    }

    public static final g0 create(a0 a0Var, xn.h hVar) {
        return Companion.c(a0Var, hVar);
    }

    public static final g0 create(a0 a0Var, byte[] bArr) {
        return Companion.d(a0Var, bArr);
    }

    public static final g0 create(String str, a0 a0Var) {
        return Companion.e(str, a0Var);
    }

    public static final g0 create(xn.g gVar, a0 a0Var, long j10) {
        return Companion.f(gVar, a0Var, j10);
    }

    public static final g0 create(xn.h hVar, a0 a0Var) {
        return Companion.g(hVar, a0Var);
    }

    public static final g0 create(byte[] bArr, a0 a0Var) {
        return Companion.h(bArr, a0Var);
    }
}
