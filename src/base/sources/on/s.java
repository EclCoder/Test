package on;

import gn.b0;
import gn.c0;
import gn.d0;
import gn.f0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xn.o0;
import xn.p0;
import xn.q0;
import xn.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class s implements mn.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f49129g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List f49130h = hn.p.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List f49131i = hn.p.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mn.d.a f49132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mn.g f49133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f49134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile u f49135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c0 f49136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f49137f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(d0 request) {
            kotlin.jvm.internal.s.h(request, "request");
            gn.x xVarF = request.f();
            ArrayList arrayList = new ArrayList(xVarF.size() + 4);
            arrayList.add(new c(c.f49023g, request.i()));
            arrayList.add(new c(c.f49024h, mn.i.f46511a.c(request.m())));
            String strE = request.e("Host");
            if (strE != null) {
                arrayList.add(new c(c.f49026j, strE));
            }
            arrayList.add(new c(c.f49025i, request.m().p()));
            int size = xVarF.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strD = xVarF.d(i10);
                Locale US = Locale.US;
                kotlin.jvm.internal.s.g(US, "US");
                String lowerCase = strD.toLowerCase(US);
                kotlin.jvm.internal.s.g(lowerCase, "toLowerCase(...)");
                if (!s.f49130h.contains(lowerCase) || (kotlin.jvm.internal.s.c(lowerCase, "te") && kotlin.jvm.internal.s.c(xVarF.h(i10), "trailers"))) {
                    arrayList.add(new c(lowerCase, xVarF.h(i10)));
                }
            }
            return arrayList;
        }

        public final f0.a b(gn.x headerBlock, c0 protocol) throws ProtocolException {
            kotlin.jvm.internal.s.h(headerBlock, "headerBlock");
            kotlin.jvm.internal.s.h(protocol, "protocol");
            gn.x.a aVar = new gn.x.a();
            int size = headerBlock.size();
            mn.k kVarA = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strD = headerBlock.d(i10);
                String strH = headerBlock.h(i10);
                if (kotlin.jvm.internal.s.c(strD, ":status")) {
                    kVarA = mn.k.f46513d.a("HTTP/1.1 " + strH);
                } else if (!s.f49131i.contains(strD)) {
                    aVar.c(strD, strH);
                }
            }
            if (kVarA != null) {
                return new f0.a().o(protocol).f(kVarA.f46515b).l(kVarA.f46516c).j(aVar.d());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private a() {
        }
    }

    public s(b0 client, mn.d.a carrier, mn.g chain, n http2Connection) {
        kotlin.jvm.internal.s.h(client, "client");
        kotlin.jvm.internal.s.h(carrier, "carrier");
        kotlin.jvm.internal.s.h(chain, "chain");
        kotlin.jvm.internal.s.h(http2Connection, "http2Connection");
        this.f49132a = carrier;
        this.f49133b = chain;
        this.f49134c = http2Connection;
        List listZ = client.z();
        c0 c0Var = c0.H2_PRIOR_KNOWLEDGE;
        this.f49136e = listZ.contains(c0Var) ? c0Var : c0.HTTP_2;
    }

    @Override // mn.d
    public void a() {
        u uVar = this.f49135d;
        kotlin.jvm.internal.s.e(uVar);
        uVar.b().close();
    }

    @Override // mn.d
    public long b(f0 response) {
        kotlin.jvm.internal.s.h(response, "response");
        if (mn.e.b(response)) {
            return hn.p.k(response);
        }
        return 0L;
    }

    @Override // mn.d
    public o0 c(d0 request, long j10) {
        kotlin.jvm.internal.s.h(request, "request");
        u uVar = this.f49135d;
        kotlin.jvm.internal.s.e(uVar);
        return uVar.b();
    }

    @Override // mn.d
    public void cancel() {
        this.f49137f = true;
        u uVar = this.f49135d;
        if (uVar != null) {
            uVar.i(on.a.CANCEL);
        }
    }

    @Override // mn.d
    public boolean d() {
        u uVar = this.f49135d;
        return uVar != null && uVar.x();
    }

    @Override // mn.d
    public void e(d0 request) throws IOException {
        kotlin.jvm.internal.s.h(request, "request");
        if (this.f49135d != null) {
            return;
        }
        this.f49135d = this.f49134c.k1(f49129g.a(request), request.a() != null);
        if (this.f49137f) {
            u uVar = this.f49135d;
            kotlin.jvm.internal.s.e(uVar);
            uVar.i(on.a.CANCEL);
            throw new IOException("Canceled");
        }
        u uVar2 = this.f49135d;
        kotlin.jvm.internal.s.e(uVar2);
        r0 r0VarY = uVar2.y();
        long jW = this.f49133b.w();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r0VarY.g(jW, timeUnit);
        u uVar3 = this.f49135d;
        kotlin.jvm.internal.s.e(uVar3);
        uVar3.F().g(this.f49133b.A(), timeUnit);
    }

    @Override // mn.d
    public f0.a f(boolean z10) throws IOException {
        u uVar = this.f49135d;
        if (uVar == null) {
            throw new IOException("stream wasn't created");
        }
        f0.a aVarB = f49129g.b(uVar.D(z10), this.f49136e);
        if (z10 && aVarB.g() == 100) {
            return null;
        }
        return aVarB;
    }

    @Override // mn.d
    public void g() {
        this.f49134c.flush();
    }

    @Override // mn.d
    public p0 h() {
        u uVar = this.f49135d;
        kotlin.jvm.internal.s.e(uVar);
        return uVar;
    }

    @Override // mn.d
    public mn.d.a i() {
        return this.f49132a;
    }

    @Override // mn.d
    public q0 j(f0 response) {
        kotlin.jvm.internal.s.h(response, "response");
        u uVar = this.f49135d;
        kotlin.jvm.internal.s.e(uVar);
        return uVar.a();
    }
}
