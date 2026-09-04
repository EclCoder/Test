package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.chrono.b;

/* JADX INFO: loaded from: classes3.dex */
public interface ChronoZonedDateTime<D extends b> extends j$.time.temporal.m, Comparable<ChronoZonedDateTime<?>> {
    ChronoZonedDateTime D(j$.time.y yVar);

    j$.time.y J();

    @Override // j$.time.temporal.m
    ChronoZonedDateTime c(long j10, j$.time.temporal.r rVar);

    @Override // j$.time.temporal.m
    ChronoZonedDateTime d(long j10, j$.time.temporal.t tVar);

    ZoneOffset o();

    e x();

    @Override // j$.time.temporal.n
    default j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar != j$.time.temporal.a.INSTANT_SECONDS && rVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return x().l(rVar);
            }
            return ((j$.time.temporal.a) rVar).f41784b;
        }
        return rVar.A(this);
    }

    @Override // j$.time.temporal.n
    default int g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = i.f41631a[((j$.time.temporal.a) rVar).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.u("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 != 2) {
                return x().g(rVar);
            }
            return o().f41603b;
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.n
    default long i(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = i.f41631a[((j$.time.temporal.a) rVar).ordinal()];
            if (i10 == 1) {
                return W();
            }
            if (i10 != 2) {
                return x().i(rVar);
            }
            return o().f41603b;
        }
        return rVar.P(this);
    }

    default b n() {
        return x().n();
    }

    default j$.time.l j() {
        return x().j();
    }

    default l f() {
        return n().f();
    }

    @Override // j$.time.temporal.m
    default ChronoZonedDateTime m(j$.time.temporal.o oVar) {
        return k.s(f(), oVar.e(this));
    }

    @Override // j$.time.temporal.m
    default ChronoZonedDateTime a(long j10, j$.time.temporal.t tVar) {
        return k.s(f(), super.a(j10, tVar));
    }

    @Override // j$.time.temporal.n
    default Object b(j$.time.a0 a0Var) {
        if (a0Var == j$.time.temporal.s.f41806e || a0Var == j$.time.temporal.s.f41802a) {
            return J();
        }
        if (a0Var == j$.time.temporal.s.f41805d) {
            return o();
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

    default Instant toInstant() {
        return Instant.A(W(), j().f41764d);
    }

    default long W() {
        return ((n().K() * 86400) + ((long) j().e0())) - ((long) o().f41603b);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    default int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int iCompare = Long.compare(W(), chronoZonedDateTime.W());
        return (iCompare == 0 && (iCompare = j().f41764d - chronoZonedDateTime.j().f41764d) == 0 && (iCompare = x().compareTo(chronoZonedDateTime.x())) == 0 && (iCompare = J().q().compareTo(chronoZonedDateTime.J().q())) == 0) ? ((a) f()).q().compareTo(chronoZonedDateTime.f().q()) : iCompare;
    }
}
