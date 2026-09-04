package o2;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class m implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f48113a = new byte[4096];

    @Override // o2.o0
    public int d(t1.g gVar, int i10, boolean z10, int i11) throws EOFException {
        int i12 = gVar.read(this.f48113a, 0, Math.min(this.f48113a.length, i10));
        if (i12 != -1) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // o2.o0
    public void f(w1.u uVar, int i10, int i11) {
        uVar.U(i10);
    }

    @Override // o2.o0
    public void b(t1.o oVar) {
    }

    @Override // o2.o0
    public void e(long j10, int i10, int i11, int i12, o0.a aVar) {
    }
}
