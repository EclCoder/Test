package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import n0.a1;
import n0.b1;
import n0.c1;
import n0.d1;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class z extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator D = new AccelerateInterpolator();
    private static final Interpolator E = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ActionBarContainer f865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.appcompat.widget.t f866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ActionBarContextView f867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    View f868h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    d f872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    androidx.appcompat.view.b f873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    androidx.appcompat.view.b.a f874n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f875o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f877q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f880t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f881u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f882v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    androidx.appcompat.view.h f884x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f885y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f886z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f869i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f870j = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ArrayList f876p = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f878r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f879s = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f883w = true;
    final b1 A = new a();
    final b1 B = new b();
    final d1 C = new c();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends c1 {
        a() {
        }

        @Override // n0.b1
        public void b(View view) {
            View view2;
            z zVar = z.this;
            if (zVar.f879s && (view2 = zVar.f868h) != null) {
                view2.setTranslationY(0.0f);
                z.this.f865e.setTranslationY(0.0f);
            }
            z.this.f865e.setVisibility(8);
            z.this.f865e.setTransitioning(false);
            z zVar2 = z.this;
            zVar2.f884x = null;
            zVar2.J();
            ActionBarOverlayLayout actionBarOverlayLayout = z.this.f864d;
            if (actionBarOverlayLayout != null) {
                q0.j0(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends c1 {
        b() {
        }

        @Override // n0.b1
        public void b(View view) {
            z zVar = z.this;
            zVar.f884x = null;
            zVar.f865e.requestLayout();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements d1 {
        c() {
        }

        @Override // n0.d1
        public void a(View view) {
            ((View) z.this.f865e.getParent()).invalidate();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class d extends androidx.appcompat.view.b implements androidx.appcompat.view.menu.e.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f891d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.appcompat.view.b.a f892e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private WeakReference f893f;

        public d(Context context, androidx.appcompat.view.b.a aVar) {
            this.f890c = context;
            this.f892e = aVar;
            androidx.appcompat.view.menu.e eVarX = new androidx.appcompat.view.menu.e(context).X(1);
            this.f891d = eVarX;
            eVarX.W(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            androidx.appcompat.view.b.a aVar = this.f892e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f892e == null) {
                return;
            }
            k();
            z.this.f867g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            z zVar = z.this;
            if (zVar.f872l != this) {
                return;
            }
            if (z.I(zVar.f880t, zVar.f881u, false)) {
                this.f892e.a(this);
            } else {
                z zVar2 = z.this;
                zVar2.f873m = this;
                zVar2.f874n = this.f892e;
            }
            this.f892e = null;
            z.this.H(false);
            z.this.f867g.g();
            z zVar3 = z.this;
            zVar3.f864d.setHideOnContentScrollEnabled(zVar3.f886z);
            z.this.f872l = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference weakReference = this.f893f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f891d;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f890c);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return z.this.f867g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return z.this.f867g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (z.this.f872l != this) {
                return;
            }
            this.f891d.i0();
            try {
                this.f892e.d(this, this.f891d);
            } finally {
                this.f891d.h0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return z.this.f867g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            z.this.f867g.setCustomView(view);
            this.f893f = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i10) {
            o(z.this.f861a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            z.this.f867g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i10) {
            r(z.this.f861a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            z.this.f867g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z10) {
            super.s(z10);
            z.this.f867g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f891d.i0();
            try {
                return this.f892e.b(this, this.f891d);
            } finally {
                this.f891d.h0();
            }
        }
    }

    public z(Activity activity, boolean z10) {
        this.f863c = activity;
        View decorView = activity.getWindow().getDecorView();
        P(decorView);
        if (z10) {
            return;
        }
        this.f868h = decorView.findViewById(R.id.content);
    }

    static boolean I(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private androidx.appcompat.widget.t M(View view) {
        if (view instanceof androidx.appcompat.widget.t) {
            return (androidx.appcompat.widget.t) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    private void O() {
        if (this.f882v) {
            this.f882v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f864d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            V(false);
        }
    }

    private void P(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(h.f.f39938q);
        this.f864d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f866f = M(view.findViewById(h.f.f39922a));
        this.f867g = (ActionBarContextView) view.findViewById(h.f.f39927f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(h.f.f39924c);
        this.f865e = actionBarContainer;
        androidx.appcompat.widget.t tVar = this.f866f;
        if (tVar == null || this.f867g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f861a = tVar.getContext();
        boolean z10 = (this.f866f.w() & 4) != 0;
        if (z10) {
            this.f871k = true;
        }
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(this.f861a);
        A(aVarB.a() || z10);
        R(aVarB.e());
        TypedArray typedArrayObtainStyledAttributes = this.f861a.obtainStyledAttributes(null, h.j.f39995a, h.a.f39850c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(h.j.f40053k, false)) {
            S(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.j.f40043i, 0);
        if (dimensionPixelSize != 0) {
            w(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void R(boolean z10) {
        this.f877q = z10;
        if (z10) {
            this.f865e.setTabContainer(null);
            this.f866f.s(null);
        } else {
            this.f866f.s(null);
            this.f865e.setTabContainer(null);
        }
        boolean z11 = false;
        boolean z12 = N() == 2;
        this.f866f.q(!this.f877q && z12);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f864d;
        if (!this.f877q && z12) {
            z11 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z11);
    }

    private boolean T() {
        return this.f865e.isLaidOut();
    }

    private void U() {
        if (this.f882v) {
            return;
        }
        this.f882v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f864d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        V(false);
    }

    private void V(boolean z10) {
        if (I(this.f880t, this.f881u, this.f882v)) {
            if (this.f883w) {
                return;
            }
            this.f883w = true;
            L(z10);
            return;
        }
        if (this.f883w) {
            this.f883w = false;
            K(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public void A(boolean z10) {
        this.f866f.n(z10);
    }

    @Override // androidx.appcompat.app.a
    public void B(boolean z10) {
        androidx.appcompat.view.h hVar;
        this.f885y = z10;
        if (z10 || (hVar = this.f884x) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void C(int i10) {
        D(this.f861a.getString(i10));
    }

    @Override // androidx.appcompat.app.a
    public void D(CharSequence charSequence) {
        this.f866f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void E(CharSequence charSequence) {
        this.f866f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void F() {
        if (this.f880t) {
            this.f880t = false;
            V(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.view.b G(androidx.appcompat.view.b.a aVar) {
        d dVar = this.f872l;
        if (dVar != null) {
            dVar.c();
        }
        this.f864d.setHideOnContentScrollEnabled(false);
        this.f867g.k();
        d dVar2 = new d(this.f867g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f872l = dVar2;
        dVar2.k();
        this.f867g.h(dVar2);
        H(true);
        return dVar2;
    }

    public void H(boolean z10) {
        a1 a1VarL;
        a1 a1VarF;
        if (z10) {
            U();
        } else {
            O();
        }
        if (!T()) {
            if (z10) {
                this.f866f.setVisibility(4);
                this.f867g.setVisibility(0);
                return;
            } else {
                this.f866f.setVisibility(0);
                this.f867g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            a1VarF = this.f866f.l(4, 100L);
            a1VarL = this.f867g.f(0, 200L);
        } else {
            a1VarL = this.f866f.l(0, 200L);
            a1VarF = this.f867g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(a1VarF, a1VarL);
        hVar.h();
    }

    void J() {
        androidx.appcompat.view.b.a aVar = this.f874n;
        if (aVar != null) {
            aVar.a(this.f873m);
            this.f873m = null;
            this.f874n = null;
        }
    }

    public void K(boolean z10) {
        View view;
        androidx.appcompat.view.h hVar = this.f884x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f878r != 0 || (!this.f885y && !z10)) {
            this.A.b(null);
            return;
        }
        this.f865e.setAlpha(1.0f);
        this.f865e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f10 = -this.f865e.getHeight();
        if (z10) {
            int[] iArr = {0, 0};
            this.f865e.getLocationInWindow(iArr);
            f10 -= iArr[1];
        }
        a1 a1VarL = q0.e(this.f865e).l(f10);
        a1VarL.j(this.C);
        hVar2.c(a1VarL);
        if (this.f879s && (view = this.f868h) != null) {
            hVar2.c(q0.e(view).l(f10));
        }
        hVar2.f(D);
        hVar2.e(250L);
        hVar2.g(this.A);
        this.f884x = hVar2;
        hVar2.h();
    }

    public void L(boolean z10) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f884x;
        if (hVar != null) {
            hVar.a();
        }
        this.f865e.setVisibility(0);
        if (this.f878r == 0 && (this.f885y || z10)) {
            this.f865e.setTranslationY(0.0f);
            float f10 = -this.f865e.getHeight();
            if (z10) {
                int[] iArr = {0, 0};
                this.f865e.getLocationInWindow(iArr);
                f10 -= iArr[1];
            }
            this.f865e.setTranslationY(f10);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            a1 a1VarL = q0.e(this.f865e).l(0.0f);
            a1VarL.j(this.C);
            hVar2.c(a1VarL);
            if (this.f879s && (view2 = this.f868h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(q0.e(this.f868h).l(0.0f));
            }
            hVar2.f(E);
            hVar2.e(250L);
            hVar2.g(this.B);
            this.f884x = hVar2;
            hVar2.h();
        } else {
            this.f865e.setAlpha(1.0f);
            this.f865e.setTranslationY(0.0f);
            if (this.f879s && (view = this.f868h) != null) {
                view.setTranslationY(0.0f);
            }
            this.B.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f864d;
        if (actionBarOverlayLayout != null) {
            q0.j0(actionBarOverlayLayout);
        }
    }

    public int N() {
        return this.f866f.k();
    }

    public void Q(int i10, int i11) {
        int iW = this.f866f.w();
        if ((i11 & 4) != 0) {
            this.f871k = true;
        }
        this.f866f.i((i10 & i11) | ((~i11) & iW));
    }

    public void S(boolean z10) {
        if (z10 && !this.f864d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f886z = z10;
        this.f864d.setHideOnContentScrollEnabled(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f881u) {
            this.f881u = false;
            V(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f879s = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f881u) {
            return;
        }
        this.f881u = true;
        V(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f884x;
        if (hVar != null) {
            hVar.a();
            this.f884x = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        androidx.appcompat.widget.t tVar = this.f866f;
        if (tVar == null || !tVar.h()) {
            return false;
        }
        this.f866f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f875o) {
            return;
        }
        this.f875o = z10;
        if (this.f876p.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f876p.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f866f.w();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        if (this.f862b == null) {
            TypedValue typedValue = new TypedValue();
            this.f861a.getTheme().resolveAttribute(h.a.f39852e, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f862b = new ContextThemeWrapper(this.f861a, i10);
            } else {
                this.f862b = this.f861a;
            }
        }
        return this.f862b;
    }

    @Override // androidx.appcompat.app.a
    public void k() {
        if (this.f880t) {
            return;
        }
        this.f880t = true;
        V(false);
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        R(androidx.appcompat.view.a.b(this.f861a).e());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f872l;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f878r = i10;
    }

    @Override // androidx.appcompat.app.a
    public void r(View view) {
        this.f866f.x(view);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z10) {
        if (this.f871k) {
            return;
        }
        t(z10);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
        Q(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z10) {
        Q(z10 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z10) {
        Q(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void w(float f10) {
        q0.s0(this.f865e, f10);
    }

    @Override // androidx.appcompat.app.a
    public void x(int i10) {
        this.f866f.o(i10);
    }

    @Override // androidx.appcompat.app.a
    public void y(int i10) {
        this.f866f.u(i10);
    }

    @Override // androidx.appcompat.app.a
    public void z(Drawable drawable) {
        this.f866f.z(drawable);
    }

    public z(Dialog dialog) {
        P(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }
}
