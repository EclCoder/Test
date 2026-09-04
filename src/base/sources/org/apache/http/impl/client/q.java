package org.apache.http.impl.client;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpStatusCodes;
import java.net.URI;
import java.util.Arrays;
import org.apache.http.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class q implements fo.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f49297b = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f49298a;

    public q() {
        this(new String[]{HttpMethods.GET, HttpMethods.HEAD});
    }

    @Override // fo.k
    public boolean a(co.o oVar, co.q qVar, gp.f fVar) {
        ip.a.h(oVar, "HTTP request");
        ip.a.h(qVar, "HTTP response");
        int statusCode = qVar.b().getStatusCode();
        String method = oVar.getRequestLine().getMethod();
        co.d firstHeader = qVar.getFirstHeader("location");
        if (statusCode != 307 && statusCode != 308) {
            switch (statusCode) {
                case 301:
                    break;
                case 302:
                    return d(method) && firstHeader != null;
                case HttpStatusCodes.STATUS_CODE_SEE_OTHER /* 303 */:
                    return true;
                default:
                    return false;
            }
        }
        return d(method);
    }

    @Override // fo.k
    public io.q b(co.o oVar, co.q qVar, gp.f fVar) throws ProtocolException {
        URI uriC = c(oVar, qVar, fVar);
        String method = oVar.getRequestLine().getMethod();
        if (method.equalsIgnoreCase(HttpMethods.HEAD)) {
            return new io.i(uriC);
        }
        if (method.equalsIgnoreCase(HttpMethods.GET)) {
            return new io.h(uriC);
        }
        int statusCode = qVar.b().getStatusCode();
        return (statusCode == 307 || statusCode == 308) ? io.r.b(oVar).d(uriC).a() : new io.h(uriC);
    }

    public URI c(co.o oVar, co.q qVar, gp.f fVar) throws ProtocolException {
        ip.a.h(oVar, "HTTP request");
        ip.a.h(qVar, "HTTP response");
        ip.a.h(fVar, "HTTP context");
        ko.a.h(fVar);
        co.d firstHeader = qVar.getFirstHeader("location");
        if (firstHeader != null) {
            firstHeader.getValue();
            throw null;
        }
        throw new ProtocolException("Received redirect response " + qVar.b() + " but no location header");
    }

    protected boolean d(String str) {
        return Arrays.binarySearch(this.f49298a, str) >= 0;
    }

    public q(String[] strArr) {
        zn.h.k(getClass());
        String[] strArr2 = (String[]) strArr.clone();
        Arrays.sort(strArr2);
        this.f49298a = strArr2;
    }
}
