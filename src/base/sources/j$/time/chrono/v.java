package j$.time.chrono;

import j$.time.Instant;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f41658c = new v();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.l
    public final String q() {
        return "Japanese";
    }

    @Override // j$.time.chrono.l
    public final String u() {
        return "japanese";
    }

    @Override // j$.time.chrono.l
    public final b Q(int i10, int i11, int i12) {
        return new x(j$.time.i.b0(i10, i11, i12));
    }

    @Override // j$.time.chrono.l
    public final b v(int i10, int i11) {
        return new x(j$.time.i.d0(i10, i11));
    }

    @Override // j$.time.chrono.l
    public final b p(long j10) {
        return new x(j$.time.i.c0(j10));
    }

    @Override // j$.time.chrono.l
    public final b M() {
        return new x(j$.time.i.F(j$.time.i.a0(j$.time.b.b())));
    }

    @Override // j$.time.chrono.l
    public final b G(j$.time.temporal.n nVar) {
        if (nVar instanceof x) {
            return (x) nVar;
        }
        return new x(j$.time.i.F(nVar));
    }

    @Override // j$.time.chrono.l
    public final List z() {
        y[] yVarArr = y.f41665e;
        return j$.time.b.a((y[]) Arrays.copyOf(yVarArr, yVarArr.length));
    }

    private v() {
    }

    @Override // j$.time.chrono.l
    public final int C(m mVar, int i10) {
        if (!(mVar instanceof y)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i11 = ((y) mVar).f41667b.f41751a;
        int i12 = (i11 + i10) - 1;
        if (i10 != 1 && (i12 < -999999999 || i12 > 999999999 || i12 < i11 || mVar != y.p(j$.time.i.b0(i12, 1, 1)))) {
            throw new j$.time.c("Invalid yearOfEra value");
        }
        return i12;
    }

    @Override // j$.time.chrono.l
    public final m B(int i10) {
        return y.r(i10);
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.v y(j$.time.temporal.a aVar) {
        switch (u.f41657a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.u("Unsupported field: " + aVar);
            case 5:
                y[] yVarArr = y.f41665e;
                int i10 = yVarArr[yVarArr.length - 1].f41667b.f41751a;
                int iMin = 1000000000 - yVarArr[yVarArr.length - 1].f41667b.f41751a;
                int i11 = yVarArr[0].f41667b.f41751a;
                int i12 = 1;
                while (true) {
                    y[] yVarArr2 = y.f41665e;
                    if (i12 >= yVarArr2.length) {
                        return j$.time.temporal.v.g(iMin, 999999999 - i10);
                    }
                    y yVar = yVarArr2[i12];
                    iMin = Math.min(iMin, (yVar.f41667b.f41751a - i11) + 1);
                    i11 = yVar.f41667b.f41751a;
                    i12++;
                }
                break;
            case 6:
                y yVar2 = y.f41664d;
                long jMin = j$.time.temporal.a.DAY_OF_YEAR.f41784b.f41811c;
                for (y yVar3 : y.f41665e) {
                    jMin = Math.min(jMin, ((yVar3.f41667b.Y() ? 366 : 365) - yVar3.f41667b.V()) + 1);
                    if (yVar3.q() != null) {
                        jMin = Math.min(jMin, yVar3.q().f41667b.V() - 1);
                    }
                }
                return j$.time.temporal.v.g(jMin, j$.time.temporal.a.DAY_OF_YEAR.f41784b.f41812d);
            case 7:
                return j$.time.temporal.v.f(x.f41660d.f41751a, 999999999L);
            case 8:
                long j10 = y.f41664d.f41666a;
                y[] yVarArr3 = y.f41665e;
                return j$.time.temporal.v.f(j10, yVarArr3[yVarArr3.length - 1].f41666a);
            default:
                return aVar.f41784b;
        }
    }

    @Override // j$.time.chrono.a, j$.time.chrono.l
    public final b S(Map map, j$.time.format.w wVar) {
        return (x) super.S(map, wVar);
    }

    @Override // j$.time.chrono.a
    public final b V(Map map, j$.time.format.w wVar) {
        j$.time.i iVarD0;
        x xVarY;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l10 = (Long) map.get(aVar);
        y yVarR = l10 != null ? y.r(y(aVar).a(l10.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l11 = (Long) map.get(aVar2);
        int iA = l11 != null ? y(aVar2).a(l11.longValue(), aVar2) : 0;
        if (yVarR == null && l11 != null && !map.containsKey(j$.time.temporal.a.YEAR) && wVar != j$.time.format.w.STRICT) {
            y[] yVarArr = y.f41665e;
            yVarR = ((y[]) Arrays.copyOf(yVarArr, yVarArr.length))[((y[]) Arrays.copyOf(yVarArr, yVarArr.length)).length - 1];
        }
        if (l11 != null && yVarR != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (wVar == j$.time.format.w.LENIENT) {
                        return new x(j$.time.i.b0((yVarR.f41667b.f41751a + iA) - 1, 1, 1)).P(Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), j$.time.temporal.b.MONTHS).P(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), j$.time.temporal.b.DAYS);
                    }
                    int iA2 = y(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = y(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (wVar != j$.time.format.w.SMART) {
                        j$.time.i iVar = x.f41660d;
                        j$.time.i iVarB0 = j$.time.i.b0((yVarR.f41667b.f41751a + iA) - 1, iA2, iA3);
                        if (iVarB0.X(yVarR.f41667b) || yVarR != y.p(iVarB0)) {
                            throw new j$.time.c("year, month, and day not valid for Era");
                        }
                        return new x(yVarR, iA, iVarB0);
                    }
                    if (iA < 1) {
                        throw new j$.time.c("Invalid YearOfEra: " + iA);
                    }
                    int i10 = (yVarR.f41667b.f41751a + iA) - 1;
                    try {
                        xVarY = new x(j$.time.i.b0(i10, iA2, iA3));
                    } catch (j$.time.c unused) {
                        xVarY = new x(j$.time.i.b0(i10, iA2, 1)).Y(new j$.time.a0(2));
                    }
                    if (xVarY.f41662b == yVarR || xVarY.g(j$.time.temporal.a.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return xVarY;
                    }
                    throw new j$.time.c("Invalid YearOfEra for Era: " + yVarR + " " + iA);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (wVar == j$.time.format.w.LENIENT) {
                    return new x(j$.time.i.d0((yVarR.f41667b.f41751a + iA) - 1, 1)).P(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), j$.time.temporal.b.DAYS);
                }
                int iA4 = y(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                j$.time.i iVar2 = x.f41660d;
                if (iA == 1) {
                    j$.time.i iVar3 = yVarR.f41667b;
                    iVarD0 = j$.time.i.d0(iVar3.f41751a, (iVar3.V() + iA4) - 1);
                } else {
                    iVarD0 = j$.time.i.d0((yVarR.f41667b.f41751a + iA) - 1, iA4);
                }
                if (iVarD0.X(yVarR.f41667b) || yVarR != y.p(iVarD0)) {
                    throw new j$.time.c("Invalid parameters");
                }
                return new x(yVarR, iA, iVarD0);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.l
    public final ChronoZonedDateTime T(Instant instant, j$.time.y yVar) {
        return k.F(this, instant, yVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }
}
