package zo;

import java.util.StringTokenizer;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class g0 implements uo.b {
    private static int[] d(String str) throws MalformedCookieException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i10 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                int i11 = Integer.parseInt(stringTokenizer.nextToken().trim());
                iArr[i10] = i11;
                if (i11 < 0) {
                    throw new MalformedCookieException("Invalid Port attribute.");
                }
                i10++;
            } catch (NumberFormatException e10) {
                throw new MalformedCookieException("Invalid Port attribute: " + e10.getMessage());
            }
        }
        return iArr;
    }

    private static boolean e(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    @Override // uo.d
    public void a(uo.c cVar, uo.f fVar) throws CookieRestrictionViolationException {
        ip.a.h(cVar, "Cookie");
        ip.a.h(fVar, "Cookie origin");
        int iC = fVar.c();
        if ((cVar instanceof uo.a) && ((uo.a) cVar).c("port") && !e(iC, cVar.getPorts())) {
            throw new CookieRestrictionViolationException("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
        }
    }

    @Override // uo.b
    public String b() {
        return "port";
    }

    @Override // uo.d
    public void c(uo.l lVar, String str) {
        ip.a.h(lVar, "Cookie");
        if (lVar instanceof uo.k) {
            uo.k kVar = (uo.k) lVar;
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            kVar.m(d(str));
        }
    }
}
