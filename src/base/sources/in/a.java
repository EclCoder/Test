package in;

import gn.b;
import gn.d0;
import gn.f0;
import gn.h0;
import gn.i;
import gn.p;
import gn.r;
import gn.y;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f41554d;

    /* JADX INFO: renamed from: in.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final /* synthetic */ class C0631a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41555a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f41555a = iArr;
        }
    }

    public a(r defaultDns) {
        s.h(defaultDns, "defaultDns");
        this.f41554d = defaultDns;
    }

    private final InetAddress b(Proxy proxy, y yVar, r rVar) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0631a.f41555a[type.ordinal()]) == 1) {
            return (InetAddress) gl.r.b0(rVar.a(yVar.g()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        s.f(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        s.g(address, "getAddress(...)");
        return address;
    }

    @Override // gn.b
    public d0 a(h0 h0Var, f0 response) {
        Proxy proxyB;
        r rVarC;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        gn.a aVarA;
        s.h(response, "response");
        List<i> listL = response.l();
        d0 d0VarU0 = response.U0();
        y yVarM = d0VarU0.m();
        boolean z10 = response.m() == 407;
        if (h0Var == null || (proxyB = h0Var.b()) == null) {
            proxyB = Proxy.NO_PROXY;
        }
        for (i iVar : listL) {
            if (bm.r.A("Basic", iVar.c(), true)) {
                if (h0Var == null || (aVarA = h0Var.a()) == null || (rVarC = aVarA.c()) == null) {
                    rVarC = this.f41554d;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxyB.address();
                    s.f(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    s.e(proxyB);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxyB, yVarM, rVarC), inetSocketAddress.getPort(), yVarM.p(), iVar.b(), iVar.c(), yVarM.r(), Authenticator.RequestorType.PROXY);
                } else {
                    String strG = yVarM.g();
                    s.e(proxyB);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strG, b(proxyB, yVarM, rVarC), yVarM.l(), yVarM.p(), iVar.b(), iVar.c(), yVarM.r(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    s.g(userName, "getUserName(...)");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    s.g(password, "getPassword(...)");
                    return d0VarU0.j().n(str, p.a(userName, new String(password), iVar.a())).b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ a(r rVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? r.f39760b : rVar);
    }
}
