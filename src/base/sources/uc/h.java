package uc;

import java.nio.Buffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class h {
    static void a(Buffer buffer) {
        buffer.flip();
    }

    static void b(Buffer buffer, int i10) {
        buffer.position(i10);
    }
}
