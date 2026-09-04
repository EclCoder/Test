package j$.time.chrono;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends j$.time.temporal.m, j$.time.temporal.o, Comparable {
    b R(j$.time.temporal.q qVar);

    @Override // j$.time.temporal.m
    b c(long j10, j$.time.temporal.r rVar);

    @Override // j$.time.temporal.m
    b d(long j10, j$.time.temporal.t tVar);

    boolean equals(Object obj);

    l f();

    int hashCode();

    b m(j$.time.temporal.o oVar);

    String toString();

    default e L(j$.time.l lVar) {
        return new g(this, lVar);
    }

    default m N() {
        return f().B(g(j$.time.temporal.a.ERA));
    }

    @Override // j$.time.temporal.n
    default boolean h(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).isDateBased();
        }
        return rVar != null && rVar.s(this);
    }

    @Override // j$.time.temporal.m
    default b a(long j10, j$.time.temporal.t tVar) {
        return d.s(f(), super.a(j10, tVar));
    }

    @Override // j$.time.temporal.n
    default Object b(j$.time.a0 a0Var) {
        if (a0Var == j$.time.temporal.s.f41802a || a0Var == j$.time.temporal.s.f41806e || a0Var == j$.time.temporal.s.f41805d || a0Var == j$.time.temporal.s.f41808g) {
            return null;
        }
        if (a0Var == j$.time.temporal.s.f41803b) {
            return f();
        }
        if (a0Var == j$.time.temporal.s.f41804c) {
            return j$.time.temporal.b.DAYS;
        }
        return a0Var.k(this);
    }

    @Override // j$.time.temporal.o
    default j$.time.temporal.m e(j$.time.temporal.m mVar) {
        return mVar.c(K(), j$.time.temporal.a.EPOCH_DAY);
    }

    default long K() {
        return i(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: U */
    default int compareTo(b bVar) {
        int iCompare = Long.compare(K(), bVar.K());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((a) f()).q().compareTo(bVar.f().q());
    }
}
