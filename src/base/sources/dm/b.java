package dm;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class b {
    public static final void a(long j10, byte[] dst, int i10, int i11, int i12) {
        s.h(dst, "dst");
        c.g(j10, dst, i10, i11, i12);
    }

    public static final Object b(a uuid) {
        s.h(uuid, "uuid");
        return new d(uuid.h(), uuid.g());
    }

    public static final a c(String hexString) {
        s.h(hexString, "hexString");
        return c.i(hexString);
    }

    public static final a d(String hexDashString) {
        s.h(hexDashString, "hexDashString");
        return c.j(hexDashString);
    }
}
