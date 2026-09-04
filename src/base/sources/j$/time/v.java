package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f41815b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41816a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f41816a - ((v) obj).f41816a;
    }

    static {
        j$.time.format.o oVar = new j$.time.format.o();
        oVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.x.EXCEEDS_PAD);
        oVar.l(Locale.getDefault(), j$.time.format.w.SMART, null);
    }

    public static v s(int i10) {
        j$.time.temporal.a.YEAR.X(i10);
        return new v(i10);
    }

    public v(int i10) {
        this.f41816a = i10;
    }

    @Override // j$.time.temporal.n
    public final boolean h(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA;
        }
        return rVar != null && rVar.s(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.v.f(1L, this.f41816a <= 0 ? C.NANOS_PER_SECOND : 999999999L);
        }
        return super.l(rVar);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.r rVar) {
        return l(rVar).a(i(rVar), rVar);
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.P(this);
        }
        int i10 = u.f41813a[((j$.time.temporal.a) rVar).ordinal()];
        if (i10 == 1) {
            int i11 = this.f41816a;
            if (i11 < 1) {
                i11 = 1 - i11;
            }
            return i11;
        }
        if (i10 == 2) {
            return this.f41816a;
        }
        if (i10 == 3) {
            return this.f41816a < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.m m(i iVar) {
        return (v) iVar.e(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final v c(long j10, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (v) rVar.V(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.X(j10);
        int i10 = u.f41813a[aVar.ordinal()];
        if (i10 == 1) {
            if (this.f41816a < 1) {
                j10 = 1 - j10;
            }
            return s((int) j10);
        }
        if (i10 == 2) {
            return s((int) j10);
        }
        if (i10 == 3) {
            return i(j$.time.temporal.a.ERA) == j10 ? this : s(1 - this.f41816a);
        }
        throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final v d(long j10, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return (v) tVar.s(this, j10);
        }
        int i10 = u.f41814b[((j$.time.temporal.b) tVar).ordinal()];
        if (i10 == 1) {
            return F(j10);
        }
        if (i10 == 2) {
            return F(Math.multiplyExact(j10, 10));
        }
        if (i10 == 3) {
            return F(Math.multiplyExact(j10, 100));
        }
        if (i10 == 4) {
            return F(Math.multiplyExact(j10, 1000));
        }
        if (i10 == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return c(Math.addExact(i(aVar), j10), aVar);
        }
        throw new j$.time.temporal.u("Unsupported unit: " + tVar);
    }

    public final v F(long j10) {
        if (j10 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return s(aVar.f41784b.a(((long) this.f41816a) + j10, aVar));
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
            return j$.time.temporal.b.YEARS;
        }
        return super.b(a0Var);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m e(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.l.r(mVar).equals(j$.time.chrono.s.f41655c)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return mVar.c(this.f41816a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f41816a == ((v) obj).f41816a;
    }

    public final int hashCode() {
        return this.f41816a;
    }

    public final String toString() {
        return Integer.toString(this.f41816a);
    }

    private Object writeReplace() {
        return new t((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
