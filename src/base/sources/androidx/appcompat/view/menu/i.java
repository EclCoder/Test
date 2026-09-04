package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f1116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f1117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f1120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j.a f1123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f1124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f1125k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f1126l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f1115a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f1115a.getResources().getDimensionPixelSize(h.d.f39883a) ? new b(this.f1115a, this.f1120f, this.f1118d, this.f1119e, this.f1117c) : new l(this.f1115a, this.f1116b, this.f1120f, this.f1118d, this.f1119e, this.f1117c);
        bVar.l(this.f1116b);
        bVar.v(this.f1126l);
        bVar.q(this.f1120f);
        bVar.d(this.f1123i);
        bVar.s(this.f1122h);
        bVar.t(this.f1121g);
        return bVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        h hVarC = c();
        hVarC.w(z11);
        if (z10) {
            if ((n0.m.b(this.f1121g, this.f1120f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f1120f.getWidth();
            }
            hVarC.u(i10);
            hVarC.x(i11);
            int i12 = (int) ((this.f1115a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            hVarC.r(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        hVarC.show();
    }

    public void b() {
        if (d()) {
            this.f1124j.dismiss();
        }
    }

    public h c() {
        if (this.f1124j == null) {
            this.f1124j = a();
        }
        return this.f1124j;
    }

    public boolean d() {
        h hVar = this.f1124j;
        return hVar != null && hVar.a();
    }

    protected void e() {
        this.f1124j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1125k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f1120f = view;
    }

    public void g(boolean z10) {
        this.f1122h = z10;
        h hVar = this.f1124j;
        if (hVar != null) {
            hVar.s(z10);
        }
    }

    public void h(int i10) {
        this.f1121g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1125k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f1123i = aVar;
        h hVar = this.f1124j;
        if (hVar != null) {
            hVar.d(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f1120f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f1120f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f1121g = 8388611;
        this.f1126l = new a();
        this.f1115a = context;
        this.f1116b = eVar;
        this.f1120f = view;
        this.f1117c = z10;
        this.f1118d = i10;
        this.f1119e = i11;
    }
}
