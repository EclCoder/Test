package pb;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;
import ob.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f49856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f49859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f49861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f49863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f49864i;

    private f(List list, int i10, int i11, int i12, int i13, int i14, int i15, float f10, String str) {
        this.f49856a = list;
        this.f49857b = i10;
        this.f49858c = i11;
        this.f49859d = i12;
        this.f49860e = i13;
        this.f49861f = i14;
        this.f49862g = i15;
        this.f49863h = f10;
        this.f49864i = str;
    }

    public static f a(d0 d0Var) throws ParserException {
        boolean z10;
        try {
            d0Var.V(21);
            int iH = d0Var.H() & 3;
            int iH2 = d0Var.H();
            int iF = d0Var.f();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                z10 = true;
                if (i11 >= iH2) {
                    break;
                }
                d0Var.V(1);
                int iN = d0Var.N();
                for (int i13 = 0; i13 < iN; i13++) {
                    int iN2 = d0Var.N();
                    i12 += iN2 + 4;
                    d0Var.V(iN2);
                }
                i11++;
            }
            d0Var.U(iF);
            byte[] bArr = new byte[i12];
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            float f10 = 1.0f;
            String strC = null;
            int i19 = 0;
            int i20 = 0;
            while (i19 < iH2) {
                int iH3 = d0Var.H() & 63;
                int iN3 = d0Var.N();
                int i21 = i10;
                while (i21 < iN3) {
                    int iN4 = d0Var.N();
                    boolean z11 = z10;
                    byte[] bArr2 = ob.z.f48467a;
                    int i22 = iH;
                    System.arraycopy(bArr2, i10, bArr, i20, bArr2.length);
                    int length = i20 + bArr2.length;
                    System.arraycopy(d0Var.e(), d0Var.f(), bArr, length, iN4);
                    if (iH3 == 33 && i21 == 0) {
                        ob.z.a aVarH = ob.z.h(bArr, length, length + iN4);
                        i14 = aVarH.f48481k;
                        i15 = aVarH.f48482l;
                        i16 = aVarH.f48484n;
                        int i23 = aVarH.f48485o;
                        int i24 = aVarH.f48486p;
                        float f11 = aVarH.f48483m;
                        strC = ob.e.c(aVarH.f48471a, aVarH.f48472b, aVarH.f48473c, aVarH.f48474d, aVarH.f48478h, aVarH.f48479i);
                        i18 = i24;
                        f10 = f11;
                        i17 = i23;
                    }
                    i20 = length + iN4;
                    d0Var.V(iN4);
                    i21++;
                    z10 = z11;
                    iH = i22;
                    iH2 = iH2;
                    i10 = 0;
                }
                i19++;
                i10 = 0;
            }
            return new f(i12 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iH + 1, i14, i15, i16, i17, i18, f10, strC);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.a("Error parsing HEVC config", e10);
        }
    }
}
