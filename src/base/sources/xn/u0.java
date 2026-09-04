package xn;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class u0 {
    public static final byte[] a(String str) {
        kotlin.jvm.internal.s.h(str, "<this>");
        byte[] bytes = str.getBytes(bm.d.f9079b);
        kotlin.jvm.internal.s.g(bytes, "getBytes(...)");
        return bytes;
    }

    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    public static final String c(byte[] bArr) {
        kotlin.jvm.internal.s.h(bArr, "<this>");
        return new String(bArr, bm.d.f9079b);
    }
}
