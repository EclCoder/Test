package j$.time.format;

import j$.time.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f41714f = new a0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f41715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f41716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f41717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f41718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41719e;

    static {
        HashMap map = new HashMap();
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.h hVar = j$.time.temporal.j.f41792a;
        map.put('Q', hVar);
        map.put('q', hVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.l.f41799a);
    }

    public o() {
        this.f41715a = this;
        this.f41717c = new ArrayList();
        this.f41719e = -1;
        this.f41716b = null;
        this.f41718d = false;
    }

    public o(o oVar) {
        this.f41715a = this;
        this.f41717c = new ArrayList();
        this.f41719e = -1;
        this.f41716b = oVar;
        this.f41718d = true;
    }

    public final void g(j$.time.temporal.r rVar, int i10) {
        Objects.requireNonNull(rVar, "field");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i10);
        }
        f(new h(rVar, i10, i10, x.NOT_NEGATIVE));
    }

    public final void h(j$.time.temporal.r rVar, int i10, int i11, x xVar) {
        if (i10 == i11 && xVar == x.NOT_NEGATIVE) {
            g(rVar, i11);
            return;
        }
        Objects.requireNonNull(rVar, "field");
        Objects.requireNonNull(xVar, "signStyle");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i10);
        }
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i11);
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }
        f(new h(rVar, i10, i11, xVar));
    }

    public final void f(h hVar) {
        h hVarB;
        o oVar = this.f41715a;
        int i10 = oVar.f41719e;
        if (i10 < 0) {
            oVar.f41719e = b(hVar);
            return;
        }
        h hVar2 = (h) ((ArrayList) oVar.f41717c).get(i10);
        int i11 = hVar.f41693b;
        int i12 = hVar.f41694c;
        if (i11 == i12 && hVar.f41695d == x.NOT_NEGATIVE) {
            hVarB = hVar2.c(i12);
            b(hVar.b());
            this.f41715a.f41719e = i10;
        } else {
            hVarB = hVar2.b();
            this.f41715a.f41719e = b(hVar);
        }
        ((ArrayList) this.f41715a.f41717c).set(i10, hVarB);
    }

    public final void e(j$.time.temporal.a aVar, Map map) {
        Objects.requireNonNull(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        y yVar = y.FULL;
        b(new n(aVar, yVar, new a(new t(Collections.singletonMap(yVar, linkedHashMap)))));
    }

    public final void c(char c10) {
        b(new c(c10));
    }

    public final void d(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            b(new c(str.charAt(0)));
        } else {
            b(new m(str));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d dVar = dateTimeFormatter.f41676a;
        if (dVar.f41686b) {
            dVar = new d(dVar.f41685a, false);
        }
        b(dVar);
    }

    public final void j() {
        o oVar = this.f41715a;
        oVar.f41719e = -1;
        this.f41715a = new o(oVar);
    }

    public final void i() {
        o oVar = this.f41715a;
        if (oVar.f41716b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) oVar.f41717c).size() > 0) {
            o oVar2 = this.f41715a;
            d dVar = new d(oVar2.f41717c, oVar2.f41718d);
            this.f41715a = this.f41715a.f41716b;
            b(dVar);
            return;
        }
        this.f41715a = this.f41715a.f41716b;
    }

    public final int b(e eVar) {
        Objects.requireNonNull(eVar, "pp");
        o oVar = this.f41715a;
        oVar.getClass();
        ((ArrayList) oVar.f41717c).add(eVar);
        o oVar2 = this.f41715a;
        oVar2.f41719e = -1;
        return ((ArrayList) oVar2.f41717c).size() - 1;
    }

    public final DateTimeFormatter k(w wVar, j$.time.chrono.l lVar) {
        return l(Locale.getDefault(), wVar, lVar);
    }

    public final DateTimeFormatter l(Locale locale, w wVar, j$.time.chrono.l lVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f41715a.f41716b != null) {
            i();
        }
        d dVar = new d(this.f41717c, false);
        u uVar = u.f41733a;
        return new DateTimeFormatter(dVar, locale, wVar, lVar);
    }
}
