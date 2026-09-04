package j$.time.chrono;

import j$.time.ZoneOffset;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public interface e extends j$.time.temporal.m, j$.time.temporal.o, Comparable {
    ChronoZonedDateTime E(j$.time.y yVar);

    j$.time.l j();

    b n();

    default l f() {
        return n().f();
    }

    @Override // j$.time.temporal.m
    default e a(long j10, j$.time.temporal.t tVar) {
        return g.s(f(), super.a(j10, tVar));
    }

    @Override // j$.time.temporal.n
    default Object b(j$.time.a0 a0Var) {
        if (a0Var == j$.time.temporal.s.f41802a || a0Var == j$.time.temporal.s.f41806e || a0Var == j$.time.temporal.s.f41805d) {
            return null;
        }
        if (a0Var == j$.time.temporal.s.f41808g) {
            return j();
        }
        if (a0Var == j$.time.temporal.s.f41803b) {
            return f();
        }
        if (a0Var == j$.time.temporal.s.f41804c) {
            return j$.time.temporal.b.NANOS;
        }
        return a0Var.k(this);
    }

    @Override // j$.time.temporal.o
    default j$.time.temporal.m e(j$.time.temporal.m mVar) {
        return mVar.c(n().K(), j$.time.temporal.a.EPOCH_DAY).c(j().d0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    default long w(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((n().K() * 86400) + ((long) j().e0())) - ((long) zoneOffset.f41603b);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: O */
    default int compareTo(e eVar) {
        int iCompareTo = n().compareTo(eVar.n());
        return (iCompareTo == 0 && (iCompareTo = j().compareTo(eVar.j())) == 0) ? ((a) f()).q().compareTo(eVar.f().q()) : iCompareTo;
    }
}
