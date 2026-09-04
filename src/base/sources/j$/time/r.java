package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f41773c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f41774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f41775b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r rVar = (r) obj;
        if (this.f41775b.equals(rVar.f41775b)) {
            return this.f41774a.compareTo(rVar.f41774a);
        }
        int iCompare = Long.compare(this.f41774a.d0() - (((long) this.f41775b.f41603b) * C.NANOS_PER_SECOND), rVar.f41774a.d0() - (((long) rVar.f41775b.f41603b) * C.NANOS_PER_SECOND));
        return iCompare == 0 ? this.f41774a.compareTo(rVar.f41774a) : iCompare;
    }

    static {
        l lVar = l.f41757e;
        ZoneOffset zoneOffset = ZoneOffset.f41602g;
        lVar.getClass();
        new r(lVar, zoneOffset);
        l lVar2 = l.f41758f;
        ZoneOffset zoneOffset2 = ZoneOffset.f41601f;
        lVar2.getClass();
        new r(lVar2, zoneOffset2);
    }

    public r(l lVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(lVar, "time");
        this.f41774a = lVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f41775b = zoneOffset;
    }

    public final r A(l lVar, ZoneOffset zoneOffset) {
        return (this.f41774a == lVar && this.f41775b.equals(zoneOffset)) ? this : new r(lVar, zoneOffset);
    }

    @Override // j$.time.temporal.n
    public final boolean h(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).Y() || rVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return rVar != null && rVar.s(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f41774a.l(rVar);
            }
            return ((j$.time.temporal.a) rVar).f41784b;
        }
        return rVar.A(this);
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f41775b.f41603b;
            }
            return this.f41774a.i(rVar);
        }
        return rVar.P(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.m m(i iVar) {
        return (r) iVar.e(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j10, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
                return A(this.f41774a, ZoneOffset.Z(aVar.f41784b.a(j10, aVar)));
            }
            return A(this.f41774a.c(j10, rVar), this.f41775b);
        }
        return (r) rVar.V(this, j10);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final r d(long j10, j$.time.temporal.t tVar) {
        if (tVar instanceof j$.time.temporal.b) {
            return A(this.f41774a.d(j10, tVar), this.f41775b);
        }
        return (r) tVar.s(this, j10);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j10, j$.time.temporal.t tVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j10, tVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(a0 a0Var) {
        if (a0Var == j$.time.temporal.s.f41805d || a0Var == j$.time.temporal.s.f41806e) {
            return this.f41775b;
        }
        if (((a0Var == j$.time.temporal.s.f41802a) || (a0Var == j$.time.temporal.s.f41803b)) || a0Var == j$.time.temporal.s.f41807f) {
            return null;
        }
        if (a0Var == j$.time.temporal.s.f41808g) {
            return this.f41774a;
        }
        if (a0Var == j$.time.temporal.s.f41804c) {
            return j$.time.temporal.b.NANOS;
        }
        return a0Var.k(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m e(j$.time.temporal.m mVar) {
        return mVar.c(this.f41774a.d0(), j$.time.temporal.a.NANO_OF_DAY).c(this.f41775b.f41603b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f41774a.equals(rVar.f41774a) && this.f41775b.equals(rVar.f41775b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f41774a.hashCode() ^ this.f41775b.f41603b;
    }

    public final String toString() {
        return this.f41774a.toString() + this.f41775b.f41604c;
    }

    private Object writeReplace() {
        return new t((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
