package ji;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f42554a;

    public b(byte[] buffer) {
        s.h(buffer, "buffer");
        this.f42554a = buffer;
    }

    public final int a(int i10, int i11) {
        int i12 = i10 / 8;
        int i13 = i10 % 8;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i13 + i15) % 8;
            i14 = (i14 << 1) | ((this.f42554a[(i16 < i13 ? 1 : 0) + i12] >>> (7 - i16)) & 1);
        }
        return i14;
    }
}
