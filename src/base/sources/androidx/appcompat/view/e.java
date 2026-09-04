package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e extends b implements androidx.appcompat.view.menu.e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ActionBarContextView f905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b.a f906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f910i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f904c = context;
        this.f905d = actionBarContextView;
        this.f906e = aVar;
        androidx.appcompat.view.menu.e eVarX = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).X(1);
        this.f910i = eVarX;
        eVarX.W(this);
        this.f909h = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f906e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f905d.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f908g) {
            return;
        }
        this.f908g = true;
        this.f906e.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference weakReference = this.f907f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f910i;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f905d.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f905d.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f905d.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f906e.d(this, this.f910i);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f905d.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f905d.setCustomView(view);
        this.f907f = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i10) {
        o(this.f904c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f905d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i10) {
        r(this.f904c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f905d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z10) {
        super.s(z10);
        this.f905d.setTitleOptional(z10);
    }
}
