package j$.time;

import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements j$.time.temporal.m, j$.time.temporal.o, j$.time.chrono.b, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f41749d = b0(-999999999, 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f41750e = b0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f41752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f41753c;

    static {
        b0(1970, 1, 1);
    }

    public static i b0(int i10, int i11, int i12) {
        j$.time.temporal.a.YEAR.X(i10);
        j$.time.temporal.a.MONTH_OF_YEAR.X(i11);
        j$.time.temporal.a.DAY_OF_MONTH.X(i12);
        return A(i10, i11, i12);
    }

    public static i d0(int i10, int i11) {
        long j10 = i10;
        j$.time.temporal.a.YEAR.X(j10);
        j$.time.temporal.a.DAY_OF_YEAR.X(i11);
        j$.time.chrono.s.f41655c.getClass();
        boolean zX = j$.time.chrono.s.X(j10);
        if (i11 == 366 && !zX) {
            throw new c("Invalid date 'DayOfYear 366' as '" + i10 + "' is not a leap year");
        }
        n nVarI = n.I(((i11 - 1) / 31) + 1);
        if (i11 > (nVarI.A(zX) + nVarI.s(zX)) - 1) {
            nVarI = n.f41766a[((((int) 1) + 12) + nVarI.ordinal()) % 12];
        }
        return new i(i10, nVarI.getValue(), (i11 - nVarI.s(zX)) + 1);
    }

    public static i c0(long j10) {
        long j11;
        j$.time.temporal.a.EPOCH_DAY.X(j10);
        long j12 = 719468 + j10;
        if (j12 < 0) {
            long j13 = ((j10 + 719469) / 146097) - 1;
            j11 = j13 * 400;
            j12 += (-j13) * 146097;
        } else {
            j11 = 0;
        }
        long j14 = ((j12 * 400) + 591) / 146097;
        long j15 = j12 - ((j14 / 400) + (((j14 / 4) + (j14 * 365)) - (j14 / 100)));
        if (j15 < 0) {
            j14--;
            j15 = j12 - ((j14 / 400) + (((j14 / 4) + (365 * j14)) - (j14 / 100)));
        }
        int i10 = (int) j15;
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        long j16 = j14 + j11 + ((long) (i11 / 10));
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new i(aVar.f41784b.a(j16, aVar), i12, i13);
    }

    public static i F(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        i iVar = (i) nVar.b(j$.time.temporal.s.f41807f);
        if (iVar != null) {
            return iVar;
        }
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName());
    }

    public static i A(int i10, int i11, int i12) {
        int i13 = 28;
        if (i12 > 28) {
            if (i11 != 2) {
                i13 = (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.s.f41655c.getClass();
                if (j$.time.chrono.s.X(i10)) {
                    i13 = 29;
                }
            }
            if (i12 > i13) {
                if (i12 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i10 + "' is not a leap year");
                }
                throw new c("Invalid date '" + n.I(i11).name() + " " + i12 + "'");
            }
        }
        return new i(i10, i11, i12);
    }

    public static i j0(int i10, int i11, int i12) {
        if (i11 == 2) {
            j$.time.chrono.s.f41655c.getClass();
            i12 = Math.min(i12, j$.time.chrono.s.X((long) i10) ? 29 : 28);
        } else if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
            i12 = Math.min(i12, 30);
        }
        return new i(i10, i11, i12);
    }

    public i(int i10, int i11, int i12) {
        this.f41751a = i10;
        this.f41752b = (short) i11;
        this.f41753c = (short) i12;
    }

    public static i a0(a aVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Instant instant = Instant.f41589c;
        long j10 = 1000;
        Instant instantS = Instant.s(Math.floorDiv(jCurrentTimeMillis, j10), ((int) Math.floorMod(jCurrentTimeMillis, j10)) * 1000000);
        y yVar = aVar.f41608a;
        Objects.requireNonNull(instantS, "instant");
        Objects.requireNonNull(yVar, "zone");
        return c0(Math.floorDiv(instantS.f41590a + ((long) yVar.A().d(instantS).f41603b), 86400));
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.A(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
        }
        int i10 = h.f41747a[aVar.ordinal()];
        if (i10 == 1) {
            return j$.time.temporal.v.f(1L, Z());
        }
        if (i10 == 2) {
            return j$.time.temporal.v.f(1L, Y() ? 366 : 365);
        }
        if (i10 == 3) {
            return j$.time.temporal.v.f(1L, (n.I(this.f41752b) != n.FEBRUARY || Y()) ? 5L : 4L);
        }
        if (i10 != 4) {
            return aVar.f41784b;
        }
        return this.f41751a <= 0 ? j$.time.temporal.v.f(1L, C.NANOS_PER_SECOND) : j$.time.temporal.v.f(1L, 999999999L);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return I(rVar);
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.EPOCH_DAY) {
                return K();
            }
            if (rVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return I(rVar);
            }
            return ((((long) this.f41751a) * 12) + ((long) this.f41752b)) - 1;
        }
        return rVar.P(this);
    }

    public final int I(j$.time.temporal.r rVar) {
        switch (h.f41747a[((j$.time.temporal.a) rVar).ordinal()]) {
            case 1:
                return this.f41753c;
            case 2:
                return V();
            case 3:
                return ((this.f41753c - 1) / 7) + 1;
            case 4:
                int i10 = this.f41751a;
                return i10 >= 1 ? i10 : 1 - i10;
            case 5:
                return P().getValue();
            case 6:
                return ((this.f41753c - 1) % 7) + 1;
            case 7:
                return ((V() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.u("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((V() - 1) / 7) + 1;
            case 10:
                return this.f41752b;
            case 11:
                throw new j$.time.temporal.u("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f41751a;
            case 13:
                return this.f41751a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
        }
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.l f() {
        return j$.time.chrono.s.f41655c;
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.m N() {
        return this.f41751a >= 1 ? j$.time.chrono.t.CE : j$.time.chrono.t.BCE;
    }

    public final int V() {
        return (n.I(this.f41752b).s(Y()) + this.f41753c) - 1;
    }

    public final e P() {
        return e.s(((int) Math.floorMod(K() + 3, 7)) + 1);
    }

    public final boolean Y() {
        j$.time.chrono.s sVar = j$.time.chrono.s.f41655c;
        long j10 = this.f41751a;
        sVar.getClass();
        return j$.time.chrono.s.X(j10);
    }

    public final int Z() {
        short s10 = this.f41752b;
        if (s10 != 2) {
            return (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31;
        }
        return Y() ? 29 : 28;
    }

    @Override // j$.time.chrono.b
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final i m(j$.time.temporal.o oVar) {
        if (oVar instanceof i) {
            return (i) oVar;
        }
        return (i) oVar.e(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final i c(long j10, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (i) rVar.V(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.X(j10);
        switch (h.f41747a[aVar.ordinal()]) {
            case 1:
                int i10 = (int) j10;
                if (this.f41753c != i10) {
                    return b0(this.f41751a, this.f41752b, i10);
                }
                return this;
            case 2:
                int i11 = (int) j10;
                if (V() != i11) {
                    return d0(this.f41751a, i11);
                }
                return this;
            case 3:
                return h0(j10 - i(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f41751a < 1) {
                    j10 = 1 - j10;
                }
                return m0((int) j10);
            case 5:
                return f0(j10 - ((long) P().getValue()));
            case 6:
                return f0(j10 - i(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return f0(j10 - i(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return c0(j10);
            case 9:
                return h0(j10 - i(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i12 = (int) j10;
                if (this.f41752b != i12) {
                    j$.time.temporal.a.MONTH_OF_YEAR.X(i12);
                    return j0(this.f41751a, i12, this.f41753c);
                }
                return this;
            case 11:
                return g0(j10 - (((((long) this.f41751a) * 12) + ((long) this.f41752b)) - 1));
            case 12:
                return m0((int) j10);
            case 13:
                if (i(j$.time.temporal.a.ERA) != j10) {
                    return m0(1 - this.f41751a);
                }
                return this;
            default:
                throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
        }
    }

    public final i m0(int i10) {
        if (this.f41751a == i10) {
            return this;
        }
        j$.time.temporal.a.YEAR.X(i10);
        return j0(i10, this.f41752b, this.f41753c);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.b R(j$.time.temporal.q qVar) {
        if (qVar != null) {
            s sVar = (s) qVar;
            return g0((((long) sVar.f41777a) * 12) + ((long) sVar.f41778b)).f0(sVar.f41779c);
        }
        Objects.requireNonNull(qVar, "amountToAdd");
        return (i) ((s) qVar).s(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final i d(long j10, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return (i) tVar.s(this, j10);
        }
        switch (h.f41748b[((j$.time.temporal.b) tVar).ordinal()]) {
            case 1:
                return f0(j10);
            case 2:
                return h0(j10);
            case 3:
                return g0(j10);
            case 4:
                return i0(j10);
            case 5:
                return i0(Math.multiplyExact(j10, 10));
            case 6:
                return i0(Math.multiplyExact(j10, 100));
            case 7:
                return i0(Math.multiplyExact(j10, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(Math.addExact(i(aVar), j10), aVar);
            default:
                throw new j$.time.temporal.u("Unsupported unit: " + tVar);
        }
    }

    public final i i0(long j10) {
        if (j10 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return j0(aVar.f41784b.a(((long) this.f41751a) + j10, aVar), this.f41752b, this.f41753c);
    }

    public final i g0(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f41751a) * 12) + ((long) (this.f41752b - 1)) + j10;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j12 = 12;
        return j0(aVar.f41784b.a(Math.floorDiv(j11, j12), aVar), ((int) Math.floorMod(j11, j12)) + 1, this.f41753c);
    }

    public final i h0(long j10) {
        return f0(Math.multiplyExact(j10, 7));
    }

    public final i f0(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = ((long) this.f41753c) + j10;
        if (j11 > 0) {
            if (j11 <= 28) {
                return new i(this.f41751a, this.f41752b, (int) j11);
            }
            if (j11 <= 59) {
                long jZ = Z();
                if (j11 <= jZ) {
                    return new i(this.f41751a, this.f41752b, (int) j11);
                }
                short s10 = this.f41752b;
                if (s10 < 12) {
                    return new i(this.f41751a, s10 + 1, (int) (j11 - jZ));
                }
                j$.time.temporal.a.YEAR.X(this.f41751a + 1);
                return new i(this.f41751a + 1, 1, (int) (j11 - jZ));
            }
        }
        return c0(Math.addExact(K(), j10));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j10, j$.time.temporal.t tVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j10, tVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(a0 a0Var) {
        return a0Var == j$.time.temporal.s.f41807f ? this : super.b(a0Var);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.e L(l lVar) {
        return LocalDateTime.I(this, lVar);
    }

    @Override // j$.time.chrono.b
    public final long K() {
        long j10;
        long j11 = this.f41751a;
        long j12 = this.f41752b;
        long j13 = 365 * j11;
        if (j11 >= 0) {
            j10 = ((j11 + 399) / 400) + (((3 + j11) / 4) - ((99 + j11) / 100)) + j13;
        } else {
            j10 = j13 - ((j11 / (-400)) + ((j11 / (-4)) - (j11 / (-100))));
        }
        long j14 = (((367 * j12) - 362) / 12) + j10 + ((long) (this.f41753c - 1));
        if (j12 > 2) {
            j14 = !Y() ? j14 - 2 : j14 - 1;
        }
        return j14 - 719528;
    }

    @Override // j$.time.chrono.b, java.lang.Comparable
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        if (bVar instanceof i) {
            return s((i) bVar);
        }
        return super.compareTo(bVar);
    }

    public final int s(i iVar) {
        int i10 = this.f41751a - iVar.f41751a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f41752b - iVar.f41752b;
        return i11 == 0 ? this.f41753c - iVar.f41753c : i11;
    }

    public final boolean X(j$.time.chrono.b bVar) {
        if (bVar instanceof i) {
            return s((i) bVar) < 0;
        }
        return K() < bVar.K();
    }

    @Override // j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && s((i) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i10 = this.f41751a;
        short s10 = this.f41752b;
        short s11 = this.f41753c;
        return (((i10 << 11) + (s10 << 6)) + s11) ^ (i10 & BackupConstant.CLOSE_NOT_SHOW_CODE);
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i10 = this.f41751a;
        short s10 = this.f41752b;
        short s11 = this.f41753c;
        int iAbs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i10 > 9999) {
                sb2.append('+');
            }
            sb2.append(i10);
        } else if (i10 < 0) {
            sb2.append(i10 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i10 + 10000);
            sb2.deleteCharAt(0);
        }
        sb2.append(s10 < 10 ? "-0" : "-");
        sb2.append((int) s10);
        sb2.append(s11 < 10 ? "-0" : "-");
        sb2.append((int) s11);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new t((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
