package bb;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f8741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f8742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f8743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f8744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f8748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f8750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f8751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f8752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f8753m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f8754n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f8755o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f8756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f8757q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f8732r = new C0112b().o("").a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f8733s = r0.y0(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f8734t = r0.y0(1);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f8735u = r0.y0(2);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f8736v = r0.y0(3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f8737w = r0.y0(4);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f8738x = r0.y0(5);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f8739y = r0.y0(6);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f8740z = r0.y0(7);
    private static final String A = r0.y0(8);
    private static final String B = r0.y0(9);
    private static final String C = r0.y0(10);
    private static final String D = r0.y0(11);
    private static final String E = r0.y0(12);
    private static final String F = r0.y0(13);
    private static final String G = r0.y0(14);
    private static final String H = r0.y0(15);
    private static final String I = r0.y0(16);
    public static final com.google.android.exoplayer2.g.a J = new com.google.android.exoplayer2.g.a() { // from class: bb.a
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return b.c(bundle);
        }
    };

    /* JADX INFO: renamed from: bb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0112b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharSequence f8758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f8759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Layout.Alignment f8760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Layout.Alignment f8761d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f8762e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f8763f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f8764g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f8765h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f8766i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f8767j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f8768k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f8769l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f8770m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f8771n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f8772o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f8773p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f8774q;

        public b a() {
            return new b(this.f8758a, this.f8760c, this.f8761d, this.f8759b, this.f8762e, this.f8763f, this.f8764g, this.f8765h, this.f8766i, this.f8767j, this.f8768k, this.f8769l, this.f8770m, this.f8771n, this.f8772o, this.f8773p, this.f8774q);
        }

        public C0112b b() {
            this.f8771n = false;
            return this;
        }

        public int c() {
            return this.f8764g;
        }

        public int d() {
            return this.f8766i;
        }

        public CharSequence e() {
            return this.f8758a;
        }

        public C0112b f(Bitmap bitmap) {
            this.f8759b = bitmap;
            return this;
        }

        public C0112b g(float f10) {
            this.f8770m = f10;
            return this;
        }

        public C0112b h(float f10, int i10) {
            this.f8762e = f10;
            this.f8763f = i10;
            return this;
        }

        public C0112b i(int i10) {
            this.f8764g = i10;
            return this;
        }

        public C0112b j(Layout.Alignment alignment) {
            this.f8761d = alignment;
            return this;
        }

        public C0112b k(float f10) {
            this.f8765h = f10;
            return this;
        }

        public C0112b l(int i10) {
            this.f8766i = i10;
            return this;
        }

        public C0112b m(float f10) {
            this.f8774q = f10;
            return this;
        }

        public C0112b n(float f10) {
            this.f8769l = f10;
            return this;
        }

        public C0112b o(CharSequence charSequence) {
            this.f8758a = charSequence;
            return this;
        }

        public C0112b p(Layout.Alignment alignment) {
            this.f8760c = alignment;
            return this;
        }

        public C0112b q(float f10, int i10) {
            this.f8768k = f10;
            this.f8767j = i10;
            return this;
        }

        public C0112b r(int i10) {
            this.f8773p = i10;
            return this;
        }

        public C0112b s(int i10) {
            this.f8772o = i10;
            this.f8771n = true;
            return this;
        }

        public C0112b() {
            this.f8758a = null;
            this.f8759b = null;
            this.f8760c = null;
            this.f8761d = null;
            this.f8762e = -3.4028235E38f;
            this.f8763f = Integer.MIN_VALUE;
            this.f8764g = Integer.MIN_VALUE;
            this.f8765h = -3.4028235E38f;
            this.f8766i = Integer.MIN_VALUE;
            this.f8767j = Integer.MIN_VALUE;
            this.f8768k = -3.4028235E38f;
            this.f8769l = -3.4028235E38f;
            this.f8770m = -3.4028235E38f;
            this.f8771n = false;
            this.f8772o = -16777216;
            this.f8773p = Integer.MIN_VALUE;
        }

        private C0112b(b bVar) {
            this.f8758a = bVar.f8741a;
            this.f8759b = bVar.f8744d;
            this.f8760c = bVar.f8742b;
            this.f8761d = bVar.f8743c;
            this.f8762e = bVar.f8745e;
            this.f8763f = bVar.f8746f;
            this.f8764g = bVar.f8747g;
            this.f8765h = bVar.f8748h;
            this.f8766i = bVar.f8749i;
            this.f8767j = bVar.f8754n;
            this.f8768k = bVar.f8755o;
            this.f8769l = bVar.f8750j;
            this.f8770m = bVar.f8751k;
            this.f8771n = bVar.f8752l;
            this.f8772o = bVar.f8753m;
            this.f8773p = bVar.f8756p;
            this.f8774q = bVar.f8757q;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b c(Bundle bundle) {
        C0112b c0112b = new C0112b();
        CharSequence charSequence = bundle.getCharSequence(f8733s);
        if (charSequence != null) {
            c0112b.o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f8734t);
        if (alignment != null) {
            c0112b.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f8735u);
        if (alignment2 != null) {
            c0112b.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f8736v);
        if (bitmap != null) {
            c0112b.f(bitmap);
        }
        String str = f8737w;
        if (bundle.containsKey(str)) {
            String str2 = f8738x;
            if (bundle.containsKey(str2)) {
                c0112b.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f8739y;
        if (bundle.containsKey(str3)) {
            c0112b.i(bundle.getInt(str3));
        }
        String str4 = f8740z;
        if (bundle.containsKey(str4)) {
            c0112b.k(bundle.getFloat(str4));
        }
        String str5 = A;
        if (bundle.containsKey(str5)) {
            c0112b.l(bundle.getInt(str5));
        }
        String str6 = C;
        if (bundle.containsKey(str6)) {
            String str7 = B;
            if (bundle.containsKey(str7)) {
                c0112b.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = D;
        if (bundle.containsKey(str8)) {
            c0112b.n(bundle.getFloat(str8));
        }
        String str9 = E;
        if (bundle.containsKey(str9)) {
            c0112b.g(bundle.getFloat(str9));
        }
        String str10 = F;
        if (bundle.containsKey(str10)) {
            c0112b.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(G, false)) {
            c0112b.b();
        }
        String str11 = H;
        if (bundle.containsKey(str11)) {
            c0112b.r(bundle.getInt(str11));
        }
        String str12 = I;
        if (bundle.containsKey(str12)) {
            c0112b.m(bundle.getFloat(str12));
        }
        return c0112b.a();
    }

    public C0112b b() {
        return new C0112b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (TextUtils.equals(this.f8741a, bVar.f8741a) && this.f8742b == bVar.f8742b && this.f8743c == bVar.f8743c && ((bitmap = this.f8744d) != null ? !((bitmap2 = bVar.f8744d) == null || !bitmap.sameAs(bitmap2)) : bVar.f8744d == null) && this.f8745e == bVar.f8745e && this.f8746f == bVar.f8746f && this.f8747g == bVar.f8747g && this.f8748h == bVar.f8748h && this.f8749i == bVar.f8749i && this.f8750j == bVar.f8750j && this.f8751k == bVar.f8751k && this.f8752l == bVar.f8752l && this.f8753m == bVar.f8753m && this.f8754n == bVar.f8754n && this.f8755o == bVar.f8755o && this.f8756p == bVar.f8756p && this.f8757q == bVar.f8757q) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return sc.l.b(this.f8741a, this.f8742b, this.f8743c, this.f8744d, Float.valueOf(this.f8745e), Integer.valueOf(this.f8746f), Integer.valueOf(this.f8747g), Float.valueOf(this.f8748h), Integer.valueOf(this.f8749i), Float.valueOf(this.f8750j), Float.valueOf(this.f8751k), Boolean.valueOf(this.f8752l), Integer.valueOf(this.f8753m), Integer.valueOf(this.f8754n), Float.valueOf(this.f8755o), Integer.valueOf(this.f8756p), Float.valueOf(this.f8757q));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(f8733s, this.f8741a);
        bundle.putSerializable(f8734t, this.f8742b);
        bundle.putSerializable(f8735u, this.f8743c);
        bundle.putParcelable(f8736v, this.f8744d);
        bundle.putFloat(f8737w, this.f8745e);
        bundle.putInt(f8738x, this.f8746f);
        bundle.putInt(f8739y, this.f8747g);
        bundle.putFloat(f8740z, this.f8748h);
        bundle.putInt(A, this.f8749i);
        bundle.putInt(B, this.f8754n);
        bundle.putFloat(C, this.f8755o);
        bundle.putFloat(D, this.f8750j);
        bundle.putFloat(E, this.f8751k);
        bundle.putBoolean(G, this.f8752l);
        bundle.putInt(F, this.f8753m);
        bundle.putInt(H, this.f8756p);
        bundle.putFloat(I, this.f8757q);
        return bundle;
    }

    private b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            ob.a.e(bitmap);
        } else {
            ob.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f8741a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f8741a = charSequence.toString();
        } else {
            this.f8741a = null;
        }
        this.f8742b = alignment;
        this.f8743c = alignment2;
        this.f8744d = bitmap;
        this.f8745e = f10;
        this.f8746f = i10;
        this.f8747g = i11;
        this.f8748h = f11;
        this.f8749i = i12;
        this.f8750j = f13;
        this.f8751k = f14;
        this.f8752l = z10;
        this.f8753m = i14;
        this.f8754n = i13;
        this.f8755o = f12;
        this.f8756p = i15;
        this.f8757q = f15;
    }
}
