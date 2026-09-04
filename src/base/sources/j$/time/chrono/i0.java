package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends d {
    private static final long serialVersionUID = -8722293800195731463L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient j$.time.i f41632a;

    @Override // j$.time.chrono.b
    public final e L(j$.time.l lVar) {
        return new g(this, lVar);
    }

    public i0(j$.time.i iVar) {
        Objects.requireNonNull(iVar, "isoDate");
        this.f41632a = iVar;
    }

    @Override // j$.time.chrono.b
    public final l f() {
        return g0.f41624c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        g0.f41624c.getClass();
        return this.f41632a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.b
    public final m N() {
        return P() >= 1 ? j0.BE : j0.BEFORE_BE;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.A(this);
        }
        if (!h(rVar)) {
            throw new j$.time.temporal.u(j$.time.d.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i10 = h0.f41630a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return this.f41632a.l(rVar);
        }
        if (i10 != 4) {
            return g0.f41624c.y(aVar);
        }
        j$.time.temporal.v vVar = j$.time.temporal.a.YEAR.f41784b;
        return j$.time.temporal.v.f(1L, P() <= 0 ? (-(vVar.f41809a + 543)) + 1 : 543 + vVar.f41812d);
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = h0.f41630a[((j$.time.temporal.a) rVar).ordinal()];
            if (i10 == 4) {
                int iP = P();
                if (iP < 1) {
                    iP = 1 - iP;
                }
                return iP;
            }
            if (i10 == 5) {
                return ((((long) P()) * 12) + ((long) this.f41632a.f41752b)) - 1;
            }
            if (i10 == 6) {
                return P();
            }
            if (i10 != 7) {
                return this.f41632a.i(rVar);
            }
            return P() < 1 ? 0 : 1;
        }
        return rVar.P(this);
    }

    public final int P() {
        return this.f41632a.f41751a + 543;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final i0 c(long j10, j$.time.temporal.r rVar) {
        int iA;
        int i10;
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (i(aVar) == j10) {
                return this;
            }
            int[] iArr = h0.f41630a;
            int i11 = iArr[aVar.ordinal()];
            if (i11 == 4) {
                iA = g0.f41624c.y(aVar).a(j10, aVar);
                i10 = iArr[aVar.ordinal()];
                if (i10 != 4) {
                    j$.time.i iVar = this.f41632a;
                    if (P() < 1) {
                        iA = 1 - iA;
                    }
                    return X(iVar.m0(iA - 543));
                }
                if (i10 != 6) {
                    return X(this.f41632a.m0(iA - 543));
                }
                if (i10 == 7) {
                    return X(this.f41632a.m0((-542) - P()));
                }
            } else {
                if (i11 == 5) {
                    g0.f41624c.y(aVar).b(j10, aVar);
                    long jP = ((long) P()) * 12;
                    j$.time.i iVar2 = this.f41632a;
                    return X(iVar2.g0(j10 - ((jP + ((long) iVar2.f41752b)) - 1)));
                }
                if (i11 == 6 || i11 == 7) {
                    iA = g0.f41624c.y(aVar).a(j10, aVar);
                    i10 = iArr[aVar.ordinal()];
                    if (i10 != 4) {
                        j$.time.i iVar3 = this.f41632a;
                        if (P() < 1) {
                            iA = 1 - iA;
                        }
                        return X(iVar3.m0(iA - 543));
                    }
                    if (i10 != 6) {
                        return X(this.f41632a.m0(iA - 543));
                    }
                    if (i10 == 7) {
                        return X(this.f41632a.m0((-542) - P()));
                    }
                }
            }
            return X(this.f41632a.c(j10, rVar));
        }
        return (i0) super.c(j10, rVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.m m(j$.time.i iVar) {
        return (i0) super.m(iVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b m(j$.time.temporal.o oVar) {
        return (i0) super.m(oVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b R(j$.time.temporal.q qVar) {
        return (i0) super.R(qVar);
    }

    @Override // j$.time.chrono.d
    public final b I(long j10) {
        return X(this.f41632a.i0(j10));
    }

    @Override // j$.time.chrono.d
    public final b F(long j10) {
        return X(this.f41632a.g0(j10));
    }

    @Override // j$.time.chrono.d
    public final b A(long j10) {
        return X(this.f41632a.f0(j10));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b d(long j10, j$.time.temporal.t tVar) {
        return (i0) super.d(j10, tVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j10, j$.time.temporal.t tVar) {
        return (i0) super.d(j10, tVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b a(long j10, j$.time.temporal.t tVar) {
        return (i0) super.a(j10, tVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final j$.time.temporal.m a(long j10, j$.time.temporal.t tVar) {
        return (i0) super.a(j10, tVar);
    }

    public final i0 X(j$.time.i iVar) {
        return iVar.equals(this.f41632a) ? this : new i0(iVar);
    }

    @Override // j$.time.chrono.b
    public final long K() {
        return this.f41632a.K();
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            return this.f41632a.equals(((i0) obj).f41632a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 8, this);
    }
}
