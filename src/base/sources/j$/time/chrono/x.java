package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j$.time.i f41660d = j$.time.i.b0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient j$.time.i f41661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient y f41662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f41663c;

    @Override // j$.time.chrono.b
    public final e L(j$.time.l lVar) {
        return new g(this, lVar);
    }

    public x(j$.time.i iVar) {
        if (iVar.X(f41660d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        y yVarP = y.p(iVar);
        this.f41662b = yVarP;
        this.f41663c = (iVar.f41751a - yVarP.f41667b.f41751a) + 1;
        this.f41661a = iVar;
    }

    public x(y yVar, int i10, j$.time.i iVar) {
        if (iVar.X(f41660d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        this.f41662b = yVar;
        this.f41663c = i10;
        this.f41661a = iVar;
    }

    @Override // j$.time.chrono.b
    public final l f() {
        return v.f41658c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        v.f41658c.getClass();
        return this.f41661a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.b
    public final m N() {
        return this.f41662b;
    }

    @Override // j$.time.chrono.b, j$.time.temporal.n
    public final boolean h(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).isDateBased();
        }
        return rVar != null && rVar.s(this);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    @Override // j$.time.temporal.n
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        int iV;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.A(this);
        }
        if (!h(rVar)) {
            throw new j$.time.temporal.u(j$.time.d.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i10 = w.f41659a[aVar.ordinal()];
        if (i10 == 1) {
            return j$.time.temporal.v.f(1L, this.f41661a.Z());
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return v.f41658c.y(aVar);
            }
            y yVar = this.f41662b;
            int i11 = yVar.f41667b.f41751a;
            y yVarQ = yVar.q();
            return yVarQ != null ? j$.time.temporal.v.f(1L, (yVarQ.f41667b.f41751a - i11) + 1) : j$.time.temporal.v.f(1L, 999999999 - i11);
        }
        y yVarQ2 = this.f41662b.q();
        if (yVarQ2 != null) {
            j$.time.i iVar = yVarQ2.f41667b;
            if (iVar.f41751a == this.f41661a.f41751a) {
                iV = iVar.V() - 1;
            } else if (this.f41661a.Y()) {
                iV = 366;
            } else {
                iV = 365;
            }
        } else if (this.f41661a.Y()) {
            iV = 366;
        } else {
            iV = 365;
        }
        if (this.f41663c == 1) {
            iV -= this.f41662b.f41667b.V() - 1;
        }
        return j$.time.temporal.v.f(1L, iV);
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.P(this);
        }
        switch (w.f41659a[((j$.time.temporal.a) rVar).ordinal()]) {
            case 2:
                return this.f41663c == 1 ? (this.f41661a.V() - this.f41662b.f41667b.V()) + 1 : this.f41661a.V();
            case 3:
                return this.f41663c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.u(j$.time.d.a("Unsupported field: ", rVar));
            case 8:
                return this.f41662b.f41666a;
            default:
                return this.f41661a.i(rVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final x c(long j10, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (i(aVar) == j10) {
                return this;
            }
            int[] iArr = w.f41659a;
            int i10 = iArr[aVar.ordinal()];
            if (i10 == 3 || i10 == 8 || i10 == 9) {
                v vVar = v.f41658c;
                int iA = vVar.y(aVar).a(j10, aVar);
                int i11 = iArr[aVar.ordinal()];
                if (i11 == 3) {
                    return X(this.f41661a.m0(vVar.C(this.f41662b, iA)));
                }
                if (i11 == 8) {
                    return X(this.f41661a.m0(vVar.C(y.r(iA), this.f41663c)));
                }
                if (i11 == 9) {
                    return X(this.f41661a.m0(iA));
                }
            }
            return X(this.f41661a.c(j10, rVar));
        }
        return (x) super.c(j10, rVar);
    }

    public final x Y(j$.time.a0 a0Var) {
        return (x) super.m(a0Var);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.m m(j$.time.i iVar) {
        return (x) super.m(iVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b m(j$.time.temporal.o oVar) {
        return (x) super.m(oVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b R(j$.time.temporal.q qVar) {
        return (x) super.R(qVar);
    }

    @Override // j$.time.chrono.d
    public final b I(long j10) {
        return X(this.f41661a.i0(j10));
    }

    @Override // j$.time.chrono.d
    public final b F(long j10) {
        return X(this.f41661a.g0(j10));
    }

    @Override // j$.time.chrono.d
    public final b A(long j10) {
        return X(this.f41661a.f0(j10));
    }

    public final x P(long j10, j$.time.temporal.b bVar) {
        return (x) super.d(j10, (j$.time.temporal.t) bVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b d(long j10, j$.time.temporal.t tVar) {
        return (x) super.d(j10, tVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j10, j$.time.temporal.t tVar) {
        return (x) super.d(j10, tVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b a(long j10, j$.time.temporal.t tVar) {
        return (x) super.a(j10, tVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final j$.time.temporal.m a(long j10, j$.time.temporal.t tVar) {
        return (x) super.a(j10, tVar);
    }

    public final x X(j$.time.i iVar) {
        return iVar.equals(this.f41661a) ? this : new x(iVar);
    }

    @Override // j$.time.chrono.b
    public final long K() {
        return this.f41661a.K();
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return this.f41661a.equals(((x) obj).f41661a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 4, this);
    }
}
