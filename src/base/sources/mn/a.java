package mn;

import com.mbridge.msdk.foundation.download.Command;
import gl.r;
import gn.a0;
import gn.d0;
import gn.e0;
import gn.f0;
import gn.n;
import gn.z;
import hn.p;
import java.util.List;
import kotlin.jvm.internal.s;
import re.xQrM.UoyZyZEcGYBpIg;
import xn.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements z {
    private final String a(List list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                r.u();
            }
            n nVar = (n) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(nVar.e());
            sb2.append('=');
            sb2.append(nVar.g());
            i10 = i11;
        }
        return sb2.toString();
    }

    @Override // gn.z
    public f0 intercept(z.a chain) {
        s.h(chain, "chain");
        d0 d0VarE = chain.e();
        d0.a aVarJ = d0VarE.j();
        e0 e0VarA = d0VarE.a();
        if (e0VarA != null) {
            a0 a0VarContentType = e0VarA.contentType();
            if (a0VarContentType != null) {
                aVarJ.n("Content-Type", a0VarContentType.toString());
            }
            long jContentLength = e0VarA.contentLength();
            if (jContentLength != -1) {
                aVarJ.n("Content-Length", String.valueOf(jContentLength));
                aVarJ.r("Transfer-Encoding");
            } else {
                aVarJ.n("Transfer-Encoding", "chunked");
                aVarJ.r("Content-Length");
            }
        }
        boolean z10 = false;
        if (d0VarE.e("Host") == null) {
            aVarJ.n("Host", p.u(d0VarE.m(), false, 1, null));
        }
        if (d0VarE.e("Connection") == null) {
            aVarJ.n("Connection", "Keep-Alive");
        }
        if (d0VarE.e("Accept-Encoding") == null && d0VarE.e(Command.HTTP_HEADER_RANGE) == null) {
            aVarJ.n("Accept-Encoding", "gzip");
            z10 = true;
        }
        List listB = chain.b().b(d0VarE.m());
        if (!listB.isEmpty()) {
            aVarJ.n("Cookie", a(listB));
        }
        if (d0VarE.e(Command.HTTP_HEADER_USER_AGENT) == null) {
            aVarJ.n(Command.HTTP_HEADER_USER_AGENT, UoyZyZEcGYBpIg.OPfWbXAhlyhL);
        }
        d0 d0VarB = aVarJ.b();
        f0 f0VarC = chain.c(d0VarB);
        e.f(chain.b(), d0VarB.m(), f0VarC.d0());
        f0.a aVarQ = f0VarC.F0().q(d0VarB);
        if (z10 && bm.r.A("gzip", f0.c0(f0VarC, "Content-Encoding", null, 2, null), true) && e.b(f0VarC)) {
            xn.r rVar = new xn.r(f0VarC.d().source());
            aVarQ.j(f0VarC.d0().f().g("Content-Encoding").g("Content-Length").d());
            aVarQ.b(new h(f0.c0(f0VarC, "Content-Type", null, 2, null), -1L, c0.c(rVar)));
        }
        return aVarQ.c();
    }
}
