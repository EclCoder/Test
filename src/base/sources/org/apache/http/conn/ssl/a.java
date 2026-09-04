package org.apache.http.conn.ssl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String[] f49209a;

    static {
        String[] strArr = {CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        f49209a = strArr;
        Arrays.sort(strArr);
    }

    public a() {
        zn.h.k(getClass());
    }

    public static int c(String str) {
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == '.') {
                i10++;
            }
        }
        return i10;
    }

    private static boolean d(String str, String str2, boolean z10) {
        boolean zEndsWith;
        if (str == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        String lowerCase2 = str2.toLowerCase(locale);
        String[] strArrSplit = lowerCase2.split("\\.");
        if (strArrSplit.length < 3 || !strArrSplit[0].endsWith("*") || (z10 && !e(strArrSplit))) {
            return lowerCase.equals(lowerCase2);
        }
        String str3 = strArrSplit[0];
        if (str3.length() > 1) {
            String strSubstring = str3.substring(0, str3.length() - 1);
            zEndsWith = lowerCase.startsWith(strSubstring) && lowerCase.substring(strSubstring.length()).endsWith(lowerCase2.substring(str3.length()));
        } else {
            zEndsWith = lowerCase.endsWith(lowerCase2.substring(1));
        }
        return zEndsWith && (!z10 || c(lowerCase) == c(lowerCase2));
    }

    private static boolean e(String[] strArr) {
        return (strArr.length == 3 && strArr[2].length() == 2 && Arrays.binarySearch(f49209a, strArr[1]) >= 0) ? false : true;
    }

    @Override // org.apache.http.conn.ssl.l
    public final void b(String str, SSLSocket sSLSocket) throws IOException {
        ip.a.h(str, "Host");
        SSLSession session = sSLSocket.getSession();
        if (session == null) {
            sSLSocket.getInputStream().available();
            session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.startHandshake();
                session = sSLSocket.getSession();
            }
        }
        f(str, (X509Certificate) session.getPeerCertificates()[0]);
    }

    public final void f(String str, X509Certificate x509Certificate) throws SSLException {
        List<j> listE = d.e(x509Certificate);
        ArrayList arrayList = new ArrayList();
        if (to.c.a(str) || to.c.b(str)) {
            for (j jVar : listE) {
                if (jVar.a() == 7) {
                    arrayList.add(jVar.b());
                }
            }
        } else {
            for (j jVar2 : listE) {
                if (jVar2.a() == 2) {
                    arrayList.add(jVar2.b());
                }
            }
        }
        String strD = d.d(x509Certificate.getSubjectX500Principal().getName("RFC2253"));
        a(str, strD != null ? new String[]{strD} : null, arrayList.isEmpty() ? null : (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void g(String str, String[] strArr, String[] strArr2, boolean z10) throws SSLException {
        List<String> listAsList = null;
        String str2 = (strArr == null || strArr.length <= 0) ? null : strArr[0];
        if (strArr2 != null && strArr2.length > 0) {
            listAsList = Arrays.asList(strArr2);
        }
        String strM = to.c.b(str) ? d.m(str.toLowerCase(Locale.ROOT)) : str;
        if (listAsList != null) {
            for (String strM2 : listAsList) {
                if (to.c.b(strM2)) {
                    strM2 = d.m(strM2);
                }
                if (d(strM, strM2, z10)) {
                    return;
                }
            }
            throw new SSLException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + listAsList);
        }
        if (str2 == null) {
            throw new SSLException("Certificate subject for <" + str + "> doesn't contain a common name and does not have alternative names");
        }
        if (d(strM, to.c.b(str2) ? d.m(str2) : str2, z10)) {
            return;
        }
        throw new SSLException("Certificate for <" + str + "> doesn't match common name of the certificate subject: " + str2);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            f(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException unused) {
            throw null;
        }
    }
}
