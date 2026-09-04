package kb;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f43117f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f43119h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f43126o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43112a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43113b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f43114c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f43115d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f43116e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f43118g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f43120i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f43121j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f43122k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f43123l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f43124m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f43125n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f43127p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f43128q = false;

    private static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public d A(boolean z10) {
        this.f43122k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f43120i) {
            return this.f43119h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f43128q;
    }

    public int c() {
        if (this.f43118g) {
            return this.f43117f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f43116e;
    }

    public float e() {
        return this.f43126o;
    }

    public int f() {
        return this.f43125n;
    }

    public int g() {
        return this.f43127p;
    }

    public int h(String str, String str2, Set set, String str3) {
        if (this.f43112a.isEmpty() && this.f43113b.isEmpty() && this.f43114c.isEmpty() && this.f43115d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f43112a, str, 1073741824), this.f43113b, str2, 2), this.f43115d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f43114c)) {
            return 0;
        }
        return iB + (this.f43114c.size() * 4);
    }

    public int i() {
        int i10 = this.f43123l;
        if (i10 == -1 && this.f43124m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f43124m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f43120i;
    }

    public boolean k() {
        return this.f43118g;
    }

    public boolean l() {
        return this.f43121j == 1;
    }

    public boolean m() {
        return this.f43122k == 1;
    }

    public d n(int i10) {
        this.f43119h = i10;
        this.f43120i = true;
        return this;
    }

    public d o(boolean z10) {
        this.f43123l = z10 ? 1 : 0;
        return this;
    }

    public d p(boolean z10) {
        this.f43128q = z10;
        return this;
    }

    public d q(int i10) {
        this.f43117f = i10;
        this.f43118g = true;
        return this;
    }

    public d r(String str) {
        this.f43116e = str == null ? null : sc.c.e(str);
        return this;
    }

    public d s(float f10) {
        this.f43126o = f10;
        return this;
    }

    public d t(int i10) {
        this.f43125n = i10;
        return this;
    }

    public d u(boolean z10) {
        this.f43124m = z10 ? 1 : 0;
        return this;
    }

    public d v(int i10) {
        this.f43127p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f43114c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f43112a = str;
    }

    public void y(String str) {
        this.f43113b = str;
    }

    public void z(String str) {
        this.f43115d = str;
    }
}
