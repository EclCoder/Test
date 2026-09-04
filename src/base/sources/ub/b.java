package ub;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.internal.z;
import java.util.Locale;
import jc.d;
import sb.e;
import sb.j;
import sb.k;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f54361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f54362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float f54363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f54364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final float f54365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final float f54366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final float f54367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f54368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f54369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f54370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f54371k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f54372l;

    b(Context context, int i10, int i11, int i12, a aVar) {
        a aVar2 = new a();
        this.f54362b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i10 != 0) {
            aVar.f54373a = i10;
        }
        TypedArray typedArrayA = a(context, aVar.f54373a, i11, i12);
        Resources resources = context.getResources();
        this.f54363c = typedArrayA.getDimensionPixelSize(m.f52202v, -1);
        this.f54369i = context.getResources().getDimensionPixelSize(e.f51733z0);
        this.f54370j = context.getResources().getDimensionPixelSize(e.B0);
        this.f54364d = typedArrayA.getDimensionPixelSize(m.F, -1);
        int i13 = m.D;
        int i14 = e.f51732z;
        this.f54365e = typedArrayA.getDimension(i13, resources.getDimension(i14));
        int i15 = m.I;
        int i16 = e.A;
        this.f54367g = typedArrayA.getDimension(i15, resources.getDimension(i16));
        this.f54366f = typedArrayA.getDimension(m.f52187u, resources.getDimension(i14));
        this.f54368h = typedArrayA.getDimension(m.E, resources.getDimension(i16));
        boolean z10 = true;
        this.f54371k = typedArrayA.getInt(m.P, 1);
        this.f54372l = typedArrayA.getInt(m.f52157s, 0);
        aVar2.f54381i = aVar.f54381i == -2 ? 255 : aVar.f54381i;
        if (aVar.f54383k != -2) {
            aVar2.f54383k = aVar.f54383k;
        } else {
            int i17 = m.O;
            if (typedArrayA.hasValue(i17)) {
                aVar2.f54383k = typedArrayA.getInt(i17, 0);
            } else {
                aVar2.f54383k = -1;
            }
        }
        if (aVar.f54382j != null) {
            aVar2.f54382j = aVar.f54382j;
        } else {
            int i18 = m.f52247y;
            if (typedArrayA.hasValue(i18)) {
                aVar2.f54382j = typedArrayA.getString(i18);
            }
        }
        aVar2.f54387o = aVar.f54387o;
        aVar2.f54388p = aVar.f54388p == null ? context.getString(k.f51852x) : aVar.f54388p;
        aVar2.f54389q = aVar.f54389q == 0 ? j.f51828a : aVar.f54389q;
        aVar2.f54390r = aVar.f54390r == 0 ? k.F : aVar.f54390r;
        if (aVar.f54392t != null && !aVar.f54392t.booleanValue()) {
            z10 = false;
        }
        aVar2.f54392t = Boolean.valueOf(z10);
        aVar2.f54384l = aVar.f54384l == -2 ? typedArrayA.getInt(m.M, -2) : aVar.f54384l;
        aVar2.f54385m = aVar.f54385m == -2 ? typedArrayA.getInt(m.N, -2) : aVar.f54385m;
        aVar2.f54377e = Integer.valueOf(aVar.f54377e == null ? typedArrayA.getResourceId(m.f52217w, l.f51860d) : aVar.f54377e.intValue());
        aVar2.f54378f = Integer.valueOf(aVar.f54378f == null ? typedArrayA.getResourceId(m.f52232x, 0) : aVar.f54378f.intValue());
        aVar2.f54379g = Integer.valueOf(aVar.f54379g == null ? typedArrayA.getResourceId(m.G, l.f51860d) : aVar.f54379g.intValue());
        aVar2.f54380h = Integer.valueOf(aVar.f54380h == null ? typedArrayA.getResourceId(m.H, 0) : aVar.f54380h.intValue());
        aVar2.f54374b = Integer.valueOf(aVar.f54374b == null ? H(context, typedArrayA, m.f52142r) : aVar.f54374b.intValue());
        aVar2.f54376d = Integer.valueOf(aVar.f54376d == null ? typedArrayA.getResourceId(m.f52262z, l.f51863g) : aVar.f54376d.intValue());
        if (aVar.f54375c != null) {
            aVar2.f54375c = aVar.f54375c;
        } else {
            int i19 = m.A;
            if (typedArrayA.hasValue(i19)) {
                aVar2.f54375c = Integer.valueOf(H(context, typedArrayA, i19));
            } else {
                aVar2.f54375c = Integer.valueOf(new d(context, aVar2.f54376d.intValue()).k().getDefaultColor());
            }
        }
        aVar2.f54391s = Integer.valueOf(aVar.f54391s == null ? typedArrayA.getInt(m.f52172t, 8388661) : aVar.f54391s.intValue());
        aVar2.f54393u = Integer.valueOf(aVar.f54393u == null ? typedArrayA.getDimensionPixelSize(m.C, resources.getDimensionPixelSize(e.A0)) : aVar.f54393u.intValue());
        aVar2.f54394v = Integer.valueOf(aVar.f54394v == null ? typedArrayA.getDimensionPixelSize(m.B, resources.getDimensionPixelSize(e.B)) : aVar.f54394v.intValue());
        aVar2.f54395w = Integer.valueOf(aVar.f54395w == null ? typedArrayA.getDimensionPixelOffset(m.J, 0) : aVar.f54395w.intValue());
        aVar2.f54396x = Integer.valueOf(aVar.f54396x == null ? typedArrayA.getDimensionPixelOffset(m.Q, 0) : aVar.f54396x.intValue());
        aVar2.f54397y = Integer.valueOf(aVar.f54397y == null ? typedArrayA.getDimensionPixelOffset(m.K, aVar2.f54395w.intValue()) : aVar.f54397y.intValue());
        aVar2.f54398z = Integer.valueOf(aVar.f54398z == null ? typedArrayA.getDimensionPixelOffset(m.R, aVar2.f54396x.intValue()) : aVar.f54398z.intValue());
        aVar2.C = Integer.valueOf(aVar.C == null ? typedArrayA.getDimensionPixelOffset(m.L, 0) : aVar.C.intValue());
        aVar2.A = Integer.valueOf(aVar.A == null ? 0 : aVar.A.intValue());
        aVar2.B = Integer.valueOf(aVar.B == null ? 0 : aVar.B.intValue());
        aVar2.D = Boolean.valueOf(aVar.D == null ? typedArrayA.getBoolean(m.f52127q, false) : aVar.D.booleanValue());
        typedArrayA.recycle();
        if (aVar.f54386n == null) {
            aVar2.f54386n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            aVar2.f54386n = aVar.f54386n;
        }
        this.f54361a = aVar;
    }

    private static int H(Context context, TypedArray typedArray, int i10) {
        return jc.c.a(context, typedArray, i10).getDefaultColor();
    }

    private TypedArray a(Context context, int i10, int i11, int i12) {
        AttributeSet attributeSetK;
        int styleAttribute;
        if (i10 != 0) {
            attributeSetK = com.google.android.material.drawable.c.k(context, i10, "badge");
            styleAttribute = attributeSetK.getStyleAttribute();
        } else {
            attributeSetK = null;
            styleAttribute = 0;
        }
        return z.i(context, attributeSetK, m.f52112p, i11, styleAttribute == 0 ? i12 : styleAttribute, new int[0]);
    }

    int A() {
        return this.f54362b.f54376d.intValue();
    }

    int B() {
        return this.f54362b.f54398z.intValue();
    }

    int C() {
        return this.f54362b.f54396x.intValue();
    }

    boolean D() {
        return this.f54362b.f54383k != -1;
    }

    boolean E() {
        return this.f54362b.f54382j != null;
    }

    boolean F() {
        return this.f54362b.D.booleanValue();
    }

    boolean G() {
        return this.f54362b.f54392t.booleanValue();
    }

    void I(int i10) {
        this.f54361a.f54381i = i10;
        this.f54362b.f54381i = i10;
    }

    int b() {
        return this.f54362b.A.intValue();
    }

    int c() {
        return this.f54362b.B.intValue();
    }

    int d() {
        return this.f54362b.f54381i;
    }

    int e() {
        return this.f54362b.f54374b.intValue();
    }

    int f() {
        return this.f54362b.f54391s.intValue();
    }

    int g() {
        return this.f54362b.f54393u.intValue();
    }

    int h() {
        return this.f54362b.f54378f.intValue();
    }

    int i() {
        return this.f54362b.f54377e.intValue();
    }

    int j() {
        return this.f54362b.f54375c.intValue();
    }

    int k() {
        return this.f54362b.f54394v.intValue();
    }

    int l() {
        return this.f54362b.f54380h.intValue();
    }

    int m() {
        return this.f54362b.f54379g.intValue();
    }

    int n() {
        return this.f54362b.f54390r;
    }

    CharSequence o() {
        return this.f54362b.f54387o;
    }

    CharSequence p() {
        return this.f54362b.f54388p;
    }

    int q() {
        return this.f54362b.f54389q;
    }

    int r() {
        return this.f54362b.f54397y.intValue();
    }

    int s() {
        return this.f54362b.f54395w.intValue();
    }

    int t() {
        return this.f54362b.C.intValue();
    }

    int u() {
        return this.f54362b.f54384l;
    }

    int v() {
        return this.f54362b.f54385m;
    }

    int w() {
        return this.f54362b.f54383k;
    }

    Locale x() {
        return this.f54362b.f54386n;
    }

    a y() {
        return this.f54361a;
    }

    String z() {
        return this.f54362b.f54382j;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0818a();
        private Integer A;
        private Integer B;
        private Integer C;
        private Boolean D;
        private Integer E;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f54373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f54374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f54375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f54376d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f54377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f54378f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f54379g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f54380h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f54381i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f54382j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f54383k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f54384l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f54385m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Locale f54386n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private CharSequence f54387o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private CharSequence f54388p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f54389q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f54390r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Integer f54391s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Boolean f54392t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Integer f54393u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Integer f54394v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Integer f54395w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private Integer f54396x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Integer f54397y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private Integer f54398z;

        /* JADX INFO: renamed from: ub.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0818a implements Parcelable.Creator {
            C0818a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a() {
            this.f54381i = 255;
            this.f54383k = -2;
            this.f54384l = -2;
            this.f54385m = -2;
            this.f54392t = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f54373a);
            parcel.writeSerializable(this.f54374b);
            parcel.writeSerializable(this.f54375c);
            parcel.writeSerializable(this.f54376d);
            parcel.writeSerializable(this.f54377e);
            parcel.writeSerializable(this.f54378f);
            parcel.writeSerializable(this.f54379g);
            parcel.writeSerializable(this.f54380h);
            parcel.writeInt(this.f54381i);
            parcel.writeString(this.f54382j);
            parcel.writeInt(this.f54383k);
            parcel.writeInt(this.f54384l);
            parcel.writeInt(this.f54385m);
            CharSequence charSequence = this.f54387o;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f54388p;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f54389q);
            parcel.writeSerializable(this.f54391s);
            parcel.writeSerializable(this.f54393u);
            parcel.writeSerializable(this.f54394v);
            parcel.writeSerializable(this.f54395w);
            parcel.writeSerializable(this.f54396x);
            parcel.writeSerializable(this.f54397y);
            parcel.writeSerializable(this.f54398z);
            parcel.writeSerializable(this.C);
            parcel.writeSerializable(this.A);
            parcel.writeSerializable(this.B);
            parcel.writeSerializable(this.f54392t);
            parcel.writeSerializable(this.f54386n);
            parcel.writeSerializable(this.D);
            parcel.writeSerializable(this.E);
        }

        a(Parcel parcel) {
            this.f54381i = 255;
            this.f54383k = -2;
            this.f54384l = -2;
            this.f54385m = -2;
            this.f54392t = Boolean.TRUE;
            this.f54373a = parcel.readInt();
            this.f54374b = (Integer) parcel.readSerializable();
            this.f54375c = (Integer) parcel.readSerializable();
            this.f54376d = (Integer) parcel.readSerializable();
            this.f54377e = (Integer) parcel.readSerializable();
            this.f54378f = (Integer) parcel.readSerializable();
            this.f54379g = (Integer) parcel.readSerializable();
            this.f54380h = (Integer) parcel.readSerializable();
            this.f54381i = parcel.readInt();
            this.f54382j = parcel.readString();
            this.f54383k = parcel.readInt();
            this.f54384l = parcel.readInt();
            this.f54385m = parcel.readInt();
            this.f54387o = parcel.readString();
            this.f54388p = parcel.readString();
            this.f54389q = parcel.readInt();
            this.f54391s = (Integer) parcel.readSerializable();
            this.f54393u = (Integer) parcel.readSerializable();
            this.f54394v = (Integer) parcel.readSerializable();
            this.f54395w = (Integer) parcel.readSerializable();
            this.f54396x = (Integer) parcel.readSerializable();
            this.f54397y = (Integer) parcel.readSerializable();
            this.f54398z = (Integer) parcel.readSerializable();
            this.C = (Integer) parcel.readSerializable();
            this.A = (Integer) parcel.readSerializable();
            this.B = (Integer) parcel.readSerializable();
            this.f54392t = (Boolean) parcel.readSerializable();
            this.f54386n = (Locale) parcel.readSerializable();
            this.D = (Boolean) parcel.readSerializable();
            this.E = (Integer) parcel.readSerializable();
        }
    }
}
