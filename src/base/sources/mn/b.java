package mn;

import bm.r;
import gn.d0;
import gn.e0;
import gn.f0;
import gn.g0;
import gn.j0;
import gn.z;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.s;
import okhttp3.internal.http2.ConnectionShutdownException;
import xn.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f46475a = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements j0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ln.h f46476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g0 f46477d;

        a(ln.h hVar, g0 g0Var) {
            this.f46476c = hVar;
            this.f46477d = g0Var;
        }
    }

    private b() {
    }

    private final boolean a(int i10) {
        if (i10 == 100) {
            return true;
        }
        return 102 <= i10 && i10 < 200;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00aa A[Catch: IOException -> 0x007b, TRY_LEAVE, TryCatch #3 {IOException -> 0x007b, blocks: (B:21:0x0066, B:23:0x006c, B:34:0x00a4, B:36:0x00aa, B:26:0x007d, B:27:0x008c, B:29:0x0099), top: B:105:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:94:0x020a  */
    /* JADX WARN: Code duplicated, block: B:96:0x020e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [gn.f0$a] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [gn.f0$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // gn.z
    public f0 intercept(z.a chain) throws IOException {
        boolean z10;
        ?? r10;
        IOException iOException;
        ?? R;
        f0 f0VarC;
        f0.a aVar;
        s.h(chain, "chain");
        g gVar = (g) chain;
        ln.h hVarS = gVar.s();
        s.e(hVarS);
        d0 d0VarX = gVar.x();
        e0 e0VarA = d0VarX.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = false;
        ?? r11 = (!f.c(d0VarX.i()) || e0VarA == null) ? 0 : 1;
        boolean zA = r.A("upgrade", d0VarX.e("Connection"), true);
        try {
            hVarS.w(d0VarX);
            try {
                if (r11 != 0) {
                    if (r.A("100-continue", d0VarX.e("Expect"), true)) {
                        hVarS.h();
                        f0.a aVarR = hVarS.r(true);
                        try {
                            hVarS.t();
                            z10 = false;
                            aVar = aVarR;
                        } catch (IOException e10) {
                            e = e10;
                            z10 = true;
                            r10 = aVarR;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            if (!hVarS.l()) {
                                throw e;
                            }
                            ?? r17 = r10;
                            iOException = e;
                            R = r17;
                        }
                    } else {
                        z10 = true;
                        aVar = null;
                    }
                    if (aVar != null) {
                        hVarS.p();
                        if (!hVarS.j().n()) {
                            r11 = aVar;
                            hVarS.o();
                            r11 = aVar;
                        }
                    } else if (e0VarA.isDuplex()) {
                        hVarS.h();
                        e0VarA.writeTo(c0.b(hVarS.e(d0VarX, true)));
                    } else {
                        xn.f fVarB = c0.b(hVarS.e(d0VarX, false));
                        e0VarA.writeTo(fVarB);
                        fVarB.close();
                    }
                } else {
                    hVarS.p();
                    z10 = true;
                    r11 = 0;
                }
                if (e0VarA != null) {
                    r11 = aVar;
                    if (!e0VarA.isDuplex()) {
                        r11 = aVar;
                        r11 = aVar;
                        r11 = aVar;
                        hVarS.g();
                    }
                } else {
                    r11 = aVar;
                    r11 = aVar;
                    r11 = aVar;
                    hVarS.g();
                }
                r11 = aVar;
                R = r11;
                iOException = null;
            } catch (IOException e11) {
                e = e11;
                r10 = r11;
            }
        } catch (IOException e12) {
            e = e12;
            z10 = true;
            r10 = 0;
        }
        if (R == 0) {
            try {
                R = hVarS.r(false);
                s.e(R);
                if (z10) {
                    hVarS.t();
                    z10 = false;
                }
            } catch (IOException e13) {
                e = e13;
                if (iOException != null) {
                    throw e;
                }
                fl.e.a(iOException, e);
                throw iOException;
            }
        }
        f0 f0VarC2 = R.q(d0VarX).h(hVarS.j().j()).r(jCurrentTimeMillis).p(System.currentTimeMillis()).c();
        int iM = f0VarC2.m();
        while (a(iM)) {
            try {
                f0.a aVarR2 = hVarS.r(z11);
                s.e(aVarR2);
                if (z10) {
                    hVarS.t();
                }
                f0VarC2 = aVarR2.q(d0VarX).h(hVarS.j().j()).r(jCurrentTimeMillis).p(System.currentTimeMillis()).c();
                iM = f0VarC2.m();
                z11 = false;
            } catch (IOException e14) {
                e = e14;
                if (iOException != null) {
                    throw e;
                }
                fl.e.a(iOException, e);
                throw iOException;
            }
        }
        hVarS.s(f0VarC2);
        boolean z12 = iM == 101;
        if (z12 && hVarS.j().n()) {
            throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
        }
        boolean z13 = z12 && r.A("upgrade", f0.c0(f0VarC2, "Connection", null, 2, null), true);
        if (zA && z13) {
            f0VarC = f0VarC2.F0().b(new hn.g(f0VarC2.d().contentType(), f0VarC2.d().contentLength())).s(hVarS.v()).c();
        } else {
            g0 g0VarQ = hVarS.q(f0VarC2);
            f0VarC = f0VarC2.F0().b(g0VarQ).t(new a(hVarS, g0VarQ)).c();
        }
        if (r.A("close", f0VarC.U0().e("Connection"), true) || r.A("close", f0.c0(f0VarC, "Connection", null, 2, null), true)) {
            hVarS.o();
        }
        if ((iM != 204 && iM != 205) || f0VarC.d().contentLength() <= 0) {
            return f0VarC;
        }
        throw new ProtocolException("HTTP " + iM + " had non-zero Content-Length: " + f0VarC.d().contentLength());
    }
}
