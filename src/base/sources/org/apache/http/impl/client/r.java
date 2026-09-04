package org.apache.http.impl.client;

import com.google.api.client.http.HttpMethods;
import java.net.URI;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
class r implements fo.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fo.j f49299a;

    public r(fo.j jVar) {
        this.f49299a = jVar;
    }

    @Override // fo.k
    public boolean a(co.o oVar, co.q qVar, gp.f fVar) {
        return this.f49299a.a(qVar, fVar);
    }

    @Override // fo.k
    public io.q b(co.o oVar, co.q qVar, gp.f fVar) {
        URI uriB = this.f49299a.b(qVar, fVar);
        return oVar.getRequestLine().getMethod().equalsIgnoreCase(HttpMethods.HEAD) ? new io.i(uriB) : new io.h(uriB);
    }

    public fo.j c() {
        return this.f49299a;
    }
}
