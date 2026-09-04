package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.widget.o0;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.q;
import com.google.android.material.internal.z;
import java.lang.ref.WeakReference;
import java.util.Objects;
import mc.t;
import n0.k1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements gc.b {
    private static final int[] A = {R.attr.state_checked};
    private static final int[] B = {-16842910};
    private static final int C = sb.l.f51870n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.material.internal.p f20533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q f20534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f20535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f20536k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MenuInflater f20537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f20538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20539n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f20540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f20541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f20542q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f20543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f20544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f20545t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final t f20546u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private mc.p f20547v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final gc.i f20548w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final gc.c f20549x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final DrawerLayout.e f20550y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final d f20551z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends DrawerLayout.h {
        a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void a(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                final gc.c cVar = navigationView.f20549x;
                Objects.requireNonNull(cVar);
                view.post(new Runnable() { // from class: com.google.android.material.navigation.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.e();
                    }
                });
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void b(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                navigationView.f20549x.f();
                NavigationView.this.u();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements ViewTreeObserver.OnGlobalLayoutListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f20536k);
            boolean z10 = true;
            boolean z11 = NavigationView.this.f20536k[1] == 0;
            NavigationView.this.f20534i.D(z11);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z11 && navigationView2.t());
            boolean z12 = NavigationView.this.getLayoutDirection() == 1;
            boolean z13 = NavigationView.this.f20536k[0] == 0 || NavigationView.this.f20536k[0] + NavigationView.this.getWidth() == 0;
            NavigationView navigationView3 = NavigationView.this;
            navigationView3.setDrawLeftInsetForeground(z13 && (!z12 ? !navigationView3.s() : !navigationView3.r()));
            Activity activityA = com.google.android.material.internal.c.a(NavigationView.this.getContext());
            if (activityA != null) {
                Rect rectA = d0.a(activityA);
                boolean z14 = rectA.height() - NavigationView.this.getHeight() == NavigationView.this.f20536k[1];
                boolean z15 = Color.alpha(com.google.android.material.internal.e.c(activityA.getWindow())) != 0;
                NavigationView navigationView4 = NavigationView.this;
                navigationView4.setDrawBottomInsetForeground(z14 && z15 && navigationView4.q());
                boolean z16 = rectA.width() == NavigationView.this.f20536k[0] || rectA.width() - NavigationView.this.getWidth() == NavigationView.this.f20536k[0];
                NavigationView navigationView5 = NavigationView.this;
                if (!z16 || (!z12 ? !navigationView5.r() : !navigationView5.s())) {
                    z10 = false;
                }
                navigationView5.setDrawRightInsetForeground(z10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sb.c.f51599b0);
    }

    private MenuInflater getMenuInflater() {
        if (this.f20537l == null) {
            this.f20537l = new androidx.appcompat.view.g(getContext());
        }
        return this.f20537l;
    }

    private ColorStateList k(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = i.a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(h.a.f39870w, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = B;
        return new ColorStateList(new int[][]{iArr, A, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    private Drawable l(o0 o0Var) {
        return m(o0Var, jc.c.b(getContext(), o0Var, sb.m.U8));
    }

    private Drawable m(o0 o0Var, ColorStateList colorStateList) {
        this.f20547v = mc.p.h(getContext(), o0Var.n(sb.m.S8, 0), o0Var.n(sb.m.T8, 0)).m();
        mc.i iVar = new mc.i(this.f20547v);
        iVar.l0(colorStateList);
        return new InsetDrawable((Drawable) iVar, o0Var.f(sb.m.X8, 0), o0Var.f(sb.m.Y8, 0), o0Var.f(sb.m.W8, 0), o0Var.f(sb.m.V8, 0));
    }

    private boolean n(o0 o0Var) {
        return o0Var.s(sb.m.S8) || o0Var.s(sb.m.T8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (!this.f20544s || this.f20543r == 0) {
            return;
        }
        this.f20543r = 0;
        v(getWidth(), getHeight());
    }

    private void v(int i10, int i11) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.f)) {
            if ((this.f20543r > 0 || this.f20544s) && (getBackground() instanceof mc.i)) {
                boolean z10 = Gravity.getAbsoluteGravity(((DrawerLayout.f) getLayoutParams()).f3813a, getLayoutDirection()) == 3;
                mc.i iVar = (mc.i) getBackground();
                mc.p.b bVarO = iVar.M().F().o(this.f20543r);
                if (z10) {
                    bVarO.E(0.0f);
                    bVarO.v(0.0f);
                } else {
                    bVarO.I(0.0f);
                    bVarO.z(0.0f);
                }
                mc.p pVarM = bVarO.m();
                iVar.setShapeAppearanceModel(pVarM);
                this.f20546u.g(this, pVarM);
                this.f20546u.f(this, new RectF(0.0f, 0.0f, i10, i11));
                this.f20546u.i(this, true);
            }
        }
    }

    private Pair w() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.f)) {
            return new Pair((DrawerLayout) parent, (DrawerLayout.f) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    private void x() {
        this.f20538m = new c();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f20538m);
    }

    @Override // gc.b
    public void a() {
        w();
        this.f20548w.f();
        u();
    }

    @Override // gc.b
    public void b(androidx.activity.b bVar) {
        w();
        this.f20548w.j(bVar);
    }

    @Override // gc.b
    public void c(androidx.activity.b bVar) {
        this.f20548w.l(bVar, ((DrawerLayout.f) w().second).f3813a);
        if (this.f20544s) {
            this.f20543r = tb.b.c(0, this.f20545t, this.f20548w.a(bVar.a()));
            v(getWidth(), getHeight());
        }
    }

    @Override // gc.b
    public void d() {
        Pair pairW = w();
        DrawerLayout drawerLayout = (DrawerLayout) pairW.first;
        androidx.activity.b bVarC = this.f20548w.c();
        if (bVarC == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.f(this);
            return;
        }
        this.f20548w.h(bVarC, ((DrawerLayout.f) pairW.second).f3813a, com.google.android.material.navigation.c.b(drawerLayout, this), com.google.android.material.navigation.c.c(drawerLayout));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.f20546u.e(canvas, new xb.a.InterfaceC0873a() { // from class: com.google.android.material.navigation.o
            @Override // xb.a.InterfaceC0873a
            public final void a(Canvas canvas2) {
                super/*android.view.View*/.dispatchDraw(canvas2);
            }
        });
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    protected void e(k1 k1Var) {
        this.f20534i.m(k1Var);
    }

    gc.i getBackHelper() {
        return this.f20548w;
    }

    public MenuItem getCheckedItem() {
        return this.f20534i.n();
    }

    public int getDividerInsetEnd() {
        return this.f20534i.o();
    }

    public int getDividerInsetStart() {
        return this.f20534i.p();
    }

    public int getHeaderCount() {
        return this.f20534i.q();
    }

    public Drawable getItemBackground() {
        return this.f20534i.r();
    }

    public int getItemHorizontalPadding() {
        return this.f20534i.s();
    }

    public int getItemIconPadding() {
        return this.f20534i.t();
    }

    public ColorStateList getItemIconTintList() {
        return this.f20534i.w();
    }

    public int getItemMaxLines() {
        return this.f20534i.u();
    }

    public ColorStateList getItemTextColor() {
        return this.f20534i.v();
    }

    public int getItemVerticalPadding() {
        return this.f20534i.x();
    }

    public Menu getMenu() {
        return this.f20533h;
    }

    public int getSubheaderInsetEnd() {
        return this.f20534i.z();
    }

    public int getSubheaderInsetStart() {
        return this.f20534i.A();
    }

    public View o(int i10) {
        return this.f20534i.C(i10);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mc.j.e(this);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            this.f20551z.e();
            drawerLayout.O(this.f20551z);
            drawerLayout.a(this.f20551z);
            if (this.f20549x.b()) {
                drawerLayout.O(this.f20550y);
                drawerLayout.a(this.f20550y);
                if (drawerLayout.D(this)) {
                    this.f20549x.e();
                }
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f20538m);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.O(this.f20550y);
            drawerLayout.O(this.f20551z);
        }
        this.f20549x.f();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f20535j), 1073741824);
        } else if (mode == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.f20535j, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.a());
        this.f20533h.T(fVar.f20557c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        fVar.f20557c = bundle;
        this.f20533h.V(bundle);
        return fVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        v(i10, i11);
    }

    public void p(int i10) {
        this.f20534i.Y(true);
        getMenuInflater().inflate(i10, this.f20533h);
        this.f20534i.Y(false);
        this.f20534i.h(false);
    }

    public boolean q() {
        return this.f20540o;
    }

    public boolean r() {
        return this.f20542q;
    }

    public boolean s() {
        return this.f20541p;
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.f20540o = z10;
    }

    public void setCheckedItem(int i10) {
        MenuItem menuItemFindItem = this.f20533h.findItem(i10);
        if (menuItemFindItem != null) {
            this.f20534i.E((androidx.appcompat.view.menu.g) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i10) {
        this.f20534i.F(i10);
    }

    public void setDividerInsetStart(int i10) {
        this.f20534i.G(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        mc.j.d(this, f10);
    }

    public void setEndInsetScrimEnabled(boolean z10) {
        this.f20542q = z10;
    }

    public void setForceCompatClippingEnabled(boolean z10) {
        this.f20546u.h(this, z10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f20534i.I(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        setItemBackground(getContext().getDrawable(i10));
    }

    public void setItemHorizontalPadding(int i10) {
        this.f20534i.K(i10);
    }

    public void setItemHorizontalPaddingResource(int i10) {
        this.f20534i.K(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconPadding(int i10) {
        this.f20534i.L(i10);
    }

    public void setItemIconPaddingResource(int i10) {
        this.f20534i.L(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconSize(int i10) {
        this.f20534i.M(i10);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f20534i.N(colorStateList);
    }

    public void setItemMaxLines(int i10) {
        this.f20534i.O(i10);
    }

    public void setItemTextAppearance(int i10) {
        this.f20534i.P(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f20534i.Q(z10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f20534i.R(colorStateList);
    }

    public void setItemVerticalPadding(int i10) {
        this.f20534i.S(i10);
    }

    public void setItemVerticalPaddingResource(int i10) {
        this.f20534i.S(getResources().getDimensionPixelSize(i10));
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        q qVar = this.f20534i;
        if (qVar != null) {
            qVar.T(i10);
        }
    }

    public void setStartInsetScrimEnabled(boolean z10) {
        this.f20541p = z10;
    }

    public void setSubheaderInsetEnd(int i10) {
        this.f20534i.V(i10);
    }

    public void setSubheaderInsetStart(int i10) {
        this.f20534i.W(i10);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.f20539n = z10;
    }

    public boolean t() {
        return this.f20539n;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class d extends DrawerLayout.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference f20555a;

        private d() {
            this.f20555a = null;
        }

        private View f() {
            Activity activityA;
            if (NavigationView.this.hasFocus() || (activityA = com.google.android.material.internal.c.a(NavigationView.this.getContext())) == null) {
                return null;
            }
            return activityA.getCurrentFocus();
        }

        private void g() {
            if (this.f20555a == null) {
                this.f20555a = new WeakReference(f());
            }
        }

        private boolean h(View view) {
            return view.isAttachedToWindow() && !view.isInTouchMode();
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void a(View view) {
            if (view != NavigationView.this) {
                return;
            }
            g();
            if (h(view)) {
                view.requestFocus();
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void b(View view) {
            WeakReference weakReference;
            if (view == NavigationView.this && (weakReference = this.f20555a) != null) {
                View view2 = (View) weakReference.get();
                if (view2 == null || !h(view2)) {
                    e();
                } else {
                    view2.requestFocus();
                    e();
                }
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.h, androidx.drawerlayout.widget.DrawerLayout.e
        public void d(View view, float f10) {
            if (view != NavigationView.this) {
                return;
            }
            if ((view.getParent() instanceof DrawerLayout) && ((DrawerLayout) view.getParent()).D(view)) {
                return;
            }
            g();
        }

        void e() {
            this.f20555a = null;
        }

        /* synthetic */ d(NavigationView navigationView, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class f extends u0.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bundle f20557c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f20557c = parcel.readBundle(classLoader);
        }

        @Override // u0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f20557c);
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        int i12 = C;
        super(pc.a.d(context, attributeSet, i10, i12), attributeSet, i10);
        q qVar = new q();
        this.f20534i = qVar;
        this.f20536k = new int[2];
        this.f20539n = true;
        this.f20540o = true;
        this.f20541p = true;
        this.f20542q = true;
        this.f20543r = 0;
        this.f20546u = t.a(this);
        this.f20548w = new gc.i(this);
        this.f20549x = new gc.c(this);
        this.f20550y = new a();
        this.f20551z = new d(this, null);
        Context context2 = getContext();
        com.google.android.material.internal.p pVar = new com.google.android.material.internal.p(context2);
        this.f20533h = pVar;
        o0 o0VarJ = z.j(context2, attributeSet, sb.m.A8, i10, i12, new int[0]);
        int i13 = sb.m.B8;
        if (o0VarJ.s(i13)) {
            setBackground(o0VarJ.g(i13));
        }
        int iF = o0VarJ.f(sb.m.H8, 0);
        this.f20543r = iF;
        this.f20544s = iF == 0;
        this.f20545t = getResources().getDimensionPixelSize(sb.e.O);
        Drawable background = getBackground();
        ColorStateList colorStateListG = com.google.android.material.drawable.c.g(background);
        if (background == null || colorStateListG != null) {
            mc.i iVar = new mc.i(mc.p.k(context2, attributeSet, i10, i12).m());
            if (colorStateListG != null) {
                iVar.l0(colorStateListG);
            }
            iVar.Y(context2);
            setBackground(iVar);
        }
        int i14 = sb.m.I8;
        if (o0VarJ.s(i14)) {
            setElevation(o0VarJ.f(i14, 0));
        }
        setFitsSystemWindows(o0VarJ.a(sb.m.C8, false));
        this.f20535j = o0VarJ.f(sb.m.D8, 0);
        int i15 = sb.m.f51972f9;
        ColorStateList colorStateListC = o0VarJ.s(i15) ? o0VarJ.c(i15) : null;
        int i16 = sb.m.f52017i9;
        int iN = o0VarJ.s(i16) ? o0VarJ.n(i16, 0) : 0;
        if (iN == 0 && colorStateListC == null) {
            colorStateListC = k(R.attr.textColorSecondary);
        }
        int i17 = sb.m.P8;
        ColorStateList colorStateListC2 = o0VarJ.s(i17) ? o0VarJ.c(i17) : k(R.attr.textColorSecondary);
        int i18 = sb.m.Z8;
        int iN2 = o0VarJ.s(i18) ? o0VarJ.n(i18, 0) : 0;
        boolean zA = o0VarJ.a(sb.m.f51893a9, true);
        int i19 = sb.m.O8;
        if (o0VarJ.s(i19)) {
            setItemIconSize(o0VarJ.f(i19, 0));
        }
        int i20 = sb.m.f51909b9;
        ColorStateList colorStateListC3 = o0VarJ.s(i20) ? o0VarJ.c(i20) : null;
        if (iN2 == 0 && colorStateListC3 == null) {
            colorStateListC3 = k(R.attr.textColorPrimary);
        }
        Drawable drawableG = o0VarJ.g(sb.m.L8);
        if (drawableG == null && n(o0VarJ)) {
            drawableG = l(o0VarJ);
            ColorStateList colorStateListB = jc.c.b(context2, o0VarJ, sb.m.R8);
            if (colorStateListB != null) {
                RippleDrawable rippleDrawable = new RippleDrawable(kc.a.d(colorStateListB), null, m(o0VarJ, null));
                FocusRingDrawable focusRingDrawableW = FocusRingDrawable.w(context2, rippleDrawable);
                if (focusRingDrawableW != null) {
                    focusRingDrawableW.E(this.f20547v);
                }
                qVar.J(rippleDrawable);
            }
        }
        int i21 = sb.m.M8;
        if (o0VarJ.s(i21)) {
            i11 = 0;
            setItemHorizontalPadding(o0VarJ.f(i21, 0));
        } else {
            i11 = 0;
        }
        int i22 = sb.m.f51925c9;
        if (o0VarJ.s(i22)) {
            setItemVerticalPadding(o0VarJ.f(i22, i11));
        }
        setDividerInsetStart(o0VarJ.f(sb.m.G8, i11));
        setDividerInsetEnd(o0VarJ.f(sb.m.F8, i11));
        setSubheaderInsetStart(o0VarJ.f(sb.m.f52002h9, i11));
        setSubheaderInsetEnd(o0VarJ.f(sb.m.f51987g9, i11));
        setTopInsetScrimEnabled(o0VarJ.a(sb.m.f52032j9, this.f20539n));
        setBottomInsetScrimEnabled(o0VarJ.a(sb.m.E8, this.f20540o));
        setStartInsetScrimEnabled(o0VarJ.a(sb.m.f51957e9, this.f20541p));
        setEndInsetScrimEnabled(o0VarJ.a(sb.m.J8, this.f20542q));
        int iF2 = o0VarJ.f(sb.m.N8, 0);
        setItemMaxLines(o0VarJ.k(sb.m.Q8, 1));
        pVar.W(new b());
        qVar.H(1);
        qVar.k(context2, pVar);
        if (iN != 0) {
            qVar.X(iN);
        }
        qVar.U(colorStateListC);
        qVar.N(colorStateListC2);
        qVar.T(getOverScrollMode());
        if (iN2 != 0) {
            qVar.P(iN2);
        }
        qVar.Q(zA);
        qVar.R(colorStateListC3);
        qVar.I(drawableG);
        qVar.L(iF2);
        pVar.b(qVar);
        addView((View) qVar.y(this));
        int i23 = sb.m.f51941d9;
        if (o0VarJ.s(i23)) {
            p(o0VarJ.n(i23, 0));
        }
        int i24 = sb.m.K8;
        if (o0VarJ.s(i24)) {
            o(o0VarJ.n(i24, 0));
        }
        o0VarJ.x();
        x();
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f20533h.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.f20534i.E((androidx.appcompat.view.menu.g) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements androidx.appcompat.view.menu.e.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            NavigationView.this.getClass();
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
        }
    }

    public void setNavigationItemSelectedListener(e eVar) {
    }
}
