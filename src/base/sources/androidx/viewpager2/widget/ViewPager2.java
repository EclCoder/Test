package androidx.viewpager2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import n0.q0;
import o0.p;
import o0.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static boolean f7609u = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f7610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f7611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.viewpager2.widget.b f7612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f7613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f7614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RecyclerView.j f7615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    LinearLayoutManager f7616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Parcelable f7618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    RecyclerView f7619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private t f7620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    androidx.viewpager2.widget.e f7621l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.viewpager2.widget.b f7622m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private androidx.viewpager2.widget.c f7623n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private androidx.viewpager2.widget.d f7624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private RecyclerView.n f7625p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f7626q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f7627r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f7628s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    e f7629t;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends g {
        a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f7614e = true;
            viewPager2.f7621l.j();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends i {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void a(int i10) {
            if (i10 == 0) {
                ViewPager2.this.o();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f7613d != i10) {
                viewPager2.f7613d = i10;
                viewPager2.f7629t.r();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends i {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f7619j.requestFocus(2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private abstract class e {
        private e() {
        }

        boolean a() {
            return false;
        }

        boolean b(int i10) {
            return false;
        }

        boolean c(int i10, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        boolean l(int i10) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean m(int i10, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }

        void n() {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }

        void t() {
        }

        void e(RecyclerView.h hVar) {
        }

        void f(RecyclerView.h hVar) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void j(p pVar) {
        }

        void p(AccessibilityEvent accessibilityEvent) {
        }

        void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
        }

        void k(View view, p pVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends e {
        f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i10) {
            return (i10 == 8192 || i10 == 4096) && !ViewPager2.this.e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(p pVar) {
            if (ViewPager2.this.e()) {
                return;
            }
            pVar.l0(p.a.f47937r);
            pVar.l0(p.a.f47936q);
            pVar.S0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i10) {
            if (b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class g extends RecyclerView.j {
        private g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i10, int i11, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i10, int i11, int i12) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i10, int i11) {
            a();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void calculateExtraLayoutSpace(RecyclerView.c0 c0Var, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(c0Var, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
        public void onInitializeAccessibilityNodeInfo(RecyclerView.x xVar, RecyclerView.c0 c0Var, p pVar) {
            super.onInitializeAccessibilityNodeInfo(xVar, c0Var, pVar);
            ViewPager2.this.f7629t.j(pVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.x xVar, RecyclerView.c0 c0Var, View view, p pVar) {
            ViewPager2.this.f7629t.k(view, pVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public boolean performAccessibilityAction(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i10, Bundle bundle) {
            return ViewPager2.this.f7629t.b(i10) ? ViewPager2.this.f7629t.l(i10) : super.performAccessibilityAction(xVar, c0Var, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class j extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s f7637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final s f7638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RecyclerView.j f7639d;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements s {
            a() {
            }

            @Override // o0.s
            public boolean a(View view, s.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class b implements s {
            b() {
            }

            @Override // o0.s
            public boolean a(View view, s.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class c extends g {
            c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                j.this.y();
            }
        }

        j() {
            super(ViewPager2.this, null);
            this.f7637b = new a();
            this.f7638c = new b();
        }

        private void u(p pVar) {
            int itemCount;
            int itemCount2;
            if (ViewPager2.this.getAdapter() != null) {
                itemCount2 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    itemCount2 = ViewPager2.this.getAdapter().getItemCount();
                    itemCount = 1;
                } else {
                    itemCount = ViewPager2.this.getAdapter().getItemCount();
                }
            } else {
                itemCount = 0;
                itemCount2 = 0;
            }
            pVar.w0(p.g.b(itemCount2, itemCount, false, 0));
        }

        private void v(View view, p pVar) {
            pVar.x0(p.h.a(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f7616g.getPosition(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.f7616g.getPosition(view) : 0, 1, false, false));
        }

        private void w(p pVar) {
            int itemCount;
            RecyclerView.h adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.f7613d > 0) {
                pVar.a(8192);
            }
            if (ViewPager2.this.f7613d < itemCount - 1) {
                pVar.a(4096);
            }
            pVar.S0(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i10, Bundle bundle) {
            return i10 == 8192 || i10 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(RecyclerView.h hVar) {
            y();
            if (hVar != null) {
                hVar.registerAdapterDataObserver(this.f7639d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(RecyclerView.h hVar) {
            if (hVar != null) {
                hVar.unregisterAdapterDataObserver(this.f7639d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
            q0.t0(recyclerView, 2);
            this.f7639d = new c();
            if (q0.z(ViewPager2.this) == 0) {
                q0.t0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            p pVarC1 = p.c1(accessibilityNodeInfo);
            u(pVarC1);
            w(pVarC1);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        void k(View view, p pVar) {
            v(view, pVar);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean m(int i10, Bundle bundle) {
            if (!c(i10, bundle)) {
                throw new IllegalStateException();
            }
            x(i10 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void n() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void t() {
            y();
        }

        void x(int i10) {
            if (ViewPager2.this.e()) {
                ViewPager2.this.k(i10, true);
            }
        }

        void y() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i10 = R.id.accessibilityActionPageLeft;
            q0.g0(viewPager2, R.id.accessibilityActionPageLeft);
            q0.g0(viewPager2, R.id.accessibilityActionPageRight);
            q0.g0(viewPager2, R.id.accessibilityActionPageUp);
            q0.g0(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.f7613d < itemCount - 1) {
                    q0.i0(viewPager2, new p.a(R.id.accessibilityActionPageDown, null), null, this.f7637b);
                }
                if (ViewPager2.this.f7613d > 0) {
                    q0.i0(viewPager2, new p.a(R.id.accessibilityActionPageUp, null), null, this.f7638c);
                    return;
                }
                return;
            }
            boolean zD = ViewPager2.this.d();
            int i11 = zD ? 16908360 : 16908361;
            if (zD) {
                i10 = 16908361;
            }
            if (ViewPager2.this.f7613d < itemCount - 1) {
                q0.i0(viewPager2, new p.a(i11, null), null, this.f7637b);
            }
            if (ViewPager2.this.f7613d > 0) {
                q0.i0(viewPager2, new p.a(i10, null), null, this.f7638c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface k {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class l extends t {
        l() {
        }

        @Override // androidx.recyclerview.widget.t, androidx.recyclerview.widget.x
        public View findSnapView(RecyclerView.q qVar) {
            if (ViewPager2.this.c()) {
                return null;
            }
            return super.findSnapView(qVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class m extends RecyclerView {
        m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f7629t.d() ? ViewPager2.this.f7629t.o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f7613d);
            accessibilityEvent.setToIndex(ViewPager2.this.f7613d);
            ViewPager2.this.f7629t.p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final RecyclerView f7649b;

        o(int i10, RecyclerView recyclerView) {
            this.f7648a = i10;
            this.f7649b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7649b.E1(this.f7648a);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7610a = new Rect();
        this.f7611b = new Rect();
        this.f7612c = new androidx.viewpager2.widget.b(3);
        this.f7614e = false;
        this.f7615f = new a();
        this.f7617h = -1;
        this.f7625p = null;
        this.f7626q = false;
        this.f7627r = true;
        this.f7628s = -1;
        b(context, attributeSet);
    }

    private RecyclerView.s a() {
        return new d();
    }

    private void b(Context context, AttributeSet attributeSet) {
        this.f7629t = f7609u ? new j() : new f();
        m mVar = new m(context);
        this.f7619j = mVar;
        mVar.setId(q0.m());
        this.f7619j.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f7616g = hVar;
        this.f7619j.setLayoutManager(hVar);
        this.f7619j.setScrollingTouchSlop(1);
        l(context, attributeSet);
        this.f7619j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f7619j.l(a());
        androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
        this.f7621l = eVar;
        this.f7623n = new androidx.viewpager2.widget.c(this, eVar, this.f7619j);
        l lVar = new l();
        this.f7620k = lVar;
        lVar.attachToRecyclerView(this.f7619j);
        this.f7619j.n(this.f7621l);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f7622m = bVar;
        this.f7621l.m(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f7622m.d(bVar2);
        this.f7622m.d(cVar);
        this.f7629t.h(this.f7622m, this.f7619j);
        this.f7622m.d(this.f7612c);
        androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this.f7616g);
        this.f7624o = dVar;
        this.f7622m.d(dVar);
        RecyclerView recyclerView = this.f7619j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void f(RecyclerView.h hVar) {
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f7615f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i() {
        RecyclerView.h adapter;
        if (this.f7617h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f7618i;
        if (parcelable != null) {
            if (adapter instanceof w4.c) {
                ((w4.c) adapter).e(parcelable);
            }
            this.f7618i = null;
        }
        int iMax = Math.max(0, Math.min(this.f7617h, adapter.getItemCount() - 1));
        this.f7613d = iMax;
        this.f7617h = -1;
        this.f7619j.v1(iMax);
        this.f7629t.n();
    }

    private void l(Context context, AttributeSet attributeSet) {
        int[] iArr = v4.a.f55158a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        q0.k0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(v4.a.f55159b, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void m(RecyclerView.h hVar) {
        if (hVar != null) {
            hVar.unregisterAdapterDataObserver(this.f7615f);
        }
    }

    public boolean c() {
        return this.f7623n.a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f7619j.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f7619j.canScrollVertically(i10);
    }

    boolean d() {
        return this.f7616g.getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof n) {
            int i10 = ((n) parcelable).f7645a;
            sparseArray.put(this.f7619j.getId(), (Parcelable) sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public boolean e() {
        return this.f7627r;
    }

    public void g(i iVar) {
        this.f7612c.d(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f7629t.a() ? this.f7629t.g() : super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f7619j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f7613d;
    }

    public int getItemDecorationCount() {
        return this.f7619j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f7628s;
    }

    public int getOrientation() {
        return this.f7616g.getOrientation() == 1 ? 1 : 0;
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f7619j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f7621l.f();
    }

    public void h() {
        this.f7624o.d();
    }

    public void j(int i10, boolean z10) {
        if (c()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        k(i10, z10);
    }

    void k(int i10, boolean z10) {
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f7617h != -1) {
                this.f7617h = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.getItemCount() - 1);
        if (iMin == this.f7613d && this.f7621l.h()) {
            return;
        }
        int i11 = this.f7613d;
        if (iMin == i11 && z10) {
            return;
        }
        double dE = i11;
        this.f7613d = iMin;
        this.f7629t.r();
        if (!this.f7621l.h()) {
            dE = this.f7621l.e();
        }
        this.f7621l.k(iMin, z10);
        if (!z10) {
            this.f7619j.v1(iMin);
            return;
        }
        double d10 = iMin;
        if (Math.abs(d10 - dE) <= 3.0d) {
            this.f7619j.E1(iMin);
            return;
        }
        this.f7619j.v1(d10 > dE ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f7619j;
        recyclerView.post(new o(iMin, recyclerView));
    }

    public void n(i iVar) {
        this.f7612c.e(iVar);
    }

    void o() {
        t tVar = this.f7620k;
        if (tVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = tVar.findSnapView(this.f7616g);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.f7616g.getPosition(viewFindSnapView);
        if (position != this.f7613d && getScrollState() == 0) {
            this.f7622m.c(position);
        }
        this.f7614e = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f7629t.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f7619j.getMeasuredWidth();
        int measuredHeight = this.f7619j.getMeasuredHeight();
        this.f7610a.left = getPaddingLeft();
        this.f7610a.right = (i12 - i10) - getPaddingRight();
        this.f7610a.top = getPaddingTop();
        this.f7610a.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f7610a, this.f7611b);
        RecyclerView recyclerView = this.f7619j;
        Rect rect = this.f7611b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f7614e) {
            o();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        measureChild(this.f7619j, i10, i11);
        int measuredWidth = this.f7619j.getMeasuredWidth();
        int measuredHeight = this.f7619j.getMeasuredHeight();
        int measuredState = this.f7619j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        this.f7617h = nVar.f7646b;
        this.f7618i = nVar.f7647c;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.f7645a = this.f7619j.getId();
        int i10 = this.f7617h;
        if (i10 == -1) {
            i10 = this.f7613d;
        }
        nVar.f7646b = i10;
        Parcelable parcelable = this.f7618i;
        if (parcelable != null) {
            nVar.f7647c = parcelable;
            return nVar;
        }
        Object adapter = this.f7619j.getAdapter();
        if (adapter instanceof w4.c) {
            nVar.f7647c = ((w4.c) adapter).a();
        }
        return nVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f7629t.c(i10, bundle) ? this.f7629t.m(i10, bundle) : super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f7619j.getAdapter();
        this.f7629t.f(adapter);
        m(adapter);
        this.f7619j.setAdapter(hVar);
        this.f7613d = 0;
        i();
        this.f7629t.e(hVar);
        f(hVar);
    }

    public void setCurrentItem(int i10) {
        j(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f7629t.q();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f7628s = i10;
        this.f7619j.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f7616g.setOrientation(i10);
        this.f7629t.s();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f7626q) {
                this.f7625p = this.f7619j.getItemAnimator();
                this.f7626q = true;
            }
            this.f7619j.setItemAnimator(null);
        } else if (this.f7626q) {
            this.f7619j.setItemAnimator(this.f7625p);
            this.f7625p = null;
            this.f7626q = false;
        }
        this.f7624o.d();
        if (kVar == null) {
            return;
        }
        this.f7624o.e(kVar);
        h();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f7627r = z10;
        this.f7629t.t();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class n extends View.BaseSavedState {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Parcelable f7647c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public n[] newArray(int i10) {
                return new n[i10];
            }
        }

        n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f7645a = parcel.readInt();
            this.f7646b = parcel.readInt();
            this.f7647c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7645a);
            parcel.writeInt(this.f7646b);
            parcel.writeParcelable(this.f7647c, i10);
        }

        n(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7610a = new Rect();
        this.f7611b = new Rect();
        this.f7612c = new androidx.viewpager2.widget.b(3);
        this.f7614e = false;
        this.f7615f = new a();
        this.f7617h = -1;
        this.f7625p = null;
        this.f7626q = false;
        this.f7627r = true;
        this.f7628s = -1;
        b(context, attributeSet);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements RecyclerView.s {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) rVar).width != -1 || ((ViewGroup.MarginLayoutParams) rVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(View view) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class i {
        public abstract void c(int i10);

        public void a(int i10) {
        }

        public void b(int i10, float f10, int i11) {
        }
    }
}
