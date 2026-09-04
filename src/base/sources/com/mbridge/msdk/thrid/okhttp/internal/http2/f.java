package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.r;
import com.mbridge.msdk.thrid.okio.s;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class f implements com.mbridge.msdk.thrid.okhttp.internal.http.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<String> f33292f = com.mbridge.msdk.thrid.okhttp.internal.c.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<String> f33293g = com.mbridge.msdk.thrid.okhttp.internal.c.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t.a f33294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.connection.g f33295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f33296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f33297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f33298e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends com.mbridge.msdk.thrid.okio.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f33299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f33300c;

        a(s sVar) {
            super(sVar);
            this.f33299b = false;
            this.f33300c = 0L;
        }

        private void a(IOException iOException) {
            if (this.f33299b) {
                return;
            }
            this.f33299b = true;
            f fVar = f.this;
            fVar.f33295b.a(false, fVar, this.f33300c, iOException);
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            try {
                long jB = d().b(cVar, j10);
                if (jB <= 0) {
                    return jB;
                }
                this.f33300c += jB;
                return jB;
            } catch (IOException e10) {
                a(e10);
                throw e10;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.h, com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            a(null);
        }
    }

    public f(v vVar, t.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, g gVar2) {
        this.f33294a = aVar;
        this.f33295b = gVar;
        this.f33296c = gVar2;
        List<w> listU = vVar.u();
        w wVar = w.H2_PRIOR_KNOWLEDGE;
        this.f33298e = listU.contains(wVar) ? wVar : w.HTTP_2;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public r a(y yVar, long j10) {
        return this.f33297d.d();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void b() {
        this.f33296c.flush();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void cancel() {
        i iVar = this.f33297d;
        if (iVar != null) {
            iVar.c(b.CANCEL);
        }
    }

    public static List<c> b(y yVar) {
        com.mbridge.msdk.thrid.okhttp.r rVarC = yVar.c();
        ArrayList arrayList = new ArrayList(rVarC.b() + 4);
        arrayList.add(new c(c.f33261f, yVar.e()));
        arrayList.add(new c(c.f33262g, com.mbridge.msdk.thrid.okhttp.internal.http.i.a(yVar.g())));
        String strA = yVar.a("Host");
        if (strA != null) {
            arrayList.add(new c(c.f33264i, strA));
        }
        arrayList.add(new c(c.f33263h, yVar.g().m()));
        int iB = rVarC.b();
        for (int i10 = 0; i10 < iB; i10++) {
            com.mbridge.msdk.thrid.okio.f fVarC = com.mbridge.msdk.thrid.okio.f.c(rVarC.a(i10).toLowerCase(Locale.US));
            if (!f33292f.contains(fVarC.m())) {
                arrayList.add(new c(fVarC, rVarC.b(i10)));
            }
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a(y yVar) {
        if (this.f33297d != null) {
            return;
        }
        i iVarA = this.f33296c.a(b(yVar), yVar.a() != null);
        this.f33297d = iVarA;
        com.mbridge.msdk.thrid.okio.t tVarH = iVarA.h();
        long jB = this.f33294a.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVarH.a(jB, timeUnit);
        this.f33297d.l().a(this.f33294a.c(), timeUnit);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a() {
        this.f33297d.d().close();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public a0.a a(boolean z10) throws ProtocolException {
        a0.a aVarA = a(this.f33297d.j(), this.f33298e);
        if (z10 && com.mbridge.msdk.thrid.okhttp.internal.a.f33105a.a(aVarA) == 100) {
            return null;
        }
        return aVarA;
    }

    public static a0.a a(com.mbridge.msdk.thrid.okhttp.r rVar, w wVar) throws ProtocolException {
        com.mbridge.msdk.thrid.okhttp.r.a aVar = new com.mbridge.msdk.thrid.okhttp.r.a();
        int iB = rVar.b();
        com.mbridge.msdk.thrid.okhttp.internal.http.k kVarA = null;
        for (int i10 = 0; i10 < iB; i10++) {
            String strA = rVar.a(i10);
            String strB = rVar.b(i10);
            if (strA.equals(":status")) {
                kVarA = com.mbridge.msdk.thrid.okhttp.internal.http.k.a("HTTP/1.1 " + strB);
            } else if (!f33293g.contains(strA)) {
                com.mbridge.msdk.thrid.okhttp.internal.a.f33105a.a(aVar, strA, strB);
            }
        }
        if (kVarA != null) {
            return new a0.a().a(wVar).a(kVarA.f33219b).a(kVarA.f33220c).a(aVar.a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public b0 a(a0 a0Var) {
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f33295b;
        gVar.f33180f.responseBodyStart(gVar.f33179e);
        return new com.mbridge.msdk.thrid.okhttp.internal.http.h(a0Var.b("Content-Type"), com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0Var), com.mbridge.msdk.thrid.okio.l.a(new a(this.f33297d.e())));
    }
}
