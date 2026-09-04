package org.apache.http.message;

import co.x;
import co.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class j implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f49406a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f49407b = new j();

    public ip.c a(ip.c cVar, co.v vVar) {
        ip.a.h(vVar, "Protocol version");
        int iE = e(vVar);
        if (cVar == null) {
            cVar = new ip.c(iE);
        } else {
            cVar.d(iE);
        }
        cVar.b(vVar.j());
        cVar.a('/');
        cVar.b(Integer.toString(vVar.g()));
        cVar.a('.');
        cVar.b(Integer.toString(vVar.i()));
        return cVar;
    }

    protected void b(ip.c cVar, co.d dVar) {
        String name = dVar.getName();
        String value = dVar.getValue();
        int length = name.length() + 2;
        if (value != null) {
            length += value.length();
        }
        cVar.d(length);
        cVar.b(name);
        cVar.b(": ");
        if (value != null) {
            cVar.d(cVar.length() + value.length());
            for (int i10 = 0; i10 < value.length(); i10++) {
                char cCharAt = value.charAt(i10);
                if (cCharAt == '\r' || cCharAt == '\n' || cCharAt == '\f' || cCharAt == 11) {
                    cCharAt = ' ';
                }
                cVar.a(cCharAt);
            }
        }
    }

    protected void c(ip.c cVar, x xVar) {
        String method = xVar.getMethod();
        String uri = xVar.getUri();
        cVar.d(method.length() + 1 + uri.length() + 1 + e(xVar.getProtocolVersion()));
        cVar.b(method);
        cVar.a(' ');
        cVar.b(uri);
        cVar.a(' ');
        a(cVar, xVar.getProtocolVersion());
    }

    protected void d(ip.c cVar, y yVar) {
        int iE = e(yVar.getProtocolVersion()) + 5;
        String strG = yVar.g();
        if (strG != null) {
            iE += strG.length();
        }
        cVar.d(iE);
        a(cVar, yVar.getProtocolVersion());
        cVar.a(' ');
        cVar.b(Integer.toString(yVar.getStatusCode()));
        cVar.a(' ');
        if (strG != null) {
            cVar.b(strG);
        }
    }

    protected int e(co.v vVar) {
        return vVar.j().length() + 4;
    }

    public ip.c f(ip.c cVar, co.d dVar) {
        ip.a.h(dVar, "Header");
        if (dVar instanceof co.c) {
            return ((co.c) dVar).u();
        }
        ip.c cVarI = i(cVar);
        b(cVarI, dVar);
        return cVarI;
    }

    public ip.c g(ip.c cVar, x xVar) {
        ip.a.h(xVar, "Request line");
        ip.c cVarI = i(cVar);
        c(cVarI, xVar);
        return cVarI;
    }

    public ip.c h(ip.c cVar, y yVar) {
        ip.a.h(yVar, "Status line");
        ip.c cVarI = i(cVar);
        d(cVarI, yVar);
        return cVarI;
    }

    protected ip.c i(ip.c cVar) {
        if (cVar == null) {
            return new ip.c(64);
        }
        cVar.clear();
        return cVar;
    }
}
