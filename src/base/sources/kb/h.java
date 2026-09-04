package kb;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import ob.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends bb.h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d0 f43156o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c f43157p;

    public h() {
        super("WebvttDecoder");
        this.f43156o = new d0();
        this.f43157p = new c();
    }

    private static int x(d0 d0Var) {
        int i10 = -1;
        int iF = 0;
        while (i10 == -1) {
            iF = d0Var.f();
            String strS = d0Var.s();
            if (strS == null) {
                i10 = 0;
            } else if ("STYLE".equals(strS)) {
                i10 = 2;
            } else {
                i10 = strS.startsWith("NOTE") ? 1 : 3;
            }
        }
        d0Var.U(iF);
        return i10;
    }

    private static void y(d0 d0Var) {
        while (!TextUtils.isEmpty(d0Var.s())) {
        }
    }

    @Override // bb.h
    protected bb.i v(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        e eVarN;
        this.f43156o.S(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            i.e(this.f43156o);
            while (!TextUtils.isEmpty(this.f43156o.s())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iX = x(this.f43156o);
                if (iX == 0) {
                    return new k(arrayList2);
                }
                if (iX == 1) {
                    y(this.f43156o);
                } else if (iX == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                    this.f43156o.s();
                    arrayList.addAll(this.f43157p.d(this.f43156o));
                } else if (iX == 3 && (eVarN = f.n(this.f43156o, arrayList)) != null) {
                    arrayList2.add(eVarN);
                }
            }
        } catch (ParserException e10) {
            throw new SubtitleDecoderException(e10);
        }
    }
}
