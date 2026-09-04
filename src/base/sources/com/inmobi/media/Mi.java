package com.inmobi.media;

import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Mi implements gn.z {
    public static void a(Ni ni2, int i10) throws IOException {
        long jPow = (long) (Math.pow(1.0d, i10) * ni2.f25357b);
        if (jPow > 0) {
            try {
                Thread.sleep(jPow);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IOException("Retry delay interrupted", e10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    @Override // gn.z
    public final gn.f0 intercept(gn.z.a chain) throws IOException {
        kotlin.jvm.internal.s.h(chain, "chain");
        gn.d0 d0VarE = chain.e();
        Object objK = d0VarE.k();
        gn.f0 f0VarC = null;
        Ni ni2 = objK instanceof Ni ? (Ni) objK : null;
        if (ni2 == null) {
            kotlin.jvm.internal.s.e(d0VarE);
            try {
                gn.f0 f0VarC2 = chain.c(d0VarE);
                kotlin.jvm.internal.s.g(f0VarC2, "proceed(...)");
                return f0VarC2;
            } catch (IllegalArgumentException e10) {
                String message = e10.getMessage();
                if (!bm.r.R(message != null ? message : "", "port out of range", true)) {
                    throw e10;
                }
                fl.k kVar = W9.f25935a;
                W9.a(new M2(e10));
                throw new IOException("Proxy configuration error", e10);
            }
        }
        int i10 = ni2.f25356a;
        int i11 = i10 + 1;
        Throwable e11 = null;
        for (int i12 = 0; i12 < i11; i12++) {
            if (f0VarC != null) {
                try {
                    gn.g0 g0VarD = f0VarC.d();
                    if (g0VarD != null) {
                        g0VarD.close();
                    }
                } catch (IOException e12) {
                    e11 = e12;
                    if (i12 == i10) {
                        if (f0VarC != null) {
                            return f0VarC;
                        }
                        throw new IOException("Retry policy exhausted", e11);
                    }
                    a(ni2, i12);
                } catch (IllegalArgumentException e13) {
                    String message2 = e13.getMessage();
                    if (!bm.r.R(message2 != null ? message2 : "", "port out of range", true)) {
                        throw e13;
                    }
                    fl.k kVar2 = W9.f25935a;
                    W9.a(new M2(e13));
                    throw new IOException("Proxy configuration error", e13);
                } catch (CancellationException e14) {
                    throw e14;
                } catch (IllegalStateException e15) {
                    e11 = e15;
                    if (i12 == i10) {
                        if (f0VarC != null) {
                            return f0VarC;
                        }
                        throw new IOException("Retry policy exhausted", e11);
                    }
                    a(ni2, i12);
                }
            }
            f0VarC = chain.c(d0VarE);
            kotlin.jvm.internal.s.e(f0VarC);
            kotlin.jvm.internal.s.h(f0VarC, "<this>");
            int iM = f0VarC.m();
            if (400 <= iM && iM < 600 && AbstractC3303sg.a(f0VarC) && i12 < i10) {
                a(ni2, i12);
            }
            return f0VarC;
        }
        if (f0VarC != null) {
            return f0VarC;
        }
        throw new IOException("Retry policy exhausted", e11);
    }
}
