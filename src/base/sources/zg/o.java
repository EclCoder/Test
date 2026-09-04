package zg;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.hecorat.screenrecorder.free.AzRecorderApp;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected WindowManager f58877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WindowManager.LayoutParams f58878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected FrameLayout f58879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Rect f58880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f58881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f58882f = false;

    public o(Context context) {
        this.f58881e = context;
        this.f58877a = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(l(), j(), uf.b.a().a(), i(), -3);
        this.f58878b = layoutParams;
        layoutParams.gravity = 8388659;
        this.f58879c = new FrameLayout(context);
    }

    public void d(View view) {
        this.f58879c.removeAllViews();
        this.f58879c.addView(view);
    }

    public void e() {
        if (this.f58882f) {
            try {
                this.f58877a.updateViewLayout(this.f58879c, this.f58878b);
                return;
            } catch (Exception e10) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
                return;
            }
        }
        wp.a.h(AzRecorderApp.f22504d).g("addOrUpdateView: add", new Object[0]);
        try {
            this.f58882f = true;
            this.f58877a.addView(this.f58879c, this.f58878b);
        } catch (Exception e11) {
            this.f58882f = false;
            wp.a.e(e11);
            com.google.firebase.crashlytics.a.b().d(e11);
        }
    }

    public Point f() {
        WindowManager.LayoutParams layoutParams = this.f58878b;
        Point point = new Point(layoutParams.x, layoutParams.y);
        int i10 = point.x;
        WindowManager.LayoutParams layoutParams2 = this.f58878b;
        point.x = i10 + (layoutParams2.width / 2);
        point.y += layoutParams2.height / 2;
        return point;
    }

    public int g() {
        return this.f58878b.x + (l() / 2);
    }

    public int h() {
        return this.f58878b.y + (j() / 2);
    }

    protected int i() {
        return 40;
    }

    protected int j() {
        return 200;
    }

    public int k() {
        return this.f58879c.getVisibility();
    }

    protected int l() {
        return 200;
    }

    public boolean m() {
        return this.f58879c.isShown();
    }

    public void n() {
        if (this.f58882f) {
            this.f58882f = false;
            try {
                this.f58877a.removeViewImmediate(this.f58879c);
            } catch (Exception e10) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        }
    }

    public void o(Rect rect) {
        this.f58880d = rect;
    }
}
