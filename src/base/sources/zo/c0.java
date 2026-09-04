package zo;

import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class c0 extends a implements uo.b {
    @Override // zo.a, uo.d
    public void a(uo.c cVar, uo.f fVar) throws CookieRestrictionViolationException {
        ip.a.h(cVar, "Cookie");
        if (cVar.getVersion() < 0) {
            throw new CookieRestrictionViolationException("Cookie version may not be negative");
        }
    }

    @Override // uo.b
    public String b() {
        return "version";
    }

    @Override // uo.d
    public void c(uo.l lVar, String str) throws MalformedCookieException {
        ip.a.h(lVar, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for version attribute");
        }
        if (str.trim().isEmpty()) {
            throw new MalformedCookieException("Blank value for version attribute");
        }
        try {
            lVar.setVersion(Integer.parseInt(str));
        } catch (NumberFormatException e10) {
            throw new MalformedCookieException("Invalid version: " + e10.getMessage());
        }
    }
}
