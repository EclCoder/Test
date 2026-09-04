package mc;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    p f45730c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f45728a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f45729b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    RectF f45731d = new RectF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Path f45732e = new Path();

    public static t a(View view) {
        return Build.VERSION.SDK_INT >= 33 ? new v(view) : new u(view);
    }

    private boolean d() {
        RectF rectF = this.f45731d;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    private void k() {
        if (!d() || this.f45730c == null) {
            return;
        }
        q.l().d(this.f45730c, 1.0f, this.f45731d, this.f45732e);
    }

    abstract void b(View view);

    public boolean c() {
        return this.f45728a;
    }

    public void e(Canvas canvas, xb.a.InterfaceC0873a interfaceC0873a) {
        if (!j() || this.f45732e.isEmpty()) {
            interfaceC0873a.a(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f45732e);
        interfaceC0873a.a(canvas);
        canvas.restore();
    }

    public void f(View view, RectF rectF) {
        this.f45731d = rectF;
        k();
        b(view);
    }

    public void g(View view, p pVar) {
        this.f45730c = pVar;
        k();
        b(view);
    }

    public void h(View view, boolean z10) {
        if (z10 != this.f45728a) {
            this.f45728a = z10;
            b(view);
        }
    }

    public void i(View view, boolean z10) {
        this.f45729b = z10;
        b(view);
    }

    abstract boolean j();
}
