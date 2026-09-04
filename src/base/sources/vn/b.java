package vn;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f55684a;

    public b(X509Certificate... caCerts) {
        s.h(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : caCerts) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f55684a = linkedHashMap;
    }

    @Override // vn.e
    public X509Certificate a(X509Certificate cert) {
        s.h(cert, "cert");
        Set set = (Set) this.f55684a.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        for (Object obj2 : set) {
            try {
                cert.verify(((X509Certificate) obj2).getPublicKey());
                obj = obj2;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof b) && s.c(((b) obj).f55684a, this.f55684a);
        }
        return true;
    }

    public int hashCode() {
        return this.f55684a.hashCode();
    }
}
