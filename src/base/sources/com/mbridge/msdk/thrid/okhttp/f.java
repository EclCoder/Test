package com.mbridge.msdk.thrid.okhttp;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f33018c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<b> f33019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.internal.tls.c f33020b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<b> f33021a = new ArrayList();

        public f a() {
            return new f(new LinkedHashSet(this.f33021a), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f33022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f33023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f33024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.mbridge.msdk.thrid.okio.f f33025d;

        boolean a(String str) {
            if (!this.f33022a.startsWith("*.")) {
                return str.equals(this.f33023b);
            }
            int iIndexOf = str.indexOf(46);
            if ((str.length() - iIndexOf) - 1 != this.f33023b.length()) {
                return false;
            }
            String str2 = this.f33023b;
            return str.regionMatches(false, iIndexOf + 1, str2, 0, str2.length());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f33022a.equals(bVar.f33022a) && this.f33024c.equals(bVar.f33024c) && this.f33025d.equals(bVar.f33025d);
        }

        public int hashCode() {
            return ((((this.f33022a.hashCode() + 527) * 31) + this.f33024c.hashCode()) * 31) + this.f33025d.hashCode();
        }

        public String toString() {
            return this.f33024c + this.f33025d.d();
        }
    }

    f(Set<b> set, com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar) {
        this.f33019a = set;
        this.f33020b = cVar;
    }

    static com.mbridge.msdk.thrid.okio.f b(X509Certificate x509Certificate) {
        return com.mbridge.msdk.thrid.okio.f.a(x509Certificate.getPublicKey().getEncoded()).i();
    }

    public void a(String str, List<Certificate> list) {
        List<b> listA = a(str);
        if (listA.isEmpty()) {
            return;
        }
        com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar = this.f33020b;
        if (cVar != null) {
            list = cVar.a(list, str);
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i10);
            int size2 = listA.size();
            com.mbridge.msdk.thrid.okio.f fVarB = null;
            com.mbridge.msdk.thrid.okio.f fVarA = null;
            for (int i11 = 0; i11 < size2; i11++) {
                b bVar = listA.get(i11);
                if (bVar.f33024c.equals("sha256/")) {
                    if (fVarB == null) {
                        fVarB = b(x509Certificate);
                    }
                    if (bVar.f33025d.equals(fVarB)) {
                        return;
                    }
                } else {
                    if (!bVar.f33024c.equals("sha1/")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f33024c);
                    }
                    if (fVarA == null) {
                        fVarA = a(x509Certificate);
                    }
                    if (bVar.f33025d.equals(fVarA)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i12);
            sb2.append("\n    ");
            sb2.append(a((Certificate) x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(":");
        int size4 = listA.size();
        for (int i13 = 0; i13 < size4; i13++) {
            b bVar2 = listA.get(i13);
            sb2.append("\n    ");
            sb2.append(bVar2);
        }
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f33020b, fVar.f33020b) && this.f33019a.equals(fVar.f33019a);
    }

    public int hashCode() {
        com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar = this.f33020b;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.f33019a.hashCode();
    }

    List<b> a(String str) {
        List<b> arrayList = Collections.EMPTY_LIST;
        for (b bVar : this.f33019a) {
            if (bVar.a(str)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    f a(com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar) {
        return com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f33020b, cVar) ? this : new f(this.f33019a, cVar);
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + b((X509Certificate) certificate).d();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static com.mbridge.msdk.thrid.okio.f a(X509Certificate x509Certificate) {
        return com.mbridge.msdk.thrid.okio.f.a(x509Certificate.getPublicKey().getEncoded()).h();
    }
}
