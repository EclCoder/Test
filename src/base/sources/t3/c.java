package t3;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f53085f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f53087h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f53094o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53080a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53081b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f53082c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f53083d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f53084e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f53086g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53088i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f53089j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f53090k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f53091l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f53092m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f53093n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f53095p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f53096q = false;

    private static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public c A(boolean z10) {
        this.f53090k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f53088i) {
            return this.f53087h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f53096q;
    }

    public int c() {
        if (this.f53086g) {
            return this.f53085f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f53084e;
    }

    public float e() {
        return this.f53094o;
    }

    public int f() {
        return this.f53093n;
    }

    public int g() {
        return this.f53095p;
    }

    public int h(String str, String str2, Set set, String str3) {
        if (this.f53080a.isEmpty() && this.f53081b.isEmpty() && this.f53082c.isEmpty() && this.f53083d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f53080a, str, 1073741824), this.f53081b, str2, 2), this.f53083d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f53082c)) {
            return 0;
        }
        return iB + (this.f53082c.size() * 4);
    }

    public int i() {
        int i10 = this.f53091l;
        if (i10 == -1 && this.f53092m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f53092m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f53088i;
    }

    public boolean k() {
        return this.f53086g;
    }

    public boolean l() {
        return this.f53089j == 1;
    }

    public boolean m() {
        return this.f53090k == 1;
    }

    public c n(int i10) {
        this.f53087h = i10;
        this.f53088i = true;
        return this;
    }

    public c o(boolean z10) {
        this.f53091l = z10 ? 1 : 0;
        return this;
    }

    public c p(boolean z10) {
        this.f53096q = z10;
        return this;
    }

    public c q(int i10) {
        this.f53085f = i10;
        this.f53086g = true;
        return this;
    }

    public c r(String str) {
        this.f53084e = str == null ? null : sc.c.e(str);
        return this;
    }

    public c s(float f10) {
        this.f53094o = f10;
        return this;
    }

    public c t(int i10) {
        this.f53093n = i10;
        return this;
    }

    public c u(boolean z10) {
        this.f53092m = z10 ? 1 : 0;
        return this;
    }

    public c v(int i10) {
        this.f53095p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f53082c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f53080a = str;
    }

    public void y(String str) {
        this.f53081b = str;
    }

    public void z(String str) {
        this.f53083d = str;
    }
}
