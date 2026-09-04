package org.apache.http.impl.client;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpStatusCodes;
import java.net.URI;
import org.apache.http.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class p implements fo.j {
    public p() {
        zn.h.k(getClass());
    }

    @Override // fo.j
    public boolean a(co.q qVar, gp.f fVar) {
        ip.a.h(qVar, "HTTP response");
        int statusCode = qVar.b().getStatusCode();
        if (statusCode != 307) {
            switch (statusCode) {
                case 301:
                case 302:
                    break;
                case HttpStatusCodes.STATUS_CODE_SEE_OTHER /* 303 */:
                    return true;
                default:
                    return false;
            }
        }
        String method = ((co.o) fVar.getAttribute("http.request")).getRequestLine().getMethod();
        return method.equalsIgnoreCase(HttpMethods.GET) || method.equalsIgnoreCase(HttpMethods.HEAD);
    }

    @Override // fo.j
    public URI b(co.q qVar, gp.f fVar) throws ProtocolException {
        ip.a.h(qVar, "HTTP response");
        co.d firstHeader = qVar.getFirstHeader("location");
        if (firstHeader != null) {
            firstHeader.getValue();
            throw null;
        }
        throw new ProtocolException("Received redirect response " + qVar.b() + " but no location header");
    }
}
