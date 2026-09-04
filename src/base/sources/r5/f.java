package r5;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f51096e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f51097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f51098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f51099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile byte[] f51100d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    private f(String str, Object obj, b bVar) {
        this.f51099c = m6.k.c(str);
        this.f51097a = obj;
        this.f51098b = (b) m6.k.e(bVar);
    }

    public static f a(String str, Object obj, b bVar) {
        return new f(str, obj, bVar);
    }

    private static b b() {
        return f51096e;
    }

    private byte[] d() {
        if (this.f51100d == null) {
            this.f51100d = this.f51099c.getBytes(e.f51095a);
        }
        return this.f51100d;
    }

    public static f e(String str) {
        return new f(str, null, b());
    }

    public static f f(String str, Object obj) {
        return new f(str, obj, b());
    }

    public Object c() {
        return this.f51097a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f51099c.equals(((f) obj).f51099c);
        }
        return false;
    }

    public void g(Object obj, MessageDigest messageDigest) {
        this.f51098b.a(d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f51099c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f51099c + "'}";
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements b {
        a() {
        }

        @Override // r5.f.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
