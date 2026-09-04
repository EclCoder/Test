package org.apache.http.message;

import co.x;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class h extends a implements co.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x f49398c;

    public h(String str, String str2, co.v vVar) {
        this(new n(str, str2, vVar));
    }

    @Override // co.n
    public co.v getProtocolVersion() {
        return getRequestLine().getProtocolVersion();
    }

    @Override // co.o
    public x getRequestLine() {
        if (this.f49398c == null) {
            this.f49398c = new n(this.f49396a, this.f49397b, co.t.f10164f);
        }
        return this.f49398c;
    }

    public String toString() {
        return this.f49396a + ' ' + this.f49397b + ' ' + this.headergroup;
    }

    public h(x xVar) {
        this.f49398c = (x) ip.a.h(xVar, "Request line");
        this.f49396a = xVar.getMethod();
        this.f49397b = xVar.getUri();
    }
}
