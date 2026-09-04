package v1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import sc.l;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f55058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f55059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f55060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f55061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f55062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f55063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f55064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f55065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f55066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f55067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f55068k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f55069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f55070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f55071n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f55072o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f55073p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f55074q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f55049r = new b().o("").a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f55050s = c0.s0(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f55051t = c0.s0(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f55052u = c0.s0(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f55053v = c0.s0(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f55054w = c0.s0(3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f55055x = c0.s0(18);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f55056y = c0.s0(4);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f55057z = c0.s0(5);
    private static final String A = c0.s0(6);
    private static final String B = c0.s0(7);
    private static final String C = c0.s0(8);
    private static final String D = c0.s0(9);
    private static final String E = c0.s0(10);
    private static final String F = c0.s0(11);
    private static final String G = c0.s0(12);
    private static final String H = c0.s0(13);
    private static final String I = c0.s0(14);
    private static final String J = c0.s0(15);
    private static final String K = c0.s0(16);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharSequence f55075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f55076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Layout.Alignment f55077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Layout.Alignment f55078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f55079e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f55080f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f55081g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f55082h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f55083i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f55084j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f55085k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f55086l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f55087m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f55088n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f55089o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f55090p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f55091q;

        public a a() {
            return new a(this.f55075a, this.f55077c, this.f55078d, this.f55076b, this.f55079e, this.f55080f, this.f55081g, this.f55082h, this.f55083i, this.f55084j, this.f55085k, this.f55086l, this.f55087m, this.f55088n, this.f55089o, this.f55090p, this.f55091q);
        }

        public b b() {
            this.f55088n = false;
            return this;
        }

        public int c() {
            return this.f55081g;
        }

        public int d() {
            return this.f55083i;
        }

        public CharSequence e() {
            return this.f55075a;
        }

        public b f(Bitmap bitmap) {
            this.f55076b = bitmap;
            return this;
        }

        public b g(float f10) {
            this.f55087m = f10;
            return this;
        }

        public b h(float f10, int i10) {
            this.f55079e = f10;
            this.f55080f = i10;
            return this;
        }

        public b i(int i10) {
            this.f55081g = i10;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.f55078d = alignment;
            return this;
        }

        public b k(float f10) {
            this.f55082h = f10;
            return this;
        }

        public b l(int i10) {
            this.f55083i = i10;
            return this;
        }

        public b m(float f10) {
            this.f55091q = f10;
            return this;
        }

        public b n(float f10) {
            this.f55086l = f10;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f55075a = charSequence;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.f55077c = alignment;
            return this;
        }

        public b q(float f10, int i10) {
            this.f55085k = f10;
            this.f55084j = i10;
            return this;
        }

        public b r(int i10) {
            this.f55090p = i10;
            return this;
        }

        public b s(int i10) {
            this.f55089o = i10;
            this.f55088n = true;
            return this;
        }

        public b() {
            this.f55075a = null;
            this.f55076b = null;
            this.f55077c = null;
            this.f55078d = null;
            this.f55079e = -3.4028235E38f;
            this.f55080f = Integer.MIN_VALUE;
            this.f55081g = Integer.MIN_VALUE;
            this.f55082h = -3.4028235E38f;
            this.f55083i = Integer.MIN_VALUE;
            this.f55084j = Integer.MIN_VALUE;
            this.f55085k = -3.4028235E38f;
            this.f55086l = -3.4028235E38f;
            this.f55087m = -3.4028235E38f;
            this.f55088n = false;
            this.f55089o = -16777216;
            this.f55090p = Integer.MIN_VALUE;
        }

        private b(a aVar) {
            this.f55075a = aVar.f55058a;
            this.f55076b = aVar.f55061d;
            this.f55077c = aVar.f55059b;
            this.f55078d = aVar.f55060c;
            this.f55079e = aVar.f55062e;
            this.f55080f = aVar.f55063f;
            this.f55081g = aVar.f55064g;
            this.f55082h = aVar.f55065h;
            this.f55083i = aVar.f55066i;
            this.f55084j = aVar.f55071n;
            this.f55085k = aVar.f55072o;
            this.f55086l = aVar.f55067j;
            this.f55087m = aVar.f55068k;
            this.f55088n = aVar.f55069l;
            this.f55089o = aVar.f55070m;
            this.f55090p = aVar.f55073p;
            this.f55091q = aVar.f55074q;
        }
    }

    public static a b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(f55050s);
        if (charSequence != null) {
            bVar.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f55051t);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                int size = parcelableArrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = parcelableArrayList.get(i10);
                    i10++;
                    c.c((Bundle) obj, spannableStringValueOf);
                }
                bVar.o(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f55052u);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f55053v);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f55054w);
        if (bitmap != null) {
            bVar.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f55055x);
            if (byteArray != null) {
                bVar.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f55056y;
        if (bundle.containsKey(str)) {
            String str2 = f55057z;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = A;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = B;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = C;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = E;
        if (bundle.containsKey(str6)) {
            String str7 = D;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = F;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = G;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = H;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(I, false)) {
            bVar.b();
        }
        String str11 = J;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = K;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        return bVar.a();
    }

    private Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f55058a;
        if (charSequence != null) {
            bundle.putCharSequence(f55050s, charSequence);
            CharSequence charSequence2 = this.f55058a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> arrayListA = c.a((Spanned) charSequence2);
                if (!arrayListA.isEmpty()) {
                    bundle.putParcelableArrayList(f55051t, arrayListA);
                }
            }
        }
        bundle.putSerializable(f55052u, this.f55059b);
        bundle.putSerializable(f55053v, this.f55060c);
        bundle.putFloat(f55056y, this.f55062e);
        bundle.putInt(f55057z, this.f55063f);
        bundle.putInt(A, this.f55064g);
        bundle.putFloat(B, this.f55065h);
        bundle.putInt(C, this.f55066i);
        bundle.putInt(D, this.f55071n);
        bundle.putFloat(E, this.f55072o);
        bundle.putFloat(F, this.f55067j);
        bundle.putFloat(G, this.f55068k);
        bundle.putBoolean(I, this.f55069l);
        bundle.putInt(H, this.f55070m);
        bundle.putInt(J, this.f55073p);
        bundle.putFloat(K, this.f55074q);
        return bundle;
    }

    public b a() {
        return new b();
    }

    public Bundle d() {
        Bundle bundleC = c();
        if (this.f55061d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            w1.a.g(this.f55061d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleC.putByteArray(f55055x, byteArrayOutputStream.toByteArray());
        }
        return bundleC;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (TextUtils.equals(this.f55058a, aVar.f55058a) && this.f55059b == aVar.f55059b && this.f55060c == aVar.f55060c && ((bitmap = this.f55061d) != null ? !((bitmap2 = aVar.f55061d) == null || !bitmap.sameAs(bitmap2)) : aVar.f55061d == null) && this.f55062e == aVar.f55062e && this.f55063f == aVar.f55063f && this.f55064g == aVar.f55064g && this.f55065h == aVar.f55065h && this.f55066i == aVar.f55066i && this.f55067j == aVar.f55067j && this.f55068k == aVar.f55068k && this.f55069l == aVar.f55069l && this.f55070m == aVar.f55070m && this.f55071n == aVar.f55071n && this.f55072o == aVar.f55072o && this.f55073p == aVar.f55073p && this.f55074q == aVar.f55074q) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return l.b(this.f55058a, this.f55059b, this.f55060c, this.f55061d, Float.valueOf(this.f55062e), Integer.valueOf(this.f55063f), Integer.valueOf(this.f55064g), Float.valueOf(this.f55065h), Integer.valueOf(this.f55066i), Float.valueOf(this.f55067j), Float.valueOf(this.f55068k), Boolean.valueOf(this.f55069l), Integer.valueOf(this.f55070m), Integer.valueOf(this.f55071n), Float.valueOf(this.f55072o), Integer.valueOf(this.f55073p), Float.valueOf(this.f55074q));
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            w1.a.e(bitmap);
        } else {
            w1.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f55058a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f55058a = charSequence.toString();
        } else {
            this.f55058a = null;
        }
        this.f55059b = alignment;
        this.f55060c = alignment2;
        this.f55061d = bitmap;
        this.f55062e = f10;
        this.f55063f = i10;
        this.f55064g = i11;
        this.f55065h = f11;
        this.f55066i = i12;
        this.f55067j = f13;
        this.f55068k = f14;
        this.f55069l = z10;
        this.f55070m = i14;
        this.f55071n = i13;
        this.f55072o = f12;
        this.f55073p = i15;
        this.f55074q = f15;
    }
}
