package zo;

import java.util.Locale;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class z implements uo.b {
    @Override // uo.d
    public void a(uo.c cVar, uo.f fVar) throws CookieRestrictionViolationException {
        ip.a.h(cVar, "Cookie");
        ip.a.h(fVar, "Cookie origin");
        String strA = fVar.a();
        String strG = cVar.g();
        if (strG == null) {
            throw new CookieRestrictionViolationException("Cookie domain may not be null");
        }
        if (strG.equals(strA)) {
            return;
        }
        if (strG.indexOf(46) == -1) {
            throw new CookieRestrictionViolationException("Domain attribute \"" + strG + "\" does not match the host \"" + strA + "\"");
        }
        if (!strG.startsWith(".")) {
            throw new CookieRestrictionViolationException("Domain attribute \"" + strG + "\" violates RFC 2109: domain must start with a dot");
        }
        int iIndexOf = strG.indexOf(46, 1);
        if (iIndexOf < 0 || iIndexOf == strG.length() - 1) {
            throw new CookieRestrictionViolationException("Domain attribute \"" + strG + "\" violates RFC 2109: domain must contain an embedded dot");
        }
        String lowerCase = strA.toLowerCase(Locale.ROOT);
        if (lowerCase.endsWith(strG)) {
            if (lowerCase.substring(0, lowerCase.length() - strG.length()).indexOf(46) == -1) {
                return;
            }
            throw new CookieRestrictionViolationException("Domain attribute \"" + strG + "\" violates RFC 2109: host minus domain may not contain any dots");
        }
        throw new CookieRestrictionViolationException("Illegal domain attribute \"" + strG + "\". Domain of origin: \"" + lowerCase + "\"");
    }

    @Override // uo.b
    public String b() {
        return "domain";
    }

    @Override // uo.d
    public void c(uo.l lVar, String str) throws MalformedCookieException {
        ip.a.h(lVar, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for domain attribute");
        }
        if (str.trim().isEmpty()) {
            throw new MalformedCookieException("Blank value for domain attribute");
        }
        lVar.e(str);
    }
}
