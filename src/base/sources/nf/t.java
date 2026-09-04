package nf;

import gl.s0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f47632a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f47633b = s0.h('.', '!', '?', 12290, 65281, 65311, 2404, 8230);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final bm.o f47634c = new bm.o("\\bi\\b");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final bm.o f47635d = new bm.o("\\bi(['’])");

    private t() {
    }

    private final String a(String str) {
        char cA1 = bm.r.a1(str);
        if (!Character.isLowerCase(cA1)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strValueOf = String.valueOf(cA1);
        kotlin.jvm.internal.s.f(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.s.g(upperCase, "toUpperCase(...)");
        sb2.append(upperCase);
        String strSubstring = str.substring(1);
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    private final boolean b(String str) {
        return str.length() > 0 && f47633b.contains(Character.valueOf(bm.r.b1(str)));
    }

    public final List c(List cards, String lang) {
        kotlin.jvm.internal.s.h(cards, "cards");
        kotlin.jvm.internal.s.h(lang, "lang");
        if (cards.isEmpty()) {
            return cards;
        }
        ArrayList arrayList = new ArrayList(cards.size());
        boolean zB = true;
        int i10 = 0;
        for (Object obj : cards) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                gl.r.u();
            }
            m mVar = (m) obj;
            String string = bm.r.V0(mVar.e()).toString();
            if (string.length() == 0) {
                arrayList.add(mVar);
            } else {
                if (kotlin.jvm.internal.s.c(lang, "en")) {
                    string = f47635d.i(f47634c.i(string, "I"), "I$1");
                }
                if (zB) {
                    string = f47632a.a(string);
                }
                if (i10 == gl.r.n(cards) && !f47632a.b(string)) {
                    string = string + '.';
                }
                String str = string;
                arrayList.add(m.b(mVar, str, 0L, 0L, 6, null));
                zB = f47632a.b(str);
            }
            i10 = i11;
        }
        return arrayList;
    }
}
