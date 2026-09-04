package bp;

import fo.i;
import io.o;
import java.io.IOException;
import org.apache.http.NoHttpResponseException;
import zn.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f9242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f9243b;

    public g(a aVar, i iVar) {
        h.k(getClass());
        ip.a.h(aVar, "HTTP request executor");
        ip.a.h(iVar, "HTTP request retry handler");
        this.f9242a = aVar;
        this.f9243b = iVar;
    }

    @Override // bp.a
    public io.c a(qo.b bVar, o oVar, ko.a aVar, io.g gVar) throws IOException {
        ip.a.h(bVar, "HTTP route");
        ip.a.h(oVar, "HTTP request");
        ip.a.h(aVar, "HTTP context");
        oVar.getAllHeaders();
        try {
            return this.f9242a.a(bVar, oVar, aVar, gVar);
        } catch (IOException e10) {
            if ((gVar != null && gVar.isAborted()) || this.f9243b.a(e10, 1, aVar)) {
                throw null;
            }
            if (!(e10 instanceof NoHttpResponseException)) {
                throw e10;
            }
            NoHttpResponseException noHttpResponseException = new NoHttpResponseException(bVar.g().l() + " failed to respond");
            noHttpResponseException.setStackTrace(e10.getStackTrace());
            throw noHttpResponseException;
        }
    }
}
