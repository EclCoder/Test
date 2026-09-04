package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.s0;
import java.util.ArrayList;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class w extends androidx.appcompat.app.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.appcompat.widget.t f836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Window.Callback f837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final j.g f838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f842g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f843h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Toolbar.h f844i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.I();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return w.this.f837b.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c implements androidx.appcompat.view.menu.j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f847a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (this.f847a) {
                return;
            }
            this.f847a = true;
            w.this.f836a.r();
            w.this.f837b.onPanelClosed(108, eVar);
            this.f847a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            w.this.f837b.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class d implements androidx.appcompat.view.menu.e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (w.this.f836a.e()) {
                w.this.f837b.onPanelClosed(108, eVar);
            } else if (w.this.f837b.onPreparePanel(0, null, eVar)) {
                w.this.f837b.onMenuOpened(108, eVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class e implements j.g {
        e() {
        }

        @Override // androidx.appcompat.app.j.g
        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            w wVar = w.this;
            if (wVar.f839d) {
                return false;
            }
            wVar.f836a.f();
            w.this.f839d = true;
            return false;
        }

        @Override // androidx.appcompat.app.j.g
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(w.this.f836a.getContext());
            }
            return null;
        }
    }

    w(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f844i = bVar;
        m0.g.g(toolbar);
        s0 s0Var = new s0(toolbar, false);
        this.f836a = s0Var;
        this.f837b = (Window.Callback) m0.g.g(callback);
        s0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        s0Var.setWindowTitle(charSequence);
        this.f838c = new e();
    }

    private Menu H() {
        if (!this.f840e) {
            this.f836a.v(new c(), new d());
            this.f840e = true;
        }
        return this.f836a.j();
    }

    @Override // androidx.appcompat.app.a
    public void C(int i10) {
        androidx.appcompat.widget.t tVar = this.f836a;
        tVar.setTitle(i10 != 0 ? tVar.getContext().getText(i10) : null);
    }

    @Override // androidx.appcompat.app.a
    public void D(CharSequence charSequence) {
        this.f836a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void E(CharSequence charSequence) {
        this.f836a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void F() {
        this.f836a.setVisibility(0);
    }

    void I() {
        Menu menuH = H();
        androidx.appcompat.view.menu.e eVar = menuH instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menuH : null;
        if (eVar != null) {
            eVar.i0();
        }
        try {
            menuH.clear();
            if (!this.f837b.onCreatePanelMenu(0, menuH) || !this.f837b.onPreparePanel(0, null, menuH)) {
                menuH.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.h0();
            }
        }
    }

    public void J(View view, androidx.appcompat.app.a.C0009a c0009a) {
        if (view != null) {
            view.setLayoutParams(c0009a);
        }
        this.f836a.x(view);
    }

    public void K(int i10, int i11) {
        this.f836a.i((i10 & i11) | ((~i11) & this.f836a.w()));
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        return this.f836a.b();
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        if (!this.f836a.h()) {
            return false;
        }
        this.f836a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f841f) {
            return;
        }
        this.f841f = z10;
        if (this.f842g.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f842g.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f836a.w();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        return this.f836a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public void k() {
        this.f836a.setVisibility(8);
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        this.f836a.m().removeCallbacks(this.f843h);
        q0.e0(this.f836a.m(), this.f843h);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    @Override // androidx.appcompat.app.a
    void n() {
        this.f836a.m().removeCallbacks(this.f843h);
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu menuH = H();
        if (menuH == null) {
            return false;
        }
        menuH.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuH.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean q() {
        return this.f836a.c();
    }

    @Override // androidx.appcompat.app.a
    public void r(View view) {
        J(view, new androidx.appcompat.app.a.C0009a(-2, -2));
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
        K(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z10) {
        K(z10 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z10) {
        K(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void w(float f10) {
        q0.s0(this.f836a.m(), f10);
    }

    @Override // androidx.appcompat.app.a
    public void x(int i10) {
        this.f836a.o(i10);
    }

    @Override // androidx.appcompat.app.a
    public void y(int i10) {
        this.f836a.u(i10);
    }

    @Override // androidx.appcompat.app.a
    public void z(Drawable drawable) {
        this.f836a.z(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void A(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void B(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z10) {
    }
}
