package u9;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ob.d0 f54328a = new ob.d0(10);

    public ha.a a(l lVar, ma.h.a aVar) throws Throwable {
        ha.a aVarE = null;
        int i10 = 0;
        while (true) {
            try {
                lVar.peekFully(this.f54328a.e(), 0, 10);
                this.f54328a.U(0);
                if (this.f54328a.K() != 4801587) {
                    break;
                }
                this.f54328a.V(3);
                int iG = this.f54328a.G();
                int i11 = iG + 10;
                if (aVarE == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f54328a.e(), 0, bArr, 0, 10);
                    lVar.peekFully(bArr, 10, iG);
                    aVarE = new ma.h(aVar).e(bArr, i11);
                } else {
                    lVar.advancePeekPosition(iG);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        lVar.resetPeekPosition();
        lVar.advancePeekPosition(i10);
        return aVarE;
    }
}
