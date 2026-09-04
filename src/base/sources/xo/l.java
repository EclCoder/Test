package xo;

import org.apache.http.conn.UnsupportedSchemeException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class l implements oo.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f57021a = new l();

    @Override // oo.r
    public int a(co.l lVar) throws UnsupportedSchemeException {
        ip.a.h(lVar, "HTTP host");
        int iJ = lVar.j();
        if (iJ > 0) {
            return iJ;
        }
        String strK = lVar.k();
        if (strK.equalsIgnoreCase("http")) {
            return 80;
        }
        if (strK.equalsIgnoreCase("https")) {
            return 443;
        }
        throw new UnsupportedSchemeException(strK + " protocol is not supported");
    }
}
