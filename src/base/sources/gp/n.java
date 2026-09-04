package gp;

import co.p;
import co.t;
import co.v;
import com.google.api.client.http.HttpMethods;
import java.net.InetAddress;
import org.apache.http.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class n implements p {
    @Override // co.p
    public void c(co.o oVar, f fVar) throws ProtocolException {
        ip.a.h(oVar, "HTTP request");
        g gVarB = g.b(fVar);
        v protocolVersion = oVar.getRequestLine().getProtocolVersion();
        if ((oVar.getRequestLine().getMethod().equalsIgnoreCase(HttpMethods.CONNECT) && protocolVersion.l(t.f10163e)) || oVar.containsHeader("Host")) {
            return;
        }
        co.l lVarF = gVarB.f();
        if (lVarF == null) {
            co.i iVarD = gVarB.d();
            if (iVarD instanceof co.m) {
                co.m mVar = (co.m) iVarD;
                InetAddress inetAddressO0 = mVar.O0();
                int iG0 = mVar.G0();
                if (inetAddressO0 != null) {
                    lVarF = new co.l(inetAddressO0.getHostName(), iG0);
                }
            }
            if (lVarF == null) {
                if (!protocolVersion.l(t.f10163e)) {
                    throw new ProtocolException("Target host missing");
                }
                return;
            }
        }
        oVar.addHeader("Host", lVarF.l());
    }
}
