package gp;

import co.p;
import com.mbridge.msdk.foundation.download.Command;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39847a;

    public o(String str) {
        this.f39847a = str;
    }

    @Override // co.p
    public void c(co.o oVar, f fVar) {
        ip.a.h(oVar, "HTTP request");
        if (oVar.containsHeader(Command.HTTP_HEADER_USER_AGENT)) {
            return;
        }
        ep.d params = oVar.getParams();
        String str = params != null ? (String) params.getParameter("http.useragent") : null;
        if (str == null) {
            str = this.f39847a;
        }
        if (str != null) {
            oVar.addHeader(Command.HTTP_HEADER_USER_AGENT, str);
        }
    }

    public o() {
        this(null);
    }
}
