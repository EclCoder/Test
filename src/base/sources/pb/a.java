package pb;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;
import ob.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f49814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f49817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f49819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f49821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f49822i;

    private a(List list, int i10, int i11, int i12, int i13, int i14, int i15, float f10, String str) {
        this.f49814a = list;
        this.f49815b = i10;
        this.f49816c = i11;
        this.f49817d = i12;
        this.f49818e = i13;
        this.f49819f = i14;
        this.f49820g = i15;
        this.f49821h = f10;
        this.f49822i = str;
    }

    private static byte[] a(d0 d0Var) {
        int iN = d0Var.N();
        int iF = d0Var.f();
        d0Var.V(iN);
        return ob.e.d(d0Var.e(), iF, iN);
    }

    public static a b(d0 d0Var) throws ParserException {
        String strA;
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        try {
            d0Var.V(4);
            int iH = (d0Var.H() & 3) + 1;
            if (iH == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iH2 = d0Var.H() & 31;
            for (int i15 = 0; i15 < iH2; i15++) {
                arrayList.add(a(d0Var));
            }
            int iH3 = d0Var.H();
            for (int i16 = 0; i16 < iH3; i16++) {
                arrayList.add(a(d0Var));
            }
            if (iH2 > 0) {
                ob.z.c cVarL = ob.z.l((byte[]) arrayList.get(0), iH, ((byte[]) arrayList.get(0)).length);
                int i17 = cVarL.f48495f;
                int i18 = cVarL.f48496g;
                int i19 = cVarL.f48504o;
                int i20 = cVarL.f48505p;
                int i21 = cVarL.f48506q;
                float f11 = cVarL.f48497h;
                strA = ob.e.a(cVarL.f48490a, cVarL.f48491b, cVarL.f48492c);
                i12 = i20;
                i13 = i21;
                f10 = f11;
                i10 = i17;
                i11 = i18;
                i14 = i19;
            } else {
                strA = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                f10 = 1.0f;
                i14 = -1;
            }
            return new a(arrayList, iH, i10, i11, i14, i12, i13, f10, strA);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.a("Error parsing AVC config", e10);
        }
    }
}
