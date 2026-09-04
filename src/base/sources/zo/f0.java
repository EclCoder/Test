package zo;

import c1.pGX.geAgcEazw;
import java.util.Locale;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class f0 implements uo.b {
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
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (!str.startsWith(".")) {
            lowerCase = '.' + lowerCase;
        }
        lVar.e(lowerCase);
    }

    public boolean d(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str2.startsWith(".") && str.endsWith(str2);
    }

    @Override // uo.d
    public void a(uo.c cVar, uo.f fVar) throws CookieRestrictionViolationException {
        ip.a.h(cVar, "Cookie");
        ip.a.h(fVar, "Cookie origin");
        String strA = fVar.a();
        Locale locale = Locale.ROOT;
        String lowerCase = strA.toLowerCase(locale);
        if (cVar.g() == null) {
            throw new CookieRestrictionViolationException("Invalid cookie state: domain not specified");
        }
        String lowerCase2 = cVar.g().toLowerCase(locale);
        if (!(cVar instanceof uo.a) || !((uo.a) cVar).c("domain")) {
            if (cVar.g().equals(lowerCase)) {
                return;
            }
            throw new CookieRestrictionViolationException("Illegal domain attribute: \"" + cVar.g() + "\".Domain of origin: \"" + lowerCase + "\"");
        }
        if (!lowerCase2.startsWith(".")) {
            throw new CookieRestrictionViolationException("Domain attribute \"" + cVar.g() + "\" violates RFC 2109: domain must start with a dot");
        }
        int iIndexOf = lowerCase2.indexOf(46, 1);
        if ((iIndexOf < 0 || iIndexOf == lowerCase2.length() - 1) && !lowerCase2.equals(".local")) {
            throw new CookieRestrictionViolationException("Domain attribute \"" + cVar.g() + geAgcEazw.IYZLDtoKxQtfJU + "and the value is not .local");
        }
        if (!d(lowerCase, lowerCase2)) {
            throw new CookieRestrictionViolationException("Domain attribute \"" + cVar.g() + "\" violates RFC 2965: effective host name does not domain-match domain attribute.");
        }
        if (lowerCase.substring(0, lowerCase.length() - lowerCase2.length()).indexOf(46) == -1) {
            return;
        }
        throw new CookieRestrictionViolationException("Domain attribute \"" + cVar.g() + "\" violates RFC 2965: effective host minus domain may not contain any dots");
    }
}
