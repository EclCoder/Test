package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f1128v = h.g.f39962o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f1129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f1130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f1131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f1132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f1133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f1134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final d0 f1136i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PopupWindow.OnDismissListener f1139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f1140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    View f1141n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private j.a f1142o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ViewTreeObserver f1143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f1144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1146s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f1148u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1137j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1138k = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1147t = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.a() || l.this.f1136i.A()) {
                return;
            }
            View view = l.this.f1141n;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f1136i.show();
            }
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f1129b = context;
        this.f1130c = eVar;
        this.f1132e = z10;
        this.f1131d = new d(eVar, LayoutInflater.from(context), z10, f1128v);
        this.f1134g = i10;
        this.f1135h = i11;
        Resources resources = context.getResources();
        this.f1133f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(h.d.f39884b));
        this.f1140m = view;
        this.f1136i = new d0(context, null, i10, i11);
        eVar.c(this, context);
    }

    private boolean A() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f1144q || (view = this.f1140m) == null) {
            return false;
        }
        this.f1141n = view;
        this.f1136i.J(this);
        this.f1136i.K(this);
        this.f1136i.I(true);
        View view2 = this.f1141n;
        boolean z10 = this.f1143p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1143p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1137j);
        }
        view2.addOnAttachStateChangeListener(this.f1138k);
        this.f1136i.C(view2);
        this.f1136i.F(this.f1147t);
        if (!this.f1145r) {
            this.f1146s = h.p(this.f1131d, null, this.f1129b, this.f1133f);
            this.f1145r = true;
        }
        this.f1136i.E(this.f1146s);
        this.f1136i.H(2);
        this.f1136i.G(n());
        this.f1136i.show();
        ListView listViewO = this.f1136i.o();
        listViewO.setOnKeyListener(this);
        if (this.f1148u && this.f1130c.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1129b).inflate(h.g.f39961n, (ViewGroup) listViewO, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f1130c.z());
            }
            frameLayout.setEnabled(false);
            listViewO.addHeaderView(frameLayout, null, false);
        }
        this.f1136i.m(this.f1131d);
        this.f1136i.show();
        return true;
    }

    @Override // m.e
    public boolean a() {
        return !this.f1144q && this.f1136i.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        if (eVar != this.f1130c) {
            return;
        }
        dismiss();
        j.a aVar = this.f1142o;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f1142o = aVar;
    }

    @Override // m.e
    public void dismiss() {
        if (a()) {
            this.f1136i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f1129b, mVar, this.f1141n, this.f1132e, this.f1134g, this.f1135h);
            iVar.j(this.f1142o);
            iVar.g(h.y(mVar));
            iVar.i(this.f1139l);
            this.f1139l = null;
            this.f1130c.e(false);
            int iC = this.f1136i.c();
            int iL = this.f1136i.l();
            if ((Gravity.getAbsoluteGravity(this.f1147t, this.f1140m.getLayoutDirection()) & 7) == 5) {
                iC += this.f1140m.getWidth();
            }
            if (iVar.n(iC, iL)) {
                j.a aVar = this.f1142o;
                if (aVar == null) {
                    return true;
                }
                aVar.c(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable g() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(boolean z10) {
        this.f1145r = false;
        d dVar = this.f1131d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean i() {
        return false;
    }

    @Override // m.e
    public ListView o() {
        return this.f1136i.o();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1144q = true;
        this.f1130c.close();
        ViewTreeObserver viewTreeObserver = this.f1143p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1143p = this.f1141n.getViewTreeObserver();
            }
            this.f1143p.removeGlobalOnLayoutListener(this.f1137j);
            this.f1143p = null;
        }
        this.f1141n.removeOnAttachStateChangeListener(this.f1138k);
        PopupWindow.OnDismissListener onDismissListener = this.f1139l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void q(View view) {
        this.f1140m = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(boolean z10) {
        this.f1131d.d(z10);
    }

    @Override // m.e
    public void show() {
        if (!A()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        this.f1147t = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(int i10) {
        this.f1136i.e(i10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(PopupWindow.OnDismissListener onDismissListener) {
        this.f1139l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(boolean z10) {
        this.f1148u = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void x(int i10) {
        this.f1136i.i(i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f1143p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f1143p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f1143p.removeGlobalOnLayoutListener(lVar.f1137j);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
    }
}
