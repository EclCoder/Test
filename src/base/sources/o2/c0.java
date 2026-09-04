package o2;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f47990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f47995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f47996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f47997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f47998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f47999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f48000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f48001l;

    private c0(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, int i18, String str) {
        this.f47990a = list;
        this.f47991b = i10;
        this.f47992c = i11;
        this.f47993d = i12;
        this.f47994e = i13;
        this.f47995f = i14;
        this.f47996g = i15;
        this.f47997h = i16;
        this.f47998i = i17;
        this.f47999j = f10;
        this.f48000k = i18;
        this.f48001l = str;
    }

    public static c0 a(w1.u uVar) throws ParserException {
        boolean z10;
        try {
            uVar.U(21);
            int iG = uVar.G() & 3;
            int iG2 = uVar.G();
            int iF = uVar.f();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                z10 = true;
                if (i11 >= iG2) {
                    break;
                }
                uVar.U(1);
                int iM = uVar.M();
                for (int i13 = 0; i13 < iM; i13++) {
                    int iM2 = uVar.M();
                    i12 += iM2 + 4;
                    uVar.U(iM2);
                }
                i11++;
            }
            uVar.T(iF);
            byte[] bArr = new byte[i12];
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            float f10 = 1.0f;
            String strC = null;
            int i22 = 0;
            int i23 = 0;
            while (i22 < iG2) {
                int iG3 = uVar.G() & 63;
                int iM3 = uVar.M();
                int i24 = i10;
                while (i24 < iM3) {
                    int iM4 = uVar.M();
                    boolean z11 = z10;
                    byte[] bArr2 = x1.d.f56574a;
                    int i25 = iG;
                    System.arraycopy(bArr2, i10, bArr, i23, bArr2.length);
                    int length = i23 + bArr2.length;
                    System.arraycopy(uVar.e(), uVar.f(), bArr, length, iM4);
                    if (iG3 == 33 && i24 == 0) {
                        x1.d.a aVarH = x1.d.h(bArr, length, length + iM4);
                        i14 = aVarH.f56588k;
                        i15 = aVarH.f56589l;
                        i16 = aVarH.f56583f + 8;
                        i17 = aVarH.f56584g + 8;
                        int i26 = aVarH.f56592o;
                        int i27 = aVarH.f56593p;
                        int i28 = aVarH.f56594q;
                        float f11 = aVarH.f56590m;
                        int i29 = aVarH.f56591n;
                        strC = w1.e.c(aVarH.f56578a, aVarH.f56579b, aVarH.f56580c, aVarH.f56581d, aVarH.f56585h, aVarH.f56586i);
                        f10 = f11;
                        i21 = i29;
                        i19 = i27;
                        i20 = i28;
                        i18 = i26;
                    }
                    i23 = length + iM4;
                    uVar.U(iM4);
                    i24++;
                    z10 = z11;
                    iG = i25;
                    iG2 = iG2;
                    i10 = 0;
                }
                i22++;
                i10 = 0;
            }
            return new c0(i12 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iG + 1, i14, i15, i16, i17, i18, i19, i20, f10, i21, strC);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.a("Error parsing HEVC config", e10);
        }
    }
}
