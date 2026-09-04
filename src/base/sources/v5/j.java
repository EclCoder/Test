package v5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import m6.k;
import m6.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m6.h f55189a = new m6.h(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0.d f55190b = n6.a.d(10, new a());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements n6.a.d {
        a() {
        }

        @Override // n6.a.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements n6.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MessageDigest f55192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n6.c f55193b = n6.c.a();

        b(MessageDigest messageDigest) {
            this.f55192a = messageDigest;
        }

        @Override // n6.a.f
        public n6.c d() {
            return this.f55193b;
        }
    }

    private String a(r5.e eVar) {
        b bVar = (b) k.e((b) this.f55190b.b());
        try {
            eVar.a(bVar.f55192a);
            return l.x(bVar.f55192a.digest());
        } finally {
            this.f55190b.a(bVar);
        }
    }

    public String b(r5.e eVar) {
        String strA;
        synchronized (this.f55189a) {
            strA = (String) this.f55189a.h(eVar);
        }
        if (strA == null) {
            strA = a(eVar);
        }
        synchronized (this.f55189a) {
            this.f55189a.l(eVar, strA);
        }
        return strA;
    }
}
