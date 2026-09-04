package c9;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(a9.e eVar);
    }

    public static a a() {
        return new d.b().d(a9.e.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract a9.e d();

    public boolean e() {
        return c() != null;
    }

    public p f(a9.e eVar) {
        return a().b(b()).d(eVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
