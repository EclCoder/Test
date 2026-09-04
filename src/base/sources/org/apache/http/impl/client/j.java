package org.apache.http.impl.client;

import zo.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class j {
    public static no.b a(to.f fVar) {
        return b(fVar).a();
    }

    public static no.d b(to.f fVar) {
        zo.r rVar = new zo.r(fVar);
        k0 k0Var = new k0(k0.a.RELAXED, fVar);
        return no.d.b().c("default", rVar).c("best-match", rVar).c("compatibility", rVar).c("standard", k0Var).c("standard-strict", new k0(k0.a.STRICT, fVar)).c("netscape", new zo.y()).c("ignoreCookies", new zo.t());
    }
}
