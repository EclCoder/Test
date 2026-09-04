package j$.time;

import j$.time.chrono.ChronoZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ZonedDateTime implements j$.time.temporal.m, ChronoZonedDateTime<i>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f41605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f41606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f41607c;

    public static ZonedDateTime A(LocalDateTime localDateTime, y yVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(yVar, "zone");
        if (yVar instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, yVar, (ZoneOffset) yVar);
        }
        j$.time.zone.f fVarA = yVar.A();
        List listF = fVarA.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
                Objects.requireNonNull(zoneOffset, "offset");
            }
        } else {
            Object objE = fVarA.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.X(f.A(bVar.f41832d.f41603b - bVar.f41831c.f41603b, 0).f41673a);
            zoneOffset = bVar.f41832d;
        }
        return new ZonedDateTime(localDateTime, yVar, zoneOffset);
    }

    public static ZonedDateTime s(long j10, int i10, y yVar) {
        ZoneOffset zoneOffsetD = yVar.A().d(Instant.A(j10, i10));
        return new ZonedDateTime(LocalDateTime.P(j10, i10, zoneOffsetD), yVar, zoneOffsetD);
    }

    public static ZonedDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        String string;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        a0 a0Var = new a0(0);
        Objects.requireNonNull(charSequence, "text");
        try {
            return (ZonedDateTime) dateTimeFormatter.b(charSequence).b(a0Var);
        } catch (DateTimeParseException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string + "' could not be parsed: " + e11.getMessage(), e11);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    public ZonedDateTime(LocalDateTime localDateTime, y yVar, ZoneOffset zoneOffset) {
        this.f41605a = localDateTime;
        this.f41606b = zoneOffset;
        this.f41607c = yVar;
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
            if (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) rVar).f41784b;
            }
            return this.f41605a.l(rVar);
        }
        return rVar.A(this);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = b0.f41610a[((j$.time.temporal.a) rVar).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.u("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.f41606b.f41603b;
            }
            return this.f41605a.g(rVar);
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = b0.f41610a[((j$.time.temporal.a) rVar).ordinal()];
            if (i10 == 1) {
                return W();
            }
            if (i10 == 2) {
                return this.f41606b.f41603b;
            }
            return this.f41605a.i(rVar);
        }
        return rVar.P(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset o() {
        return this.f41606b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final y J() {
        return this.f41607c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime D(y yVar) {
        Objects.requireNonNull(yVar, "zone");
        return this.f41607c.equals(yVar) ? this : A(this.f41605a, yVar, this.f41606b);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.e x() {
        return this.f41605a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.b n() {
        return this.f41605a.f41594a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final l j() {
        return this.f41605a.f41595b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime m(i iVar) {
        return A(LocalDateTime.I(iVar, this.f41605a.f41595b), this.f41607c, this.f41606b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime c(long j10, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i10 = b0.f41610a[aVar.ordinal()];
            if (i10 == 1) {
                return s(j10, this.f41605a.f41595b.f41764d, this.f41607c);
            }
            if (i10 != 2) {
                return A(this.f41605a.c(j10, rVar), this.f41607c, this.f41606b);
            }
            ZoneOffset zoneOffsetZ = ZoneOffset.Z(aVar.f41784b.a(j10, aVar));
            return (zoneOffsetZ.equals(this.f41606b) || !this.f41607c.A().f(this.f41605a).contains(zoneOffsetZ)) ? this : new ZonedDateTime(this.f41605a, this.f41607c, zoneOffsetZ);
        }
        return (ZonedDateTime) rVar.V(this, j10);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime d(long j10, j$.time.temporal.t tVar) {
        if (tVar instanceof j$.time.temporal.b) {
            j$.time.temporal.b bVar = (j$.time.temporal.b) tVar;
            if (bVar.compareTo(j$.time.temporal.b.DAYS) >= 0 && bVar != j$.time.temporal.b.FOREVER) {
                return A(this.f41605a.d(j10, tVar), this.f41607c, this.f41606b);
            }
            LocalDateTime localDateTimeD = this.f41605a.d(j10, tVar);
            ZoneOffset zoneOffset = this.f41606b;
            y yVar = this.f41607c;
            Objects.requireNonNull(localDateTimeD, "localDateTime");
            Objects.requireNonNull(zoneOffset, "offset");
            Objects.requireNonNull(yVar, "zone");
            if (yVar.A().f(localDateTimeD).contains(zoneOffset)) {
                return new ZonedDateTime(localDateTimeD, yVar, zoneOffset);
            }
            return s(localDateTimeD.w(zoneOffset), localDateTimeD.f41595b.f41764d, yVar);
        }
        return (ZonedDateTime) tVar.s(this, j10);
    }

    @Override // j$.time.temporal.m
    public final ChronoZonedDateTime a(long j10, j$.time.temporal.t tVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j10, tVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j10, j$.time.temporal.t tVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j10, tVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(a0 a0Var) {
        if (a0Var == j$.time.temporal.s.f41807f) {
            return this.f41605a.f41594a;
        }
        return super.b(a0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.f41605a.equals(zonedDateTime.f41605a) && this.f41606b.equals(zonedDateTime.f41606b) && this.f41607c.equals(zonedDateTime.f41607c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f41605a.hashCode() ^ this.f41606b.f41603b) ^ Integer.rotateLeft(this.f41607c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f41605a.toString() + this.f41606b.f41604c;
        ZoneOffset zoneOffset = this.f41606b;
        y yVar = this.f41607c;
        if (zoneOffset == yVar) {
            return str;
        }
        return str + "[" + yVar.toString() + "]";
    }

    private Object writeReplace() {
        return new t((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
