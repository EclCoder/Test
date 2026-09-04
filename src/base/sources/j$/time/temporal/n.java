package j$.time.temporal;

import j$.time.a0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public interface n {
    boolean h(r rVar);

    long i(r rVar);

    default v l(r rVar) {
        if (!(rVar instanceof a)) {
            Objects.requireNonNull(rVar, "field");
            return rVar.A(this);
        }
        if (h(rVar)) {
            return ((a) rVar).f41784b;
        }
        throw new u(j$.time.d.a("Unsupported field: ", rVar));
    }

    default int g(r rVar) {
        v vVarL = l(rVar);
        if (!vVarL.d()) {
            throw new u("Invalid field " + rVar + " for get() method, use getLong() instead");
        }
        long jI = i(rVar);
        if (vVarL.e(jI)) {
            return (int) jI;
        }
        throw new j$.time.c("Invalid value for " + rVar + " (valid values " + vVarL + "): " + jI);
    }

    default Object b(a0 a0Var) {
        if (a0Var == s.f41802a || a0Var == s.f41803b || a0Var == s.f41804c) {
            return null;
        }
        return a0Var.k(this);
    }
}
