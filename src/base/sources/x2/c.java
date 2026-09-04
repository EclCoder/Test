package x2;

import java.nio.ByteBuffer;
import t1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements a {
    @Override // x2.a
    public final u a(b bVar) {
        ByteBuffer byteBuffer = (ByteBuffer) w1.a.e(bVar.f4864d);
        w1.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(bVar, byteBuffer);
    }

    protected abstract u b(b bVar, ByteBuffer byteBuffer);
}
