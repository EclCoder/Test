package h8;

import i8.f;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f40283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f40284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f40285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f40286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f40287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f40288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a[] f40289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f40290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f40291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f40292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f40293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f40294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private BitSet f40295m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f40296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f40297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f40298c;

        public a(String str, a aVar) {
            this.f40296a = str;
            this.f40297b = aVar;
            this.f40298c = aVar != null ? 1 + aVar.f40298c : 1;
        }

        public String a(char[] cArr, int i10, int i11) {
            if (this.f40296a.length() != i11) {
                return null;
            }
            int i12 = 0;
            while (this.f40296a.charAt(i12) == cArr[i10 + i12]) {
                i12++;
                if (i12 >= i11) {
                    return this.f40296a;
                }
            }
            return null;
        }
    }

    private b(int i10) {
        this.f40283a = null;
        this.f40285c = i10;
        this.f40287e = true;
        this.f40286d = -1;
        this.f40294l = false;
        this.f40293k = 0;
        this.f40284b = new AtomicReference(C0606b.a(64));
    }

    private String a(char[] cArr, int i10, int i11, int i12, int i13) {
        if (this.f40294l) {
            l();
            this.f40294l = false;
        } else if (this.f40290h >= this.f40291i) {
            t();
            i13 = d(k(cArr, i10, i11));
        }
        String str = new String(cArr, i10, i11);
        if (com.fasterxml.jackson.core.b.a.INTERN_FIELD_NAMES.h(this.f40286d)) {
            str = f.f41202b.a(str);
        }
        this.f40290h++;
        String[] strArr = this.f40288f;
        if (strArr[i13] == null) {
            strArr[i13] = str;
            return str;
        }
        int i14 = i13 >> 1;
        a aVar = new a(str, this.f40289g[i14]);
        int i15 = aVar.f40298c;
        if (i15 > 100) {
            c(i14, aVar, i13);
            return str;
        }
        this.f40289g[i14] = aVar;
        this.f40293k = Math.max(i15, this.f40293k);
        return str;
    }

    private String b(char[] cArr, int i10, int i11, a aVar) {
        while (aVar != null) {
            String strA = aVar.a(cArr, i10, i11);
            if (strA != null) {
                return strA;
            }
            aVar = aVar.f40297b;
        }
        return null;
    }

    private void c(int i10, a aVar, int i11) {
        BitSet bitSet = this.f40295m;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this.f40295m = bitSet2;
            bitSet2.set(i10);
        } else if (bitSet.get(i10)) {
            if (com.fasterxml.jackson.core.b.a.FAIL_ON_SYMBOL_HASH_OVERFLOW.h(this.f40286d)) {
                v(100);
            }
            this.f40287e = false;
        } else {
            this.f40295m.set(i10);
        }
        this.f40288f[i11] = aVar.f40296a;
        this.f40289g[i10] = null;
        this.f40290h -= aVar.f40298c;
        this.f40293k = -1;
    }

    private static int e(int i10) {
        return i10 - (i10 >> 2);
    }

    private void l() {
        String[] strArr = this.f40288f;
        this.f40288f = (String[]) Arrays.copyOf(strArr, strArr.length);
        a[] aVarArr = this.f40289g;
        this.f40289g = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
    }

    public static b m() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return n((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    protected static b n(int i10) {
        return new b(i10);
    }

    private void s(C0606b c0606b) {
        int i10 = c0606b.f40299a;
        C0606b c0606b2 = (C0606b) this.f40284b.get();
        if (i10 == c0606b2.f40299a) {
            return;
        }
        if (i10 > 12000) {
            c0606b = C0606b.a(64);
        }
        androidx.lifecycle.b.a(this.f40284b, c0606b2, c0606b);
    }

    private void t() {
        String[] strArr = this.f40288f;
        int length = strArr.length;
        int i10 = length + length;
        if (i10 > 65536) {
            this.f40290h = 0;
            this.f40287e = false;
            this.f40288f = new String[64];
            this.f40289g = new a[32];
            this.f40292j = 63;
            this.f40294l = false;
            return;
        }
        a[] aVarArr = this.f40289g;
        this.f40288f = new String[i10];
        this.f40289g = new a[i10 >> 1];
        this.f40292j = i10 - 1;
        this.f40291i = e(i10);
        int i11 = 0;
        int iMax = 0;
        for (String str : strArr) {
            if (str != null) {
                i11++;
                int iD = d(j(str));
                String[] strArr2 = this.f40288f;
                if (strArr2[iD] == null) {
                    strArr2[iD] = str;
                } else {
                    int i12 = iD >> 1;
                    a aVar = new a(str, this.f40289g[i12]);
                    this.f40289g[i12] = aVar;
                    iMax = Math.max(iMax, aVar.f40298c);
                }
            }
        }
        int i13 = length >> 1;
        for (int i14 = 0; i14 < i13; i14++) {
            for (a aVar2 = aVarArr[i14]; aVar2 != null; aVar2 = aVar2.f40297b) {
                i11++;
                String str2 = aVar2.f40296a;
                int iD2 = d(j(str2));
                String[] strArr3 = this.f40288f;
                if (strArr3[iD2] == null) {
                    strArr3[iD2] = str2;
                } else {
                    int i15 = iD2 >> 1;
                    a aVar3 = new a(str2, this.f40289g[i15]);
                    this.f40289g[i15] = aVar3;
                    iMax = Math.max(iMax, aVar3.f40298c);
                }
            }
        }
        this.f40293k = iMax;
        this.f40295m = null;
        if (i11 != this.f40290h) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(this.f40290h), Integer.valueOf(i11)));
        }
    }

    public int d(int i10) {
        int i11 = i10 + (i10 >>> 15);
        int i12 = i11 ^ (i11 << 7);
        return (i12 + (i12 >>> 3)) & this.f40292j;
    }

    public int j(String str) {
        int length = str.length();
        int iCharAt = this.f40285c;
        for (int i10 = 0; i10 < length; i10++) {
            iCharAt = (iCharAt * 33) + str.charAt(i10);
        }
        if (iCharAt == 0) {
            return 1;
        }
        return iCharAt;
    }

    public int k(char[] cArr, int i10, int i11) {
        int i12 = this.f40285c;
        int i13 = i11 + i10;
        while (i10 < i13) {
            i12 = (i12 * 33) + cArr[i10];
            i10++;
        }
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public String o(char[] cArr, int i10, int i11, int i12) {
        if (i11 < 1) {
            return "";
        }
        if (!this.f40287e) {
            return new String(cArr, i10, i11);
        }
        int iD = d(i12);
        String str = this.f40288f[iD];
        if (str != null) {
            if (str.length() == i11) {
                int i13 = 0;
                while (str.charAt(i13) == cArr[i10 + i13]) {
                    i13++;
                    if (i13 == i11) {
                        return str;
                    }
                }
            }
            a aVar = this.f40289g[iD >> 1];
            if (aVar != null) {
                String strA = aVar.a(cArr, i10, i11);
                if (strA != null) {
                    return strA;
                }
                String strB = b(cArr, i10, i11, aVar.f40297b);
                if (strB != null) {
                    return strB;
                }
            }
        }
        return a(cArr, i10, i11, i12, iD);
    }

    public int p() {
        return this.f40285c;
    }

    public b q(int i10) {
        return new b(this, i10, this.f40285c, (C0606b) this.f40284b.get());
    }

    public boolean r() {
        return !this.f40294l;
    }

    public void u() {
        b bVar;
        if (r() && (bVar = this.f40283a) != null && this.f40287e) {
            bVar.s(new C0606b(this));
            this.f40294l = true;
        }
    }

    protected void v(int i10) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.f40290h + ") now exceeds maximum, " + i10 + " -- suspect a DoS attack based on hash collisions");
    }

    /* JADX INFO: renamed from: h8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0606b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f40299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f40300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String[] f40301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final a[] f40302d;

        public C0606b(int i10, int i11, String[] strArr, a[] aVarArr) {
            this.f40299a = i10;
            this.f40300b = i11;
            this.f40301c = strArr;
            this.f40302d = aVarArr;
        }

        public static C0606b a(int i10) {
            return new C0606b(0, 0, new String[i10], new a[i10 >> 1]);
        }

        public C0606b(b bVar) {
            this.f40299a = bVar.f40290h;
            this.f40300b = bVar.f40293k;
            this.f40301c = bVar.f40288f;
            this.f40302d = bVar.f40289g;
        }
    }

    private b(b bVar, int i10, int i11, C0606b c0606b) {
        this.f40283a = bVar;
        this.f40285c = i11;
        this.f40284b = null;
        this.f40286d = i10;
        this.f40287e = com.fasterxml.jackson.core.b.a.CANONICALIZE_FIELD_NAMES.h(i10);
        String[] strArr = c0606b.f40301c;
        this.f40288f = strArr;
        this.f40289g = c0606b.f40302d;
        this.f40290h = c0606b.f40299a;
        this.f40293k = c0606b.f40300b;
        int length = strArr.length;
        this.f40291i = e(length);
        this.f40292j = length - 1;
        this.f40294l = true;
    }
}
