package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import n0.a1;
import n0.c1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class s0 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Toolbar f1707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f1709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f1710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f1711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f1712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f1713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    CharSequence f1715i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f1716j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f1717k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Window.Callback f1718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f1719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f1720n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1721o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1722p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f1723q;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final m.a f1724a;

        a() {
            this.f1724a = new m.a(s0.this.f1707a.getContext(), 0, R.id.home, 0, 0, s0.this.f1715i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s0 s0Var = s0.this;
            Window.Callback callback = s0Var.f1718l;
            if (callback == null || !s0Var.f1719m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1724a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends c1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1726a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1727b;

        b(int i10) {
            this.f1727b = i10;
        }

        @Override // n0.c1, n0.b1
        public void a(View view) {
            this.f1726a = true;
        }

        @Override // n0.b1
        public void b(View view) {
            if (this.f1726a) {
                return;
            }
            s0.this.f1707a.setVisibility(this.f1727b);
        }

        @Override // n0.c1, n0.b1
        public void c(View view) {
            s0.this.f1707a.setVisibility(0);
        }
    }

    public s0(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, h.h.f39970a, h.e.f39909n);
    }

    private int A() {
        if (this.f1707a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1723q = this.f1707a.getNavigationIcon();
        return 15;
    }

    private void F(CharSequence charSequence) {
        this.f1715i = charSequence;
        if ((this.f1708b & 8) != 0) {
            this.f1707a.setTitle(charSequence);
            if (this.f1714h) {
                n0.q0.o0(this.f1707a.getRootView(), charSequence);
            }
        }
    }

    private void G() {
        if ((this.f1708b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1717k)) {
                this.f1707a.setNavigationContentDescription(this.f1722p);
            } else {
                this.f1707a.setNavigationContentDescription(this.f1717k);
            }
        }
    }

    private void H() {
        if ((this.f1708b & 4) == 0) {
            this.f1707a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f1707a;
        Drawable drawable = this.f1713g;
        if (drawable == null) {
            drawable = this.f1723q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void I() {
        Drawable drawable;
        int i10 = this.f1708b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1712f) == null) {
            drawable = this.f1711e;
        }
        this.f1707a.setLogo(drawable);
    }

    public void B(int i10) {
        if (i10 == this.f1722p) {
            return;
        }
        this.f1722p = i10;
        if (TextUtils.isEmpty(this.f1707a.getNavigationContentDescription())) {
            o(this.f1722p);
        }
    }

    public void C(Drawable drawable) {
        this.f1712f = drawable;
        I();
    }

    public void D(CharSequence charSequence) {
        this.f1717k = charSequence;
        G();
    }

    public void E(CharSequence charSequence) {
        this.f1716j = charSequence;
        if ((this.f1708b & 8) != 0) {
            this.f1707a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.t
    public boolean a() {
        return this.f1707a.d();
    }

    @Override // androidx.appcompat.widget.t
    public boolean b() {
        return this.f1707a.w();
    }

    @Override // androidx.appcompat.widget.t
    public boolean c() {
        return this.f1707a.Q();
    }

    @Override // androidx.appcompat.widget.t
    public void collapseActionView() {
        this.f1707a.e();
    }

    @Override // androidx.appcompat.widget.t
    public void d(Menu menu, androidx.appcompat.view.menu.j.a aVar) {
        if (this.f1720n == null) {
            c cVar = new c(this.f1707a.getContext());
            this.f1720n = cVar;
            cVar.s(h.f.f39928g);
        }
        this.f1720n.d(aVar);
        this.f1707a.K((androidx.appcompat.view.menu.e) menu, this.f1720n);
    }

    @Override // androidx.appcompat.widget.t
    public boolean e() {
        return this.f1707a.B();
    }

    @Override // androidx.appcompat.widget.t
    public void f() {
        this.f1719m = true;
    }

    @Override // androidx.appcompat.widget.t
    public boolean g() {
        return this.f1707a.A();
    }

    @Override // androidx.appcompat.widget.t
    public Context getContext() {
        return this.f1707a.getContext();
    }

    @Override // androidx.appcompat.widget.t
    public CharSequence getTitle() {
        return this.f1707a.getTitle();
    }

    @Override // androidx.appcompat.widget.t
    public boolean h() {
        return this.f1707a.v();
    }

    @Override // androidx.appcompat.widget.t
    public void i(int i10) {
        View view;
        int i11 = this.f1708b ^ i10;
        this.f1708b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i11 & 3) != 0) {
                I();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1707a.setTitle(this.f1715i);
                    this.f1707a.setSubtitle(this.f1716j);
                } else {
                    this.f1707a.setTitle((CharSequence) null);
                    this.f1707a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f1710d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1707a.addView(view);
            } else {
                this.f1707a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.t
    public Menu j() {
        return this.f1707a.getMenu();
    }

    @Override // androidx.appcompat.widget.t
    public int k() {
        return this.f1721o;
    }

    @Override // androidx.appcompat.widget.t
    public a1 l(int i10, long j10) {
        return n0.q0.e(this.f1707a).b(i10 == 0 ? 1.0f : 0.0f).e(j10).g(new b(i10));
    }

    @Override // androidx.appcompat.widget.t
    public ViewGroup m() {
        return this.f1707a;
    }

    @Override // androidx.appcompat.widget.t
    public void o(int i10) {
        D(i10 == 0 ? null : getContext().getString(i10));
    }

    @Override // androidx.appcompat.widget.t
    public void p() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.t
    public void q(boolean z10) {
        this.f1707a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.t
    public void r() {
        this.f1707a.f();
    }

    @Override // androidx.appcompat.widget.t
    public void s(i0 i0Var) {
        View view = this.f1709c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1707a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1709c);
            }
        }
        this.f1709c = i0Var;
    }

    @Override // androidx.appcompat.widget.t
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.t
    public void setTitle(CharSequence charSequence) {
        this.f1714h = true;
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.t
    public void setVisibility(int i10) {
        this.f1707a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.t
    public void setWindowCallback(Window.Callback callback) {
        this.f1718l = callback;
    }

    @Override // androidx.appcompat.widget.t
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1714h) {
            return;
        }
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.t
    public void t(int i10) {
        C(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.t
    public void u(int i10) {
        z(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.t
    public void v(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.f1707a.L(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.t
    public int w() {
        return this.f1708b;
    }

    @Override // androidx.appcompat.widget.t
    public void x(View view) {
        View view2 = this.f1710d;
        if (view2 != null && (this.f1708b & 16) != 0) {
            this.f1707a.removeView(view2);
        }
        this.f1710d = view;
        if (view == null || (this.f1708b & 16) == 0) {
            return;
        }
        this.f1707a.addView(view);
    }

    @Override // androidx.appcompat.widget.t
    public void y() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.t
    public void z(Drawable drawable) {
        this.f1713g = drawable;
        H();
    }

    public s0(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1721o = 0;
        this.f1722p = 0;
        this.f1707a = toolbar;
        this.f1715i = toolbar.getTitle();
        this.f1716j = toolbar.getSubtitle();
        this.f1714h = this.f1715i != null;
        this.f1713g = toolbar.getNavigationIcon();
        o0 o0VarV = o0.v(toolbar.getContext(), null, h.j.f39995a, h.a.f39850c, 0);
        this.f1723q = o0VarV.g(h.j.f40058l);
        if (z10) {
            CharSequence charSequenceP = o0VarV.p(h.j.f40088r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                setTitle(charSequenceP);
            }
            CharSequence charSequenceP2 = o0VarV.p(h.j.f40078p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                E(charSequenceP2);
            }
            Drawable drawableG = o0VarV.g(h.j.f40068n);
            if (drawableG != null) {
                C(drawableG);
            }
            Drawable drawableG2 = o0VarV.g(h.j.f40063m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f1713g == null && (drawable = this.f1723q) != null) {
                z(drawable);
            }
            i(o0VarV.k(h.j.f40037h, 0));
            int iN = o0VarV.n(h.j.f40031g, 0);
            if (iN != 0) {
                x(LayoutInflater.from(this.f1707a.getContext()).inflate(iN, (ViewGroup) this.f1707a, false));
                i(this.f1708b | 16);
            }
            int iM = o0VarV.m(h.j.f40048j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1707a.getLayoutParams();
                layoutParams.height = iM;
                this.f1707a.setLayoutParams(layoutParams);
            }
            int iE = o0VarV.e(h.j.f40025f, -1);
            int iE2 = o0VarV.e(h.j.f40019e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f1707a.J(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = o0VarV.n(h.j.f40093s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f1707a;
                toolbar2.N(toolbar2.getContext(), iN2);
            }
            int iN3 = o0VarV.n(h.j.f40083q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f1707a;
                toolbar3.M(toolbar3.getContext(), iN3);
            }
            int iN4 = o0VarV.n(h.j.f40073o, 0);
            if (iN4 != 0) {
                this.f1707a.setPopupTheme(iN4);
            }
        } else {
            this.f1708b = A();
        }
        o0VarV.x();
        B(i10);
        this.f1717k = this.f1707a.getNavigationContentDescription();
        this.f1707a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.t
    public void setIcon(Drawable drawable) {
        this.f1711e = drawable;
        I();
    }

    @Override // androidx.appcompat.widget.t
    public void n(boolean z10) {
    }
}
