package on;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import fl.g0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.k0;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class n implements Closeable {
    public static final b C = new b(null);
    private static final y D;
    private final d A;
    private final Set B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f49081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f49082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f49083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f49084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f49086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f49087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final kn.d f49088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final kn.c f49089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final kn.c f49090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final kn.c f49091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final x f49092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f49093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f49094n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f49095o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f49096p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f49097q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f49098r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final on.b f49099s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final y f49100t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private y f49101u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final pn.a f49102v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f49103w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f49104x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ln.a f49105y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final v f49106z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f49107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kn.d f49108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ln.a f49109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f49110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f49111e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private x f49112f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f49113g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private on.b f49114h;

        public a(boolean z10, kn.d taskRunner) {
            kotlin.jvm.internal.s.h(taskRunner, "taskRunner");
            this.f49107a = z10;
            this.f49108b = taskRunner;
            this.f49111e = c.f49116b;
            this.f49112f = x.f49192b;
            this.f49114h = on.b.a.f49019a;
        }

        public final n a() {
            return new n(this);
        }

        public final a b(on.b flowControlListener) {
            kotlin.jvm.internal.s.h(flowControlListener, "flowControlListener");
            this.f49114h = flowControlListener;
            return this;
        }

        public final boolean c() {
            return this.f49107a;
        }

        public final String d() {
            String str = this.f49110d;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.s.w("connectionName");
            return null;
        }

        public final on.b e() {
            return this.f49114h;
        }

        public final c f() {
            return this.f49111e;
        }

        public final int g() {
            return this.f49113g;
        }

        public final x h() {
            return this.f49112f;
        }

        public final ln.a i() {
            ln.a aVar = this.f49109c;
            if (aVar != null) {
                return aVar;
            }
            kotlin.jvm.internal.s.w("socket");
            return null;
        }

        public final kn.d j() {
            return this.f49108b;
        }

        public final a k(c listener) {
            kotlin.jvm.internal.s.h(listener, "listener");
            this.f49111e = listener;
            return this;
        }

        public final a l(int i10) {
            this.f49113g = i10;
            return this;
        }

        public final void m(String str) {
            kotlin.jvm.internal.s.h(str, "<set-?>");
            this.f49110d = str;
        }

        public final void n(ln.a aVar) {
            kotlin.jvm.internal.s.h(aVar, "<set-?>");
            this.f49109c = aVar;
        }

        public final a o(ln.a socket, String peerName) {
            String str;
            kotlin.jvm.internal.s.h(socket, "socket");
            kotlin.jvm.internal.s.h(peerName, "peerName");
            n(socket);
            if (this.f49107a) {
                str = hn.p.f40723c + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            m(str);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y a() {
            return n.D;
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f49115a = new b(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f49116b = new a();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a extends c {
            a() {
            }

            @Override // on.n.c
            public void b(u stream) {
                kotlin.jvm.internal.s.h(stream, "stream");
                stream.g(on.a.REFUSED_STREAM, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public void a(n connection, y settings) {
            kotlin.jvm.internal.s.h(connection, "connection");
            kotlin.jvm.internal.s.h(settings, "settings");
        }

        public abstract void b(u uVar);
    }

    static {
        y yVar = new y();
        yVar.h(4, 65535);
        yVar.h(5, 16384);
        D = yVar;
    }

    public n(a builder) {
        kotlin.jvm.internal.s.h(builder, "builder");
        boolean zC = builder.c();
        this.f49081a = zC;
        this.f49082b = builder.f();
        this.f49083c = new LinkedHashMap();
        String strD = builder.d();
        this.f49084d = strD;
        this.f49086f = builder.c() ? 3 : 2;
        kn.d dVarJ = builder.j();
        this.f49088h = dVarJ;
        kn.c cVarK = dVarJ.k();
        this.f49089i = cVarK;
        this.f49090j = dVarJ.k();
        this.f49091k = dVarJ.k();
        this.f49092l = builder.h();
        this.f49099s = builder.e();
        y yVar = new y();
        if (builder.c()) {
            yVar.h(4, C.DEFAULT_MUXED_BUFFER_SIZE);
        }
        this.f49100t = yVar;
        this.f49101u = D;
        this.f49102v = new pn.a(0);
        this.f49104x = this.f49101u.c();
        ln.a aVarI = builder.i();
        this.f49105y = aVarI;
        this.f49106z = new v(aVarI.b(), zC);
        this.A = new d(this, new t(aVarI.a(), zC));
        this.B = new LinkedHashSet();
        if (builder.g() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.g());
            cVarK.k(strD + " ping", nanos, new tl.a() { // from class: on.f
                @Override // tl.a
                public final Object invoke() {
                    return Long.valueOf(n.m(this.f49057a, nanos));
                }
            });
        }
    }

    public static /* synthetic */ void B1(n nVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        nVar.A1(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 H1(n nVar, int i10, on.a aVar) {
        try {
            nVar.G1(i10, aVar);
        } catch (IOException e10) {
            nVar.V0(e10);
        }
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 J1(n nVar, int i10, long j10) {
        try {
            nVar.f49106z.c0(i10, j10);
        } catch (IOException e10) {
            nVar.V0(e10);
        }
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V0(IOException iOException) {
        on.a aVar = on.a.PROTOCOL_ERROR;
        U0(aVar, aVar, iOException);
    }

    private final u j1(int i10, List list, boolean z10) throws Throwable {
        Throwable th2;
        boolean z11 = !z10;
        synchronized (this.f49106z) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f49086f > 1073741823) {
                                try {
                                    z1(on.a.REFUSED_STREAM);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                }
                            }
                            try {
                                if (this.f49087g) {
                                    throw new ConnectionShutdownException();
                                }
                                int i11 = this.f49086f;
                                this.f49086f = i11 + 2;
                                u uVar = new u(i11, this, z11, false, null);
                                boolean z12 = !z10 || this.f49103w >= this.f49104x || uVar.t() >= uVar.s();
                                if (uVar.w()) {
                                    this.f49083c.put(Integer.valueOf(i11), uVar);
                                }
                                g0 g0Var = g0.f38750a;
                                if (i10 == 0) {
                                    this.f49106z.l(z11, i11, list);
                                } else {
                                    if (this.f49081a) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.f49106z.r(i10, i11, list);
                                }
                                if (z12) {
                                    this.f49106z.flush();
                                }
                                return uVar;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        th2 = th;
                        throw th2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 l1(n nVar, int i10, xn.e eVar, int i11, boolean z10) {
        try {
            boolean zD = nVar.f49092l.d(i10, eVar, i11, z10);
            if (zD) {
                nVar.f49106z.s(i10, on.a.CANCEL);
            }
            if (zD || z10) {
                synchronized (nVar) {
                    nVar.B.remove(Integer.valueOf(i10));
                    g0 g0Var = g0.f38750a;
                }
            }
        } catch (IOException unused) {
        }
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(n nVar, long j10) {
        boolean z10;
        synchronized (nVar) {
            long j11 = nVar.f49094n;
            long j12 = nVar.f49093m;
            if (j11 < j12) {
                z10 = true;
            } else {
                nVar.f49093m = j12 + 1;
                z10 = false;
            }
        }
        if (z10) {
            nVar.V0(null);
            return -1L;
        }
        nVar.F1(false, 1, 0);
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013 A[Catch: IOException -> 0x0024, TRY_LEAVE, TryCatch #1 {IOException -> 0x0024, blocks: (B:4:0x0008, B:7:0x0013, B:9:0x001f, B:12:0x0022, B:13:0x0023, B:8:0x0014), top: B:19:0x0008, inners: #0 }] */
    public static final g0 n1(n nVar, int i10, List list, boolean z10) {
        boolean zC = nVar.f49092l.c(i10, list, z10);
        if (zC) {
            try {
                nVar.f49106z.s(i10, on.a.CANCEL);
                if (zC || z10) {
                    synchronized (nVar) {
                        nVar.B.remove(Integer.valueOf(i10));
                        g0 g0Var = g0.f38750a;
                    }
                }
            } catch (IOException unused) {
            }
        } else if (zC) {
            synchronized (nVar) {
                nVar.B.remove(Integer.valueOf(i10));
                g0 g0Var2 = g0.f38750a;
            }
        } else {
            synchronized (nVar) {
                nVar.B.remove(Integer.valueOf(i10));
                g0 g0Var3 = g0.f38750a;
            }
        }
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 p1(n nVar, int i10, List list) {
        if (nVar.f49092l.b(i10, list)) {
            try {
                nVar.f49106z.s(i10, on.a.CANCEL);
                synchronized (nVar) {
                    nVar.B.remove(Integer.valueOf(i10));
                    g0 g0Var = g0.f38750a;
                }
            } catch (IOException unused) {
            }
        }
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 r1(n nVar, int i10, on.a aVar) {
        nVar.f49092l.a(i10, aVar);
        synchronized (nVar) {
            nVar.B.remove(Integer.valueOf(i10));
        }
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 v1(n nVar) {
        nVar.F1(false, 2, 0);
        return g0.f38750a;
    }

    public final void A1(boolean z10) {
        if (z10) {
            this.f49106z.d();
            this.f49106z.t(this.f49100t);
            int iC = this.f49100t.c();
            if (iC != 65535) {
                this.f49106z.c0(0, iC - 65535);
            }
        }
        kn.c.d(this.f49088h.k(), this.f49084d, 0L, false, this.A, 6, null);
    }

    public final void C1(long j10) {
        synchronized (this) {
            try {
                pn.a.c(this.f49102v, j10, 0L, 2, null);
                long jA = this.f49102v.a();
                if (jA >= this.f49100t.c() / 2) {
                    K1(0, jA);
                    pn.a.c(this.f49102v, 0L, jA, 1, null);
                }
                this.f49099s.b(this.f49102v);
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void D1(int i10, boolean z10, xn.e eVar, long j10) {
        long j11;
        long j12;
        int iMin;
        long j13;
        if (j10 == 0) {
            this.f49106z.h(z10, i10, eVar, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j11 = this.f49103w;
                            j12 = this.f49104x;
                            if (j11 >= j12) {
                                if (!this.f49083c.containsKey(Integer.valueOf(i10))) {
                                    throw new IOException("stream closed");
                                }
                                kotlin.jvm.internal.s.f(this, "null cannot be cast to non-null type java.lang.Object");
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    throw th2;
                }
                iMin = Math.min((int) Math.min(j10, j12 - j11), this.f49106z.m());
                j13 = iMin;
                this.f49103w += j13;
                g0 g0Var = g0.f38750a;
            }
            j10 -= j13;
            this.f49106z.h(z10 && j10 == 0, i10, eVar, iMin);
        }
    }

    public final void E1(int i10, boolean z10, List alternating) {
        kotlin.jvm.internal.s.h(alternating, "alternating");
        this.f49106z.l(z10, i10, alternating);
    }

    public final void F1(boolean z10, int i10, int i11) {
        try {
            this.f49106z.q(z10, i10, i11);
        } catch (IOException e10) {
            V0(e10);
        }
    }

    public final void G1(int i10, on.a statusCode) {
        kotlin.jvm.internal.s.h(statusCode, "statusCode");
        this.f49106z.s(i10, statusCode);
    }

    public final void I1(final int i10, final on.a errorCode) {
        kotlin.jvm.internal.s.h(errorCode, "errorCode");
        kn.c.d(this.f49089i, this.f49084d + '[' + i10 + "] writeSynReset", 0L, false, new tl.a() { // from class: on.i
            @Override // tl.a
            public final Object invoke() {
                return n.H1(this.f49063a, i10, errorCode);
            }
        }, 6, null);
    }

    public final void K1(final int i10, final long j10) {
        kn.c.d(this.f49089i, this.f49084d + '[' + i10 + "] windowUpdate", 0L, false, new tl.a() { // from class: on.g
            @Override // tl.a
            public final Object invoke() {
                return n.J1(this.f49059a, i10, j10);
            }
        }, 6, null);
    }

    public final void U0(on.a connectionCode, on.a streamCode, IOException iOException) {
        int i10;
        Object[] array;
        kotlin.jvm.internal.s.h(connectionCode, "connectionCode");
        kotlin.jvm.internal.s.h(streamCode, "streamCode");
        if (hn.p.f40722b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            z1(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f49083c.isEmpty()) {
                    array = null;
                } else {
                    array = this.f49083c.values().toArray(new u[0]);
                    this.f49083c.clear();
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        u[] uVarArr = (u[]) array;
        if (uVarArr != null) {
            for (u uVar : uVarArr) {
                try {
                    uVar.g(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f49106z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f49105y.cancel();
        } catch (IOException unused4) {
        }
        this.f49089i.q();
        this.f49090j.q();
        this.f49091k.q();
    }

    public final boolean W0() {
        return this.f49081a;
    }

    public final String X0() {
        return this.f49084d;
    }

    public final on.b Y0() {
        return this.f49099s;
    }

    public final int Z0() {
        return this.f49085e;
    }

    public final c a1() {
        return this.f49082b;
    }

    public final int b1() {
        return this.f49086f;
    }

    public final y c1() {
        return this.f49100t;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        U0(on.a.NO_ERROR, on.a.CANCEL, null);
    }

    public final y d1() {
        return this.f49101u;
    }

    public final u e1(int i10) {
        u uVar;
        synchronized (this) {
            uVar = (u) this.f49083c.get(Integer.valueOf(i10));
        }
        return uVar;
    }

    public final Map f1() {
        return this.f49083c;
    }

    public final void flush() {
        this.f49106z.flush();
    }

    public final long g1() {
        return this.f49104x;
    }

    public final v h1() {
        return this.f49106z;
    }

    public final boolean i1(long j10) {
        synchronized (this) {
            if (this.f49087g) {
                return false;
            }
            return this.f49096p >= this.f49095o || j10 < this.f49098r;
        }
    }

    public final u k1(List requestHeaders, boolean z10) {
        kotlin.jvm.internal.s.h(requestHeaders, "requestHeaders");
        return j1(0, requestHeaders, z10);
    }

    public final void m1(final int i10, xn.g source, final int i11, final boolean z10) {
        kotlin.jvm.internal.s.h(source, "source");
        final xn.e eVar = new xn.e();
        long j10 = i11;
        source.Z(j10);
        source.read(eVar, j10);
        kn.c.d(this.f49090j, this.f49084d + '[' + i10 + "] onData", 0L, false, new tl.a() { // from class: on.j
            @Override // tl.a
            public final Object invoke() {
                return n.l1(this.f49066a, i10, eVar, i11, z10);
            }
        }, 6, null);
    }

    public final void o1(final int i10, final List requestHeaders, final boolean z10) {
        kotlin.jvm.internal.s.h(requestHeaders, "requestHeaders");
        kn.c.d(this.f49090j, this.f49084d + '[' + i10 + "] onHeaders", 0L, false, new tl.a() { // from class: on.m
            @Override // tl.a
            public final Object invoke() {
                return n.n1(this.f49077a, i10, requestHeaders, z10);
            }
        }, 6, null);
    }

    public final void q1(final int i10, final List requestHeaders) {
        kotlin.jvm.internal.s.h(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.B.contains(Integer.valueOf(i10))) {
                I1(i10, on.a.PROTOCOL_ERROR);
                return;
            }
            this.B.add(Integer.valueOf(i10));
            kn.c.d(this.f49090j, this.f49084d + '[' + i10 + "] onRequest", 0L, false, new tl.a() { // from class: on.k
                @Override // tl.a
                public final Object invoke() {
                    return n.p1(this.f49071a, i10, requestHeaders);
                }
            }, 6, null);
        }
    }

    public final void s1(final int i10, final on.a errorCode) {
        kotlin.jvm.internal.s.h(errorCode, "errorCode");
        kn.c.d(this.f49090j, this.f49084d + '[' + i10 + "] onReset", 0L, false, new tl.a() { // from class: on.l
            @Override // tl.a
            public final Object invoke() {
                return n.r1(this.f49074a, i10, errorCode);
            }
        }, 6, null);
    }

    public final boolean t1(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final u u1(int i10) {
        u uVar;
        synchronized (this) {
            uVar = (u) this.f49083c.remove(Integer.valueOf(i10));
            kotlin.jvm.internal.s.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
        return uVar;
    }

    public final void w1() {
        synchronized (this) {
            long j10 = this.f49096p;
            long j11 = this.f49095o;
            if (j10 < j11) {
                return;
            }
            this.f49095o = j11 + 1;
            this.f49098r = System.nanoTime() + ((long) 1000000000);
            g0 g0Var = g0.f38750a;
            kn.c.d(this.f49089i, this.f49084d + " ping", 0L, false, new tl.a() { // from class: on.h
                @Override // tl.a
                public final Object invoke() {
                    return n.v1(this.f49062a);
                }
            }, 6, null);
        }
    }

    public final void x1(int i10) {
        this.f49085e = i10;
    }

    public final void y1(y yVar) {
        kotlin.jvm.internal.s.h(yVar, "<set-?>");
        this.f49101u = yVar;
    }

    public final void z1(on.a statusCode) {
        kotlin.jvm.internal.s.h(statusCode, "statusCode");
        synchronized (this.f49106z) {
            synchronized (this) {
                if (this.f49087g) {
                    return;
                }
                this.f49087g = true;
                int i10 = this.f49085e;
                g0 g0Var = g0.f38750a;
                this.f49106z.k(i10, statusCode, hn.m.f40716a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class d implements t.c, tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f49117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f49118b;

        public d(n nVar, t reader) {
            kotlin.jvm.internal.s.h(reader, "reader");
            this.f49118b = nVar;
            this.f49117a = reader;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 r(n nVar, k0 k0Var) {
            nVar.a1().a(nVar, (y) k0Var.f43597a);
            return g0.f38750a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 s(n nVar, u uVar) {
            try {
                nVar.a1().b(uVar);
            } catch (IOException e10) {
                okhttp3.internal.platform.c.f48992a.e().m("Http2Connection.Listener failure for " + nVar.X0(), 4, e10);
                try {
                    uVar.g(on.a.PROTOCOL_ERROR, e10);
                } catch (IOException unused) {
                }
            }
            return g0.f38750a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 u(n nVar, int i10, int i11) {
            nVar.F1(true, i10, i11);
            return g0.f38750a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 v(d dVar, boolean z10, y yVar) {
            dVar.q(z10, yVar);
            return g0.f38750a;
        }

        @Override // on.t.c
        public void a(int i10, on.a errorCode, xn.h debugData) {
            int i11;
            Object[] array;
            kotlin.jvm.internal.s.h(errorCode, "errorCode");
            kotlin.jvm.internal.s.h(debugData, "debugData");
            debugData.D();
            n nVar = this.f49118b;
            synchronized (nVar) {
                array = nVar.f1().values().toArray(new u[0]);
                nVar.f49087g = true;
                g0 g0Var = g0.f38750a;
            }
            for (u uVar : (u[]) array) {
                if (uVar.n() > i10 && uVar.v()) {
                    uVar.B(on.a.REFUSED_STREAM);
                    this.f49118b.u1(uVar.n());
                }
            }
        }

        @Override // on.t.c
        public void b(boolean z10, int i10, int i11, List headerBlock) {
            kotlin.jvm.internal.s.h(headerBlock, "headerBlock");
            if (this.f49118b.t1(i10)) {
                this.f49118b.o1(i10, headerBlock, z10);
                return;
            }
            final n nVar = this.f49118b;
            synchronized (nVar) {
                u uVarE1 = nVar.e1(i10);
                if (uVarE1 != null) {
                    g0 g0Var = g0.f38750a;
                    uVarE1.A(hn.p.s(headerBlock), z10);
                    return;
                }
                if (nVar.f49087g) {
                    return;
                }
                if (i10 <= nVar.Z0()) {
                    return;
                }
                if (i10 % 2 == nVar.b1() % 2) {
                    return;
                }
                final u uVar = new u(i10, nVar, false, z10, hn.p.s(headerBlock));
                nVar.x1(i10);
                nVar.f1().put(Integer.valueOf(i10), uVar);
                kn.c.d(nVar.f49088h.k(), nVar.X0() + '[' + i10 + "] onStream", 0L, false, new tl.a() { // from class: on.p
                    @Override // tl.a
                    public final Object invoke() {
                        return n.d.s(nVar, uVar);
                    }
                }, 6, null);
            }
        }

        @Override // on.t.c
        public void c(int i10, long j10) {
            if (i10 == 0) {
                n nVar = this.f49118b;
                synchronized (nVar) {
                    nVar.f49104x = nVar.g1() + j10;
                    kotlin.jvm.internal.s.f(nVar, "null cannot be cast to non-null type java.lang.Object");
                    nVar.notifyAll();
                    g0 g0Var = g0.f38750a;
                }
                return;
            }
            u uVarE1 = this.f49118b.e1(i10);
            if (uVarE1 != null) {
                synchronized (uVarE1) {
                    uVarE1.d(j10);
                    g0 g0Var2 = g0.f38750a;
                }
            }
        }

        @Override // on.t.c
        public void e(boolean z10, int i10, xn.g source, int i11) {
            kotlin.jvm.internal.s.h(source, "source");
            if (this.f49118b.t1(i10)) {
                this.f49118b.m1(i10, source, i11, z10);
                return;
            }
            u uVarE1 = this.f49118b.e1(i10);
            if (uVarE1 == null) {
                this.f49118b.I1(i10, on.a.PROTOCOL_ERROR);
                long j10 = i11;
                this.f49118b.C1(j10);
                source.skip(j10);
                return;
            }
            uVarE1.z(source, i11);
            if (z10) {
                uVarE1.A(gn.x.f39773c, true);
            }
        }

        @Override // on.t.c
        public void f(int i10, int i11, List requestHeaders) {
            kotlin.jvm.internal.s.h(requestHeaders, "requestHeaders");
            this.f49118b.q1(i11, requestHeaders);
        }

        @Override // on.t.c
        public void g(final boolean z10, final y settings) {
            kotlin.jvm.internal.s.h(settings, "settings");
            kn.c.d(this.f49118b.f49089i, this.f49118b.X0() + " applyAndAckSettings", 0L, false, new tl.a() { // from class: on.q
                @Override // tl.a
                public final Object invoke() {
                    return n.d.v(this.f49124a, z10, settings);
                }
            }, 6, null);
        }

        @Override // on.t.c
        public void i(boolean z10, final int i10, final int i11) {
            if (!z10) {
                kn.c cVar = this.f49118b.f49089i;
                String str = this.f49118b.X0() + " ping";
                final n nVar = this.f49118b;
                kn.c.d(cVar, str, 0L, false, new tl.a() { // from class: on.o
                    @Override // tl.a
                    public final Object invoke() {
                        return n.d.u(nVar, i10, i11);
                    }
                }, 6, null);
                return;
            }
            n nVar2 = this.f49118b;
            synchronized (nVar2) {
                try {
                    if (i10 == 1) {
                        nVar2.f49094n++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            nVar2.f49097q++;
                            kotlin.jvm.internal.s.f(nVar2, "null cannot be cast to non-null type java.lang.Object");
                            nVar2.notifyAll();
                        }
                        g0 g0Var = g0.f38750a;
                    } else {
                        nVar2.f49096p++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            t();
            return g0.f38750a;
        }

        @Override // on.t.c
        public void k(int i10, on.a errorCode) {
            kotlin.jvm.internal.s.h(errorCode, "errorCode");
            if (this.f49118b.t1(i10)) {
                this.f49118b.s1(i10, errorCode);
                return;
            }
            u uVarU1 = this.f49118b.u1(i10);
            if (uVarU1 != null) {
                uVarU1.B(errorCode);
            }
        }

        public final void q(boolean z10, y yVar) {
            long jC;
            int i10;
            u[] uVarArr;
            y settings = yVar;
            kotlin.jvm.internal.s.h(settings, "settings");
            final k0 k0Var = new k0();
            v vVarH1 = this.f49118b.h1();
            final n nVar = this.f49118b;
            synchronized (vVarH1) {
                synchronized (nVar) {
                    try {
                        y yVarD1 = nVar.d1();
                        if (!z10) {
                            y yVar2 = new y();
                            yVar2.g(yVarD1);
                            yVar2.g(settings);
                            settings = yVar2;
                        }
                        k0Var.f43597a = settings;
                        jC = ((long) settings.c()) - ((long) yVarD1.c());
                        uVarArr = (jC == 0 || nVar.f1().isEmpty()) ? null : (u[]) nVar.f1().values().toArray(new u[0]);
                        nVar.y1((y) k0Var.f43597a);
                        kn.c.d(nVar.f49091k, nVar.X0() + " onSettings", 0L, false, new tl.a() { // from class: on.r
                            @Override // tl.a
                            public final Object invoke() {
                                return n.d.r(nVar, k0Var);
                            }
                        }, 6, null);
                        g0 g0Var = g0.f38750a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    nVar.h1().a((y) k0Var.f43597a);
                } catch (IOException e10) {
                    nVar.V0(e10);
                }
                g0 g0Var2 = g0.f38750a;
            }
            if (uVarArr != null) {
                for (u uVar : uVarArr) {
                    synchronized (uVar) {
                        uVar.d(jC);
                        g0 g0Var3 = g0.f38750a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [on.a] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, on.t] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void t() throws Throwable {
            on.a aVar;
            on.a aVar2 = on.a.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f49117a.i(this);
                    while (this.f49117a.h(false, this)) {
                    }
                    on.a aVar3 = on.a.NO_ERROR;
                    try {
                        this.f49118b.U0(aVar3, on.a.CANCEL, null);
                        aVar = aVar3;
                    } catch (IOException e11) {
                        e10 = e11;
                        on.a aVar4 = on.a.PROTOCOL_ERROR;
                        n nVar = this.f49118b;
                        nVar.U0(aVar4, aVar4, e10);
                        aVar = nVar;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f49118b.U0(aVar, aVar2, e10);
                    hn.m.f(this.f49117a);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th3) {
                th = th3;
                aVar = aVar2;
                this.f49118b.U0(aVar, aVar2, e10);
                hn.m.f(this.f49117a);
                throw th;
            }
            aVar2 = this.f49117a;
            hn.m.f(aVar2);
        }

        @Override // on.t.c
        public void h() {
        }

        @Override // on.t.c
        public void j(int i10, int i11, int i12, boolean z10) {
        }
    }
}
