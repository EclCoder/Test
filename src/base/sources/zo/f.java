package zo;

import java.util.Locale;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class f implements uo.b {
    static boolean d(String str, String str2) {
        if (!to.c.a(str2) && !to.c.b(str2)) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            if (str2.endsWith(str)) {
                int length = str2.length() - str.length();
                if (length == 0) {
                    return true;
                }
                if (length > 1 && str2.charAt(length - 1) == '.') {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // uo.d
    public void a(uo.c cVar, uo.f fVar) throws CookieRestrictionViolationException {
        ip.a.h(cVar, "Cookie");
        ip.a.h(fVar, "Cookie origin");
        String strA = fVar.a();
        String strG = cVar.g();
        if (strG == null) {
            throw new CookieRestrictionViolationException("Cookie 'domain' may not be null");
        }
        if (strA.equals(strG) || d(strG, strA)) {
            return;
        }
        throw new CookieRestrictionViolationException("Illegal 'domain' attribute \"" + strG + "\". Domain of origin: \"" + strA + "\"");
    }

    @Override // uo.b
    public String b() {
        return "domain";
    }

    @Override // uo.d
    public void c(uo.l lVar, String str) throws MalformedCookieException {
        ip.a.h(lVar, "Cookie");
        if (ip.g.b(str)) {
            throw new MalformedCookieException("Blank or null value for domain attribute");
        }
        if (str.endsWith(".")) {
            return;
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        lVar.e(str.toLowerCase(Locale.ROOT));
    }
}
