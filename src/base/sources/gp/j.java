package gp;

import co.q;
import co.t;
import co.v;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.api.client.http.HttpMethods;
import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39842a;

    public j(int i10) {
        this.f39842a = ip.a.i(i10, "Wait for continue time");
    }

    private static void b(co.h hVar) {
        try {
            hVar.close();
        } catch (IOException unused) {
        }
    }

    protected boolean a(co.o oVar, q qVar) {
        int statusCode;
        return (HttpMethods.HEAD.equalsIgnoreCase(oVar.getRequestLine().getMethod()) || (statusCode = qVar.b().getStatusCode()) < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }

    protected q c(co.o oVar, co.h hVar, f fVar) throws ProtocolException {
        ip.a.h(oVar, "HTTP request");
        ip.a.h(hVar, "Client connection");
        ip.a.h(fVar, "HTTP context");
        q qVarL0 = null;
        int statusCode = 0;
        while (true) {
            if (qVarL0 != null && statusCode >= 200) {
                return qVarL0;
            }
            qVarL0 = hVar.L0();
            statusCode = qVarL0.b().getStatusCode();
            if (statusCode < 100) {
                throw new ProtocolException("Invalid response: " + qVarL0.b());
            }
            if (a(oVar, qVarL0)) {
                hVar.I0(qVarL0);
            }
        }
    }

    protected q d(co.o oVar, co.h hVar, f fVar) throws ProtocolException {
        ip.a.h(oVar, "HTTP request");
        ip.a.h(hVar, "Client connection");
        ip.a.h(fVar, "HTTP context");
        fVar.a("http.connection", hVar);
        fVar.a("http.request_sent", Boolean.FALSE);
        hVar.n(oVar);
        q qVar = null;
        if (oVar instanceof co.k) {
            v protocolVersion = oVar.getRequestLine().getProtocolVersion();
            co.k kVar = (co.k) oVar;
            boolean z10 = true;
            if (kVar.expectContinue() && !protocolVersion.l(t.f10163e)) {
                hVar.flush();
                if (hVar.o(this.f39842a)) {
                    q qVarL0 = hVar.L0();
                    if (a(oVar, qVarL0)) {
                        hVar.I0(qVarL0);
                    }
                    int statusCode = qVarL0.b().getStatusCode();
                    if (statusCode >= 200) {
                        z10 = false;
                        qVar = qVarL0;
                    } else if (statusCode != 100) {
                        throw new ProtocolException("Unexpected response: " + qVarL0.b());
                    }
                }
            }
            if (z10) {
                hVar.P0(kVar);
            }
        }
        hVar.flush();
        fVar.a("http.request_sent", Boolean.TRUE);
        return qVar;
    }

    public q e(co.o oVar, co.h hVar, f fVar) throws HttpException, IOException {
        ip.a.h(oVar, "HTTP request");
        ip.a.h(hVar, "Client connection");
        ip.a.h(fVar, "HTTP context");
        try {
            q qVarD = d(oVar, hVar, fVar);
            return qVarD == null ? c(oVar, hVar, fVar) : qVarD;
        } catch (IOException e10) {
            b(hVar);
            throw e10;
        } catch (RuntimeException e11) {
            b(hVar);
            throw e11;
        } catch (HttpException e12) {
            b(hVar);
            throw e12;
        }
    }

    public void f(q qVar, h hVar, f fVar) {
        ip.a.h(qVar, "HTTP response");
        ip.a.h(hVar, "HTTP processor");
        ip.a.h(fVar, "HTTP context");
        fVar.a("http.response", qVar);
        hVar.b(qVar, fVar);
    }

    public void g(co.o oVar, h hVar, f fVar) {
        ip.a.h(oVar, "HTTP request");
        ip.a.h(hVar, "HTTP processor");
        ip.a.h(fVar, "HTTP context");
        fVar.a("http.request", oVar);
        hVar.c(oVar, fVar);
    }

    public j() {
        this(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
    }
}
