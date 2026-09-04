package on;

import fl.g0;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class v implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f49176g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Logger f49177h = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xn.f f49178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f49179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xn.e f49180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f49182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d.b f49183f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public v(xn.f sink, boolean z10) {
        kotlin.jvm.internal.s.h(sink, "sink");
        this.f49178a = sink;
        this.f49179b = z10;
        xn.e eVar = new xn.e();
        this.f49180c = eVar;
        this.f49181d = 16384;
        this.f49183f = new d.b(0, false, eVar, 3, null);
    }

    private final void d0(int i10, long j10) {
        while (j10 > 0) {
            long jMin = Math.min(this.f49181d, j10);
            j10 -= jMin;
            j(i10, (int) jMin, 9, j10 == 0 ? 4 : 0);
            this.f49178a.W(this.f49180c, jMin);
        }
    }

    public final void a(y peerSettings) {
        kotlin.jvm.internal.s.h(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.f49182e) {
                    throw new IOException("closed");
                }
                this.f49181d = peerSettings.e(this.f49181d);
                if (peerSettings.b() != -1) {
                    this.f49183f.e(peerSettings.b());
                }
                j(0, 0, 4, 1);
                this.f49178a.flush();
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c0(int i10, long j10) {
        int i11;
        long j11;
        synchronized (this) {
            try {
                if (this.f49182e) {
                    throw new IOException("closed");
                }
                if (j10 == 0 || j10 > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
                }
                Logger logger = f49177h;
                if (logger.isLoggable(Level.FINE)) {
                    i11 = i10;
                    j11 = j10;
                    logger.fine(e.f49052a.d(false, i11, 4, j11));
                } else {
                    i11 = i10;
                    j11 = j10;
                }
                j(i11, 4, 8, 0);
                this.f49178a.writeInt((int) j11);
                this.f49178a.flush();
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.f49182e = true;
            this.f49178a.close();
            g0 g0Var = g0.f38750a;
        }
    }

    public final void d() {
        synchronized (this) {
            try {
                if (this.f49182e) {
                    throw new IOException("closed");
                }
                if (this.f49179b) {
                    Logger logger = f49177h;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(hn.p.j(">> CONNECTION " + e.f49053b.o(), new Object[0]));
                    }
                    this.f49178a.k0(e.f49053b);
                    this.f49178a.flush();
                    g0 g0Var = g0.f38750a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f49182e) {
                throw new IOException("closed");
            }
            this.f49178a.flush();
            g0 g0Var = g0.f38750a;
        }
    }

    public final void h(boolean z10, int i10, xn.e eVar, int i11) {
        synchronized (this) {
            if (this.f49182e) {
                throw new IOException("closed");
            }
            i(i10, z10 ? 1 : 0, eVar, i11);
            g0 g0Var = g0.f38750a;
        }
    }

    public final void i(int i10, int i11, xn.e eVar, int i12) {
        j(i10, i12, 0, i11);
        if (i12 > 0) {
            xn.f fVar = this.f49178a;
            kotlin.jvm.internal.s.e(eVar);
            fVar.W(eVar, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final void j(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        if (i12 != 8) {
            Logger logger = f49177h;
            if (logger.isLoggable(Level.FINE)) {
                i14 = i10;
                i15 = i11;
                i16 = i12;
                i17 = i13;
                logger.fine(e.f49052a.c(false, i14, i15, i16, i17));
            } else {
                i14 = i10;
                i15 = i11;
                i16 = i12;
                i17 = i13;
            }
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        if (i15 > this.f49181d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f49181d + ": " + i15).toString());
        }
        if ((Integer.MIN_VALUE & i14) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i14).toString());
        }
        hn.m.H(this.f49178a, i15);
        this.f49178a.writeByte(i16 & 255);
        this.f49178a.writeByte(i17 & 255);
        this.f49178a.writeInt(Integer.MAX_VALUE & i14);
    }

    public final void k(int i10, on.a errorCode, byte[] debugData) {
        kotlin.jvm.internal.s.h(errorCode, "errorCode");
        kotlin.jvm.internal.s.h(debugData, "debugData");
        synchronized (this) {
            try {
                if (this.f49182e) {
                    throw new IOException("closed");
                }
                if (errorCode.g() == -1) {
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                j(0, debugData.length + 8, 7, 0);
                this.f49178a.writeInt(i10);
                this.f49178a.writeInt(errorCode.g());
                if (!(debugData.length == 0)) {
                    this.f49178a.write(debugData);
                }
                this.f49178a.flush();
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(boolean z10, int i10, List headerBlock) {
        kotlin.jvm.internal.s.h(headerBlock, "headerBlock");
        synchronized (this) {
            try {
                if (this.f49182e) {
                    throw new IOException("closed");
                }
                this.f49183f.g(headerBlock);
                long size = this.f49180c.size();
                long jMin = Math.min(this.f49181d, size);
                int i11 = size == jMin ? 4 : 0;
                if (z10) {
                    i11 |= 1;
                }
                j(i10, (int) jMin, 1, i11);
                this.f49178a.W(this.f49180c, jMin);
                if (size > jMin) {
                    d0(i10, size - jMin);
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int m() {
        return this.f49181d;
    }

    public final void q(boolean z10, int i10, int i11) {
        synchronized (this) {
            if (this.f49182e) {
                throw new IOException("closed");
            }
            j(0, 8, 6, z10 ? 1 : 0);
            this.f49178a.writeInt(i10);
            this.f49178a.writeInt(i11);
            this.f49178a.flush();
            g0 g0Var = g0.f38750a;
        }
    }

    public final void r(int i10, int i11, List requestHeaders) {
        kotlin.jvm.internal.s.h(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (this.f49182e) {
                    throw new IOException("closed");
                }
                this.f49183f.g(requestHeaders);
                long size = this.f49180c.size();
                int iMin = (int) Math.min(((long) this.f49181d) - 4, size);
                long j10 = iMin;
                j(i10, iMin + 4, 5, size == j10 ? 4 : 0);
                this.f49178a.writeInt(i11 & Integer.MAX_VALUE);
                this.f49178a.W(this.f49180c, j10);
                if (size > j10) {
                    d0(i10, size - j10);
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s(int i10, on.a errorCode) {
        kotlin.jvm.internal.s.h(errorCode, "errorCode");
        synchronized (this) {
            if (this.f49182e) {
                throw new IOException("closed");
            }
            if (errorCode.g() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            j(i10, 4, 3, 0);
            this.f49178a.writeInt(errorCode.g());
            this.f49178a.flush();
            g0 g0Var = g0.f38750a;
        }
    }

    public final void t(y settings) {
        kotlin.jvm.internal.s.h(settings, "settings");
        synchronized (this) {
            try {
                if (this.f49182e) {
                    throw new IOException("closed");
                }
                j(0, settings.i() * 6, 4, 0);
                for (int i10 = 0; i10 < 10; i10++) {
                    if (settings.f(i10)) {
                        this.f49178a.writeShort(i10);
                        this.f49178a.writeInt(settings.a(i10));
                    }
                }
                this.f49178a.flush();
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
