package i8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final char[] f41207l = new char[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f41208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private char[] f41209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f41212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char[] f41215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f41216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f41217j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private char[] f41218k;

    public i(a aVar) {
        this.f41208a = aVar;
    }

    private void A(int i10) {
        int i11 = this.f41211d;
        this.f41211d = 0;
        char[] cArr = this.f41209b;
        this.f41209b = null;
        int i12 = this.f41210c;
        this.f41210c = -1;
        int i13 = i10 + i11;
        char[] cArr2 = this.f41215h;
        if (cArr2 == null || i13 > cArr2.length) {
            this.f41215h = b(i13);
        }
        if (i11 > 0) {
            System.arraycopy(cArr, i12, this.f41215h, 0, i11);
        }
        this.f41214g = 0;
        this.f41216i = i11;
    }

    private char[] b(int i10) {
        a aVar = this.f41208a;
        return aVar != null ? aVar.d(2, i10) : new char[Math.max(i10, 500)];
    }

    private char[] c(int i10) {
        return new char[i10];
    }

    private void d() {
        this.f41213f = false;
        this.f41212e.clear();
        this.f41214g = 0;
        this.f41216i = 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026 A[PHI: r0
      0x0026: PHI (r0v8 int) = (r0v6 int), (r0v7 int) binds: [B:6:0x0024, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    private void l(int i10) {
        if (this.f41212e == null) {
            this.f41212e = new ArrayList();
        }
        char[] cArr = this.f41215h;
        this.f41213f = true;
        this.f41212e.add(cArr);
        this.f41214g += cArr.length;
        this.f41216i = 0;
        int length = cArr.length;
        int i11 = length + (length >> 1);
        int i12 = 500;
        if (i11 < 500) {
            i11 = i12;
        } else {
            i12 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
            if (i11 > 65536) {
                i11 = i12;
            }
        }
        this.f41215h = c(i11);
    }

    private char[] w() {
        int i10;
        String str = this.f41217j;
        if (str != null) {
            return str.toCharArray();
        }
        int i11 = this.f41210c;
        if (i11 >= 0) {
            int i12 = this.f41211d;
            if (i12 < 1) {
                return f41207l;
            }
            return i11 == 0 ? Arrays.copyOf(this.f41209b, i12) : Arrays.copyOfRange(this.f41209b, i11, i12 + i11);
        }
        int iZ = z();
        if (iZ < 1) {
            return f41207l;
        }
        char[] cArrC = c(iZ);
        ArrayList arrayList = this.f41212e;
        if (arrayList != null) {
            int size = arrayList.size();
            i10 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                char[] cArr = (char[]) this.f41212e.get(i13);
                int length = cArr.length;
                System.arraycopy(cArr, 0, cArrC, i10, length);
                i10 += length;
            }
        } else {
            i10 = 0;
        }
        System.arraycopy(this.f41215h, 0, cArrC, i10, this.f41216i);
        return cArrC;
    }

    public void a(char[] cArr, int i10, int i11) {
        if (this.f41210c >= 0) {
            A(i11);
        }
        this.f41217j = null;
        this.f41218k = null;
        char[] cArr2 = this.f41215h;
        int length = cArr2.length;
        int i12 = this.f41216i;
        int i13 = length - i12;
        if (i13 >= i11) {
            System.arraycopy(cArr, i10, cArr2, i12, i11);
            this.f41216i += i11;
            return;
        }
        if (i13 > 0) {
            System.arraycopy(cArr, i10, cArr2, i12, i13);
            i10 += i13;
            i11 -= i13;
        }
        do {
            l(i11);
            int iMin = Math.min(this.f41215h.length, i11);
            System.arraycopy(cArr, i10, this.f41215h, 0, iMin);
            this.f41216i += iMin;
            i10 += iMin;
            i11 -= iMin;
        } while (i11 > 0);
    }

    public char[] e() {
        char[] cArr = this.f41218k;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrW = w();
        this.f41218k = cArrW;
        return cArrW;
    }

    public BigDecimal f() {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = this.f41218k;
        if (cArr3 != null) {
            return com.fasterxml.jackson.core.io.e.d(cArr3);
        }
        int i10 = this.f41210c;
        if (i10 < 0 || (cArr2 = this.f41209b) == null) {
            return (this.f41214g != 0 || (cArr = this.f41215h) == null) ? com.fasterxml.jackson.core.io.e.d(e()) : com.fasterxml.jackson.core.io.e.e(cArr, 0, this.f41216i);
        }
        return com.fasterxml.jackson.core.io.e.e(cArr2, i10, this.f41211d);
    }

    public double g() {
        return com.fasterxml.jackson.core.io.e.f(j());
    }

    public int h(boolean z10) {
        char[] cArr;
        int i10 = this.f41210c;
        if (i10 < 0 || (cArr = this.f41209b) == null) {
            return z10 ? -com.fasterxml.jackson.core.io.e.g(this.f41215h, 1, this.f41216i - 1) : com.fasterxml.jackson.core.io.e.g(this.f41215h, 0, this.f41216i);
        }
        return z10 ? -com.fasterxml.jackson.core.io.e.g(cArr, i10 + 1, this.f41211d - 1) : com.fasterxml.jackson.core.io.e.g(cArr, i10, this.f41211d);
    }

    public long i(boolean z10) {
        char[] cArr;
        int i10 = this.f41210c;
        if (i10 < 0 || (cArr = this.f41209b) == null) {
            return z10 ? -com.fasterxml.jackson.core.io.e.h(this.f41215h, 1, this.f41216i - 1) : com.fasterxml.jackson.core.io.e.h(this.f41215h, 0, this.f41216i);
        }
        return z10 ? -com.fasterxml.jackson.core.io.e.h(cArr, i10 + 1, this.f41211d - 1) : com.fasterxml.jackson.core.io.e.h(cArr, i10, this.f41211d);
    }

    public String j() {
        if (this.f41217j == null) {
            char[] cArr = this.f41218k;
            if (cArr != null) {
                this.f41217j = new String(cArr);
            } else {
                int i10 = this.f41210c;
                if (i10 >= 0) {
                    int i11 = this.f41211d;
                    if (i11 < 1) {
                        this.f41217j = "";
                        return "";
                    }
                    this.f41217j = new String(this.f41209b, i10, i11);
                } else {
                    int i12 = this.f41214g;
                    int i13 = this.f41216i;
                    if (i12 == 0) {
                        this.f41217j = i13 != 0 ? new String(this.f41215h, 0, i13) : "";
                    } else {
                        StringBuilder sb2 = new StringBuilder(i12 + i13);
                        ArrayList arrayList = this.f41212e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                char[] cArr2 = (char[]) this.f41212e.get(i14);
                                sb2.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb2.append(this.f41215h, 0, this.f41216i);
                        this.f41217j = sb2.toString();
                    }
                }
            }
        }
        return this.f41217j;
    }

    public char[] k() {
        this.f41210c = -1;
        this.f41216i = 0;
        this.f41211d = 0;
        this.f41209b = null;
        this.f41217j = null;
        this.f41218k = null;
        if (this.f41213f) {
            d();
        }
        char[] cArr = this.f41215h;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrB = b(0);
        this.f41215h = cArrB;
        return cArrB;
    }

    public char[] m() {
        char[] cArr = this.f41215h;
        int length = cArr.length;
        int i10 = (length >> 1) + length;
        if (i10 > 65536) {
            i10 = (length >> 2) + length;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
        this.f41215h = cArrCopyOf;
        return cArrCopyOf;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027 A[PHI: r1
      0x0027: PHI (r1v7 int) = (r1v5 int), (r1v6 int) binds: [B:6:0x0025, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    public char[] n() {
        if (this.f41212e == null) {
            this.f41212e = new ArrayList();
        }
        this.f41213f = true;
        this.f41212e.add(this.f41215h);
        int length = this.f41215h.length;
        this.f41214g += length;
        this.f41216i = 0;
        int i10 = length + (length >> 1);
        int i11 = 500;
        if (i10 < 500) {
            i10 = i11;
        } else {
            i11 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
            if (i10 > 65536) {
                i10 = i11;
            }
        }
        char[] cArrC = c(i10);
        this.f41215h = cArrC;
        return cArrC;
    }

    public char[] o() {
        if (this.f41210c >= 0) {
            A(1);
        } else {
            char[] cArr = this.f41215h;
            if (cArr == null) {
                this.f41215h = b(0);
            } else if (this.f41216i >= cArr.length) {
                l(1);
            }
        }
        return this.f41215h;
    }

    public int p() {
        return this.f41216i;
    }

    public char[] q() {
        if (this.f41210c >= 0) {
            return this.f41209b;
        }
        char[] cArr = this.f41218k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f41217j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f41218k = charArray;
            return charArray;
        }
        if (this.f41213f) {
            return e();
        }
        char[] cArr2 = this.f41215h;
        return cArr2 == null ? f41207l : cArr2;
    }

    public int r() {
        int i10 = this.f41210c;
        if (i10 >= 0) {
            return i10;
        }
        return 0;
    }

    public void s() {
        char[] cArr;
        this.f41210c = -1;
        this.f41216i = 0;
        this.f41211d = 0;
        this.f41209b = null;
        this.f41218k = null;
        if (this.f41213f) {
            d();
        }
        a aVar = this.f41208a;
        if (aVar == null || (cArr = this.f41215h) == null) {
            return;
        }
        this.f41215h = null;
        aVar.j(2, cArr);
    }

    public void t(char[] cArr, int i10, int i11) {
        this.f41209b = null;
        this.f41210c = -1;
        this.f41211d = 0;
        this.f41217j = null;
        this.f41218k = null;
        if (this.f41213f) {
            d();
        } else if (this.f41215h == null) {
            this.f41215h = b(i11);
        }
        this.f41214g = 0;
        this.f41216i = 0;
        a(cArr, i10, i11);
    }

    public String toString() {
        return j();
    }

    public void u(char[] cArr, int i10, int i11) {
        this.f41217j = null;
        this.f41218k = null;
        this.f41209b = cArr;
        this.f41210c = i10;
        this.f41211d = i11;
        if (this.f41213f) {
            d();
        }
    }

    public void v(String str) {
        this.f41209b = null;
        this.f41210c = -1;
        this.f41211d = 0;
        this.f41217j = str;
        this.f41218k = null;
        if (this.f41213f) {
            d();
        }
        this.f41216i = 0;
    }

    public String x(int i10) {
        this.f41216i = i10;
        if (this.f41214g > 0) {
            return j();
        }
        String str = i10 == 0 ? "" : new String(this.f41215h, 0, i10);
        this.f41217j = str;
        return str;
    }

    public void y(int i10) {
        this.f41216i = i10;
    }

    public int z() {
        if (this.f41210c >= 0) {
            return this.f41211d;
        }
        char[] cArr = this.f41218k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f41217j;
        return str != null ? str.length() : this.f41214g + this.f41216i;
    }
}
