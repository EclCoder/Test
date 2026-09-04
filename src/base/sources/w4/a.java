package w4;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.collection.l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f0;
import androidx.fragment.app.o0;
import androidx.lifecycle.b0;
import androidx.lifecycle.s;
import androidx.lifecycle.y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends RecyclerView.h implements w4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final s f55890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final f0 f55891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final l f55892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f55893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f55894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f55895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    f f55896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f55897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f55898i;

    /* JADX INFO: renamed from: w4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0850a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w4.b f55899a;

        C0850a(w4.b bVar) {
            this.f55899a = bVar;
        }

        @Override // androidx.lifecycle.y
        public void c(b0 b0Var, s.a aVar) {
            if (a.this.z()) {
                return;
            }
            b0Var.getLifecycle().d(this);
            if (q0.S(this.f55899a.c())) {
                a.this.v(this.f55899a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends f0.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f55901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f55902b;

        b(Fragment fragment, FrameLayout frameLayout) {
            this.f55901a = fragment;
            this.f55902b = frameLayout;
        }

        @Override // androidx.fragment.app.f0.l
        public void m(f0 f0Var, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f55901a) {
                f0Var.G1(this);
                a.this.f(view, this.f55902b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.f55897h = false;
            aVar.k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f55905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f55906b;

        d(Handler handler, Runnable runnable) {
            this.f55905a = handler;
            this.f55906b = runnable;
        }

        @Override // androidx.lifecycle.y
        public void c(b0 b0Var, s.a aVar) {
            if (aVar == s.a.ON_DESTROY) {
                this.f55905a.removeCallbacks(this.f55906b);
                b0Var.getLifecycle().d(this);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class e extends RecyclerView.j {
        private e() {
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

        /* synthetic */ e(C0850a c0850a) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f55908a = new CopyOnWriteArrayList();

        f() {
        }

        public List a(Fragment fragment, s.b bVar) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f55908a.iterator();
            if (!it.hasNext()) {
                return arrayList;
            }
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }

        public void b(List list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }

        public List c(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f55908a.iterator();
            if (!it.hasNext()) {
                return arrayList;
            }
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }

        public List d(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f55908a.iterator();
            if (!it.hasNext()) {
                return arrayList;
            }
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }

        public List e(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f55908a.iterator();
            if (!it.hasNext()) {
                return arrayList;
            }
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ViewPager2.i f55909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView.j f55910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private y f55911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ViewPager2 f55912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f55913e = -1;

        /* JADX INFO: renamed from: w4.a$g$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0851a extends ViewPager2.i {
            C0851a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void a(int i10) {
                g.this.d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void c(int i10) {
                g.this.d(false);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class b extends e {
            b() {
                super(null);
            }

            @Override // w4.a.e, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                g.this.d(true);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class c implements y {
            c() {
            }

            @Override // androidx.lifecycle.y
            public void c(b0 b0Var, s.a aVar) {
                g.this.d(false);
            }
        }

        g() {
        }

        private ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        void b(RecyclerView recyclerView) {
            this.f55912d = a(recyclerView);
            C0851a c0851a = new C0851a();
            this.f55909a = c0851a;
            this.f55912d.g(c0851a);
            b bVar = new b();
            this.f55910b = bVar;
            a.this.registerAdapterDataObserver(bVar);
            c cVar = new c();
            this.f55911c = cVar;
            a.this.f55890a.a(cVar);
        }

        void c(RecyclerView recyclerView) {
            a(recyclerView).n(this.f55909a);
            a.this.unregisterAdapterDataObserver(this.f55910b);
            a.this.f55890a.d(this.f55911c);
            this.f55912d = null;
        }

        void d(boolean z10) {
            int currentItem;
            Fragment fragment;
            if (a.this.z() || this.f55912d.getScrollState() != 0 || a.this.f55892c.g() || a.this.getItemCount() == 0 || (currentItem = this.f55912d.getCurrentItem()) >= a.this.getItemCount()) {
                return;
            }
            long itemId = a.this.getItemId(currentItem);
            if ((itemId != this.f55913e || z10) && (fragment = (Fragment) a.this.f55892c.e(itemId)) != null && fragment.isAdded()) {
                this.f55913e = itemId;
                o0 o0VarQ = a.this.f55891b.q();
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                Fragment fragment2 = null;
                for (int i11 = 0; i11 < a.this.f55892c.l(); i11++) {
                    long jH = a.this.f55892c.h(i11);
                    Fragment fragment3 = (Fragment) a.this.f55892c.m(i11);
                    if (fragment3.isAdded()) {
                        if (jH != this.f55913e) {
                            s.b bVar = s.b.STARTED;
                            o0VarQ.r(fragment3, bVar);
                            arrayList.add(a.this.f55896g.a(fragment3, bVar));
                        } else {
                            fragment2 = fragment3;
                        }
                        fragment3.setMenuVisibility(jH == this.f55913e);
                    }
                }
                if (fragment2 != null) {
                    s.b bVar2 = s.b.RESUMED;
                    o0VarQ.r(fragment2, bVar2);
                    arrayList.add(a.this.f55896g.a(fragment2, bVar2));
                }
                if (o0VarQ.m()) {
                    return;
                }
                o0VarQ.i();
                Collections.reverse(arrayList);
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    a.this.f55896g.b((List) obj);
                }
            }
        }
    }

    public a(androidx.fragment.app.s sVar) {
        this(sVar.getSupportFragmentManager(), sVar.getLifecycle());
    }

    private static String i(String str, long j10) {
        return str + j10;
    }

    private void j(int i10) {
        long itemId = getItemId(i10);
        if (this.f55892c.d(itemId)) {
            return;
        }
        Fragment fragmentH = h(i10);
        fragmentH.setInitialSavedState((Fragment.n) this.f55893d.e(itemId));
        this.f55892c.i(itemId, fragmentH);
    }

    private boolean l(long j10) {
        View view;
        if (this.f55894e.d(j10)) {
            return true;
        }
        Fragment fragment = (Fragment) this.f55892c.e(j10);
        return (fragment == null || (view = fragment.getView()) == null || view.getParent() == null) ? false : true;
    }

    private static boolean m(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long n(int i10) {
        Long lValueOf = null;
        for (int i11 = 0; i11 < this.f55894e.l(); i11++) {
            if (((Integer) this.f55894e.m(i11)).intValue() == i10) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.f55894e.h(i11));
            }
        }
        return lValueOf;
    }

    private static long u(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void w(long j10) {
        ViewParent parent;
        Fragment fragment = (Fragment) this.f55892c.e(j10);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!g(j10)) {
            this.f55893d.j(j10);
        }
        if (!fragment.isAdded()) {
            this.f55892c.j(j10);
            return;
        }
        if (z()) {
            this.f55898i = true;
            return;
        }
        if (fragment.isAdded() && g(j10)) {
            List listE = this.f55896g.e(fragment);
            Fragment.n nVarV1 = this.f55891b.v1(fragment);
            this.f55896g.b(listE);
            this.f55893d.i(j10, nVarV1);
        }
        List listD = this.f55896g.d(fragment);
        try {
            this.f55891b.q().n(fragment).i();
            this.f55892c.j(j10);
        } finally {
            this.f55896g.b(listD);
        }
    }

    private void x() {
        Handler handler = new Handler(Looper.getMainLooper());
        c cVar = new c();
        this.f55890a.a(new d(handler, cVar));
        handler.postDelayed(cVar, 10000L);
    }

    private void y(Fragment fragment, FrameLayout frameLayout) {
        this.f55891b.j1(new b(fragment, frameLayout), false);
    }

    @Override // w4.c
    public final Parcelable a() {
        Bundle bundle = new Bundle(this.f55892c.l() + this.f55893d.l());
        for (int i10 = 0; i10 < this.f55892c.l(); i10++) {
            long jH = this.f55892c.h(i10);
            Fragment fragment = (Fragment) this.f55892c.e(jH);
            if (fragment != null && fragment.isAdded()) {
                this.f55891b.i1(bundle, i("f#", jH), fragment);
            }
        }
        for (int i11 = 0; i11 < this.f55893d.l(); i11++) {
            long jH2 = this.f55893d.h(i11);
            if (g(jH2)) {
                bundle.putParcelable(i("s#", jH2), (Parcelable) this.f55893d.e(jH2));
            }
        }
        return bundle;
    }

    @Override // w4.c
    public final void e(Parcelable parcelable) {
        if (!this.f55893d.g() || !this.f55892c.g()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (m(str, "f#")) {
                this.f55892c.i(u(str, "f#"), this.f55891b.v0(bundle, str));
            } else {
                if (!m(str, "s#")) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long jU = u(str, "s#");
                Fragment.n nVar = (Fragment.n) bundle.getParcelable(str);
                if (g(jU)) {
                    this.f55893d.i(jU, nVar);
                }
            }
        }
        if (this.f55892c.g()) {
            return;
        }
        this.f55898i = true;
        this.f55897h = true;
        k();
        x();
    }

    void f(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean g(long j10) {
        return j10 >= 0 && j10 < ((long) getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return i10;
    }

    public abstract Fragment h(int i10);

    void k() {
        if (!this.f55898i || z()) {
            return;
        }
        androidx.collection.b bVar = new androidx.collection.b();
        for (int i10 = 0; i10 < this.f55892c.l(); i10++) {
            long jH = this.f55892c.h(i10);
            if (!g(jH)) {
                bVar.add(Long.valueOf(jH));
                this.f55894e.j(jH);
            }
        }
        if (!this.f55897h) {
            this.f55898i = false;
            for (int i11 = 0; i11 < this.f55892c.l(); i11++) {
                long jH2 = this.f55892c.h(i11);
                if (!l(jH2)) {
                    bVar.add(Long.valueOf(jH2));
                }
            }
        }
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            w(((Long) it.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(w4.b bVar, int i10) {
        long itemId = bVar.getItemId();
        int id2 = bVar.c().getId();
        Long lN = n(id2);
        if (lN != null && lN.longValue() != itemId) {
            w(lN.longValue());
            this.f55894e.j(lN.longValue());
        }
        this.f55894e.i(itemId, Integer.valueOf(id2));
        j(i10);
        if (q0.S(bVar.c())) {
            v(bVar);
        }
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        m0.g.a(this.f55895f == null);
        g gVar = new g();
        this.f55895f = gVar;
        gVar.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f55895f.c(recyclerView);
        this.f55895f = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final w4.b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return w4.b.b(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final boolean onFailedToRecycleView(w4.b bVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void onViewAttachedToWindow(w4.b bVar) {
        v(bVar);
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void onViewRecycled(w4.b bVar) {
        Long lN = n(bVar.c().getId());
        if (lN != null) {
            w(lN.longValue());
            this.f55894e.j(lN.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    void v(w4.b bVar) {
        Fragment fragment = (Fragment) this.f55892c.e(bVar.getItemId());
        if (fragment == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutC = bVar.c();
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragment.isAdded() && view == null) {
            y(fragment, frameLayoutC);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayoutC) {
                f(view, frameLayoutC);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            f(view, frameLayoutC);
            return;
        }
        if (z()) {
            if (this.f55891b.M0()) {
                return;
            }
            this.f55890a.a(new C0850a(bVar));
            return;
        }
        y(fragment, frameLayoutC);
        List listC = this.f55896g.c(fragment);
        try {
            fragment.setMenuVisibility(false);
            this.f55891b.q().d(fragment, "f" + bVar.getItemId()).r(fragment, s.b.STARTED).i();
            this.f55895f.d(false);
        } finally {
            this.f55896g.b(listC);
        }
    }

    boolean z() {
        return this.f55891b.U0();
    }

    public a(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public a(f0 f0Var, s sVar) {
        this.f55892c = new l();
        this.f55893d = new l();
        this.f55894e = new l();
        this.f55896g = new f();
        this.f55897h = false;
        this.f55898i = false;
        this.f55891b = f0Var;
        this.f55890a = sVar;
        super.setHasStableIds(true);
    }
}
