package j$.time.format;

import j$.time.ZoneOffset;
import j$.time.chrono.ChronoZonedDateTime;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter RFC_1123_DATE_TIME;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DateTimeFormatter f41675f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f41676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Locale f41677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f41678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f41679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j$.time.chrono.l f41680e;

    static {
        o oVar = new o();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        x xVar = x.EXCEEDS_PAD;
        oVar.h(aVar, 4, 10, xVar);
        oVar.c('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        oVar.g(aVar2, 2);
        oVar.c('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        oVar.g(aVar3, 2);
        w wVar = w.STRICT;
        j$.time.chrono.s sVar = j$.time.chrono.s.f41655c;
        DateTimeFormatter dateTimeFormatterK = oVar.k(wVar, sVar);
        ISO_LOCAL_DATE = dateTimeFormatterK;
        o oVar2 = new o();
        l lVar = l.INSENSITIVE;
        oVar2.b(lVar);
        oVar2.a(dateTimeFormatterK);
        i iVar = i.f41698e;
        oVar2.b(iVar);
        oVar2.k(wVar, sVar);
        o oVar3 = new o();
        oVar3.b(lVar);
        oVar3.a(dateTimeFormatterK);
        oVar3.j();
        oVar3.b(iVar);
        oVar3.k(wVar, sVar);
        o oVar4 = new o();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        oVar4.g(aVar4, 2);
        oVar4.c(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        oVar4.g(aVar5, 2);
        oVar4.j();
        oVar4.c(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        oVar4.g(aVar6, 2);
        oVar4.j();
        oVar4.b(new f(j$.time.temporal.a.NANO_OF_SECOND));
        DateTimeFormatter dateTimeFormatterK2 = oVar4.k(wVar, null);
        o oVar5 = new o();
        oVar5.b(lVar);
        oVar5.a(dateTimeFormatterK2);
        oVar5.b(iVar);
        oVar5.k(wVar, null);
        o oVar6 = new o();
        oVar6.b(lVar);
        oVar6.a(dateTimeFormatterK2);
        oVar6.j();
        oVar6.b(iVar);
        oVar6.k(wVar, null);
        o oVar7 = new o();
        oVar7.b(lVar);
        oVar7.a(dateTimeFormatterK);
        oVar7.c('T');
        oVar7.a(dateTimeFormatterK2);
        DateTimeFormatter dateTimeFormatterK3 = oVar7.k(wVar, sVar);
        o oVar8 = new o();
        oVar8.b(lVar);
        oVar8.a(dateTimeFormatterK3);
        l lVar2 = l.LENIENT;
        oVar8.b(lVar2);
        oVar8.b(iVar);
        l lVar3 = l.STRICT;
        oVar8.b(lVar3);
        DateTimeFormatter dateTimeFormatterK4 = oVar8.k(wVar, sVar);
        o oVar9 = new o();
        oVar9.a(dateTimeFormatterK4);
        oVar9.j();
        oVar9.c('[');
        l lVar4 = l.SENSITIVE;
        oVar9.b(lVar4);
        oVar9.b(new g(1));
        oVar9.c(']');
        oVar9.k(wVar, sVar);
        o oVar10 = new o();
        oVar10.a(dateTimeFormatterK3);
        oVar10.j();
        oVar10.b(iVar);
        oVar10.j();
        oVar10.c('[');
        oVar10.b(lVar4);
        oVar10.b(new g(1));
        oVar10.c(']');
        oVar10.k(wVar, sVar);
        o oVar11 = new o();
        oVar11.b(lVar);
        oVar11.h(aVar, 4, 10, xVar);
        oVar11.c('-');
        oVar11.g(j$.time.temporal.a.DAY_OF_YEAR, 3);
        oVar11.j();
        oVar11.b(iVar);
        oVar11.k(wVar, sVar);
        o oVar12 = new o();
        oVar12.b(lVar);
        oVar12.h(j$.time.temporal.j.f41794c, 4, 10, xVar);
        oVar12.d("-W");
        oVar12.g(j$.time.temporal.j.f41793b, 2);
        oVar12.c('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        oVar12.g(aVar7, 1);
        oVar12.j();
        oVar12.b(iVar);
        oVar12.k(wVar, sVar);
        o oVar13 = new o();
        oVar13.b(lVar);
        oVar13.b(new g(0));
        f41675f = oVar13.k(wVar, null);
        o oVar14 = new o();
        oVar14.b(lVar);
        oVar14.g(aVar, 4);
        oVar14.g(aVar2, 2);
        oVar14.g(aVar3, 2);
        oVar14.j();
        oVar14.b(lVar2);
        oVar14.b(new i("+HHMMss", "Z"));
        oVar14.b(lVar3);
        oVar14.k(wVar, sVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        o oVar15 = new o();
        oVar15.b(lVar);
        oVar15.b(lVar2);
        oVar15.j();
        oVar15.e(aVar7, map);
        oVar15.d(", ");
        oVar15.i();
        oVar15.h(aVar3, 1, 2, x.NOT_NEGATIVE);
        oVar15.c(' ');
        oVar15.e(aVar2, map2);
        oVar15.c(' ');
        oVar15.g(aVar, 4);
        oVar15.c(' ');
        oVar15.g(aVar4, 2);
        oVar15.c(':');
        oVar15.g(aVar5, 2);
        oVar15.j();
        oVar15.c(':');
        oVar15.g(aVar6, 2);
        oVar15.i();
        oVar15.c(' ');
        oVar15.b(new i("+HHMM", "GMT"));
        RFC_1123_DATE_TIME = oVar15.k(w.SMART, sVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, w wVar, j$.time.chrono.l lVar) {
        u uVar = u.f41733a;
        this.f41676a = dVar;
        Objects.requireNonNull(locale, "locale");
        this.f41677b = locale;
        this.f41678c = uVar;
        Objects.requireNonNull(wVar, "resolverStyle");
        this.f41679d = wVar;
        this.f41680e = lVar;
    }

    public final String a(j$.time.temporal.n nVar) {
        StringBuilder sb2 = new StringBuilder(32);
        try {
            this.f41676a.s(new r(nVar, this), sb2);
            return sb2.toString();
        } catch (IOException e10) {
            throw new j$.time.c(e10.getMessage(), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x028b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0322  */
    /* JADX WARN: Code duplicated, block: B:134:0x032e  */
    /* JADX WARN: Code duplicated, block: B:135:0x035b  */
    /* JADX WARN: Code duplicated, block: B:169:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0267  */
    public final v b(CharSequence charSequence) {
        String string;
        long j10;
        j$.time.temporal.r rVar;
        j$.time.temporal.a aVar;
        Map map;
        j$.time.temporal.a aVar2;
        j$.time.temporal.r rVar2;
        int i10 = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        p pVar = new p(this);
        int iA = this.f41676a.A(pVar, charSequence, parsePosition.getIndex());
        j$.time.y yVar = null;
        if (iA < 0) {
            parsePosition.setErrorIndex(~iA);
            pVar = null;
        } else {
            parsePosition.setIndex(iA);
        }
        if (pVar != null) {
            DateTimeFormatter dateTimeFormatter = pVar.f41720a;
            if (parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
                v vVarC = pVar.c();
                j$.time.chrono.l lVar = pVar.c().f41736c;
                if (lVar == null && (lVar = dateTimeFormatter.f41680e) == null) {
                    lVar = j$.time.chrono.s.f41655c;
                }
                vVarC.f41736c = lVar;
                j$.time.y yVar2 = vVarC.f41735b;
                if (yVar2 != null) {
                    yVar = yVar2;
                } else {
                    dateTimeFormatter.getClass();
                }
                vVarC.f41735b = yVar;
                vVarC.f41738e = this.f41679d;
                vVarC.q();
                vVarC.y(vVarC.f41736c.S(vVarC.f41734a, vVarC.f41738e));
                vVarC.u();
                if (((HashMap) vVarC.f41734a).size() > 0) {
                    loop0: while (i10 < 50) {
                        Iterator it = ((HashMap) vVarC.f41734a).entrySet().iterator();
                        do {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            rVar2 = (j$.time.temporal.r) ((Map.Entry) it.next()).getKey();
                            j$.time.temporal.n nVarF = rVar2.F(vVarC.f41734a, vVarC, vVarC.f41738e);
                            if (nVarF != null) {
                                if (nVarF instanceof ChronoZonedDateTime) {
                                    ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) nVarF;
                                    j$.time.y yVar3 = vVarC.f41735b;
                                    if (yVar3 == null) {
                                        vVarC.f41735b = chronoZonedDateTime.J();
                                    } else if (!yVar3.equals(chronoZonedDateTime.J())) {
                                        throw new j$.time.c("ChronoZonedDateTime must use the effective parsed zone: " + vVarC.f41735b);
                                    }
                                    nVarF = chronoZonedDateTime.x();
                                }
                                if (nVarF instanceof j$.time.chrono.e) {
                                    j$.time.chrono.e eVar = (j$.time.chrono.e) nVarF;
                                    vVarC.v(eVar.j(), j$.time.s.f41776d);
                                    vVarC.y(eVar.n());
                                    break;
                                }
                                if (nVarF instanceof j$.time.chrono.b) {
                                    vVarC.y((j$.time.chrono.b) nVarF);
                                    break;
                                }
                                if (nVarF instanceof j$.time.l) {
                                    vVarC.v((j$.time.l) nVarF, j$.time.s.f41776d);
                                    break;
                                }
                                throw new j$.time.c("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                            }
                        } while (((HashMap) vVarC.f41734a).containsKey(rVar2));
                        i10++;
                    }
                    if (i10 == 50) {
                        throw new j$.time.c("One of the parsed fields has an incorrectly implemented resolve method");
                    }
                    if (i10 > 0) {
                        vVarC.q();
                        vVarC.y(vVarC.f41736c.S(vVarC.f41734a, vVarC.f41738e));
                        vVarC.u();
                    }
                }
                if (vVarC.f41740g == null) {
                    Map map2 = vVarC.f41734a;
                    j$.time.temporal.a aVar3 = j$.time.temporal.a.MILLI_OF_SECOND;
                    if (((HashMap) map2).containsKey(aVar3)) {
                        long jLongValue = ((Long) ((HashMap) vVarC.f41734a).remove(aVar3)).longValue();
                        Map map3 = vVarC.f41734a;
                        j$.time.temporal.a aVar4 = j$.time.temporal.a.MICRO_OF_SECOND;
                        if (((HashMap) map3).containsKey(aVar4)) {
                            long jLongValue2 = (((Long) ((HashMap) vVarC.f41734a).get(aVar4)).longValue() % 1000) + (jLongValue * 1000);
                            vVarC.z(aVar3, aVar4, Long.valueOf(jLongValue2));
                            ((HashMap) vVarC.f41734a).remove(aVar4);
                            ((HashMap) vVarC.f41734a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                        } else {
                            ((HashMap) vVarC.f41734a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                        }
                    } else {
                        Map map4 = vVarC.f41734a;
                        j$.time.temporal.a aVar5 = j$.time.temporal.a.MICRO_OF_SECOND;
                        if (((HashMap) map4).containsKey(aVar5)) {
                            ((HashMap) vVarC.f41734a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) vVarC.f41734a).remove(aVar5)).longValue() * 1000));
                        }
                    }
                    Map map5 = vVarC.f41734a;
                    j$.time.temporal.a aVar6 = j$.time.temporal.a.HOUR_OF_DAY;
                    Long l10 = (Long) ((HashMap) map5).get(aVar6);
                    if (l10 != null) {
                        Map map6 = vVarC.f41734a;
                        j$.time.temporal.a aVar7 = j$.time.temporal.a.MINUTE_OF_HOUR;
                        Long l11 = (Long) ((HashMap) map6).get(aVar7);
                        Map map7 = vVarC.f41734a;
                        j$.time.temporal.a aVar8 = j$.time.temporal.a.SECOND_OF_MINUTE;
                        Long l12 = (Long) ((HashMap) map7).get(aVar8);
                        Map map8 = vVarC.f41734a;
                        j$.time.temporal.a aVar9 = j$.time.temporal.a.NANO_OF_SECOND;
                        Long l13 = (Long) ((HashMap) map8).get(aVar9);
                        if ((l11 != null || (l12 == null && l13 == null)) && (l11 == null || l12 != null || l13 == null)) {
                            long jLongValue3 = l11 != null ? l11.longValue() : 0L;
                            long jLongValue4 = l12 != null ? l12.longValue() : 0L;
                            long jLongValue5 = l13 != null ? l13.longValue() : 0L;
                            long j11 = jLongValue4;
                            j10 = 1000000;
                            vVarC.s(l10.longValue(), jLongValue3, j11, jLongValue5);
                            ((HashMap) vVarC.f41734a).remove(aVar6);
                            ((HashMap) vVarC.f41734a).remove(aVar7);
                            ((HashMap) vVarC.f41734a).remove(aVar8);
                            ((HashMap) vVarC.f41734a).remove(aVar9);
                        } else {
                            j10 = 1000000;
                        }
                    } else {
                        j10 = 1000000;
                    }
                    if (vVarC.f41738e != w.LENIENT && ((HashMap) vVarC.f41734a).size() > 0) {
                        for (Map.Entry entry : ((HashMap) vVarC.f41734a).entrySet()) {
                            rVar = (j$.time.temporal.r) entry.getKey();
                            if (rVar instanceof j$.time.temporal.a) {
                                aVar = (j$.time.temporal.a) rVar;
                                if (aVar.Y()) {
                                    aVar.X(((Long) entry.getValue()).longValue());
                                }
                            }
                        }
                    }
                } else {
                    j10 = 1000000;
                    if (vVarC.f41738e != w.LENIENT) {
                        while (r1.hasNext()) {
                            rVar = (j$.time.temporal.r) entry.getKey();
                            if (rVar instanceof j$.time.temporal.a) {
                                aVar = (j$.time.temporal.a) rVar;
                                if (aVar.Y()) {
                                    aVar.X(((Long) entry.getValue()).longValue());
                                }
                            }
                        }
                    }
                }
                j$.time.chrono.b bVar = vVarC.f41739f;
                if (bVar != null) {
                    vVarC.p(bVar);
                }
                j$.time.l lVar2 = vVarC.f41740g;
                if (lVar2 != null) {
                    vVarC.p(lVar2);
                    if (vVarC.f41739f != null && ((HashMap) vVarC.f41734a).size() > 0) {
                        vVarC.p(vVarC.f41739f.L(vVarC.f41740g));
                    }
                }
                if (vVarC.f41739f != null && vVarC.f41740g != null) {
                    j$.time.s sVar = vVarC.f41741h;
                    sVar.getClass();
                    j$.time.s sVar2 = j$.time.s.f41776d;
                    if (sVar != sVar2) {
                        vVarC.f41739f = vVarC.f41739f.R(vVarC.f41741h);
                        vVarC.f41741h = sVar2;
                    }
                }
                if (vVarC.f41740g == null) {
                    if (((HashMap) vVarC.f41734a).containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
                        map = vVarC.f41734a;
                        aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(aVar2)) {
                            long jLongValue6 = ((Long) ((HashMap) vVarC.f41734a).get(aVar2)).longValue();
                            ((HashMap) vVarC.f41734a).put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 / 1000));
                            ((HashMap) vVarC.f41734a).put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue6 / j10));
                        } else {
                            ((HashMap) vVarC.f41734a).put(aVar2, 0L);
                            ((HashMap) vVarC.f41734a).put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                            ((HashMap) vVarC.f41734a).put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                        }
                    } else if (((HashMap) vVarC.f41734a).containsKey(j$.time.temporal.a.SECOND_OF_DAY)) {
                        map = vVarC.f41734a;
                        aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(aVar2)) {
                            long jLongValue7 = ((Long) ((HashMap) vVarC.f41734a).get(aVar2)).longValue();
                            ((HashMap) vVarC.f41734a).put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue7 / 1000));
                            ((HashMap) vVarC.f41734a).put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 / j10));
                        } else {
                            ((HashMap) vVarC.f41734a).put(aVar2, 0L);
                            ((HashMap) vVarC.f41734a).put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                            ((HashMap) vVarC.f41734a).put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                        }
                    } else if (((HashMap) vVarC.f41734a).containsKey(j$.time.temporal.a.SECOND_OF_MINUTE)) {
                        map = vVarC.f41734a;
                        aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(aVar2)) {
                            long jLongValue8 = ((Long) ((HashMap) vVarC.f41734a).get(aVar2)).longValue();
                            ((HashMap) vVarC.f41734a).put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue8 / 1000));
                            ((HashMap) vVarC.f41734a).put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue8 / j10));
                        } else {
                            ((HashMap) vVarC.f41734a).put(aVar2, 0L);
                            ((HashMap) vVarC.f41734a).put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                            ((HashMap) vVarC.f41734a).put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                        }
                    }
                }
                if (vVarC.f41739f != null && vVarC.f41740g != null) {
                    Long l14 = (Long) ((HashMap) vVarC.f41734a).get(j$.time.temporal.a.OFFSET_SECONDS);
                    if (l14 != null) {
                        ((HashMap) vVarC.f41734a).put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(vVarC.f41739f.L(vVarC.f41740g).E(ZoneOffset.Z(l14.intValue())).W()));
                        return vVarC;
                    }
                    if (vVarC.f41735b != null) {
                        ((HashMap) vVarC.f41734a).put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(vVarC.f41739f.L(vVarC.f41740g).E(vVarC.f41735b).W()));
                    }
                }
                return vVarC;
            }
        }
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new DateTimeParseException(str, charSequence);
        }
        String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new DateTimeParseException(str2, charSequence);
    }

    public final String toString() {
        String string = this.f41676a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
