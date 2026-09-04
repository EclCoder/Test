package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.collection.u;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f912b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList f915c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final u f916d = new u();

        public a(Context context, ActionMode.Callback callback) {
            this.f914b = context;
            this.f913a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f916d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            m.d dVar = new m.d(this.f914b, (g0.a) menu);
            this.f916d.put(menu, dVar);
            return dVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f913a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f913a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f913a.onActionItemClicked(e(bVar), new m.c(this.f914b, (g0.b) menuItem));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f913a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f915c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) this.f915c.get(i10);
                if (fVar != null && fVar.f912b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f914b, bVar);
            this.f915c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f911a = context;
        this.f912b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f912b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f912b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new m.d(this.f911a, (g0.a) this.f912b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f912b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f912b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f912b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f912b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f912b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f912b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f912b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f912b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f912b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f912b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f912b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f912b.s(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f912b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f912b.q(i10);
    }
}
