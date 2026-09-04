package zo;

import java.util.Date;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class h extends a implements uo.b {
    @Override // uo.b
    public String b() {
        return "max-age";
    }

    @Override // uo.d
    public void c(uo.l lVar, String str) throws MalformedCookieException {
        ip.a.h(lVar, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for 'max-age' attribute");
        }
        try {
            int i10 = Integer.parseInt(str);
            if (i10 >= 0) {
                lVar.d(new Date(System.currentTimeMillis() + (((long) i10) * 1000)));
                return;
            }
            throw new MalformedCookieException("Negative 'max-age' attribute: " + str);
        } catch (NumberFormatException unused) {
            throw new MalformedCookieException("Invalid 'max-age' attribute: " + str);
        }
    }
}
