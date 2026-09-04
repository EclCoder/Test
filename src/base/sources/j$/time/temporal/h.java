package j$.time.temporal;

import j$.time.format.w;
import java.util.Map;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements r {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f41788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h[] f41789b;

    @Override // j$.time.temporal.r
    public final boolean isDateBased() {
        return true;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f41789b.clone();
    }

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.r
            public final v I() {
                return v.g(90L, 92L);
            }

            @Override // j$.time.temporal.r
            public final boolean s(n nVar) {
                if (!nVar.h(a.DAY_OF_YEAR) || !nVar.h(a.MONTH_OF_YEAR) || !nVar.h(a.YEAR)) {
                    return false;
                }
                h hVar2 = j.f41792a;
                return j$.time.chrono.l.r(nVar).equals(j$.time.chrono.s.f41655c);
            }

            @Override // j$.time.temporal.r
            public final v A(n nVar) {
                if (!s(nVar)) {
                    throw new u("Unsupported field: DayOfQuarter");
                }
                long jI = nVar.i(h.QUARTER_OF_YEAR);
                if (jI == 1) {
                    long jI2 = nVar.i(a.YEAR);
                    j$.time.chrono.s.f41655c.getClass();
                    return j$.time.chrono.s.X(jI2) ? v.f(1L, 91L) : v.f(1L, 90L);
                }
                if (jI == 2) {
                    return v.f(1L, 91L);
                }
                if (jI == 3 || jI == 4) {
                    return v.f(1L, 92L);
                }
                return I();
            }

            @Override // j$.time.temporal.r
            public final long P(n nVar) {
                if (!s(nVar)) {
                    throw new u("Unsupported field: DayOfQuarter");
                }
                int iG = nVar.g(a.DAY_OF_YEAR);
                int iG2 = nVar.g(a.MONTH_OF_YEAR);
                long jI = nVar.i(a.YEAR);
                int i10 = (iG2 - 1) / 3;
                j$.time.chrono.s.f41655c.getClass();
                return iG - h.f41788a[i10 + (j$.time.chrono.s.X(jI) ? 4 : 0)];
            }

            @Override // j$.time.temporal.r
            public final m V(m mVar, long j10) {
                long jP = P(mVar);
                I().b(j10, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.c((j10 - jP) + mVar.i(aVar), aVar);
            }

            @Override // j$.time.temporal.r
            public final n F(Map map, j$.time.format.v vVar, w wVar) {
                long jSubtractExact;
                j$.time.i iVarG0;
                a aVar = a.YEAR;
                Long l10 = (Long) map.get(aVar);
                r rVar = h.QUARTER_OF_YEAR;
                Long l11 = (Long) map.get(rVar);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int iA = aVar.f41784b.a(l10.longValue(), aVar);
                long jLongValue = ((Long) map.get(h.DAY_OF_QUARTER)).longValue();
                h hVar2 = j.f41792a;
                if (!j$.time.chrono.l.r(vVar).equals(j$.time.chrono.s.f41655c)) {
                    throw new j$.time.c("Resolve requires IsoChronology");
                }
                if (wVar == w.LENIENT) {
                    iVarG0 = j$.time.i.b0(iA, 1, 1).g0(Math.multiplyExact(Math.subtractExact(l11.longValue(), 1L), 3));
                    jSubtractExact = Math.subtractExact(jLongValue, 1L);
                } else {
                    j$.time.i iVarB0 = j$.time.i.b0(iA, ((rVar.I().a(l11.longValue(), rVar) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (wVar == w.STRICT) {
                            A(iVarB0).b(jLongValue, this);
                        } else {
                            I().b(jLongValue, this);
                        }
                    }
                    jSubtractExact = jLongValue - 1;
                    iVarG0 = iVarB0;
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(rVar);
                return iVarG0.f0(jSubtractExact);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.r
            public final v I() {
                return v.f(1L, 4L);
            }

            @Override // j$.time.temporal.r
            public final boolean s(n nVar) {
                if (!nVar.h(a.MONTH_OF_YEAR)) {
                    return false;
                }
                h hVar3 = j.f41792a;
                return j$.time.chrono.l.r(nVar).equals(j$.time.chrono.s.f41655c);
            }

            @Override // j$.time.temporal.r
            public final long P(n nVar) {
                if (!s(nVar)) {
                    throw new u("Unsupported field: QuarterOfYear");
                }
                return (nVar.i(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.r
            public final v A(n nVar) {
                if (!s(nVar)) {
                    throw new u("Unsupported field: QuarterOfYear");
                }
                return I();
            }

            @Override // j$.time.temporal.r
            public final m V(m mVar, long j10) {
                long jP = P(mVar);
                I().b(j10, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.c(((j10 - jP) * 3) + mVar.i(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.r
            public final v I() {
                return v.g(52L, 53L);
            }

            @Override // j$.time.temporal.r
            public final boolean s(n nVar) {
                if (!nVar.h(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar4 = j.f41792a;
                return j$.time.chrono.l.r(nVar).equals(j$.time.chrono.s.f41655c);
            }

            @Override // j$.time.temporal.r
            public final v A(n nVar) {
                if (s(nVar)) {
                    return h.a0(j$.time.i.F(nVar));
                }
                throw new u("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.r
            public final long P(n nVar) {
                if (!s(nVar)) {
                    throw new u("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.X(j$.time.i.F(nVar));
            }

            @Override // j$.time.temporal.r
            public final m V(m mVar, long j10) {
                I().b(j10, this);
                return mVar.d(Math.subtractExact(j10, P(mVar)), b.WEEKS);
            }

            @Override // j$.time.temporal.r
            public final n F(Map map, j$.time.format.v vVar, w wVar) {
                j$.time.i iVarC;
                long j10;
                long j11;
                r rVar = h.WEEK_BASED_YEAR;
                Long l10 = (Long) map.get(rVar);
                a aVar = a.DAY_OF_WEEK;
                Long l11 = (Long) map.get(aVar);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int iA = rVar.I().a(l10.longValue(), rVar);
                long jLongValue = ((Long) map.get(h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                h hVar4 = j.f41792a;
                if (!j$.time.chrono.l.r(vVar).equals(j$.time.chrono.s.f41655c)) {
                    throw new j$.time.c("Resolve requires IsoChronology");
                }
                j$.time.i iVarB0 = j$.time.i.b0(iA, 1, 4);
                if (wVar == w.LENIENT) {
                    long jLongValue2 = l11.longValue();
                    if (jLongValue2 > 7) {
                        long j12 = jLongValue2 - 1;
                        j10 = 1;
                        iVarB0 = iVarB0.h0(j12 / 7);
                        j11 = j12 % 7;
                    } else {
                        j10 = 1;
                        if (jLongValue2 < 1) {
                            iVarB0 = iVarB0.h0(Math.subtractExact(jLongValue2, 7L) / 7);
                            j11 = (jLongValue2 + 6) % 7;
                        }
                        iVarC = iVarB0.h0(Math.subtractExact(jLongValue, j10)).c(jLongValue2, aVar);
                    }
                    jLongValue2 = j11 + j10;
                    iVarC = iVarB0.h0(Math.subtractExact(jLongValue, j10)).c(jLongValue2, aVar);
                } else {
                    int iA2 = aVar.f41784b.a(l11.longValue(), aVar);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (wVar == w.STRICT) {
                            h.a0(iVarB0).b(jLongValue, this);
                        } else {
                            I().b(jLongValue, this);
                        }
                    }
                    iVarC = iVarB0.h0(jLongValue - 1).c(iA2, aVar);
                }
                map.remove(this);
                map.remove(rVar);
                map.remove(aVar);
                return iVarC;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.r
            public final v I() {
                return a.YEAR.f41784b;
            }

            @Override // j$.time.temporal.r
            public final boolean s(n nVar) {
                if (!nVar.h(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar5 = j.f41792a;
                return j$.time.chrono.l.r(nVar).equals(j$.time.chrono.s.f41655c);
            }

            @Override // j$.time.temporal.r
            public final long P(n nVar) {
                if (s(nVar)) {
                    return h.Y(j$.time.i.F(nVar));
                }
                throw new u("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.r
            public final v A(n nVar) {
                if (!s(nVar)) {
                    throw new u("Unsupported field: WeekBasedYear");
                }
                return I();
            }

            @Override // j$.time.temporal.r
            public final m V(m mVar, long j10) {
                if (!s(mVar)) {
                    throw new u("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.f41784b.a(j10, h.WEEK_BASED_YEAR);
                j$.time.i iVarF = j$.time.i.F(mVar);
                a aVar = a.DAY_OF_WEEK;
                int iG = iVarF.g(aVar);
                int iX = h.X(iVarF);
                if (iX == 53 && h.Z(iA) == 52) {
                    iX = 52;
                }
                j$.time.i iVarB0 = j$.time.i.b0(iA, 1, 4);
                return mVar.m(iVarB0.f0(((iX - 1) * 7) + (iG - iVarB0.g(aVar))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        f41789b = new h[]{hVar, hVar2, hVar3, hVar4};
        f41788a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static v a0(j$.time.i iVar) {
        return v.f(1L, Z(Y(iVar)));
    }

    public static int Z(int i10) {
        j$.time.i iVarB0 = j$.time.i.b0(i10, 1, 1);
        if (iVarB0.P() != j$.time.e.THURSDAY) {
            return (iVarB0.P() == j$.time.e.WEDNESDAY && iVarB0.Y()) ? 53 : 52;
        }
        return 53;
    }

    public static int X(j$.time.i iVar) {
        int iOrdinal = iVar.P().ordinal();
        int iV = iVar.V() - 1;
        int i10 = (3 - iOrdinal) + iV;
        int i11 = i10 - ((i10 / 7) * 7);
        int i12 = i11 - 3;
        if (i12 < -3) {
            i12 = i11 + 4;
        }
        if (iV >= i12) {
            int i13 = ((iV - i12) / 7) + 1;
            if (i13 != 53 || i12 == -3 || (i12 == -2 && iVar.Y())) {
                return i13;
            }
            return 1;
        }
        if (iVar.V() != 180) {
            iVar = j$.time.i.d0(iVar.f41751a, 180);
        }
        return (int) a0(iVar.i0(-1L)).f41812d;
    }

    public static int Y(j$.time.i iVar) {
        int i10 = iVar.f41751a;
        int iV = iVar.V();
        if (iV <= 3) {
            return iV - iVar.P().ordinal() < -2 ? i10 - 1 : i10;
        }
        if (iV >= 363) {
            return ((iV - 363) - (iVar.Y() ? 1 : 0)) - iVar.P().ordinal() >= 0 ? i10 + 1 : i10;
        }
        return i10;
    }
}
