package k8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class k extends e {
    public k(i iVar, d dVar, long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVar.f42997a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = dVar.f42999c + (j10 * ((long) dVar.f43001e));
        this.f43006a = iVar.q(byteBufferAllocate, j11);
        this.f43007b = iVar.l(byteBufferAllocate, 8 + j11);
        this.f43008c = iVar.l(byteBufferAllocate, 16 + j11);
        this.f43009d = iVar.l(byteBufferAllocate, j11 + 40);
    }
}
