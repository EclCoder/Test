package j0;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k f41887b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f41888a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    private k(l lVar) {
        this.f41888a = lVar;
    }

    public static k a(Locale... localeArr) {
        return i(a.a(localeArr));
    }

    public static k b(String str) {
        if (str == null || str.isEmpty()) {
            return d();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = Locale.forLanguageTag(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    public static k d() {
        return f41887b;
    }

    public static k i(LocaleList localeList) {
        return new k(new m(localeList));
    }

    public Locale c(int i10) {
        return this.f41888a.get(i10);
    }

    public boolean e() {
        return this.f41888a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof k) && this.f41888a.equals(((k) obj).f41888a);
    }

    public int f() {
        return this.f41888a.size();
    }

    public String g() {
        return this.f41888a.a();
    }

    public Object h() {
        return this.f41888a.b();
    }

    public int hashCode() {
        return this.f41888a.hashCode();
    }

    public String toString() {
        return this.f41888a.toString();
    }
}
