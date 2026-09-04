package u9;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static void a(long j10, ob.d0 d0Var, b0[] b0VarArr) {
        while (true) {
            if (d0Var.a() <= 1) {
                return;
            }
            int iC = c(d0Var);
            int iC2 = c(d0Var);
            int iF = d0Var.f() + iC2;
            if (iC2 == -1 || iC2 > d0Var.a()) {
                ob.u.i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iF = d0Var.g();
            } else if (iC == 4 && iC2 >= 8) {
                int iH = d0Var.H();
                int iN = d0Var.N();
                int iQ = iN == 49 ? d0Var.q() : 0;
                int iH2 = d0Var.H();
                if (iN == 47) {
                    d0Var.V(1);
                }
                boolean z10 = iH == 181 && (iN == 49 || iN == 47) && iH2 == 3;
                if (iN == 49) {
                    z10 &= iQ == 1195456820;
                }
                if (z10) {
                    b(j10, d0Var, b0VarArr);
                }
            }
            d0Var.U(iF);
        }
    }

    public static void b(long j10, ob.d0 d0Var, b0[] b0VarArr) {
        long j11;
        int iH = d0Var.H();
        if ((iH & 64) != 0) {
            d0Var.V(1);
            int i10 = (iH & 31) * 3;
            int iF = d0Var.f();
            int length = b0VarArr.length;
            int i11 = 0;
            while (i11 < length) {
                b0 b0Var = b0VarArr[i11];
                d0Var.U(iF);
                b0Var.c(d0Var, i10);
                if (j10 != C.TIME_UNSET) {
                    j11 = j10;
                    b0Var.f(j11, 1, i10, 0, null);
                } else {
                    j11 = j10;
                }
                i11++;
                j10 = j11;
            }
        }
    }

    private static int c(ob.d0 d0Var) {
        int i10 = 0;
        while (d0Var.a() != 0) {
            int iH = d0Var.H();
            i10 += iH;
            if (iH != 255) {
                return i10;
            }
        }
        return -1;
    }
}
