package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f4288a;

    private v(x xVar) {
        this.f4288a = xVar;
    }

    public static v b(x xVar) {
        return new v((x) m0.g.h(xVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        x xVar = this.f4288a;
        xVar.f4298e.o(xVar, xVar, fragment);
    }

    public void c() {
        this.f4288a.f4298e.A();
    }

    public boolean d(MenuItem menuItem) {
        return this.f4288a.f4298e.D(menuItem);
    }

    public void e() {
        this.f4288a.f4298e.E();
    }

    public void f() {
        this.f4288a.f4298e.G();
    }

    public void g() {
        this.f4288a.f4298e.P();
    }

    public void h() {
        this.f4288a.f4298e.T();
    }

    public void i() {
        this.f4288a.f4298e.U();
    }

    public void j() {
        this.f4288a.f4298e.W();
    }

    public boolean k() {
        return this.f4288a.f4298e.d0(true);
    }

    public f0 l() {
        return this.f4288a.f4298e;
    }

    public void m() {
        this.f4288a.f4298e.Z0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4288a.f4298e.B0().onCreateView(view, str, context, attributeSet);
    }
}
