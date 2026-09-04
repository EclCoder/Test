package k8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class g extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i f43011j;

    public g(boolean z10, i iVar) {
        this.f42997a = z10;
        this.f43011j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f42998b = iVar.k(byteBufferAllocate, 16L);
        this.f42999c = iVar.q(byteBufferAllocate, 28L);
        this.f43000d = iVar.q(byteBufferAllocate, 32L);
        this.f43001e = iVar.k(byteBufferAllocate, 42L);
        this.f43002f = iVar.k(byteBufferAllocate, 44L);
        this.f43003g = iVar.k(byteBufferAllocate, 46L);
        this.f43004h = iVar.k(byteBufferAllocate, 48L);
        this.f43005i = iVar.k(byteBufferAllocate, 50L);
    }

    @Override // k8.d
    public c a(long j10, int i10) {
        return new a(this.f43011j, this, j10, i10);
    }

    @Override // k8.d
    public e b(long j10) {
        return new j(this.f43011j, this, j10);
    }

    @Override // k8.d
    public f c(int i10) {
        return new l(this.f43011j, this, i10);
    }
}
