package xo;

import java.net.InetAddress;
import org.apache.http.HttpException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class h implements qo.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ro.i f57018a;

    public h(ro.i iVar) {
        ip.a.h(iVar, "Scheme registry");
        this.f57018a = iVar;
    }

    @Override // qo.d
    public qo.b a(co.l lVar, co.o oVar, gp.f fVar) throws HttpException {
        ip.a.h(oVar, "HTTP request");
        qo.b bVarB = po.d.b(oVar.getParams());
        if (bVarB != null) {
            return bVarB;
        }
        ip.b.c(lVar, "Target host");
        InetAddress inetAddressC = po.d.c(oVar.getParams());
        co.l lVarA = po.d.a(oVar.getParams());
        try {
            boolean zC = this.f57018a.c(lVar.k()).c();
            return lVarA == null ? new qo.b(lVar, inetAddressC, zC) : new qo.b(lVar, inetAddressC, lVarA, zC);
        } catch (IllegalStateException e10) {
            throw new HttpException(e10.getMessage());
        }
    }
}
