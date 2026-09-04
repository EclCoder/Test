package xo;

import java.net.InetAddress;
import org.apache.http.HttpException;
import org.apache.http.ProtocolException;
import org.apache.http.conn.UnsupportedSchemeException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class k implements qo.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oo.r f57020a;

    public k(oo.r rVar) {
        this.f57020a = rVar == null ? l.f57021a : rVar;
    }

    @Override // qo.d
    public qo.b a(co.l lVar, co.o oVar, gp.f fVar) throws HttpException {
        ip.a.h(oVar, "Request");
        if (lVar == null) {
            throw new ProtocolException("Target host is not specified");
        }
        go.a aVarS = ko.a.h(fVar).s();
        InetAddress inetAddressJ = aVarS.j();
        co.l lVarL = aVarS.l();
        if (lVarL == null) {
            lVarL = b(lVar, oVar, fVar);
        }
        if (lVar.j() <= 0) {
            try {
                lVar = new co.l(lVar.i(), this.f57020a.a(lVar), lVar.k());
            } catch (UnsupportedSchemeException e10) {
                throw new HttpException(e10.getMessage());
            }
        }
        boolean zEqualsIgnoreCase = lVar.k().equalsIgnoreCase("https");
        return lVarL == null ? new qo.b(lVar, inetAddressJ, zEqualsIgnoreCase) : new qo.b(lVar, inetAddressJ, lVarL, zEqualsIgnoreCase);
    }

    protected co.l b(co.l lVar, co.o oVar, gp.f fVar) {
        return null;
    }
}
