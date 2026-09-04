package j$.time;

import com.mbridge.msdk.MBridgeConstans;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements j$.time.temporal.n, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f41769c = 0;
    private static final long serialVersionUID = -939150713474957432L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41771b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        int i10 = this.f41770a - pVar.f41770a;
        return i10 == 0 ? this.f41771b - pVar.f41771b : i10;
    }

    static {
        j$.time.format.o oVar = new j$.time.format.o();
        oVar.d("--");
        oVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        oVar.c('-');
        oVar.g(j$.time.temporal.a.DAY_OF_MONTH, 2);
        oVar.l(Locale.getDefault(), j$.time.format.w.SMART, null);
    }

    public p(int i10, int i11) {
        this.f41770a = i10;
        this.f41771b = i11;
    }

    @Override // j$.time.temporal.n
    public final boolean h(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.DAY_OF_MONTH;
        }
        return rVar != null && rVar.s(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        int i10;
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return rVar.I();
        }
        if (rVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return super.l(rVar);
        }
        n nVarI = n.I(this.f41770a);
        nVarI.getClass();
        int i11 = m.f41765a[nVarI.ordinal()];
        if (i11 != 1) {
            i10 = (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) ? 30 : 31;
        } else {
            i10 = 28;
        }
        return j$.time.temporal.v.g(i10, n.I(this.f41770a).F());
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
        int i11 = o.f41768a[((j$.time.temporal.a) rVar).ordinal()];
        if (i11 == 1) {
            i10 = this.f41771b;
        } else {
            if (i11 != 2) {
                throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
            }
            i10 = this.f41770a;
        }
        return i10;
    }

    @Override // j$.time.temporal.n
    public final Object b(a0 a0Var) {
        if (a0Var == j$.time.temporal.s.f41803b) {
            return j$.time.chrono.s.f41655c;
        }
        return super.b(a0Var);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m e(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.l.r(mVar).equals(j$.time.chrono.s.f41655c)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.m mVarC = mVar.c(this.f41770a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVarC.c(Math.min(mVarC.l(aVar).f41812d, this.f41771b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f41770a == pVar.f41770a && this.f41771b == pVar.f41771b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f41770a << 6) + this.f41771b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        sb2.append(this.f41770a < 10 ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "");
        sb2.append(this.f41770a);
        sb2.append(this.f41771b < 10 ? "-0" : "-");
        sb2.append(this.f41771b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new t((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
