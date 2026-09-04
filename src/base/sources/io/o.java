package io;

import co.v;
import co.x;
import java.net.URI;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class o extends org.apache.http.message.a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final co.o f41560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final co.l f41561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f41562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x f41563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v f41564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private URI f41565f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b extends o implements co.k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private co.j f41566g;

        b(co.k kVar, co.l lVar) {
            super(kVar, lVar);
            this.f41566g = kVar.getEntity();
        }

        @Override // co.k
        public boolean expectContinue() {
            co.d firstHeader = getFirstHeader("Expect");
            return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.getValue());
        }

        @Override // co.k
        public co.j getEntity() {
            return this.f41566g;
        }

        @Override // co.k
        public void setEntity(co.j jVar) {
            this.f41566g = jVar;
        }
    }

    public static o f(co.o oVar) {
        return g(oVar, null);
    }

    public static o g(co.o oVar, co.l lVar) {
        ip.a.h(oVar, "HTTP request");
        return oVar instanceof co.k ? new b((co.k) oVar, lVar) : new o(oVar, lVar);
    }

    public co.o c() {
        return this.f41560a;
    }

    public co.l e() {
        return this.f41561b;
    }

    @Override // io.q
    public String getMethod() {
        return this.f41562c;
    }

    @Override // org.apache.http.message.a, co.n
    public ep.d getParams() {
        if (this.params == null) {
            this.params = this.f41560a.getParams().g();
        }
        return this.params;
    }

    @Override // co.n
    public v getProtocolVersion() {
        v vVar = this.f41564e;
        return vVar != null ? vVar : this.f41560a.getProtocolVersion();
    }

    @Override // co.o
    public x getRequestLine() {
        if (this.f41563d == null) {
            URI uri = this.f41565f;
            String aSCIIString = uri != null ? uri.toASCIIString() : this.f41560a.getRequestLine().getUri();
            if (aSCIIString == null || aSCIIString.isEmpty()) {
                aSCIIString = "/";
            }
            this.f41563d = new org.apache.http.message.n(this.f41562c, aSCIIString, getProtocolVersion());
        }
        return this.f41563d;
    }

    @Override // io.q
    public URI getURI() {
        return this.f41565f;
    }

    @Override // io.q
    public boolean isAborted() {
        return false;
    }

    public void setURI(URI uri) {
        this.f41565f = uri;
        this.f41563d = null;
    }

    public String toString() {
        return getRequestLine() + " " + this.headergroup;
    }

    private o(co.o oVar, co.l lVar) {
        co.o oVar2 = (co.o) ip.a.h(oVar, "HTTP request");
        this.f41560a = oVar2;
        this.f41561b = lVar;
        this.f41564e = oVar2.getRequestLine().getProtocolVersion();
        this.f41562c = oVar2.getRequestLine().getMethod();
        if (oVar instanceof q) {
            this.f41565f = ((q) oVar).getURI();
        } else {
            this.f41565f = null;
        }
        setHeaders(oVar.getAllHeaders());
    }
}
