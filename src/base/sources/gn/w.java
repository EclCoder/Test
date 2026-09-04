package gn;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f39767e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f39768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f39769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f39770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fl.k f39771d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w c(i0 tlsVersion, j cipherSuite, List peerCertificates, List localCertificates) {
            kotlin.jvm.internal.s.h(tlsVersion, "tlsVersion");
            kotlin.jvm.internal.s.h(cipherSuite, "cipherSuite");
            kotlin.jvm.internal.s.h(peerCertificates, "peerCertificates");
            kotlin.jvm.internal.s.h(localCertificates, "localCertificates");
            final List listV = hn.p.v(peerCertificates);
            return new w(tlsVersion, cipherSuite, hn.p.v(localCertificates), new tl.a() { // from class: gn.u
                @Override // tl.a
                public final Object invoke() {
                    return w.a.e(listV);
                }
            });
        }

        public final w d(SSLSession sSLSession) throws IOException {
            final List listL;
            kotlin.jvm.internal.s.h(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (kotlin.jvm.internal.s.c(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || kotlin.jvm.internal.s.c(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            j jVarB = j.f39643b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (kotlin.jvm.internal.s.c("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            i0 i0VarA = i0.f39632b.a(protocol);
            try {
                listL = hn.p.w(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listL = gl.r.l();
            }
            return new w(i0VarA, jVarB, hn.p.w(sSLSession.getLocalCertificates()), new tl.a() { // from class: gn.v
                @Override // tl.a
                public final Object invoke() {
                    return w.a.f(listL);
                }
            });
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List e(List list) {
            return list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List f(List list) {
            return list;
        }
    }

    public w(i0 tlsVersion, j cipherSuite, List localCertificates, final tl.a peerCertificatesFn) {
        kotlin.jvm.internal.s.h(tlsVersion, "tlsVersion");
        kotlin.jvm.internal.s.h(cipherSuite, "cipherSuite");
        kotlin.jvm.internal.s.h(localCertificates, "localCertificates");
        kotlin.jvm.internal.s.h(peerCertificatesFn, "peerCertificatesFn");
        this.f39768a = tlsVersion;
        this.f39769b = cipherSuite;
        this.f39770c = localCertificates;
        this.f39771d = fl.l.b(new tl.a() { // from class: gn.t
            @Override // tl.a
            public final Object invoke() {
                return w.f(peerCertificatesFn);
            }
        });
    }

    private final String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        kotlin.jvm.internal.s.g(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(tl.a aVar) {
        try {
            return (List) aVar.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return gl.r.l();
        }
    }

    public final j b() {
        return this.f39769b;
    }

    public final List d() {
        return this.f39770c;
    }

    public final List e() {
        return (List) this.f39771d.getValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return wVar.f39768a == this.f39768a && kotlin.jvm.internal.s.c(wVar.f39769b, this.f39769b) && kotlin.jvm.internal.s.c(wVar.e(), e()) && kotlin.jvm.internal.s.c(wVar.f39770c, this.f39770c);
    }

    public final i0 g() {
        return this.f39768a;
    }

    public int hashCode() {
        return ((((((527 + this.f39768a.hashCode()) * 31) + this.f39769b.hashCode()) * 31) + e().hashCode()) * 31) + this.f39770c.hashCode();
    }

    public String toString() {
        List listE = e();
        ArrayList arrayList = new ArrayList(gl.r.v(listE, 10));
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(c((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.f39768a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f39769b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List list = this.f39770c;
        ArrayList arrayList2 = new ArrayList(gl.r.v(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
