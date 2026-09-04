package androidx.media3.exoplayer.drm;

import c2.x1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f5262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f5263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f5264c;

        public a(byte[] bArr, String str, int i10) {
            this.f5262a = bArr;
            this.f5263b = str;
            this.f5264c = i10;
        }

        public byte[] a() {
            return this.f5262a;
        }

        public String b() {
            return this.f5263b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(m mVar, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        m a(UUID uuid);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f5265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f5266b;

        public d(byte[] bArr, String str) {
            this.f5265a = bArr;
            this.f5266b = str;
        }

        public byte[] a() {
            return this.f5265a;
        }

        public String b() {
            return this.f5266b;
        }
    }

    int a();

    b2.b b(byte[] bArr);

    boolean c(byte[] bArr, String str);

    void closeSession(byte[] bArr);

    a d(byte[] bArr, List list, int i10, HashMap map);

    void f(b bVar);

    d getProvisionRequest();

    byte[] openSession();

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2);

    void provideProvisionResponse(byte[] bArr);

    Map queryKeyStatus(byte[] bArr);

    void release();

    void restoreKeys(byte[] bArr, byte[] bArr2);

    default void e(byte[] bArr, x1 x1Var) {
    }
}
