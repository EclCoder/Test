package ub;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.internal.w;
import com.google.android.material.internal.z;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import jc.d;
import mc.i;
import mc.p;
import sb.k;
import sb.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class a extends Drawable implements w.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f54346n = l.G;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f54347o = sb.c.f51598b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f54348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f54349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f54350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f54351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f54352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f54353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f54354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f54355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f54356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f54357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f54358k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private WeakReference f54359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WeakReference f54360m;

    private a(Context context, int i10, int i11, int i12, b.a aVar) {
        this.f54348a = new WeakReference(context);
        z.c(context);
        this.f54351d = new Rect();
        w wVar = new w(this);
        this.f54350c = wVar;
        wVar.g().setTextAlign(Paint.Align.CENTER);
        b bVar = new b(context, i10, i11, i12, aVar);
        this.f54352e = bVar;
        this.f54349b = new i(p.h(context, B() ? bVar.m() : bVar.i(), B() ? bVar.l() : bVar.h()).m());
        N();
    }

    private int A() {
        int iC = this.f54352e.C();
        if (B()) {
            iC = this.f54352e.B();
            Context context = (Context) this.f54348a.get();
            if (context != null) {
                iC = tb.b.c(iC, iC - this.f54352e.t(), tb.b.b(0.0f, 1.0f, 0.3f, 1.0f, jc.c.f(context) - 1.0f));
            }
        }
        if (this.f54352e.f54371k == 0) {
            iC -= Math.round(this.f54358k);
        }
        return iC + this.f54352e.c();
    }

    private boolean B() {
        return D() || C();
    }

    private void E() {
        this.f54350c.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void F() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f54352e.e());
        if (this.f54349b.E() != colorStateListValueOf) {
            this.f54349b.l0(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void G() {
        this.f54350c.l(true);
        I();
        R();
        invalidateSelf();
    }

    private void H() {
        WeakReference weakReference = this.f54359l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f54359l.get();
        WeakReference weakReference2 = this.f54360m;
        Q(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    private void I() {
        Context context = (Context) this.f54348a.get();
        if (context == null) {
            return;
        }
        this.f54349b.setShapeAppearanceModel(p.h(context, B() ? this.f54352e.m() : this.f54352e.i(), B() ? this.f54352e.l() : this.f54352e.h()).m());
        invalidateSelf();
    }

    private void J() {
        d dVar;
        Context context = (Context) this.f54348a.get();
        if (context == null || this.f54350c.e() == (dVar = new d(context, this.f54352e.A()))) {
            return;
        }
        this.f54350c.k(dVar, context);
        K();
        R();
        invalidateSelf();
    }

    private void K() {
        this.f54350c.g().setColor(this.f54352e.j());
        invalidateSelf();
    }

    private void L() {
        S();
        this.f54350c.l(true);
        R();
        invalidateSelf();
    }

    private void M() {
        setVisible(this.f54352e.G(), false);
    }

    private void N() {
        I();
        J();
        L();
        G();
        E();
        F();
        K();
        H();
        R();
        M();
    }

    private static void P(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void R() {
        Context context = (Context) this.f54348a.get();
        WeakReference weakReference = this.f54359l;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f54351d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f54360m;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        d(rect2, view);
        c.g(this.f54351d, this.f54353f, this.f54354g, this.f54357j, this.f54358k);
        float f10 = this.f54356i;
        if (f10 != -1.0f) {
            this.f54349b.h0(f10);
        }
        if (rect.equals(this.f54351d)) {
            return;
        }
        this.f54349b.setBounds(this.f54351d);
    }

    private void S() {
        if (o() != -2) {
            this.f54355h = ((int) Math.pow(10.0d, ((double) o()) - 1.0d)) - 1;
        } else {
            this.f54355h = p();
        }
    }

    private void b(View view) {
        ViewParent viewParentK = k();
        if (viewParentK == null) {
            viewParentK = view.getParent();
        }
        if ((viewParentK instanceof View) && (viewParentK.getParent() instanceof View)) {
            c(view, (View) viewParentK.getParent());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c(View view, View view2) {
        float y10;
        float x10;
        ViewParent parent;
        boolean z10;
        FrameLayout frameLayoutK = k();
        if (frameLayoutK == null) {
            float y11 = view.getY();
            x10 = view.getX();
            parent = view.getParent();
            y10 = y11;
        } else {
            y10 = 0.0f;
            x10 = 0.0f;
            parent = frameLayoutK;
        }
        while (true) {
            z10 = parent instanceof View;
            if (!z10 || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = (View) parent;
            y10 += view3.getY();
            x10 += view3.getX();
            parent = parent.getParent();
        }
        if (z10) {
            float fY = y(y10);
            float fN = n(x10);
            View view4 = (View) parent;
            float fI = i(view4.getHeight(), y10);
            float fT = t(view4.getWidth(), x10);
            if (fY < 0.0f) {
                this.f54354g += Math.abs(fY);
            }
            if (fN < 0.0f) {
                this.f54353f += Math.abs(fN);
            }
            if (fI > 0.0f) {
                this.f54354g -= Math.abs(fI);
            }
            if (fT > 0.0f) {
                this.f54353f -= Math.abs(fT);
            }
        }
    }

    private void d(Rect rect, View view) {
        float f10;
        float f11;
        float f12 = B() ? this.f54352e.f54364d : this.f54352e.f54363c;
        this.f54356i = f12;
        if (f12 != -1.0f) {
            this.f54357j = f12;
            this.f54358k = f12;
        } else {
            this.f54357j = Math.round((B() ? this.f54352e.f54367g : this.f54352e.f54365e) / 2.0f);
            this.f54358k = Math.round((B() ? this.f54352e.f54368h : this.f54352e.f54366f) / 2.0f);
        }
        if (B()) {
            String strH = h();
            this.f54357j = Math.max(this.f54357j, (this.f54350c.h(strH) / 2.0f) + this.f54352e.g());
            float fMax = Math.max(this.f54358k, (this.f54350c.f(strH) / 2.0f) + this.f54352e.k());
            this.f54358k = fMax;
            this.f54357j = Math.max(this.f54357j, fMax);
        }
        int iA = A();
        int iF = this.f54352e.f();
        if (iF == 8388691 || iF == 8388693) {
            this.f54354g = rect.bottom - iA;
        } else {
            this.f54354g = rect.top + iA;
        }
        int iZ = z();
        int iF2 = this.f54352e.f();
        if (iF2 == 8388659 || iF2 == 8388691) {
            if (this.f54352e.f54372l == 0) {
                f10 = view.getLayoutDirection() == 0 ? (rect.left + this.f54357j) - ((this.f54358k * 2.0f) - iZ) : (rect.right - this.f54357j) + ((this.f54358k * 2.0f) - iZ);
            } else {
                f10 = view.getLayoutDirection() == 0 ? (rect.left - this.f54357j) + iZ : (rect.right + this.f54357j) - iZ;
            }
            this.f54353f = f10;
        } else {
            if (this.f54352e.f54372l == 0) {
                f11 = view.getLayoutDirection() == 0 ? (rect.right + this.f54357j) - iZ : (rect.left - this.f54357j) + iZ;
            } else {
                f11 = view.getLayoutDirection() == 0 ? (rect.right - this.f54357j) + ((this.f54358k * 2.0f) - iZ) : (rect.left + this.f54357j) - ((this.f54358k * 2.0f) - iZ);
            }
            this.f54353f = f11;
        }
        if (this.f54352e.F()) {
            b(view);
        } else {
            c(view, null);
        }
    }

    public static a e(Context context) {
        return new a(context, 0, f54347o, f54346n, null);
    }

    static a f(Context context, b.a aVar) {
        return new a(context, 0, f54347o, f54346n, aVar);
    }

    private void g(Canvas canvas) {
        String strH = h();
        if (strH != null) {
            Rect rect = new Rect();
            this.f54350c.g().getTextBounds(strH, 0, strH.length(), rect);
            float fExactCenterY = this.f54354g - rect.exactCenterY();
            canvas.drawText(strH, this.f54353f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f54350c.g());
        }
    }

    private String h() {
        if (D()) {
            return w();
        }
        if (C()) {
            return r();
        }
        return null;
    }

    private float i(float f10, float f11) {
        return ((this.f54354g + this.f54358k) - f10) + f11;
    }

    private CharSequence l() {
        return this.f54352e.p();
    }

    private float n(float f10) {
        return (this.f54353f - this.f54357j) + f10;
    }

    private String r() {
        if (this.f54355h == -2 || q() <= this.f54355h) {
            return NumberFormat.getInstance(this.f54352e.x()).format(q());
        }
        Context context = (Context) this.f54348a.get();
        return context == null ? "" : String.format(this.f54352e.x(), context.getString(k.G), Integer.valueOf(this.f54355h), "+");
    }

    private String s() {
        Context context;
        if (this.f54352e.q() == 0 || (context = (Context) this.f54348a.get()) == null) {
            return null;
        }
        return (this.f54355h == -2 || q() <= this.f54355h) ? context.getResources().getQuantityString(this.f54352e.q(), q(), Integer.valueOf(q())) : context.getString(this.f54352e.n(), Integer.valueOf(this.f54355h));
    }

    private float t(float f10, float f11) {
        return ((this.f54353f + this.f54357j) - f10) + f11;
    }

    private String w() {
        String strV = v();
        int iO = o();
        if (iO == -2 || strV == null || strV.length() <= iO) {
            return strV;
        }
        Context context = (Context) this.f54348a.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(k.f51846r), strV.substring(0, iO - 1), "…");
    }

    private CharSequence x() {
        CharSequence charSequenceO = this.f54352e.o();
        return charSequenceO != null ? charSequenceO : v();
    }

    private float y(float f10) {
        return (this.f54354g - this.f54358k) + f10;
    }

    private int z() {
        int iR = B() ? this.f54352e.r() : this.f54352e.s();
        if (this.f54352e.f54371k == 1) {
            iR += B() ? this.f54352e.f54370j : this.f54352e.f54369i;
        }
        return iR + this.f54352e.b();
    }

    public boolean C() {
        return !this.f54352e.E() && this.f54352e.D();
    }

    public boolean D() {
        return this.f54352e.E();
    }

    public void O(int i10) {
        b bVar = this.f54352e;
        if (bVar.f54372l != i10) {
            bVar.f54372l = i10;
            R();
        }
    }

    public void Q(View view, FrameLayout frameLayout) {
        this.f54359l = new WeakReference(view);
        this.f54360m = new WeakReference(frameLayout);
        P(view);
        R();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.w.b
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f54349b.draw(canvas);
        if (B()) {
            g(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f54352e.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f54351d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f54351d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public CharSequence j() {
        if (!isVisible()) {
            return null;
        }
        if (D()) {
            return x();
        }
        return C() ? s() : l();
    }

    public FrameLayout k() {
        WeakReference weakReference = this.f54360m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public int m() {
        return this.f54352e.s();
    }

    public int o() {
        return this.f54352e.u();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.w.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public int p() {
        return this.f54352e.v();
    }

    public int q() {
        if (this.f54352e.D()) {
            return this.f54352e.w();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f54352e.I(i10);
        E();
    }

    b.a u() {
        return this.f54352e.y();
    }

    public String v() {
        return this.f54352e.z();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
