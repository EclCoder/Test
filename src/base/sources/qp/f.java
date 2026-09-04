package qp;

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
abstract class f implements np.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f50953h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static String[] f50954i = new String[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static Class[] f50955j = new Class[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f50956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f50957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f50958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Class f50959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f50960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f50961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ClassLoader f50962g = null;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface a {
        void a(int i10, String str);

        String get(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SoftReference f50963a;

        public b() {
            c();
        }

        private String[] b() {
            return (String[]) this.f50963a.get();
        }

        private String[] c() {
            String[] strArr = new String[3];
            this.f50963a = new SoftReference(strArr);
            return strArr;
        }

        @Override // qp.f.a
        public void a(int i10, String str) {
            String[] strArrB = b();
            if (strArrB == null) {
                strArrB = c();
            }
            strArrB[i10] = str;
        }

        @Override // qp.f.a
        public String get(int i10) {
            String[] strArrB = b();
            if (strArrB == null) {
                return null;
            }
            return strArrB[i10];
        }
    }

    f(int i10, String str, Class cls) {
        this.f50956a = i10;
        this.f50957b = str;
        this.f50959d = cls;
    }

    private ClassLoader h() {
        if (this.f50962g == null) {
            this.f50962g = getClass().getClassLoader();
        }
        return this.f50962g;
    }

    protected abstract String a(h hVar);

    int b(int i10) {
        return Integer.parseInt(c(i10), 16);
    }

    String c(int i10) {
        int iIndexOf = this.f50961f.indexOf(45);
        int i11 = 0;
        while (true) {
            int i12 = i10 - 1;
            if (i10 <= 0) {
                break;
            }
            i11 = iIndexOf + 1;
            iIndexOf = this.f50961f.indexOf(45, i11);
            i10 = i12;
        }
        if (iIndexOf == -1) {
            iIndexOf = this.f50961f.length();
        }
        return this.f50961f.substring(i11, iIndexOf);
    }

    Class d(int i10) {
        return qp.b.b(c(i10), h());
    }

    Class[] e(int i10) {
        StringTokenizer stringTokenizer = new StringTokenizer(c(i10), ":");
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i11 = 0; i11 < iCountTokens; i11++) {
            clsArr[i11] = qp.b.b(stringTokenizer.nextToken(), h());
        }
        return clsArr;
    }

    public Class f() {
        if (this.f50959d == null) {
            this.f50959d = d(2);
        }
        return this.f50959d;
    }

    public String g() {
        if (this.f50958c == null) {
            this.f50958c = f().getName();
        }
        return this.f50958c;
    }

    public int i() {
        if (this.f50956a == -1) {
            this.f50956a = b(0);
        }
        return this.f50956a;
    }

    public String j() {
        if (this.f50957b == null) {
            this.f50957b = c(1);
        }
        return this.f50957b;
    }

    String k(h hVar) {
        String strA;
        if (f50953h) {
            a aVar = this.f50960e;
            if (aVar == null) {
                try {
                    this.f50960e = new b();
                } catch (Throwable unused) {
                    f50953h = false;
                }
                strA = null;
            } else {
                strA = aVar.get(hVar.f50978i);
            }
        } else {
            strA = null;
        }
        if (strA == null) {
            strA = a(hVar);
        }
        if (f50953h) {
            this.f50960e.a(hVar.f50978i, strA);
        }
        return strA;
    }

    public final String toString() {
        return k(h.f50968k);
    }
}
