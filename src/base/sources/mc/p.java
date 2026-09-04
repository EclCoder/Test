package mc;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class p implements o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f45657m = new m(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f45658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f45659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f45660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    e f45661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f45662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    d f45663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    d f45664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    d f45665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g f45666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    g f45667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    g f45668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f45669l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        d a(d dVar);
    }

    public static b g() {
        return new b();
    }

    public static b h(Context context, int i10, int i11) {
        return i(context, i10, i11, 0);
    }

    private static b i(Context context, int i10, int i11, int i12) {
        return j(context, i10, i11, new mc.a(i12));
    }

    private static b j(Context context, int i10, int i11, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i11, true);
        }
        return o(contextThemeWrapper.obtainStyledAttributes(sb.m.f52018ia), dVar);
    }

    public static b k(Context context, AttributeSet attributeSet, int i10, int i11) {
        return l(context, attributeSet, i10, i11, 0);
    }

    public static b l(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return m(context, attributeSet, i10, i11, new mc.a(i12));
    }

    public static b m(Context context, AttributeSet attributeSet, int i10, int i11, d dVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sb.m.S6, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(sb.m.T6, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(sb.m.U6, 0);
        typedArrayObtainStyledAttributes.recycle();
        return j(context, resourceId, resourceId2, dVar);
    }

    public static b n(Resources.Theme theme, int i10) {
        return o(theme.obtainStyledAttributes(i10, sb.m.f52018ia), new mc.a(0.0f));
    }

    private static b o(TypedArray typedArray, d dVar) {
        try {
            int i10 = typedArray.getInt(sb.m.f52033ja, 0);
            int i11 = typedArray.getInt(sb.m.f52078ma, i10);
            int i12 = typedArray.getInt(sb.m.f52093na, i10);
            int i13 = typedArray.getInt(sb.m.f52063la, i10);
            int i14 = typedArray.getInt(sb.m.f52048ka, i10);
            d dVarV = v(typedArray, sb.m.f52108oa, dVar);
            d dVarV2 = v(typedArray, sb.m.f52153ra, dVarV);
            d dVarV3 = v(typedArray, sb.m.f52168sa, dVarV);
            d dVarV4 = v(typedArray, sb.m.f52138qa, dVarV);
            return new b().C(i11, dVarV2).G(i12, dVarV3).x(i13, dVarV4).t(i14, v(typedArray, sb.m.f52123pa, dVarV));
        } finally {
            typedArray.recycle();
        }
    }

    static boolean p(int i10, int i11) {
        return (i11 | i10) == i10;
    }

    public static d v(TypedArray typedArray, int i10, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new mc.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new m(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public d A() {
        return this.f45662e;
    }

    public e B() {
        return this.f45659b;
    }

    public d C() {
        return this.f45663f;
    }

    public boolean D() {
        return (this.f45659b instanceof n) && (this.f45658a instanceof n) && (this.f45660c instanceof n) && (this.f45661d instanceof n);
    }

    public boolean E(RectF rectF) {
        boolean z10 = this.f45669l.getClass().equals(g.class) && this.f45667j.getClass().equals(g.class) && this.f45666i.getClass().equals(g.class) && this.f45668k.getClass().equals(g.class);
        float fA = this.f45662e.a(rectF);
        return z10 && ((this.f45663f.a(rectF) > fA ? 1 : (this.f45663f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f45665h.a(rectF) > fA ? 1 : (this.f45665h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f45664g.a(rectF) > fA ? 1 : (this.f45664g.a(rectF) == fA ? 0 : -1)) == 0) && D();
    }

    public b F() {
        return new b(this);
    }

    public p G(c cVar) {
        return F().F(cVar.a(A())).J(cVar.a(C())).w(cVar.a(s())).A(cVar.a(u())).m();
    }

    @Override // mc.o
    public p a(float f10) {
        return F().o(f10).m();
    }

    @Override // mc.o
    public p c(d dVar) {
        return F().p(dVar).m();
    }

    @Override // mc.o
    public p[] d() {
        return new p[]{this};
    }

    @Override // mc.o
    public boolean f() {
        return false;
    }

    public g q() {
        return this.f45668k;
    }

    public e r() {
        return this.f45661d;
    }

    public d s() {
        return this.f45665h;
    }

    public e t() {
        return this.f45660c;
    }

    public String toString() {
        return "[" + A() + ", " + C() + ", " + u() + ", " + s() + "]";
    }

    public d u() {
        return this.f45664g;
    }

    public g w() {
        return this.f45669l;
    }

    public g x() {
        return this.f45667j;
    }

    public g y() {
        return this.f45666i;
    }

    public e z() {
        return this.f45658a;
    }

    private p(b bVar) {
        this.f45658a = bVar.f45670a;
        this.f45659b = bVar.f45671b;
        this.f45660c = bVar.f45672c;
        this.f45661d = bVar.f45673d;
        this.f45662e = bVar.f45674e;
        this.f45663f = bVar.f45675f;
        this.f45664g = bVar.f45676g;
        this.f45665h = bVar.f45677h;
        this.f45666i = bVar.f45678i;
        this.f45667j = bVar.f45679j;
        this.f45668k = bVar.f45680k;
        this.f45669l = bVar.f45681l;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f45670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f45671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e f45672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private e f45673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f45674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private d f45675f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f45676g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f45677h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private g f45678i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private g f45679j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private g f45680k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private g f45681l;

        public b() {
            this.f45670a = j.b();
            this.f45671b = j.b();
            this.f45672c = j.b();
            this.f45673d = j.b();
            this.f45674e = new mc.a(0.0f);
            this.f45675f = new mc.a(0.0f);
            this.f45676g = new mc.a(0.0f);
            this.f45677h = new mc.a(0.0f);
            this.f45678i = j.c();
            this.f45679j = j.c();
            this.f45680k = j.c();
            this.f45681l = j.c();
        }

        private static float n(e eVar) {
            if (eVar instanceof n) {
                return ((n) eVar).f45656a;
            }
            if (eVar instanceof f) {
                return ((f) eVar).f45572a;
            }
            return -1.0f;
        }

        public b A(d dVar) {
            this.f45676g = dVar;
            return this;
        }

        public b B(g gVar) {
            this.f45678i = gVar;
            return this;
        }

        public b C(int i10, d dVar) {
            return D(j.a(i10)).F(dVar);
        }

        public b D(e eVar) {
            this.f45670a = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        public b E(float f10) {
            this.f45674e = new mc.a(f10);
            return this;
        }

        public b F(d dVar) {
            this.f45674e = dVar;
            return this;
        }

        public b G(int i10, d dVar) {
            return H(j.a(i10)).J(dVar);
        }

        public b H(e eVar) {
            this.f45671b = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                I(fN);
            }
            return this;
        }

        public b I(float f10) {
            this.f45675f = new mc.a(f10);
            return this;
        }

        public b J(d dVar) {
            this.f45675f = dVar;
            return this;
        }

        public p m() {
            return new p(this);
        }

        public b o(float f10) {
            return E(f10).I(f10).z(f10).v(f10);
        }

        public b p(d dVar) {
            return F(dVar).J(dVar).A(dVar).w(dVar);
        }

        public b q(int i10, float f10) {
            return r(j.a(i10)).o(f10);
        }

        public b r(e eVar) {
            return D(eVar).H(eVar).y(eVar).u(eVar);
        }

        public b s(g gVar) {
            this.f45680k = gVar;
            return this;
        }

        public b t(int i10, d dVar) {
            return u(j.a(i10)).w(dVar);
        }

        public b u(e eVar) {
            this.f45673d = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                v(fN);
            }
            return this;
        }

        public b v(float f10) {
            this.f45677h = new mc.a(f10);
            return this;
        }

        public b w(d dVar) {
            this.f45677h = dVar;
            return this;
        }

        public b x(int i10, d dVar) {
            return y(j.a(i10)).A(dVar);
        }

        public b y(e eVar) {
            this.f45672c = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                z(fN);
            }
            return this;
        }

        public b z(float f10) {
            this.f45676g = new mc.a(f10);
            return this;
        }

        public b(p pVar) {
            this.f45670a = j.b();
            this.f45671b = j.b();
            this.f45672c = j.b();
            this.f45673d = j.b();
            this.f45674e = new mc.a(0.0f);
            this.f45675f = new mc.a(0.0f);
            this.f45676g = new mc.a(0.0f);
            this.f45677h = new mc.a(0.0f);
            this.f45678i = j.c();
            this.f45679j = j.c();
            this.f45680k = j.c();
            this.f45681l = j.c();
            this.f45670a = pVar.f45658a;
            this.f45671b = pVar.f45659b;
            this.f45672c = pVar.f45660c;
            this.f45673d = pVar.f45661d;
            this.f45674e = pVar.f45662e;
            this.f45675f = pVar.f45663f;
            this.f45676g = pVar.f45664g;
            this.f45677h = pVar.f45665h;
            this.f45678i = pVar.f45666i;
            this.f45679j = pVar.f45667j;
            this.f45680k = pVar.f45668k;
            this.f45681l = pVar.f45669l;
        }
    }

    public p() {
        this.f45658a = j.b();
        this.f45659b = j.b();
        this.f45660c = j.b();
        this.f45661d = j.b();
        this.f45662e = new mc.a(0.0f);
        this.f45663f = new mc.a(0.0f);
        this.f45664g = new mc.a(0.0f);
        this.f45665h = new mc.a(0.0f);
        this.f45666i = j.c();
        this.f45667j = j.c();
        this.f45668k = j.c();
        this.f45669l = j.c();
    }

    @Override // mc.o
    public p e() {
        return this;
    }

    @Override // mc.o
    public p b(int[] iArr) {
        return this;
    }
}
