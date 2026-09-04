package k8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b extends c {
    public b(i iVar, d dVar, long j10, int i10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVar.f42997a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = j10 + ((long) (i10 * 16));
        this.f42995a = iVar.l(byteBufferAllocate, j11);
        this.f42996b = iVar.l(byteBufferAllocate, j11 + 8);
    }
}
