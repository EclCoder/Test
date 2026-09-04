package o2;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.u f48014a = new w1.u(10);

    public t1.u a(q qVar, c3.h.a aVar) throws Throwable {
        t1.u uVarE = null;
        int i10 = 0;
        while (true) {
            try {
                qVar.peekFully(this.f48014a.e(), 0, 10);
                this.f48014a.T(0);
                if (this.f48014a.J() != 4801587) {
                    break;
                }
                this.f48014a.U(3);
                int iF = this.f48014a.F();
                int i11 = iF + 10;
                if (uVarE == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f48014a.e(), 0, bArr, 0, 10);
                    qVar.peekFully(bArr, 10, iF);
                    uVarE = new c3.h(aVar).e(bArr, i11);
                } else {
                    qVar.advancePeekPosition(iF);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        qVar.resetPeekPosition();
        qVar.advancePeekPosition(i10);
        return uVarE;
    }
}
