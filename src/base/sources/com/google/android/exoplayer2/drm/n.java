package com.google.android.exoplayer2.drm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p9.s1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface n {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f16872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f16873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f16874c;

        public a(byte[] bArr, String str, int i10) {
            this.f16872a = bArr;
            this.f16873b = str;
            this.f16874c = i10;
        }

        public byte[] a() {
            return this.f16872a;
        }

        public String b() {
            return this.f16873b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(n nVar, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        n a(UUID uuid);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f16875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f16876b;

        public d(byte[] bArr, String str) {
            this.f16875a = bArr;
            this.f16876b = str;
        }

        public byte[] a() {
            return this.f16875a;
        }

        public String b() {
            return this.f16876b;
        }
    }

    int a();

    s9.b b(byte[] bArr);

    boolean c(byte[] bArr, String str);

    void closeSession(byte[] bArr);

    a d(byte[] bArr, List list, int i10, HashMap map);

    void e(b bVar);

    d getProvisionRequest();

    byte[] openSession();

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2);

    void provideProvisionResponse(byte[] bArr);

    Map queryKeyStatus(byte[] bArr);

    void release();

    void restoreKeys(byte[] bArr, byte[] bArr2);

    default void f(byte[] bArr, s1 s1Var) {
    }
}
