package zo;

import java.util.Date;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class g extends a implements uo.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f59039a;

    public g(String[] strArr) {
        ip.a.h(strArr, "Array of date patterns");
        this.f59039a = (String[]) strArr.clone();
    }

    @Override // uo.b
    public String b() {
        return "expires";
    }

    @Override // uo.d
    public void c(uo.l lVar, String str) throws MalformedCookieException {
        ip.a.h(lVar, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for 'expires' attribute");
        }
        Date dateA = lo.b.a(str, this.f59039a);
        if (dateA != null) {
            lVar.d(dateA);
            return;
        }
        throw new MalformedCookieException("Invalid 'expires' attribute: " + str);
    }
}
