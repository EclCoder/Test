package io;

import co.v;
import co.x;
import java.net.URI;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class n extends b implements q, d {
    private go.a config;
    private URI uri;
    private v version;

    @Override // io.d
    public go.a getConfig() {
        return this.config;
    }

    public abstract String getMethod();

    @Override // co.n
    public v getProtocolVersion() {
        v vVar = this.version;
        return vVar != null ? vVar : ep.f.a(getParams());
    }

    @Override // co.o
    public x getRequestLine() {
        String method = getMethod();
        v protocolVersion = getProtocolVersion();
        URI uri = getURI();
        String aSCIIString = uri != null ? uri.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.isEmpty()) {
            aSCIIString = "/";
        }
        return new org.apache.http.message.n(method, aSCIIString, protocolVersion);
    }

    @Override // io.q
    public URI getURI() {
        return this.uri;
    }

    public void releaseConnection() {
        reset();
    }

    public void setConfig(go.a aVar) {
        this.config = aVar;
    }

    public void setProtocolVersion(v vVar) {
        this.version = vVar;
    }

    public void setURI(URI uri) {
        this.uri = uri;
    }

    public String toString() {
        return getMethod() + " " + getURI() + " " + getProtocolVersion();
    }

    public void started() {
    }
}
