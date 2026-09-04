package k8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class h extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i f43012j;

    public h(boolean z10, i iVar) {
        this.f42997a = z10;
        this.f43012j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f42998b = iVar.k(byteBufferAllocate, 16L);
        this.f42999c = iVar.l(byteBufferAllocate, 32L);
        this.f43000d = iVar.l(byteBufferAllocate, 40L);
        this.f43001e = iVar.k(byteBufferAllocate, 54L);
        this.f43002f = iVar.k(byteBufferAllocate, 56L);
        this.f43003g = iVar.k(byteBufferAllocate, 58L);
        this.f43004h = iVar.k(byteBufferAllocate, 60L);
        this.f43005i = iVar.k(byteBufferAllocate, 62L);
    }

    @Override // k8.d
    public c a(long j10, int i10) {
        return new b(this.f43012j, this, j10, i10);
    }

    @Override // k8.d
    public e b(long j10) {
        return new k(this.f43012j, this, j10);
    }

    @Override // k8.d
    public f c(int i10) {
        return new m(this.f43012j, this, i10);
    }
}
