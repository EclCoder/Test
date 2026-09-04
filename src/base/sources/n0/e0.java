package n0;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f46590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f46591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f46592c;

    private e0(View view, Runnable runnable) {
        this.f46590a = view;
        this.f46591b = view.getViewTreeObserver();
        this.f46592c = runnable;
    }

    public static e0 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        e0 e0Var = new e0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(e0Var);
        view.addOnAttachStateChangeListener(e0Var);
        return e0Var;
    }

    public void b() {
        if (this.f46591b.isAlive()) {
            this.f46591b.removeOnPreDrawListener(this);
        } else {
            this.f46590a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f46590a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f46592c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f46591b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
