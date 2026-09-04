package k2;

import com.google.common.collect.c0;
import java.util.Arrays;
import java.util.List;
import t1.b0;
import t1.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static d0 a(s.a aVar, List[] listArr) {
        boolean z10;
        c0.a aVar2 = new c0.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            i2.v vVarF = aVar.f(i10);
            List list = listArr[i10];
            for (int i11 = 0; i11 < vVarF.f40818a; i11++) {
                b0 b0VarB = vVarF.b(i11);
                boolean z11 = aVar.a(i10, i11, false) != 0;
                int i12 = b0VarB.f52572a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < b0VarB.f52572a; i13++) {
                    iArr[i13] = aVar.g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        t tVar = (t) list.get(i14);
                        if (tVar.getTrackGroup().equals(b0VarB) && tVar.indexOf(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                aVar2.a(new d0.a(b0VarB, z11, iArr, zArr));
            }
        }
        i2.v vVarH = aVar.h();
        for (int i15 = 0; i15 < vVarH.f40818a; i15++) {
            b0 b0VarB2 = vVarH.b(i15);
            int[] iArr2 = new int[b0VarB2.f52572a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new d0.a(b0VarB2, false, iArr2, new boolean[b0VarB2.f52572a]));
        }
        return new d0(aVar2.m());
    }

    public static d0 b(s.a aVar, t[] tVarArr) {
        List[] listArr = new List[tVarArr.length];
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            t tVar = tVarArr[i10];
            listArr[i10] = tVar != null ? c0.D(tVar) : c0.C();
        }
        return a(aVar, listArr);
    }
}
