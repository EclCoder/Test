package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import n0.a1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface t {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    void d(Menu menu, androidx.appcompat.view.menu.j.a aVar);

    boolean e();

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i10);

    Menu j();

    int k();

    a1 l(int i10, long j10);

    ViewGroup m();

    void n(boolean z10);

    void o(int i10);

    void p();

    void q(boolean z10);

    void r();

    void s(i0 i0Var);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(int i10);

    void u(int i10);

    void v(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2);

    int w();

    void x(View view);

    void y();

    void z(Drawable drawable);
}
