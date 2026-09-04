package j$.time.chrono;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f41611a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f41612b = new ConcurrentHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return q().compareTo(((l) obj).q());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static l A(l lVar, String str) {
        String strU;
        l lVar2 = (l) f41611a.putIfAbsent(str, lVar);
        if (lVar2 == null && (strU = lVar.u()) != null) {
            f41612b.putIfAbsent(strU, lVar);
        }
        return lVar2;
    }

    @Override // j$.time.chrono.l
    public b S(Map map, j$.time.format.w wVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return p(((Long) map.remove(aVar)).longValue());
        }
        I(map, wVar);
        b bVarV = V(map, wVar);
        if (bVarV != null) {
            return bVarV;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar3)) {
            if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return P(map, wVar);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(aVar5)) {
                    int iA = y(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (wVar == j$.time.format.w.LENIENT) {
                        long jSubtractExact = Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L);
                        return Q(iA, 1, 1).d(jSubtractExact, (j$.time.temporal.t) j$.time.temporal.b.MONTHS).d(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.WEEKS).d(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
                    }
                    int iA2 = y(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    b bVarD = Q(iA, iA2, 1).d((y(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((y(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
                    if (wVar != j$.time.format.w.STRICT || bVarD.g(aVar3) == iA2) {
                        return bVarD;
                    }
                    throw new j$.time.c("Strict mode rejected resolved date as it is in a different month");
                }
                j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar6)) {
                    int iA3 = y(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (wVar == j$.time.format.w.LENIENT) {
                        return F(Q(iA3, 1, 1), Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar6)).longValue(), 1L));
                    }
                    int iA4 = y(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    b bVarM = Q(iA3, iA4, 1).d((y(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (j$.time.temporal.t) j$.time.temporal.b.DAYS).m(new j$.time.temporal.p(j$.time.e.s(y(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                    if (wVar != j$.time.format.w.STRICT || bVarM.g(aVar3) == iA4) {
                        return bVarM;
                    }
                    throw new j$.time.c("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (map.containsKey(aVar7)) {
            int iA5 = y(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (wVar != j$.time.format.w.LENIENT) {
                return v(iA5, y(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
            }
            return v(iA5, 1).d(Math.subtractExact(((Long) map.remove(aVar7)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(aVar8)) {
            return null;
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(aVar9)) {
            int iA6 = y(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (wVar == j$.time.format.w.LENIENT) {
                return v(iA6, 1).d(Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.WEEKS).d(Math.subtractExact(((Long) map.remove(aVar9)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
            }
            b bVarD2 = v(iA6, 1).d((y(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((y(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
            if (wVar != j$.time.format.w.STRICT || bVarD2.g(aVar2) == iA6) {
                return bVarD2;
            }
            throw new j$.time.c("Strict mode rejected resolved date as it is in a different year");
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar10)) {
            return null;
        }
        int iA7 = y(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        if (wVar == j$.time.format.w.LENIENT) {
            return F(v(iA7, 1), 0L, Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar10)).longValue(), 1L));
        }
        b bVarM2 = v(iA7, 1).d((y(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (j$.time.temporal.t) j$.time.temporal.b.DAYS).m(new j$.time.temporal.p(j$.time.e.s(y(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
        if (wVar != j$.time.format.w.STRICT || bVarM2.g(aVar2) == iA7) {
            return bVarM2;
        }
        throw new j$.time.c("Strict mode rejected resolved date as it is in a different year");
    }

    public void I(Map map, j$.time.format.w wVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l10 = (Long) map.remove(aVar);
        if (l10 != null) {
            if (wVar != j$.time.format.w.LENIENT) {
                aVar.X(l10.longValue());
            }
            b bVarC = M().c(1L, (j$.time.temporal.r) j$.time.temporal.a.DAY_OF_MONTH).c(l10.longValue(), (j$.time.temporal.r) aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            s(map, aVar2, bVarC.g(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            s(map, aVar3, bVarC.g(aVar3));
        }
    }

    public b V(Map map, j$.time.format.w wVar) {
        int intExact;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l10 = (Long) map.remove(aVar);
        if (l10 != null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            Long l11 = (Long) map.remove(aVar2);
            if (wVar != j$.time.format.w.LENIENT) {
                intExact = y(aVar).a(l10.longValue(), aVar);
            } else {
                intExact = Math.toIntExact(l10.longValue());
            }
            if (l11 != null) {
                s(map, j$.time.temporal.a.YEAR, C(B(y(aVar2).a(l11.longValue(), aVar2)), intExact));
                return null;
            }
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            if (map.containsKey(aVar3)) {
                s(map, aVar3, C(v(y(aVar3).a(((Long) map.get(aVar3)).longValue(), aVar3), 1).N(), intExact));
                return null;
            }
            if (wVar == j$.time.format.w.STRICT) {
                map.put(aVar, l10);
                return null;
            }
            List listZ = z();
            if (listZ.isEmpty()) {
                s(map, aVar3, intExact);
                return null;
            }
            s(map, aVar3, C((m) listZ.get(listZ.size() - 1), intExact));
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar4)) {
            return null;
        }
        y(aVar4).b(((Long) map.get(aVar4)).longValue(), aVar4);
        return null;
    }

    public b P(Map map, j$.time.format.w wVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = y(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (wVar == j$.time.format.w.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return Q(iA, 1, 1).d(jSubtractExact, (j$.time.temporal.t) j$.time.temporal.b.MONTHS).d(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = y(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = y(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (wVar != j$.time.format.w.SMART) {
            return Q(iA, iA2, iA3);
        }
        try {
            return Q(iA, iA2, iA3);
        } catch (j$.time.c unused) {
            return Q(iA, iA2, 1).m(new j$.time.a0(2));
        }
    }

    public static b F(b bVar, long j10, long j11, long j12) {
        long j13;
        b bVarD = bVar.d(j10, (j$.time.temporal.t) j$.time.temporal.b.MONTHS);
        j$.time.temporal.b bVar2 = j$.time.temporal.b.WEEKS;
        b bVarD2 = bVarD.d(j11, (j$.time.temporal.t) bVar2);
        if (j12 > 7) {
            long j14 = j12 - 1;
            bVarD2 = bVarD2.d(j14 / 7, (j$.time.temporal.t) bVar2);
            j13 = j14 % 7;
        } else {
            if (j12 < 1) {
                bVarD2 = bVarD2.d(Math.subtractExact(j12, 7L) / 7, (j$.time.temporal.t) bVar2);
                j13 = (j12 + 6) % 7;
            }
            return bVarD2.m(new j$.time.temporal.p(j$.time.e.s((int) j12).getValue(), 0));
        }
        j12 = j13 + 1;
        return bVarD2.m(new j$.time.temporal.p(j$.time.e.s((int) j12).getValue(), 0));
    }

    public static void s(Map map, j$.time.temporal.a aVar, long j10) {
        Long l10 = (Long) map.get(aVar);
        if (l10 != null && l10.longValue() != j10) {
            throw new j$.time.c("Conflict found: " + aVar + " " + l10 + " differs from " + aVar + " " + j10);
        }
        map.put(aVar, Long.valueOf(j10));
    }

    @Override // j$.time.chrono.l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && q().compareTo(((a) obj).q()) == 0;
    }

    @Override // j$.time.chrono.l
    public final int hashCode() {
        return getClass().hashCode() ^ q().hashCode();
    }

    @Override // j$.time.chrono.l
    public final String toString() {
        return q();
    }
}
