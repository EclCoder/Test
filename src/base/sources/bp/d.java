package bp;

import gp.h;
import io.o;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f9235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f9236b;

    public d(a aVar, h hVar) {
        zn.h.k(getClass());
        ip.a.h(aVar, "HTTP client request executor");
        ip.a.h(hVar, "HTTP protocol processor");
        this.f9235a = aVar;
        this.f9236b = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        throw null;
     */
    @Override // bp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.c a(qo.b r6, io.o r7, ko.a r8, io.g r9) throws org.apache.http.HttpException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.d.a(qo.b, io.o, ko.a, io.g):io.c");
    }

    void b(o oVar, qo.b bVar, boolean z10) throws ProtocolException {
        URI uri = oVar.getURI();
        if (uri != null) {
            try {
                oVar.setURI(lo.d.d(uri, bVar, z10));
            } catch (URISyntaxException e10) {
                throw new ProtocolException("Invalid URI: " + uri, e10);
            }
        }
    }
}
