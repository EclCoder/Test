package gp;

import co.p;
import co.t;
import co.v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f39846a;

    public m() {
        this(false);
    }

    @Override // co.p
    public void c(co.o oVar, f fVar) {
        ip.a.h(oVar, "HTTP request");
        if (oVar.containsHeader("Expect") || !(oVar instanceof co.k)) {
            return;
        }
        v protocolVersion = oVar.getRequestLine().getProtocolVersion();
        co.j entity = ((co.k) oVar).getEntity();
        if (entity == null || entity.getContentLength() == 0 || protocolVersion.l(t.f10163e) || !oVar.getParams().k("http.protocol.expect-continue", this.f39846a)) {
            return;
        }
        oVar.addHeader("Expect", "100-continue");
    }

    public m(boolean z10) {
        this.f39846a = z10;
    }
}
