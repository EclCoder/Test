package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.y0;
import androidx.core.app.a0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends androidx.fragment.app.s implements e, a0.a, androidx.appcompat.app.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources f717b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements n4.g.b {
        a() {
        }

        @Override // n4.g.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            d.this.k0().G(bundle);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements e.b {
        b() {
        }

        @Override // e.b
        public void a(Context context) {
            h hVarK0 = d.this.k0();
            hVarK0.y();
            hVarK0.C(d.this.getSavedStateRegistry().a("androidx:appcompat"));
        }
    }

    public d() {
        m0();
    }

    private void m0() {
        getSavedStateRegistry().c("androidx:appcompat", new a());
        addOnContextAvailableListener(new b());
    }

    private boolean t0(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.p, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        k0().f(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(k0().k(context));
    }

    @Override // androidx.core.app.a0.a
    public Intent c() {
        return androidx.core.app.k.a(this);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a aVarL0 = l0();
        if (getWindow().hasFeature(0)) {
            if (aVarL0 == null || !aVarL0.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a aVarL0 = l0();
        if (keyCode == 82 && aVarL0 != null && aVarL0.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i10) {
        return k0().n(i10);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return k0().u();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f717b == null && y0.c()) {
            this.f717b = new y0(this, super.getResources());
        }
        Resources resources = this.f717b;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        k0().z();
    }

    public h k0() {
        if (this.f716a == null) {
            this.f716a = h.l(this, this);
        }
        return this.f716a;
    }

    public androidx.appcompat.app.a l0() {
        return k0().x();
    }

    @Override // androidx.appcompat.app.b.c
    public androidx.appcompat.app.b.InterfaceC0010b m() {
        return k0().r();
    }

    public void n0(a0 a0Var) {
        a0Var.d(this);
    }

    @Override // androidx.activity.p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k0().B(configuration);
        if (this.f717b != null) {
            this.f717b.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        r0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k0().D();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (t0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a aVarL0 = l0();
        if (menuItem.getItemId() != 16908332 || aVarL0 == null || (aVarL0.i() & 4) == 0) {
            return false;
        }
        return s0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.activity.p, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        k0().E(bundle);
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        k0().F();
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onStart() {
        super.onStart();
        k0().H();
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onStop() {
        super.onStop();
        k0().I();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        k0().T(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a aVarL0 = l0();
        if (getWindow().hasFeature(0)) {
            if (aVarL0 == null || !aVarL0.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.view.b q(androidx.appcompat.view.b.a aVar) {
        return null;
    }

    public boolean s0() {
        Intent intentC = c();
        if (intentC == null) {
            return false;
        }
        if (!w0(intentC)) {
            v0(intentC);
            return true;
        }
        a0 a0VarF = a0.f(this);
        n0(a0VarF);
        q0(a0VarF);
        a0VarF.k();
        try {
            androidx.core.app.b.b(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // androidx.activity.p, android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        k0().N(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        k0().S(i10);
    }

    @Override // androidx.fragment.app.s
    public void supportInvalidateOptionsMenu() {
        k0().z();
    }

    public void u0(Toolbar toolbar) {
        k0().R(toolbar);
    }

    public void v0(Intent intent) {
        androidx.core.app.k.e(this, intent);
    }

    public boolean w0(Intent intent) {
        return androidx.core.app.k.f(this, intent);
    }

    @Override // androidx.activity.p, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        k0().O(view);
    }

    @Override // androidx.activity.p, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        k0().P(view, layoutParams);
    }

    public void r0() {
    }

    @Override // androidx.appcompat.app.e
    public void l(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void n(androidx.appcompat.view.b bVar) {
    }

    protected void o0(j0.k kVar) {
    }

    protected void p0(int i10) {
    }

    public void q0(a0 a0Var) {
    }
}
