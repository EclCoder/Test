package y2;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import sc.e;
import t1.u;
import w1.t;
import x2.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    private static u c(t tVar) {
        tVar.r(12);
        int iD = (tVar.d() + tVar.h(12)) - 4;
        tVar.r(44);
        tVar.s(tVar.h(12));
        tVar.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strL = null;
            if (tVar.d() >= iD) {
                break;
            }
            tVar.r(48);
            int iH = tVar.h(8);
            tVar.r(4);
            int iD2 = tVar.d() + tVar.h(12);
            String strL2 = null;
            while (tVar.d() < iD2) {
                int iH2 = tVar.h(8);
                int iH3 = tVar.h(8);
                int iD3 = tVar.d() + iH3;
                if (iH2 == 2) {
                    int iH4 = tVar.h(16);
                    tVar.r(8);
                    if (iH4 == 3) {
                        while (tVar.d() < iD3) {
                            strL = tVar.l(tVar.h(8), e.f52292a);
                            int iH5 = tVar.h(8);
                            for (int i10 = 0; i10 < iH5; i10++) {
                                tVar.s(tVar.h(8));
                            }
                        }
                    }
                } else if (iH2 == 21) {
                    strL2 = tVar.l(iH3, e.f52292a);
                }
                tVar.p(iD3 * 8);
            }
            tVar.p(iD2 * 8);
            if (strL != null && strL2 != null) {
                arrayList.add(new a(iH, strL + strL2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new u(arrayList);
    }

    @Override // x2.c
    protected u b(x2.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new t(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
