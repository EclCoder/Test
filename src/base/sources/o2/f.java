package o2;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static void a(long j10, w1.u uVar, o0[] o0VarArr) {
        while (true) {
            if (uVar.a() <= 1) {
                return;
            }
            int iC = c(uVar);
            int iC2 = c(uVar);
            int iF = uVar.f() + iC2;
            if (iC2 == -1 || iC2 > uVar.a()) {
                w1.n.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iF = uVar.g();
            } else if (iC == 4 && iC2 >= 8) {
                int iG = uVar.G();
                int iM = uVar.M();
                int iP = iM == 49 ? uVar.p() : 0;
                int iG2 = uVar.G();
                if (iM == 47) {
                    uVar.U(1);
                }
                boolean z10 = iG == 181 && (iM == 49 || iM == 47) && iG2 == 3;
                if (iM == 49) {
                    z10 &= iP == 1195456820;
                }
                if (z10) {
                    b(j10, uVar, o0VarArr);
                }
            }
            uVar.T(iF);
        }
    }

    public static void b(long j10, w1.u uVar, o0[] o0VarArr) {
        int iG = uVar.G();
        if ((iG & 64) != 0) {
            uVar.U(1);
            int i10 = (iG & 31) * 3;
            int iF = uVar.f();
            for (o0 o0Var : o0VarArr) {
                uVar.T(iF);
                o0Var.c(uVar, i10);
                w1.a.g(j10 != C.TIME_UNSET);
                o0Var.e(j10, 1, i10, 0, null);
            }
        }
    }

    private static int c(w1.u uVar) {
        int i10 = 0;
        while (uVar.a() != 0) {
            int iG = uVar.G();
            i10 += iG;
            if (iG != 255) {
                return i10;
            }
        }
        return -1;
    }
}
