package gn;

import com.google.api.client.http.HttpMethods;
import gl.s0;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o0;
import xn.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f39486g = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jn.f f39487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39492f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final jn.f.d f39493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f39494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f39495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final xn.g f39496d;

        /* JADX INFO: renamed from: gn.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0593a extends xn.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f39497a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0593a(q0 q0Var, a aVar) {
                super(q0Var);
                this.f39497a = aVar;
            }

            @Override // xn.o, xn.q0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f39497a.h().close();
                super.close();
            }
        }

        public a(jn.f.d snapshot, String str, String str2) {
            kotlin.jvm.internal.s.h(snapshot, "snapshot");
            this.f39493a = snapshot;
            this.f39494b = str;
            this.f39495c = str2;
            this.f39496d = xn.c0.c(new C0593a(snapshot.h(1), this));
        }

        @Override // gn.g0
        public long contentLength() {
            String str = this.f39495c;
            if (str != null) {
                return hn.m.C(str, -1L);
            }
            return -1L;
        }

        @Override // gn.g0
        public a0 contentType() {
            String str = this.f39494b;
            if (str != null) {
                return a0.f39423e.b(str);
            }
            return null;
        }

        public final jn.f.d h() {
            return this.f39493a;
        }

        @Override // gn.g0
        public xn.g source() {
            return this.f39496d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set d(x xVar) {
            int size = xVar.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (bm.r.A("Vary", xVar.d(i10), true)) {
                    String strH = xVar.h(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(bm.r.C(o0.f43602a));
                    }
                    Iterator it = bm.r.E0(strH, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(bm.r.V0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? s0.d() : treeSet;
        }

        private final x e(x xVar, x xVar2) {
            Set setD = d(xVar2);
            if (setD.isEmpty()) {
                return x.f39773c;
            }
            x.a aVar = new x.a();
            int size = xVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strD = xVar.d(i10);
                if (setD.contains(strD)) {
                    aVar.a(strD, xVar.h(i10));
                }
            }
            return aVar.d();
        }

        public final boolean a(f0 f0Var) {
            kotlin.jvm.internal.s.h(f0Var, "<this>");
            return d(f0Var.d0()).contains("*");
        }

        public final String b(y url) {
            kotlin.jvm.internal.s.h(url, "url");
            return xn.h.f56912d.d(url.toString()).x().o();
        }

        public final int c(xn.g source) throws IOException {
            kotlin.jvm.internal.s.h(source, "source");
            try {
                long jQ0 = source.q0();
                String strR = source.R();
                if (jQ0 >= 0 && jQ0 <= 2147483647L && strR.length() <= 0) {
                    return (int) jQ0;
                }
                throw new IOException("expected an int but was \"" + jQ0 + strR + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final x f(f0 f0Var) {
            kotlin.jvm.internal.s.h(f0Var, "<this>");
            f0 f0VarP0 = f0Var.p0();
            kotlin.jvm.internal.s.e(f0VarP0);
            return e(f0VarP0.U0().f(), f0Var.d0());
        }

        public final boolean g(f0 cachedResponse, x cachedRequest, d0 newRequest) {
            kotlin.jvm.internal.s.h(cachedResponse, "cachedResponse");
            kotlin.jvm.internal.s.h(cachedRequest, "cachedRequest");
            kotlin.jvm.internal.s.h(newRequest, "newRequest");
            Set<String> setD = d(cachedResponse.d0());
            if (setD != null && setD.isEmpty()) {
                return true;
            }
            for (String str : setD) {
                if (!kotlin.jvm.internal.s.c(cachedRequest.k(str), newRequest.g(str))) {
                    return false;
                }
            }
            return true;
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class d implements jn.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final jn.f.b f39511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final xn.o0 f39512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final xn.o0 f39513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f39514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f39515e;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a extends xn.n {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f39516b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f39517c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, d dVar, xn.o0 o0Var) {
                super(o0Var);
                this.f39516b = cVar;
                this.f39517c = dVar;
            }

            @Override // xn.n, xn.o0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                c cVar = this.f39516b;
                d dVar = this.f39517c;
                synchronized (cVar) {
                    if (dVar.d()) {
                        return;
                    }
                    dVar.e(true);
                    cVar.l(cVar.h() + 1);
                    super.close();
                    this.f39517c.f39511a.c();
                }
            }
        }

        public d(c cVar, jn.f.b editor) {
            kotlin.jvm.internal.s.h(editor, "editor");
            this.f39515e = cVar;
            this.f39511a = editor;
            xn.o0 o0VarG = editor.g(1);
            this.f39512b = o0VarG;
            this.f39513c = new a(cVar, this, o0VarG);
        }

        @Override // jn.c
        public void a() {
            c cVar = this.f39515e;
            synchronized (cVar) {
                if (this.f39514d) {
                    return;
                }
                this.f39514d = true;
                cVar.k(cVar.d() + 1);
                hn.m.f(this.f39512b);
                try {
                    this.f39511a.b();
                } catch (IOException unused) {
                }
            }
        }

        @Override // jn.c
        public xn.o0 b() {
            return this.f39513c;
        }

        public final boolean d() {
            return this.f39514d;
        }

        public final void e(boolean z10) {
            this.f39514d = z10;
        }
    }

    public c(xn.h0 directory, long j10, xn.l fileSystem, kn.d taskRunner) {
        kotlin.jvm.internal.s.h(directory, "directory");
        kotlin.jvm.internal.s.h(fileSystem, "fileSystem");
        kotlin.jvm.internal.s.h(taskRunner, "taskRunner");
        this.f39487a = new jn.f(fileSystem, directory, 201105, 2, j10, taskRunner);
    }

    private final void a(jn.f.b bVar) {
        if (bVar != null) {
            try {
                bVar.b();
            } catch (IOException unused) {
            }
        }
    }

    public final f0 c(d0 request) {
        kotlin.jvm.internal.s.h(request, "request");
        try {
            jn.f.d dVarD0 = this.f39487a.d0(f39486g.b(request.m()));
            if (dVarD0 == null) {
                return null;
            }
            try {
                C0594c c0594c = new C0594c(dVarD0.h(0));
                f0 f0VarC = c0594c.c(dVarD0);
                if (c0594c.a(request, f0VarC)) {
                    return f0VarC;
                }
                hn.m.f(f0VarC.d());
                return null;
            } catch (IOException unused) {
                hn.m.f(dVarD0);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39487a.close();
    }

    public final int d() {
        return this.f39489c;
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f39487a.flush();
    }

    public final int h() {
        return this.f39488b;
    }

    public final jn.c i(f0 response) {
        jn.f.b bVarC0;
        kotlin.jvm.internal.s.h(response, "response");
        String strI = response.U0().i();
        if (mn.f.a(response.U0().i())) {
            try {
                j(response.U0());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!kotlin.jvm.internal.s.c(strI, HttpMethods.GET)) {
            return null;
        }
        b bVar = f39486g;
        if (bVar.a(response)) {
            return null;
        }
        C0594c c0594c = new C0594c(response);
        try {
            bVarC0 = jn.f.c0(this.f39487a, bVar.b(response.U0().m()), 0L, 2, null);
            if (bVarC0 == null) {
                return null;
            }
            try {
                c0594c.e(bVarC0);
                return new d(this, bVarC0);
            } catch (IOException unused2) {
                a(bVarC0);
                return null;
            }
        } catch (IOException unused3) {
            bVarC0 = null;
        }
    }

    public final void j(d0 request) {
        kotlin.jvm.internal.s.h(request, "request");
        this.f39487a.Y0(f39486g.b(request.m()));
    }

    public final void k(int i10) {
        this.f39489c = i10;
    }

    public final void l(int i10) {
        this.f39488b = i10;
    }

    public final synchronized void m() {
        this.f39491e++;
    }

    public final synchronized void q(jn.d cacheStrategy) {
        try {
            kotlin.jvm.internal.s.h(cacheStrategy, "cacheStrategy");
            this.f39492f++;
            if (cacheStrategy.b() != null) {
                this.f39490d++;
            } else if (cacheStrategy.a() != null) {
                this.f39491e++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void r(f0 cached, f0 network) {
        jn.f.b bVarD;
        kotlin.jvm.internal.s.h(cached, "cached");
        kotlin.jvm.internal.s.h(network, "network");
        C0594c c0594c = new C0594c(network);
        g0 g0VarD = cached.d();
        kotlin.jvm.internal.s.f(g0VarD, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            bVarD = ((a) g0VarD).h().d();
            if (bVarD == null) {
                return;
            }
            try {
                c0594c.e(bVarD);
                bVarD.c();
            } catch (IOException unused) {
                a(bVarD);
            }
        } catch (IOException unused2) {
            bVarD = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(xn.l fileSystem, xn.h0 directory, long j10) {
        this(directory, j10, fileSystem, kn.d.f43546m);
        kotlin.jvm.internal.s.h(fileSystem, "fileSystem");
        kotlin.jvm.internal.s.h(directory, "directory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(File directory, long j10) {
        this(xn.l.f56948b, xn.h0.a.d(xn.h0.f56917b, directory, false, 1, null), j10);
        kotlin.jvm.internal.s.h(directory, "directory");
    }

    /* JADX INFO: renamed from: gn.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0594c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f39498k = new a(null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f39499l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f39500m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y f39501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x f39502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f39503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c0 f39504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f39505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f39506f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final x f39507g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final w f39508h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f39509i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f39510j;

        /* JADX INFO: renamed from: gn.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        static {
            StringBuilder sb2 = new StringBuilder();
            okhttp3.internal.platform.c.a aVar = okhttp3.internal.platform.c.f48992a;
            sb2.append(aVar.e().i());
            sb2.append("-Sent-Millis");
            f39499l = sb2.toString();
            f39500m = aVar.e().i() + "-Received-Millis";
        }

        public C0594c(q0 rawSource) throws IOException {
            kotlin.jvm.internal.s.h(rawSource, "rawSource");
            try {
                xn.g gVarC = xn.c0.c(rawSource);
                String strR = gVarC.R();
                y yVarD = y.f39776j.d(strR);
                if (yVarD == null) {
                    IOException iOException = new IOException("Cache corruption for " + strR);
                    okhttp3.internal.platform.c.f48992a.e().m("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f39501a = yVarD;
                this.f39503c = gVarC.R();
                x.a aVar = new x.a();
                int iC = c.f39486g.c(gVarC);
                for (int i10 = 0; i10 < iC; i10++) {
                    aVar.b(gVarC.R());
                }
                this.f39502b = aVar.d();
                mn.k kVarA = mn.k.f46513d.a(gVarC.R());
                this.f39504d = kVarA.f46514a;
                this.f39505e = kVarA.f46515b;
                this.f39506f = kVarA.f46516c;
                x.a aVar2 = new x.a();
                int iC2 = c.f39486g.c(gVarC);
                for (int i11 = 0; i11 < iC2; i11++) {
                    aVar2.b(gVarC.R());
                }
                String str = f39499l;
                String strE = aVar2.e(str);
                String str2 = f39500m;
                String strE2 = aVar2.e(str2);
                aVar2.g(str);
                aVar2.g(str2);
                this.f39509i = strE != null ? Long.parseLong(strE) : 0L;
                this.f39510j = strE2 != null ? Long.parseLong(strE2) : 0L;
                this.f39507g = aVar2.d();
                if (this.f39501a.h()) {
                    String strR2 = gVarC.R();
                    if (strR2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strR2 + '\"');
                    }
                    this.f39508h = w.f39767e.c(!gVarC.n0() ? i0.f39632b.a(gVarC.R()) : i0.SSL_3_0, j.f39643b.b(gVarC.R()), b(gVarC), b(gVarC));
                } else {
                    this.f39508h = null;
                }
                fl.g0 g0Var = fl.g0.f38750a;
                ql.b.a(rawSource, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.b.a(rawSource, th2);
                    throw th3;
                }
            }
        }

        private final List b(xn.g gVar) throws IOException {
            int iC = c.f39486g.c(gVar);
            if (iC == -1) {
                return gl.r.l();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iC);
                for (int i10 = 0; i10 < iC; i10++) {
                    String strR = gVar.R();
                    xn.e eVar = new xn.e();
                    xn.h hVarA = xn.h.f56912d.a(strR);
                    if (hVarA == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    eVar.k0(hVarA);
                    arrayList.add(certificateFactory.generateCertificate(eVar.S0()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void d(xn.f fVar, List list) throws IOException {
            try {
                fVar.a0(list.size()).writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = ((Certificate) it.next()).getEncoded();
                    xn.h.a aVar = xn.h.f56912d;
                    kotlin.jvm.internal.s.e(encoded);
                    fVar.N(xn.h.a.g(aVar, encoded, 0, 0, 3, null).d()).writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean a(d0 request, f0 response) {
            kotlin.jvm.internal.s.h(request, "request");
            kotlin.jvm.internal.s.h(response, "response");
            return kotlin.jvm.internal.s.c(this.f39501a, request.m()) && kotlin.jvm.internal.s.c(this.f39503c, request.i()) && c.f39486g.g(response, this.f39502b, request);
        }

        public final f0 c(jn.f.d snapshot) {
            kotlin.jvm.internal.s.h(snapshot, "snapshot");
            String strA = this.f39507g.a("Content-Type");
            String strA2 = this.f39507g.a("Content-Length");
            return new f0.a().q(new d0(this.f39501a, this.f39502b, this.f39503c, null, 8, null)).o(this.f39504d).f(this.f39505e).l(this.f39506f).j(this.f39507g).b(new a(snapshot, strA, strA2)).h(this.f39508h).r(this.f39509i).p(this.f39510j).c();
        }

        public final void e(jn.f.b editor) throws IOException {
            kotlin.jvm.internal.s.h(editor, "editor");
            xn.f fVarB = xn.c0.b(editor.g(0));
            try {
                fVarB.N(this.f39501a.toString()).writeByte(10);
                fVarB.N(this.f39503c).writeByte(10);
                fVarB.a0(this.f39502b.size()).writeByte(10);
                int size = this.f39502b.size();
                for (int i10 = 0; i10 < size; i10++) {
                    fVarB.N(this.f39502b.d(i10)).N(": ").N(this.f39502b.h(i10)).writeByte(10);
                }
                fVarB.N(new mn.k(this.f39504d, this.f39505e, this.f39506f).toString()).writeByte(10);
                fVarB.a0(this.f39507g.size() + 2).writeByte(10);
                int size2 = this.f39507g.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    fVarB.N(this.f39507g.d(i11)).N(": ").N(this.f39507g.h(i11)).writeByte(10);
                }
                fVarB.N(f39499l).N(": ").a0(this.f39509i).writeByte(10);
                fVarB.N(f39500m).N(": ").a0(this.f39510j).writeByte(10);
                if (this.f39501a.h() && this.f39508h != null) {
                    fVarB.writeByte(10);
                    fVarB.N(this.f39508h.b().c()).writeByte(10);
                    d(fVarB, this.f39508h.e());
                    d(fVarB, this.f39508h.d());
                    fVarB.N(this.f39508h.g().g()).writeByte(10);
                }
                fl.g0 g0Var = fl.g0.f38750a;
                ql.b.a(fVarB, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.b.a(fVarB, th2);
                    throw th3;
                }
            }
        }

        public C0594c(f0 response) {
            kotlin.jvm.internal.s.h(response, "response");
            this.f39501a = response.U0().m();
            this.f39502b = c.f39486g.f(response);
            this.f39503c = response.U0().i();
            this.f39504d = response.N0();
            this.f39505e = response.m();
            this.f39506f = response.m0();
            this.f39507g = response.d0();
            this.f39508h = response.r();
            this.f39509i = response.V0();
            this.f39510j = response.T0();
        }
    }
}
