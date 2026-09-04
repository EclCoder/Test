package gn;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f39622c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f39623d = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f39624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vn.c f39625b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f39626a = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        public final h a() {
            return new h(gl.r.N0(this.f39626a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Certificate certificate) {
            kotlin.jvm.internal.s.h(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + b((X509Certificate) certificate).d();
        }

        public final xn.h b(X509Certificate x509Certificate) {
            kotlin.jvm.internal.s.h(x509Certificate, "<this>");
            xn.h.a aVar = xn.h.f56912d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.s.g(encoded, "getEncoded(...)");
            return xn.h.a.g(aVar, encoded, 0, 0, 3, null).C();
        }

        private b() {
        }
    }

    public h(Set pins, vn.c cVar) {
        kotlin.jvm.internal.s.h(pins, "pins");
        this.f39624a = pins;
        this.f39625b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(h hVar, List list, String str) {
        List listA;
        vn.c cVar = hVar.f39625b;
        if (cVar != null && (listA = cVar.a(list, str)) != null) {
            list = listA;
        }
        List<Certificate> list2 = list;
        ArrayList arrayList = new ArrayList(gl.r.v(list2, 10));
        for (Certificate certificate : list2) {
            kotlin.jvm.internal.s.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    public final void b(final String hostname, final List peerCertificates) {
        kotlin.jvm.internal.s.h(hostname, "hostname");
        kotlin.jvm.internal.s.h(peerCertificates, "peerCertificates");
        d(hostname, new tl.a() { // from class: gn.g
            @Override // tl.a
            public final Object invoke() {
                return h.c(this.f39612a, peerCertificates, hostname);
            }
        });
    }

    public final void d(String hostname, tl.a cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.s.h(hostname, "hostname");
        kotlin.jvm.internal.s.h(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List listE = e(hostname);
        if (listE.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it = listE.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb2.append("\n    ");
            sb2.append(f39622c.a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(":");
        Iterator it2 = listE.iterator();
        while (it2.hasNext()) {
            android.support.v4.media.session.b.a(it2.next());
            sb2.append("\n    ");
            sb2.append((Object) null);
        }
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    public final List e(String hostname) {
        kotlin.jvm.internal.s.h(hostname, "hostname");
        Set set = this.f39624a;
        List listL = gl.r.l();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listL;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.s.c(hVar.f39624a, this.f39624a) && kotlin.jvm.internal.s.c(hVar.f39625b, this.f39625b);
    }

    public final vn.c f() {
        return this.f39625b;
    }

    public final h g(vn.c certificateChainCleaner) {
        kotlin.jvm.internal.s.h(certificateChainCleaner, "certificateChainCleaner");
        return kotlin.jvm.internal.s.c(this.f39625b, certificateChainCleaner) ? this : new h(this.f39624a, certificateChainCleaner);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f39624a.hashCode()) * 41;
        vn.c cVar = this.f39625b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ h(Set set, vn.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
