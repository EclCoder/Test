package xo;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.http.HttpException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class p implements qo.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ro.i f57039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ProxySelector f57040b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57041a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            f57041a = iArr;
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57041a[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57041a[Proxy.Type.SOCKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public p(ro.i iVar, ProxySelector proxySelector) {
        ip.a.h(iVar, "SchemeRegistry");
        this.f57039a = iVar;
        this.f57040b = proxySelector;
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
        co.l lVarC = c(lVar, oVar, fVar);
        boolean zC = this.f57039a.c(lVar.k()).c();
        return lVarC == null ? new qo.b(lVar, inetAddressC, zC) : new qo.b(lVar, inetAddressC, lVarC, zC);
    }

    protected Proxy b(List list, co.l lVar, co.o oVar, gp.f fVar) {
        ip.a.f(list, "List of proxies");
        Proxy proxy = null;
        for (int i10 = 0; proxy == null && i10 < list.size(); i10++) {
            Proxy proxy2 = (Proxy) list.get(i10);
            int i11 = a.f57041a[proxy2.type().ordinal()];
            if (i11 == 1 || i11 == 2) {
                proxy = proxy2;
            }
        }
        return proxy == null ? Proxy.NO_PROXY : proxy;
    }

    protected co.l c(co.l lVar, co.o oVar, gp.f fVar) throws HttpException {
        ProxySelector proxySelector = this.f57040b;
        if (proxySelector == null) {
            proxySelector = ProxySelector.getDefault();
        }
        if (proxySelector == null) {
            return null;
        }
        try {
            Proxy proxyB = b(proxySelector.select(new URI(lVar.m())), lVar, oVar, fVar);
            if (proxyB.type() != Proxy.Type.HTTP) {
                return null;
            }
            if (proxyB.address() instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyB.address();
                return new co.l(d(inetSocketAddress), inetSocketAddress.getPort());
            }
            throw new HttpException("Unable to handle non-Inet proxy address: " + proxyB.address());
        } catch (URISyntaxException e10) {
            throw new HttpException("Cannot convert host to URI: " + lVar, e10);
        }
    }

    protected String d(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.isUnresolved() ? inetSocketAddress.getHostName() : inetSocketAddress.getAddress().getHostAddress();
    }
}
