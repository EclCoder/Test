package org.apache.http.conn.ssl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import javax.naming.InvalidNameException;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final to.f f49212a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49213a;

        static {
            int[] iArr = new int[b.values().length];
            f49213a = iArr;
            try {
                iArr[b.IPv4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49213a[b.IPv6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    enum b {
        IPv4(7),
        IPv6(7),
        DNS(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f49218a;

        b(int i10) {
            this.f49218a = i10;
        }
    }

    public d(to.f fVar) {
        zn.h.k(d.class);
        this.f49212a = fVar;
    }

    static b c(String str) {
        if (to.c.a(str)) {
            return b.IPv4;
        }
        if (str.startsWith("[") && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1);
        }
        return to.c.b(str) ? b.IPv6 : b.DNS;
    }

    static String d(String str) throws SSLException {
        if (str == null) {
            return null;
        }
        try {
            List rdns = new LdapName(str).getRdns();
            for (int size = rdns.size() - 1; size >= 0; size--) {
                Attribute attribute = ((Rdn) rdns.get(size)).toAttributes().get("cn");
                if (attribute != null) {
                    try {
                        Object obj = attribute.get();
                        if (obj != null) {
                            return obj.toString();
                        }
                        continue;
                    } catch (NoSuchElementException | NamingException unused) {
                        continue;
                    }
                }
            }
            return null;
        } catch (InvalidNameException unused2) {
            throw new SSLException(str + " is not a valid X500 distinguished name");
        }
    }

    static List e(X509Certificate x509Certificate) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                Integer num = list.size() >= 2 ? (Integer) list.get(0) : null;
                if (num != null && (num.intValue() == 2 || num.intValue() == 7)) {
                    Object obj = list.get(1);
                    if (obj instanceof String) {
                        arrayList.add(new j((String) obj, num.intValue()));
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    static void f(String str, String str2, to.f fVar) throws SSLPeerUnverifiedException {
        if (l(to.a.b(str), to.a.b(str2), fVar)) {
            return;
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match common name of the certificate subject: " + str2);
    }

    static void g(String str, List list, to.f fVar) throws SSLPeerUnverifiedException {
        String strB = to.a.b(str);
        for (int i10 = 0; i10 < list.size(); i10++) {
            j jVar = (j) list.get(i10);
            if (jVar.a() == 2 && l(strB, to.a.b(jVar.b()), fVar)) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    static boolean h(String str, String str2) {
        return str2 != null && str.endsWith(str2) && (str.length() == str2.length() || str.charAt((str.length() - str2.length()) - 1) == '.');
    }

    static void i(String str, List list) throws SSLPeerUnverifiedException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            j jVar = (j) list.get(i10);
            if (jVar.a() == 7 && str.equals(jVar.b())) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    static void j(String str, List list) throws SSLPeerUnverifiedException {
        String strM = m(str);
        for (int i10 = 0; i10 < list.size(); i10++) {
            j jVar = (j) list.get(i10);
            if (jVar.a() == 7 && strM.equals(m(jVar.b()))) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    private static boolean k(String str, String str2, to.f fVar, to.b bVar, boolean z10) {
        if (fVar != null && str.contains(".") && !h(str, fVar.b(str2, bVar))) {
            return false;
        }
        int iIndexOf = str2.indexOf(42);
        if (iIndexOf == -1) {
            return str.equalsIgnoreCase(str2);
        }
        String strSubstring = str2.substring(0, iIndexOf);
        String strSubstring2 = str2.substring(iIndexOf + 1);
        if (!strSubstring.isEmpty() && !str.startsWith(strSubstring)) {
            return false;
        }
        if (strSubstring2.isEmpty() || str.endsWith(strSubstring2)) {
            return (z10 && str.substring(strSubstring.length(), str.length() - strSubstring2.length()).contains(".")) ? false : true;
        }
        return false;
    }

    static boolean l(String str, String str2, to.f fVar) {
        return k(str, str2, fVar, null, true);
    }

    static String m(String str) {
        if (str == null) {
            return str;
        }
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException unused) {
            return str;
        }
    }

    public void n(String str, X509Certificate x509Certificate) throws SSLException {
        b bVarC = c(str);
        List listE = e(x509Certificate);
        if (listE != null && !listE.isEmpty()) {
            int i10 = a.f49213a[bVarC.ordinal()];
            if (i10 == 1) {
                i(str, listE);
                return;
            } else if (i10 != 2) {
                g(str, listE, this.f49212a);
                return;
            } else {
                j(str, listE);
                return;
            }
        }
        String strD = d(x509Certificate.getSubjectX500Principal().getName("RFC2253"));
        if (strD != null) {
            f(str, strD, this.f49212a);
            return;
        }
        throw new SSLException("Certificate subject for <" + str + "> doesn't contain a common name and does not have alternative names");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            n(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException unused) {
            throw null;
        }
    }
}
