package j$.time.format;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.a0;
import j$.time.chrono.ChronoZonedDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements j$.time.temporal.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j$.time.y f41735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j$.time.chrono.l f41736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f41738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j$.time.chrono.b f41739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j$.time.l f41740g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f41734a = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j$.time.s f41741h = j$.time.s.f41776d;

    @Override // j$.time.temporal.n
    public final boolean h(j$.time.temporal.r rVar) {
        if (((HashMap) this.f41734a).containsKey(rVar)) {
            return true;
        }
        j$.time.chrono.b bVar = this.f41739f;
        if (bVar != null && bVar.h(rVar)) {
            return true;
        }
        j$.time.l lVar = this.f41740g;
        if (lVar == null || !lVar.h(rVar)) {
            return (rVar == null || (rVar instanceof j$.time.temporal.a) || !rVar.s(this)) ? false : true;
        }
        return true;
    }

    @Override // j$.time.temporal.n
    public final long i(j$.time.temporal.r rVar) {
        Objects.requireNonNull(rVar, "field");
        Long l10 = (Long) ((HashMap) this.f41734a).get(rVar);
        if (l10 != null) {
            return l10.longValue();
        }
        j$.time.chrono.b bVar = this.f41739f;
        if (bVar != null && bVar.h(rVar)) {
            return this.f41739f.i(rVar);
        }
        j$.time.l lVar = this.f41740g;
        if (lVar != null && lVar.h(rVar)) {
            return this.f41740g.i(rVar);
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.u(j$.time.d.a("Unsupported field: ", rVar));
        }
        return rVar.P(this);
    }

    @Override // j$.time.temporal.n
    public final Object b(a0 a0Var) {
        if (a0Var == j$.time.temporal.s.f41802a) {
            return this.f41735b;
        }
        if (a0Var == j$.time.temporal.s.f41803b) {
            return this.f41736c;
        }
        if (a0Var == j$.time.temporal.s.f41807f) {
            j$.time.chrono.b bVar = this.f41739f;
            if (bVar != null) {
                return j$.time.i.F(bVar);
            }
            return null;
        }
        if (a0Var == j$.time.temporal.s.f41808g) {
            return this.f41740g;
        }
        if (a0Var == j$.time.temporal.s.f41805d) {
            Long l10 = (Long) ((HashMap) this.f41734a).get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l10 != null) {
                return ZoneOffset.Z(l10.intValue());
            }
            j$.time.y yVar = this.f41735b;
            return yVar instanceof ZoneOffset ? yVar : a0Var.k(this);
        }
        if (a0Var == j$.time.temporal.s.f41806e) {
            return a0Var.k(this);
        }
        if (a0Var == j$.time.temporal.s.f41804c) {
            return null;
        }
        return a0Var.k(this);
    }

    public final void z(j$.time.temporal.r rVar, j$.time.temporal.a aVar, Long l10) {
        Long l11 = (Long) ((HashMap) this.f41734a).put(aVar, l10);
        if (l11 == null || l11.longValue() == l10.longValue()) {
            return;
        }
        throw new j$.time.c("Conflict found: " + aVar + " " + l11 + " differs from " + aVar + " " + l10 + " while resolving  " + rVar);
    }

    public final void q() {
        if (((HashMap) this.f41734a).containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            j$.time.y yVar = this.f41735b;
            if (yVar != null) {
                r(yVar);
                return;
            }
            Long l10 = (Long) ((HashMap) this.f41734a).get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l10 != null) {
                r(ZoneOffset.Z(l10.intValue()));
            }
        }
    }

    public final void r(j$.time.y yVar) {
        Map map = this.f41734a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        ChronoZonedDateTime chronoZonedDateTimeT = this.f41736c.T(Instant.s(((Long) ((HashMap) map).remove(aVar)).longValue(), 0), yVar);
        y(chronoZonedDateTimeT.n());
        z(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(chronoZonedDateTimeT.j().e0()));
    }

    public final void y(j$.time.chrono.b bVar) {
        j$.time.chrono.b bVar2 = this.f41739f;
        if (bVar2 != null) {
            if (bVar == null || bVar2.equals(bVar)) {
                return;
            }
            throw new j$.time.c("Conflict found: Fields resolved to two different dates: " + this.f41739f + " " + bVar);
        }
        if (bVar != null) {
            if (!this.f41736c.equals(bVar.f())) {
                throw new j$.time.c("ChronoLocalDate must use the effective parsed chronology: " + this.f41736c);
            }
            this.f41739f = bVar;
        }
    }

    public final void u() {
        Map map = this.f41734a;
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(aVar)) {
            long jLongValue = ((Long) ((HashMap) this.f41734a).remove(aVar)).longValue();
            w wVar = this.f41738e;
            if (wVar == w.STRICT || (wVar == w.SMART && jLongValue != 0)) {
                aVar.X(jLongValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            z(aVar, aVar2, Long.valueOf(jLongValue));
        }
        Map map2 = this.f41734a;
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(aVar3)) {
            long jLongValue2 = ((Long) ((HashMap) this.f41734a).remove(aVar3)).longValue();
            w wVar2 = this.f41738e;
            if (wVar2 == w.STRICT || (wVar2 == w.SMART && jLongValue2 != 0)) {
                aVar3.X(jLongValue2);
            }
            z(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        Map map3 = this.f41734a;
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(aVar4)) {
            Map map4 = this.f41734a;
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(aVar5)) {
                long jLongValue3 = ((Long) ((HashMap) this.f41734a).remove(aVar4)).longValue();
                long jLongValue4 = ((Long) ((HashMap) this.f41734a).remove(aVar5)).longValue();
                if (this.f41738e == w.LENIENT) {
                    z(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(jLongValue3, 12), jLongValue4)));
                } else {
                    aVar4.X(jLongValue3);
                    aVar5.X(jLongValue3);
                    z(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        Map map5 = this.f41734a;
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(aVar6)) {
            long jLongValue5 = ((Long) ((HashMap) this.f41734a).remove(aVar6)).longValue();
            if (this.f41738e != w.LENIENT) {
                aVar6.X(jLongValue5);
            }
            z(aVar6, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            z(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            z(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / C.NANOS_PER_SECOND) % 60));
            z(aVar6, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue5 % C.NANOS_PER_SECOND));
        }
        Map map6 = this.f41734a;
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(aVar7)) {
            long jLongValue6 = ((Long) ((HashMap) this.f41734a).remove(aVar7)).longValue();
            if (this.f41738e != w.LENIENT) {
                aVar7.X(jLongValue6);
            }
            z(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            z(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        Map map7 = this.f41734a;
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(aVar8)) {
            long jLongValue7 = ((Long) ((HashMap) this.f41734a).remove(aVar8)).longValue();
            if (this.f41738e != w.LENIENT) {
                aVar8.X(jLongValue7);
            }
            z(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            z(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        Map map8 = this.f41734a;
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(aVar9)) {
            long jLongValue8 = ((Long) ((HashMap) this.f41734a).remove(aVar9)).longValue();
            if (this.f41738e != w.LENIENT) {
                aVar9.X(jLongValue8);
            }
            z(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            z(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            z(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        Map map9 = this.f41734a;
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(aVar10)) {
            long jLongValue9 = ((Long) ((HashMap) this.f41734a).remove(aVar10)).longValue();
            if (this.f41738e != w.LENIENT) {
                aVar10.X(jLongValue9);
            }
            z(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            z(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        Map map10 = this.f41734a;
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(aVar11)) {
            long jLongValue10 = ((Long) ((HashMap) this.f41734a).get(aVar11)).longValue();
            w wVar3 = this.f41738e;
            w wVar4 = w.LENIENT;
            if (wVar3 != wVar4) {
                aVar11.X(jLongValue10);
            }
            Map map11 = this.f41734a;
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(aVar12)) {
                long jLongValue11 = ((Long) ((HashMap) this.f41734a).remove(aVar12)).longValue();
                if (this.f41738e != wVar4) {
                    aVar12.X(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                z(aVar12, aVar11, Long.valueOf(jLongValue10));
            }
            Map map12 = this.f41734a;
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(aVar13)) {
                long jLongValue12 = ((Long) ((HashMap) this.f41734a).remove(aVar13)).longValue();
                if (this.f41738e != wVar4) {
                    aVar13.X(jLongValue12);
                }
                z(aVar13, aVar11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        Map map13 = this.f41734a;
        j$.time.temporal.a aVar14 = j$.time.temporal.a.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(aVar14)) {
            Map map14 = this.f41734a;
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(aVar15)) {
                Map map15 = this.f41734a;
                j$.time.temporal.a aVar16 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(aVar16) && ((HashMap) this.f41734a).containsKey(aVar11)) {
                    s(((Long) ((HashMap) this.f41734a).remove(aVar14)).longValue(), ((Long) ((HashMap) this.f41734a).remove(aVar15)).longValue(), ((Long) ((HashMap) this.f41734a).remove(aVar16)).longValue(), ((Long) ((HashMap) this.f41734a).remove(aVar11)).longValue());
                }
            }
        }
    }

    public final void s(long j10, long j11, long j12, long j13) {
        if (this.f41738e == w.LENIENT) {
            long jAddExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j10, 3600000000000L), Math.multiplyExact(j11, 60000000000L)), Math.multiplyExact(j12, C.NANOS_PER_SECOND)), j13);
            v(j$.time.l.V(Math.floorMod(jAddExact, 86400000000000L)), j$.time.s.a(0, 0, (int) Math.floorDiv(jAddExact, 86400000000000L)));
            return;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.MINUTE_OF_HOUR;
        int iA = aVar.f41784b.a(j11, aVar);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
        int iA2 = aVar2.f41784b.a(j13, aVar2);
        if (this.f41738e == w.SMART && j10 == 24 && iA == 0 && j12 == 0 && iA2 == 0) {
            v(j$.time.l.f41759g, j$.time.s.a(0, 0, 1));
            return;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.HOUR_OF_DAY;
        int iA3 = aVar3.f41784b.a(j10, aVar3);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.SECOND_OF_MINUTE;
        v(j$.time.l.P(iA3, iA, aVar4.f41784b.a(j12, aVar4), iA2), j$.time.s.f41776d);
    }

    public final void v(j$.time.l lVar, j$.time.s sVar) {
        j$.time.l lVar2 = this.f41740g;
        if (lVar2 != null) {
            if (!lVar2.equals(lVar)) {
                throw new j$.time.c("Conflict found: Fields resolved to different times: " + this.f41740g + " " + lVar);
            }
            j$.time.s sVar2 = this.f41741h;
            sVar2.getClass();
            j$.time.s sVar3 = j$.time.s.f41776d;
            if (sVar2 != sVar3 && sVar != sVar3 && !this.f41741h.equals(sVar)) {
                throw new j$.time.c("Conflict found: Fields resolved to different excess periods: " + this.f41741h + " " + sVar);
            }
            this.f41741h = sVar;
            return;
        }
        this.f41740g = lVar;
        this.f41741h = sVar;
    }

    public final void p(j$.time.temporal.n nVar) {
        Iterator it = ((HashMap) this.f41734a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.r rVar = (j$.time.temporal.r) entry.getKey();
            if (nVar.h(rVar)) {
                try {
                    long jI = nVar.i(rVar);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jI != jLongValue) {
                        throw new j$.time.c("Conflict found: Field " + rVar + " " + jI + " differs from " + rVar + " " + jLongValue + " derived from " + nVar);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(this.f41734a);
        sb2.append(',');
        sb2.append(this.f41736c);
        if (this.f41735b != null) {
            sb2.append(',');
            sb2.append(this.f41735b);
        }
        if (this.f41739f != null || this.f41740g != null) {
            sb2.append(" resolved to ");
            j$.time.chrono.b bVar = this.f41739f;
            if (bVar != null) {
                sb2.append(bVar);
                if (this.f41740g != null) {
                    sb2.append('T');
                    sb2.append(this.f41740g);
                }
            } else {
                sb2.append(this.f41740g);
            }
        }
        return sb2.toString();
    }
}
