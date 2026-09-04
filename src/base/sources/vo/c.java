package vo;

import co.o;
import co.q;
import com.google.api.client.http.HttpMethods;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class c implements co.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f55687a = new c();

    private boolean b(o oVar, q qVar) {
        int statusCode;
        return ((oVar != null && oVar.getRequestLine().getMethod().equalsIgnoreCase(HttpMethods.HEAD)) || (statusCode = qVar.b().getStatusCode()) < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (java.lang.Long.parseLong(r11[0].getValue()) < 0) goto L33;
     */
    @Override // co.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(co.q r10, gp.f r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vo.c.a(co.q, gp.f):boolean");
    }
}
