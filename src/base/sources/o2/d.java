package o2;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f48002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f48007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f48008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f48009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f48010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f48011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f48012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f48013l;

    private d(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f48002a = list;
        this.f48003b = i10;
        this.f48004c = i11;
        this.f48005d = i12;
        this.f48006e = i13;
        this.f48007f = i14;
        this.f48008g = i15;
        this.f48009h = i16;
        this.f48010i = i17;
        this.f48011j = i18;
        this.f48012k = f10;
        this.f48013l = str;
    }

    private static byte[] a(w1.u uVar) {
        int iM = uVar.M();
        int iF = uVar.f();
        uVar.U(iM);
        return w1.e.d(uVar.e(), iF, iM);
    }

    public static d b(w1.u uVar) throws ParserException {
        String strA;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        try {
            uVar.U(4);
            int iG = (uVar.G() & 3) + 1;
            if (iG == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iG2 = uVar.G() & 31;
            for (int i18 = 0; i18 < iG2; i18++) {
                arrayList.add(a(uVar));
            }
            int iG3 = uVar.G();
            for (int i19 = 0; i19 < iG3; i19++) {
                arrayList.add(a(uVar));
            }
            if (iG2 > 0) {
                x1.d.c cVarL = x1.d.l((byte[]) arrayList.get(0), iG, ((byte[]) arrayList.get(0)).length);
                int i20 = cVarL.f56603f;
                int i21 = cVarL.f56604g;
                int i22 = cVarL.f56606i + 8;
                int i23 = cVarL.f56607j + 8;
                int i24 = cVarL.f56614q;
                int i25 = cVarL.f56615r;
                int i26 = cVarL.f56616s;
                int i27 = cVarL.f56617t;
                float f11 = cVarL.f56605h;
                strA = w1.e.a(cVarL.f56598a, cVarL.f56599b, cVarL.f56600c);
                i14 = i26;
                i15 = i27;
                f10 = f11;
                i13 = i23;
                i16 = i24;
                i17 = i25;
                i10 = i20;
                i11 = i21;
                i12 = i22;
            } else {
                strA = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f10 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new d(arrayList, iG, i10, i11, i12, i13, i16, i17, i14, i15, f10, strA);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.a("Error parsing AVC config", e10);
        }
    }
}
