package ko;

import co.q;
import co.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class l implements s {
    public l() {
        zn.h.k(getClass());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(co.g r4, uo.g r5, uo.f r6, fo.f r7) {
        /*
            r3 = this;
        L0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L29
            co.d r0 = r4.k()
            r1 = 0
            java.util.List r0 = r5.b(r0, r6)     // Catch: org.apache.http.cookie.MalformedCookieException -> L28
            java.util.Iterator r0 = r0.iterator()     // Catch: org.apache.http.cookie.MalformedCookieException -> L28
            boolean r2 = r0.hasNext()     // Catch: org.apache.http.cookie.MalformedCookieException -> L28
            if (r2 != 0) goto L1a
            goto L0
        L1a:
            java.lang.Object r4 = r0.next()     // Catch: org.apache.http.cookie.MalformedCookieException -> L28
            uo.c r4 = (uo.c) r4     // Catch: org.apache.http.cookie.MalformedCookieException -> L28
            r5.a(r4, r6)     // Catch: org.apache.http.cookie.MalformedCookieException -> L27
            r7.a(r4)     // Catch: org.apache.http.cookie.MalformedCookieException -> L27
            throw r1
        L27:
            throw r1
        L28:
            throw r1
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ko.l.a(co.g, uo.g, uo.f, fo.f):void");
    }

    @Override // co.s
    public void b(q qVar, gp.f fVar) {
        ip.a.h(qVar, "HTTP request");
        ip.a.h(fVar, "HTTP context");
        a aVarH = a.h(fVar);
        uo.g gVarK = aVarH.k();
        gVarK.getClass();
        fo.f fVarM = aVarH.m();
        fVarM.getClass();
        uo.f fVarJ = aVarH.j();
        fVarJ.getClass();
        a(qVar.headerIterator("Set-Cookie"), gVarK, fVarJ, fVarM);
        if (gVarK.getVersion() > 0) {
            a(qVar.headerIterator("Set-Cookie2"), gVarK, fVarJ, fVarM);
        }
    }
}
