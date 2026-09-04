package j$.time;

import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.o, j$.time.chrono.e, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f41592c = I(i.f41749d, l.f41757e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f41593d = I(i.f41750e, l.f41758f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f41594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f41595b;

    @Override // j$.time.chrono.e
    public final ChronoZonedDateTime E(y yVar) {
        return ZonedDateTime.A(this, yVar, null);
    }

    public static LocalDateTime I(i iVar, l lVar) {
        Objects.requireNonNull(iVar, "date");
        Objects.requireNonNull(lVar, "time");
        return new LocalDateTime(iVar, lVar);
    }

    public static LocalDateTime P(long j10, int i10, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j11 = i10;
        j$.time.temporal.a.NANO_OF_SECOND.X(j11);
        long j12 = j10 + ((long) zoneOffset.f41603b);
        long j13 = 86400;
        return new LocalDateTime(i.c0(Math.floorDiv(j12, j13)), l.V((((long) ((int) Math.floorMod(j12, j13))) * C.NANOS_PER_SECOND) + j11));
    }

    public static LocalDateTime A(j$.time.temporal.n nVar) {
        if (nVar instanceof LocalDateTime) {
            return (LocalDateTime) nVar;
        }
        if (!(nVar instanceof ZonedDateTime)) {
            if (nVar instanceof OffsetDateTime) {
                return ((OffsetDateTime) nVar).toLocalDateTime();
            }
            try {
                return new LocalDateTime(i.F(nVar), l.F(nVar));
            } catch (c e10) {
                throw new c("Unable to obtain LocalDateTime from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName(), e10);
            }
        }
        return ((ZonedDateTime) nVar).f41605a;
    }

    public LocalDateTime(i iVar, l lVar) {
        this.f41594a = iVar;
        this.f41595b = lVar;
    }

    public final LocalDateTime a0(i iVar, l lVar) {
        return (this.f41594a == iVar && this.f41595b == lVar) ? this : new LocalDateTime(iVar, lVar);
    }

    @Override // j$.time.temporal.n
    public final boolean h(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar != null && rVar.s(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        return aVar.isDateBased() || aVar.Y();
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v l(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).Y() ? this.f41595b.l(rVar) : this.f41594a.l(rVar);
        }
        return rVar.A(this);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).Y() ? this.f41595b.g(rVar) : this.f41594a.g(rVar);
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).Y() ? this.f41595b.i(rVar) : this.f41594a.i(rVar);
        }
        return rVar.P(this);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.b n() {
        return this.f41594a;
    }

    @Override // j$.time.chrono.e
    public final l j() {
        return this.f41595b;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.m m(i iVar) {
        return a0(iVar, this.f41595b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime c(long j10, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) rVar).Y()) {
                return a0(this.f41594a, this.f41595b.c(j10, rVar));
            }
            return a0(this.f41594a.c(j10, rVar), this.f41595b);
        }
        return (LocalDateTime) rVar.V(this, j10);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j10, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return (LocalDateTime) tVar.s(this, j10);
        }
        switch (j.f41754a[((j$.time.temporal.b) tVar).ordinal()]) {
            case 1:
                return Y(this.f41594a, 0L, 0L, 0L, j10);
            case 2:
                LocalDateTime localDateTimeA0 = a0(this.f41594a.f0(j10 / 86400000000L), this.f41595b);
                return localDateTimeA0.Y(localDateTimeA0.f41594a, 0L, 0L, 0L, (j10 % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeA1 = a0(this.f41594a.f0(j10 / com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS), this.f41595b);
                return localDateTimeA1.Y(localDateTimeA1.f41594a, 0L, 0L, 0L, (j10 % com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS) * 1000000);
            case 4:
                return X(j10);
            case 5:
                return Y(this.f41594a, 0L, j10, 0L, 0L);
            case 6:
                return Y(this.f41594a, j10, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeA2 = a0(this.f41594a.f0(j10 / 256), this.f41595b);
                return localDateTimeA2.Y(localDateTimeA2.f41594a, (j10 % 256) * 12, 0L, 0L, 0L);
            default:
                return a0(this.f41594a.d(j10, tVar), this.f41595b);
        }
    }

    public final LocalDateTime X(long j10) {
        return Y(this.f41594a, 0L, 0L, j10, 0L);
    }

    @Override // j$.time.temporal.m
    public final j$.time.chrono.e a(long j10, j$.time.temporal.t tVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j10, tVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j10, j$.time.temporal.t tVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j10, tVar);
    }

    public final LocalDateTime Y(i iVar, long j10, long j11, long j12, long j13) {
        if ((j10 | j11 | j12 | j13) == 0) {
            return a0(iVar, this.f41595b);
        }
        long j14 = 1;
        long j15 = ((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * C.NANOS_PER_SECOND) + (j13 % 86400000000000L);
        long jD0 = this.f41595b.d0();
        long j16 = (j15 * j14) + jD0;
        long jFloorDiv = Math.floorDiv(j16, 86400000000000L) + (((j10 / 24) + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L)) * j14);
        long jFloorMod = Math.floorMod(j16, 86400000000000L);
        return a0(iVar.f0(jFloorDiv), jFloorMod == jD0 ? this.f41595b : l.V(jFloorMod));
    }

    @Override // j$.time.temporal.n
    public final Object b(a0 a0Var) {
        if (a0Var == j$.time.temporal.s.f41807f) {
            return this.f41594a;
        }
        return super.b(a0Var);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.chrono.e, java.lang.Comparable
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return s((LocalDateTime) eVar);
        }
        return super.compareTo(eVar);
    }

    public final int s(LocalDateTime localDateTime) {
        int iS = this.f41594a.s(localDateTime.f41594a);
        return iS == 0 ? this.f41595b.compareTo(localDateTime.f41595b) : iS;
    }

    public final boolean F(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return s((LocalDateTime) eVar) < 0;
        }
        long jK = this.f41594a.K();
        long jK2 = eVar.n().K();
        if (jK >= jK2) {
            return jK == jK2 && this.f41595b.d0() < eVar.j().d0();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f41594a.equals(localDateTime.f41594a) && this.f41595b.equals(localDateTime.f41595b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f41594a.hashCode() ^ this.f41595b.hashCode();
    }

    public final String toString() {
        return this.f41594a.toString() + RequestConfiguration.MAX_AD_CONTENT_RATING_T + this.f41595b.toString();
    }

    private Object writeReplace() {
        return new t((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
