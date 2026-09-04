package j$.time.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.r f41710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f41711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f41712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile h f41713d;

    public n(j$.time.temporal.r rVar, y yVar, a aVar) {
        this.f41710a = rVar;
        this.f41711b = yVar;
        this.f41712c = aVar;
    }

    @Override // j$.time.format.e
    public final boolean s(r rVar, StringBuilder sb2) {
        String strA;
        Long lA = rVar.a(this.f41710a);
        DateTimeFormatter dateTimeFormatter = rVar.f41729b;
        if (lA == null) {
            return false;
        }
        j$.time.chrono.l lVar = (j$.time.chrono.l) rVar.f41728a.b(j$.time.temporal.s.f41803b);
        if (lVar == null || lVar == j$.time.chrono.s.f41655c) {
            a aVar = this.f41712c;
            long jLongValue = lA.longValue();
            y yVar = this.f41711b;
            Locale locale = dateTimeFormatter.f41677b;
            strA = aVar.f41682a.a(jLongValue, yVar);
        } else {
            a aVar2 = this.f41712c;
            long jLongValue2 = lA.longValue();
            y yVar2 = this.f41711b;
            Locale locale2 = dateTimeFormatter.f41677b;
            strA = aVar2.f41682a.a(jLongValue2, yVar2);
        }
        if (strA != null) {
            sb2.append(strA);
            return true;
        }
        if (this.f41713d == null) {
            this.f41713d = new h(this.f41710a, 1, 19, x.NORMAL);
        }
        return this.f41713d.s(rVar, sb2);
    }

    @Override // j$.time.format.e
    public final int A(p pVar, CharSequence charSequence, int i10) {
        a aVar = this.f41712c;
        j$.time.temporal.r rVar = this.f41710a;
        int length = charSequence.length();
        if (i10 >= 0 && i10 <= length) {
            boolean z10 = pVar.f41722c;
            DateTimeFormatter dateTimeFormatter = pVar.f41720a;
            Iterator it = null;
            y yVar = z10 ? this.f41711b : null;
            j$.time.chrono.l lVar = pVar.c().f41736c;
            if (lVar == null && (lVar = pVar.f41720a.f41680e) == null) {
                lVar = j$.time.chrono.s.f41655c;
            }
            if (lVar == null || lVar == j$.time.chrono.s.f41655c) {
                Locale locale = dateTimeFormatter.f41677b;
                List list = (List) ((HashMap) aVar.f41682a.f41732b).get(yVar);
                it = list != null ? list.iterator() : null;
            } else {
                Locale locale2 = dateTimeFormatter.f41677b;
                List list2 = (List) ((HashMap) aVar.f41682a.f41732b).get(yVar);
                if (list2 != null) {
                    it = list2.iterator();
                }
            }
            Iterator it2 = it;
            if (it2 != null) {
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str = (String) entry.getKey();
                    if (pVar.g(str, 0, charSequence, i10, str.length())) {
                        return pVar.f(this.f41710a, ((Long) entry.getValue()).longValue(), i10, str.length() + i10);
                    }
                }
                if (rVar == j$.time.temporal.a.ERA && !pVar.f41722c) {
                    for (j$.time.chrono.m mVar : lVar.z()) {
                        String string = mVar.toString();
                        if (pVar.g(string, 0, charSequence, i10, string.length())) {
                            return pVar.f(this.f41710a, mVar.getValue(), i10, string.length() + i10);
                        }
                    }
                }
                if (pVar.f41722c) {
                    return ~i10;
                }
            }
            if (this.f41713d == null) {
                this.f41713d = new h(this.f41710a, 1, 19, x.NORMAL);
            }
            return this.f41713d.A(pVar, charSequence, i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        y yVar = y.FULL;
        j$.time.temporal.r rVar = this.f41710a;
        y yVar2 = this.f41711b;
        if (yVar2 == yVar) {
            return "Text(" + rVar + ")";
        }
        return "Text(" + rVar + "," + yVar2 + ")";
    }
}
