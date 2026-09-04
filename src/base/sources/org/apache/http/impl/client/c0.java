package org.apache.http.impl.client;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class c0 extends org.apache.http.message.a implements io.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final co.o f49269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private URI f49270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f49271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private co.v f49272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49273e;

    public c0(co.o oVar) throws ProtocolException {
        ip.a.h(oVar, "HTTP request");
        this.f49269a = oVar;
        setParams(oVar.getParams());
        setHeaders(oVar.getAllHeaders());
        if (oVar instanceof io.q) {
            io.q qVar = (io.q) oVar;
            this.f49270b = qVar.getURI();
            this.f49271c = qVar.getMethod();
            this.f49272d = null;
        } else {
            co.x requestLine = oVar.getRequestLine();
            try {
                this.f49270b = new URI(requestLine.getUri());
                this.f49271c = requestLine.getMethod();
                this.f49272d = oVar.getProtocolVersion();
            } catch (URISyntaxException e10) {
                throw new ProtocolException("Invalid request URI: " + requestLine.getUri(), e10);
            }
        }
        this.f49273e = 0;
    }

    public co.o c() {
        return this.f49269a;
    }

    public void e() {
        this.f49273e++;
    }

    public boolean f() {
        return true;
    }

    public void g() {
        this.headergroup.g();
        setHeaders(this.f49269a.getAllHeaders());
    }

    @Override // io.q
    public String getMethod() {
        return this.f49271c;
    }

    @Override // co.n
    public co.v getProtocolVersion() {
        if (this.f49272d == null) {
            this.f49272d = ep.f.a(getParams());
        }
        return this.f49272d;
    }

    @Override // co.o
    public co.x getRequestLine() {
        co.v protocolVersion = getProtocolVersion();
        URI uri = this.f49270b;
        String aSCIIString = uri != null ? uri.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.isEmpty()) {
            aSCIIString = "/";
        }
        return new org.apache.http.message.n(getMethod(), aSCIIString, protocolVersion);
    }

    @Override // io.q
    public URI getURI() {
        return this.f49270b;
    }

    @Override // io.q
    public boolean isAborted() {
        return false;
    }

    public void setURI(URI uri) {
        this.f49270b = uri;
    }
}
