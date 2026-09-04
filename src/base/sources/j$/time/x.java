package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f41819c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41821b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x xVar = (x) obj;
        int i10 = this.f41820a - xVar.f41820a;
        return i10 == 0 ? this.f41821b - xVar.f41821b : i10;
    }

    static {
        j$.time.format.o oVar = new j$.time.format.o();
        oVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.x.EXCEEDS_PAD);
        oVar.c('-');
        oVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        oVar.l(Locale.getDefault(), j$.time.format.w.SMART, null);
    }

    public x(int i10, int i11) {
        this.f41820a = i10;
        this.f41821b = i11;
    }

    public final x P(int i10, int i11) {
        return (this.f41820a == i10 && this.f41821b == i11) ? this : new x(i10, i11);
    }

    @Override // j$.time.temporal.n
    public final boolean h(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.PROLEPTIC_MONTH || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA;
        }
        return rVar != null && rVar.s(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.v.f(1L, this.f41820a <= 0 ? C.NANOS_PER_SECOND : 999999999L);
        }
        return super.l(rVar);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.r rVar) {
        return l(rVar).a(i(rVar), rVar);
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        int i10;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.P(this);
        }
        int i11 = w.f41817a[((j$.time.temporal.a) rVar).ordinal()];
        if (i11 == 1) {
            i10 = this.f41821b;
        } else {
            if (i11 == 2) {
                return s();
            }
            if (i11 == 3) {
                int i12 = this.f41820a;
                if (i12 < 1) {
                    i12 = 1 - i12;
                }
                return i12;
            }
            if (i11 != 4) {
                if (i11 == 5) {
                    return this.f41820a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
            }
            i10 = this.f41820a;
        }
        return i10;
    }

    public final long s() {
        return ((((long) this.f41820a) * 12) + ((long) this.f41821b)) - 1;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.m m(i iVar) {
        return (x) iVar.e(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final x c(long j10, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (x) rVar.V(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.X(j10);
        int i10 = w.f41817a[aVar.ordinal()];
        if (i10 == 1) {
            int i11 = (int) j10;
            j$.time.temporal.a.MONTH_OF_YEAR.X(i11);
            return P(this.f41820a, i11);
        }
        if (i10 == 2) {
            return F(j10 - s());
        }
        if (i10 == 3) {
            if (this.f41820a < 1) {
                j10 = 1 - j10;
            }
            int i12 = (int) j10;
            j$.time.temporal.a.YEAR.X(i12);
            return P(i12, this.f41821b);
        }
        if (i10 == 4) {
            int i13 = (int) j10;
            j$.time.temporal.a.YEAR.X(i13);
            return P(i13, this.f41821b);
        }
        if (i10 != 5) {
            throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
        }
        if (i(j$.time.temporal.a.ERA) == j10) {
            return this;
        }
        int i14 = 1 - this.f41820a;
        j$.time.temporal.a.YEAR.X(i14);
        return P(i14, this.f41821b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final x d(long j10, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return (x) tVar.s(this, j10);
        }
        switch (w.f41818b[((j$.time.temporal.b) tVar).ordinal()]) {
            case 1:
                return F(j10);
            case 2:
                return I(j10);
            case 3:
                return I(Math.multiplyExact(j10, 10));
            case 4:
                return I(Math.multiplyExact(j10, 100));
            case 5:
                return I(Math.multiplyExact(j10, 1000));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(Math.addExact(i(aVar), j10), aVar);
            default:
                throw new j$.time.temporal.u("Unsupported unit: " + tVar);
        }
    }

    public final x I(long j10) {
        if (j10 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return P(aVar.f41784b.a(((long) this.f41820a) + j10, aVar), this.f41821b);
    }

    public final x F(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f41820a) * 12) + ((long) (this.f41821b - 1)) + j10;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j12 = 12;
        return P(aVar.f41784b.a(Math.floorDiv(j11, j12), aVar), ((int) Math.floorMod(j11, j12)) + 1);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j10, j$.time.temporal.t tVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j10, tVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(a0 a0Var) {
        if (a0Var == j$.time.temporal.s.f41803b) {
            return j$.time.chrono.s.f41655c;
        }
        if (a0Var == j$.time.temporal.s.f41804c) {
            return j$.time.temporal.b.MONTHS;
        }
        return super.b(a0Var);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m e(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.l.r(mVar).equals(j$.time.chrono.s.f41655c)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return mVar.c(s(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f41820a == xVar.f41820a && this.f41821b == xVar.f41821b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f41820a ^ (this.f41821b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.f41820a);
        StringBuilder sb2 = new StringBuilder(9);
        if (iAbs < 1000) {
            int i10 = this.f41820a;
            if (i10 < 0) {
                sb2.append(i10 - 10000);
                sb2.deleteCharAt(1);
            } else {
                sb2.append(i10 + 10000);
                sb2.deleteCharAt(0);
            }
        } else {
            sb2.append(this.f41820a);
        }
        sb2.append(this.f41821b < 10 ? "-0" : "-");
        sb2.append(this.f41821b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new t((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
