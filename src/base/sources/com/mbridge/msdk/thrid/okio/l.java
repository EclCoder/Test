package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Logger f33658a = Logger.getLogger(l.class.getName());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f33659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ OutputStream f33660b;

        a(t tVar, OutputStream outputStream) {
            this.f33659a = tVar;
            this.f33660b = outputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            u.a(cVar.f33639b, 0L, j10);
            while (j10 > 0) {
                this.f33659a.e();
                o oVar = cVar.f33638a;
                int iMin = (int) Math.min(j10, oVar.f33673c - oVar.f33672b);
                this.f33660b.write(oVar.f33671a, oVar.f33672b, iMin);
                int i10 = oVar.f33672b + iMin;
                oVar.f33672b = i10;
                long j11 = iMin;
                j10 -= j11;
                cVar.f33639b -= j11;
                if (i10 == oVar.f33673c) {
                    cVar.f33638a = oVar.b();
                    p.a(oVar);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f33659a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f33660b.close();
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            this.f33660b.flush();
        }

        public String toString() {
            return "sink(" + this.f33660b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c extends com.mbridge.msdk.thrid.okio.a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Socket f33663k;

        c(Socket socket) {
            this.f33663k = socket;
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
            try {
                this.f33663k.close();
            } catch (AssertionError e10) {
                if (!l.a(e10)) {
                    throw e10;
                }
                l.f33658a.log(Level.WARNING, "Failed to close timed out socket " + this.f33663k, (Throwable) e10);
            } catch (Exception e11) {
                l.f33658a.log(Level.WARNING, "Failed to close timed out socket " + this.f33663k, (Throwable) e11);
            }
        }
    }

    private l() {
    }

    public static e a(s sVar) {
        return new n(sVar);
    }

    public static s b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        com.mbridge.msdk.thrid.okio.a aVarC = c(socket);
        return aVarC.a(a(socket.getInputStream(), aVarC));
    }

    private static com.mbridge.msdk.thrid.okio.a c(Socket socket) {
        return new c(socket);
    }

    public static d a(r rVar) {
        return new m(rVar);
    }

    private static r a(OutputStream outputStream, t tVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (tVar != null) {
            return new a(tVar, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static r a(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                com.mbridge.msdk.thrid.okio.a aVarC = c(socket);
                return aVarC.a(a(socket.getOutputStream(), aVarC));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f33661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputStream f33662b;

        b(t tVar, InputStream inputStream) {
            this.f33661a = tVar;
            this.f33662b = inputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (j10 == 0) {
                return 0L;
            }
            try {
                this.f33661a.e();
                o oVarB = cVar.b(1);
                int i10 = this.f33662b.read(oVarB.f33671a, oVarB.f33673c, (int) Math.min(j10, 8192 - oVarB.f33673c));
                if (i10 == -1) {
                    return -1L;
                }
                oVarB.f33673c += i10;
                long j11 = i10;
                cVar.f33639b += j11;
                return j11;
            } catch (AssertionError e10) {
                if (l.a(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f33662b.close();
        }

        public String toString() {
            return "source(" + this.f33662b + ")";
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return this.f33661a;
        }
    }

    public static s a(InputStream inputStream) {
        return a(inputStream, new t());
    }

    private static s a(InputStream inputStream, t tVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (tVar != null) {
            return new b(tVar, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
