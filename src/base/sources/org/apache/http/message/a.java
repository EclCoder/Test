package org.apache.http.message;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements co.n {
    protected q headergroup;

    @Deprecated
    protected ep.d params;

    protected a(ep.d dVar) {
        this.headergroup = new q();
        this.params = dVar;
    }

    @Override // co.n
    public void addHeader(co.d dVar) {
        this.headergroup.b(dVar);
    }

    @Override // co.n
    public boolean containsHeader(String str) {
        return this.headergroup.h(str);
    }

    @Override // co.n
    public co.d[] getAllHeaders() {
        return this.headergroup.i();
    }

    @Override // co.n
    public co.d getFirstHeader(String str) {
        return this.headergroup.j(str);
    }

    @Override // co.n
    public co.d[] getHeaders(String str) {
        return this.headergroup.k(str);
    }

    @Override // co.n
    public co.d getLastHeader(String str) {
        return this.headergroup.l(str);
    }

    @Override // co.n
    @Deprecated
    public ep.d getParams() {
        if (this.params == null) {
            this.params = new ep.b();
        }
        return this.params;
    }

    @Override // co.n
    public co.g headerIterator() {
        return this.headergroup.m();
    }

    public void removeHeader(co.d dVar) {
        this.headergroup.o(dVar);
    }

    @Override // co.n
    public void removeHeaders(String str) {
        if (str == null) {
            return;
        }
        co.g gVarM = this.headergroup.m();
        while (gVarM.hasNext()) {
            if (str.equalsIgnoreCase(gVarM.k().getName())) {
                gVarM.remove();
            }
        }
    }

    public void setHeader(co.d dVar) {
        this.headergroup.q(dVar);
    }

    @Override // co.n
    public void setHeaders(co.d[] dVarArr) {
        this.headergroup.p(dVarArr);
    }

    @Override // co.n
    @Deprecated
    public void setParams(ep.d dVar) {
        this.params = (ep.d) ip.a.h(dVar, "HTTP parameters");
    }

    @Override // co.n
    public void addHeader(String str, String str2) {
        ip.a.h(str, "Header name");
        this.headergroup.b(new b(str, str2));
    }

    @Override // co.n
    public co.g headerIterator(String str) {
        return this.headergroup.n(str);
    }

    @Override // co.n
    public void setHeader(String str, String str2) {
        ip.a.h(str, "Header name");
        this.headergroup.q(new b(str, str2));
    }

    protected a() {
        this(null);
    }
}
