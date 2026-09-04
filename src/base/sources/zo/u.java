package zo;

import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class u extends f {
    private static boolean e(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        return upperCase.endsWith(".COM") || upperCase.endsWith(".EDU") || upperCase.endsWith(".NET") || upperCase.endsWith(".GOV") || upperCase.endsWith(".MIL") || upperCase.endsWith(".ORG") || upperCase.endsWith(".INT");
    }

    @Override // zo.f, uo.d
    public void a(uo.c cVar, uo.f fVar) throws CookieRestrictionViolationException {
        String strA = fVar.a();
        String strG = cVar.g();
        if (!strA.equals(strG) && !f.d(strG, strA)) {
            throw new CookieRestrictionViolationException("Illegal domain attribute \"" + strG + "\". Domain of origin: \"" + strA + "\"");
        }
        if (strA.contains(".")) {
            int iCountTokens = new StringTokenizer(strG, ".").countTokens();
            if (!e(strG)) {
                if (iCountTokens >= 3) {
                    return;
                }
                throw new CookieRestrictionViolationException("Domain attribute \"" + strG + "\" violates the Netscape cookie specification");
            }
            if (iCountTokens >= 2) {
                return;
            }
            throw new CookieRestrictionViolationException("Domain attribute \"" + strG + "\" violates the Netscape cookie specification for special domains");
        }
    }

    @Override // zo.f, uo.b
    public String b() {
        return "domain";
    }

    @Override // zo.f, uo.d
    public void c(uo.l lVar, String str) throws MalformedCookieException {
        ip.a.h(lVar, "Cookie");
        if (ip.g.b(str)) {
            throw new MalformedCookieException("Blank or null value for domain attribute");
        }
        lVar.e(str);
    }
}
