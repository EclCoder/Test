package vn;

import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import gl.r;
import hn.k;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.s;
import xn.s0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f55686a = new d();

    private d() {
    }

    private final String d(String str) {
        if (!f(str)) {
            return str;
        }
        Locale US = Locale.US;
        s.g(US, "US");
        String lowerCase = str.toLowerCase(US);
        s.g(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final List e(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return r.l();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && s.c(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return r.l();
        }
    }

    private final boolean f(String str) {
        return str.length() == ((int) s0.b(str, 0, 0, 3, null));
    }

    private final boolean h(String str, String str2) {
        if (str != null && str.length() != 0 && !bm.r.N(str, ".", false, 2, null) && !bm.r.z(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !bm.r.N(str2, ".", false, 2, null) && !bm.r.z(str2, "..", false, 2, null)) {
            if (!bm.r.z(str, ".", false, 2, null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!bm.r.z(str2, ".", false, 2, null)) {
                str2 = str2 + '.';
            }
            String strD = d(str2);
            if (!bm.r.T(strD, "*", false, 2, null)) {
                return s.c(str3, strD);
            }
            String str4 = QGbBllacZSmHKn.OGqSZdtNY;
            if (!bm.r.N(strD, str4, false, 2, null) || bm.r.e0(strD, '*', 1, false, 4, null) != -1 || str3.length() < strD.length() || s.c(str4, strD)) {
                return false;
            }
            String strSubstring = strD.substring(1);
            s.g(strSubstring, "substring(...)");
            if (!bm.r.z(str3, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || bm.r.k0(str3, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    private final boolean i(String str, X509Certificate x509Certificate) {
        String strD = d(str);
        List listE = e(x509Certificate, 2);
        if ((listE instanceof Collection) && listE.isEmpty()) {
            return false;
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            if (f55686a.h(strD, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean j(String str, X509Certificate x509Certificate) {
        String strK = k.k(str);
        List listE = e(x509Certificate, 7);
        if ((listE instanceof Collection) && listE.isEmpty()) {
            return false;
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            if (s.c(strK, k.k((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List c(X509Certificate certificate) {
        s.h(certificate, "certificate");
        return r.s0(e(certificate, 7), e(certificate, 2));
    }

    public final boolean g(String host, X509Certificate certificate) {
        s.h(host, "host");
        s.h(certificate, "certificate");
        return k.a(host) ? j(host, certificate) : i(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        s.h(host, "host");
        s.h(session, "session");
        if (!f(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            s.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return g(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
