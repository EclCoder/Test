package lb;

import android.os.SystemClock;
import com.google.android.exoplayer2.i2;
import com.google.common.collect.c0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z {
    public static i2 a(t.a aVar, List[] listArr) {
        boolean z10;
        c0.a aVar2 = new c0.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            ra.x xVarF = aVar.f(i10);
            List list = listArr[i10];
            for (int i11 = 0; i11 < xVarF.f51256a; i11++) {
                ra.v vVarB = xVarF.b(i11);
                boolean z11 = aVar.a(i10, i11, false) != 0;
                int i12 = vVarB.f51248a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < vVarB.f51248a; i13++) {
                    iArr[i13] = aVar.g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        u uVar = (u) list.get(i14);
                        if (uVar.getTrackGroup().equals(vVarB) && uVar.indexOf(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                aVar2.a(new i2.a(vVarB, z11, iArr, zArr));
            }
        }
        ra.x xVarH = aVar.h();
        for (int i15 = 0; i15 < xVarH.f51256a; i15++) {
            ra.v vVarB2 = xVarH.b(i15);
            int[] iArr2 = new int[vVarB2.f51248a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new i2.a(vVarB2, false, iArr2, new boolean[vVarB2.f51248a]));
        }
        return new i2(aVar2.m());
    }

    public static i2 b(t.a aVar, u[] uVarArr) {
        List[] listArr = new List[uVarArr.length];
        for (int i10 = 0; i10 < uVarArr.length; i10++) {
            u uVar = uVarArr[i10];
            listArr[i10] = uVar != null ? c0.D(uVar) : c0.C();
        }
        return a(aVar, listArr);
    }

    public static com.google.android.exoplayer2.upstream.c.a c(r rVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (rVar.d(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        return new com.google.android.exoplayer2.upstream.c.a(1, 0, length, i10);
    }
}
