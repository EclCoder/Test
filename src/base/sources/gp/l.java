package gp;

import co.p;
import co.t;
import co.v;
import com.mbridge.msdk.MBridgeConstans;
import org.apache.http.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f39845a;

    public l() {
        this(false);
    }

    @Override // co.p
    public void c(co.o oVar, f fVar) throws ProtocolException {
        ip.a.h(oVar, "HTTP request");
        if (oVar instanceof co.k) {
            if (this.f39845a) {
                oVar.removeHeaders("Transfer-Encoding");
                oVar.removeHeaders("Content-Length");
            } else {
                if (oVar.containsHeader("Transfer-Encoding")) {
                    throw new ProtocolException("Transfer-encoding header already present");
                }
                if (oVar.containsHeader("Content-Length")) {
                    throw new ProtocolException("Content-Length header already present");
                }
            }
            v protocolVersion = oVar.getRequestLine().getProtocolVersion();
            co.j entity = ((co.k) oVar).getEntity();
            if (entity == null) {
                oVar.addHeader("Content-Length", MBridgeConstans.ENDCARD_URL_TYPE_PL);
                return;
            }
            if (!entity.isChunked() && entity.getContentLength() >= 0) {
                oVar.addHeader("Content-Length", Long.toString(entity.getContentLength()));
            } else {
                if (protocolVersion.l(t.f10163e)) {
                    throw new ProtocolException("Chunked transfer encoding not allowed for " + protocolVersion);
                }
                oVar.addHeader("Transfer-Encoding", "chunked");
            }
            if (entity.getContentType() != null && !oVar.containsHeader("Content-Type")) {
                oVar.addHeader(entity.getContentType());
            }
            if (entity.getContentEncoding() == null || oVar.containsHeader("Content-Encoding")) {
                return;
            }
            oVar.addHeader(entity.getContentEncoding());
        }
    }

    public l(boolean z10) {
        this.f39845a = z10;
    }
}
