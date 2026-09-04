package t1;

import c1.pGX.geAgcEazw;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f52668h = new b().d(1).c(2).e(3).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f52669i = new b().d(1).c(1).e(2).a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f52670j = w1.c0.s0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f52671k = w1.c0.s0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f52672l = w1.c0.s0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f52673m = w1.c0.s0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f52674n = w1.c0.s0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f52675o = w1.c0.s0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f52679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f52680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f52681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f52682g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f52683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f52684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f52685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f52686d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f52687e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f52688f;

        public f a() {
            return new f(this.f52683a, this.f52684b, this.f52685c, this.f52686d, this.f52687e, this.f52688f);
        }

        public b b(int i10) {
            this.f52688f = i10;
            return this;
        }

        public b c(int i10) {
            this.f52684b = i10;
            return this;
        }

        public b d(int i10) {
            this.f52683a = i10;
            return this;
        }

        public b e(int i10) {
            this.f52685c = i10;
            return this;
        }

        public b f(byte[] bArr) {
            this.f52686d = bArr;
            return this;
        }

        public b g(int i10) {
            this.f52687e = i10;
            return this;
        }

        public b() {
            this.f52683a = -1;
            this.f52684b = -1;
            this.f52685c = -1;
            this.f52687e = -1;
            this.f52688f = -1;
        }

        private b(f fVar) {
            this.f52683a = fVar.f52676a;
            this.f52684b = fVar.f52677b;
            this.f52685c = fVar.f52678c;
            this.f52686d = fVar.f52679d;
            this.f52687e = fVar.f52680e;
            this.f52688f = fVar.f52681f;
        }
    }

    private static String b(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Chroma";
    }

    private static String c(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 == 1) {
            return "Full range";
        }
        if (i10 == 2) {
            return geAgcEazw.LBVvmMNu;
        }
        return "Undefined color range " + i10;
    }

    private static String d(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 == 1) {
            return "BT709";
        }
        if (i10 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i10;
    }

    private static String e(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 == 6) {
            return "ST2084 PQ";
        }
        if (i10 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i10;
    }

    public static boolean h(f fVar) {
        if (fVar == null) {
            return true;
        }
        int i10 = fVar.f52676a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = fVar.f52677b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = fVar.f52678c;
        if ((i12 != -1 && i12 != 3) || fVar.f52679d != null) {
            return false;
        }
        int i13 = fVar.f52681f;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = fVar.f52680e;
        return i14 == -1 || i14 == 8;
    }

    public static int j(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int k(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String l(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Luma";
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f52676a == fVar.f52676a && this.f52677b == fVar.f52677b && this.f52678c == fVar.f52678c && Arrays.equals(this.f52679d, fVar.f52679d) && this.f52680e == fVar.f52680e && this.f52681f == fVar.f52681f) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return (this.f52680e == -1 || this.f52681f == -1) ? false : true;
    }

    public boolean g() {
        return (this.f52676a == -1 || this.f52677b == -1 || this.f52678c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f52682g == 0) {
            this.f52682g = ((((((((((527 + this.f52676a) * 31) + this.f52677b) * 31) + this.f52678c) * 31) + Arrays.hashCode(this.f52679d)) * 31) + this.f52680e) * 31) + this.f52681f;
        }
        return this.f52682g;
    }

    public boolean i() {
        return f() || g();
    }

    public String m() {
        String str;
        String strF = g() ? w1.c0.F("%s/%s/%s", d(this.f52676a), c(this.f52677b), e(this.f52678c)) : "NA/NA/NA";
        if (f()) {
            str = this.f52680e + "/" + this.f52681f;
        } else {
            str = "NA/NA";
        }
        return strF + "/" + str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(d(this.f52676a));
        sb2.append(", ");
        sb2.append(c(this.f52677b));
        sb2.append(", ");
        sb2.append(e(this.f52678c));
        sb2.append(", ");
        sb2.append(this.f52679d != null);
        sb2.append(", ");
        sb2.append(l(this.f52680e));
        sb2.append(", ");
        sb2.append(b(this.f52681f));
        sb2.append(")");
        return sb2.toString();
    }

    private f(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f52676a = i10;
        this.f52677b = i11;
        this.f52678c = i12;
        this.f52679d = bArr;
        this.f52680e = i13;
        this.f52681f = i14;
    }
}
