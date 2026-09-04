package j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTimeFormatter f41720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41721b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41722c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f41723d;

    public p(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f41723d = arrayList;
        this.f41720a = dateTimeFormatter;
        arrayList.add(new v());
    }

    public final boolean a(char c10, char c11) {
        if (this.f41721b) {
            return c10 == c11;
        }
        return b(c10, c11);
    }

    public final boolean g(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        if (i10 + i12 <= charSequence.length() && i11 + i12 <= charSequence2.length()) {
            if (this.f41721b) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (charSequence.charAt(i10 + i13) == charSequence2.charAt(i11 + i13)) {
                    }
                }
                return true;
            }
            for (int i14 = 0; i14 < i12; i14++) {
                char cCharAt = charSequence.charAt(i10 + i14);
                char cCharAt2 = charSequence2.charAt(i11 + i14);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(char c10, char c11) {
        return c10 == c11 || Character.toUpperCase(c10) == Character.toUpperCase(c11) || Character.toLowerCase(c10) == Character.toLowerCase(c11);
    }

    public final v c() {
        ArrayList arrayList = this.f41723d;
        return (v) arrayList.get(arrayList.size() - 1);
    }

    public final Long d(j$.time.temporal.a aVar) {
        return (Long) ((HashMap) c().f41734a).get(aVar);
    }

    public final int f(j$.time.temporal.r rVar, long j10, int i10, int i11) {
        Objects.requireNonNull(rVar, "field");
        Long l10 = (Long) ((HashMap) c().f41734a).put(rVar, Long.valueOf(j10));
        return (l10 == null || l10.longValue() == j10) ? i11 : ~i10;
    }

    public final void e(j$.time.y yVar) {
        Objects.requireNonNull(yVar, "zone");
        c().f41735b = yVar;
    }

    public final String toString() {
        return c().toString();
    }
}
