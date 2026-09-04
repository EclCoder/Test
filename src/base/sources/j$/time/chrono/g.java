package j$.time.chrono;

import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements e, j$.time.temporal.m, j$.time.temporal.o, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient b f41622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient j$.time.l f41623b;

    public static g s(l lVar, j$.time.temporal.m mVar) {
        g gVar = (g) mVar;
        if (lVar.equals(gVar.f())) {
            return gVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + lVar.q() + ", actual: " + gVar.f().q());
    }

    public g(b bVar, j$.time.l lVar) {
        Objects.requireNonNull(lVar, "time");
        this.f41622a = bVar;
        this.f41623b = lVar;
    }

    public final g P(j$.time.temporal.m mVar, j$.time.l lVar) {
        b bVar = this.f41622a;
        return (bVar == mVar && this.f41623b == lVar) ? this : new g(d.s(bVar.f(), mVar), lVar);
    }

    public final int hashCode() {
        return this.f41622a.hashCode() ^ this.f41623b.hashCode();
    }

    @Override // j$.time.chrono.e
    public final b n() {
        return this.f41622a;
    }

    public final String toString() {
        return this.f41622a.toString() + RequestConfiguration.MAX_AD_CONTENT_RATING_T + this.f41623b.toString();
    }

    @Override // j$.time.chrono.e
    public final j$.time.l j() {
        return this.f41623b;
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
            return (((j$.time.temporal.a) rVar).Y() ? this.f41623b : this.f41622a).l(rVar);
        }
        return rVar.A(this);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).Y() ? this.f41623b.g(rVar) : this.f41622a.g(rVar);
        }
        return l(rVar).a(i(rVar), rVar);
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).Y() ? this.f41623b.i(rVar) : this.f41622a.i(rVar);
        }
        return rVar.P(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.m m(j$.time.i iVar) {
        return P(iVar, this.f41623b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final g c(long j10, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) rVar).Y()) {
                return P(this.f41622a, this.f41623b.c(j10, rVar));
            }
            return P(this.f41622a.c(j10, rVar), this.f41623b);
        }
        return s(this.f41622a.f(), rVar.V(this, j10));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final g d(long j10, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return s(this.f41622a.f(), tVar.s(this, j10));
        }
        switch (f.f41620a[((j$.time.temporal.b) tVar).ordinal()]) {
            case 1:
                return F(this.f41622a, 0L, 0L, 0L, j10);
            case 2:
                g gVarP = P(this.f41622a.d(j10 / 86400000000L, (j$.time.temporal.t) j$.time.temporal.b.DAYS), this.f41623b);
                return gVarP.F(gVarP.f41622a, 0L, 0L, 0L, (j10 % 86400000000L) * 1000);
            case 3:
                g gVarP2 = P(this.f41622a.d(j10 / com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS, (j$.time.temporal.t) j$.time.temporal.b.DAYS), this.f41623b);
                return gVarP2.F(gVarP2.f41622a, 0L, 0L, 0L, (j10 % com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS) * 1000000);
            case 4:
                return F(this.f41622a, 0L, 0L, j10, 0L);
            case 5:
                return F(this.f41622a, 0L, j10, 0L, 0L);
            case 6:
                return F(this.f41622a, j10, 0L, 0L, 0L);
            case 7:
                g gVarP3 = P(this.f41622a.d(j10 / 256, (j$.time.temporal.t) j$.time.temporal.b.DAYS), this.f41623b);
                return gVarP3.F(gVarP3.f41622a, (j10 % 256) * 12, 0L, 0L, 0L);
            default:
                return P(this.f41622a.d(j10, tVar), this.f41623b);
        }
    }

    public final g F(b bVar, long j10, long j11, long j12, long j13) {
        if ((j10 | j11 | j12 | j13) == 0) {
            return P(bVar, this.f41623b);
        }
        long j14 = j10 / 24;
        long j15 = ((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * C.NANOS_PER_SECOND) + (j13 % 86400000000000L);
        long jD0 = this.f41623b.d0();
        long j16 = j15 + jD0;
        long jFloorDiv = Math.floorDiv(j16, 86400000000000L) + j14 + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L);
        long jFloorMod = Math.floorMod(j16, 86400000000000L);
        return P(bVar.d(jFloorDiv, (j$.time.temporal.t) j$.time.temporal.b.DAYS), jFloorMod == jD0 ? this.f41623b : j$.time.l.V(jFloorMod));
    }

    @Override // j$.time.chrono.e
    public final ChronoZonedDateTime E(j$.time.y yVar) {
        return k.A(yVar, null, this);
    }

    private Object writeReplace() {
        return new e0((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }
}
