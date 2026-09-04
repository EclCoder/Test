package vn;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0844a f55682c = new C0844a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f55683b;

    /* JADX INFO: renamed from: vn.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0844a {
        public /* synthetic */ C0844a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0844a() {
        }
    }

    public a(e trustRootIndex) {
        s.h(trustRootIndex, "trustRootIndex");
        this.f55683b = trustRootIndex;
    }

    private final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i10) {
        if (!s.c(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i10) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // vn.c
    public List a(List chain, String hostname) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        s.h(chain, "chain");
        s.h(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        s.g(objRemoveFirst, "removeFirst(...)");
        arrayList.add(objRemoveFirst);
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            s.f(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate2 = (X509Certificate) obj;
            X509Certificate x509CertificateA = this.f55683b.a(x509Certificate2);
            if (x509CertificateA != null) {
                if (arrayList.size() > 1 || !s.c(x509Certificate2, x509CertificateA)) {
                    arrayList.add(x509CertificateA);
                }
                if (b(x509CertificateA, x509CertificateA, arrayList.size() - 2)) {
                    return arrayList;
                }
                z10 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                s.g(it, "iterator(...)");
                do {
                    if (!it.hasNext()) {
                        if (!z10) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate2);
                        }
                        return arrayList;
                    }
                    Object next = it.next();
                    s.f(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    x509Certificate = (X509Certificate) next;
                } while (!b(x509Certificate2, x509Certificate, arrayList.size() - 1));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && s.c(((a) obj).f55683b, this.f55683b);
    }

    public int hashCode() {
        return this.f55683b.hashCode();
    }
}
