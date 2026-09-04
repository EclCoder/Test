package u9;

import com.google.android.exoplayer2.v0;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f54304a = new byte[4096];

    @Override // u9.b0
    public void b(ob.d0 d0Var, int i10, int i11) {
        d0Var.V(i10);
    }

    @Override // u9.b0
    public int d(nb.h hVar, int i10, boolean z10, int i11) throws EOFException {
        int i12 = hVar.read(this.f54304a, 0, Math.min(this.f54304a.length, i10));
        if (i12 != -1) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // u9.b0
    public void e(v0 v0Var) {
    }

    @Override // u9.b0
    public void f(long j10, int i10, int i11, int i12, b0.a aVar) {
    }
}
