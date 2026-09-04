package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int B = h.g.f39954g;
    boolean A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f1004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f1008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Handler f1009g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f1017o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f1018p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1020r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1021s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1022t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f1023u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f1025w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private j.a f1026x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ViewTreeObserver f1027y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private PopupWindow.OnDismissListener f1028z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f1010h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final List f1011i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1012j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1013k = new ViewOnAttachStateChangeListenerC0012b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c0 f1014l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1015m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f1016n = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f1024v = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1019q = E();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f1011i.size() <= 0 || ((d) b.this.f1011i.get(0)).f1036a.A()) {
                return;
            }
            View view = b.this.f1018p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f1011i.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f1036a.show();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements c0 {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f1032a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MenuItem f1033b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f1034c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f1032a = dVar;
                this.f1033b = menuItem;
                this.f1034c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f1032a;
                if (dVar != null) {
                    b.this.A = true;
                    dVar.f1037b.e(false);
                    b.this.A = false;
                }
                if (this.f1033b.isEnabled() && this.f1033b.hasSubMenu()) {
                    this.f1034c.O(this.f1033b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.c0
        public void d(e eVar, MenuItem menuItem) {
            b.this.f1009g.removeCallbacksAndMessages(null);
            int size = b.this.f1011i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == ((d) b.this.f1011i.get(i10)).f1037b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f1009g.postAtTime(new a(i11 < b.this.f1011i.size() ? (d) b.this.f1011i.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.c0
        public void n(e eVar, MenuItem menuItem) {
            b.this.f1009g.removeCallbacksAndMessages(eVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0 f1036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f1037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1038c;

        public d(d0 d0Var, e eVar, int i10) {
            this.f1036a = d0Var;
            this.f1037b = eVar;
            this.f1038c = i10;
        }

        public ListView a() {
            return this.f1036a.o();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f1004b = context;
        this.f1017o = view;
        this.f1006d = i10;
        this.f1007e = i11;
        this.f1008f = z10;
        Resources resources = context.getResources();
        this.f1005c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(h.d.f39884b));
        this.f1009g = new Handler();
    }

    private d0 A() {
        d0 d0Var = new d0(this.f1004b, null, this.f1006d, this.f1007e);
        d0Var.T(this.f1014l);
        d0Var.K(this);
        d0Var.J(this);
        d0Var.C(this.f1017o);
        d0Var.F(this.f1016n);
        d0Var.I(true);
        d0Var.H(2);
        return d0Var;
    }

    private int B(e eVar) {
        int size = this.f1011i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == ((d) this.f1011i.get(i10)).f1037b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem C(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View D(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemC = C(dVar.f1037b, eVar);
        if (menuItemC == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemC == dVar2.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int E() {
        return this.f1017o.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int F(int i10) {
        List list = this.f1011i;
        ListView listViewA = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1018p.getWindowVisibleDisplayFrame(rect);
        if (this.f1019q == 1) {
            return (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1;
        }
        return iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void G(e eVar) {
        d dVar;
        View viewD;
        int i10;
        int i11;
        int i12;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1004b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f1008f, B);
        if (!a() && this.f1024v) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(h.y(eVar));
        }
        int iP = h.p(dVar2, null, this.f1004b, this.f1005c);
        d0 d0VarA = A();
        d0VarA.m(dVar2);
        d0VarA.E(iP);
        d0VarA.F(this.f1016n);
        if (this.f1011i.size() > 0) {
            List list = this.f1011i;
            dVar = (d) list.get(list.size() - 1);
            viewD = D(dVar, eVar);
        } else {
            dVar = null;
            viewD = null;
        }
        if (viewD != null) {
            d0VarA.U(false);
            d0VarA.R(null);
            int iF = F(iP);
            boolean z10 = iF == 1;
            this.f1019q = iF;
            if (Build.VERSION.SDK_INT >= 26) {
                d0VarA.C(viewD);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f1017o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewD.getLocationOnScreen(iArr2);
                if ((this.f1016n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1017o.getWidth();
                    iArr2[0] = iArr2[0] + viewD.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f1016n & 5) == 5) {
                if (z10) {
                    i12 = i10 + iP;
                } else {
                    iP = viewD.getWidth();
                    i12 = i10 - iP;
                }
            } else if (z10) {
                iP = viewD.getWidth();
                i12 = i10 + iP;
            } else {
                i12 = i10 - iP;
            }
            d0VarA.e(i12);
            d0VarA.M(true);
            d0VarA.i(i11);
        } else {
            if (this.f1020r) {
                d0VarA.e(this.f1022t);
            }
            if (this.f1021s) {
                d0VarA.i(this.f1023u);
            }
            d0VarA.G(n());
        }
        this.f1011i.add(new d(d0VarA, eVar, this.f1019q));
        d0VarA.show();
        ListView listViewO = d0VarA.o();
        listViewO.setOnKeyListener(this);
        if (dVar == null && this.f1025w && eVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(h.g.f39961n, (ViewGroup) listViewO, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.z());
            listViewO.addHeaderView(frameLayout, null, false);
            d0VarA.show();
        }
    }

    @Override // m.e
    public boolean a() {
        return this.f1011i.size() > 0 && ((d) this.f1011i.get(0)).f1036a.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        int iB = B(eVar);
        if (iB < 0) {
            return;
        }
        int i10 = iB + 1;
        if (i10 < this.f1011i.size()) {
            ((d) this.f1011i.get(i10)).f1037b.e(false);
        }
        d dVar = (d) this.f1011i.remove(iB);
        dVar.f1037b.R(this);
        if (this.A) {
            dVar.f1036a.S(null);
            dVar.f1036a.D(0);
        }
        dVar.f1036a.dismiss();
        int size = this.f1011i.size();
        if (size > 0) {
            this.f1019q = ((d) this.f1011i.get(size - 1)).f1038c;
        } else {
            this.f1019q = E();
        }
        if (size != 0) {
            if (z10) {
                ((d) this.f1011i.get(0)).f1037b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f1026x;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1027y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1027y.removeGlobalOnLayoutListener(this.f1012j);
            }
            this.f1027y = null;
        }
        this.f1018p.removeOnAttachStateChangeListener(this.f1013k);
        this.f1028z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f1026x = aVar;
    }

    @Override // m.e
    public void dismiss() {
        int size = this.f1011i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f1011i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f1036a.a()) {
                    dVar.f1036a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        for (d dVar : this.f1011i) {
            if (mVar == dVar.f1037b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        l(mVar);
        j.a aVar = this.f1026x;
        if (aVar != null) {
            aVar.c(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable g() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(boolean z10) {
        Iterator it = this.f1011i.iterator();
        while (it.hasNext()) {
            h.z(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
        eVar.c(this, this.f1004b);
        if (a()) {
            G(eVar);
        } else {
            this.f1010h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // m.e
    public ListView o() {
        if (this.f1011i.isEmpty()) {
            return null;
        }
        List list = this.f1011i;
        return ((d) list.get(list.size() - 1)).a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f1011i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f1011i.get(i10);
            if (!dVar.f1036a.a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f1037b.e(false);
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
        if (this.f1017o != view) {
            this.f1017o = view;
            this.f1016n = n0.m.b(this.f1015m, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(boolean z10) {
        this.f1024v = z10;
    }

    @Override // m.e
    public void show() {
        if (a()) {
            return;
        }
        Iterator it = this.f1010h.iterator();
        while (it.hasNext()) {
            G((e) it.next());
        }
        this.f1010h.clear();
        View view = this.f1017o;
        this.f1018p = view;
        if (view != null) {
            boolean z10 = this.f1027y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1027y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1012j);
            }
            this.f1018p.addOnAttachStateChangeListener(this.f1013k);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        if (this.f1015m != i10) {
            this.f1015m = i10;
            this.f1016n = n0.m.b(i10, this.f1017o.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(int i10) {
        this.f1020r = true;
        this.f1022t = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(PopupWindow.OnDismissListener onDismissListener) {
        this.f1028z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(boolean z10) {
        this.f1025w = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void x(int i10) {
        this.f1021s = true;
        this.f1023u = i10;
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class ViewOnAttachStateChangeListenerC0012b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0012b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f1027y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f1027y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f1027y.removeGlobalOnLayoutListener(bVar.f1012j);
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
}
