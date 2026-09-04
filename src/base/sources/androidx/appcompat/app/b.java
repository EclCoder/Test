package androidx.appcompat.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements DrawerLayout.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0010b f698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DrawerLayout f699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j.b f700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    View.OnClickListener f706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f707j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b bVar = b.this;
            if (bVar.f703f) {
                bVar.l();
                return;
            }
            View.OnClickListener onClickListener = bVar.f706i;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0010b {
        Context a();

        boolean b();

        void c(Drawable drawable, int i10);

        Drawable d();

        void e(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        InterfaceC0010b m();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d implements InterfaceC0010b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f709a;

        d(Activity activity) {
            this.f709a = activity;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0010b
        public Context a() {
            ActionBar actionBar = this.f709a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f709a;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0010b
        public boolean b() {
            ActionBar actionBar = this.f709a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0010b
        public void c(Drawable drawable, int i10) {
            ActionBar actionBar = this.f709a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0010b
        public Drawable d() {
            TypedArray typedArrayObtainStyledAttributes = a().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0010b
        public void e(int i10) {
            ActionBar actionBar = this.f709a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class e implements InterfaceC0010b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Toolbar f710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Drawable f711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final CharSequence f712c;

        e(Toolbar toolbar) {
            this.f710a = toolbar;
            this.f711b = toolbar.getNavigationIcon();
            this.f712c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0010b
        public Context a() {
            return this.f710a.getContext();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0010b
        public boolean b() {
            return true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0010b
        public void c(Drawable drawable, int i10) {
            this.f710a.setNavigationIcon(drawable);
            e(i10);
        }

        @Override // androidx.appcompat.app.b.InterfaceC0010b
        public Drawable d() {
            return this.f711b;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0010b
        public void e(int i10) {
            if (i10 == 0) {
                this.f710a.setNavigationContentDescription(this.f712c);
            } else {
                this.f710a.setNavigationContentDescription(i10);
            }
        }
    }

    public b(Activity activity, DrawerLayout drawerLayout, int i10, int i11) {
        this(activity, null, drawerLayout, null, i10, i11);
    }

    private void j(float f10) {
        if (f10 == 1.0f) {
            this.f700c.g(true);
        } else if (f10 == 0.0f) {
            this.f700c.g(false);
        }
        this.f700c.setProgress(f10);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void a(View view) {
        j(1.0f);
        if (this.f703f) {
            g(this.f705h);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void b(View view) {
        j(0.0f);
        if (this.f703f) {
            g(this.f704g);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void d(View view, float f10) {
        if (this.f701d) {
            j(Math.min(1.0f, Math.max(0.0f, f10)));
        } else {
            j(0.0f);
        }
    }

    Drawable e() {
        return this.f698a.d();
    }

    public boolean f(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f703f) {
            return false;
        }
        l();
        return true;
    }

    void g(int i10) {
        this.f698a.e(i10);
    }

    void h(Drawable drawable, int i10) {
        if (!this.f707j && !this.f698a.b()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f707j = true;
        }
        this.f698a.c(drawable, i10);
    }

    public void i(boolean z10) {
        if (z10 != this.f703f) {
            if (z10) {
                h(this.f700c, this.f699b.C(8388611) ? this.f705h : this.f704g);
            } else {
                h(this.f702e, 0);
            }
            this.f703f = z10;
        }
    }

    public void k() {
        if (this.f699b.C(8388611)) {
            j(1.0f);
        } else {
            j(0.0f);
        }
        if (this.f703f) {
            h(this.f700c, this.f699b.C(8388611) ? this.f705h : this.f704g);
        }
    }

    void l() {
        int iQ = this.f699b.q(8388611);
        if (this.f699b.F(8388611) && iQ != 2) {
            this.f699b.d(8388611);
        } else if (iQ != 1) {
            this.f699b.K(8388611);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, j.b bVar, int i10, int i11) {
        this.f701d = true;
        this.f703f = true;
        this.f707j = false;
        if (toolbar != null) {
            this.f698a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.f698a = ((c) activity).m();
        } else {
            this.f698a = new d(activity);
        }
        this.f699b = drawerLayout;
        this.f704g = i10;
        this.f705h = i11;
        if (bVar == null) {
            this.f700c = new j.b(this.f698a.a());
        } else {
            this.f700c = bVar;
        }
        this.f702e = e();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void c(int i10) {
    }
}
