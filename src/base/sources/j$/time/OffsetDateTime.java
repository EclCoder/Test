package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class OffsetDateTime implements j$.time.temporal.m, j$.time.temporal.o, Comparable<OffsetDateTime>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f41596c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f41597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f41598b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.f41598b.equals(offsetDateTime2.f41598b)) {
            iCompare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            iCompare = Long.compare(this.f41597a.w(this.f41598b), offsetDateTime2.f41597a.w(offsetDateTime2.f41598b));
            if (iCompare == 0) {
                iCompare = this.f41597a.f41595b.f41764d - offsetDateTime2.f41597a.f41595b.f41764d;
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f41592c;
        ZoneOffset zoneOffset = ZoneOffset.f41602g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f41593d;
        ZoneOffset zoneOffset2 = ZoneOffset.f41601f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime s(Instant instant, y yVar) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(yVar, "zone");
        ZoneOffset zoneOffsetD = yVar.A().d(instant);
        return new OffsetDateTime(LocalDateTime.P(instant.f41590a, instant.f41591b, zoneOffsetD), zoneOffsetD);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.f41597a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f41598b = zoneOffset;
    }

    public final OffsetDateTime F(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f41597a == localDateTime && this.f41598b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.n
    public final boolean h(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return true;
        }
        return rVar != null && rVar.s(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar != j$.time.temporal.a.INSTANT_SECONDS && rVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f41597a.l(rVar);
            }
            return ((j$.time.temporal.a) rVar).f41784b;
        }
        return rVar.A(this);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = q.f41772a[((j$.time.temporal.a) rVar).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.u("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.f41598b.f41603b;
            }
            return this.f41597a.g(rVar);
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = q.f41772a[((j$.time.temporal.a) rVar).ordinal()];
            if (i10 == 1) {
                return this.f41597a.w(this.f41598b);
            }
            if (i10 == 2) {
                return this.f41598b.f41603b;
            }
            return this.f41597a.i(rVar);
        }
        return rVar.P(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f41597a;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.m m(i iVar) {
        LocalDateTime localDateTime = this.f41597a;
        return F(localDateTime.a0(iVar, localDateTime.f41595b), this.f41598b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j10, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i10 = q.f41772a[aVar.ordinal()];
            if (i10 == 1) {
                return s(Instant.A(j10, this.f41597a.f41595b.f41764d), this.f41598b);
            }
            if (i10 == 2) {
                return F(this.f41597a, ZoneOffset.Z(aVar.f41784b.a(j10, aVar)));
            }
            return F(this.f41597a.c(j10, rVar), this.f41598b);
        }
        return (OffsetDateTime) rVar.V(this, j10);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime d(long j10, j$.time.temporal.t tVar) {
        if (tVar instanceof j$.time.temporal.b) {
            return F(this.f41597a.d(j10, tVar), this.f41598b);
        }
        return (OffsetDateTime) tVar.s(this, j10);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j10, j$.time.temporal.t tVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j10, tVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(a0 a0Var) {
        if (a0Var == j$.time.temporal.s.f41805d || a0Var == j$.time.temporal.s.f41806e) {
            return this.f41598b;
        }
        if (a0Var == j$.time.temporal.s.f41802a) {
            return null;
        }
        if (a0Var == j$.time.temporal.s.f41807f) {
            return this.f41597a.f41594a;
        }
        if (a0Var == j$.time.temporal.s.f41808g) {
            return this.f41597a.f41595b;
        }
        if (a0Var == j$.time.temporal.s.f41803b) {
            return j$.time.chrono.s.f41655c;
        }
        if (a0Var == j$.time.temporal.s.f41804c) {
            return j$.time.temporal.b.NANOS;
        }
        return a0Var.k(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m e(j$.time.temporal.m mVar) {
        return mVar.c(this.f41597a.f41594a.K(), j$.time.temporal.a.EPOCH_DAY).c(this.f41597a.f41595b.d0(), j$.time.temporal.a.NANO_OF_DAY).c(this.f41598b.f41603b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f41597a.equals(offsetDateTime.f41597a) && this.f41598b.equals(offsetDateTime.f41598b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f41597a.hashCode() ^ this.f41598b.f41603b;
    }

    public final String toString() {
        return this.f41597a.toString() + this.f41598b.f41604c;
    }

    private Object writeReplace() {
        return new t((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
