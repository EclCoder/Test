package j$.time.chrono;

/* JADX INFO: loaded from: classes3.dex */
public interface m extends j$.time.temporal.n, j$.time.temporal.o {
    int getValue();

    @Override // j$.time.temporal.n
    default boolean h(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.ERA;
        }
        return rVar != null && rVar.s(this);
    }

    @Override // j$.time.temporal.n
    default int g(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ERA) {
            return getValue();
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.n
    default long i(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ERA) {
            return getValue();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.u(j$.time.d.a("Unsupported field: ", rVar));
        }
        return rVar.P(this);
    }

    @Override // j$.time.temporal.n
    default Object b(j$.time.a0 a0Var) {
        if (a0Var == j$.time.temporal.s.f41804c) {
            return j$.time.temporal.b.ERAS;
        }
        return super.b(a0Var);
    }

    @Override // j$.time.temporal.o
    default j$.time.temporal.m e(j$.time.temporal.m mVar) {
        return mVar.c(getValue(), j$.time.temporal.a.ERA);
    }
}
