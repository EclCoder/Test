package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.appcompat.view.menu.e f1564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f1565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final androidx.appcompat.view.menu.i f1566d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            e0.this.getClass();
        }
    }

    public e0(Context context, View view, int i10, int i11, int i12) {
        this.f1563a = context;
        this.f1565c = view;
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        this.f1564b = eVar;
        eVar.W(new a());
        androidx.appcompat.view.menu.i iVar = new androidx.appcompat.view.menu.i(context, eVar, view, false, i11, i12);
        this.f1566d = iVar;
        iVar.h(i10);
        iVar.i(new b());
    }

    public Menu a() {
        return this.f1564b;
    }

    public void b(boolean z10) {
        this.f1566d.g(z10);
    }

    public void c() {
        this.f1566d.k();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements androidx.appcompat.view.menu.e.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e0.this.getClass();
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
        }
    }
}
