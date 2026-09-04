package t1;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f52570f = w1.c0.s0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f52571g = w1.c0.s0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o[] f52575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52576e;

    public b0(o... oVarArr) {
        this("", oVarArr);
    }

    private static void c(String str, String str2, String str3, int i10) {
        w1.n.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    private static String d(String str) {
        return (str == null || str.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private static int e(int i10) {
        return i10 | 16384;
    }

    private void f() {
        String strD = d(this.f52575d[0].f52747d);
        int iE = e(this.f52575d[0].f52749f);
        int i10 = 1;
        while (true) {
            o[] oVarArr = this.f52575d;
            if (i10 >= oVarArr.length) {
                return;
            }
            if (!strD.equals(d(oVarArr[i10].f52747d))) {
                o[] oVarArr2 = this.f52575d;
                c("languages", oVarArr2[0].f52747d, oVarArr2[i10].f52747d, i10);
                return;
            } else {
                if (iE != e(this.f52575d[i10].f52749f)) {
                    c("role flags", Integer.toBinaryString(this.f52575d[0].f52749f), Integer.toBinaryString(this.f52575d[i10].f52749f), i10);
                    return;
                }
                i10++;
            }
        }
    }

    public o a(int i10) {
        return this.f52575d[i10];
    }

    public int b(o oVar) {
        int i10 = 0;
        while (true) {
            o[] oVarArr = this.f52575d;
            if (i10 >= oVarArr.length) {
                return -1;
            }
            if (oVar == oVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (this.f52573b.equals(b0Var.f52573b) && Arrays.equals(this.f52575d, b0Var.f52575d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f52576e == 0) {
            this.f52576e = ((527 + this.f52573b.hashCode()) * 31) + Arrays.hashCode(this.f52575d);
        }
        return this.f52576e;
    }

    public b0(String str, o... oVarArr) {
        w1.a.a(oVarArr.length > 0);
        this.f52573b = str;
        this.f52575d = oVarArr;
        this.f52572a = oVarArr.length;
        int iF = v.f(oVarArr[0].f52757n);
        this.f52574c = iF == -1 ? v.f(oVarArr[0].f52756m) : iF;
        f();
    }
}
