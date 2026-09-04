package org.apache.http.impl.client;

import java.security.Principal;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class u implements fo.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f49323a = new u();

    private static Principal b(eo.g gVar) {
        eo.j jVarB;
        eo.b bVarA = gVar.a();
        if (bVarA == null || !bVarA.d() || !bVarA.g() || (jVarB = gVar.b()) == null) {
            return null;
        }
        return jVarB.d();
    }

    @Override // fo.n
    public Object a(gp.f fVar) {
        Principal principalB;
        SSLSession sSLSessionQ0;
        ko.a aVarH = ko.a.h(fVar);
        eo.g gVarT = aVarH.t();
        if (gVarT != null) {
            principalB = b(gVarT);
            if (principalB == null) {
                principalB = b(aVarH.q());
            }
        } else {
            principalB = null;
        }
        if (principalB == null) {
            co.i iVarD = aVarH.d();
            if (iVarD.isOpen() && (iVarD instanceof oo.q) && (sSLSessionQ0 = ((oo.q) iVarD).Q0()) != null) {
                return sSLSessionQ0.getLocalPrincipal();
            }
        }
        return principalB;
    }
}
