package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.appcompat.widget.t0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class i<S> extends s {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final Object f19908q = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final Object f19909r = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final Object f19910s = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final Object f19911t = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.material.datepicker.a f19913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.material.datepicker.n f19914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m f19915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.material.datepicker.c f19916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RecyclerView f19917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RecyclerView f19918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View f19919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f19920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f19921k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f19922l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MaterialButton f19923m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AccessibilityManager f19924n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private androidx.recyclerview.widget.t f19925o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19926p;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f19927a;

        a(q qVar) {
            this.f19927a = qVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iFindFirstVisibleItemPosition = i.this.L().findFirstVisibleItemPosition();
            this.f19927a.o(2);
            i.this.P(this.f19927a.i(iFindFirstVisibleItemPosition + 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f19929a;

        b(q qVar) {
            this.f19929a = qVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iFindLastVisibleItemPosition = i.this.L().findLastVisibleItemPosition();
            this.f19929a.o(1);
            i.this.P(this.f19929a.i(iFindLastVisibleItemPosition - 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f19931a;

        c(int i10) {
            this.f19931a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f19918h.E1(this.f19931a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends n0.a {
        d() {
        }

        @Override // n0.a
        public void g(View view, o0.p pVar) {
            super.g(view, pVar);
            pVar.w0(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f19934a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.f19934a = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void calculateExtraLayoutSpace(RecyclerView.c0 c0Var, int[] iArr) {
            if (this.f19934a == 0) {
                iArr[0] = i.this.f19918h.getWidth();
                iArr[1] = i.this.f19918h.getWidth();
            } else {
                iArr[0] = i.this.f19918h.getHeight();
                iArr[1] = i.this.f19918h.getHeight();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements n {
        f() {
        }

        @Override // com.google.android.material.datepicker.i.n
        public void a(long j10) {
            if (i.this.f19913c.g().h(j10)) {
                i.x(i.this);
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g implements o {
        g() {
        }

        @Override // com.google.android.material.datepicker.i.o
        public boolean a() {
            return i.this.M(true);
        }

        @Override // com.google.android.material.datepicker.i.o
        public boolean b() {
            return i.this.M(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h extends n0.a {
        h() {
        }

        @Override // n0.a
        public void g(View view, o0.p pVar) {
            super.g(view, pVar);
            pVar.S0(false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0308i extends RecyclerView.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Calendar f19939a = v.i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Calendar f19940b = v.i();

        C0308i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            if ((recyclerView.getAdapter() instanceof w) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                i.x(i.this);
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class j extends n0.a {
        j() {
        }

        @Override // n0.a
        public void g(View view, o0.p pVar) {
            super.g(view, pVar);
            pVar.b(new o0.p.a(16, i.this.f19922l.getVisibility() == 0 ? i.this.getString(sb.k.W) : i.this.getString(sb.k.T)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class k extends RecyclerView.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f19943a;

        k(q qVar) {
            this.f19943a = qVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            int iM0;
            if (i10 != 0 || i.this.f19925o == null) {
                return;
            }
            View viewFindSnapView = i.this.f19925o.findSnapView(i.this.L());
            if (viewFindSnapView != null && (iM0 = recyclerView.m0(viewFindSnapView)) != -1) {
                i.this.f19914d = this.f19943a.i(iM0);
                i.this.f19923m.setText(this.f19943a.j(iM0));
                i.this.V(iM0);
            }
            i.this.U();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            int iFindFirstVisibleItemPosition = i10 < 0 ? i.this.L().findFirstVisibleItemPosition() : i.this.L().findLastVisibleItemPosition();
            if (i.this.f19925o == null) {
                i.this.f19914d = this.f19943a.i(iFindFirstVisibleItemPosition);
            }
            i.this.f19923m.setText(this.f19943a.j(iFindFirstVisibleItemPosition));
            i.this.V(iFindFirstVisibleItemPosition);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.S();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    enum m {
        DAY,
        YEAR
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface n {
        void a(long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface o {
        boolean a();

        boolean b();
    }

    private void D(View view, q qVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(sb.g.f51785t);
        this.f19923m = materialButton;
        materialButton.setTag(f19911t);
        q0.m0(this.f19923m, new j());
        View viewFindViewById = view.findViewById(sb.g.f51789v);
        this.f19919i = viewFindViewById;
        viewFindViewById.setTag(f19909r);
        t0.a(this.f19919i, getString(sb.k.O));
        View viewFindViewById2 = view.findViewById(sb.g.f51787u);
        this.f19920j = viewFindViewById2;
        viewFindViewById2.setTag(f19910s);
        t0.a(this.f19920j, getString(sb.k.L));
        this.f19921k = view.findViewById(sb.g.C);
        this.f19922l = view.findViewById(sb.g.f51793x);
        Q(m.DAY);
        this.f19923m.setText(this.f19914d.j());
        this.f19918h.n(new k(qVar));
        this.f19923m.setOnClickListener(new l());
        this.f19920j.setOnClickListener(new a(qVar));
        this.f19919i.setOnClickListener(new b(qVar));
        V(qVar.k(this.f19914d));
    }

    private RecyclerView.p E() {
        return new C0308i();
    }

    static int J(Context context) {
        return context.getResources().getDimensionPixelSize(sb.e.G0);
    }

    private static int K(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(sb.e.N0) + resources.getDimensionPixelOffset(sb.e.O0) + resources.getDimensionPixelOffset(sb.e.M0);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(sb.e.I0);
        int i10 = com.google.android.material.datepicker.o.f19994e;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(sb.e.G0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(sb.e.L0)) + resources.getDimensionPixelOffset(sb.e.E0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean M(boolean z10) {
        com.google.android.material.datepicker.n nVar;
        if (this.f19926p) {
            return false;
        }
        if (this.f19918h.getScrollState() != 0) {
            return true;
        }
        q qVar = (q) this.f19918h.getAdapter();
        if (qVar != null && (nVar = this.f19914d) != null) {
            int iK = qVar.k(nVar) + (z10 ? 1 : -1);
            if (iK >= 0 && iK < qVar.getItemCount()) {
                qVar.o(z10 ? 2 : 1);
                P(qVar.i(iK));
                return true;
            }
        }
        return false;
    }

    public static i N(com.google.android.material.datepicker.d dVar, int i10, com.google.android.material.datepicker.a aVar, com.google.android.material.datepicker.g gVar) {
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", gVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.n());
        iVar.setArguments(bundle);
        return iVar;
    }

    private void O(int i10) {
        this.f19918h.post(new c(i10));
    }

    private void R() {
        q0.m0(this.f19918h, new h());
    }

    private void T(View view) {
        if (view == null) {
            return;
        }
        m mVar = this.f19915e;
        if (mVar == m.YEAR) {
            q0.o0(view, getString(sb.k.N));
        } else if (mVar == m.DAY) {
            q0.o0(view, getString(sb.k.M));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        q qVar = (q) this.f19918h.getAdapter();
        if (qVar == null || this.f19926p) {
            return;
        }
        qVar.p(this.f19914d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i10) {
        View view = this.f19920j;
        if (view != null) {
            view.setEnabled(i10 + 1 < this.f19918h.getAdapter().getItemCount());
        }
        View view2 = this.f19919i;
        if (view2 != null) {
            view2.setEnabled(i10 - 1 >= 0);
        }
    }

    static /* synthetic */ com.google.android.material.datepicker.d x(i iVar) {
        iVar.getClass();
        return null;
    }

    com.google.android.material.datepicker.a F() {
        return this.f19913c;
    }

    com.google.android.material.datepicker.c G() {
        return this.f19916f;
    }

    com.google.android.material.datepicker.n H() {
        return this.f19914d;
    }

    public com.google.android.material.datepicker.d I() {
        return null;
    }

    LinearLayoutManager L() {
        return (LinearLayoutManager) this.f19918h.getLayoutManager();
    }

    void P(com.google.android.material.datepicker.n nVar) {
        q qVar = (q) this.f19918h.getAdapter();
        int iK = qVar.k(nVar);
        AccessibilityManager accessibilityManager = this.f19924n;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iK2 = iK - qVar.k(this.f19914d);
            boolean z10 = Math.abs(iK2) > 3;
            boolean z11 = iK2 > 0;
            this.f19914d = nVar;
            if (z10 && z11) {
                this.f19918h.v1(iK - 3);
                O(iK);
            } else if (z10) {
                this.f19918h.v1(iK + 3);
                O(iK);
            } else {
                O(iK);
            }
        } else {
            this.f19914d = nVar;
            this.f19918h.v1(iK);
        }
        U();
        V(iK);
    }

    void Q(m mVar) {
        this.f19915e = mVar;
        if (mVar == m.YEAR) {
            this.f19917g.getLayoutManager().scrollToPosition(((w) this.f19917g.getAdapter()).f(this.f19914d.f19989c));
            this.f19921k.setVisibility(0);
            this.f19922l.setVisibility(8);
            this.f19919i.setVisibility(8);
            this.f19920j.setVisibility(8);
            return;
        }
        if (mVar == m.DAY) {
            this.f19921k.setVisibility(8);
            this.f19922l.setVisibility(0);
            this.f19919i.setVisibility(0);
            this.f19920j.setVisibility(0);
            P(this.f19914d);
        }
    }

    void S() {
        m mVar = this.f19915e;
        m mVar2 = m.YEAR;
        if (mVar == mVar2) {
            Q(m.DAY);
        } else if (mVar == m.DAY) {
            Q(mVar2);
        }
        T(getView());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f19912b = bundle.getInt("THEME_RES_ID_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f19913c = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f19914d = (com.google.android.material.datepicker.n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f19912b);
        this.f19916f = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f19924n = (AccessibilityManager) requireContext().getSystemService("accessibility");
        com.google.android.material.datepicker.n nVarO = this.f19913c.o();
        boolean zD = com.google.android.material.datepicker.l.D(contextThemeWrapper);
        this.f19926p = zD;
        if (zD) {
            i10 = sb.i.D;
            i11 = 1;
        } else {
            i10 = sb.i.B;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(K(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(sb.g.f51795y);
        q0.m0(gridView, new d());
        int iJ = this.f19913c.j();
        gridView.setAdapter((ListAdapter) (iJ > 0 ? new com.google.android.material.datepicker.h(iJ) : new com.google.android.material.datepicker.h()));
        gridView.setNumColumns(nVarO.f19990d);
        gridView.setEnabled(false);
        this.f19918h = (RecyclerView) viewInflate.findViewById(sb.g.B);
        this.f19918h.setLayoutManager(new e(getContext(), i11, false, i11));
        this.f19918h.setTag(f19908q);
        q qVar = new q(contextThemeWrapper, null, this.f19913c, null, new f(), new g());
        this.f19918h.setAdapter(qVar);
        int integer = contextThemeWrapper.getResources().getInteger(sb.h.f51801c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(sb.g.C);
        this.f19917g = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f19917g.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f19917g.setAdapter(new w(this));
            this.f19917g.j(E());
        }
        if (!this.f19926p) {
            androidx.recyclerview.widget.t tVar = new androidx.recyclerview.widget.t();
            this.f19925o = tVar;
            tVar.attachToRecyclerView(this.f19918h);
        }
        if (viewInflate.findViewById(sb.g.f51785t) != null) {
            D(viewInflate, qVar);
        }
        this.f19918h.v1(qVar.k(this.f19914d));
        R();
        T(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f19912b);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f19913c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f19914d);
    }

    @Override // com.google.android.material.datepicker.s
    public boolean q(r rVar) {
        return super.q(rVar);
    }
}
