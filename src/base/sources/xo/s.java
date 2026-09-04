package xo;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.http.HttpException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class s extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProxySelector f57043b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57044a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            f57044a = iArr;
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57044a[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57044a[Proxy.Type.SOCKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public s(oo.r rVar, ProxySelector proxySelector) {
        super(rVar);
        this.f57043b = proxySelector;
    }

    private Proxy c(List list) {
        Proxy proxy = null;
        for (int i10 = 0; proxy == null && i10 < list.size(); i10++) {
            Proxy proxy2 = (Proxy) list.get(i10);
            int i11 = a.f57044a[proxy2.type().ordinal()];
            if (i11 == 1 || i11 == 2) {
                proxy = proxy2;
            }
        }
        return proxy == null ? Proxy.NO_PROXY : proxy;
    }

    private String d(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.isUnresolved() ? inetSocketAddress.getHostName() : inetSocketAddress.getAddress().getHostAddress();
    }

    @Override // xo.k
    protected co.l b(co.l lVar, co.o oVar, gp.f fVar) throws HttpException {
        try {
            URI uri = new URI(lVar.m());
            ProxySelector proxySelector = this.f57043b;
            if (proxySelector == null) {
                proxySelector = ProxySelector.getDefault();
            }
            if (proxySelector == null) {
                return null;
            }
            Proxy proxyC = c(proxySelector.select(uri));
            if (proxyC.type() != Proxy.Type.HTTP) {
                return null;
            }
            if (proxyC.address() instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyC.address();
                return new co.l(d(inetSocketAddress), inetSocketAddress.getPort());
            }
            throw new HttpException("Unable to handle non-Inet proxy address: " + proxyC.address());
        } catch (URISyntaxException e10) {
            throw new HttpException("Cannot convert host to URI: " + lVar, e10);
        }
    }

    public s(ProxySelector proxySelector) {
        this(null, proxySelector);
    }
}
