package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.time.format.DateTimeFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.o, Comparable<Instant>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Instant f41589c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41591b;

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f41590a, instant2.f41590a);
        return iCompare != 0 ? iCompare : this.f41591b - instant2.f41591b;
    }

    static {
        A(-31557014167219200L, 0L);
        A(31556889864403199L, 999999999L);
    }

    public static Instant A(long j10, long j11) {
        return s(Math.addExact(j10, Math.floorDiv(j11, C.NANOS_PER_SECOND)), (int) Math.floorMod(j11, C.NANOS_PER_SECOND));
    }

    public static Instant s(long j10, int i10) {
        if ((((long) i10) | j10) == 0) {
            return f41589c;
        }
        if (j10 < -31557014167219200L || j10 > 31556889864403199L) {
            throw new c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j10, i10);
    }

    public Instant(long j10, int i10) {
        this.f41590a = j10;
        this.f41591b = i10;
    }

    @Override // j$.time.temporal.n
    public final boolean h(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.NANO_OF_SECOND || rVar == j$.time.temporal.a.MICRO_OF_SECOND || rVar == j$.time.temporal.a.MILLI_OF_SECOND;
        }
        return rVar != null && rVar.s(this);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return super.l(rVar).a(rVar.P(this), rVar);
        }
        int i10 = g.f41745a[((j$.time.temporal.a) rVar).ordinal()];
        if (i10 == 1) {
            return this.f41591b;
        }
        if (i10 == 2) {
            return this.f41591b / 1000;
        }
        if (i10 == 3) {
            return this.f41591b / 1000000;
        }
        if (i10 == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.f41784b.a(this.f41590a, aVar);
        }
        throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        int i10;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.P(this);
        }
        int i11 = g.f41745a[((j$.time.temporal.a) rVar).ordinal()];
        if (i11 == 1) {
            i10 = this.f41591b;
        } else if (i11 == 2) {
            i10 = this.f41591b / 1000;
        } else {
            if (i11 != 3) {
                if (i11 == 4) {
                    return this.f41590a;
                }
                throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
            }
            i10 = this.f41591b / 1000000;
        }
        return i10;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.m m(i iVar) {
        return (Instant) iVar.e(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j10, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (Instant) rVar.V(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.X(j10);
        int i10 = g.f41745a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                int i11 = ((int) j10) * 1000;
                if (i11 != this.f41591b) {
                    return s(this.f41590a, i11);
                }
            } else if (i10 == 3) {
                int i12 = ((int) j10) * 1000000;
                if (i12 != this.f41591b) {
                    return s(this.f41590a, i12);
                }
            } else {
                if (i10 != 4) {
                    throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
                }
                if (j10 != this.f41590a) {
                    return s(j10, this.f41591b);
                }
            }
        } else if (j10 != this.f41591b) {
            return s(this.f41590a, (int) j10);
        }
        return this;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final Instant d(long j10, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return (Instant) tVar.s(this, j10);
        }
        switch (g.f41746b[((j$.time.temporal.b) tVar).ordinal()]) {
            case 1:
                return F(0L, j10);
            case 2:
                return F(j10 / 1000000, (j10 % 1000000) * 1000);
            case 3:
                return F(j10 / 1000, (j10 % 1000) * 1000000);
            case 4:
                return F(j10, 0L);
            case 5:
                return F(Math.multiplyExact(j10, 60), 0L);
            case 6:
                return F(Math.multiplyExact(j10, 3600), 0L);
            case 7:
                return F(Math.multiplyExact(j10, 43200), 0L);
            case 8:
                return F(Math.multiplyExact(j10, 86400), 0L);
            default:
                throw new j$.time.temporal.u("Unsupported unit: " + tVar);
        }
    }

    public final Instant F(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return A(Math.addExact(Math.addExact(this.f41590a, j10), j11 / C.NANOS_PER_SECOND), ((long) this.f41591b) + (j11 % C.NANOS_PER_SECOND));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j10, j$.time.temporal.t tVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j10, tVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(a0 a0Var) {
        if (a0Var == j$.time.temporal.s.f41804c) {
            return j$.time.temporal.b.NANOS;
        }
        if (a0Var == j$.time.temporal.s.f41803b || a0Var == j$.time.temporal.s.f41802a || a0Var == j$.time.temporal.s.f41806e || a0Var == j$.time.temporal.s.f41805d || a0Var == j$.time.temporal.s.f41807f || a0Var == j$.time.temporal.s.f41808g) {
            return null;
        }
        return a0Var.k(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m e(j$.time.temporal.m mVar) {
        return mVar.c(this.f41590a, j$.time.temporal.a.INSTANT_SECONDS).c(this.f41591b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.s(this, zoneOffset);
    }

    public long toEpochMilli() {
        long j10 = this.f41590a;
        return (j10 >= 0 || this.f41591b <= 0) ? Math.addExact(Math.multiplyExact(j10, 1000), this.f41591b / 1000000) : Math.addExact(Math.multiplyExact(j10 + 1, 1000), (this.f41591b / 1000000) - 1000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f41590a == instant.f41590a && this.f41591b == instant.f41591b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f41590a;
        return (this.f41591b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.f41675f.a(this);
    }

    private Object writeReplace() {
        return new t((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
