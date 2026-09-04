package n0;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f46573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f46574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0717b f46575c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(boolean z10);
    }

    /* JADX INFO: renamed from: n0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0717b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(Context context) {
        this.f46573a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f46575c = null;
        this.f46574b = null;
    }

    public void h(a aVar) {
        this.f46574b = aVar;
    }

    public abstract void i(InterfaceC0717b interfaceC0717b);

    public void j(boolean z10) {
        a aVar = this.f46574b;
        if (aVar != null) {
            aVar.a(z10);
        }
    }
}
