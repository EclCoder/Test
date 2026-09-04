package mn;

import bm.o;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpStatusCodes;
import gl.r;
import gn.d0;
import gn.e0;
import gn.f0;
import gn.h0;
import gn.y;
import gn.z;
import hn.p;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import ln.m;
import ln.n;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class j implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46512a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final d0 a(f0 f0Var, String str, z.a aVar) {
        String strC0;
        y yVarO;
        if (!aVar.a() || (strC0 = f0.c0(f0Var, "Location", null, 2, null)) == null || (yVarO = f0Var.U0().m().o(strC0)) == null) {
            return null;
        }
        if (!s.c(yVarO.p(), f0Var.U0().m().p()) && !aVar.j()) {
            return null;
        }
        d0.a aVarJ = f0Var.U0().j();
        if (f.c(str)) {
            int iM = f0Var.m();
            f fVar = f.f46483a;
            boolean z10 = fVar.e(str) || iM == 308 || iM == 307;
            if (!fVar.d(str) || iM == 308 || iM == 307) {
                aVarJ.p(str, z10 ? f0Var.U0().a() : null);
            } else {
                aVarJ.p(HttpMethods.GET, null);
            }
            if (!z10) {
                aVarJ.r("Transfer-Encoding");
                aVarJ.r("Content-Length");
                aVarJ.r("Content-Type");
            }
        }
        if (!p.f(f0Var.U0().m(), yVarO)) {
            aVarJ.r("Authorization");
        }
        return aVarJ.u(yVarO).b();
    }

    private final d0 b(f0 f0Var, ln.h hVar, z.a aVar) throws ProtocolException {
        n nVarJ;
        h0 h0VarQ = (hVar == null || (nVarJ = hVar.j()) == null) ? null : nVarJ.q();
        int iM = f0Var.m();
        String strI = f0Var.U0().i();
        if (iM != 307 && iM != 308) {
            if (iM == 401) {
                return aVar.g().a(h0VarQ, f0Var);
            }
            if (iM == 421) {
                e0 e0VarA = f0Var.U0().a();
                if ((e0VarA != null && e0VarA.isOneShot()) || hVar == null || !hVar.m()) {
                    return null;
                }
                hVar.j().p();
                return f0Var.U0();
            }
            if (iM == 503) {
                f0 f0VarK0 = f0Var.K0();
                if ((f0VarK0 == null || f0VarK0.m() != 503) && f(f0Var, Integer.MAX_VALUE) == 0) {
                    return f0Var.U0();
                }
                return null;
            }
            if (iM == 407) {
                s.e(h0VarQ);
                if (h0VarQ.b().type() == Proxy.Type.HTTP) {
                    return aVar.d().a(h0VarQ, f0Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iM == 408) {
                if (!aVar.f()) {
                    return null;
                }
                e0 e0VarA2 = f0Var.U0().a();
                if (e0VarA2 != null && e0VarA2.isOneShot()) {
                    return null;
                }
                f0 f0VarK1 = f0Var.K0();
                if ((f0VarK1 == null || f0VarK1.m() != 408) && f(f0Var, 0) <= 0) {
                    return f0Var.U0();
                }
                return null;
            }
            switch (iM) {
                case HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES /* 300 */:
                case 301:
                case 302:
                case HttpStatusCodes.STATUS_CODE_SEE_OTHER /* 303 */:
                    break;
                default:
                    return null;
            }
        }
        return a(f0Var, strI, aVar);
    }

    private final boolean c(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return (iOException instanceof SocketTimeoutException) && !z10;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean d(IOException iOException, m mVar, z.a aVar, d0 d0Var) {
        boolean z10 = iOException instanceof ConnectionShutdownException;
        boolean z11 = !z10;
        if (aVar.f()) {
            return (z10 || !e(iOException, d0Var)) && c(iOException, z11) && mVar.x();
        }
        return false;
    }

    private final boolean e(IOException iOException, d0 d0Var) {
        e0 e0VarA = d0Var.a();
        return (e0VarA != null && e0VarA.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private final int f(f0 f0Var, int i10) {
        String strC0 = f0.c0(f0Var, "Retry-After", null, 2, null);
        if (strC0 == null) {
            return i10;
        }
        if (!new o("\\d+").h(strC0)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strC0);
        s.g(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    @Override // gn.z
    public f0 intercept(z.a chain) throws Throwable {
        s.h(chain, "chain");
        g gVar = (g) chain;
        d0 d0VarX = gVar.x();
        m mVarN = gVar.n();
        List listL = r.l();
        boolean z10 = false;
        int i10 = 0;
        f0 f0VarC = null;
        while (true) {
            boolean z11 = true;
            while (true) {
                mVarN.h(d0VarX, z11, gVar);
                try {
                    if (mVarN.isCanceled()) {
                        throw new IOException("Canceled");
                    }
                    try {
                    } catch (IOException e10) {
                        boolean zD = d(e10, mVarN, chain, d0VarX);
                        mVarN.l().D(mVarN, e10, zD);
                        if (!zD) {
                            throw hn.m.G(e10, listL);
                        }
                        listL = r.t0(listL, e10);
                        mVarN.i(true);
                        z11 = false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z10 = true;
                }
                mVarN.i(z10);
                throw th;
            }
            f0VarC = gVar.c(d0VarX).F0().q(d0VarX).n(f0VarC != null ? hn.h.a(f0VarC) : null).c();
            ln.h hVarN = mVarN.n();
            d0 d0VarB = b(f0VarC, hVarN, chain);
            try {
                if (d0VarB == null) {
                    if (hVarN != null && hVarN.n()) {
                        mVarN.y();
                    }
                    mVarN.l().q(mVarN, f0VarC, null);
                    mVarN.i(false);
                    return f0VarC;
                }
                e0 e0VarA = d0VarB.a();
                if (e0VarA != null && e0VarA.isOneShot()) {
                    mVarN.l().q(mVarN, f0VarC, null);
                    mVarN.i(false);
                    return f0VarC;
                }
                hn.m.f(f0VarC.d());
                i10++;
                if (i10 > 20) {
                    mVarN.l().q(mVarN, f0VarC, null);
                    throw new ProtocolException("Too many follow-up requests: " + i10);
                }
                mVarN.l().q(mVarN, f0VarC, d0VarB);
                mVarN.i(true);
                d0VarX = d0VarB;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }
}
