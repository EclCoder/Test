package t3;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import l3.r;
import qd.qPi.SVWsZyNSAChGIA;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f53124a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f53125b = new b();

    private static int d(u uVar) {
        int i10 = -1;
        int iF = 0;
        while (i10 == -1) {
            iF = uVar.f();
            String strR = uVar.r();
            if (strR == null) {
                i10 = 0;
            } else if ("STYLE".equals(strR)) {
                i10 = 2;
            } else {
                i10 = strR.startsWith("NOTE") ? 1 : 3;
            }
        }
        uVar.T(iF);
        return i10;
    }

    private static void e(u uVar) {
        while (!TextUtils.isEmpty(uVar.r())) {
        }
    }

    @Override // l3.r
    public int c() {
        return 1;
    }

    @Override // l3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, w1.h hVar) {
        d dVarN;
        this.f53124a.R(bArr, i11 + i10);
        this.f53124a.T(i10);
        ArrayList arrayList = new ArrayList();
        try {
            h.d(this.f53124a);
            while (!TextUtils.isEmpty(this.f53124a.r())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iD = d(this.f53124a);
                if (iD == 0) {
                    l3.i.c(new j(arrayList2), bVar, hVar);
                    return;
                }
                if (iD == 1) {
                    e(this.f53124a);
                } else if (iD == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException(SVWsZyNSAChGIA.EHdPDIRh);
                    }
                    this.f53124a.r();
                    arrayList.addAll(this.f53125b.d(this.f53124a));
                } else if (iD == 3 && (dVarN = e.n(this.f53124a, arrayList)) != null) {
                    arrayList2.add(dVarN);
                }
            }
        } catch (ParserException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
