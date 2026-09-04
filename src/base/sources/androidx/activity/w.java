package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.w1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class w extends Dialog implements androidx.lifecycle.b0, j0, e4.d, n4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.lifecycle.f0 f616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n4.i f617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fl.k f618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fl.k f619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, int i10) {
        super(context, i10);
        kotlin.jvm.internal.s.h(context, "context");
        this.f617b = n4.i.f46841c.b(this);
        this.f618c = fl.l.b(new tl.a() { // from class: androidx.activity.t
            @Override // tl.a
            public final Object invoke() {
                return w.k(this.f613a);
            }
        });
        this.f619d = fl.l.b(new tl.a() { // from class: androidx.activity.u
            @Override // tl.a
            public final Object invoke() {
                return w.i(this.f614a);
            }
        });
    }

    private final androidx.lifecycle.f0 e() {
        androidx.lifecycle.f0 f0Var = this.f616a;
        if (f0Var != null) {
            return f0Var;
        }
        androidx.lifecycle.f0 f0Var2 = new androidx.lifecycle.f0(this);
        this.f616a = f0Var2;
        return f0Var2;
    }

    private final e4.a g() {
        return (e4.a) this.f618c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final w wVar) {
        return new i0(new Runnable() { // from class: androidx.activity.v
            @Override // java.lang.Runnable
            public final void run() {
                w.j(this.f615a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(w wVar) {
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e4.a k(w wVar) {
        e4.a aVar = new e4.a();
        wVar.f().c(aVar);
        return aVar;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.s.h(view, "view");
        h();
        super.addContentView(view, layoutParams);
    }

    public e4.c f() {
        return getOnBackPressedDispatcher().j();
    }

    @Override // androidx.lifecycle.b0
    public androidx.lifecycle.s getLifecycle() {
        return e();
    }

    @Override // androidx.activity.j0
    public final i0 getOnBackPressedDispatcher() {
        return (i0) this.f619d.getValue();
    }

    @Override // n4.j
    public n4.g getSavedStateRegistry() {
        return this.f617b.b();
    }

    public void h() {
        Window window = getWindow();
        kotlin.jvm.internal.s.e(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.s.g(decorView, "getDecorView(...)");
        w1.a(decorView, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.s.e(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.s.g(decorView2, "getDecorView(...)");
        m0.a(decorView2, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.s.e(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.s.g(decorView3, "getDecorView(...)");
        n4.n.a(decorView3, this);
        Window window4 = getWindow();
        kotlin.jvm.internal.s.e(window4);
        View decorView4 = window4.getDecorView();
        kotlin.jvm.internal.s.g(decorView4, "getDecorView(...)");
        e4.r.a(decorView4, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        g().m();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            i0 onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.s.g(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            onBackPressedDispatcher.m(onBackInvokedDispatcher);
        }
        this.f617b.d(bundle);
        e().m(androidx.lifecycle.s.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.s.g(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.f617b.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        e().m(androidx.lifecycle.s.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        e().m(androidx.lifecycle.s.a.ON_DESTROY);
        this.f616a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        h();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.s.h(view, "view");
        h();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.s.h(view, "view");
        h();
        super.setContentView(view, layoutParams);
    }
}
