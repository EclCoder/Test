package n0;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f46747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f46748b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f46749c = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.lifecycle.s f46750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.lifecycle.y f46751b;

        a(androidx.lifecycle.s sVar, androidx.lifecycle.y yVar) {
            this.f46750a = sVar;
            this.f46751b = yVar;
            sVar.a(yVar);
        }

        void a() {
            this.f46750a.d(this.f46751b);
            this.f46751b = null;
        }
    }

    public s(Runnable runnable) {
        this.f46747a = runnable;
    }

    public static /* synthetic */ void a(s sVar, androidx.lifecycle.s.b bVar, u uVar, androidx.lifecycle.b0 b0Var, androidx.lifecycle.s.a aVar) {
        sVar.getClass();
        if (aVar == androidx.lifecycle.s.a.h(bVar)) {
            sVar.c(uVar);
            return;
        }
        if (aVar == androidx.lifecycle.s.a.ON_DESTROY) {
            sVar.j(uVar);
        } else if (aVar == androidx.lifecycle.s.a.e(bVar)) {
            sVar.f46748b.remove(uVar);
            sVar.f46747a.run();
        }
    }

    public static /* synthetic */ void b(s sVar, u uVar, androidx.lifecycle.b0 b0Var, androidx.lifecycle.s.a aVar) {
        sVar.getClass();
        if (aVar == androidx.lifecycle.s.a.ON_DESTROY) {
            sVar.j(uVar);
        }
    }

    public void c(u uVar) {
        this.f46748b.add(uVar);
        this.f46747a.run();
    }

    public void d(final u uVar, androidx.lifecycle.b0 b0Var) {
        c(uVar);
        androidx.lifecycle.s lifecycle = b0Var.getLifecycle();
        a aVar = (a) this.f46749c.remove(uVar);
        if (aVar != null) {
            aVar.a();
        }
        this.f46749c.put(uVar, new a(lifecycle, new androidx.lifecycle.y() { // from class: n0.r
            @Override // androidx.lifecycle.y
            public final void c(androidx.lifecycle.b0 b0Var2, androidx.lifecycle.s.a aVar2) {
                s.b(this.f46744a, uVar, b0Var2, aVar2);
            }
        }));
    }

    public void e(final u uVar, androidx.lifecycle.b0 b0Var, final androidx.lifecycle.s.b bVar) {
        androidx.lifecycle.s lifecycle = b0Var.getLifecycle();
        a aVar = (a) this.f46749c.remove(uVar);
        if (aVar != null) {
            aVar.a();
        }
        this.f46749c.put(uVar, new a(lifecycle, new androidx.lifecycle.y() { // from class: n0.q
            @Override // androidx.lifecycle.y
            public final void c(androidx.lifecycle.b0 b0Var2, androidx.lifecycle.s.a aVar2) {
                s.a(this.f46723a, bVar, uVar, b0Var2, aVar2);
            }
        }));
    }

    public void f(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f46748b.iterator();
        while (it.hasNext()) {
            ((u) it.next()).d(menu, menuInflater);
        }
    }

    public void g(Menu menu) {
        Iterator it = this.f46748b.iterator();
        while (it.hasNext()) {
            ((u) it.next()).a(menu);
        }
    }

    public boolean h(MenuItem menuItem) {
        Iterator it = this.f46748b.iterator();
        while (it.hasNext()) {
            if (((u) it.next()).c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(Menu menu) {
        Iterator it = this.f46748b.iterator();
        while (it.hasNext()) {
            ((u) it.next()).b(menu);
        }
    }

    public void j(u uVar) {
        this.f46748b.remove(uVar);
        a aVar = (a) this.f46749c.remove(uVar);
        if (aVar != null) {
            aVar.a();
        }
        this.f46747a.run();
    }
}
