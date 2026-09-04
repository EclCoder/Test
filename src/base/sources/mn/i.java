package mn;

import gn.d0;
import gn.y;
import java.net.Proxy;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f46511a = new i();

    private i() {
    }

    private final boolean b(d0 d0Var, Proxy.Type type) {
        return !d0Var.h() && type == Proxy.Type.HTTP;
    }

    public final String a(d0 request, Proxy.Type proxyType) {
        s.h(request, "request");
        s.h(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.i());
        sb2.append(' ');
        i iVar = f46511a;
        if (iVar.b(request, proxyType)) {
            sb2.append(request.m());
        } else {
            sb2.append(iVar.c(request.m()));
        }
        sb2.append(" HTTP/1.1");
        return sb2.toString();
    }

    public final String c(y url) {
        s.h(url, "url");
        String strC = url.c();
        String strE = url.e();
        if (strE == null) {
            return strC;
        }
        return strC + '?' + strE;
    }
}
