package on;

import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xn.q0;
import xn.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class t implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f49138e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f49139f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xn.g f49140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f49141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f49142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d.a f49143d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return t.f49139f;
        }

        public final int b(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void a(int i10, on.a aVar, xn.h hVar);

        void b(boolean z10, int i10, int i11, List list);

        void c(int i10, long j10);

        void e(boolean z10, int i10, xn.g gVar, int i11);

        void f(int i10, int i11, List list);

        void g(boolean z10, y yVar);

        void h();

        void i(boolean z10, int i10, int i11);

        void j(int i10, int i11, int i12, boolean z10);

        void k(int i10, on.a aVar);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        kotlin.jvm.internal.s.g(logger, "getLogger(...)");
        f49139f = logger;
    }

    public t(xn.g source, boolean z10) {
        kotlin.jvm.internal.s.h(source, "source");
        this.f49140a = source;
        this.f49141b = z10;
        b bVar = new b(source);
        this.f49142c = bVar;
        this.f49143d = new d.a(bVar, 4096, 0, 4, null);
    }

    private final void c0(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        }
        if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i13 = this.f49140a.readInt();
        on.a aVarA = on.a.f49001b.a(i13);
        if (aVarA != null) {
            cVar.k(i12, aVarA);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i13);
    }

    private final void g0(c cVar, int i10, int i11, int i12) throws Exception {
        int i13;
        try {
            if (i10 != 4) {
                throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
            }
            try {
                long jD = hn.m.d(this.f49140a.readInt(), 2147483647L);
                if (jD == 0) {
                    throw new IOException("windowSizeIncrement was 0");
                }
                Logger logger = f49139f;
                if (logger.isLoggable(Level.FINE)) {
                    i13 = i12;
                    logger.fine(e.f49052a.d(true, i12, i10, jD));
                } else {
                    i13 = i12;
                }
                cVar.c(i13, jD);
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                f49139f.fine(e.f49052a.c(true, i12, i10, 8, i11));
                throw exc;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private final void j(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iB = (i11 & 8) != 0 ? hn.m.b(this.f49140a.readByte(), 255) : 0;
        cVar.e(z10, i12, this.f49140a, f49138e.b(i10, i11, iB));
        this.f49140a.skip(iB);
    }

    private final void k(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i13 = this.f49140a.readInt();
        int i14 = this.f49140a.readInt();
        int i15 = i10 - 8;
        on.a aVarA = on.a.f49001b.a(i14);
        if (aVarA == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i14);
        }
        xn.h hVarF0 = xn.h.f56913e;
        if (i15 > 0) {
            hVarF0 = this.f49140a.f0(i15);
        }
        cVar.a(i13, aVarA, hVarF0);
    }

    private final List l(int i10, int i11, int i12, int i13) throws IOException {
        this.f49142c.i(i10);
        this.f49142c.j(i11);
        this.f49142c.h(i12);
        this.f49142c.k(i13);
        this.f49143d.l();
        return this.f49143d.f();
    }

    private final void m(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        int iB = (i11 & 8) != 0 ? hn.m.b(this.f49140a.readByte(), 255) : 0;
        if ((i11 & 32) != 0) {
            r(cVar, i12);
            i10 -= 5;
        }
        cVar.b(z10, i12, -1, l(f49138e.b(i10, i11, iB), iB, i11, i12));
    }

    private final void q(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.i((i11 & 1) != 0, this.f49140a.readInt(), this.f49140a.readInt());
    }

    private final void r(c cVar, int i10) {
        int i11 = this.f49140a.readInt();
        cVar.j(i10, i11 & Integer.MAX_VALUE, hn.m.b(this.f49140a.readByte(), 255) + 1, (Integer.MIN_VALUE & i11) != 0);
    }

    private final void s(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            r(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        }
    }

    private final void t(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iB = (i11 & 8) != 0 ? hn.m.b(this.f49140a.readByte(), 255) : 0;
        cVar.f(i12, this.f49140a.readInt() & Integer.MAX_VALUE, l(f49138e.b(i10 - 4, i11, iB), iB, i11, i12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f49140a.close();
    }

    public final boolean h(boolean z10, c handler) throws Exception {
        kotlin.jvm.internal.s.h(handler, "handler");
        try {
            this.f49140a.Z(9L);
            int iA = hn.m.A(this.f49140a);
            if (iA > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iA);
            }
            int iB = hn.m.b(this.f49140a.readByte(), 255);
            int iB2 = hn.m.b(this.f49140a.readByte(), 255);
            int i10 = this.f49140a.readInt() & Integer.MAX_VALUE;
            if (iB != 8) {
                Logger logger = f49139f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.f49052a.c(true, i10, iA, iB, iB2));
                }
            }
            if (z10 && iB != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + e.f49052a.b(iB));
            }
            switch (iB) {
                case 0:
                    j(handler, iA, iB2, i10);
                    return true;
                case 1:
                    m(handler, iA, iB2, i10);
                    return true;
                case 2:
                    s(handler, iA, iB2, i10);
                    return true;
                case 3:
                    c0(handler, iA, iB2, i10);
                    return true;
                case 4:
                    d0(handler, iA, iB2, i10);
                    return true;
                case 5:
                    t(handler, iA, iB2, i10);
                    return true;
                case 6:
                    q(handler, iA, iB2, i10);
                    return true;
                case 7:
                    k(handler, iA, iB2, i10);
                    return true;
                case 8:
                    g0(handler, iA, iB2, i10);
                    return true;
                default:
                    this.f49140a.skip(iA);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void i(c handler) throws IOException {
        kotlin.jvm.internal.s.h(handler, "handler");
        if (this.f49141b) {
            if (!h(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        xn.g gVar = this.f49140a;
        xn.h hVar = e.f49053b;
        xn.h hVarF0 = gVar.f0(hVar.D());
        Logger logger = f49139f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(hn.p.j("<< CONNECTION " + hVarF0.o(), new Object[0]));
        }
        if (kotlin.jvm.internal.s.c(hVar, hVarF0)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + hVarF0.K());
    }

    private final void d0(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i11 & 1) != 0) {
            if (i10 != 0) {
                throw new IOException(mDXVAtwcaFMHJ.waljqkTQSfZ);
            }
            cVar.h();
            return;
        }
        if (i10 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i10);
        }
        y yVar = new y();
        yl.d dVarL = yl.g.l(yl.g.m(0, i10), 6);
        int iA = dVarL.a();
        int iB = dVarL.b();
        int iD = dVarL.d();
        if ((iD > 0 && iA <= iB) || (iD < 0 && iB <= iA)) {
            while (true) {
                int iC = hn.m.c(this.f49140a.readShort(), 65535);
                int i13 = this.f49140a.readInt();
                if (iC != 2) {
                    if (iC != 4) {
                        if (iC == 5 && (i13 < 16384 || i13 > 16777215)) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i13);
                        }
                    } else if (i13 < 0) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                    }
                } else if (i13 != 0 && i13 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                yVar.h(iC, i13);
                if (iA != iB) {
                    iA += iD;
                }
            }
        }
        cVar.g(false, yVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final xn.g f49144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f49145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f49146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f49147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f49148e;

        public b(xn.g source) {
            kotlin.jvm.internal.s.h(source, "source");
            this.f49144a = source;
        }

        private final void d() throws IOException {
            int i10 = this.f49146c;
            int iA = hn.m.A(this.f49144a);
            this.f49147d = iA;
            int iB = hn.m.b(this.f49144a.readByte(), 255);
            this.f49145b = hn.m.b(this.f49144a.readByte(), 255);
            a aVar = t.f49138e;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(e.f49052a.c(true, this.f49146c, iA, iB, this.f49145b));
            }
            int i11 = this.f49144a.readInt() & Integer.MAX_VALUE;
            this.f49146c = i11;
            if (iB == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iB + " != TYPE_CONTINUATION");
            }
        }

        public final void h(int i10) {
            this.f49145b = i10;
        }

        public final void i(int i10) {
            this.f49147d = i10;
        }

        public final void j(int i10) {
            this.f49148e = i10;
        }

        public final void k(int i10) {
            this.f49146c = i10;
        }

        @Override // xn.q0
        public long read(xn.e sink, long j10) throws IOException {
            kotlin.jvm.internal.s.h(sink, "sink");
            while (true) {
                int i10 = this.f49147d;
                if (i10 != 0) {
                    long j11 = this.f49144a.read(sink, Math.min(j10, i10));
                    if (j11 == -1) {
                        return -1L;
                    }
                    this.f49147d -= (int) j11;
                    return j11;
                }
                this.f49144a.skip(this.f49148e);
                this.f49148e = 0;
                if ((this.f49145b & 4) != 0) {
                    return -1L;
                }
                d();
            }
        }

        @Override // xn.q0
        public r0 timeout() {
            return this.f49144a.timeout();
        }

        @Override // xn.q0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
