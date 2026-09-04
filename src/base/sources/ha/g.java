package ha;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g implements b {
    @Override // ha.b
    public final a a(d dVar) {
        ByteBuffer byteBuffer = (ByteBuffer) ob.a.e(dVar.f16754c);
        ob.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dVar.f()) {
            return null;
        }
        return b(dVar, byteBuffer);
    }

    protected abstract a b(d dVar, ByteBuffer byteBuffer);
}
