package zo;

import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class j0 implements uo.b {
    @Override // uo.b
    public String b() {
        return "version";
    }

    @Override // uo.d
    public void c(uo.l lVar, String str) throws MalformedCookieException {
        int i10;
        ip.a.h(lVar, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for version attribute");
        }
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i10 = -1;
        }
        if (i10 < 0) {
            throw new MalformedCookieException("Invalid cookie version.");
        }
        lVar.setVersion(i10);
    }

    @Override // uo.d
    public void a(uo.c cVar, uo.f fVar) throws CookieRestrictionViolationException {
        ip.a.h(cVar, "Cookie");
        if ((cVar instanceof uo.k) && (cVar instanceof uo.a) && !((uo.a) cVar).c("version")) {
            throw new CookieRestrictionViolationException(PvZsvNiPV.ZvsR);
        }
    }
}
