package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient g f41635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient ZoneOffset f41636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient j$.time.y f41637c;

    public static k A(j$.time.y yVar, ZoneOffset zoneOffset, g gVar) {
        Objects.requireNonNull(gVar, "localDateTime");
        Objects.requireNonNull(yVar, "zone");
        if (yVar instanceof ZoneOffset) {
            return new k(yVar, (ZoneOffset) yVar, gVar);
        }
        j$.time.zone.f fVarA = yVar.A();
        LocalDateTime localDateTimeA = LocalDateTime.A(gVar);
        List listF = fVarA.f(localDateTimeA);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            gVar = gVar;
        } else {
            Object objE = fVarA.e(localDateTimeA);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            gVar = gVar.F(gVar.f41622a, 0L, 0L, j$.time.f.A(bVar.f41832d.f41603b - bVar.f41831c.f41603b, 0).f41673a, 0L);
            zoneOffset = bVar.f41832d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new k(yVar, zoneOffset, gVar);
    }

    public static k F(l lVar, Instant instant, j$.time.y yVar) {
        ZoneOffset zoneOffsetD = yVar.A().d(instant);
        Objects.requireNonNull(zoneOffsetD, "offset");
        return new k(yVar, zoneOffsetD, (g) lVar.H(LocalDateTime.P(instant.f41590a, instant.f41591b, zoneOffsetD)));
    }

    public static k s(l lVar, j$.time.temporal.m mVar) {
        k kVar = (k) mVar;
        if (lVar.equals(kVar.f())) {
            return kVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + lVar.q() + ", actual: " + kVar.f().q());
    }

    public k(j$.time.y yVar, ZoneOffset zoneOffset, g gVar) {
        Objects.requireNonNull(gVar, "dateTime");
        this.f41635a = gVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f41636b = zoneOffset;
        Objects.requireNonNull(yVar, "zone");
        this.f41637c = yVar;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset o() {
        return this.f41636b;
    }

    public final int hashCode() {
        return (this.f41635a.hashCode() ^ this.f41636b.f41603b) ^ Integer.rotateLeft(this.f41637c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f41635a.toString() + this.f41636b.f41604c;
        ZoneOffset zoneOffset = this.f41636b;
        j$.time.y yVar = this.f41637c;
        if (zoneOffset == yVar) {
            return str;
        }
        return str + "[" + yVar.toString() + "]";
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final e x() {
        return this.f41635a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.y J() {
        return this.f41637c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime D(j$.time.y yVar) {
        return A(yVar, this.f41636b, this.f41635a);
    }

    @Override // j$.time.temporal.n
    public final boolean h(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return true;
        }
        return rVar != null && rVar.s(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.m
    public final ChronoZonedDateTime c(long j10, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i10 = j.f41633a[aVar.ordinal()];
            if (i10 == 1) {
                return d(j10 - W(), (j$.time.temporal.t) j$.time.temporal.b.SECONDS);
            }
            if (i10 == 2) {
                ZoneOffset zoneOffsetZ = ZoneOffset.Z(aVar.f41784b.a(j10, aVar));
                g gVar = this.f41635a;
                return F(f(), Instant.A(gVar.w(zoneOffsetZ), gVar.f41623b.f41764d), this.f41637c);
            }
            return A(this.f41637c, this.f41636b, this.f41635a.c(j10, rVar));
        }
        return s(f(), rVar.V(this, j10));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.m
    public final ChronoZonedDateTime d(long j10, j$.time.temporal.t tVar) {
        if (tVar instanceof j$.time.temporal.b) {
            return m(this.f41635a.d(j10, tVar));
        }
        return s(f(), tVar.s(this, j10));
    }

    private Object writeReplace() {
        return new e0((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && compareTo((ChronoZonedDateTime) obj) == 0;
    }
}
