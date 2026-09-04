package m;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f45045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u f45046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u f45047c;

    b(Context context) {
        this.f45045a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof g0.b)) {
            return menuItem;
        }
        g0.b bVar = (g0.b) menuItem;
        if (this.f45046b == null) {
            this.f45046b = new u();
        }
        MenuItem menuItem2 = (MenuItem) this.f45046b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f45045a, bVar);
        this.f45046b.put(bVar, cVar);
        return cVar;
    }

    final void e() {
        u uVar = this.f45046b;
        if (uVar != null) {
            uVar.clear();
        }
        u uVar2 = this.f45047c;
        if (uVar2 != null) {
            uVar2.clear();
        }
    }

    final void f(int i10) {
        if (this.f45046b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f45046b.size()) {
            if (((g0.b) this.f45046b.i(i11)).getGroupId() == i10) {
                this.f45046b.k(i11);
                i11--;
            }
            i11++;
        }
    }

    final void g(int i10) {
        if (this.f45046b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f45046b.size(); i11++) {
            if (((g0.b) this.f45046b.i(i11)).getItemId() == i10) {
                this.f45046b.k(i11);
                return;
            }
        }
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }
}
