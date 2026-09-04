package hn;

import fl.q;
import fl.w;
import gn.a0;
import java.nio.charset.Charset;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    public static final Charset a(a0 a0Var) {
        Charset charsetD;
        return (a0Var == null || (charsetD = a0.d(a0Var, null, 1, null)) == null) ? bm.d.f9079b : charsetD;
    }

    public static final q b(a0 a0Var) {
        Charset charset = bm.d.f9079b;
        if (a0Var != null) {
            Charset charsetD = a0.d(a0Var, null, 1, null);
            if (charsetD == null) {
                a0Var = a0.f39423e.b(a0Var + "; charset=utf-8");
            } else {
                charset = charsetD;
            }
        }
        return w.a(charset, a0Var);
    }

    public static final String[] c(gn.m mVar, String[] socketEnabledCipherSuites) {
        s.h(mVar, "<this>");
        s.h(socketEnabledCipherSuites, "socketEnabledCipherSuites");
        return mVar.d() != null ? m.w(mVar.d(), socketEnabledCipherSuites, gn.j.f39643b.c()) : socketEnabledCipherSuites;
    }
}
